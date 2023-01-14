package p174e.p319f.p320a.p363d.p364a0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p174e.p319f.p320a.p363d.C9024k;

/* renamed from: e.f.a.d.a0.k */
public class C8997k {

    /* renamed from: a */
    public static final C8986c f24461a = new C8995i(0.5f);

    /* renamed from: b */
    C8987d f24462b;

    /* renamed from: c */
    C8987d f24463c;

    /* renamed from: d */
    C8987d f24464d;

    /* renamed from: e */
    C8987d f24465e;

    /* renamed from: f */
    C8986c f24466f;

    /* renamed from: g */
    C8986c f24467g;

    /* renamed from: h */
    C8986c f24468h;

    /* renamed from: i */
    C8986c f24469i;

    /* renamed from: j */
    C8989f f24470j;

    /* renamed from: k */
    C8989f f24471k;

    /* renamed from: l */
    C8989f f24472l;

    /* renamed from: m */
    C8989f f24473m;

    /* renamed from: e.f.a.d.a0.k$b */
    public static final class C8999b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C8987d f24474a = C8994h.m29987b();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C8987d f24475b = C8994h.m29987b();
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C8987d f24476c = C8994h.m29987b();
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C8987d f24477d = C8994h.m29987b();
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C8986c f24478e = new C8984a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C8986c f24479f = new C8984a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: g */
        public C8986c f24480g = new C8984a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: h */
        public C8986c f24481h = new C8984a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C8989f f24482i = C8994h.m29988c();
        /* access modifiers changed from: private */

        /* renamed from: j */
        public C8989f f24483j = C8994h.m29988c();
        /* access modifiers changed from: private */

        /* renamed from: k */
        public C8989f f24484k = C8994h.m29988c();
        /* access modifiers changed from: private */

        /* renamed from: l */
        public C8989f f24485l = C8994h.m29988c();

        public C8999b() {
        }

        public C8999b(C8997k kVar) {
            this.f24474a = kVar.f24462b;
            this.f24475b = kVar.f24463c;
            this.f24476c = kVar.f24464d;
            this.f24477d = kVar.f24465e;
            this.f24478e = kVar.f24466f;
            this.f24479f = kVar.f24467g;
            this.f24480g = kVar.f24468h;
            this.f24481h = kVar.f24469i;
            this.f24482i = kVar.f24470j;
            this.f24483j = kVar.f24471k;
            this.f24484k = kVar.f24472l;
            this.f24485l = kVar.f24473m;
        }

        /* renamed from: n */
        private static float m30030n(C8987d dVar) {
            if (dVar instanceof C8996j) {
                return ((C8996j) dVar).f24460a;
            }
            if (dVar instanceof C8988e) {
                return ((C8988e) dVar).f24411a;
            }
            return -1.0f;
        }

        /* renamed from: A */
        public C8999b mo22867A(C8986c cVar) {
            this.f24478e = cVar;
            return this;
        }

        /* renamed from: B */
        public C8999b mo22868B(int i, C8986c cVar) {
            return mo22869C(C8994h.m29986a(i)).mo22871E(cVar);
        }

        /* renamed from: C */
        public C8999b mo22869C(C8987d dVar) {
            this.f24475b = dVar;
            float n = m30030n(dVar);
            if (n != -1.0f) {
                mo22870D(n);
            }
            return this;
        }

        /* renamed from: D */
        public C8999b mo22870D(float f) {
            this.f24479f = new C8984a(f);
            return this;
        }

        /* renamed from: E */
        public C8999b mo22871E(C8986c cVar) {
            this.f24479f = cVar;
            return this;
        }

        /* renamed from: m */
        public C8997k mo22872m() {
            return new C8997k(this);
        }

        /* renamed from: o */
        public C8999b mo22873o(float f) {
            return mo22884z(f).mo22870D(f).mo22880v(f).mo22876r(f);
        }

        /* renamed from: p */
        public C8999b mo22874p(int i, C8986c cVar) {
            return mo22875q(C8994h.m29986a(i)).mo22877s(cVar);
        }

