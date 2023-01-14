package p477h.p478a.p479a.p485e.p487b;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import okhttp3.HttpUrl;
import p477h.p478a.p479a.p483c.C10497a;
import p477h.p478a.p479a.p484d.C10502d;
import p477h.p478a.p479a.p488f.p489r.C10557f;
import p477h.p478a.p479a.p492i.C10581d;
import p477h.p478a.p479a.p492i.C10583f;

/* renamed from: h.a.a.e.b.h */
public class C10529h extends OutputStream implements C10528g {

    /* renamed from: f */
    private RandomAccessFile f27802f;

    /* renamed from: o */
    private long f27803o;

    /* renamed from: p */
    private File f27804p;

    /* renamed from: q */
    private int f27805q;

    /* renamed from: r */
    private long f27806r;

    /* renamed from: s */
    private C10583f f27807s;

    public C10529h(File file) {
        this(file, -1);
    }

    public C10529h(File file, long j) {
        this.f27807s = new C10583f();
        if (j < 0 || j >= 65536) {
            this.f27802f = new RandomAccessFile(file, C10557f.WRITE.mo26199e());
            this.f27803o = j;
            this.f27804p = file;
            this.f27805q = 0;
            this.f27806r = 0;
            return;
        }
        throw new C10497a("split length less than minimum allowed split length of 65536 Bytes");
    }

    /* renamed from: A */
    private boolean m35565A(byte[] bArr) {
        int d = this.f27807s.mo26245d(bArr);
        for (C10502d dVar : C10502d.values()) {
            if (dVar != C10502d.SPLIT_ZIP && dVar.mo25904e() == ((long) d)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: W */
    private void m35566W() {
        String str;
        String t = C10581d.m35905t(this.f27804p.getName());
        String absolutePath = this.f27804p.getAbsolutePath();
        if (this.f27804p.getParent() == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str = this.f27804p.getParent() + System.getProperty("file.separator");
        }
        String str2 = ".z0" + (this.f27805q + 1);
        if (this.f27805q >= 9) {
            str2 = ".z" + (this.f27805q + 1);
        }
        File file = new File(str + t + str2);
        this.f27802f.close();
        if (file.exists()) {
            throw new IOException("split file: " + file.getName() + " already exists in the current directory, cannot rename this file");
        } else if (this.f27804p.renameTo(file)) {
            this.f27804p = new File(absolutePath);
            this.f27802f = new RandomAccessFile(this.f27804p, C10557f.WRITE.mo26199e());
            this.f27805q++;
        } else {
            throw new IOException("cannot rename newly created split file");
        }
    }

    /* renamed from: r */
    private boolean m35567r(int i) {
        long j = this.f27803o;
        return j < 65536 || this.f27806r + ((long) i) <= j;
    }

    /* renamed from: E */
    public boolean mo25987E() {
        return this.f27803o != -1;
    }

    /* renamed from: I */
    public void mo25988I(long j) {
        this.f27802f.seek(j);
    }

    /* renamed from: L */
    public int mo25989L(int i) {
        return this.f27802f.skipBytes(i);
    }

    /* renamed from: a */
    public int mo25977a() {
        return this.f27805q;
    }

    /* renamed from: b */
    public long mo25978b() {
        return this.f27802f.getFilePointer();
    }

    public void close() {
        this.f27802f.close();
    }

    /* renamed from: h */
    public boolean mo25991h(int i) {
        if (i < 0) {
            throw new C10497a("negative buffersize for checkBufferSizeAndStartNextSplitFile");
        } else if (m35567r(i)) {
            return false;
        } else {
            try {
                m35566W();
                this.f27806r = 0;
                return true;
            } catch (IOException e) {
                throw new C10497a((Exception) e);
            }
        }
    }

    /* renamed from: o */
    public long mo25992o() {
        return this.f27803o;
    }

    public void write(int i) {
        write(new byte[]{(byte) i});
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        long j;
        if (i2 > 0) {
            long j2 = this.f27803o;
            if (j2 == -1) {
                this.f27802f.write(bArr, i, i2);
                this.f27806r += (long) i2;
                return;
            }
            long j3 = this.f27806r;
            if (j3 >= j2) {
                m35566W();
                this.f27802f.write(bArr, i, i2);
                j = (long) i2;
            } else {
                long j4 = (long) i2;
                if (j3 + j4 > j2) {
                    if (m35565A(bArr)) {
                        m35566W();
                        this.f27802f.write(bArr, i, i2);
                    } else {
                        this.f27802f.write(bArr, i, (int) (this.f27803o - this.f27806r));
                        m35566W();
                        RandomAccessFile randomAccessFile = this.f27802f;
                        long j5 = this.f27803o;
                        long j6 = this.f27806r;
                        randomAccessFile.write(bArr, i + ((int) (j5 - j6)), (int) (j4 - (j5 - j6)));
                        j4 -= this.f27803o - this.f27806r;
                    }
                    this.f27806r = j4;
                    return;
                }
                this.f27802f.write(bArr, i, i2);
                j = this.f27806r + j4;
            }
            this.f27806r = j;
        }
    }
}
