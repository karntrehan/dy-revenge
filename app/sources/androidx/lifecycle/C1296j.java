package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;

/* renamed from: androidx.lifecycle.j */
public class C1296j {

    /* renamed from: a */
    private static Map<Class<?>, Integer> f3732a = new HashMap();

    /* renamed from: b */
    private static Map<Class<?>, List<Constructor<? extends C1285c>>> f3733b = new HashMap();

    /* renamed from: a */
    private static C1285c m5321a(Constructor<? extends C1285c> constructor, Object obj) {
        try {
            return (C1285c) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: b */
    private static Constructor<? extends C1285c> m5322b(Class<?> cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : HttpUrl.FRAGMENT_ENCODE_SET;
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String c = m5323c(canonicalName);
            if (!name.isEmpty()) {
                c = name + "." + c;
            }
            Constructor<?> declaredConstructor = Class.forName(c).getDeclaredConstructor(new Class[]{cls});
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public static String m5323c(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* renamed from: d */
    private static int m5324d(Class<?> cls) {
        Integer num = f3732a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g = m5327g(cls);
        f3732a.put(cls, Integer.valueOf(g));
        return g;
    }

    /* renamed from: e */
    private static boolean m5325e(Class<?> cls) {
        return cls != null && C1290f.class.isAssignableFrom(cls);
    }

    /* renamed from: f */
    static C1289e m5326f(Object obj) {
        boolean z = obj instanceof C1289e;
        boolean z2 = obj instanceof C1284b;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((C1284b) obj, (C1289e) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((C1284b) obj, (C1289e) null);
        }
        if (z) {
            return (C1289e) obj;
        }
        Class<?> cls = obj.getClass();
        if (m5324d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = f3733b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(m5321a((Constructor) list.get(0), obj));
        }
        C1285c[] cVarArr = new C1285c[list.size()];
        for (int i = 0; i < list.size(); i++) {
            cVarArr[i] = m5321a((Constructor) list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(cVarArr);
    }

    /* renamed from: g */
    private static int m5327g(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends C1285c> b = m5322b(cls);
        if (b != null) {
            f3733b.put(cls, Collections.singletonList(b));
            return 2;
        } else if (C1281a.f3707a.mo4326d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (m5325e(superclass)) {
                if (m5324d(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList(f3733b.get(superclass));
            }
            for (Class cls2 : cls.getInterfaces()) {
                if (m5325e(cls2)) {
                    if (m5324d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(f3733b.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f3733b.put(cls, arrayList);
            return 2;
        }
    }
}
