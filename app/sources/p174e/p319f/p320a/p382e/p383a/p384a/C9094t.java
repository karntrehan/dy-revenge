package p174e.p319f.p320a.p382e.p383a.p384a;

import android.content.Context;
import java.io.File;

/* renamed from: e.f.a.e.a.a.t */
final class C9094t {

    /* renamed from: a */
    private final Context f24960a;

    C9094t(Context context) {
        this.f24960a = context;
    }

    /* renamed from: b */
    private static long m30295b(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles != null) {
            for (File b : listFiles) {
                j += m30295b(b);
            }
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo23069a() {
        return m30295b(new File(this.f24960a.getFilesDir(), "assetpacks"));
    }
}
