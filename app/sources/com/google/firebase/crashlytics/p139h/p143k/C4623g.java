package com.google.firebase.crashlytics.p139h.p143k;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.firebase.crashlytics.h.k.g */
class C4623g implements Closeable {

    /* renamed from: f */
    private static final Logger f13073f = Logger.getLogger(C4623g.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final RandomAccessFile f13074o;

    /* renamed from: p */
    int f13075p;

    /* renamed from: q */
    private int f13076q;

    /* renamed from: r */
    private C4625b f13077r;

    /* renamed from: s */
    private C4625b f13078s;

    /* renamed from: t */
    private final byte[] f13079t = new byte[16];

    /* renamed from: com.google.firebase.crashlytics.h.k.g$a */
    class C4624a implements C4627d {

        /* renamed from: a */
        boolean f13080a = true;

        /* renamed from: b */
        final /* synthetic */ StringBuilder f13081b;

        C4624a(StringBuilder sb) {
            this.f13081b = sb;
        }

        /* renamed from: a */
        public void mo14268a(InputStream inputStream, int i) {
            if (this.f13080a) {
                this.f13080a = false;
            } else {
                this.f13081b.append(", ");
            }
            this.f13081b.append(i);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.h.k.g$b */
    static class C4625b {

        /* renamed from: a */
        static final C4625b f13083a = new C4625b(0, 0);

        /* renamed from: b */
        final int f13084b;

        /* renamed from: c */
        final int f13085c;

        C4625b(int i, int i2) {
            this.f13084b = i;
            this.f13085c = i2;
        }

        public String toString() {
            return C4625b.class.getSimpleName() + "[position = " + this.f13084b + ", length = " + this.f13085c + "]";
        }
    }

    /* renamed from: com.google.firebase.crashlytics.h.k.g$c */
    private final class C4626c extends InputStream {

        /* renamed from: f */
        private int f13086f;

        /* renamed from: o */
        private int f13087o;

        private C4626c(C4625b bVar) {
            this.f13086f = C4623g.this.m17593B0(bVar.f13084b + 4);
            this.f13087o = bVar.f13085c;
        }

        /* synthetic */ C4626c(C4623g gVar, C4625b bVar, C4624a aVar) {
            this(bVar);
        }

        public int read() {
            if (this.f13087o == 0) {
                return -1;
            }
            C4623g.this.f13074o.seek((long) this.f13086f);
            int read = C4623g.this.f13074o.read();
            this.f13086f = C4623g.this.m17593B0(this.f13086f + 1);
            this.f13087o--;
            return read;
        }

        public int read(byte[] bArr, int i, int i2) {
            Object unused = C4623g.m17601e0(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.f13087o;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            C4623g.this.m17609x0(this.f13086f, bArr, i, i2);
            this.f13086f = C4623g.this.m17593B0(this.f13086f + i2);
            this.f13087o -= i2;
            return i2;
        }
    }

    /* renamed from: com.google.firebase.crashlytics.h.k.g$d */
    public interface C4627d {
        /* renamed from: a */
        void mo14268a(InputStream inputStream, int i);
    }

    public C4623g(File file) {
        if (!file.exists()) {
            m17598W(file);
        }
        this.f13074o = m17603i0(file);
        m17606s0();
    }

    /* access modifiers changed from: private */
    /* renamed from: B0 */
    public int m17593B0(int i) {
        int i2 = this.f13075p;
        return i < i2 ? i : (i + 16) - i2;
    }

    /* renamed from: C0 */
    private void m17594C0(int i, int i2, int i3, int i4) {
        m17596E0(this.f13079t, i, i2, i3, i4);
        this.f13074o.seek(0);
        this.f13074o.write(this.f13079t);
    }

    /* renamed from: D0 */
    private static void m17595D0(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* renamed from: E0 */
    private static void m17596E0(byte[] bArr, int... iArr) {
        int i = 0;
        for (int D0 : iArr) {
            m17595D0(bArr, i, D0);
            i += 4;
        }
    }

    /* renamed from: I */
    private void m17597I(int i) {
        int i2 = i + 4;
        int v0 = m17608v0();
        if (v0 < i2) {
            int i3 = this.f13075p;
            do {
                v0 += i3;
                i3 <<= 1;
            } while (v0 < i2);
            m17611z0(i3);
            C4625b bVar = this.f13078s;
            int B0 = m17593B0(bVar.f13084b + 4 + bVar.f13085c);
            if (B0 < this.f13077r.f13084b) {
                FileChannel channel = this.f13074o.getChannel();
                channel.position((long) this.f13075p);
                long j = (long) (B0 - 4);
                if (channel.transferTo(16, j, channel) != j) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            int i4 = this.f13078s.f13084b;
            int i5 = this.f13077r.f13084b;
            if (i4 < i5) {
                int i6 = (this.f13075p + i4) - 16;
                m17594C0(i3, this.f13076q, i5, i6);
                this.f13078s = new C4625b(i6, this.f13078s.f13085c);
            } else {
                m17594C0(i3, this.f13076q, i5, i4);
            }
            this.f13075p = i3;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: W */
    private static void m17598W(File file) {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile i0 = m17603i0(file2);
        try {
            i0.setLength(4096);
            i0.seek(0);
            byte[] bArr = new byte[16];
            m17596E0(bArr, 4096, 0, 0, 0);
            i0.write(bArr);
            i0.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            i0.close();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public static <T> T m17601e0(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: i0 */
    private static RandomAccessFile m17603i0(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    /* renamed from: n0 */
    private C4625b m17604n0(int i) {
        if (i == 0) {
            return C4625b.f13083a;
        }
        this.f13074o.seek((long) i);
        return new C4625b(i, this.f13074o.readInt());
    }

    /* renamed from: s0 */
    private void m17606s0() {
        this.f13074o.seek(0);
        this.f13074o.readFully(this.f13079t);
        int u0 = m17607u0(this.f13079t, 0);
        this.f13075p = u0;
        if (((long) u0) <= this.f13074o.length()) {
            this.f13076q = m17607u0(this.f13079t, 4);
            int u02 = m17607u0(this.f13079t, 8);
            int u03 = m17607u0(this.f13079t, 12);
            this.f13077r = m17604n0(u02);
            this.f13078s = m17604n0(u03);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f13075p + ", Actual length: " + this.f13074o.length());
    }

    /* renamed from: u0 */
    private static int m17607u0(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* renamed from: v0 */
    private int m17608v0() {
        return this.f13075p - mo14260A0();
    }

    /* access modifiers changed from: private */
    /* renamed from: x0 */
    public void m17609x0(int i, byte[] bArr, int i2, int i3) {
        RandomAccessFile randomAccessFile;
        int B0 = m17593B0(i);
        int i4 = B0 + i3;
        int i5 = this.f13075p;
        if (i4 <= i5) {
            this.f13074o.seek((long) B0);
            randomAccessFile = this.f13074o;
        } else {
            int i6 = i5 - B0;
            this.f13074o.seek((long) B0);
            this.f13074o.readFully(bArr, i2, i6);
            this.f13074o.seek(16);
            randomAccessFile = this.f13074o;
            i2 += i6;
            i3 -= i6;
        }
        randomAccessFile.readFully(bArr, i2, i3);
    }

    /* renamed from: y0 */
    private void m17610y0(int i, byte[] bArr, int i2, int i3) {
        RandomAccessFile randomAccessFile;
        int B0 = m17593B0(i);
        int i4 = B0 + i3;
        int i5 = this.f13075p;
        if (i4 <= i5) {
            this.f13074o.seek((long) B0);
            randomAccessFile = this.f13074o;
        } else {
            int i6 = i5 - B0;
            this.f13074o.seek((long) B0);
            this.f13074o.write(bArr, i2, i6);
            this.f13074o.seek(16);
            randomAccessFile = this.f13074o;
            i2 += i6;
            i3 -= i6;
        }
        randomAccessFile.write(bArr, i2, i3);
    }

    /* renamed from: z0 */
    private void m17611z0(int i) {
        this.f13074o.setLength((long) i);
        this.f13074o.getChannel().force(true);
    }

    /* renamed from: A */
    public synchronized void mo14259A(byte[] bArr, int i, int i2) {
        int i3;
        m17601e0(bArr, "buffer");
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        m17597I(i2);
        boolean X = mo14263X();
        if (X) {
            i3 = 16;
        } else {
            C4625b bVar = this.f13078s;
            i3 = m17593B0(bVar.f13084b + 4 + bVar.f13085c);
        }
        C4625b bVar2 = new C4625b(i3, i2);
        m17595D0(this.f13079t, 0, i2);
        m17610y0(bVar2.f13084b, this.f13079t, 0, 4);
        m17610y0(bVar2.f13084b + 4, bArr, i, i2);
        m17594C0(this.f13075p, this.f13076q + 1, X ? bVar2.f13084b : this.f13077r.f13084b, bVar2.f13084b);
        this.f13078s = bVar2;
        this.f13076q++;
        if (X) {
            this.f13077r = bVar2;
        }
    }

    /* renamed from: A0 */
    public int mo14260A0() {
        if (this.f13076q == 0) {
            return 16;
        }
        C4625b bVar = this.f13078s;
        int i = bVar.f13084b;
        int i2 = this.f13077r.f13084b;
        return i >= i2 ? (i - i2) + 4 + bVar.f13085c + 16 : (((i + 4) + bVar.f13085c) + this.f13075p) - i2;
    }

    /* renamed from: E */
    public synchronized void mo14261E() {
        m17594C0(4096, 0, 0, 0);
        this.f13076q = 0;
        C4625b bVar = C4625b.f13083a;
        this.f13077r = bVar;
        this.f13078s = bVar;
        if (this.f13075p > 4096) {
            m17611z0(4096);
        }
        this.f13075p = 4096;
    }

    /* renamed from: L */
    public synchronized void mo14262L(C4627d dVar) {
        int i = this.f13077r.f13084b;
        for (int i2 = 0; i2 < this.f13076q; i2++) {
            C4625b n0 = m17604n0(i);
            dVar.mo14268a(new C4626c(this, n0, (C4624a) null), n0.f13085c);
            i = m17593B0(n0.f13084b + 4 + n0.f13085c);
        }
    }

    /* renamed from: X */
    public synchronized boolean mo14263X() {
        return this.f13076q == 0;
    }

    public synchronized void close() {
        this.f13074o.close();
    }

    /* renamed from: r */
    public void mo14265r(byte[] bArr) {
        mo14259A(bArr, 0, bArr.length);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C4623g.class.getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f13075p);
        sb.append(", size=");
        sb.append(this.f13076q);
        sb.append(", first=");
        sb.append(this.f13077r);
        sb.append(", last=");
        sb.append(this.f13078s);
        sb.append(", element lengths=[");
        try {
            mo14262L(new C4624a(sb));
        } catch (IOException e) {
            f13073f.log(Level.WARNING, "read error", e);
        }
        sb.append("]]");
        return sb.toString();
    }

    /* renamed from: w0 */
    public synchronized void mo14267w0() {
        if (mo14263X()) {
            throw new NoSuchElementException();
        } else if (this.f13076q == 1) {
            mo14261E();
        } else {
            C4625b bVar = this.f13077r;
            int B0 = m17593B0(bVar.f13084b + 4 + bVar.f13085c);
            m17609x0(B0, this.f13079t, 0, 4);
            int u0 = m17607u0(this.f13079t, 0);
            m17594C0(this.f13075p, this.f13076q - 1, B0, this.f13078s.f13084b);
            this.f13076q--;
            this.f13077r = new C4625b(B0, u0);
        }
    }
}
