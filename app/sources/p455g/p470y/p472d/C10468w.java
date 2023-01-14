package p455g.p470y.p472d;

import okhttp3.HttpUrl;
import p455g.p457b0.C10251c;
import p455g.p457b0.C10252d;
import p455g.p457b0.C10253e;
import p455g.p457b0.C10255g;

/* renamed from: g.y.d.w */
public class C10468w {

    /* renamed from: a */
    private static final C10469x f27626a;

    /* renamed from: b */
    private static final C10251c[] f27627b = new C10251c[0];

    static {
        C10469x xVar = null;
        try {
            xVar = (C10469x) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (xVar == null) {
            xVar = new C10469x();
        }
        f27626a = xVar;
    }

    /* renamed from: a */
    public static C10253e m35334a(C10454i iVar) {
        return f27626a.mo25837a(iVar);
    }

    /* renamed from: b */
    public static C10251c m35335b(Class cls) {
        return f27626a.mo25838b(cls);
    }

    /* renamed from: c */
    public static C10252d m35336c(Class cls) {
        return f27626a.mo25839c(cls, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* renamed from: d */
    public static C10255g m35337d(C10459n nVar) {
        return f27626a.mo25840d(nVar);
    }

    /* renamed from: e */
    public static String m35338e(C10453h hVar) {
        return f27626a.mo25841e(hVar);
    }

    /* renamed from: f */
    public static String m35339f(C10458m mVar) {
        return f27626a.mo25842f(mVar);
    }
}
