package okhttp3.internal.cache;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.p509io.FileSystem;
import okhttp3.internal.platform.Platform;
import p455g.C10279d;
import p455g.C10323s;
import p455g.p459d0.C10286f;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;
import p493i.C10598d0;
import p493i.C10608g;
import p493i.C10625q;

public final class DiskLruCache implements Closeable, Flushable {
    public static final long ANY_SEQUENCE_NUMBER = -1;
    public static final String CLEAN = "CLEAN";
    public static final Companion Companion = new Companion((C10452g) null);
    public static final String DIRTY = "DIRTY";
    public static final String JOURNAL_FILE = "journal";
    public static final String JOURNAL_FILE_BACKUP = "journal.bkp";
    public static final String JOURNAL_FILE_TEMP = "journal.tmp";
    public static final C10286f LEGAL_KEY_PATTERN = new C10286f("[a-z0-9_-]{1,120}");
    public static final String MAGIC = "libcore.io.DiskLruCache";
    public static final String READ = "READ";
    public static final String REMOVE = "REMOVE";
    public static final String VERSION_1 = "1";
    private final int appVersion;
    /* access modifiers changed from: private */
    public boolean civilizedFileSystem;
    private final TaskQueue cleanupQueue;
    private final DiskLruCache$cleanupTask$1 cleanupTask;
    private boolean closed;
    private final File directory;
    private final FileSystem fileSystem;
    /* access modifiers changed from: private */
    public boolean hasJournalErrors;
    /* access modifiers changed from: private */
    public boolean initialized;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    /* access modifiers changed from: private */
    public C10608g journalWriter;
    private final LinkedHashMap<String, Entry> lruEntries = new LinkedHashMap<>(0, 0.75f, true);
    private long maxSize;
    /* access modifiers changed from: private */
    public boolean mostRecentRebuildFailed;
    /* access modifiers changed from: private */
    public boolean mostRecentTrimFailed;
    private long nextSequenceNumber;
    /* access modifiers changed from: private */
    public int redundantOpCount;
    private long size;
    private final int valueCount;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10452g gVar) {
            this();
        }
    }

    public final class Editor {
        private boolean done;
        private final Entry entry;
        final /* synthetic */ DiskLruCache this$0;
        private final boolean[] written;

        public Editor(DiskLruCache diskLruCache, Entry entry2) {
            C10457l.m35320e(entry2, "entry");
            this.this$0 = diskLruCache;
            this.entry = entry2;
            this.written = entry2.getReadable$okhttp() ? null : new boolean[diskLruCache.getValueCount$okhttp()];
        }

        public final void abort() {
            synchronized (this.this$0) {
                if (!this.done) {
                    if (C10457l.m35316a(this.entry.getCurrentEditor$okhttp(), this)) {
                        this.this$0.completeEdit$okhttp(this, false);
                    }
                    this.done = true;
                    C10323s sVar = C10323s.f27547a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        public final void commit() {
            synchronized (this.this$0) {
                if (!this.done) {
                    if (C10457l.m35316a(this.entry.getCurrentEditor$okhttp(), this)) {
                        this.this$0.completeEdit$okhttp(this, true);
                    }
                    this.done = true;
                    C10323s sVar = C10323s.f27547a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        public final void detach$okhttp() {
            if (!C10457l.m35316a(this.entry.getCurrentEditor$okhttp(), this)) {
                return;
            }
            if (this.this$0.civilizedFileSystem) {
                this.this$0.completeEdit$okhttp(this, false);
            } else {
                this.entry.setZombie$okhttp(true);
            }
        }

        public final Entry getEntry$okhttp() {
            return this.entry;
        }

        public final boolean[] getWritten$okhttp() {
            return this.written;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:21|22|23|24) */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            r5 = p493i.C10625q.m36154b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
            return r5;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p493i.C10590b0 newSink(int r5) {
            /*
                r4 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r4.this$0
                monitor-enter(r0)
                boolean r1 = r4.done     // Catch:{ all -> 0x005f }
                r2 = 1
                r1 = r1 ^ r2
                if (r1 == 0) goto L_0x0053
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.entry     // Catch:{ all -> 0x005f }
                okhttp3.internal.cache.DiskLruCache$Editor r1 = r1.getCurrentEditor$okhttp()     // Catch:{ all -> 0x005f }
                boolean r1 = p455g.p470y.p472d.C10457l.m35316a(r1, r4)     // Catch:{ all -> 0x005f }
                r1 = r1 ^ r2
                if (r1 == 0) goto L_0x001c
                i.b0 r5 = p493i.C10625q.m36154b()     // Catch:{ all -> 0x005f }
                monitor-exit(r0)
                return r5
            L_0x001c:
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.entry     // Catch:{ all -> 0x005f }
                boolean r1 = r1.getReadable$okhttp()     // Catch:{ all -> 0x005f }
                if (r1 != 0) goto L_0x002b
                boolean[] r1 = r4.written     // Catch:{ all -> 0x005f }
                p455g.p470y.p472d.C10457l.m35317b(r1)     // Catch:{ all -> 0x005f }
                r1[r5] = r2     // Catch:{ all -> 0x005f }
            L_0x002b:
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.entry     // Catch:{ all -> 0x005f }
                java.util.List r1 = r1.getDirtyFiles$okhttp()     // Catch:{ all -> 0x005f }
                java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x005f }
                java.io.File r1 = (java.io.File) r1     // Catch:{ all -> 0x005f }
                okhttp3.internal.cache.DiskLruCache r2 = r4.this$0     // Catch:{ FileNotFoundException -> 0x004d }
                okhttp3.internal.io.FileSystem r2 = r2.getFileSystem$okhttp()     // Catch:{ FileNotFoundException -> 0x004d }
                i.b0 r1 = r2.sink(r1)     // Catch:{ FileNotFoundException -> 0x004d }
                okhttp3.internal.cache.FaultHidingSink r2 = new okhttp3.internal.cache.FaultHidingSink     // Catch:{ all -> 0x005f }
                okhttp3.internal.cache.DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1 r3 = new okhttp3.internal.cache.DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1     // Catch:{ all -> 0x005f }
                r3.<init>(r4, r5)     // Catch:{ all -> 0x005f }
                r2.<init>(r1, r3)     // Catch:{ all -> 0x005f }
                monitor-exit(r0)
                return r2
            L_0x004d:
                i.b0 r5 = p493i.C10625q.m36154b()     // Catch:{ all -> 0x005f }
                monitor-exit(r0)
                return r5
            L_0x0053:
                java.lang.String r5 = "Check failed."
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x005f }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x005f }
                r1.<init>(r5)     // Catch:{ all -> 0x005f }
                throw r1     // Catch:{ all -> 0x005f }
            L_0x005f:
                r5 = move-exception
                monitor-exit(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.Editor.newSink(int):i.b0");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p493i.C10598d0 newSource(int r5) {
            /*
                r4 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r4.this$0
                monitor-enter(r0)
                boolean r1 = r4.done     // Catch:{ all -> 0x004f }
                r1 = r1 ^ 1
                if (r1 == 0) goto L_0x0043
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.entry     // Catch:{ all -> 0x004f }
                boolean r1 = r1.getReadable$okhttp()     // Catch:{ all -> 0x004f }
                r2 = 0
                if (r1 == 0) goto L_0x0041
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.entry     // Catch:{ all -> 0x004f }
                okhttp3.internal.cache.DiskLruCache$Editor r1 = r1.getCurrentEditor$okhttp()     // Catch:{ all -> 0x004f }
                boolean r1 = p455g.p470y.p472d.C10457l.m35316a(r1, r4)     // Catch:{ all -> 0x004f }
                r1 = r1 ^ 1
                if (r1 != 0) goto L_0x0041
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.entry     // Catch:{ all -> 0x004f }
                boolean r1 = r1.getZombie$okhttp()     // Catch:{ all -> 0x004f }
                if (r1 == 0) goto L_0x0029
                goto L_0x0041
            L_0x0029:
                okhttp3.internal.cache.DiskLruCache r1 = r4.this$0     // Catch:{ FileNotFoundException -> 0x003f }
                okhttp3.internal.io.FileSystem r1 = r1.getFileSystem$okhttp()     // Catch:{ FileNotFoundException -> 0x003f }
                okhttp3.internal.cache.DiskLruCache$Entry r3 = r4.entry     // Catch:{ FileNotFoundException -> 0x003f }
                java.util.List r3 = r3.getCleanFiles$okhttp()     // Catch:{ FileNotFoundException -> 0x003f }
                java.lang.Object r5 = r3.get(r5)     // Catch:{ FileNotFoundException -> 0x003f }
                java.io.File r5 = (java.io.File) r5     // Catch:{ FileNotFoundException -> 0x003f }
                i.d0 r2 = r1.source(r5)     // Catch:{ FileNotFoundException -> 0x003f }
            L_0x003f:
                monitor-exit(r0)
                return r2
            L_0x0041:
                monitor-exit(r0)
                return r2
            L_0x0043:
                java.lang.String r5 = "Check failed."
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x004f }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x004f }
                r1.<init>(r5)     // Catch:{ all -> 0x004f }
                throw r1     // Catch:{ all -> 0x004f }
            L_0x004f:
                r5 = move-exception
                monitor-exit(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.Editor.newSource(int):i.d0");
        }
    }

    public final class Entry {
        private final List<File> cleanFiles = new ArrayList();
        private Editor currentEditor;
        private final List<File> dirtyFiles = new ArrayList();
        private final String key;
        private final long[] lengths;
        private int lockingSourceCount;
        private boolean readable;
        private long sequenceNumber;
        final /* synthetic */ DiskLruCache this$0;
        private boolean zombie;

        public Entry(DiskLruCache diskLruCache, String str) {
            C10457l.m35320e(str, "key");
            this.this$0 = diskLruCache;
            this.key = str;
            this.lengths = new long[diskLruCache.getValueCount$okhttp()];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            int valueCount$okhttp = diskLruCache.getValueCount$okhttp();
            for (int i = 0; i < valueCount$okhttp; i++) {
                sb.append(i);
                this.cleanFiles.add(new File(diskLruCache.getDirectory(), sb.toString()));
                sb.append(".tmp");
                this.dirtyFiles.add(new File(diskLruCache.getDirectory(), sb.toString()));
                sb.setLength(length);
            }
        }

        private final Void invalidLengths(List<String> list) {
            throw new IOException("unexpected journal line: " + list);
        }

        private final C10598d0 newSource(int i) {
            C10598d0 source = this.this$0.getFileSystem$okhttp().source(this.cleanFiles.get(i));
            if (this.this$0.civilizedFileSystem) {
                return source;
            }
            this.lockingSourceCount++;
            return new DiskLruCache$Entry$newSource$1(this, source, source);
        }

        public final List<File> getCleanFiles$okhttp() {
            return this.cleanFiles;
        }

        public final Editor getCurrentEditor$okhttp() {
            return this.currentEditor;
        }

        public final List<File> getDirtyFiles$okhttp() {
            return this.dirtyFiles;
        }

        public final String getKey$okhttp() {
            return this.key;
        }

        public final long[] getLengths$okhttp() {
            return this.lengths;
        }

        public final int getLockingSourceCount$okhttp() {
            return this.lockingSourceCount;
        }

        public final boolean getReadable$okhttp() {
            return this.readable;
        }

        public final long getSequenceNumber$okhttp() {
            return this.sequenceNumber;
        }

        public final boolean getZombie$okhttp() {
            return this.zombie;
        }

        public final void setCurrentEditor$okhttp(Editor editor) {
            this.currentEditor = editor;
        }

        public final void setLengths$okhttp(List<String> list) {
            C10457l.m35320e(list, "strings");
            if (list.size() == this.this$0.getValueCount$okhttp()) {
                try {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        this.lengths[i] = Long.parseLong(list.get(i));
                    }
                } catch (NumberFormatException unused) {
                    invalidLengths(list);
                    throw new C10279d();
                }
            } else {
                invalidLengths(list);
                throw new C10279d();
            }
        }

        public final void setLockingSourceCount$okhttp(int i) {
            this.lockingSourceCount = i;
        }

        public final void setReadable$okhttp(boolean z) {
            this.readable = z;
        }

        public final void setSequenceNumber$okhttp(long j) {
            this.sequenceNumber = j;
        }

        public final void setZombie$okhttp(boolean z) {
            this.zombie = z;
        }

        public final Snapshot snapshot$okhttp() {
            DiskLruCache diskLruCache = this.this$0;
            if (Util.assertionsEnabled && !Thread.holdsLock(diskLruCache)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread currentThread = Thread.currentThread();
                C10457l.m35319d(currentThread, "Thread.currentThread()");
                sb.append(currentThread.getName());
                sb.append(" MUST hold lock on ");
                sb.append(diskLruCache);
                throw new AssertionError(sb.toString());
            } else if (!this.readable) {
                return null;
            } else {
                if (!this.this$0.civilizedFileSystem && (this.currentEditor != null || this.zombie)) {
                    return null;
                }
                ArrayList<C10598d0> arrayList = new ArrayList<>();
                long[] jArr = (long[]) this.lengths.clone();
                try {
                    int valueCount$okhttp = this.this$0.getValueCount$okhttp();
                    for (int i = 0; i < valueCount$okhttp; i++) {
                        arrayList.add(newSource(i));
                    }
                    return new Snapshot(this.this$0, this.key, this.sequenceNumber, arrayList, jArr);
                } catch (FileNotFoundException unused) {
                    for (C10598d0 closeQuietly : arrayList) {
                        Util.closeQuietly((Closeable) closeQuietly);
                    }
                    try {
                        this.this$0.removeEntry$okhttp(this);
                    } catch (IOException unused2) {
                    }
                    return null;
                }
            }
        }

        public final void writeLengths$okhttp(C10608g gVar) {
            C10457l.m35320e(gVar, "writer");
            for (long m0 : this.lengths) {
                gVar.writeByte(32).mo26360m0(m0);
            }
        }
    }

    public final class Snapshot implements Closeable {
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;
        private final List<C10598d0> sources;
        final /* synthetic */ DiskLruCache this$0;

        public Snapshot(DiskLruCache diskLruCache, String str, long j, List<? extends C10598d0> list, long[] jArr) {
            C10457l.m35320e(str, "key");
            C10457l.m35320e(list, "sources");
            C10457l.m35320e(jArr, "lengths");
            this.this$0 = diskLruCache;
            this.key = str;
            this.sequenceNumber = j;
            this.sources = list;
            this.lengths = jArr;
        }

        public void close() {
            for (C10598d0 closeQuietly : this.sources) {
                Util.closeQuietly((Closeable) closeQuietly);
            }
        }

        public final Editor edit() {
            return this.this$0.edit(this.key, this.sequenceNumber);
        }

        public final long getLength(int i) {
            return this.lengths[i];
        }

        public final C10598d0 getSource(int i) {
            return this.sources.get(i);
        }

        public final String key() {
            return this.key;
        }
    }

    public DiskLruCache(FileSystem fileSystem2, File file, int i, int i2, long j, TaskRunner taskRunner) {
        C10457l.m35320e(fileSystem2, "fileSystem");
        C10457l.m35320e(file, "directory");
        C10457l.m35320e(taskRunner, "taskRunner");
        this.fileSystem = fileSystem2;
        this.directory = file;
        this.appVersion = i;
        this.valueCount = i2;
        this.maxSize = j;
        boolean z = false;
        this.cleanupQueue = taskRunner.newQueue();
        this.cleanupTask = new DiskLruCache$cleanupTask$1(this, Util.okHttpName + " Cache");
        if (j > 0) {
            if (i2 > 0 ? true : z) {
                this.journalFile = new File(file, JOURNAL_FILE);
                this.journalFileTmp = new File(file, JOURNAL_FILE_TEMP);
                this.journalFileBackup = new File(file, JOURNAL_FILE_BACKUP);
                return;
            }
            throw new IllegalArgumentException("valueCount <= 0".toString());
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    private final synchronized void checkNotClosed() {
        if (!(!this.closed)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    public static /* synthetic */ Editor edit$default(DiskLruCache diskLruCache, String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = ANY_SEQUENCE_NUMBER;
        }
        return diskLruCache.edit(str, j);
    }

    /* access modifiers changed from: private */
    public final boolean journalRebuildRequired() {
        int i = this.redundantOpCount;
        return i >= 2000 && i >= this.lruEntries.size();
    }

    private final C10608g newJournalWriter() {
        return C10625q.m36155c(new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
    }

    private final void processJournal() {
        this.fileSystem.delete(this.journalFileTmp);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            C10457l.m35319d(next, "i.next()");
            Entry entry = next;
            int i = 0;
            if (entry.getCurrentEditor$okhttp() == null) {
                int i2 = this.valueCount;
                while (i < i2) {
                    this.size += entry.getLengths$okhttp()[i];
                    i++;
                }
            } else {
                entry.setCurrentEditor$okhttp((Editor) null);
                int i3 = this.valueCount;
                while (i < i3) {
                    this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i));
                    this.fileSystem.delete(entry.getDirtyFiles$okhttp().get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:18|19|(1:21)(1:22)|23|24|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r9.redundantOpCount = r7 - r9.lruEntries.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
        if (r1.mo26390x() == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        rebuildJournal$okhttp();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
        r9.journalWriter = newJournalWriter();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007d, code lost:
        r0 = p455g.C10323s.f27547a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007f, code lost:
        p455g.p469x.C10416a.m35288a(r1, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0083, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b4, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b5, code lost:
        p455g.p469x.C10416a.m35288a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b8, code lost:
        throw r2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0064 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0064=Splitter:B:18:0x0064, B:26:0x0084=Splitter:B:26:0x0084} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void readJournal() {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            okhttp3.internal.io.FileSystem r1 = r9.fileSystem
            java.io.File r2 = r9.journalFile
            i.d0 r1 = r1.source(r2)
            i.h r1 = p493i.C10625q.m36156d(r1)
            java.lang.String r2 = r1.mo26342Y()     // Catch:{ all -> 0x00b2 }
            java.lang.String r3 = r1.mo26342Y()     // Catch:{ all -> 0x00b2 }
            java.lang.String r4 = r1.mo26342Y()     // Catch:{ all -> 0x00b2 }
            java.lang.String r5 = r1.mo26342Y()     // Catch:{ all -> 0x00b2 }
            java.lang.String r6 = r1.mo26342Y()     // Catch:{ all -> 0x00b2 }
            java.lang.String r7 = MAGIC     // Catch:{ all -> 0x00b2 }
            boolean r7 = p455g.p470y.p472d.C10457l.m35316a(r7, r2)     // Catch:{ all -> 0x00b2 }
            r8 = 1
            r7 = r7 ^ r8
            if (r7 != 0) goto L_0x0084
            java.lang.String r7 = VERSION_1     // Catch:{ all -> 0x00b2 }
            boolean r7 = p455g.p470y.p472d.C10457l.m35316a(r7, r3)     // Catch:{ all -> 0x00b2 }
            r7 = r7 ^ r8
            if (r7 != 0) goto L_0x0084
            int r7 = r9.appVersion     // Catch:{ all -> 0x00b2 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x00b2 }
            boolean r4 = p455g.p470y.p472d.C10457l.m35316a(r7, r4)     // Catch:{ all -> 0x00b2 }
            r4 = r4 ^ r8
            if (r4 != 0) goto L_0x0084
            int r4 = r9.valueCount     // Catch:{ all -> 0x00b2 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00b2 }
            boolean r4 = p455g.p470y.p472d.C10457l.m35316a(r4, r5)     // Catch:{ all -> 0x00b2 }
            r4 = r4 ^ r8
            if (r4 != 0) goto L_0x0084
            int r4 = r6.length()     // Catch:{ all -> 0x00b2 }
            r7 = 0
            if (r4 <= 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r8 = 0
        L_0x0058:
            if (r8 != 0) goto L_0x0084
        L_0x005a:
            java.lang.String r0 = r1.mo26342Y()     // Catch:{ EOFException -> 0x0064 }
            r9.readJournalLine(r0)     // Catch:{ EOFException -> 0x0064 }
            int r7 = r7 + 1
            goto L_0x005a
        L_0x0064:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r9.lruEntries     // Catch:{ all -> 0x00b2 }
            int r0 = r0.size()     // Catch:{ all -> 0x00b2 }
            int r7 = r7 - r0
            r9.redundantOpCount = r7     // Catch:{ all -> 0x00b2 }
            boolean r0 = r1.mo26390x()     // Catch:{ all -> 0x00b2 }
            if (r0 != 0) goto L_0x0077
            r9.rebuildJournal$okhttp()     // Catch:{ all -> 0x00b2 }
            goto L_0x007d
        L_0x0077:
            i.g r0 = r9.newJournalWriter()     // Catch:{ all -> 0x00b2 }
            r9.journalWriter = r0     // Catch:{ all -> 0x00b2 }
        L_0x007d:
            g.s r0 = p455g.C10323s.f27547a     // Catch:{ all -> 0x00b2 }
            r0 = 0
            p455g.p469x.C10416a.m35288a(r1, r0)
            return
        L_0x0084:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00b2 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b2 }
            r7.<init>()     // Catch:{ all -> 0x00b2 }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00b2 }
            r7.append(r2)     // Catch:{ all -> 0x00b2 }
            r7.append(r0)     // Catch:{ all -> 0x00b2 }
            r7.append(r3)     // Catch:{ all -> 0x00b2 }
            r7.append(r0)     // Catch:{ all -> 0x00b2 }
            r7.append(r5)     // Catch:{ all -> 0x00b2 }
            r7.append(r0)     // Catch:{ all -> 0x00b2 }
            r7.append(r6)     // Catch:{ all -> 0x00b2 }
            r0 = 93
            r7.append(r0)     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00b2 }
            r4.<init>(r0)     // Catch:{ all -> 0x00b2 }
            throw r4     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00b4 }
        L_0x00b4:
            r2 = move-exception
            p455g.p469x.C10416a.m35288a(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.readJournal():void");
    }

    private final void readJournalLine(String str) {
        String str2;
        String str3 = str;
        int Q = C10300q.m34960Q(str, ' ', 0, false, 6, (Object) null);
        if (Q != -1) {
            int i = Q + 1;
            int Q2 = C10300q.m34960Q(str, ' ', i, false, 4, (Object) null);
            Objects.requireNonNull(str3, "null cannot be cast to non-null type java.lang.String");
            if (Q2 == -1) {
                str2 = str3.substring(i);
                C10457l.m35319d(str2, "(this as java.lang.String).substring(startIndex)");
                String str4 = REMOVE;
                if (Q == str4.length() && C10299p.m34926B(str3, str4, false, 2, (Object) null)) {
                    this.lruEntries.remove(str2);
                    return;
                }
            } else {
                str2 = str3.substring(i, Q2);
                C10457l.m35319d(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            Entry entry = this.lruEntries.get(str2);
            if (entry == null) {
                entry = new Entry(this, str2);
                this.lruEntries.put(str2, entry);
            }
            if (Q2 != -1) {
                String str5 = CLEAN;
                if (Q == str5.length() && C10299p.m34926B(str3, str5, false, 2, (Object) null)) {
                    Objects.requireNonNull(str3, "null cannot be cast to non-null type java.lang.String");
                    String substring = str3.substring(Q2 + 1);
                    C10457l.m35319d(substring, "(this as java.lang.String).substring(startIndex)");
                    List n0 = C10300q.m34983n0(substring, new char[]{' '}, false, 0, 6, (Object) null);
                    entry.setReadable$okhttp(true);
                    entry.setCurrentEditor$okhttp((Editor) null);
                    entry.setLengths$okhttp(n0);
                    return;
                }
            }
            if (Q2 == -1) {
                String str6 = DIRTY;
                if (Q == str6.length() && C10299p.m34926B(str3, str6, false, 2, (Object) null)) {
                    entry.setCurrentEditor$okhttp(new Editor(this, entry));
                    return;
                }
            }
            if (Q2 == -1) {
                String str7 = READ;
                if (Q == str7.length() && C10299p.m34926B(str3, str7, false, 2, (Object) null)) {
                    return;
                }
            }
            throw new IOException("unexpected journal line: " + str3);
        }
        throw new IOException("unexpected journal line: " + str3);
    }

    private final boolean removeOldestEntry() {
        for (Entry next : this.lruEntries.values()) {
            if (!next.getZombie$okhttp()) {
                C10457l.m35319d(next, "toEvict");
                removeEntry$okhttp(next);
                return true;
            }
        }
        return false;
    }

    private final void validateKey(String str) {
        if (!LEGAL_KEY_PATTERN.mo25595a(str)) {
            throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
        }
    }

    public synchronized void close() {
        Editor currentEditor$okhttp;
        if (this.initialized) {
            if (!this.closed) {
                Collection<Entry> values = this.lruEntries.values();
                C10457l.m35319d(values, "lruEntries.values");
                Object[] array = values.toArray(new Entry[0]);
                if (array != null) {
                    for (Entry entry : (Entry[]) array) {
                        if (!(entry.getCurrentEditor$okhttp() == null || (currentEditor$okhttp = entry.getCurrentEditor$okhttp()) == null)) {
                            currentEditor$okhttp.detach$okhttp();
                        }
                    }
                    trimToSize();
                    C10608g gVar = this.journalWriter;
                    C10457l.m35317b(gVar);
                    gVar.close();
                    this.journalWriter = null;
                    this.closed = true;
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        this.closed = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0135, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void completeEdit$okhttp(okhttp3.internal.cache.DiskLruCache.Editor r9, boolean r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.String r0 = "editor"
            p455g.p470y.p472d.C10457l.m35320e(r9, r0)     // Catch:{ all -> 0x0142 }
            okhttp3.internal.cache.DiskLruCache$Entry r0 = r9.getEntry$okhttp()     // Catch:{ all -> 0x0142 }
            okhttp3.internal.cache.DiskLruCache$Editor r1 = r0.getCurrentEditor$okhttp()     // Catch:{ all -> 0x0142 }
            boolean r1 = p455g.p470y.p472d.C10457l.m35316a(r1, r9)     // Catch:{ all -> 0x0142 }
            if (r1 == 0) goto L_0x0136
            r1 = 0
            if (r10 == 0) goto L_0x0061
            boolean r2 = r0.getReadable$okhttp()     // Catch:{ all -> 0x0142 }
            if (r2 != 0) goto L_0x0061
            int r2 = r8.valueCount     // Catch:{ all -> 0x0142 }
            r3 = 0
        L_0x0020:
            if (r3 >= r2) goto L_0x0061
            boolean[] r4 = r9.getWritten$okhttp()     // Catch:{ all -> 0x0142 }
            p455g.p470y.p472d.C10457l.m35317b(r4)     // Catch:{ all -> 0x0142 }
            boolean r4 = r4[r3]     // Catch:{ all -> 0x0142 }
            if (r4 == 0) goto L_0x0047
            okhttp3.internal.io.FileSystem r4 = r8.fileSystem     // Catch:{ all -> 0x0142 }
            java.util.List r5 = r0.getDirtyFiles$okhttp()     // Catch:{ all -> 0x0142 }
            java.lang.Object r5 = r5.get(r3)     // Catch:{ all -> 0x0142 }
            java.io.File r5 = (java.io.File) r5     // Catch:{ all -> 0x0142 }
            boolean r4 = r4.exists(r5)     // Catch:{ all -> 0x0142 }
            if (r4 != 0) goto L_0x0044
            r9.abort()     // Catch:{ all -> 0x0142 }
            monitor-exit(r8)
            return
        L_0x0044:
            int r3 = r3 + 1
            goto L_0x0020
        L_0x0047:
            r9.abort()     // Catch:{ all -> 0x0142 }
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0142 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0142 }
            r10.<init>()     // Catch:{ all -> 0x0142 }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r10.append(r0)     // Catch:{ all -> 0x0142 }
            r10.append(r3)     // Catch:{ all -> 0x0142 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0142 }
            r9.<init>(r10)     // Catch:{ all -> 0x0142 }
            throw r9     // Catch:{ all -> 0x0142 }
        L_0x0061:
            int r9 = r8.valueCount     // Catch:{ all -> 0x0142 }
        L_0x0063:
            if (r1 >= r9) goto L_0x00af
            java.util.List r2 = r0.getDirtyFiles$okhttp()     // Catch:{ all -> 0x0142 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0142 }
            java.io.File r2 = (java.io.File) r2     // Catch:{ all -> 0x0142 }
            if (r10 == 0) goto L_0x00a7
            boolean r3 = r0.getZombie$okhttp()     // Catch:{ all -> 0x0142 }
            if (r3 != 0) goto L_0x00a7
            okhttp3.internal.io.FileSystem r3 = r8.fileSystem     // Catch:{ all -> 0x0142 }
            boolean r3 = r3.exists(r2)     // Catch:{ all -> 0x0142 }
            if (r3 == 0) goto L_0x00ac
            java.util.List r3 = r0.getCleanFiles$okhttp()     // Catch:{ all -> 0x0142 }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x0142 }
            java.io.File r3 = (java.io.File) r3     // Catch:{ all -> 0x0142 }
            okhttp3.internal.io.FileSystem r4 = r8.fileSystem     // Catch:{ all -> 0x0142 }
            r4.rename(r2, r3)     // Catch:{ all -> 0x0142 }
            long[] r2 = r0.getLengths$okhttp()     // Catch:{ all -> 0x0142 }
            r4 = r2[r1]     // Catch:{ all -> 0x0142 }
            okhttp3.internal.io.FileSystem r2 = r8.fileSystem     // Catch:{ all -> 0x0142 }
            long r2 = r2.size(r3)     // Catch:{ all -> 0x0142 }
            long[] r6 = r0.getLengths$okhttp()     // Catch:{ all -> 0x0142 }
            r6[r1] = r2     // Catch:{ all -> 0x0142 }
            long r6 = r8.size     // Catch:{ all -> 0x0142 }
            long r6 = r6 - r4
            long r6 = r6 + r2
            r8.size = r6     // Catch:{ all -> 0x0142 }
            goto L_0x00ac
        L_0x00a7:
            okhttp3.internal.io.FileSystem r3 = r8.fileSystem     // Catch:{ all -> 0x0142 }
            r3.delete(r2)     // Catch:{ all -> 0x0142 }
        L_0x00ac:
            int r1 = r1 + 1
            goto L_0x0063
        L_0x00af:
            r9 = 0
            r0.setCurrentEditor$okhttp(r9)     // Catch:{ all -> 0x0142 }
            boolean r9 = r0.getZombie$okhttp()     // Catch:{ all -> 0x0142 }
            if (r9 == 0) goto L_0x00be
            r8.removeEntry$okhttp(r0)     // Catch:{ all -> 0x0142 }
            monitor-exit(r8)
            return
        L_0x00be:
            int r9 = r8.redundantOpCount     // Catch:{ all -> 0x0142 }
            r1 = 1
            int r9 = r9 + r1
            r8.redundantOpCount = r9     // Catch:{ all -> 0x0142 }
            i.g r9 = r8.journalWriter     // Catch:{ all -> 0x0142 }
            p455g.p470y.p472d.C10457l.m35317b(r9)     // Catch:{ all -> 0x0142 }
            boolean r2 = r0.getReadable$okhttp()     // Catch:{ all -> 0x0142 }
            r3 = 10
            r4 = 32
            if (r2 != 0) goto L_0x00f3
            if (r10 == 0) goto L_0x00d6
            goto L_0x00f3
        L_0x00d6:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r10 = r8.lruEntries     // Catch:{ all -> 0x0142 }
            java.lang.String r1 = r0.getKey$okhttp()     // Catch:{ all -> 0x0142 }
            r10.remove(r1)     // Catch:{ all -> 0x0142 }
            java.lang.String r10 = REMOVE     // Catch:{ all -> 0x0142 }
            i.g r10 = r9.mo26320K(r10)     // Catch:{ all -> 0x0142 }
            r10.writeByte(r4)     // Catch:{ all -> 0x0142 }
            java.lang.String r10 = r0.getKey$okhttp()     // Catch:{ all -> 0x0142 }
            r9.mo26320K(r10)     // Catch:{ all -> 0x0142 }
            r9.writeByte(r3)     // Catch:{ all -> 0x0142 }
            goto L_0x0118
        L_0x00f3:
            r0.setReadable$okhttp(r1)     // Catch:{ all -> 0x0142 }
            java.lang.String r1 = CLEAN     // Catch:{ all -> 0x0142 }
            i.g r1 = r9.mo26320K(r1)     // Catch:{ all -> 0x0142 }
            r1.writeByte(r4)     // Catch:{ all -> 0x0142 }
            java.lang.String r1 = r0.getKey$okhttp()     // Catch:{ all -> 0x0142 }
            r9.mo26320K(r1)     // Catch:{ all -> 0x0142 }
            r0.writeLengths$okhttp(r9)     // Catch:{ all -> 0x0142 }
            r9.writeByte(r3)     // Catch:{ all -> 0x0142 }
            if (r10 == 0) goto L_0x0118
            long r1 = r8.nextSequenceNumber     // Catch:{ all -> 0x0142 }
            r3 = 1
            long r3 = r3 + r1
            r8.nextSequenceNumber = r3     // Catch:{ all -> 0x0142 }
            r0.setSequenceNumber$okhttp(r1)     // Catch:{ all -> 0x0142 }
        L_0x0118:
            r9.flush()     // Catch:{ all -> 0x0142 }
            long r9 = r8.size     // Catch:{ all -> 0x0142 }
            long r0 = r8.maxSize     // Catch:{ all -> 0x0142 }
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0129
            boolean r9 = r8.journalRebuildRequired()     // Catch:{ all -> 0x0142 }
            if (r9 == 0) goto L_0x0134
        L_0x0129:
            okhttp3.internal.concurrent.TaskQueue r0 = r8.cleanupQueue     // Catch:{ all -> 0x0142 }
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r1 = r8.cleanupTask     // Catch:{ all -> 0x0142 }
            r2 = 0
            r4 = 2
            r5 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r0, r1, r2, r4, r5)     // Catch:{ all -> 0x0142 }
        L_0x0134:
            monitor-exit(r8)
            return
        L_0x0136:
            java.lang.String r9 = "Check failed."
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0142 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0142 }
            r10.<init>(r9)     // Catch:{ all -> 0x0142 }
            throw r10     // Catch:{ all -> 0x0142 }
        L_0x0142:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.completeEdit$okhttp(okhttp3.internal.cache.DiskLruCache$Editor, boolean):void");
    }

    public final void delete() {
        close();
        this.fileSystem.deleteContents(this.directory);
    }

    public final Editor edit(String str) {
        return edit$default(this, str, 0, 2, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized okhttp3.internal.cache.DiskLruCache.Editor edit(java.lang.String r11, long r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.lang.String r0 = "key"
            p455g.p470y.p472d.C10457l.m35320e(r11, r0)     // Catch:{ all -> 0x008f }
            r10.initialize()     // Catch:{ all -> 0x008f }
            r10.checkNotClosed()     // Catch:{ all -> 0x008f }
            r10.validateKey(r11)     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r10.lruEntries     // Catch:{ all -> 0x008f }
            java.lang.Object r0 = r0.get(r11)     // Catch:{ all -> 0x008f }
            okhttp3.internal.cache.DiskLruCache$Entry r0 = (okhttp3.internal.cache.DiskLruCache.Entry) r0     // Catch:{ all -> 0x008f }
            long r1 = ANY_SEQUENCE_NUMBER     // Catch:{ all -> 0x008f }
            r3 = 0
            int r4 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x002a
            if (r0 == 0) goto L_0x0028
            long r1 = r0.getSequenceNumber$okhttp()     // Catch:{ all -> 0x008f }
            int r4 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r4 == 0) goto L_0x002a
        L_0x0028:
            monitor-exit(r10)
            return r3
        L_0x002a:
            if (r0 == 0) goto L_0x0031
            okhttp3.internal.cache.DiskLruCache$Editor r12 = r0.getCurrentEditor$okhttp()     // Catch:{ all -> 0x008f }
            goto L_0x0032
        L_0x0031:
            r12 = r3
        L_0x0032:
            if (r12 == 0) goto L_0x0036
            monitor-exit(r10)
            return r3
        L_0x0036:
            if (r0 == 0) goto L_0x0040
            int r12 = r0.getLockingSourceCount$okhttp()     // Catch:{ all -> 0x008f }
            if (r12 == 0) goto L_0x0040
            monitor-exit(r10)
            return r3
        L_0x0040:
            boolean r12 = r10.mostRecentTrimFailed     // Catch:{ all -> 0x008f }
            if (r12 != 0) goto L_0x0082
            boolean r12 = r10.mostRecentRebuildFailed     // Catch:{ all -> 0x008f }
            if (r12 == 0) goto L_0x0049
            goto L_0x0082
        L_0x0049:
            i.g r12 = r10.journalWriter     // Catch:{ all -> 0x008f }
            p455g.p470y.p472d.C10457l.m35317b(r12)     // Catch:{ all -> 0x008f }
            java.lang.String r13 = DIRTY     // Catch:{ all -> 0x008f }
            i.g r13 = r12.mo26320K(r13)     // Catch:{ all -> 0x008f }
            r1 = 32
            i.g r13 = r13.writeByte(r1)     // Catch:{ all -> 0x008f }
            i.g r13 = r13.mo26320K(r11)     // Catch:{ all -> 0x008f }
            r1 = 10
            r13.writeByte(r1)     // Catch:{ all -> 0x008f }
            r12.flush()     // Catch:{ all -> 0x008f }
            boolean r12 = r10.hasJournalErrors     // Catch:{ all -> 0x008f }
            if (r12 == 0) goto L_0x006c
            monitor-exit(r10)
            return r3
        L_0x006c:
            if (r0 != 0) goto L_0x0078
            okhttp3.internal.cache.DiskLruCache$Entry r0 = new okhttp3.internal.cache.DiskLruCache$Entry     // Catch:{ all -> 0x008f }
            r0.<init>(r10, r11)     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r12 = r10.lruEntries     // Catch:{ all -> 0x008f }
            r12.put(r11, r0)     // Catch:{ all -> 0x008f }
        L_0x0078:
            okhttp3.internal.cache.DiskLruCache$Editor r11 = new okhttp3.internal.cache.DiskLruCache$Editor     // Catch:{ all -> 0x008f }
            r11.<init>(r10, r0)     // Catch:{ all -> 0x008f }
            r0.setCurrentEditor$okhttp(r11)     // Catch:{ all -> 0x008f }
            monitor-exit(r10)
            return r11
        L_0x0082:
            okhttp3.internal.concurrent.TaskQueue r4 = r10.cleanupQueue     // Catch:{ all -> 0x008f }
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r5 = r10.cleanupTask     // Catch:{ all -> 0x008f }
            r6 = 0
            r8 = 2
            r9 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r4, r5, r6, r8, r9)     // Catch:{ all -> 0x008f }
            monitor-exit(r10)
            return r3
        L_0x008f:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.edit(java.lang.String, long):okhttp3.internal.cache.DiskLruCache$Editor");
    }

    public final synchronized void evictAll() {
        initialize();
        Collection<Entry> values = this.lruEntries.values();
        C10457l.m35319d(values, "lruEntries.values");
        Object[] array = values.toArray(new Entry[0]);
        if (array != null) {
            for (Entry entry : (Entry[]) array) {
                C10457l.m35319d(entry, "entry");
                removeEntry$okhttp(entry);
            }
            this.mostRecentTrimFailed = false;
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    public synchronized void flush() {
        if (this.initialized) {
            checkNotClosed();
            trimToSize();
            C10608g gVar = this.journalWriter;
            C10457l.m35317b(gVar);
            gVar.flush();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0057, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized okhttp3.internal.cache.DiskLruCache.Snapshot get(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = "key"
            p455g.p470y.p472d.C10457l.m35320e(r8, r0)     // Catch:{ all -> 0x005c }
            r7.initialize()     // Catch:{ all -> 0x005c }
            r7.checkNotClosed()     // Catch:{ all -> 0x005c }
            r7.validateKey(r8)     // Catch:{ all -> 0x005c }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r7.lruEntries     // Catch:{ all -> 0x005c }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x005c }
            okhttp3.internal.cache.DiskLruCache$Entry r0 = (okhttp3.internal.cache.DiskLruCache.Entry) r0     // Catch:{ all -> 0x005c }
            r1 = 0
            if (r0 == 0) goto L_0x005a
            java.lang.String r2 = "lruEntries[key] ?: return null"
            p455g.p470y.p472d.C10457l.m35319d(r0, r2)     // Catch:{ all -> 0x005c }
            okhttp3.internal.cache.DiskLruCache$Snapshot r0 = r0.snapshot$okhttp()     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x0058
            int r1 = r7.redundantOpCount     // Catch:{ all -> 0x005c }
            int r1 = r1 + 1
            r7.redundantOpCount = r1     // Catch:{ all -> 0x005c }
            i.g r1 = r7.journalWriter     // Catch:{ all -> 0x005c }
            p455g.p470y.p472d.C10457l.m35317b(r1)     // Catch:{ all -> 0x005c }
            java.lang.String r2 = READ     // Catch:{ all -> 0x005c }
            i.g r1 = r1.mo26320K(r2)     // Catch:{ all -> 0x005c }
            r2 = 32
            i.g r1 = r1.writeByte(r2)     // Catch:{ all -> 0x005c }
            i.g r8 = r1.mo26320K(r8)     // Catch:{ all -> 0x005c }
            r1 = 10
            r8.writeByte(r1)     // Catch:{ all -> 0x005c }
            boolean r8 = r7.journalRebuildRequired()     // Catch:{ all -> 0x005c }
            if (r8 == 0) goto L_0x0056
            okhttp3.internal.concurrent.TaskQueue r1 = r7.cleanupQueue     // Catch:{ all -> 0x005c }
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r2 = r7.cleanupTask     // Catch:{ all -> 0x005c }
            r3 = 0
            r5 = 2
            r6 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r1, r2, r3, r5, r6)     // Catch:{ all -> 0x005c }
        L_0x0056:
            monitor-exit(r7)
            return r0
        L_0x0058:
            monitor-exit(r7)
            return r1
        L_0x005a:
            monitor-exit(r7)
            return r1
        L_0x005c:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.get(java.lang.String):okhttp3.internal.cache.DiskLruCache$Snapshot");
    }

    public final boolean getClosed$okhttp() {
        return this.closed;
    }

    public final File getDirectory() {
        return this.directory;
    }

    public final FileSystem getFileSystem$okhttp() {
        return this.fileSystem;
    }

    public final LinkedHashMap<String, Entry> getLruEntries$okhttp() {
        return this.lruEntries;
    }

    public final synchronized long getMaxSize() {
        return this.maxSize;
    }

    public final int getValueCount$okhttp() {
        return this.valueCount;
    }

    public final synchronized void initialize() {
        if (Util.assertionsEnabled) {
            if (!Thread.holdsLock(this)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread currentThread = Thread.currentThread();
                C10457l.m35319d(currentThread, "Thread.currentThread()");
                sb.append(currentThread.getName());
                sb.append(" MUST hold lock on ");
                sb.append(this);
                throw new AssertionError(sb.toString());
            }
        }
        if (!this.initialized) {
            if (this.fileSystem.exists(this.journalFileBackup)) {
                if (this.fileSystem.exists(this.journalFile)) {
                    this.fileSystem.delete(this.journalFileBackup);
                } else {
                    this.fileSystem.rename(this.journalFileBackup, this.journalFile);
                }
            }
            this.civilizedFileSystem = Util.isCivilized(this.fileSystem, this.journalFileBackup);
            if (this.fileSystem.exists(this.journalFile)) {
                try {
                    readJournal();
                    processJournal();
                    this.initialized = true;
                    return;
                } catch (IOException e) {
                    Platform platform = Platform.Companion.get();
                    platform.log("DiskLruCache " + this.directory + " is corrupt: " + e.getMessage() + ", removing", 5, e);
                    delete();
                    this.closed = false;
                } catch (Throwable th) {
                    this.closed = false;
                    throw th;
                }
            }
            rebuildJournal$okhttp();
            this.initialized = true;
        }
    }

    public final synchronized boolean isClosed() {
        return this.closed;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bd, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        p455g.p469x.C10416a.m35288a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c1, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void rebuildJournal$okhttp() {
        /*
            r7 = this;
            monitor-enter(r7)
            i.g r0 = r7.journalWriter     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x0008
            r0.close()     // Catch:{ all -> 0x00c2 }
        L_0x0008:
            okhttp3.internal.io.FileSystem r0 = r7.fileSystem     // Catch:{ all -> 0x00c2 }
            java.io.File r1 = r7.journalFileTmp     // Catch:{ all -> 0x00c2 }
            i.b0 r0 = r0.sink(r1)     // Catch:{ all -> 0x00c2 }
            i.g r0 = p493i.C10625q.m36155c(r0)     // Catch:{ all -> 0x00c2 }
            r1 = 0
            java.lang.String r2 = MAGIC     // Catch:{ all -> 0x00bb }
            i.g r2 = r0.mo26320K(r2)     // Catch:{ all -> 0x00bb }
            r3 = 10
            r2.writeByte(r3)     // Catch:{ all -> 0x00bb }
            java.lang.String r2 = VERSION_1     // Catch:{ all -> 0x00bb }
            i.g r2 = r0.mo26320K(r2)     // Catch:{ all -> 0x00bb }
            r2.writeByte(r3)     // Catch:{ all -> 0x00bb }
            int r2 = r7.appVersion     // Catch:{ all -> 0x00bb }
            long r4 = (long) r2     // Catch:{ all -> 0x00bb }
            i.g r2 = r0.mo26360m0(r4)     // Catch:{ all -> 0x00bb }
            r2.writeByte(r3)     // Catch:{ all -> 0x00bb }
            int r2 = r7.valueCount     // Catch:{ all -> 0x00bb }
            long r4 = (long) r2     // Catch:{ all -> 0x00bb }
            i.g r2 = r0.mo26360m0(r4)     // Catch:{ all -> 0x00bb }
            r2.writeByte(r3)     // Catch:{ all -> 0x00bb }
            r0.writeByte(r3)     // Catch:{ all -> 0x00bb }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r2 = r7.lruEntries     // Catch:{ all -> 0x00bb }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x00bb }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00bb }
        L_0x004a:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x00bb }
            if (r4 == 0) goto L_0x0086
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x00bb }
            okhttp3.internal.cache.DiskLruCache$Entry r4 = (okhttp3.internal.cache.DiskLruCache.Entry) r4     // Catch:{ all -> 0x00bb }
            okhttp3.internal.cache.DiskLruCache$Editor r5 = r4.getCurrentEditor$okhttp()     // Catch:{ all -> 0x00bb }
            r6 = 32
            if (r5 == 0) goto L_0x0072
            java.lang.String r5 = DIRTY     // Catch:{ all -> 0x00bb }
            i.g r5 = r0.mo26320K(r5)     // Catch:{ all -> 0x00bb }
            r5.writeByte(r6)     // Catch:{ all -> 0x00bb }
            java.lang.String r4 = r4.getKey$okhttp()     // Catch:{ all -> 0x00bb }
            r0.mo26320K(r4)     // Catch:{ all -> 0x00bb }
        L_0x006e:
            r0.writeByte(r3)     // Catch:{ all -> 0x00bb }
            goto L_0x004a
        L_0x0072:
            java.lang.String r5 = CLEAN     // Catch:{ all -> 0x00bb }
            i.g r5 = r0.mo26320K(r5)     // Catch:{ all -> 0x00bb }
            r5.writeByte(r6)     // Catch:{ all -> 0x00bb }
            java.lang.String r5 = r4.getKey$okhttp()     // Catch:{ all -> 0x00bb }
            r0.mo26320K(r5)     // Catch:{ all -> 0x00bb }
            r4.writeLengths$okhttp(r0)     // Catch:{ all -> 0x00bb }
            goto L_0x006e
        L_0x0086:
            g.s r2 = p455g.C10323s.f27547a     // Catch:{ all -> 0x00bb }
            p455g.p469x.C10416a.m35288a(r0, r1)     // Catch:{ all -> 0x00c2 }
            okhttp3.internal.io.FileSystem r0 = r7.fileSystem     // Catch:{ all -> 0x00c2 }
            java.io.File r1 = r7.journalFile     // Catch:{ all -> 0x00c2 }
            boolean r0 = r0.exists(r1)     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x009e
            okhttp3.internal.io.FileSystem r0 = r7.fileSystem     // Catch:{ all -> 0x00c2 }
            java.io.File r1 = r7.journalFile     // Catch:{ all -> 0x00c2 }
            java.io.File r2 = r7.journalFileBackup     // Catch:{ all -> 0x00c2 }
            r0.rename(r1, r2)     // Catch:{ all -> 0x00c2 }
        L_0x009e:
            okhttp3.internal.io.FileSystem r0 = r7.fileSystem     // Catch:{ all -> 0x00c2 }
            java.io.File r1 = r7.journalFileTmp     // Catch:{ all -> 0x00c2 }
            java.io.File r2 = r7.journalFile     // Catch:{ all -> 0x00c2 }
            r0.rename(r1, r2)     // Catch:{ all -> 0x00c2 }
            okhttp3.internal.io.FileSystem r0 = r7.fileSystem     // Catch:{ all -> 0x00c2 }
            java.io.File r1 = r7.journalFileBackup     // Catch:{ all -> 0x00c2 }
            r0.delete(r1)     // Catch:{ all -> 0x00c2 }
            i.g r0 = r7.newJournalWriter()     // Catch:{ all -> 0x00c2 }
            r7.journalWriter = r0     // Catch:{ all -> 0x00c2 }
            r0 = 0
            r7.hasJournalErrors = r0     // Catch:{ all -> 0x00c2 }
            r7.mostRecentRebuildFailed = r0     // Catch:{ all -> 0x00c2 }
            monitor-exit(r7)
            return
        L_0x00bb:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00bd }
        L_0x00bd:
            r2 = move-exception
            p455g.p469x.C10416a.m35288a(r0, r1)     // Catch:{ all -> 0x00c2 }
            throw r2     // Catch:{ all -> 0x00c2 }
        L_0x00c2:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.rebuildJournal$okhttp():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        return r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean remove(java.lang.String r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "key"
            p455g.p470y.p472d.C10457l.m35320e(r7, r0)     // Catch:{ all -> 0x0033 }
            r6.initialize()     // Catch:{ all -> 0x0033 }
            r6.checkNotClosed()     // Catch:{ all -> 0x0033 }
            r6.validateKey(r7)     // Catch:{ all -> 0x0033 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r6.lruEntries     // Catch:{ all -> 0x0033 }
            java.lang.Object r7 = r0.get(r7)     // Catch:{ all -> 0x0033 }
            okhttp3.internal.cache.DiskLruCache$Entry r7 = (okhttp3.internal.cache.DiskLruCache.Entry) r7     // Catch:{ all -> 0x0033 }
            r0 = 0
            if (r7 == 0) goto L_0x0031
            java.lang.String r1 = "lruEntries[key] ?: return false"
            p455g.p470y.p472d.C10457l.m35319d(r7, r1)     // Catch:{ all -> 0x0033 }
            boolean r7 = r6.removeEntry$okhttp(r7)     // Catch:{ all -> 0x0033 }
            if (r7 == 0) goto L_0x002f
            long r1 = r6.size     // Catch:{ all -> 0x0033 }
            long r3 = r6.maxSize     // Catch:{ all -> 0x0033 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x002f
            r6.mostRecentTrimFailed = r0     // Catch:{ all -> 0x0033 }
        L_0x002f:
            monitor-exit(r6)
            return r7
        L_0x0031:
            monitor-exit(r6)
            return r0
        L_0x0033:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.remove(java.lang.String):boolean");
    }

    public final boolean removeEntry$okhttp(Entry entry) {
        C10608g gVar;
        C10457l.m35320e(entry, "entry");
        if (!this.civilizedFileSystem) {
            if (entry.getLockingSourceCount$okhttp() > 0 && (gVar = this.journalWriter) != null) {
                gVar.mo26320K(DIRTY);
                gVar.writeByte(32);
                gVar.mo26320K(entry.getKey$okhttp());
                gVar.writeByte(10);
                gVar.flush();
            }
            if (entry.getLockingSourceCount$okhttp() > 0 || entry.getCurrentEditor$okhttp() != null) {
                entry.setZombie$okhttp(true);
                return true;
            }
        }
        Editor currentEditor$okhttp = entry.getCurrentEditor$okhttp();
        if (currentEditor$okhttp != null) {
            currentEditor$okhttp.detach$okhttp();
        }
        int i = this.valueCount;
        for (int i2 = 0; i2 < i; i2++) {
            this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i2));
            this.size -= entry.getLengths$okhttp()[i2];
            entry.getLengths$okhttp()[i2] = 0;
        }
        this.redundantOpCount++;
        C10608g gVar2 = this.journalWriter;
        if (gVar2 != null) {
            gVar2.mo26320K(REMOVE);
            gVar2.writeByte(32);
            gVar2.mo26320K(entry.getKey$okhttp());
            gVar2.writeByte(10);
        }
        this.lruEntries.remove(entry.getKey$okhttp());
        if (journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0, 2, (Object) null);
        }
        return true;
    }

    public final void setClosed$okhttp(boolean z) {
        this.closed = z;
    }

    public final synchronized void setMaxSize(long j) {
        this.maxSize = j;
        if (this.initialized) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0, 2, (Object) null);
        }
    }

    public final synchronized long size() {
        initialize();
        return this.size;
    }

    public final synchronized Iterator<Snapshot> snapshots() {
        initialize();
        return new DiskLruCache$snapshots$1(this);
    }

    public final void trimToSize() {
        while (this.size > this.maxSize) {
            if (!removeOldestEntry()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }
}
