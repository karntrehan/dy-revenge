package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.uimanager.C2966g1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p174e.p247e.p253d.p258e.C6071a;

/* renamed from: com.facebook.react.uimanager.d1 */
public class C2932d1 {

    /* renamed from: a */
    private static final Map<Class<?>, C2938f<?, ?>> f8209a = new HashMap();

    /* renamed from: b */
    private static final Map<Class<?>, C2937e<?>> f8210b = new HashMap();

    /* renamed from: com.facebook.react.uimanager.d1$b */
    private static class C2934b<T extends C2931d0> implements C2937e<T> {

        /* renamed from: a */
        private final Map<String, C2966g1.C2979m> f8211a;

        private C2934b(Class<? extends C2931d0> cls) {
            this.f8211a = C2966g1.m11816f(cls);
        }

        /* renamed from: a */
        public void mo9555a(Map<String, String> map) {
            for (C2966g1.C2979m next : this.f8211a.values()) {
                map.put(next.mo9681a(), next.mo9682b());
            }
        }

        /* renamed from: c */
        public void mo9556c(C2931d0 d0Var, String str, Object obj) {
            C2966g1.C2979m mVar = this.f8211a.get(str);
            if (mVar != null) {
                mVar.mo9683d(d0Var, obj);
            }
        }
    }

    /* renamed from: com.facebook.react.uimanager.d1$c */
    private static class C2935c<T extends ViewManager, V extends View> implements C2938f<T, V> {

        /* renamed from: a */
        private final Map<String, C2966g1.C2979m> f8212a;

        private C2935c(Class<? extends ViewManager> cls) {
            this.f8212a = C2966g1.m11817g(cls);
        }

        /* renamed from: a */
        public void mo9555a(Map<String, String> map) {
            for (C2966g1.C2979m next : this.f8212a.values()) {
                map.put(next.mo9681a(), next.mo9682b());
            }
        }

        /* renamed from: b */
        public void mo9557b(T t, V v, String str, Object obj) {
            C2966g1.C2979m mVar = this.f8212a.get(str);
            if (mVar != null) {
                mVar.mo9684e(t, v, obj);
            }
        }
    }

    /* renamed from: com.facebook.react.uimanager.d1$d */
    public interface C2936d {
        /* renamed from: a */
        void mo9555a(Map<String, String> map);
    }

    /* renamed from: com.facebook.react.uimanager.d1$e */
    public interface C2937e<T extends C2931d0> extends C2936d {
        /* renamed from: c */
        void mo9556c(T t, String str, Object obj);
    }

    /* renamed from: com.facebook.react.uimanager.d1$f */
    public interface C2938f<T extends ViewManager, V extends View> extends C2936d {
        /* renamed from: b */
        void mo9557b(T t, V v, String str, Object obj);
    }

    /* renamed from: a */
    public static void m11573a() {
        C2966g1.m11811a();
        f8209a.clear();
        f8210b.clear();
    }

    /* renamed from: b */
    private static <T> T m11574b(Class<?> cls) {
        String name = cls.getName();
        try {
            return Class.forName(name + "$$PropsSetter").newInstance();
        } catch (ClassNotFoundException unused) {
            C6071a.m22859G("ViewManagerPropertyUpdater", "Could not find generated setter for " + cls);
            return null;
        } catch (IllegalAccessException | InstantiationException e) {
            throw new RuntimeException("Unable to instantiate methods getter for " + name, e);
        }
    }

    /* renamed from: c */
    private static <T extends ViewManager, V extends View> C2938f<T, V> m11575c(Class<? extends ViewManager> cls) {
        Map<Class<?>, C2938f<?, ?>> map = f8209a;
        C2938f<T, V> fVar = map.get(cls);
        if (fVar == null) {
            fVar = (C2938f) m11574b(cls);
            if (fVar == null) {
                fVar = new C2935c<>(cls);
            }
            map.put(cls, fVar);
        }
        return fVar;
    }

    /* renamed from: d */
    private static <T extends C2931d0> C2937e<T> m11576d(Class<? extends C2931d0> cls) {
        Map<Class<?>, C2937e<?>> map = f8210b;
        C2937e<T> eVar = map.get(cls);
        if (eVar == null) {
            eVar = (C2937e) m11574b(cls);
            if (eVar == null) {
                eVar = new C2934b<>(cls);
            }
            map.put(cls, eVar);
        }
        return eVar;
    }

    /* renamed from: e */
    public static Map<String, String> m11577e(Class<? extends ViewManager> cls, Class<? extends C2931d0> cls2) {
        HashMap hashMap = new HashMap();
        m11575c(cls).mo9555a(hashMap);
        m11576d(cls2).mo9555a(hashMap);
        return hashMap;
    }

    /* renamed from: f */
    public static <T extends C2931d0> void m11578f(T t, C2962f0 f0Var) {
        C2937e<?> d = m11576d(t.getClass());
        Iterator<Map.Entry<String, Object>> entryIterator = f0Var.f8288a.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry next = entryIterator.next();
            d.mo9556c(t, (String) next.getKey(), next.getValue());
        }
    }

    /* renamed from: g */
    public static <T extends ViewManager, V extends View> void m11579g(T t, V v, C2962f0 f0Var) {
        C2938f<?, V> c = m11575c(t.getClass());
        Iterator<Map.Entry<String, Object>> entryIterator = f0Var.f8288a.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry next = entryIterator.next();
            c.mo9557b(t, v, (String) next.getKey(), next.getValue());
        }
    }

    /* renamed from: h */
    public static <T extends C2928c1<V>, V extends View> void m11580h(T t, V v, C2962f0 f0Var) {
        Iterator<Map.Entry<String, Object>> entryIterator = f0Var.f8288a.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry next = entryIterator.next();
            t.mo8908b(v, (String) next.getKey(), next.getValue());
        }
    }
}
