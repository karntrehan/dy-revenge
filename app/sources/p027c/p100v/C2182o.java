package p027c.p100v;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* renamed from: c.v.o */
class C2182o {
    /* renamed from: a */
    static <T> ObjectAnimator m9252a(T t, Property<T, PointF> property, Path path) {
        return Build.VERSION.SDK_INT >= 21 ? ObjectAnimator.ofObject(t, property, (TypeConverter) null, path) : ObjectAnimator.ofFloat(t, new C2188q(property, path), new float[]{0.0f, 1.0f});
    }
}
