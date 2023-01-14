package p174e.p319f.p320a.p363d.p364a0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p174e.p319f.p320a.p363d.p381z.C9072a;

/* renamed from: e.f.a.d.a0.m */
public class C9004m {
    @Deprecated

    /* renamed from: a */
    public float f24498a;
    @Deprecated

    /* renamed from: b */
    public float f24499b;
    @Deprecated

    /* renamed from: c */
    public float f24500c;
    @Deprecated

    /* renamed from: d */
    public float f24501d;
    @Deprecated

    /* renamed from: e */
    public float f24502e;
    @Deprecated

    /* renamed from: f */
    public float f24503f;

    /* renamed from: g */
    private final List<C9010f> f24504g = new ArrayList();

    /* renamed from: h */
    private final List<C9011g> f24505h = new ArrayList();

    /* renamed from: e.f.a.d.a0.m$a */
    class C9005a extends C9011g {

        /* renamed from: b */
        final /* synthetic */ List f24506b;

        /* renamed from: c */
        final /* synthetic */ Matrix f24507c;

        C9005a(List list, Matrix matrix) {
            this.f24506b = list;
            this.f24507c = matrix;
        }

        /* renamed from: a */
        public void mo22897a(Matrix matrix, C9072a aVar, int i, Canvas canvas) {
            for (C9011g a : this.f24506b) {
                a.mo22897a(this.f24507c, aVar, i, canvas);
            }
        }
    }

    /* renamed from: e.f.a.d.a0.m$b */
    static class C9006b extends C9011g {

        /* renamed from: b */
        private final C9008d f24509b;

        public C9006b(C9008d dVar) {
            this.f24509b = dVar;
        }

        /* renamed from: a */
        public void mo22897a(Matrix matrix, C9072a aVar, int i, Canvas canvas) {
            float h = this.f24509b.m30099m();
            float i2 = this.f24509b.m30100n();
            aVar.mo23032a(canvas, matrix, new RectF(this.f24509b.m30097k(), this.f24509b.m30101o(), this.f24509b.m30098l(), this.f24509b.m30096j()), i, h, i2);
        }
    }

    /* renamed from: e.f.a.d.a0.m$c */
    static class C9007c extends C9011g {

        /* renamed from: b */
        private final C9009e f24510b;

        /* renamed from: c */
        private final float f24511c;

        /* renamed from: d */
        private final float f24512d;

        public C9007c(C9009e eVar, float f, float f2) {
            this.f24510b = eVar;
            this.f24511c = f;
            this.f24512d = f2;
        }

        /* renamed from: a */
        public void mo22897a(Matrix matrix, C9072a aVar, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (this.f24510b.f24521c - this.f24512d), (double) (this.f24510b.f24520b - this.f24511c)), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f24511c, this.f24512d);
            matrix2.preRotate(mo22898c());
            aVar.mo23033b(canvas, matrix2, rectF, i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public float mo22898c() {
            return (float) Math.toDegrees(Math.atan((double) ((this.f24510b.f24521c - this.f24512d) / (this.f24510b.f24520b - this.f24511c))));
        }
    }

    /* renamed from: e.f.a.d.a0.m$d */
    public static class C9008d extends C9010f {

        /* renamed from: b */
        private static final RectF f24513b = new RectF();
        @Deprecated

        /* renamed from: c */
        public float f24514c;
        @Deprecated

        /* renamed from: d */
        public float f24515d;
        @Deprecated

        /* renamed from: e */
        public float f24516e;
        @Deprecated

        /* renamed from: f */
        public float f24517f;
        @Deprecated

        /* renamed from: g */
        public float f24518g;
        @Deprecated

        /* renamed from: h */
        public float f24519h;

