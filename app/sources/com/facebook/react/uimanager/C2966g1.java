package com.facebook.react.uimanager;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.p120j1.C2991a;
import com.facebook.react.uimanager.p120j1.C2992b;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p174e.p247e.p253d.p258e.C6071a;

/* renamed from: com.facebook.react.uimanager.g1 */
class C2966g1 {

    /* renamed from: a */
    private static final Map<Class, Map<String, C2979m>> f8290a = new HashMap();

    /* renamed from: b */
    private static final Map<String, C2979m> f8291b = new HashMap();

    /* renamed from: com.facebook.react.uimanager.g1$b */
    private static class C2968b extends C2979m {
        public C2968b(C2991a aVar, Method method) {
            super(aVar, "Array", method);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Object mo9680c(Object obj, Context context) {
            return (ReadableArray) obj;
        }
    }

    /* renamed from: com.facebook.react.uimanager.g1$c */
    private static class C2969c extends C2979m {

        /* renamed from: i */
        private final boolean f8292i;

        public C2969c(C2991a aVar, Method method, boolean z) {
            super(aVar, "boolean", method);
            this.f8292i = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Object mo9680c(Object obj, Context context) {
            return obj == null ? this.f8292i : ((Boolean) obj).booleanValue() ? Boolean.TRUE : Boolean.FALSE;
        }
    }

    /* renamed from: com.facebook.react.uimanager.g1$d */
    private static class C2970d extends C2979m {
        public C2970d(C2991a aVar, Method method) {
            super(aVar, "boolean", method);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Object mo9680c(Object obj, Context context) {
            if (obj != null) {
                return ((Boolean) obj).booleanValue() ? Boolean.TRUE : Boolean.FALSE;
            }
            return null;
        }
    }

    /* renamed from: com.facebook.react.uimanager.g1$e */
    private static class C2971e extends C2979m {
        public C2971e(C2991a aVar, Method method) {
            super(aVar, "mixed", method);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Object mo9680c(Object obj, Context context) {
            if (obj != null) {
                return ColorPropConverter.getColor(obj, context);
            }
            return null;
        }
    }

    /* renamed from: com.facebook.react.uimanager.g1$f */
    private static class C2972f extends C2979m {
        public C2972f(C2991a aVar, Method method) {
            super(aVar, "number", method);
        }

