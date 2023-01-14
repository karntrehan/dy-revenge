package p174e.p247e.p274h.p285f;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p258e.C6071a;
import p174e.p247e.p274h.p284e.C6188c;
import p174e.p247e.p274h.p284e.C6193g;
import p174e.p247e.p274h.p284e.C6196j;
import p174e.p247e.p274h.p284e.C6197k;
import p174e.p247e.p274h.p284e.C6198l;
import p174e.p247e.p274h.p284e.C6199m;
import p174e.p247e.p274h.p284e.C6203o;
import p174e.p247e.p274h.p284e.C6204p;
import p174e.p247e.p274h.p284e.C6205q;
import p174e.p247e.p274h.p285f.C6227d;
import p174e.p247e.p294k.p312p.C6394b;

/* renamed from: e.e.h.f.e */
public class C6229e {

    /* renamed from: a */
    private static final Drawable f17262a = new ColorDrawable(0);

    /* renamed from: a */
    private static Drawable m23607a(Drawable drawable, C6227d dVar, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            C6197k kVar = new C6197k(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint());
            m23608b(kVar, dVar);
            return kVar;
        } else if (drawable instanceof NinePatchDrawable) {
            C6203o oVar = new C6203o((NinePatchDrawable) drawable);
            m23608b(oVar, dVar);
            return oVar;
        } else if (!(drawable instanceof ColorDrawable) || Build.VERSION.SDK_INT < 11) {
            C6071a.m22861I("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        } else {
            C6198l a = C6198l.m23473a((ColorDrawable) drawable);
            m23608b(a, dVar);
            return a;
        }
    }

    /* renamed from: b */
    static void m23608b(C6196j jVar, C6227d dVar) {
        jVar.mo18403d(dVar.mo18503i());
        jVar.mo18408s(dVar.mo18497d());
        jVar.mo18402b(dVar.mo18495b(), dVar.mo18496c());
        jVar.mo18406m(dVar.mo18500g());
        jVar.mo18405i(dVar.mo18505k());
        jVar.mo18404g(dVar.mo18501h());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static p174e.p247e.p274h.p284e.C6188c m23609c(p174e.p247e.p274h.p284e.C6188c r2) {
        /*
        L_0x0000:
            android.graphics.drawable.Drawable r0 = r2.mo18363r()
            if (r0 == r2) goto L_0x000f
            boolean r1 = r0 instanceof p174e.p247e.p274h.p284e.C6188c
            if (r1 != 0) goto L_0x000b
            goto L_0x000f
        L_0x000b:
            r2 = r0
            e.e.h.e.c r2 = (p174e.p247e.p274h.p284e.C6188c) r2
            goto L_0x0000
        L_0x000f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p247e.p274h.p285f.C6229e.m23609c(e.e.h.e.c):e.e.h.e.c");
    }

    /* renamed from: d */
    static Drawable m23610d(Drawable drawable, C6227d dVar, Resources resources) {
        try {
            if (C6394b.m24481d()) {
                C6394b.m24478a("WrappingUtils#maybeApplyLeafRounding");
            }
            if (!(drawable == null || dVar == null)) {
                if (dVar.mo18504j() == C6227d.C6228a.BITMAP_ONLY) {
                    if (drawable instanceof C6193g) {
                        C6188c c = m23609c((C6193g) drawable);
                        c.mo18362k(m23607a(c.mo18362k(f17262a), dVar, resources));
                        if (C6394b.m24481d()) {
                            C6394b.m24479b();
                        }
                        return drawable;
                    }
                    Drawable a = m23607a(drawable, dVar, resources);
                    if (C6394b.m24481d()) {
                        C6394b.m24479b();
                    }
                    return a;
                }
            }
            return drawable;
        } finally {
            if (C6394b.m24481d()) {
                C6394b.m24479b();
            }
        }
    }

    /* renamed from: e */
    static Drawable m23611e(Drawable drawable, C6227d dVar) {
        try {
            if (C6394b.m24481d()) {
                C6394b.m24478a("WrappingUtils#maybeWrapWithRoundedOverlayColor");
            }
            if (!(drawable == null || dVar == null)) {
                if (dVar.mo18504j() == C6227d.C6228a.OVERLAY_COLOR) {
                    C6199m mVar = new C6199m(drawable);
                    m23608b(mVar, dVar);
                    mVar.mo18422x(dVar.mo18499f());
                    if (C6394b.m24481d()) {
                        C6394b.m24479b();
                    }
                    return mVar;
                }
            }
            return drawable;
        } finally {
            if (C6394b.m24481d()) {
                C6394b.m24479b();
            }
        }
    }

    /* renamed from: f */
    static Drawable m23612f(Drawable drawable, C6205q.C6207b bVar) {
        return m23613g(drawable, bVar, (PointF) null);
    }

    /* renamed from: g */
    static Drawable m23613g(Drawable drawable, C6205q.C6207b bVar, PointF pointF) {
        if (C6394b.m24481d()) {
            C6394b.m24478a("WrappingUtils#maybeWrapWithScaleType");
        }
        if (drawable == null || bVar == null) {
            if (C6394b.m24481d()) {
                C6394b.m24479b();
            }
            return drawable;
        }
        C6204p pVar = new C6204p(drawable, bVar);
        if (pointF != null) {
            pVar.mo18434A(pointF);
        }
        if (C6394b.m24481d()) {
            C6394b.m24479b();
        }
        return pVar;
    }

    /* renamed from: h */
    static void m23614h(C6196j jVar) {
        jVar.mo18403d(false);
        jVar.mo18407p(0.0f);
        jVar.mo18402b(0, 0.0f);
        jVar.mo18406m(0.0f);
        jVar.mo18405i(false);
        jVar.mo18404g(false);
    }

    /* renamed from: i */
    static void m23615i(C6188c cVar, C6227d dVar, Resources resources) {
        C6188c c = m23609c(cVar);
        Drawable r = c.mo18363r();
        if (dVar == null || dVar.mo18504j() != C6227d.C6228a.BITMAP_ONLY) {
            if (r instanceof C6196j) {
                m23614h((C6196j) r);
            }
        } else if (r instanceof C6196j) {
            m23608b((C6196j) r, dVar);
        } else if (r != null) {
            c.mo18362k(f17262a);
            c.mo18362k(m23607a(r, dVar, resources));
        }
    }

    /* renamed from: j */
    static void m23616j(C6188c cVar, C6227d dVar) {
        Drawable r = cVar.mo18363r();
        if (dVar == null || dVar.mo18504j() != C6227d.C6228a.OVERLAY_COLOR) {
            if (r instanceof C6199m) {
                Drawable drawable = f17262a;
                cVar.mo18362k(((C6199m) r).mo18399u(drawable));
                drawable.setCallback((Drawable.Callback) null);
            }
        } else if (r instanceof C6199m) {
            C6199m mVar = (C6199m) r;
            m23608b(mVar, dVar);
            mVar.mo18422x(dVar.mo18499f());
        } else {
            cVar.mo18362k(m23611e(cVar.mo18362k(f17262a), dVar));
        }
    }

    /* renamed from: k */
    static C6204p m23617k(C6188c cVar, C6205q.C6207b bVar) {
        Drawable f = m23612f(cVar.mo18362k(f17262a), bVar);
        cVar.mo18362k(f);
        C6062k.m22840h(f, "Parent has no child drawable!");
        return (C6204p) f;
    }
}