        /* renamed from: q */
        public C8999b mo22875q(C8987d dVar) {
            this.f24477d = dVar;
            float n = m30030n(dVar);
            if (n != -1.0f) {
                mo22876r(n);
            }
            return this;
        }

        /* renamed from: r */
        public C8999b mo22876r(float f) {
            this.f24481h = new C8984a(f);
            return this;
        }

        /* renamed from: s */
        public C8999b mo22877s(C8986c cVar) {
            this.f24481h = cVar;
            return this;
        }

        /* renamed from: t */
        public C8999b mo22878t(int i, C8986c cVar) {
            return mo22879u(C8994h.m29986a(i)).mo22881w(cVar);
        }

        /* renamed from: u */
        public C8999b mo22879u(C8987d dVar) {
            this.f24476c = dVar;
            float n = m30030n(dVar);
            if (n != -1.0f) {
                mo22880v(n);
            }
            return this;
        }

        /* renamed from: v */
        public C8999b mo22880v(float f) {
            this.f24480g = new C8984a(f);
            return this;
        }

        /* renamed from: w */
        public C8999b mo22881w(C8986c cVar) {
            this.f24480g = cVar;
            return this;
        }

        /* renamed from: x */
        public C8999b mo22882x(int i, C8986c cVar) {
            return mo22883y(C8994h.m29986a(i)).mo22867A(cVar);
        }

        /* renamed from: y */
        public C8999b mo22883y(C8987d dVar) {
            this.f24474a = dVar;
            float n = m30030n(dVar);
            if (n != -1.0f) {
                mo22884z(n);
            }
            return this;
        }

