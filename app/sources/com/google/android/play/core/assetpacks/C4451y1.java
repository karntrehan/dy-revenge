package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Properties;
import p174e.p319f.p320a.p382e.p383a.p385b.C9101a;
import p174e.p319f.p320a.p382e.p383a.p385b.C9146y;

/* renamed from: com.google.android.play.core.assetpacks.y1 */
final class C4451y1 {

    /* renamed from: a */
    private static final C9101a f12715a = new C9101a("SliceMetadataManager");

    /* renamed from: b */
    private final byte[] f12716b = new byte[8192];

    /* renamed from: c */
    private final C4439v f12717c;

    /* renamed from: d */
    private final String f12718d;

    /* renamed from: e */
    private final int f12719e;

    /* renamed from: f */
    private final long f12720f;

    /* renamed from: g */
    private final String f12721g;

    /* renamed from: h */
    private int f12722h;

    C4451y1(C4439v vVar, String str, int i, long j, String str2) {
        this.f12717c = vVar;
        this.f12718d = str;
        this.f12719e = i;
        this.f12720f = j;
        this.f12721g = str2;
        this.f12722h = -1;
    }

    /* renamed from: n */
    private final File m17007n() {
        File C = this.f12717c.mo13923C(this.f12718d, this.f12719e, this.f12720f, this.f12721g);
        if (!C.exists()) {
            C.mkdirs();
        }
        return C;
    }

    /* renamed from: o */
    private final File m17008o() {
        File A = this.f12717c.mo13921A(this.f12718d, this.f12719e, this.f12720f, this.f12721g);
        A.getParentFile().mkdirs();
        A.createNewFile();
        return A;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13964a(String str, long j, long j2, int i) {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j));
        properties.put("remainingBytes", String.valueOf(j2));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f12722h));
        FileOutputStream fileOutputStream = new FileOutputStream(m17008o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            C9146y.m30436a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo13965b(byte[] bArr, int i) {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f12722h));
        FileOutputStream fileOutputStream = new FileOutputStream(m17008o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            File B = this.f12717c.mo13922B(this.f12718d, this.f12719e, this.f12720f, this.f12721g);
            if (B.exists()) {
                B.delete();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(B);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.close();
                return;
            } catch (Throwable th) {
                C9146y.m30436a(th, th);
            }
            throw th;
            throw th;
        } catch (Throwable th2) {
            C9146y.m30436a(th, th2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo13966c(int i) {
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(mo13973j().length()));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f12722h));
        FileOutputStream fileOutputStream = new FileOutputStream(m17008o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            C9146y.m30436a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo13967d(int i) {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f12722h));
        FileOutputStream fileOutputStream = new FileOutputStream(m17008o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            C9146y.m30436a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C4448x1 mo13968e() {
        File A = this.f12717c.mo13921A(this.f12718d, this.f12719e, this.f12720f, this.f12721g);
        if (A.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(A);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                    throw new C4396k0("Slice checkpoint file corrupt.");
                }
                try {
                    int parseInt = Integer.parseInt(properties.getProperty("fileStatus"));
                    String property = properties.getProperty("fileName");
                    long parseLong = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                    long parseLong2 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                    int parseInt2 = Integer.parseInt(properties.getProperty("previousChunk"));
                    this.f12722h = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                    return new C4448x1(parseInt, property, parseLong, parseLong2, parseInt2);
                } catch (NumberFormatException e) {
                    throw new C4396k0("Slice checkpoint file corrupt.", (Exception) e);
                }
            } catch (Throwable th) {
                C9146y.m30436a(th, th);
            }
        } else {
            throw new C4396k0("Slice checkpoint file does not exist.");
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo13969f(InputStream inputStream, long j) {
        int read;
        RandomAccessFile randomAccessFile = new RandomAccessFile(mo13973j(), "rw");
        try {
            randomAccessFile.seek(j);
            do {
                read = inputStream.read(this.f12716b);
                if (read > 0) {
                    randomAccessFile.write(this.f12716b, 0, read);
                }
            } while (read == 8192);
            randomAccessFile.close();
            return;
        } catch (Throwable th) {
            C9146y.m30436a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo13970g(byte[] bArr) {
        FileOutputStream fileOutputStream;
        this.f12722h++;
        try {
            fileOutputStream = new FileOutputStream(new File(m17007n(), String.format("%s-LFH.dat", new Object[]{Integer.valueOf(this.f12722h)})));
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            return;
        } catch (IOException e) {
            throw new C4396k0("Could not write metadata file.", (Exception) e);
        } catch (Throwable th) {
            C9146y.m30436a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo13971h(byte[] bArr, InputStream inputStream) {
        this.f12722h++;
        FileOutputStream fileOutputStream = new FileOutputStream(mo13973j());
        try {
            fileOutputStream.write(bArr);
            int read = inputStream.read(this.f12716b);
            while (read > 0) {
                fileOutputStream.write(this.f12716b, 0, read);
                read = inputStream.read(this.f12716b);
            }
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            C9146y.m30436a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo13972i(long j, byte[] bArr, int i, int i2) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(mo13973j(), "rw");
        try {
            randomAccessFile.seek(j);
            randomAccessFile.write(bArr, i, i2);
            randomAccessFile.close();
            return;
        } catch (Throwable th) {
            C9146y.m30436a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final File mo13973j() {
        return new File(m17007n(), String.format("%s-NAM.dat", new Object[]{Integer.valueOf(this.f12722h)}));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final int mo13974k() {
        File A = this.f12717c.mo13921A(this.f12718d, this.f12719e, this.f12720f, this.f12721g);
        if (!A.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(A);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                return -1;
            }
            if (properties.getProperty("previousChunk") != null) {
                return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
            }
            throw new C4396k0("Slice checkpoint file corrupt.");
        } catch (Throwable th) {
            C9146y.m30436a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean mo13975l() {
        FileInputStream fileInputStream;
        File A = this.f12717c.mo13921A(this.f12718d, this.f12719e, this.f12720f, this.f12721g);
        if (!A.exists()) {
            return false;
        }
        try {
            fileInputStream = new FileInputStream(A);
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("fileStatus") != null) {
                return Integer.parseInt(properties.getProperty("fileStatus")) == 4;
            }
            f12715a.mo23081b("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
            return false;
        } catch (IOException e) {
            f12715a.mo23081b("Could not read checkpoint while checking if extraction finished. %s", e);
            return false;
        } catch (Throwable th) {
            C9146y.m30436a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo13976m(byte[] bArr, int i) {
        this.f12722h++;
        FileOutputStream fileOutputStream = new FileOutputStream(mo13973j());
        try {
            fileOutputStream.write(bArr, 0, i);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            C9146y.m30436a(th, th);
        }
        throw th;
    }
}
