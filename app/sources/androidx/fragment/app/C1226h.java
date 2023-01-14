package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import p027c.p060f.C1801g;

/* renamed from: androidx.fragment.app.h */
public class C1226h {

    /* renamed from: a */
    private static final C1801g<String, Class<?>> f3490a = new C1801g<>();

    /* renamed from: b */
    static boolean m4953b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(m4954c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    private static Class<?> m4954c(ClassLoader classLoader, String str) {
        C1801g<String, Class<?>> gVar = f3490a;
        Class<?> cls = gVar.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        gVar.put(str, cls2);
        return cls2;
    }

    /* renamed from: d */
    public static Class<? extends Fragment> m4955d(ClassLoader classLoader, String str) {
        try {
            return m4954c(classLoader, str);
        } catch (ClassNotFoundException e) {
            throw new Fragment.C1207e("Unable to instantiate fragment " + str + ": make sure class name exists", e);
        } catch (ClassCastException e2) {
            throw new Fragment.C1207e("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e2);
        }
    }

    /* renamed from: a */
    public Fragment mo4076a(ClassLoader classLoader, String str) {
        throw null;
    }
}
