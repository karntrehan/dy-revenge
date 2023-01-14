package p027c.p100v;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* renamed from: c.v.r */
class C2190r {
    /* renamed from: a */
    static PropertyValuesHolder m9278a(Property<?, PointF> property, Path path) {
        return Build.VERSION.SDK_INT >= 21 ? PropertyValuesHolder.ofObject(property, (TypeConverter) null, path) : PropertyValuesHolder.ofFloat(new C2188q(property, path), new float[]{0.0f, 1.0f});
    }
}