        public C9008d(float f, float f2, float f3, float f4) {
            m30103q(f);
            m30107u(f2);
            m30104r(f3);
            m30102p(f4);
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public float m30096j() {
            return this.f24517f;
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public float m30097k() {
            return this.f24514c;
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public float m30098l() {
            return this.f24516e;
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public float m30099m() {
            return this.f24518g;
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public float m30100n() {
            return this.f24519h;
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public float m30101o() {
            return this.f24515d;
        }

        /* renamed from: p */
        private void m30102p(float f) {
            this.f24517f = f;
        }

        /* renamed from: q */
        private void m30103q(float f) {
            this.f24514c = f;
        }

        /* renamed from: r */
        private void m30104r(float f) {
            this.f24516e = f;
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public void m30105s(float f) {
            this.f24518g = f;
        }

        /* access modifiers changed from: private */
        /* renamed from: t */
        public void m30106t(float f) {
            this.f24519h = f;
        }

        /* renamed from: u */
        private void m30107u(float f) {
            this.f24515d = f;
        }

        /* renamed from: a */
        public void mo22899a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f24522a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f24513b;
            rectF.set(m30097k(), m30101o(), m30098l(), m30096j());
            path.arcTo(rectF, m30099m(), m30100n(), false);
            path.transform(matrix);
        }
    }

    /* renamed from: e.f.a.d.a0.m$e */
    public static class C9009e extends C9010f {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public float f24520b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public float f24521c;

        /* renamed from: a */
        public void mo22899a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f24522a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f24520b, this.f24521c);
            path.transform(matrix);
        }
    }

    /* renamed from: e.f.a.d.a0.m$f */
    public static abstract class C9010f {

        /* renamed from: a */
        protected final Matrix f24522a = new Matrix();

        /* renamed from: a */
        public abstract void mo22899a(Matrix matrix, Path path);
    }

    /* renamed from: e.f.a.d.a0.m$g */
    static abstract class C9011g {

        /* renamed from: a */
        static final Matrix f24523a = new Matrix();

        C9011g() {
        }

        /* renamed from: a */
        public abstract void mo22897a(Matrix matrix, C9072a aVar, int i, Canvas canvas);

        /* renamed from: b */
        public final void mo22900b(C9072a aVar, int i, Canvas canvas) {
            mo22897a(f24523a, aVar, i, canvas);
        }
    }

    public C9004m() {
        mo22895m(0.0f, 0.0f);
    }

    /* renamed from: b */
    private void m30064b(float f) {
        if (m30066f() != f) {
            float f2 = ((f - m30066f()) + 360.0f) % 360.0f;
            if (f2 <= 180.0f) {
                C9008d dVar = new C9008d(mo22890h(), mo22891i(), mo22890h(), mo22891i());
                dVar.m30105s(m30066f());
                dVar.m30106t(f2);
                this.f24505h.add(new C9006b(dVar));
                m30068o(f);
            }
        }
    }

    /* renamed from: c */
    private void m30065c(C9011g gVar, float f, float f2) {
        m30064b(f);
        this.f24505h.add(gVar);
        m30068o(f2);
    }

    /* renamed from: f */
    private float m30066f() {
        return this.f24502e;
    }

    /* renamed from: g */
    private float m30067g() {
        return this.f24503f;
    }

    /* renamed from: o */
    private void m30068o(float f) {
        this.f24502e = f;
    }

    /* renamed from: p */
    private void m30069p(float f) {
        this.f24503f = f;
    }

    /* renamed from: q */
    private void m30070q(float f) {
        this.f24500c = f;
    }

    /* renamed from: r */
    private void m30071r(float f) {
        this.f24501d = f;
    }

    /* renamed from: s */
    private void m30072s(float f) {
        this.f24498a = f;
    }

    /* renamed from: t */
    private void m30073t(float f) {
        this.f24499b = f;
    }

    /* renamed from: a */
    public void mo22887a(float f, float f2, float f3, float f4, float f5, float f6) {
        C9008d dVar = new C9008d(f, f2, f3, f4);
        dVar.m30105s(f5);
        dVar.m30106t(f6);
        this.f24504g.add(dVar);
        C9006b bVar = new C9006b(dVar);
        float f7 = f5 + f6;
        boolean z = f6 < 0.0f;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        m30065c(bVar, f5, z ? (180.0f + f7) % 360.0f : f7);
        double d = (double) f7;
        m30070q(((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))));
        m30071r(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))));
    }

    /* renamed from: d */
    public void mo22888d(Matrix matrix, Path path) {
        int size = this.f24504g.size();
        for (int i = 0; i < size; i++) {
            this.f24504g.get(i).mo22899a(matrix, path);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C9011g mo22889e(Matrix matrix) {
        m30064b(m30067g());
        return new C9005a(new ArrayList(this.f24505h), matrix);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public float mo22890h() {
        return this.f24500c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public float mo22891i() {
        return this.f24501d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public float mo22892j() {
        return this.f24498a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public float mo22893k() {
        return this.f24499b;
    }

    /* renamed from: l */
    public void mo22894l(float f, float f2) {
        C9009e eVar = new C9009e();
        float unused = eVar.f24520b = f;
        float unused2 = eVar.f24521c = f2;
        this.f24504g.add(eVar);
        C9007c cVar = new C9007c(eVar, mo22890h(), mo22891i());
        m30065c(cVar, cVar.mo22898c() + 270.0f, cVar.mo22898c() + 270.0f);
        m30070q(f);
        m30071r(f2);
    }

    /* renamed from: m */
    public void mo22895m(float f, float f2) {
        mo22896n(f, f2, 270.0f, 0.0f);
    }

    /* renamed from: n */
    public void mo22896n(float f, float f2, float f3, float f4) {
        m30072s(f);
        m30073t(f2);
        m30070q(f);
        m30071r(f2);
        m30068o(f3);
        m30069p((f3 + f4) % 360.0f);
        this.f24504g.clear();
        this.f24505h.clear();
    }
}
