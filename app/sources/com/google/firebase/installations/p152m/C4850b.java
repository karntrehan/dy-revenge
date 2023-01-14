package com.google.firebase.installations.p152m;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.C4825h;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.installations.m.b */
public class C4850b {

    /* renamed from: a */
    private static final String[] f13648a = {"*", "FCM", "GCM", HttpUrl.FRAGMENT_ENCODE_SET};

    /* renamed from: b */
    private final SharedPreferences f13649b;

    /* renamed from: c */
    private final String f13650c;

    public C4850b(C4825h hVar) {
        this.f13649b = hVar.mo14733j().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f13650c = m18530b(hVar);
    }

    /* renamed from: a */
    private String m18529a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    /* renamed from: b */
    private static String m18530b(C4825h hVar) {
        String f = hVar.mo14735o().mo14832f();
        if (f != null) {
            return f;
        }
        String c = hVar.mo14735o().mo14828c();
        if (!c.startsWith("1:") && !c.startsWith("2:")) {
            return c;
        }
        String[] split = c.split(":");
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: c */
    private static String m18531c(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* renamed from: d */
    private String m18532d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    private PublicKey m18533e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            Log.w("ContentValues", "Invalid key stored " + e);
            return null;
        }
    }

    /* renamed from: g */
    private String m18534g() {
        String string;
        synchronized (this.f13649b) {
            string = this.f13649b.getString("|S|id", (String) null);
        }
        return string;
    }

    /* renamed from: h */
    private String m18535h() {
        synchronized (this.f13649b) {
            String string = this.f13649b.getString("|S||P|", (String) null);
            if (string == null) {
                return null;
            }
            PublicKey e = m18533e(string);
            if (e == null) {
                return null;
            }
            String c = m18531c(e);
            return c;
        }
    }

    /* renamed from: f */
    public String mo14783f() {
        synchronized (this.f13649b) {
            String g = m18534g();
            if (g != null) {
                return g;
            }
            String h = m18535h();
            return h;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        return r4;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo14784i() {
        /*
            r7 = this;
            android.content.SharedPreferences r0 = r7.f13649b
            monitor-enter(r0)
            java.lang.String[] r1 = f13648a     // Catch:{ all -> 0x0033 }
            int r2 = r1.length     // Catch:{ all -> 0x0033 }
            r3 = 0
        L_0x0007:
            r4 = 0
            if (r3 >= r2) goto L_0x0031
            r5 = r1[r3]     // Catch:{ all -> 0x0033 }
            java.lang.String r6 = r7.f13650c     // Catch:{ all -> 0x0033 }
            java.lang.String r5 = r7.m18529a(r6, r5)     // Catch:{ all -> 0x0033 }
            android.content.SharedPreferences r6 = r7.f13649b     // Catch:{ all -> 0x0033 }
            java.lang.String r4 = r6.getString(r5, r4)     // Catch:{ all -> 0x0033 }
            if (r4 == 0) goto L_0x002e
            boolean r5 = r4.isEmpty()     // Catch:{ all -> 0x0033 }
            if (r5 != 0) goto L_0x002e
            java.lang.String r1 = "{"
            boolean r1 = r4.startsWith(r1)     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x002c
            java.lang.String r4 = r7.m18532d(r4)     // Catch:{ all -> 0x0033 }
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r4
        L_0x002e:
            int r3 = r3 + 1
            goto L_0x0007
        L_0x0031:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r4
        L_0x0033:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.p152m.C4850b.mo14784i():java.lang.String");
    }
}
