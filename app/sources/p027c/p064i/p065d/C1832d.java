package p027c.p064i.p065d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.p022d.C1146c;
import androidx.core.content.p022d.C1154f;
import p027c.p060f.C1794e;
import p027c.p064i.p070h.C1879f;

@SuppressLint({"NewApi"})
/* renamed from: c.i.d.d */
public class C1832d {

    /* renamed from: a */
    private static final C1839j f5463a;

    /* renamed from: b */
    private static final C1794e<String, Typeface> f5464b = new C1794e<>(16);

    /* renamed from: c.i.d.d$a */
    public static class C1833a extends C1879f.C1882c {

        /* renamed from: a */
        private C1154f.C1157c f5465a;

        public C1833a(C1154f.C1157c cVar) {
            this.f5465a = cVar;
        }

        /* renamed from: a */
        public void mo6327a(int i) {
            C1154f.C1157c cVar = this.f5465a;
            if (cVar != null) {
                cVar.mo1826d(i);
            }
        }

        /* renamed from: b */
        public void mo6328b(Typeface typeface) {
            C1154f.C1157c cVar = this.f5465a;
            if (cVar != null) {
                cVar.mo1827e(typeface);
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f5463a = i >= 29 ? new C1838i() : i >= 28 ? new C1837h() : i >= 26 ? new C1836g() : (i < 24 || !C1835f.m7799m()) ? i >= 21 ? new C1834e() : new C1839j() : new C1835f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r2 = m7786g(r2, r3, r4);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m7780a(android.content.Context r2, android.graphics.Typeface r3, int r4) {
        /*
            if (r2 == 0) goto L_0x0014
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 >= r1) goto L_0x000f
            android.graphics.Typeface r2 = m7786g(r2, r3, r4)
            if (r2 == 0) goto L_0x000f
            return r2
        L_0x000f:
            android.graphics.Typeface r2 = android.graphics.Typeface.create(r3, r4)
            return r2
        L_0x0014:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Context cannot be null"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p064i.p065d.C1832d.m7780a(android.content.Context, android.graphics.Typeface, int):android.graphics.Typeface");
    }

    /* renamed from: b */
    public static Typeface m7781b(Context context, CancellationSignal cancellationSignal, C1879f.C1881b[] bVarArr, int i) {
        return f5463a.mo6330c(context, cancellationSignal, bVarArr, i);
    }

    /* renamed from: c */
    public static Typeface m7782c(Context context, C1146c.C1147a aVar, Resources resources, int i, int i2, C1154f.C1157c cVar, Handler handler, boolean z) {
        Typeface typeface;
        C1146c.C1147a aVar2 = aVar;
        C1154f.C1157c cVar2 = cVar;
        Handler handler2 = handler;
        if (aVar2 instanceof C1146c.C1150d) {
            C1146c.C1150d dVar = (C1146c.C1150d) aVar2;
            Typeface h = m7787h(dVar.mo3637c());
            if (h != null) {
                if (cVar2 != null) {
                    cVar2.mo3642b(h, handler2);
                }
                return h;
            }
            typeface = C1879f.m7914a(context, dVar.mo3636b(), i2, !z ? cVar2 == null : dVar.mo3635a() == 0, z ? dVar.mo3638d() : -1, C1154f.C1157c.m4501c(handler), new C1833a(cVar2));
            Resources resources2 = resources;
            int i3 = i2;
        } else {
            Context context2 = context;
            Resources resources3 = resources;
            typeface = f5463a.mo6329b(context, (C1146c.C1148b) aVar2, resources, i2);
            if (cVar2 != null) {
                if (typeface != null) {
                    cVar2.mo3642b(typeface, handler2);
                } else {
                    cVar2.mo3641a(-3, handler2);
                }
            }
        }
        if (typeface != null) {
            f5464b.mo6178d(m7784e(resources, i, i2), typeface);
        }
        return typeface;
    }

    /* renamed from: d */
    public static Typeface m7783d(Context context, Resources resources, int i, String str, int i2) {
        Typeface e = f5463a.mo6332e(context, resources, i, str, i2);
        if (e != null) {
            f5464b.mo6178d(m7784e(resources, i, i2), e);
        }
        return e;
    }

    /* renamed from: e */
    private static String m7784e(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    /* renamed from: f */
    public static Typeface m7785f(Resources resources, int i, int i2) {
        return f5464b.mo6177c(m7784e(resources, i, i2));
    }

    /* renamed from: g */
    private static Typeface m7786g(Context context, Typeface typeface, int i) {
        C1839j jVar = f5463a;
        C1146c.C1148b i2 = jVar.mo6342i(typeface);
        if (i2 == null) {
            return null;
        }
        return jVar.mo6329b(context, i2, context.getResources(), i);
    }

    /* renamed from: h */
    private static Typeface m7787h(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
