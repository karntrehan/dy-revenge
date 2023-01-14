package p477h.p478a.p479a.p485e.p486a;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import p477h.p478a.p479a.p488f.C10543j;
import p477h.p478a.p479a.p488f.p489r.C10557f;

/* renamed from: h.a.a.e.a.h */
public abstract class C10515h extends InputStream {

    /* renamed from: f */
    protected RandomAccessFile f27774f;

    /* renamed from: o */
    protected File f27775o;

    /* renamed from: p */
    private boolean f27776p;

    /* renamed from: q */
    private int f27777q = 0;

    /* renamed from: r */
    private byte[] f27778r = new byte[1];

    public C10515h(File file, boolean z, int i) {
        this.f27774f = new RandomAccessFile(file, C10557f.READ.mo26199e());
        this.f27775o = file;
        this.f27776p = z;
        if (z) {
            this.f27777q = i;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract File mo25930a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo25942b(int i) {
        File a = mo25930a(i);
        if (a.exists()) {
            this.f27774f.close();
            this.f27774f = new RandomAccessFile(a, C10557f.READ.mo26199e());
            return;
        }
        throw new FileNotFoundException("zip split file does not exist: " + a);
    }

    public void close() {
        RandomAccessFile randomAccessFile = this.f27774f;
        if (randomAccessFile != null) {
            randomAccessFile.close();
        }
    }

    /* renamed from: h */
    public void mo25944h(C10543j jVar) {
        if (this.f27776p && this.f27777q != jVar.mo26091O()) {
            mo25942b(jVar.mo26091O());
            this.f27777q = jVar.mo26091O();
        }
        this.f27774f.seek(jVar.mo26094R());
    }

    public int read() {
        if (read(this.f27778r) == -1) {
            return -1;
        }
        return this.f27778r[0];
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = this.f27774f.read(bArr, i, i2);
        if ((read == i2 && read != -1) || !this.f27776p) {
            return read;
        }
        mo25942b(this.f27777q + 1);
        this.f27777q++;
        if (read < 0) {
            read = 0;
        }
        int read2 = this.f27774f.read(bArr, read, i2 - read);
        return read2 > 0 ? read + read2 : read;
    }
}
