package p174e.p181b.p182a.p192x;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import okhttp3.HttpUrl;
import p174e.p181b.p182a.p195z.C5643d;

/* renamed from: e.b.a.x.g */
public class C5593g {

    /* renamed from: a */
    private final C5591e f15876a;

    public C5593g(C5591e eVar) {
        this.f15876a = eVar;
    }

    /* renamed from: b */
    private static String m20866b(String str, C5589c cVar, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("lottie_cache_");
        sb.append(str.replaceAll("\\W+", HttpUrl.FRAGMENT_ENCODE_SET));
        sb.append(z ? cVar.mo16847e() : cVar.f15875q);
        return sb.toString();
    }

    /* renamed from: c */
    private File m20867c(String str) {
        File file = new File(m20868d(), m20866b(str, C5589c.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(m20868d(), m20866b(str, C5589c.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    /* renamed from: d */
    private File m20868d() {
        File a = this.f15876a.mo16378a();
        if (a.isFile()) {
            a.delete();
        }
        if (!a.exists()) {
            a.mkdirs();
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair<p174e.p181b.p182a.p192x.C5589c, java.io.InputStream> mo16849a(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            java.io.File r1 = r5.m20867c(r6)     // Catch:{ FileNotFoundException -> 0x0044 }
            if (r1 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{  }
            r2.<init>(r1)     // Catch:{  }
            java.lang.String r0 = r1.getAbsolutePath()
            java.lang.String r3 = ".zip"
            boolean r0 = r0.endsWith(r3)
            if (r0 == 0) goto L_0x001c
            e.b.a.x.c r0 = p174e.p181b.p182a.p192x.C5589c.ZIP
            goto L_0x001e
        L_0x001c:
            e.b.a.x.c r0 = p174e.p181b.p182a.p192x.C5589c.JSON
        L_0x001e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cache hit for "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r6 = " at "
            r3.append(r6)
            java.lang.String r6 = r1.getAbsolutePath()
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            p174e.p181b.p182a.p195z.C5643d.m21025a(r6)
            android.util.Pair r6 = new android.util.Pair
            r6.<init>(r0, r2)
            return r6
        L_0x0044:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p181b.p182a.p192x.C5593g.mo16849a(java.lang.String):android.util.Pair");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo16850e(String str, C5589c cVar) {
        File file = new File(m20868d(), m20866b(str, cVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", HttpUrl.FRAGMENT_ENCODE_SET));
        boolean renameTo = file.renameTo(file2);
        C5643d.m21025a("Copying temp file to real file (" + file2 + ")");
        if (!renameTo) {
            C5643d.m21027c("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public File mo16851f(String str, InputStream inputStream, C5589c cVar) {
        FileOutputStream fileOutputStream;
        File file = new File(m20868d(), m20866b(str, cVar, true));
        try {
            fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    return file;
                }
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }
}
