package p174e.p181b.p182a.p188w.p191l;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import p174e.p181b.p182a.C5442g;
import p174e.p181b.p182a.C5462l;
import p174e.p181b.p182a.p183a0.C5419c;
import p174e.p181b.p182a.p184u.C5475a;
import p174e.p181b.p182a.p184u.p186c.C5499a;
import p174e.p181b.p182a.p184u.p186c.C5520p;

/* renamed from: e.b.a.w.l.g */
public class C5582g extends C5571a {

    /* renamed from: A */
    private final Paint f15841A;

    /* renamed from: B */
    private final float[] f15842B;

    /* renamed from: C */
    private final Path f15843C;

    /* renamed from: D */
    private final C5577d f15844D;

    /* renamed from: E */
    private C5499a<ColorFilter, ColorFilter> f15845E;

    /* renamed from: z */
    private final RectF f15846z = new RectF();

    C5582g(C5442g gVar, C5577d dVar) {
        super(gVar, dVar);
        C5475a aVar = new C5475a();
        this.f15841A = aVar;
        this.f15842B = new float[8];
        this.f15843C = new Path();
        this.f15844D = dVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(dVar.mo16829m());
    }

    /* renamed from: e */
    public void mo16590e(RectF rectF, Matrix matrix, boolean z) {
        super.mo16590e(rectF, matrix, z);
        this.f15846z.set(0.0f, 0.0f, (float) this.f15844D.mo16831o(), (float) this.f15844D.mo16830n());
        this.f15776m.mapRect(this.f15846z);
        rectF.set(this.f15846z);
    }

    /* renamed from: h */
    public <T> void mo16592h(T t, C5419c<T> cVar) {
        super.mo16592h(t, cVar);
        if (t == C5462l.f15280E) {
            this.f15845E = cVar == null ? null : new C5520p(cVar);
        }
    }

    /* renamed from: u */
    public void mo16813u(Canvas canvas, Matrix matrix, int i) {
        int alpha = Color.alpha(this.f15844D.mo16829m());
        if (alpha != 0) {
            int intValue = (int) ((((float) i) / 255.0f) * (((((float) alpha) / 255.0f) * ((float) (this.f15785v.mo16656h() == null ? 100 : this.f15785v.mo16656h().mo16612h().intValue()))) / 100.0f) * 255.0f);
            this.f15841A.setAlpha(intValue);
            C5499a<ColorFilter, ColorFilter> aVar = this.f15845E;
            if (aVar != null) {
                this.f15841A.setColorFilter(aVar.mo16612h());
            }
            if (intValue > 0) {
                float[] fArr = this.f15842B;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                fArr[2] = (float) this.f15844D.mo16831o();
                float[] fArr2 = this.f15842B;
                fArr2[3] = 0.0f;
                fArr2[4] = (float) this.f15844D.mo16831o();
                this.f15842B[5] = (float) this.f15844D.mo16830n();
                float[] fArr3 = this.f15842B;
                fArr3[6] = 0.0f;
                fArr3[7] = (float) this.f15844D.mo16830n();
                matrix.mapPoints(this.f15842B);
                this.f15843C.reset();
                Path path = this.f15843C;
                float[] fArr4 = this.f15842B;
                path.moveTo(fArr4[0], fArr4[1]);
                Path path2 = this.f15843C;
                float[] fArr5 = this.f15842B;
                path2.lineTo(fArr5[2], fArr5[3]);
                Path path3 = this.f15843C;
                float[] fArr6 = this.f15842B;
                path3.lineTo(fArr6[4], fArr6[5]);
                Path path4 = this.f15843C;
                float[] fArr7 = this.f15842B;
                path4.lineTo(fArr7[6], fArr7[7]);
                Path path5 = this.f15843C;
                float[] fArr8 = this.f15842B;
                path5.lineTo(fArr8[0], fArr8[1]);
                this.f15843C.close();
                canvas.drawPath(this.f15843C, this.f15841A);
            }
        }
    }
}
