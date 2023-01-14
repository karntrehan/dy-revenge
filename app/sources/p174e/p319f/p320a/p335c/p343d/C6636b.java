package p174e.p319f.p320a.p335c.p343d;

import android.os.IBinder;
import com.google.android.gms.common.internal.C3705r;
import java.lang.reflect.Field;
import p174e.p319f.p320a.p335c.p343d.C6634a;

/* renamed from: e.f.a.c.d.b */
public final class C6636b<T> extends C6634a.C6635a {

    /* renamed from: a */
    private final T f18304a;

    private C6636b(T t) {
        this.f18304a = t;
    }

    /* renamed from: Y */
    public static <T> C6634a m25276Y(T t) {
        return new C6636b(t);
    }

    /* renamed from: m */
    public static <T> T m25277m(C6634a aVar) {
        if (aVar instanceof C6636b) {
            return ((C6636b) aVar).f18304a;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            C3705r.m14346k(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e) {
                    throw new IllegalArgumentException("Binder object is null.", e);
                } catch (IllegalAccessException e2) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
                }
            } else {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
        } else {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
