package androidx.core.app;

import android.app.Person;
import androidx.core.graphics.drawable.IconCompat;
import okhttp3.HttpUrl;

/* renamed from: androidx.core.app.m */
public class C1128m {

    /* renamed from: a */
    CharSequence f3183a;

    /* renamed from: b */
    IconCompat f3184b;

    /* renamed from: c */
    String f3185c;

    /* renamed from: d */
    String f3186d;

    /* renamed from: e */
    boolean f3187e;

    /* renamed from: f */
    boolean f3188f;

    /* renamed from: a */
    public IconCompat mo3596a() {
        return this.f3184b;
    }

    /* renamed from: b */
    public String mo3597b() {
        return this.f3186d;
    }

    /* renamed from: c */
    public CharSequence mo3598c() {
        return this.f3183a;
    }

    /* renamed from: d */
    public String mo3599d() {
        return this.f3185c;
    }

    /* renamed from: e */
    public boolean mo3600e() {
        return this.f3187e;
    }

    /* renamed from: f */
    public boolean mo3601f() {
        return this.f3188f;
    }

    /* renamed from: g */
    public String mo3602g() {
        String str = this.f3185c;
        if (str != null) {
            return str;
        }
        if (this.f3183a == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return "name:" + this.f3183a;
    }

    /* renamed from: h */
    public Person mo3603h() {
        return new Person.Builder().setName(mo3598c()).setIcon(mo3596a() != null ? mo3596a().mo3652n() : null).setUri(mo3599d()).setKey(mo3597b()).setBot(mo3600e()).setImportant(mo3601f()).build();
    }
}
