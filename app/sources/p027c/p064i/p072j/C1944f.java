package p027c.p064i.p072j;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

/* renamed from: c.i.j.f */
public final class C1944f {

    /* renamed from: a */
    private static Field f5673a;

    /* renamed from: b */
    private static boolean f5674b;

    /* renamed from: a */
    private static void m8155a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f5674b) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f5673a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            f5674b = true;
        }
        Field field = f5673a;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }

    /* renamed from: b */
    public static void m8156b(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                m8155a(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                m8155a(layoutInflater, factory2);
            }
        }
    }
}
