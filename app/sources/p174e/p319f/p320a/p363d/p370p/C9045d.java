package p174e.p319f.p320a.p363d.p370p;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import p174e.p319f.p320a.p363d.p377v.C9057a;

/* renamed from: e.f.a.d.p.d */
public interface C9045d {

    /* renamed from: e.f.a.d.p.d$b */
    public static class C9047b implements TypeEvaluator<C9050e> {

        /* renamed from: a */
        public static final TypeEvaluator<C9050e> f24858a = new C9047b();

        /* renamed from: b */
        private final C9050e f24859b = new C9050e();

        /* renamed from: a */
        public C9050e evaluate(float f, C9050e eVar, C9050e eVar2) {
            this.f24859b.mo23000a(C9057a.m30186c(eVar.f24862a, eVar2.f24862a, f), C9057a.m30186c(eVar.f24863b, eVar2.f24863b, f), C9057a.m30186c(eVar.f24864c, eVar2.f24864c, f));
            return this.f24859b;
        }
    }

    /* renamed from: e.f.a.d.p.d$c */
    public static class C9048c extends Property<C9045d, C9050e> {

        /* renamed from: a */
        public static final Property<C9045d, C9050e> f24860a = new C9048c("circularReveal");

        private C9048c(String str) {
            super(C9050e.class, str);
        }

        /* renamed from: a */
        public C9050e get(C9045d dVar) {
            return dVar.getRevealInfo();
        }

        /* renamed from: b */
        public void set(C9045d dVar, C9050e eVar) {
            dVar.setRevealInfo(eVar);
        }
    }

    /* renamed from: e.f.a.d.p.d$d */
    public static class C9049d extends Property<C9045d, Integer> {

        /* renamed from: a */
        public static final Property<C9045d, Integer> f24861a = new C9049d("circularRevealScrimColor");

        private C9049d(String str) {
            super(Integer.class, str);
        }

        /* renamed from: a */
        public Integer get(C9045d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        /* renamed from: b */
        public void set(C9045d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* renamed from: e.f.a.d.p.d$e */
    public static class C9050e {

        /* renamed from: a */
        public float f24862a;

        /* renamed from: b */
        public float f24863b;

        /* renamed from: c */
        public float f24864c;

        private C9050e() {
        }

        public C9050e(float f, float f2, float f3) {
            this.f24862a = f;
            this.f24863b = f2;
            this.f24864c = f3;
        }

        /* renamed from: a */
        public void mo23000a(float f, float f2, float f3) {
            this.f24862a = f;
            this.f24863b = f2;
            this.f24864c = f3;
        }
    }

    /* renamed from: a */
    void mo22980a();

    /* renamed from: b */
    void mo22981b();

    int getCircularRevealScrimColor();

    C9050e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(C9050e eVar);
}
