package p174e.p319f.p320a.p335c.p345f.p357l;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: e.f.a.c.f.l.qf */
final class C8422qf implements PrivilegedExceptionAction<Unsafe> {
    C8422qf() {
    }

    /* renamed from: a */
    public static final Unsafe m28971a() {
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
        return m28971a();
    }
}
