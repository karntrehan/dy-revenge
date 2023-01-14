package androidx.lifecycle;

import androidx.lifecycle.C1286d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.a */
class C1281a {

    /* renamed from: a */
    static C1281a f3707a = new C1281a();

    /* renamed from: b */
    private final Map<Class<?>, C1282a> f3708b = new HashMap();

    /* renamed from: c */
    private final Map<Class<?>, Boolean> f3709c = new HashMap();

    /* renamed from: androidx.lifecycle.a$a */
    static class C1282a {

        /* renamed from: a */
        final Map<C1286d.C1287a, List<C1283b>> f3710a = new HashMap();

        /* renamed from: b */
        final Map<C1283b, C1286d.C1287a> f3711b;

        C1282a(Map<C1283b, C1286d.C1287a> map) {
            this.f3711b = map;
            for (Map.Entry next : map.entrySet()) {
                C1286d.C1287a aVar = (C1286d.C1287a) next.getValue();
                List list = this.f3710a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f3710a.put(aVar, list);
                }
                list.add(next.getKey());
            }
        }

        /* renamed from: b */
        private static void m5292b(List<C1283b> list, C1291g gVar, C1286d.C1287a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).mo4328a(gVar, aVar, obj);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4327a(C1291g gVar, C1286d.C1287a aVar, Object obj) {
            m5292b(this.f3710a.get(aVar), gVar, aVar, obj);
            m5292b(this.f3710a.get(C1286d.C1287a.ON_ANY), gVar, aVar, obj);
        }
    }

    /* renamed from: androidx.lifecycle.a$b */
    static class C1283b {

        /* renamed from: a */
        final int f3712a;

        /* renamed from: b */
        final Method f3713b;

        C1283b(int i, Method method) {
            this.f3712a = i;
            this.f3713b = method;
            method.setAccessible(true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4328a(C1291g gVar, C1286d.C1287a aVar, Object obj) {
            try {
                int i = this.f3712a;
                if (i == 0) {
                    this.f3713b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f3713b.invoke(obj, new Object[]{gVar});
                } else if (i == 2) {
                    this.f3713b.invoke(obj, new Object[]{gVar, aVar});
                }
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Failed to call observer method", e.getCause());
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C1283b.class != obj.getClass()) {
                return false;
            }
            C1283b bVar = (C1283b) obj;
            return this.f3712a == bVar.f3712a && this.f3713b.getName().equals(bVar.f3713b.getName());
        }

        public int hashCode() {
            return (this.f3712a * 31) + this.f3713b.getName().hashCode();
        }
    }

    C1281a() {
    }

    /* renamed from: a */
    private C1282a m5287a(Class<?> cls, Method[] methodArr) {
        int i;
        C1282a c;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (c = mo4325c(superclass)) == null)) {
            hashMap.putAll(c.f3711b);
        }
        for (Class c2 : cls.getInterfaces()) {
            for (Map.Entry next : mo4325c(c2).f3711b.entrySet()) {
                m5289e(hashMap, (C1283b) next.getKey(), (C1286d.C1287a) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m5288b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            C1302o oVar = (C1302o) method.getAnnotation(C1302o.class);
            if (oVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(C1291g.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C1286d.C1287a value = oVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(C1286d.C1287a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == C1286d.C1287a.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m5289e(hashMap, new C1283b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C1282a aVar = new C1282a(hashMap);
        this.f3708b.put(cls, aVar);
        this.f3709c.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* renamed from: b */
    private Method[] m5288b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* renamed from: e */
    private void m5289e(Map<C1283b, C1286d.C1287a> map, C1283b bVar, C1286d.C1287a aVar, Class<?> cls) {
        C1286d.C1287a aVar2 = map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f3713b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C1282a mo4325c(Class<?> cls) {
        C1282a aVar = this.f3708b.get(cls);
        return aVar != null ? aVar : m5287a(cls, (Method[]) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo4326d(Class<?> cls) {
        Boolean bool = this.f3709c.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b = m5288b(cls);
        for (Method annotation : b) {
            if (((C1302o) annotation.getAnnotation(C1302o.class)) != null) {
                m5287a(cls, b);
                return true;
            }
        }
        this.f3709c.put(cls, Boolean.FALSE);
        return false;
    }
}
