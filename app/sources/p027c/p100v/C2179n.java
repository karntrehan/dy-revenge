package p027c.p100v;

import android.graphics.Matrix;
import android.graphics.RectF;

/* renamed from: c.v.n */
class C2179n {

    /* renamed from: a */
    static final Matrix f6388a = new C2180a();

    /* renamed from: c.v.n$a */
    static class C2180a extends Matrix {
        C2180a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7301a() {
            throw new IllegalStateException("Matrix can not be modified");
        }

        public boolean postConcat(Matrix matrix) {
            mo7301a();
            return false;
        }

        public boolean postRotate(float f) {
            mo7301a();
            return false;
        }

        public boolean postRotate(float f, float f2, float f3) {
            mo7301a();
            return false;
        }

        public boolean postScale(float f, float f2) {
            mo7301a();
            return false;
        }

        public boolean postScale(float f, float f2, float f3, float f4) {
            mo7301a();
            return false;
        }

        public boolean postSkew(float f, float f2) {
            mo7301a();
            return false;
        }

        public boolean postSkew(float f, float f2, float f3, float f4) {
            mo7301a();
            return false;
        }

        public boolean postTranslate(float f, float f2) {
            mo7301a();
            return false;
        }

        public boolean preConcat(Matrix matrix) {
            mo7301a();
            return false;
        }

        public boolean preRotate(float f) {
            mo7301a();
            return false;
        }

        public boolean preRotate(float f, float f2, float f3) {
            mo7301a();
            return false;
        }

        public boolean preScale(float f, float f2) {
            mo7301a();
            return false;
        }

        public boolean preScale(float f, float f2, float f3, float f4) {
            mo7301a();
            return false;
        }

        public boolean preSkew(float f, float f2) {
            mo7301a();
            return false;
        }

        public boolean preSkew(float f, float f2, float f3, float f4) {
            mo7301a();
            return false;
        }

        public boolean preTranslate(float f, float f2) {
            mo7301a();
            return false;
        }

        public void reset() {
            mo7301a();
        }

        public void set(Matrix matrix) {
            mo7301a();
        }

        public boolean setConcat(Matrix matrix, Matrix matrix2) {
            mo7301a();
            return false;
        }

        public boolean setPolyToPoly(float[] fArr, int i, float[] fArr2, int i2, int i3) {
            mo7301a();
            return false;
        }

        public boolean setRectToRect(RectF rectF, RectF rectF2, Matrix.ScaleToFit scaleToFit) {
            mo7301a();
            return false;
        }

        public void setRotate(float f) {
            mo7301a();
        }

        public void setRotate(float f, float f2, float f3) {
            mo7301a();
        }

        public void setScale(float f, float f2) {
            mo7301a();
        }

        public void setScale(float f, float f2, float f3, float f4) {
            mo7301a();
        }

        public void setSinCos(float f, float f2) {
            mo7301a();
        }

        public void setSinCos(float f, float f2, float f3, float f4) {
            mo7301a();
        }

        public void setSkew(float f, float f2) {
            mo7301a();
        }

        public void setSkew(float f, float f2, float f3, float f4) {
            mo7301a();
        }

        public void setTranslate(float f, float f2) {
            mo7301a();
        }

        public void setValues(float[] fArr) {
            mo7301a();
        }
    }
}
