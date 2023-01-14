package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: androidx.appcompat.app.i */
class C0095i {

    /* renamed from: a */
    private static Field f327a;

    /* renamed from: b */
    private static boolean f328b;

    /* renamed from: c */
    private static Class<?> f329c;

    /* renamed from: d */
    private static boolean f330d;

    /* renamed from: e */
    private static Field f331e;

    /* renamed from: f */
    private static boolean f332f;

    /* renamed from: g */
    private static Field f333g;

    /* renamed from: h */
    private static boolean f334h;

    /* renamed from: a */
    static void m417a(Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            if (i >= 24) {
                m420d(resources);
            } else if (i >= 23) {
                m419c(resources);
            } else if (i >= 21) {
                m418b(resources);
            }
        }
    }

    /* renamed from: b */
    private static void m418b(Resources resources) {
        if (!f328b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f327a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f328b = true;
        }
        Field field = f327a;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* renamed from: c */
    private static void m419c(Resources resources) {
        if (!f328b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f327a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f328b = true;
        }
        Object obj = null;
        Field field = f327a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
        }
        if (obj != null) {
            m421e(obj);
        }
    }

    /* renamed from: d */
    private static void m420d(Resources resources) {
        Object obj;
        if (!f334h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f333g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f334h = true;
        }
        Field field = f333g;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
                obj = null;
            }
            if (obj != null) {
                if (!f328b) {
                    try {
                        Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                        f327a = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (NoSuchFieldException e3) {
                        Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
                    }
                    f328b = true;
                }
                Field field2 = f327a;
                if (field2 != null) {
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException e4) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
                    }
                }
                if (obj2 != null) {
                    m421e(obj2);
                }
            }
        }
    }

    /* renamed from: e */
    private static void m421e(Object obj) {
        if (!f330d) {
            try {
                f329c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f330d = true;
        }
        Class<?> cls = f329c;
        if (cls != null) {
            if (!f332f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f331e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
                }
                f332f = true;
            }
            Field field = f331e;
            if (field != null) {
                LongSparseArray longSparseArray = null;
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }
}
