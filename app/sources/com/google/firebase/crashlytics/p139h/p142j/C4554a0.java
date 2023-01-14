package com.google.firebase.crashlytics.p139h.p142j;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.firebase.crashlytics.p139h.C4542f;
import com.google.firebase.installations.C4839f;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;

/* renamed from: com.google.firebase.crashlytics.h.j.a0 */
public class C4554a0 implements C4556b0 {

    /* renamed from: a */
    private static final Pattern f12888a = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: b */
    private static final String f12889b = Pattern.quote("/");

    /* renamed from: c */
    private final C4558c0 f12890c;

    /* renamed from: d */
    private final Context f12891d;

    /* renamed from: e */
    private final String f12892e;

    /* renamed from: f */
    private final C4839f f12893f;

    /* renamed from: g */
    private final C4607w f12894g;

    /* renamed from: h */
    private String f12895h;

    public C4554a0(Context context, String str, C4839f fVar, C4607w wVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        } else if (str != null) {
            this.f12891d = context;
            this.f12892e = str;
            this.f12893f = fVar;
            this.f12894g = wVar;
            this.f12890c = new C4558c0();
        } else {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
    }

    /* renamed from: b */
    private synchronized String m17288b(String str, SharedPreferences sharedPreferences) {
        String e;
        e = m17291e(UUID.randomUUID().toString());
        C4542f f = C4542f.m17259f();
        f.mo14110i("Created new Crashlytics installation ID: " + e + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", e).putString("firebase.installation.id", str).apply();
        return e;
    }

    /* renamed from: c */
    static String m17289c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    /* renamed from: d */
    private String m17290d() {
        try {
            return (String) C4570i0.m17344a(this.f12893f.mo14749a());
        } catch (Exception e) {
            C4542f.m17259f().mo14113l("Failed to retrieve Firebase Installations ID.", e);
            return null;
        }
    }

    /* renamed from: e */
    private static String m17291e(String str) {
        if (str == null) {
            return null;
        }
        return f12888a.matcher(str).replaceAll(HttpUrl.FRAGMENT_ENCODE_SET).toLowerCase(Locale.US);
    }

    /* renamed from: k */
    static boolean m17292k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    /* renamed from: l */
    private String m17293l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", (String) null);
    }

    /* renamed from: m */
    private String m17294m(String str) {
        return str.replaceAll(f12889b, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* renamed from: a */
    public synchronized String mo14117a() {
        String l;
        String str = this.f12895h;
        if (str != null) {
            return str;
        }
        C4542f.m17259f().mo14110i("Determining Crashlytics installation ID...");
        SharedPreferences r = C4577n.m17389r(this.f12891d);
        String string = r.getString("firebase.installation.id", (String) null);
        C4542f f = C4542f.m17259f();
        f.mo14110i("Cached Firebase Installation ID: " + string);
        if (this.f12894g.mo14229d()) {
            String d = m17290d();
            C4542f f2 = C4542f.m17259f();
            f2.mo14110i("Fetched Firebase Installation ID: " + d);
            if (d == null) {
                d = string == null ? m17289c() : string;
            }
            l = d.equals(string) ? m17293l(r) : m17288b(d, r);
        } else {
            l = m17292k(string) ? m17293l(r) : m17288b(m17289c(), r);
        }
        this.f12895h = l;
        if (this.f12895h == null) {
            C4542f.m17259f().mo14112k("Unable to determine Crashlytics Install Id, creating a new one.");
            this.f12895h = m17288b(m17289c(), r);
        }
        C4542f f3 = C4542f.m17259f();
        f3.mo14110i("Crashlytics installation ID: " + this.f12895h);
        return this.f12895h;
    }

    /* renamed from: f */
    public String mo14118f() {
        return this.f12892e;
    }

    /* renamed from: g */
    public String mo14119g() {
        return this.f12890c.mo14123a(this.f12891d);
    }

    /* renamed from: h */
    public String mo14120h() {
        return String.format(Locale.US, "%s/%s", new Object[]{m17294m(Build.MANUFACTURER), m17294m(Build.MODEL)});
    }

    /* renamed from: i */
    public String mo14121i() {
        return m17294m(Build.VERSION.INCREMENTAL);
    }

    /* renamed from: j */
    public String mo14122j() {
        return m17294m(Build.VERSION.RELEASE);
    }
}
