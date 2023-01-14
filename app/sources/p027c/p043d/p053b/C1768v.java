package p027c.p043d.p053b;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.Size;
import androidx.camera.core.C0962r2;
import androidx.camera.core.impl.p014a3.C0743m;

/* renamed from: c.d.b.v */
class C1768v extends C0962r2 {

    /* renamed from: b */
    static final PointF f5241b = new PointF(2.0f, 2.0f);

    /* renamed from: c */
    private final C1757s f5242c;

    /* renamed from: d */
    private Matrix f5243d;

    C1768v(C1757s sVar) {
        this.f5242c = sVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public PointF mo3207a(float f, float f2) {
        float[] fArr = {f, f2};
        synchronized (this) {
            Matrix matrix = this.f5243d;
            if (matrix == null) {
                PointF pointF = f5241b;
                return pointF;
            }
            matrix.mapPoints(fArr);
            return new PointF(fArr[0], fArr[1]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo6026e(Size size, int i) {
        C0743m.m3042a();
        synchronized (this) {
            if (size.getWidth() != 0) {
                if (size.getHeight() != 0) {
                    this.f5243d = this.f5242c.mo5982c(size, i);
                    return;
                }
            }
            this.f5243d = null;
        }
    }
}
