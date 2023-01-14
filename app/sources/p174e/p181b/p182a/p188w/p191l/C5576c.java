package p174e.p181b.p182a.p188w.p191l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import p174e.p181b.p182a.C5442g;
import p174e.p181b.p182a.C5462l;
import p174e.p181b.p182a.p183a0.C5419c;
import p174e.p181b.p182a.p184u.C5475a;
import p174e.p181b.p182a.p184u.p186c.C5499a;
import p174e.p181b.p182a.p184u.p186c.C5520p;
import p174e.p181b.p182a.p195z.C5647h;

/* renamed from: e.b.a.w.l.c */
public class C5576c extends C5571a {

    /* renamed from: A */
    private final Rect f15798A = new Rect();

    /* renamed from: B */
    private final Rect f15799B = new Rect();

    /* renamed from: C */
    private C5499a<ColorFilter, ColorFilter> f15800C;

    /* renamed from: D */
    private C5499a<Bitmap, Bitmap> f15801D;

    /* renamed from: z */
    private final Paint f15802z = new C5475a(3);

    C5576c(C5442g gVar, C5577d dVar) {
        super(gVar, dVar);
    }

    /* renamed from: L */
    private Bitmap m20804L() {
        Bitmap h;
        C5499a<Bitmap, Bitmap> aVar = this.f15801D;
        if (aVar != null && (h = aVar.mo16612h()) != null) {
            return h;
        }
        return this.f15777n.mo16553u(this.f15778o.mo16827k());
    }

    /* renamed from: e */
    public void mo16590e(RectF rectF, Matrix matrix, boolean z) {
        super.mo16590e(rectF, matrix, z);
        Bitmap L = m20804L();
        if (L != null) {
            rectF.set(0.0f, 0.0f, ((float) L.getWidth()) * C5647h.m21070e(), ((float) L.getHeight()) * C5647h.m21070e());
            this.f15776m.mapRect(rectF);
        }
    }

    /* renamed from: h */
    public <T> void mo16592h(T t, C5419c<T> cVar) {
        super.mo16592h(t, cVar);
        if (t == C5462l.f15280E) {
            if (cVar == null) {
                this.f15800C = null;
            } else {
                this.f15800C = new C5520p(cVar);
            }
        } else if (t != C5462l.f15283H) {
        } else {
            if (cVar == null) {
                this.f15801D = null;
            } else {
                this.f15801D = new C5520p(cVar);
            }
        }
    }

    /* renamed from: u */
    public void mo16813u(Canvas canvas, Matrix matrix, int i) {
        Bitmap L = m20804L();
        if (L != null && !L.isRecycled()) {
            float e = C5647h.m21070e();
            this.f15802z.setAlpha(i);
            C5499a<ColorFilter, ColorFilter> aVar = this.f15800C;
            if (aVar != null) {
                this.f15802z.setColorFilter(aVar.mo16612h());
            }
            canvas.save();
            canvas.concat(matrix);
            this.f15798A.set(0, 0, L.getWidth(), L.getHeight());
            this.f15799B.set(0, 0, (int) (((float) L.getWidth()) * e), (int) (((float) L.getHeight()) * e));
            canvas.drawBitmap(L, this.f15798A, this.f15799B, this.f15802z);
            canvas.restore();
        }
    }
}
