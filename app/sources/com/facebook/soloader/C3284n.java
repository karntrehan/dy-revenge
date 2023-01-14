package com.facebook.soloader;

import android.content.Context;
import android.os.StrictMode;
import android.util.Log;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.soloader.n */
public abstract class C3284n extends C3263c {

    /* renamed from: c */
    protected final Context f9286c;

    /* renamed from: d */
    protected String f9287d;

    /* renamed from: e */
    private String[] f9288e;

    /* renamed from: f */
    private final Map<String, Object> f9289f = new HashMap();

    /* renamed from: com.facebook.soloader.n$a */
    class C3285a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ File f9290f;

        /* renamed from: o */
        final /* synthetic */ byte[] f9291o;

        /* renamed from: p */
        final /* synthetic */ C3287c f9292p;

        /* renamed from: q */
        final /* synthetic */ File f9293q;

        /* renamed from: r */
        final /* synthetic */ C3275g f9294r;

        C3285a(File file, byte[] bArr, C3287c cVar, File file2, C3275g gVar) {
            this.f9290f = file;
            this.f9291o = bArr;
            this.f9292p = cVar;
            this.f9293q = file2;
            this.f9294r = gVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0069, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r5.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0072, code lost:
            throw r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0075, code lost:
            r5 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
            r4.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x007e, code lost:
            throw r5;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                java.lang.String r0 = " (from syncer thread)"
                java.lang.String r1 = "releasing dso store lock for "
                java.lang.String r2 = "rw"
                java.lang.String r3 = "fb-UnpackingSoSource"
                java.lang.String r4 = "starting syncer worker"
                android.util.Log.v(r3, r4)     // Catch:{ all -> 0x007f }
                java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch:{ all -> 0x007f }
                java.io.File r5 = r7.f9290f     // Catch:{ all -> 0x007f }
                r4.<init>(r5, r2)     // Catch:{ all -> 0x007f }
                byte[] r5 = r7.f9291o     // Catch:{ all -> 0x0073 }
                r4.write(r5)     // Catch:{ all -> 0x0073 }
                long r5 = r4.getFilePointer()     // Catch:{ all -> 0x0073 }
                r4.setLength(r5)     // Catch:{ all -> 0x0073 }
                r4.close()     // Catch:{ all -> 0x007f }
                java.io.File r4 = new java.io.File     // Catch:{ all -> 0x007f }
                com.facebook.soloader.n r5 = com.facebook.soloader.C3284n.this     // Catch:{ all -> 0x007f }
                java.io.File r5 = r5.f9259a     // Catch:{ all -> 0x007f }
                java.lang.String r6 = "dso_manifest"
                r4.<init>(r5, r6)     // Catch:{ all -> 0x007f }
                java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ all -> 0x007f }
                r5.<init>(r4, r2)     // Catch:{ all -> 0x007f }
                com.facebook.soloader.n$c r2 = r7.f9292p     // Catch:{ all -> 0x0067 }
                r2.mo10747b(r5)     // Catch:{ all -> 0x0067 }
                r5.close()     // Catch:{ all -> 0x007f }
                com.facebook.soloader.n r2 = com.facebook.soloader.C3284n.this     // Catch:{ all -> 0x007f }
                java.io.File r2 = r2.f9259a     // Catch:{ all -> 0x007f }
                com.facebook.soloader.SysUtil.m12799f(r2)     // Catch:{ all -> 0x007f }
                java.io.File r2 = r7.f9293q     // Catch:{ all -> 0x007f }
                r4 = 1
                com.facebook.soloader.C3284n.m12859s(r2, r4)     // Catch:{ all -> 0x007f }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x009f }
                r2.<init>()     // Catch:{ IOException -> 0x009f }
                r2.append(r1)     // Catch:{ IOException -> 0x009f }
                com.facebook.soloader.n r1 = com.facebook.soloader.C3284n.this     // Catch:{ IOException -> 0x009f }
                java.io.File r1 = r1.f9259a     // Catch:{ IOException -> 0x009f }
                r2.append(r1)     // Catch:{ IOException -> 0x009f }
                r2.append(r0)     // Catch:{ IOException -> 0x009f }
                java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x009f }
                android.util.Log.v(r3, r0)     // Catch:{ IOException -> 0x009f }
                com.facebook.soloader.g r0 = r7.f9294r     // Catch:{ IOException -> 0x009f }
                r0.close()     // Catch:{ IOException -> 0x009f }
                return
            L_0x0067:
                r2 = move-exception
                throw r2     // Catch:{ all -> 0x0069 }
            L_0x0069:
                r4 = move-exception
                r5.close()     // Catch:{ all -> 0x006e }
                goto L_0x0072
            L_0x006e:
                r5 = move-exception
                r2.addSuppressed(r5)     // Catch:{ all -> 0x007f }
            L_0x0072:
                throw r4     // Catch:{ all -> 0x007f }
            L_0x0073:
                r2 = move-exception
                throw r2     // Catch:{ all -> 0x0075 }
            L_0x0075:
                r5 = move-exception
                r4.close()     // Catch:{ all -> 0x007a }
                goto L_0x007e
            L_0x007a:
                r4 = move-exception
                r2.addSuppressed(r4)     // Catch:{ all -> 0x007f }
            L_0x007e:
                throw r5     // Catch:{ all -> 0x007f }
            L_0x007f:
                r2 = move-exception
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x009f }
                r4.<init>()     // Catch:{ IOException -> 0x009f }
                r4.append(r1)     // Catch:{ IOException -> 0x009f }
                com.facebook.soloader.n r1 = com.facebook.soloader.C3284n.this     // Catch:{ IOException -> 0x009f }
                java.io.File r1 = r1.f9259a     // Catch:{ IOException -> 0x009f }
                r4.append(r1)     // Catch:{ IOException -> 0x009f }
                r4.append(r0)     // Catch:{ IOException -> 0x009f }
                java.lang.String r0 = r4.toString()     // Catch:{ IOException -> 0x009f }
                android.util.Log.v(r3, r0)     // Catch:{ IOException -> 0x009f }
                com.facebook.soloader.g r0 = r7.f9294r     // Catch:{ IOException -> 0x009f }
                r0.close()     // Catch:{ IOException -> 0x009f }
                throw r2     // Catch:{ IOException -> 0x009f }
            L_0x009f:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C3284n.C3285a.run():void");
        }
    }

    /* renamed from: com.facebook.soloader.n$b */
    public static class C3286b {

        /* renamed from: f */
        public final String f9296f;

        /* renamed from: o */
        public final String f9297o;

        public C3286b(String str, String str2) {
            this.f9296f = str;
            this.f9297o = str2;
        }
    }

    /* renamed from: com.facebook.soloader.n$c */
    public static final class C3287c {

        /* renamed from: a */
        public final C3286b[] f9298a;

        public C3287c(C3286b[] bVarArr) {
            this.f9298a = bVarArr;
        }

        /* renamed from: a */
        static final C3287c m12866a(DataInput dataInput) {
            if (dataInput.readByte() == 1) {
                int readInt = dataInput.readInt();
                if (readInt >= 0) {
                    C3286b[] bVarArr = new C3286b[readInt];
                    for (int i = 0; i < readInt; i++) {
                        bVarArr[i] = new C3286b(dataInput.readUTF(), dataInput.readUTF());
                    }
                    return new C3287c(bVarArr);
                }
                throw new RuntimeException("illegal number of shared libraries");
            }
            throw new RuntimeException("wrong dso manifest version");
        }

        /* renamed from: b */
        public final void mo10747b(DataOutput dataOutput) {
            dataOutput.writeByte(1);
            dataOutput.writeInt(this.f9298a.length);
            int i = 0;
            while (true) {
                C3286b[] bVarArr = this.f9298a;
                if (i < bVarArr.length) {
                    dataOutput.writeUTF(bVarArr[i].f9296f);
                    dataOutput.writeUTF(this.f9298a[i].f9297o);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: com.facebook.soloader.n$d */
    protected static final class C3288d implements Closeable {

        /* renamed from: f */
        public final C3286b f9299f;

        /* renamed from: o */
        public final InputStream f9300o;

        public C3288d(C3286b bVar, InputStream inputStream) {
            this.f9299f = bVar;
            this.f9300o = inputStream;
        }

        public void close() {
            this.f9300o.close();
        }
    }

    /* renamed from: com.facebook.soloader.n$e */
    protected static abstract class C3289e implements Closeable {
        protected C3289e() {
        }

        /* renamed from: a */
        public abstract boolean mo10735a();

        /* renamed from: b */
        public abstract C3288d mo10736b();

        public void close() {
        }
    }

    /* renamed from: com.facebook.soloader.n$f */
    protected static abstract class C3290f implements Closeable {
        protected C3290f() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract C3287c mo10733a();

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract C3289e mo10734b();

        public void close() {
        }
    }

    protected C3284n(Context context, String str) {
        super(m12856m(context, str), 1);
        this.f9286c = context;
    }

    /* renamed from: h */
    private void m12852h(C3286b[] bVarArr) {
        String[] list = this.f9259a.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals("dso_state") && !str.equals("dso_lock") && !str.equals("dso_deps") && !str.equals("dso_manifest")) {
                    boolean z = false;
                    int i = 0;
                    while (!z && i < bVarArr.length) {
                        if (bVarArr[i].f9296f.equals(str)) {
                            z = true;
                        }
                        i++;
                    }
                    if (!z) {
                        File file = new File(this.f9259a, str);
                        Log.v("fb-UnpackingSoSource", "deleting unaccounted-for file " + file);
                        SysUtil.m12796c(file);
                    }
                }
            }
            return;
        }
        throw new IOException("unable to list directory " + this.f9259a);
    }

    /* renamed from: i */
    private void m12853i(C3288d dVar, byte[] bArr) {
        boolean writable;
        Log.i("fb-UnpackingSoSource", "extracting DSO " + dVar.f9299f.f9296f);
        try {
            if (this.f9259a.setWritable(true)) {
                m12854j(dVar, bArr);
                if (writable) {
                    return;
                }
                return;
            }
            throw new IOException("cannot make directory writable for us: " + this.f9259a);
        } finally {
            if (!this.f9259a.setWritable(false)) {
                Log.w("fb-UnpackingSoSource", "error removing " + this.f9259a.getCanonicalPath() + " write permission");
            }
        }
    }

    /* renamed from: j */
    private void m12854j(C3288d dVar, byte[] bArr) {
        RandomAccessFile randomAccessFile;
        File file = new File(this.f9259a, dVar.f9299f.f9296f);
        RandomAccessFile randomAccessFile2 = null;
        try {
            if (file.exists() && !file.setWritable(true)) {
                Log.w("fb-UnpackingSoSource", "error adding write permission to: " + file);
            }
            try {
                randomAccessFile = new RandomAccessFile(file, "rw");
            } catch (IOException e) {
                Log.w("fb-UnpackingSoSource", "error overwriting " + file + " trying to delete and start over", e);
                SysUtil.m12796c(file);
                randomAccessFile = new RandomAccessFile(file, "rw");
            }
            randomAccessFile2 = randomAccessFile;
            int available = dVar.f9300o.available();
            if (available > 1) {
                SysUtil.m12797d(randomAccessFile2.getFD(), (long) available);
            }
            SysUtil.m12794a(randomAccessFile2, dVar.f9300o, RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO, bArr);
            randomAccessFile2.setLength(randomAccessFile2.getFilePointer());
            if (file.setExecutable(true, false)) {
                if (!file.setWritable(false)) {
                    Log.w("fb-UnpackingSoSource", "error removing " + file + " write permission");
                }
                randomAccessFile2.close();
                return;
            }
            throw new IOException("cannot make file executable: " + file);
        } catch (IOException e2) {
            SysUtil.m12796c(file);
            throw e2;
        } catch (Throwable th) {
            if (!file.setWritable(false)) {
                Log.w("fb-UnpackingSoSource", "error removing " + file + " write permission");
            }
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
            }
            throw th;
        }
    }

    /* renamed from: l */
    private Object m12855l(String str) {
        Object obj;
        synchronized (this.f9289f) {
            obj = this.f9289f.get(str);
            if (obj == null) {
                obj = new Object();
                this.f9289f.put(str, obj);
            }
        }
        return obj;
    }

    /* renamed from: m */
    public static File m12856m(Context context, String str) {
        return new File(context.getApplicationInfo().dataDir + "/" + str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        r12.addSuppressed(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d8, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d9, code lost:
        if (r2 != null) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00df, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r12.addSuppressed(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e3, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e6, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e7, code lost:
        if (r0 != null) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00ed, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r12.addSuppressed(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00f1, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00f4, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00f9, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00fa, code lost:
        r12.addSuppressed(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00fd, code lost:
        throw r13;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a3  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m12857p(com.facebook.soloader.C3275g r12, int r13, byte[] r14) {
        /*
            r11 = this;
            java.lang.String r0 = "fb-UnpackingSoSource"
            java.io.File r6 = new java.io.File
            java.io.File r1 = r11.f9259a
            java.lang.String r2 = "dso_state"
            r6.<init>(r1, r2)
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile
            java.lang.String r2 = "rw"
            r1.<init>(r6, r2)
            r8 = 1
            r3 = 0
            byte r4 = r1.readByte()     // Catch:{ EOFException -> 0x0035, all -> 0x0037 }
            if (r4 == r8) goto L_0x0043
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0035, all -> 0x0037 }
            r4.<init>()     // Catch:{ EOFException -> 0x0035, all -> 0x0037 }
            java.lang.String r5 = "dso store "
            r4.append(r5)     // Catch:{ EOFException -> 0x0035, all -> 0x0037 }
            java.io.File r5 = r11.f9259a     // Catch:{ EOFException -> 0x0035, all -> 0x0037 }
            r4.append(r5)     // Catch:{ EOFException -> 0x0035, all -> 0x0037 }
            java.lang.String r5 = " regeneration interrupted: wiping clean"
            r4.append(r5)     // Catch:{ EOFException -> 0x0035, all -> 0x0037 }
            java.lang.String r4 = r4.toString()     // Catch:{ EOFException -> 0x0035, all -> 0x0037 }
            android.util.Log.v(r0, r4)     // Catch:{ EOFException -> 0x0035, all -> 0x0037 }
        L_0x0035:
            r4 = 0
            goto L_0x0043
        L_0x0037:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r13 = move-exception
            r1.close()     // Catch:{ all -> 0x003e }
            goto L_0x0042
        L_0x003e:
            r14 = move-exception
            r12.addSuppressed(r14)
        L_0x0042:
            throw r13
        L_0x0043:
            r1.close()
            java.io.File r5 = new java.io.File
            java.io.File r1 = r11.f9259a
            java.lang.String r7 = "dso_deps"
            r5.<init>(r1, r7)
            r1 = 0
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile
            r7.<init>(r5, r2)
            long r9 = r7.length()     // Catch:{ all -> 0x00f2 }
            int r2 = (int) r9     // Catch:{ all -> 0x00f2 }
            byte[] r9 = new byte[r2]     // Catch:{ all -> 0x00f2 }
            int r10 = r7.read(r9)     // Catch:{ all -> 0x00f2 }
            if (r10 == r2) goto L_0x0068
            java.lang.String r2 = "short read of so store deps file: marking unclean"
            android.util.Log.v(r0, r2)     // Catch:{ all -> 0x00f2 }
            r4 = 0
        L_0x0068:
            boolean r2 = java.util.Arrays.equals(r9, r14)     // Catch:{ all -> 0x00f2 }
            if (r2 != 0) goto L_0x0074
            java.lang.String r2 = "deps mismatch on deps store: regenerating"
            android.util.Log.v(r0, r2)     // Catch:{ all -> 0x00f2 }
            r4 = 0
        L_0x0074:
            if (r4 == 0) goto L_0x007d
            r2 = r13 & 2
            if (r2 == 0) goto L_0x007b
            goto L_0x007d
        L_0x007b:
            r0 = r1
            goto L_0x009d
        L_0x007d:
            java.lang.String r1 = "so store dirty: regenerating"
            android.util.Log.v(r0, r1)     // Catch:{ all -> 0x00f2 }
            m12859s(r6, r3)     // Catch:{ all -> 0x00f2 }
            com.facebook.soloader.n$f r0 = r11.mo10724n()     // Catch:{ all -> 0x00f2 }
            com.facebook.soloader.n$c r1 = r0.mo10733a()     // Catch:{ all -> 0x00e4 }
            com.facebook.soloader.n$e r2 = r0.mo10734b()     // Catch:{ all -> 0x00e4 }
            r11.m12858q(r4, r1, r2)     // Catch:{ all -> 0x00d6 }
            if (r2 == 0) goto L_0x0099
            r2.close()     // Catch:{ all -> 0x00e4 }
        L_0x0099:
            r0.close()     // Catch:{ all -> 0x00f2 }
            goto L_0x007b
        L_0x009d:
            r7.close()
            if (r0 != 0) goto L_0x00a3
            return r3
        L_0x00a3:
            com.facebook.soloader.n$a r9 = new com.facebook.soloader.n$a
            r1 = r9
            r2 = r11
            r3 = r5
            r4 = r14
            r5 = r0
            r7 = r12
            r1.<init>(r3, r4, r5, r6, r7)
            r12 = r13 & 1
            if (r12 == 0) goto L_0x00d2
            java.lang.Thread r12 = new java.lang.Thread
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "SoSync:"
            r13.append(r14)
            java.io.File r14 = r11.f9259a
            java.lang.String r14 = r14.getName()
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.<init>(r9, r13)
            r12.start()
            goto L_0x00d5
        L_0x00d2:
            r9.run()
        L_0x00d5:
            return r8
        L_0x00d6:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x00d8 }
        L_0x00d8:
            r13 = move-exception
            if (r2 == 0) goto L_0x00e3
            r2.close()     // Catch:{ all -> 0x00df }
            goto L_0x00e3
        L_0x00df:
            r14 = move-exception
            r12.addSuppressed(r14)     // Catch:{ all -> 0x00e4 }
        L_0x00e3:
            throw r13     // Catch:{ all -> 0x00e4 }
        L_0x00e4:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x00e6 }
        L_0x00e6:
            r13 = move-exception
            if (r0 == 0) goto L_0x00f1
            r0.close()     // Catch:{ all -> 0x00ed }
            goto L_0x00f1
        L_0x00ed:
            r14 = move-exception
            r12.addSuppressed(r14)     // Catch:{ all -> 0x00f2 }
        L_0x00f1:
            throw r13     // Catch:{ all -> 0x00f2 }
        L_0x00f2:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x00f4 }
        L_0x00f4:
            r13 = move-exception
            r7.close()     // Catch:{ all -> 0x00f9 }
            goto L_0x00fd
        L_0x00f9:
            r14 = move-exception
            r12.addSuppressed(r14)
        L_0x00fd:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C3284n.m12857p(com.facebook.soloader.g, int, byte[]):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043 A[Catch:{ all -> 0x0099, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005a A[Catch:{ all -> 0x0099, all -> 0x00c5 }] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12858q(byte r10, com.facebook.soloader.C3284n.C3287c r11, com.facebook.soloader.C3284n.C3289e r12) {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "regenerating DSO store "
            r0.append(r1)
            java.lang.Class r1 = r9.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "fb-UnpackingSoSource"
            android.util.Log.v(r1, r0)
            java.io.File r0 = new java.io.File
            java.io.File r2 = r9.f9259a
            java.lang.String r3 = "dso_manifest"
            r0.<init>(r2, r3)
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile
            java.lang.String r3 = "rw"
            r2.<init>(r0, r3)
            r0 = 1
            if (r10 != r0) goto L_0x003f
            com.facebook.soloader.n$c r10 = com.facebook.soloader.C3284n.C3287c.m12866a(r2)     // Catch:{ Exception -> 0x0039 }
            goto L_0x0040
        L_0x0036:
            r10 = move-exception
            goto L_0x00c4
        L_0x0039:
            r10 = move-exception
            java.lang.String r3 = "error reading existing DSO manifest"
            android.util.Log.i(r1, r3, r10)     // Catch:{ all -> 0x0036 }
        L_0x003f:
            r10 = 0
        L_0x0040:
            r3 = 0
            if (r10 != 0) goto L_0x004a
            com.facebook.soloader.n$c r10 = new com.facebook.soloader.n$c     // Catch:{ all -> 0x0036 }
            com.facebook.soloader.n$b[] r4 = new com.facebook.soloader.C3284n.C3286b[r3]     // Catch:{ all -> 0x0036 }
            r10.<init>(r4)     // Catch:{ all -> 0x0036 }
        L_0x004a:
            com.facebook.soloader.n$b[] r11 = r11.f9298a     // Catch:{ all -> 0x0036 }
            r9.m12852h(r11)     // Catch:{ all -> 0x0036 }
            r11 = 32768(0x8000, float:4.5918E-41)
            byte[] r11 = new byte[r11]     // Catch:{ all -> 0x0036 }
        L_0x0054:
            boolean r4 = r12.mo10735a()     // Catch:{ all -> 0x0036 }
            if (r4 == 0) goto L_0x00a4
            com.facebook.soloader.n$d r4 = r12.mo10736b()     // Catch:{ all -> 0x0036 }
            r5 = 1
            r6 = 0
        L_0x0060:
            if (r5 == 0) goto L_0x008b
            com.facebook.soloader.n$b[] r7 = r10.f9298a     // Catch:{ all -> 0x0089 }
            int r8 = r7.length     // Catch:{ all -> 0x0089 }
            if (r6 >= r8) goto L_0x008b
            r7 = r7[r6]     // Catch:{ all -> 0x0089 }
            java.lang.String r7 = r7.f9296f     // Catch:{ all -> 0x0089 }
            com.facebook.soloader.n$b r8 = r4.f9299f     // Catch:{ all -> 0x0089 }
            java.lang.String r8 = r8.f9296f     // Catch:{ all -> 0x0089 }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x0089 }
            if (r7 == 0) goto L_0x0086
            com.facebook.soloader.n$b[] r7 = r10.f9298a     // Catch:{ all -> 0x0089 }
            r7 = r7[r6]     // Catch:{ all -> 0x0089 }
            java.lang.String r7 = r7.f9297o     // Catch:{ all -> 0x0089 }
            com.facebook.soloader.n$b r8 = r4.f9299f     // Catch:{ all -> 0x0089 }
            java.lang.String r8 = r8.f9297o     // Catch:{ all -> 0x0089 }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x0089 }
            if (r7 == 0) goto L_0x0086
            r5 = 0
        L_0x0086:
            int r6 = r6 + 1
            goto L_0x0060
        L_0x0089:
            r10 = move-exception
            goto L_0x0091
        L_0x008b:
            if (r5 == 0) goto L_0x009e
            r9.m12853i(r4, r11)     // Catch:{ all -> 0x0089 }
            goto L_0x009e
        L_0x0091:
            throw r10     // Catch:{ all -> 0x0092 }
        L_0x0092:
            r11 = move-exception
            if (r4 == 0) goto L_0x009d
            r4.close()     // Catch:{ all -> 0x0099 }
            goto L_0x009d
        L_0x0099:
            r12 = move-exception
            r10.addSuppressed(r12)     // Catch:{ all -> 0x0036 }
        L_0x009d:
            throw r11     // Catch:{ all -> 0x0036 }
        L_0x009e:
            if (r4 == 0) goto L_0x0054
            r4.close()     // Catch:{ all -> 0x0036 }
            goto L_0x0054
        L_0x00a4:
            r2.close()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Finished regenerating DSO store "
            r10.append(r11)
            java.lang.Class r11 = r9.getClass()
            java.lang.String r11 = r11.getName()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            android.util.Log.v(r1, r10)
            return
        L_0x00c4:
            throw r10     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r11 = move-exception
            r2.close()     // Catch:{ all -> 0x00ca }
            goto L_0x00ce
        L_0x00ca:
            r12 = move-exception
            r10.addSuppressed(r12)
        L_0x00ce:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C3284n.m12858q(byte, com.facebook.soloader.n$c, com.facebook.soloader.n$e):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r3.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        r4 = move-exception;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m12859s(java.io.File r3, byte r4) {
        /*
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "rw"
            r0.<init>(r3, r1)
            r1 = 0
            r0.seek(r1)     // Catch:{ all -> 0x0021 }
            r0.write(r4)     // Catch:{ all -> 0x0021 }
            long r3 = r0.getFilePointer()     // Catch:{ all -> 0x0021 }
            r0.setLength(r3)     // Catch:{ all -> 0x0021 }
            java.io.FileDescriptor r3 = r0.getFD()     // Catch:{ all -> 0x0021 }
            r3.sync()     // Catch:{ all -> 0x0021 }
            r0.close()
            return
        L_0x0021:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r4 = move-exception
            r0.close()     // Catch:{ all -> 0x0028 }
            goto L_0x002c
        L_0x0028:
            r0 = move-exception
            r3.addSuppressed(r0)
        L_0x002c:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C3284n.m12859s(java.io.File, byte):void");
    }

    /* renamed from: a */
    public int mo10726a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        int f;
        synchronized (m12855l(str)) {
            f = mo10732f(str, i, this.f9259a, threadPolicy);
        }
        return f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo10727b(int i) {
        SysUtil.m12803j(this.f9259a);
        C3275g a = C3275g.m12834a(new File(this.f9259a, "dso_lock"));
        try {
            Log.v("fb-UnpackingSoSource", "locked dso store " + this.f9259a);
            if (m12857p(a, i, mo10723k())) {
                a = null;
            } else {
                Log.i("fb-UnpackingSoSource", "dso store is up-to-date: " + this.f9259a);
            }
            if (a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("not releasing dso store lock for ");
                sb.append(this.f9259a);
                sb.append(" (syncer thread started)");
                Log.v("fb-UnpackingSoSource", sb.toString());
            }
        } finally {
            if (a != null) {
                Log.v("fb-UnpackingSoSource", "releasing dso store lock for " + this.f9259a);
                a.close();
            } else {
                Log.v("fb-UnpackingSoSource", "not releasing dso store lock for " + this.f9259a + " (syncer thread started)");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        if (r1 != null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        r0.addSuppressed(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        throw r2;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo10723k() {
        /*
            r5 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            com.facebook.soloader.n$f r1 = r5.mo10724n()
            com.facebook.soloader.n$c r2 = r1.mo10733a()     // Catch:{ all -> 0x0036 }
            com.facebook.soloader.n$b[] r2 = r2.f9298a     // Catch:{ all -> 0x0036 }
            r3 = 1
            r0.writeByte(r3)     // Catch:{ all -> 0x0036 }
            int r3 = r2.length     // Catch:{ all -> 0x0036 }
            r0.writeInt(r3)     // Catch:{ all -> 0x0036 }
            r3 = 0
        L_0x0017:
            int r4 = r2.length     // Catch:{ all -> 0x0036 }
            if (r3 >= r4) goto L_0x002b
            r4 = r2[r3]     // Catch:{ all -> 0x0036 }
            java.lang.String r4 = r4.f9296f     // Catch:{ all -> 0x0036 }
            r0.writeString(r4)     // Catch:{ all -> 0x0036 }
            r4 = r2[r3]     // Catch:{ all -> 0x0036 }
            java.lang.String r4 = r4.f9297o     // Catch:{ all -> 0x0036 }
            r0.writeString(r4)     // Catch:{ all -> 0x0036 }
            int r3 = r3 + 1
            goto L_0x0017
        L_0x002b:
            r1.close()
            byte[] r1 = r0.marshall()
            r0.recycle()
            return r1
        L_0x0036:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r2 = move-exception
            if (r1 == 0) goto L_0x0043
            r1.close()     // Catch:{ all -> 0x003f }
            goto L_0x0043
        L_0x003f:
            r1 = move-exception
            r0.addSuppressed(r1)
        L_0x0043:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C3284n.mo10723k():byte[]");
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract C3290f mo10724n();

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public synchronized void mo10744o(String str) {
        synchronized (m12855l(str)) {
            this.f9287d = str;
            mo10727b(2);
        }
    }

    /* renamed from: r */
    public void mo10745r(String[] strArr) {
        this.f9288e = strArr;
    }
}
