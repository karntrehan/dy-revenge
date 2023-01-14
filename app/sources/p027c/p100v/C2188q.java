package p027c.p100v;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: c.v.q */
class C2188q<T> extends Property<T, Float> {

    /* renamed from: a */
    private final Property<T, PointF> f6393a;

    /* renamed from: b */
    private final PathMeasure f6394b;

    /* renamed from: c */
    private final float f6395c;

    /* renamed from: d */
    private final float[] f6396d = new float[2];

    /* renamed from: e */
    private final PointF f6397e = new PointF();

    /* renamed from: f */
    private float f6398f;

    C2188q(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f6393a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f6394b = pathMeasure;
        this.f6395c = pathMeasure.getLength();
    }

    /* renamed from: a */
    public Float get(T t) {
        return Float.valueOf(this.f6398f);
    }

    /* renamed from: b */
    public void set(T t, Float f) {
        this.f6398f = f.floatValue();
        this.f6394b.getPosTan(this.f6395c * f.floatValue(), this.f6396d, (float[]) null);
        PointF pointF = this.f6397e;
        float[] fArr = this.f6396d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f6393a.set(t, pointF);
    }
}
