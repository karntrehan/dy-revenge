package p174e.p319f.p320a.p363d.p366l;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import java.util.WeakHashMap;

/* renamed from: e.f.a.d.l.e */
public class C9029e extends Property<Drawable, Integer> {

    /* renamed from: a */
    public static final Property<Drawable, Integer> f24826a = new C9029e();

    /* renamed from: b */
    private final WeakHashMap<Drawable, Integer> f24827b = new WeakHashMap<>();

    private C9029e() {
        super(Integer.class, "drawableAlphaCompat");
    }

    /* renamed from: a */
    public Integer get(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Integer.valueOf(drawable.getAlpha());
        }
        if (this.f24827b.containsKey(drawable)) {
            return this.f24827b.get(drawable);
        }
        return 255;
    }

    /* renamed from: b */
    public void set(Drawable drawable, Integer num) {
        if (Build.VERSION.SDK_INT < 19) {
            this.f24827b.put(drawable, num);
        }
        drawable.setAlpha(num.intValue());
    }
}
