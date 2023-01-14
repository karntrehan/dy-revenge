package okhttp3.internal.cache2;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import okhttp3.internal.Util;
import p455g.C10323s;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;
import p493i.C10598d0;
import p493i.C10600e0;
import p493i.C10603f;
import p493i.C10616i;

public final class Relay {
    public static final Companion Companion = new Companion((C10452g) null);
    private static final long FILE_HEADER_SIZE = 32;
    public static final C10616i PREFIX_CLEAN;
    public static final C10616i PREFIX_DIRTY;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    private final C10603f buffer;
    private final long bufferMaxSize;
    private boolean complete;
    private RandomAccessFile file;
    private final C10616i metadata;
    private int sourceCount;
    private C10598d0 upstream;
    private final C10603f upstreamBuffer;
    private long upstreamPos;
    private Thread upstreamReader;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10452g gVar) {
            this();
        }

        public final Relay edit(File file, C10598d0 d0Var, C10616i iVar, long j) {
            C10457l.m35320e(file, "file");
            C10457l.m35320e(d0Var, "upstream");
            C10457l.m35320e(iVar, "metadata");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            Relay relay = new Relay(randomAccessFile, d0Var, 0, iVar, j, (C10452g) null);
            randomAccessFile.setLength(0);
            relay.writeHeader(Relay.PREFIX_DIRTY, -1, -1);
            return relay;
        }

        public final Relay read(File file) {
            C10457l.m35320e(file, "file");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            C10457l.m35319d(channel, "randomAccessFile.channel");
            FileOperator fileOperator = new FileOperator(channel);
            C10603f fVar = new C10603f();
            fileOperator.read(0, fVar, Relay.FILE_HEADER_SIZE);
            C10616i iVar = Relay.PREFIX_CLEAN;
            if (!(!C10457l.m35316a(fVar.mo26365q((long) iVar.mo26420Y()), iVar))) {
                long readLong = fVar.readLong();
                long readLong2 = fVar.readLong();
                C10603f fVar2 = new C10603f();
                fileOperator.read(readLong + Relay.FILE_HEADER_SIZE, fVar2, readLong2);
                return new Relay(randomAccessFile, (C10598d0) null, readLong, fVar2.mo26335T(), 0, (C10452g) null);
            }
            throw new IOException("unreadable cache file");
        }
    }

    public final class RelaySource implements C10598d0 {
        private FileOperator fileOperator;
        private long sourcePos;
        private final C10600e0 timeout = new C10600e0();

        public RelaySource() {
            RandomAccessFile file = Relay.this.getFile();
            C10457l.m35317b(file);
            FileChannel channel = file.getChannel();
            C10457l.m35319d(channel, "file!!.channel");
            this.fileOperator = new FileOperator(channel);
        }

        public void close() {
            if (this.fileOperator != null) {
                RandomAccessFile randomAccessFile = null;
                this.fileOperator = null;
                synchronized (Relay.this) {
                    Relay relay = Relay.this;
                    relay.setSourceCount(relay.getSourceCount() - 1);
                    if (Relay.this.getSourceCount() == 0) {
                        RandomAccessFile file = Relay.this.getFile();
                        Relay.this.setFile((RandomAccessFile) null);
                        randomAccessFile = file;
                    }
                    C10323s sVar = C10323s.f27547a;
                }
                if (randomAccessFile != null) {
                    Util.closeQuietly((Closeable) randomAccessFile);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x008b, code lost:
            if (r4 != 2) goto L_0x00ae;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x008d, code lost:
            r10 = java.lang.Math.min(r2, r1.this$0.getUpstreamPos() - r1.sourcePos);
            r2 = r1.fileOperator;
            p455g.p470y.p472d.C10457l.m35317b(r2);
            r2.read(r1.sourcePos + okhttp3.internal.cache2.Relay.FILE_HEADER_SIZE, r20, r10);
            r1.sourcePos += r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ad, code lost:
            return r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            r0 = r1.this$0.getUpstream();
            p455g.p470y.p472d.C10457l.m35317b(r0);
            r14 = r0.read(r1.this$0.getUpstreamBuffer(), r1.this$0.getBufferMaxSize());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ca, code lost:
            if (r14 != -1) goto L_0x00f3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00cc, code lost:
            r0 = r1.this$0;
            r0.commit(r0.getUpstreamPos());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d5, code lost:
            r2 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d7, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
            r1.this$0.setUpstreamReader((java.lang.Thread) null);
            r0 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00df, code lost:
            if (r0 == null) goto L_0x00e8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e1, code lost:
            r0.notifyAll();
            r0 = p455g.C10323s.f27547a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e6, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e7, code lost:
            return -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ef, code lost:
            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.Object");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
            r11 = java.lang.Math.min(r14, r2);
            r1.this$0.getUpstreamBuffer().mo26381v0(r20, 0, r11);
            r1.sourcePos += r11;
            r13 = r1.fileOperator;
            p455g.p470y.p472d.C10457l.m35317b(r13);
            r4 = r14;
            r13.write(r1.this$0.getUpstreamPos() + okhttp3.internal.cache2.Relay.FILE_HEADER_SIZE, r1.this$0.getUpstreamBuffer().clone(), r4);
            r2 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x012a, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
            r1.this$0.getBuffer().write(r1.this$0.getUpstreamBuffer(), r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x014c, code lost:
            if (r1.this$0.getBuffer().size() <= r1.this$0.getBufferMaxSize()) goto L_0x0168;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x014e, code lost:
            r1.this$0.getBuffer().mo26358l(r1.this$0.getBuffer().size() - r1.this$0.getBufferMaxSize());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0168, code lost:
            r0 = r1.this$0;
            r0.setUpstreamPos(r0.getUpstreamPos() + r4);
            r0 = p455g.C10323s.f27547a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0175, code lost:
            r2 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0177, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
            r1.this$0.setUpstreamReader((java.lang.Thread) null);
            r0 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x017f, code lost:
            if (r0 == null) goto L_0x0186;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x0181, code lost:
            r0.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0184, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x0185, code lost:
            return r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x018d, code lost:
            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.Object");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x0194, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x0197, code lost:
            monitor-enter(r1.this$0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
            r1.this$0.setUpstreamReader((java.lang.Thread) null);
            r3 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x019f, code lost:
            if (r3 == null) goto L_0x01a1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x01a8, code lost:
            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.Object");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x01a9, code lost:
            r3.notifyAll();
            r3 = p455g.C10323s.f27547a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x01af, code lost:
            throw r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long read(p493i.C10603f r20, long r21) {
            /*
                r19 = this;
                r1 = r19
                r2 = r21
                java.lang.String r0 = "sink"
                r5 = r20
                p455g.p470y.p472d.C10457l.m35320e(r5, r0)
                okhttp3.internal.cache2.FileOperator r0 = r1.fileOperator
                r4 = 1
                if (r0 == 0) goto L_0x0012
                r0 = 1
                goto L_0x0013
            L_0x0012:
                r0 = 0
            L_0x0013:
                if (r0 == 0) goto L_0x01b6
                okhttp3.internal.cache2.Relay r8 = okhttp3.internal.cache2.Relay.this
                monitor-enter(r8)
            L_0x0018:
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01b3 }
                long r6 = r0.getUpstreamPos()     // Catch:{ all -> 0x01b3 }
                long r9 = r1.sourcePos     // Catch:{ all -> 0x01b3 }
                r0 = 2
                r11 = -1
                int r13 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
                if (r13 == 0) goto L_0x0065
                okhttp3.internal.cache2.Relay r4 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01b3 }
                long r6 = r4.getUpstreamPos()     // Catch:{ all -> 0x01b3 }
                okhttp3.internal.cache2.Relay r4 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01b3 }
                i.f r4 = r4.getBuffer()     // Catch:{ all -> 0x01b3 }
                long r9 = r4.size()     // Catch:{ all -> 0x01b3 }
                long r6 = r6 - r9
                long r9 = r1.sourcePos     // Catch:{ all -> 0x01b3 }
                int r4 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
                if (r4 >= 0) goto L_0x0040
                r4 = 2
                goto L_0x0088
            L_0x0040:
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01b3 }
                long r9 = r0.getUpstreamPos()     // Catch:{ all -> 0x01b3 }
                long r11 = r1.sourcePos     // Catch:{ all -> 0x01b3 }
                long r9 = r9 - r11
                long r9 = java.lang.Math.min(r2, r9)     // Catch:{ all -> 0x01b3 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01b3 }
                i.f r2 = r0.getBuffer()     // Catch:{ all -> 0x01b3 }
                long r3 = r1.sourcePos     // Catch:{ all -> 0x01b3 }
                long r6 = r3 - r6
                r3 = r20
                r4 = r6
                r6 = r9
                r2.mo26381v0(r3, r4, r6)     // Catch:{ all -> 0x01b3 }
                long r2 = r1.sourcePos     // Catch:{ all -> 0x01b3 }
                long r2 = r2 + r9
                r1.sourcePos = r2     // Catch:{ all -> 0x01b3 }
                monitor-exit(r8)
                return r9
            L_0x0065:
                okhttp3.internal.cache2.Relay r6 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01b3 }
                boolean r6 = r6.getComplete()     // Catch:{ all -> 0x01b3 }
                if (r6 == 0) goto L_0x006f
                monitor-exit(r8)
                return r11
            L_0x006f:
                okhttp3.internal.cache2.Relay r6 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01b3 }
                java.lang.Thread r6 = r6.getUpstreamReader()     // Catch:{ all -> 0x01b3 }
                if (r6 == 0) goto L_0x007f
                i.e0 r0 = r1.timeout     // Catch:{ all -> 0x01b3 }
                okhttp3.internal.cache2.Relay r6 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01b3 }
                r0.waitUntilNotified(r6)     // Catch:{ all -> 0x01b3 }
                goto L_0x0018
            L_0x007f:
                okhttp3.internal.cache2.Relay r6 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01b3 }
                java.lang.Thread r7 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x01b3 }
                r6.setUpstreamReader(r7)     // Catch:{ all -> 0x01b3 }
            L_0x0088:
                monitor-exit(r8)
                r8 = 32
                if (r4 != r0) goto L_0x00ae
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this
                long r6 = r0.getUpstreamPos()
                long r10 = r1.sourcePos
                long r6 = r6 - r10
                long r10 = java.lang.Math.min(r2, r6)
                okhttp3.internal.cache2.FileOperator r2 = r1.fileOperator
                p455g.p470y.p472d.C10457l.m35317b(r2)
                long r3 = r1.sourcePos
                long r3 = r3 + r8
                r5 = r20
                r6 = r10
                r2.read(r3, r5, r6)
                long r2 = r1.sourcePos
                long r2 = r2 + r10
                r1.sourcePos = r2
                return r10
            L_0x00ae:
                r10 = 0
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0194 }
                i.d0 r0 = r0.getUpstream()     // Catch:{ all -> 0x0194 }
                p455g.p470y.p472d.C10457l.m35317b(r0)     // Catch:{ all -> 0x0194 }
                okhttp3.internal.cache2.Relay r4 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0194 }
                i.f r4 = r4.getUpstreamBuffer()     // Catch:{ all -> 0x0194 }
                okhttp3.internal.cache2.Relay r6 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0194 }
                long r6 = r6.getBufferMaxSize()     // Catch:{ all -> 0x0194 }
                long r14 = r0.read(r4, r6)     // Catch:{ all -> 0x0194 }
                int r0 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
                if (r0 != 0) goto L_0x00f3
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0194 }
                long r2 = r0.getUpstreamPos()     // Catch:{ all -> 0x0194 }
                r0.commit(r2)     // Catch:{ all -> 0x0194 }
                okhttp3.internal.cache2.Relay r2 = okhttp3.internal.cache2.Relay.this
                monitor-enter(r2)
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x00f0 }
                r0.setUpstreamReader(r10)     // Catch:{ all -> 0x00f0 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x00f0 }
                if (r0 == 0) goto L_0x00e8
                r0.notifyAll()     // Catch:{ all -> 0x00f0 }
                g.s r0 = p455g.C10323s.f27547a     // Catch:{ all -> 0x00f0 }
                monitor-exit(r2)
                return r11
            L_0x00e8:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x00f0 }
                java.lang.String r3 = "null cannot be cast to non-null type java.lang.Object"
                r0.<init>(r3)     // Catch:{ all -> 0x00f0 }
                throw r0     // Catch:{ all -> 0x00f0 }
            L_0x00f0:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x00f3:
                long r11 = java.lang.Math.min(r14, r2)     // Catch:{ all -> 0x0194 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0194 }
                i.f r2 = r0.getUpstreamBuffer()     // Catch:{ all -> 0x0194 }
                r6 = 0
                r3 = r20
                r4 = r6
                r6 = r11
                r2.mo26381v0(r3, r4, r6)     // Catch:{ all -> 0x0194 }
                long r2 = r1.sourcePos     // Catch:{ all -> 0x0194 }
                long r2 = r2 + r11
                r1.sourcePos = r2     // Catch:{ all -> 0x0194 }
                okhttp3.internal.cache2.FileOperator r13 = r1.fileOperator     // Catch:{ all -> 0x0194 }
                p455g.p470y.p472d.C10457l.m35317b(r13)     // Catch:{ all -> 0x0194 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0194 }
                long r2 = r0.getUpstreamPos()     // Catch:{ all -> 0x0194 }
                long r2 = r2 + r8
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0194 }
                i.f r0 = r0.getUpstreamBuffer()     // Catch:{ all -> 0x0194 }
                i.f r16 = r0.clone()     // Catch:{ all -> 0x0194 }
                r4 = r14
                r14 = r2
                r17 = r4
                r13.write(r14, r16, r17)     // Catch:{ all -> 0x0194 }
                okhttp3.internal.cache2.Relay r2 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0194 }
                monitor-enter(r2)     // Catch:{ all -> 0x0194 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0191 }
                i.f r0 = r0.getBuffer()     // Catch:{ all -> 0x0191 }
                okhttp3.internal.cache2.Relay r3 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0191 }
                i.f r3 = r3.getUpstreamBuffer()     // Catch:{ all -> 0x0191 }
                r0.write(r3, r4)     // Catch:{ all -> 0x0191 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0191 }
                i.f r0 = r0.getBuffer()     // Catch:{ all -> 0x0191 }
                long r6 = r0.size()     // Catch:{ all -> 0x0191 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0191 }
                long r8 = r0.getBufferMaxSize()     // Catch:{ all -> 0x0191 }
                int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r0 <= 0) goto L_0x0168
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0191 }
                i.f r0 = r0.getBuffer()     // Catch:{ all -> 0x0191 }
                okhttp3.internal.cache2.Relay r3 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0191 }
                i.f r3 = r3.getBuffer()     // Catch:{ all -> 0x0191 }
                long r6 = r3.size()     // Catch:{ all -> 0x0191 }
                okhttp3.internal.cache2.Relay r3 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0191 }
                long r8 = r3.getBufferMaxSize()     // Catch:{ all -> 0x0191 }
                long r6 = r6 - r8
                r0.mo26358l(r6)     // Catch:{ all -> 0x0191 }
            L_0x0168:
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0191 }
                long r6 = r0.getUpstreamPos()     // Catch:{ all -> 0x0191 }
                long r6 = r6 + r4
                r0.setUpstreamPos(r6)     // Catch:{ all -> 0x0191 }
                g.s r0 = p455g.C10323s.f27547a     // Catch:{ all -> 0x0191 }
                monitor-exit(r2)     // Catch:{ all -> 0x0194 }
                okhttp3.internal.cache2.Relay r2 = okhttp3.internal.cache2.Relay.this
                monitor-enter(r2)
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x018e }
                r0.setUpstreamReader(r10)     // Catch:{ all -> 0x018e }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x018e }
                if (r0 == 0) goto L_0x0186
                r0.notifyAll()     // Catch:{ all -> 0x018e }
                monitor-exit(r2)
                return r11
            L_0x0186:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x018e }
                java.lang.String r3 = "null cannot be cast to non-null type java.lang.Object"
                r0.<init>(r3)     // Catch:{ all -> 0x018e }
                throw r0     // Catch:{ all -> 0x018e }
            L_0x018e:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x0191:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0194 }
                throw r0     // Catch:{ all -> 0x0194 }
            L_0x0194:
                r0 = move-exception
                okhttp3.internal.cache2.Relay r2 = okhttp3.internal.cache2.Relay.this
                monitor-enter(r2)
                okhttp3.internal.cache2.Relay r3 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01b0 }
                r3.setUpstreamReader(r10)     // Catch:{ all -> 0x01b0 }
                okhttp3.internal.cache2.Relay r3 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01b0 }
                if (r3 != 0) goto L_0x01a9
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x01b0 }
                java.lang.String r3 = "null cannot be cast to non-null type java.lang.Object"
                r0.<init>(r3)     // Catch:{ all -> 0x01b0 }
                throw r0     // Catch:{ all -> 0x01b0 }
            L_0x01a9:
                r3.notifyAll()     // Catch:{ all -> 0x01b0 }
                g.s r3 = p455g.C10323s.f27547a     // Catch:{ all -> 0x01b0 }
                monitor-exit(r2)
                throw r0
            L_0x01b0:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x01b3:
                r0 = move-exception
                monitor-exit(r8)
                throw r0
            L_0x01b6:
                java.lang.String r0 = "Check failed."
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache2.Relay.RelaySource.read(i.f, long):long");
        }

        public C10600e0 timeout() {
            return this.timeout;
        }
    }

    static {
        C10616i.C10617a aVar = C10616i.f28050o;
        PREFIX_CLEAN = aVar.mo26428d("OkHttp cache v1\n");
        PREFIX_DIRTY = aVar.mo26428d("OkHttp DIRTY :(\n");
    }

    private Relay(RandomAccessFile randomAccessFile, C10598d0 d0Var, long j, C10616i iVar, long j2) {
        this.file = randomAccessFile;
        this.upstream = d0Var;
        this.upstreamPos = j;
        this.metadata = iVar;
        this.bufferMaxSize = j2;
        this.upstreamBuffer = new C10603f();
        this.complete = this.upstream == null;
        this.buffer = new C10603f();
    }

    public /* synthetic */ Relay(RandomAccessFile randomAccessFile, C10598d0 d0Var, long j, C10616i iVar, long j2, C10452g gVar) {
        this(randomAccessFile, d0Var, j, iVar, j2);
    }

    /* access modifiers changed from: private */
    public final void writeHeader(C10616i iVar, long j, long j2) {
        C10603f fVar = new C10603f();
        fVar.mo26351d0(iVar);
        fVar.mo26341X0(j);
        fVar.mo26341X0(j2);
        if (fVar.size() == FILE_HEADER_SIZE) {
            RandomAccessFile randomAccessFile = this.file;
            C10457l.m35317b(randomAccessFile);
            FileChannel channel = randomAccessFile.getChannel();
            C10457l.m35319d(channel, "file!!.channel");
            new FileOperator(channel).write(0, fVar, FILE_HEADER_SIZE);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private final void writeMetadata(long j) {
        C10603f fVar = new C10603f();
        fVar.mo26351d0(this.metadata);
        RandomAccessFile randomAccessFile = this.file;
        C10457l.m35317b(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        C10457l.m35319d(channel, "file!!.channel");
        new FileOperator(channel).write(FILE_HEADER_SIZE + j, fVar, (long) this.metadata.mo26420Y());
    }

    public final void commit(long j) {
        writeMetadata(j);
        RandomAccessFile randomAccessFile = this.file;
        C10457l.m35317b(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j, (long) this.metadata.mo26420Y());
        RandomAccessFile randomAccessFile2 = this.file;
        C10457l.m35317b(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
            C10323s sVar = C10323s.f27547a;
        }
        C10598d0 d0Var = this.upstream;
        if (d0Var != null) {
            Util.closeQuietly((Closeable) d0Var);
        }
        this.upstream = null;
    }

    public final C10603f getBuffer() {
        return this.buffer;
    }

    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final RandomAccessFile getFile() {
        return this.file;
    }

    public final int getSourceCount() {
        return this.sourceCount;
    }

    public final C10598d0 getUpstream() {
        return this.upstream;
    }

    public final C10603f getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final boolean isClosed() {
        return this.file == null;
    }

    public final C10616i metadata() {
        return this.metadata;
    }

    public final C10598d0 newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }

    public final void setComplete(boolean z) {
        this.complete = z;
    }

    public final void setFile(RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final void setSourceCount(int i) {
        this.sourceCount = i;
    }

    public final void setUpstream(C10598d0 d0Var) {
        this.upstream = d0Var;
    }

    public final void setUpstreamPos(long j) {
        this.upstreamPos = j;
    }

    public final void setUpstreamReader(Thread thread) {
        this.upstreamReader = thread;
    }
}
