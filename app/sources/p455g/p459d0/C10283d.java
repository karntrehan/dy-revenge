package p455g.p459d0;

import java.nio.charset.Charset;
import p455g.p470y.p472d.C10457l;

/* renamed from: g.d0.d */
public final class C10283d {

    /* renamed from: a */
    public static final C10283d f27504a = new C10283d();

    /* renamed from: b */
    public static final Charset f27505b;

    /* renamed from: c */
    public static final Charset f27506c;

    /* renamed from: d */
    public static final Charset f27507d;

    /* renamed from: e */
    public static final Charset f27508e;

    /* renamed from: f */
    public static final Charset f27509f;

    /* renamed from: g */
    public static final Charset f27510g;

    /* renamed from: h */
    private static Charset f27511h;

    /* renamed from: i */
    private static Charset f27512i;

    static {
        Charset forName = Charset.forName("UTF-8");
        C10457l.m35319d(forName, "forName(\"UTF-8\")");
        f27505b = forName;
        Charset forName2 = Charset.forName("UTF-16");
        C10457l.m35319d(forName2, "forName(\"UTF-16\")");
        f27506c = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        C10457l.m35319d(forName3, "forName(\"UTF-16BE\")");
        f27507d = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        C10457l.m35319d(forName4, "forName(\"UTF-16LE\")");
        f27508e = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        C10457l.m35319d(forName5, "forName(\"US-ASCII\")");
        f27509f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        C10457l.m35319d(forName6, "forName(\"ISO-8859-1\")");
        f27510g = forName6;
    }

    private C10283d() {
    }

    /* renamed from: a */
    public final Charset mo25589a() {
        Charset charset = f27512i;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32BE");
        C10457l.m35319d(forName, "forName(\"UTF-32BE\")");
        f27512i = forName;
        return forName;
    }

    /* renamed from: b */
    public final Charset mo25590b() {
        Charset charset = f27511h;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32LE");
        C10457l.m35319d(forName, "forName(\"UTF-32LE\")");
        f27511h = forName;
        return forName;
    }
}
