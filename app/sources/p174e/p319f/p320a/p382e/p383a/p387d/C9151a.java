package p174e.p319f.p320a.p382e.p383a.p387d;

import android.content.Context;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import okhttp3.HttpUrl;

/* renamed from: e.f.a.e.a.d.a */
public final class C9151a {
    /* renamed from: a */
    public static String m30445a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(bArr);
            return Base64.encodeToString(instance.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    /* renamed from: b */
    public static Context m30446b(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }
}
