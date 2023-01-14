package p174e.p319f.p320a.p335c.p345f.p352g;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: e.f.a.c.f.g.pb */
final class C6950pb implements PrivilegedExceptionAction {
    C6950pb() {
    }

    /* renamed from: a */
    public static final Unsafe m26372a() {
        Class<Unsafe> cls = Unsafe.class;
        for (Field field : cls.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get((Object) null);
            if (cls.isInstance(obj)) {
                return cls.cast(obj);
            }
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object run() {
        return m26372a();
    }
}
