package com.facebook.react.common;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.react.common.e */
public class C2693e {

    /* renamed from: com.facebook.react.common.e$b */
    public static final class C2695b<K, V> {

        /* renamed from: a */
        private Map f7782a;

        /* renamed from: b */
        private boolean f7783b;

        private C2695b() {
            this.f7782a = C2693e.m10912b();
            this.f7783b = true;
        }

        /* renamed from: a */
        public Map<K, V> mo8814a() {
            if (this.f7783b) {
                this.f7783b = false;
                return this.f7782a;
            }
            throw new IllegalStateException("Underlying map has already been built");
        }

        /* renamed from: b */
        public C2695b<K, V> mo8815b(K k, V v) {
            if (this.f7783b) {
                this.f7782a.put(k, v);
                return this;
            }
            throw new IllegalStateException("Underlying map has already been built");
        }
    }

    /* renamed from: a */
    public static <K, V> C2695b<K, V> m10911a() {
        return new C2695b<>();
    }

    /* renamed from: b */
    public static <K, V> HashMap<K, V> m10912b() {
        return new HashMap<>();
    }

    /* renamed from: c */
    public static <K, V> Map<K, V> m10913c() {
        return m10912b();
    }

    /* renamed from: d */
    public static <K, V> Map<K, V> m10914d(K k, V v) {
        Map<K, V> c = m10913c();
        c.put(k, v);
        return c;
    }

    /* renamed from: e */
    public static <K, V> Map<K, V> m10915e(K k, V v, K k2, V v2) {
        Map<K, V> c = m10913c();
        c.put(k, v);
        c.put(k2, v2);
        return c;
    }

    /* renamed from: f */
    public static <K, V> Map<K, V> m10916f(K k, V v, K k2, V v2, K k3, V v3) {
        Map<K, V> c = m10913c();
        c.put(k, v);
        c.put(k2, v2);
        c.put(k3, v3);
        return c;
    }

    /* renamed from: g */
    public static <K, V> Map<K, V> m10917g(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        Map<K, V> c = m10913c();
        c.put(k, v);
        c.put(k2, v2);
        c.put(k3, v3);
        c.put(k4, v4);
        return c;
    }

    /* renamed from: h */
    public static <K, V> Map<K, V> m10918h(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        Map<K, V> c = m10913c();
        c.put(k, v);
        c.put(k2, v2);
        c.put(k3, v3);
        c.put(k4, v4);
        c.put(k5, v5);
        return c;
    }

    /* renamed from: i */
    public static <K, V> Map<K, V> m10919i(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
        Map<K, V> c = m10913c();
        c.put(k, v);
        c.put(k2, v2);
        c.put(k3, v3);
        c.put(k4, v4);
        c.put(k5, v5);
        c.put(k6, v6);
        c.put(k7, v7);
        return c;
    }
}
