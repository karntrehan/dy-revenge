package androidx.camera.extensions.p017f;

import android.text.TextUtils;
import java.math.BigInteger;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;

/* renamed from: androidx.camera.extensions.f.o */
public abstract class C1051o implements Comparable<C1051o> {

    /* renamed from: f */
    public static final C1051o f2941f = m4062g(1, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET);

    /* renamed from: o */
    public static final C1051o f2942o = m4062g(1, 1, 0, HttpUrl.FRAGMENT_ENCODE_SET);

    /* renamed from: p */
    public static final C1051o f2943p = m4062g(1, 2, 0, HttpUrl.FRAGMENT_ENCODE_SET);

    /* renamed from: q */
    private static final Pattern f2944q = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:\\-(.+))?");

    C1051o() {
    }

    /* renamed from: D */
    public static C1051o m4061D(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = f2944q.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        return m4062g(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(3)), matcher.group(4) != null ? matcher.group(4) : HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* renamed from: g */
    public static C1051o m4062g(int i, int i2, int i3, String str) {
        return new C1034f(i, i2, i3, str);
    }

    /* renamed from: h */
    private static BigInteger m4063h(C1051o oVar) {
        return BigInteger.valueOf((long) oVar.mo3329z()).shiftLeft(32).or(BigInteger.valueOf((long) oVar.mo3326A())).shiftLeft(32).or(BigInteger.valueOf((long) oVar.mo3327B()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public abstract int mo3326A();

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public abstract int mo3327B();

    /* renamed from: e */
    public int compareTo(C1051o oVar) {
        return m4063h(this).compareTo(m4063h(oVar));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1051o)) {
            return false;
        }
        C1051o oVar = (C1051o) obj;
        return Objects.equals(Integer.valueOf(mo3329z()), Integer.valueOf(oVar.mo3329z())) && Objects.equals(Integer.valueOf(mo3326A()), Integer.valueOf(oVar.mo3326A())) && Objects.equals(Integer.valueOf(mo3327B()), Integer.valueOf(oVar.mo3327B()));
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(mo3329z()), Integer.valueOf(mo3326A()), Integer.valueOf(mo3327B())});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(mo3329z() + "." + mo3326A() + "." + mo3327B());
        if (!TextUtils.isEmpty(mo3328v())) {
            sb.append("-" + mo3328v());
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public abstract String mo3328v();

    /* renamed from: z */
    public abstract int mo3329z();
}