        /* renamed from: z */
        public C8999b mo22884z(float f) {
            this.f24478e = new C8984a(f);
            return this;
        }
    }

    /* renamed from: e.f.a.d.a0.k$c */
    public interface C9000c {
        /* renamed from: a */
        C8986c mo22846a(C8986c cVar);
    }

    public C8997k() {
        this.f24462b = C8994h.m29987b();
        this.f24463c = C8994h.m29987b();
        this.f24464d = C8994h.m29987b();
        this.f24465e = C8994h.m29987b();
        this.f24466f = new C8984a(0.0f);
        this.f24467g = new C8984a(0.0f);
        this.f24468h = new C8984a(0.0f);
        this.f24469i = new C8984a(0.0f);
        this.f24470j = C8994h.m29988c();
        this.f24471k = C8994h.m29988c();
        this.f24472l = C8994h.m29988c();
        this.f24473m = C8994h.m29988c();
    }

    private C8997k(C8999b bVar) {
        this.f24462b = bVar.f24474a;
        this.f24463c = bVar.f24475b;
        this.f24464d = bVar.f24476c;
        this.f24465e = bVar.f24477d;
        this.f24466f = bVar.f24478e;
        this.f24467g = bVar.f24479f;
        this.f24468h = bVar.f24480g;
        this.f24469i = bVar.f24481h;
        this.f24470j = bVar.f24482i;
        this.f24471k = bVar.f24483j;
        this.f24472l = bVar.f24484k;
        this.f24473m = bVar.f24485l;
    }

    /* renamed from: a */
    public static C8999b m29994a() {
        return new C8999b();
    }

    /* renamed from: b */
    public static C8999b m29995b(Context context, int i, int i2) {
        return m29996c(context, i, i2, 0);
    }

    /* renamed from: c */
    private static C8999b m29996c(Context context, int i, int i2, int i3) {
        return m29997d(context, i, i2, new C8984a((float) i3));
    }

    /* renamed from: d */
    private static C8999b m29997d(Context context, int i, int i2, C8986c cVar) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C9024k.f24571H2);
        try {
            int i3 = obtainStyledAttributes.getInt(C9024k.f24576I2, 0);
            int i4 = obtainStyledAttributes.getInt(C9024k.f24591L2, i3);
            int i5 = obtainStyledAttributes.getInt(C9024k.f24596M2, i3);
            int i6 = obtainStyledAttributes.getInt(C9024k.f24586K2, i3);
            int i7 = obtainStyledAttributes.getInt(C9024k.f24581J2, i3);
            C8986c m = m30001m(obtainStyledAttributes, C9024k.f24601N2, cVar);
            C8986c m2 = m30001m(obtainStyledAttributes, C9024k.f24616Q2, m);
            C8986c m3 = m30001m(obtainStyledAttributes, C9024k.f24621R2, m);
            C8986c m4 = m30001m(obtainStyledAttributes, C9024k.f24611P2, m);
            return new C8999b().mo22882x(i4, m2).mo22868B(i5, m3).mo22878t(i6, m4).mo22874p(i7, m30001m(obtainStyledAttributes, C9024k.f24606O2, m));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: e */
    public static C8999b m29998e(Context context, AttributeSet attributeSet, int i, int i2) {
        return m29999f(context, attributeSet, i, i2, 0);
    }

    /* renamed from: f */
    public static C8999b m29999f(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        return m30000g(context, attributeSet, i, i2, new C8984a((float) i3));
    }

    /* renamed from: g */
    public static C8999b m30000g(Context context, AttributeSet attributeSet, int i, int i2, C8986c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9024k.f24732l2, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C9024k.f24738m2, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(C9024k.f24744n2, 0);
        obtainStyledAttributes.recycle();
        return m29997d(context, resourceId, resourceId2, cVar);
    }

    /* renamed from: m */
    private static C8986c m30001m(TypedArray typedArray, int i, C8986c cVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return cVar;
        }
        int i2 = peekValue.type;
        return i2 == 5 ? new C8984a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new C8995i(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    /* renamed from: h */
    public C8989f mo22851h() {
        return this.f24472l;
    }

    /* renamed from: i */
    public C8987d mo22852i() {
        return this.f24465e;
    }

    /* renamed from: j */
    public C8986c mo22853j() {
        return this.f24469i;
    }

    /* renamed from: k */
    public C8987d mo22854k() {
        return this.f24464d;
    }

    /* renamed from: l */
    public C8986c mo22855l() {
        return this.f24468h;
    }

    /* renamed from: n */
    public C8989f mo22856n() {
        return this.f24473m;
    }

    /* renamed from: o */
    public C8989f mo22857o() {
        return this.f24471k;
    }

    /* renamed from: p */
    public C8989f mo22858p() {
        return this.f24470j;
    }

    /* renamed from: q */
    public C8987d mo22859q() {
        return this.f24462b;
    }

    /* renamed from: r */
    public C8986c mo22860r() {
        return this.f24466f;
    }

    /* renamed from: s */
    public C8987d mo22861s() {
        return this.f24463c;
    }

    /* renamed from: t */
    public C8986c mo22862t() {
        return this.f24467g;
    }

    /* renamed from: u */
    public boolean mo22863u(RectF rectF) {
        Class<C8989f> cls = C8989f.class;
        boolean z = this.f24473m.getClass().equals(cls) && this.f24471k.getClass().equals(cls) && this.f24470j.getClass().equals(cls) && this.f24472l.getClass().equals(cls);
        float a = this.f24466f.mo22801a(rectF);
        return z && ((this.f24467g.mo22801a(rectF) > a ? 1 : (this.f24467g.mo22801a(rectF) == a ? 0 : -1)) == 0 && (this.f24469i.mo22801a(rectF) > a ? 1 : (this.f24469i.mo22801a(rectF) == a ? 0 : -1)) == 0 && (this.f24468h.mo22801a(rectF) > a ? 1 : (this.f24468h.mo22801a(rectF) == a ? 0 : -1)) == 0) && ((this.f24463c instanceof C8996j) && (this.f24462b instanceof C8996j) && (this.f24464d instanceof C8996j) && (this.f24465e instanceof C8996j));
    }

    /* renamed from: v */
    public C8999b mo22864v() {
        return new C8999b(this);
    }

    /* renamed from: w */
    public C8997k mo22865w(float f) {
        return mo22864v().mo22873o(f).mo22872m();
    }

    /* renamed from: x */
    public C8997k mo22866x(C9000c cVar) {
        return mo22864v().mo22867A(cVar.mo22846a(mo22860r())).mo22871E(cVar.mo22846a(mo22862t())).mo22877s(cVar.mo22846a(mo22853j())).mo22881w(cVar.mo22846a(mo22855l())).mo22872m();
    }
}
