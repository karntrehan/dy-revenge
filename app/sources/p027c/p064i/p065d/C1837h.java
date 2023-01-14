package p027c.p064i.p065d;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: c.i.d.h */
public class C1837h extends C1836g {
    /* access modifiers changed from: protected */
    /* renamed from: l */
    public Typeface mo6333l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f5475g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f5481m.invoke((Object) null, new Object[]{newInstance, "sans-serif", -1, -1});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public Method mo6337x(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
