package p455g.p459d0;

import java.io.Serializable;
import java.util.regex.Pattern;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

/* renamed from: g.d0.f */
public final class C10286f implements Serializable {

    /* renamed from: f */
    public static final C10287a f27523f = new C10287a((C10452g) null);

    /* renamed from: o */
    private final Pattern f27524o;

    /* renamed from: g.d0.f$a */
    public static final class C10287a {
        private C10287a() {
        }

        public /* synthetic */ C10287a(C10452g gVar) {
            this();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10286f(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            p455g.p470y.p472d.C10457l.m35320e(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            p455g.p470y.p472d.C10457l.m35319d(r2, r0)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p455g.p459d0.C10286f.<init>(java.lang.String):void");
    }

    public C10286f(Pattern pattern) {
        C10457l.m35320e(pattern, "nativePattern");
        this.f27524o = pattern;
    }

    /* renamed from: a */
    public final boolean mo25595a(CharSequence charSequence) {
        C10457l.m35320e(charSequence, "input");
        return this.f27524o.matcher(charSequence).matches();
    }

    /* renamed from: b */
    public final String mo25596b(CharSequence charSequence, String str) {
        C10457l.m35320e(charSequence, "input");
        C10457l.m35320e(str, "replacement");
        String replaceAll = this.f27524o.matcher(charSequence).replaceAll(str);
        C10457l.m35319d(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    public String toString() {
        String pattern = this.f27524o.toString();
        C10457l.m35319d(pattern, "nativePattern.toString()");
        return pattern;
    }
}