        public C2972f(C2992b bVar, Method method, int i) {
            super(bVar, "number", method, i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Object mo9680c(Object obj, Context context) {
            if (obj != null) {
                return obj instanceof Double ? Integer.valueOf(((Double) obj).intValue()) : (Integer) obj;
            }
            return null;
        }
    }

    /* renamed from: com.facebook.react.uimanager.g1$g */
    private static class C2973g extends C2979m {

        /* renamed from: i */
        private final int f8293i;

        public C2973g(C2991a aVar, Method method, int i) {
            super(aVar, "mixed", method);
            this.f8293i = i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Object mo9680c(Object obj, Context context) {
            return obj == null ? Integer.valueOf(this.f8293i) : ColorPropConverter.getColor(obj, context);
        }
    }

    /* renamed from: com.facebook.react.uimanager.g1$h */
    private static class C2974h extends C2979m {

        /* renamed from: i */
        private final double f8294i;

        public C2974h(C2991a aVar, Method method, double d) {
            super(aVar, "number", method);
            this.f8294i = d;
        }

        public C2974h(C2992b bVar, Method method, int i, double d) {
            super(bVar, "number", method, i);
            this.f8294i = d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Object mo9680c(Object obj, Context context) {
            return Double.valueOf(obj == null ? this.f8294i : ((Double) obj).doubleValue());
        }
    }

    /* renamed from: com.facebook.react.uimanager.g1$i */
    private static class C2975i extends C2979m {
        public C2975i(C2991a aVar, Method method) {
            super(aVar, "mixed", method);
        }

        public C2975i(C2992b bVar, Method method, int i) {
            super(bVar, "mixed", method, i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Object mo9680c(Object obj, Context context) {
            return obj instanceof Dynamic ? obj : new DynamicFromObject(obj);
        }
    }

    /* renamed from: com.facebook.react.uimanager.g1$j */
    private static class C2976j extends C2979m {

        /* renamed from: i */
        private final float f8295i;

        public C2976j(C2991a aVar, Method method, float f) {
            super(aVar, "number", method);
            this.f8295i = f;
        }

        public C2976j(C2992b bVar, Method method, int i, float f) {
            super(bVar, "number", method, i);
            this.f8295i = f;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Object mo9680c(Object obj, Context context) {
            return Float.valueOf(obj == null ? this.f8295i : Float.valueOf(((Double) obj).floatValue()).floatValue());
        }
    }

    /* renamed from: com.facebook.react.uimanager.g1$k */
    private static class C2977k extends C2979m {

        /* renamed from: i */
        private final int f8296i;

        public C2977k(C2991a aVar, Method method, int i) {
            super(aVar, "number", method);
            this.f8296i = i;
        }

        public C2977k(C2992b bVar, Method method, int i, int i2) {
            super(bVar, "number", method, i);
            this.f8296i = i2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Object mo9680c(Object obj, Context context) {
            return Integer.valueOf(obj == null ? this.f8296i : Integer.valueOf(((Double) obj).intValue()).intValue());
        }
    }

    /* renamed from: com.facebook.react.uimanager.g1$l */
    private static class C2978l extends C2979m {
        public C2978l(C2991a aVar, Method method) {
            super(aVar, "Map", method);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Object mo9680c(Object obj, Context context) {
            return (ReadableMap) obj;
        }
    }

    /* renamed from: com.facebook.react.uimanager.g1$m */
    static abstract class C2979m {

        /* renamed from: a */
        private static final Object[] f8297a = new Object[2];

        /* renamed from: b */
        private static final Object[] f8298b = new Object[3];

        /* renamed from: c */
        private static final Object[] f8299c = new Object[1];

        /* renamed from: d */
        private static final Object[] f8300d = new Object[2];

        /* renamed from: e */
        protected final String f8301e;

        /* renamed from: f */
        protected final String f8302f;

        /* renamed from: g */
        protected final Method f8303g;

        /* renamed from: h */
        protected final Integer f8304h;

        private C2979m(C2991a aVar, String str, Method method) {
            this.f8301e = aVar.name();
            this.f8302f = !"__default_type__".equals(aVar.customType()) ? aVar.customType() : str;
            this.f8303g = method;
            this.f8304h = null;
        }

        private C2979m(C2992b bVar, String str, Method method, int i) {
            this.f8301e = bVar.names()[i];
            this.f8302f = !"__default_type__".equals(bVar.customType()) ? bVar.customType() : str;
            this.f8303g = method;
            this.f8304h = Integer.valueOf(i);
        }

        /* renamed from: a */
        public String mo9681a() {
            return this.f8301e;
        }

        /* renamed from: b */
        public String mo9682b() {
            return this.f8302f;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public abstract Object mo9680c(Object obj, Context context);

        /* renamed from: d */
        public void mo9683d(C2931d0 d0Var, Object obj) {
            try {
                Integer num = this.f8304h;
                if (num == null) {
                    Object[] objArr = f8299c;
                    objArr[0] = mo9680c(obj, d0Var.mo9506I());
                    this.f8303g.invoke(d0Var, objArr);
                    Arrays.fill(objArr, (Object) null);
                    return;
                }
                Object[] objArr2 = f8300d;
                objArr2[0] = num;
                objArr2[1] = mo9680c(obj, d0Var.mo9506I());
                this.f8303g.invoke(d0Var, objArr2);
                Arrays.fill(objArr2, (Object) null);
            } catch (Throwable th) {
                C6071a.m22872f(ViewManager.class, "Error while updating prop " + this.f8301e, th);
                throw new JSApplicationIllegalArgumentException("Error while updating property '" + this.f8301e + "' in shadow node of type: " + d0Var.mo9512O(), th);
            }
        }

        /* renamed from: e */
        public void mo9684e(ViewManager viewManager, View view, Object obj) {
            try {
                Integer num = this.f8304h;
                if (num == null) {
                    Object[] objArr = f8297a;
                    objArr[0] = view;
                    objArr[1] = mo9680c(obj, view.getContext());
                    this.f8303g.invoke(viewManager, objArr);
                    Arrays.fill(objArr, (Object) null);
                    return;
                }
                Object[] objArr2 = f8298b;
                objArr2[0] = view;
                objArr2[1] = num;
                objArr2[2] = mo9680c(obj, view.getContext());
                this.f8303g.invoke(viewManager, objArr2);
                Arrays.fill(objArr2, (Object) null);
            } catch (Throwable th) {
                C6071a.m22872f(ViewManager.class, "Error while updating prop " + this.f8301e, th);
                throw new JSApplicationIllegalArgumentException("Error while updating property '" + this.f8301e + "' of a view managed by: " + viewManager.getName(), th);
            }
        }
    }

    /* renamed from: com.facebook.react.uimanager.g1$n */
    private static class C2980n extends C2979m {
        public C2980n(C2991a aVar, Method method) {
            super(aVar, "String", method);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Object mo9680c(Object obj, Context context) {
            return (String) obj;
        }
    }

    /* renamed from: a */
    public static void m11811a() {
        f8290a.clear();
        f8291b.clear();
    }

    /* renamed from: b */
    private static C2979m m11812b(C2991a aVar, Method method, Class<?> cls) {
        if (cls == Dynamic.class) {
            return new C2975i(aVar, method);
        }
        if (cls == Boolean.TYPE) {
            return new C2969c(aVar, method, aVar.defaultBoolean());
        }
        if (cls == Integer.TYPE) {
            return "Color".equals(aVar.customType()) ? new C2973g(aVar, method, aVar.defaultInt()) : new C2977k(aVar, method, aVar.defaultInt());
        }
        if (cls == Float.TYPE) {
            return new C2976j(aVar, method, aVar.defaultFloat());
        }
        if (cls == Double.TYPE) {
            return new C2974h(aVar, method, aVar.defaultDouble());
        }
        if (cls == String.class) {
            return new C2980n(aVar, method);
        }
        if (cls == Boolean.class) {
            return new C2970d(aVar, method);
        }
        if (cls == Integer.class) {
            return "Color".equals(aVar.customType()) ? new C2971e(aVar, method) : new C2972f(aVar, method);
        }
        if (cls == ReadableArray.class) {
            return new C2968b(aVar, method);
        }
        if (cls == ReadableMap.class) {
            return new C2978l(aVar, method);
        }
        throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
    }

    /* renamed from: c */
    private static void m11813c(C2992b bVar, Method method, Class<?> cls, Map<String, C2979m> map) {
        String[] names = bVar.names();
        int i = 0;
        if (cls == Dynamic.class) {
            while (i < names.length) {
                map.put(names[i], new C2975i(bVar, method, i));
                i++;
            }
        } else if (cls == Integer.TYPE) {
            while (i < names.length) {
                map.put(names[i], new C2977k(bVar, method, i, bVar.defaultInt()));
                i++;
            }
        } else if (cls == Float.TYPE) {
            while (i < names.length) {
                map.put(names[i], new C2976j(bVar, method, i, bVar.defaultFloat()));
                i++;
            }
        } else if (cls == Double.TYPE) {
            while (i < names.length) {
                map.put(names[i], new C2974h(bVar, method, i, bVar.defaultDouble()));
                i++;
            }
        } else if (cls == Integer.class) {
            while (i < names.length) {
                map.put(names[i], new C2972f(bVar, method, i));
                i++;
            }
        } else {
            throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
        }
    }

    /* renamed from: d */
    private static void m11814d(Class<? extends C2931d0> cls, Map<String, C2979m> map) {
        for (Method method : cls.getDeclaredMethods()) {
            C2991a aVar = (C2991a) method.getAnnotation(C2991a.class);
            if (aVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    map.put(aVar.name(), m11812b(aVar, method, parameterTypes[0]));
                } else {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                }
            }
            C2992b bVar = (C2992b) method.getAnnotation(C2992b.class);
            if (bVar != null) {
                Class[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 2) {
                    throw new RuntimeException("Wrong number of args for group prop setter: " + cls.getName() + "#" + method.getName());
                } else if (parameterTypes2[0] == Integer.TYPE) {
                    m11813c(bVar, method, parameterTypes2[1], map);
                } else {
                    throw new RuntimeException("Second argument should be property index: " + cls.getName() + "#" + method.getName());
                }
            }
        }
    }

    /* renamed from: e */
    private static void m11815e(Class<? extends ViewManager> cls, Map<String, C2979m> map) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method : declaredMethods) {
            C2991a aVar = (C2991a) method.getAnnotation(C2991a.class);
            if (aVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 2) {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                } else if (View.class.isAssignableFrom(parameterTypes[0])) {
                    map.put(aVar.name(), m11812b(aVar, method, parameterTypes[1]));
                } else {
                    throw new RuntimeException("First param should be a view subclass to be updated: " + cls.getName() + "#" + method.getName());
                }
            }
            C2992b bVar = (C2992b) method.getAnnotation(C2992b.class);
            if (bVar != null) {
                Class[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 3) {
                    throw new RuntimeException("Wrong number of args for group prop setter: " + cls.getName() + "#" + method.getName());
                } else if (!View.class.isAssignableFrom(parameterTypes2[0])) {
                    throw new RuntimeException("First param should be a view subclass to be updated: " + cls.getName() + "#" + method.getName());
                } else if (parameterTypes2[1] == Integer.TYPE) {
                    m11813c(bVar, method, parameterTypes2[2], map);
                } else {
                    throw new RuntimeException("Second argument should be property index: " + cls.getName() + "#" + method.getName());
                }
            }
        }
    }

    /* renamed from: f */
    static Map<String, C2979m> m11816f(Class<? extends C2931d0> cls) {
        for (Class<C2931d0> cls2 : cls.getInterfaces()) {
            if (cls2 == C2931d0.class) {
                return f8291b;
            }
        }
        Map<Class, Map<String, C2979m>> map = f8290a;
        Map<String, C2979m> map2 = map.get(cls);
        if (map2 != null) {
            return map2;
        }
        HashMap hashMap = new HashMap(m11816f(cls.getSuperclass()));
        m11814d(cls, hashMap);
        map.put(cls, hashMap);
        return hashMap;
    }

    /* renamed from: g */
    static Map<String, C2979m> m11817g(Class<? extends ViewManager> cls) {
        if (cls == ViewManager.class) {
            return f8291b;
        }
        Map<Class, Map<String, C2979m>> map = f8290a;
        Map<String, C2979m> map2 = map.get(cls);
        if (map2 != null) {
            return map2;
        }
        HashMap hashMap = new HashMap(m11817g(cls.getSuperclass()));
        m11815e(cls, hashMap);
        map.put(cls, hashMap);
        return hashMap;
    }
}
