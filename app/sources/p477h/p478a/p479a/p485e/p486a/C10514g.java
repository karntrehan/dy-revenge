package p477h.p478a.p479a.p485e.p486a;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import p477h.p478a.p479a.p488f.p489r.C10557f;
import p477h.p478a.p479a.p492i.C10581d;

/* renamed from: h.a.a.e.a.g */
public class C10514g extends RandomAccessFile {

    /* renamed from: f */
    private long f27768f;

    /* renamed from: o */
    private File[] f27769o;

    /* renamed from: p */
    private RandomAccessFile f27770p;

    /* renamed from: q */
    private byte[] f27771q = new byte[1];

    /* renamed from: r */
    private int f27772r = 0;

    /* renamed from: s */
    private String f27773s;

    public C10514g(File file, String str, File[] fileArr) {
        super(file, str);
        super.close();
        if (!C10557f.WRITE.mo26199e().equals(str)) {
            m35512a(fileArr);
            this.f27770p = new RandomAccessFile(file, str);
            this.f27769o = fileArr;
            this.f27768f = file.length();
            this.f27773s = str;
            return;
        }
        throw new IllegalArgumentException("write mode is not allowed for NumberedSplitRandomAccessFile");
    }

    /* renamed from: a */
    private void m35512a(File[] fileArr) {
        int length = fileArr.length;
        int i = 1;
        int i2 = 0;
        while (i2 < length) {
            String l = C10581d.m35897l(fileArr[i2]);
            try {
                if (i == Integer.parseInt(l)) {
                    i++;
                    i2++;
                } else {
                    throw new IOException("Split file number " + i + " does not exist");
                }
            } catch (NumberFormatException unused) {
                throw new IOException("Split file extension not in expected format. Found: " + l + " expected of format: .001, .002, etc");
            }
        }
    }

    /* renamed from: h */
    private void m35513h(int i) {
        if (this.f27772r != i) {
            if (i <= this.f27769o.length - 1) {
                RandomAccessFile randomAccessFile = this.f27770p;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f27770p = new RandomAccessFile(this.f27769o[i], this.f27773s);
                this.f27772r = i;
                return;
            }
            throw new IOException("split counter greater than number of split files");
        }
    }

    /* renamed from: b */
    public void mo25931b() {
        m35513h(this.f27769o.length - 1);
    }

    public long getFilePointer() {
        return this.f27770p.getFilePointer();
    }

    public long length() {
        return this.f27770p.length();
    }

    /* renamed from: o */
    public void mo25934o(long j) {
        this.f27770p.seek(j);
    }

    public int read() {
        if (read(this.f27771q) == -1) {
            return -1;
        }
        return this.f27771q[0] & 255;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = this.f27770p.read(bArr, i, i2);
        if (read != -1) {
            return read;
        }
        int i3 = this.f27772r;
        if (i3 == this.f27769o.length - 1) {
            return -1;
        }
        m35513h(i3 + 1);
        return read(bArr, i, i2);
    }

    public void seek(long j) {
        int i = (int) (j / this.f27768f);
        if (i != this.f27772r) {
            m35513h(i);
        }
        this.f27770p.seek(j - (((long) i) * this.f27768f));
    }

    public void write(int i) {
        throw new UnsupportedOperationException();
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}
