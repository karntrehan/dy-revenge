package p174e.p319f.p320a.p363d.p364a0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* renamed from: e.f.a.d.a0.l */
public class C9001l {

    /* renamed from: a */
    private final C9004m[] f24486a = new C9004m[4];

    /* renamed from: b */
    private final Matrix[] f24487b = new Matrix[4];

    /* renamed from: c */
    private final Matrix[] f24488c = new Matrix[4];

    /* renamed from: d */
    private final PointF f24489d = new PointF();

    /* renamed from: e */
    private final C9004m f24490e = new C9004m();

    /* renamed from: f */
    private final float[] f24491f = new float[2];

    /* renamed from: g */
    private final float[] f24492g = new float[2];

    /* renamed from: e.f.a.d.a0.l$a */
    public interface C9002a {
        /* renamed from: a */
        void mo22844a(C9004m mVar, Matrix matrix, int i);

        /* renamed from: b */
        void mo22845b(C9004m mVar, Matrix matrix, int i);
    }

    /* renamed from: e.f.a.d.a0.l$b */
    static final class C9003b {

        /* renamed from: a */
        public final C8997k f24493a;

        /* renamed from: b */
        public final Path f24494b;

        /* renamed from: c */
        public final RectF f24495c;

        /* renamed from: d */
        public final C9002a f24496d;

        /* renamed from: e */
        public final float f24497e;

        C9003b(C8997k kVar, float f, RectF rectF, C9002a aVar, Path path) {
            this.f24496d = aVar;
            this.f24493a = kVar;
            this.f24497e = f;
            this.f24495c = rectF;
            this.f24494b = path;
        }
    }

    public C9001l() {
        for (int i = 0; i < 4; i++) {
            this.f24486a[i] = new C9004m();
            this.f24487b[i] = new Matrix();
            this.f24488c[i] = new Matrix();
        }
    }

    /* renamed from: a */
    private float m30050a(int i) {
        return (float) ((i + 1) * 90);
    }

    /* renamed from: b */
    private void m30051b(C9003b bVar, int i) {
        this.f24491f[0] = this.f24486a[i].mo22892j();
        this.f24491f[1] = this.f24486a[i].mo22893k();
        this.f24487b[i].mapPoints(this.f24491f);
        Path path = bVar.f24494b;
        float[] fArr = this.f24491f;
        if (i == 0) {
            path.moveTo(fArr[0], fArr[1]);
        } else {
            path.lineTo(fArr[0], fArr[1]);
        }
        this.f24486a[i].mo22888d(this.f24487b[i], bVar.f24494b);
        C9002a aVar = bVar.f24496d;
        if (aVar != null) {
            aVar.mo22844a(this.f24486a[i], this.f24487b[i], i);
        }
    }

    /* renamed from: c */
    private void m30052c(C9003b bVar, int i) {
        int i2 = (i + 1) % 4;
        this.f24491f[0] = this.f24486a[i].mo22890h();
        this.f24491f[1] = this.f24486a[i].mo22891i();
        this.f24487b[i].mapPoints(this.f24491f);
        this.f24492g[0] = this.f24486a[i2].mo22892j();
        this.f24492g[1] = this.f24486a[i2].mo22893k();
        this.f24487b[i2].mapPoints(this.f24492g);
        float[] fArr = this.f24491f;
        float f = fArr[0];
        float[] fArr2 = this.f24492g;
        float max = Math.max(((float) Math.hypot((double) (f - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
        float i3 = m30056i(bVar.f24495c, i);
        this.f24490e.mo22895m(0.0f, 0.0f);
        m30057j(i, bVar.f24493a).mo12720c(max, i3, bVar.f24497e, this.f24490e);
        this.f24490e.mo22888d(this.f24488c[i], bVar.f24494b);
        C9002a aVar = bVar.f24496d;
        if (aVar != null) {
            aVar.mo22845b(this.f24490e, this.f24488c[i], i);
        }
    }

    /* renamed from: f */
    private void m30053f(int i, RectF rectF, PointF pointF) {
        float f;
        float f2;
        float f3;
        if (i == 1) {
            f3 = rectF.right;
            f2 = rectF.bottom;
        } else if (i != 2) {
            f = i != 3 ? rectF.right : rectF.left;
            f2 = rectF.top;
        } else {
            f3 = rectF.left;
            f2 = rectF.bottom;
        }
        pointF.set(f, f2);
    }

    /* renamed from: g */
    private C8986c m30054g(int i, C8997k kVar) {
        return i != 1 ? i != 2 ? i != 3 ? kVar.mo22862t() : kVar.mo22860r() : kVar.mo22853j() : kVar.mo22855l();
    }

    /* renamed from: h */
    private C8987d m30055h(int i, C8997k kVar) {
        return i != 1 ? i != 2 ? i != 3 ? kVar.mo22861s() : kVar.mo22859q() : kVar.mo22852i() : kVar.mo22854k();
    }

    /* renamed from: i */
    private float m30056i(RectF rectF, int i) {
        float centerX;
        float f;
        float[] fArr = this.f24491f;
        C9004m[] mVarArr = this.f24486a;
        fArr[0] = mVarArr[i].f24500c;
        fArr[1] = mVarArr[i].f24501d;
        this.f24487b[i].mapPoints(fArr);
        if (i == 1 || i == 3) {
            centerX = rectF.centerX();
            f = this.f24491f[0];
        } else {
            centerX = rectF.centerY();
            f = this.f24491f[1];
        }
        return Math.abs(centerX - f);
    }

    /* renamed from: j */
    private C8989f m30057j(int i, C8997k kVar) {
        return i != 1 ? i != 2 ? i != 3 ? kVar.mo22857o() : kVar.mo22858p() : kVar.mo22856n() : kVar.mo22851h();
    }

    /* renamed from: k */
    private void m30058k(C9003b bVar, int i) {
        m30055h(i, bVar.f24493a).mo22807b(this.f24486a[i], 90.0f, bVar.f24497e, bVar.f24495c, m30054g(i, bVar.f24493a));
        float a = m30050a(i);
        this.f24487b[i].reset();
        m30053f(i, bVar.f24495c, this.f24489d);
        Matrix matrix = this.f24487b[i];
        PointF pointF = this.f24489d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f24487b[i].preRotate(a);
    }

    /* renamed from: l */
    private void m30059l(int i) {
        this.f24491f[0] = this.f24486a[i].mo22890h();
        this.f24491f[1] = this.f24486a[i].mo22891i();
        this.f24487b[i].mapPoints(this.f24491f);
        float a = m30050a(i);
        this.f24488c[i].reset();
        Matrix matrix = this.f24488c[i];
        float[] fArr = this.f24491f;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f24488c[i].preRotate(a);
    }

    /* renamed from: d */
    public void mo22885d(C8997k kVar, float f, RectF rectF, Path path) {
        mo22886e(kVar, f, rectF, (C9002a) null, path);
    }

    /* renamed from: e */
    public void mo22886e(C8997k kVar, float f, RectF rectF, C9002a aVar, Path path) {
        path.rewind();
        C9003b bVar = new C9003b(kVar, f, rectF, aVar, path);
        for (int i = 0; i < 4; i++) {
            m30058k(bVar, i);
            m30059l(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            m30051b(bVar, i2);
            m30052c(bVar, i2);
        }
        path.close();
    }
}
