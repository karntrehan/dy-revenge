package p027c.p064i.p069g;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import okhttp3.HttpUrl;

/* renamed from: c.i.g.g */
final class C1857g implements C1858h {

    /* renamed from: a */
    private static final Locale[] f5492a = new Locale[0];

    /* renamed from: b */
    private static final Locale f5493b = new Locale("en", "XA");

    /* renamed from: c */
    private static final Locale f5494c = new Locale("ar", "XB");

    /* renamed from: d */
    private static final Locale f5495d = C1856f.m7872b("en-Latn");

    /* renamed from: e */
    private final Locale[] f5496e;

    /* renamed from: f */
    private final String f5497f;

    C1857g(Locale... localeArr) {
        String sb;
        if (localeArr.length == 0) {
            this.f5496e = f5492a;
            sb = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            StringBuilder sb2 = new StringBuilder();
            int i = 0;
            while (i < localeArr.length) {
                Locale locale = localeArr[i];
                if (locale != null) {
                    if (!hashSet.contains(locale)) {
                        Locale locale2 = (Locale) locale.clone();
                        arrayList.add(locale2);
                        m7876b(sb2, locale2);
                        if (i < localeArr.length - 1) {
                            sb2.append(',');
                        }
                        hashSet.add(locale2);
                    }
                    i++;
                } else {
                    throw new NullPointerException("list[" + i + "] is null");
                }
            }
            this.f5496e = (Locale[]) arrayList.toArray(new Locale[arrayList.size()]);
            sb = sb2.toString();
        }
        this.f5497f = sb;
    }

    /* renamed from: b */
    static void m7876b(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb.append('-');
            sb.append(locale.getCountry());
        }
    }

    /* renamed from: a */
    public Object mo6358a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1857g)) {
            return false;
        }
        Locale[] localeArr = ((C1857g) obj).f5496e;
        if (this.f5496e.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.f5496e;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    public Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.f5496e;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    public int hashCode() {
        int i = 1;
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.f5496e;
            if (i2 >= localeArr.length) {
                return i;
            }
            i = (i * 31) + localeArr[i2].hashCode();
            i2++;
        }
    }

    public int size() {
        return this.f5496e.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f5496e;
            if (i < localeArr.length) {
                sb.append(localeArr[i]);
                if (i < this.f5496e.length - 1) {
                    sb.append(',');
                }
                i++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
