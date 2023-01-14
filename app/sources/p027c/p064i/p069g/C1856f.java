package p027c.p064i.p069g;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* renamed from: c.i.g.f */
public final class C1856f {

    /* renamed from: a */
    private static final C1856f f5490a = m7871a(new Locale[0]);

    /* renamed from: b */
    private C1858h f5491b;

    private C1856f(C1858h hVar) {
        this.f5491b = hVar;
    }

    /* renamed from: a */
    public static C1856f m7871a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? m7873e(new LocaleList(localeArr)) : new C1856f(new C1857g(localeArr));
    }

    /* renamed from: b */
    static Locale m7872b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (!str.contains("_")) {
            return new Locale(str);
        } else {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    /* renamed from: e */
    public static C1856f m7873e(LocaleList localeList) {
        return new C1856f(new C1859i(localeList));
    }

    /* renamed from: c */
    public Locale mo6353c(int i) {
        return this.f5491b.get(i);
    }

    /* renamed from: d */
    public int mo6354d() {
        return this.f5491b.size();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1856f) && this.f5491b.equals(((C1856f) obj).f5491b);
    }

    public int hashCode() {
        return this.f5491b.hashCode();
    }

    public String toString() {
        return this.f5491b.toString();
    }
}
