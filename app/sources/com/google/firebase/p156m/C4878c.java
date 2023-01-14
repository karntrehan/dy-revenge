package com.google.firebase.p156m;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.firebase.m.c */
public final class C4878c {

    /* renamed from: a */
    private final String f13708a;

    /* renamed from: b */
    private final Map<Class<?>, Object> f13709b;

    /* renamed from: com.google.firebase.m.c$b */
    public static final class C4880b {

        /* renamed from: a */
        private final String f13710a;

        /* renamed from: b */
        private Map<Class<?>, Object> f13711b = null;

        C4880b(String str) {
            this.f13710a = str;
        }

        /* renamed from: a */
        public C4878c mo14852a() {
            return new C4878c(this.f13710a, this.f13711b == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.f13711b)));
        }

        /* renamed from: b */
        public <T extends Annotation> C4880b mo14853b(T t) {
            if (this.f13711b == null) {
                this.f13711b = new HashMap();
            }
            this.f13711b.put(t.annotationType(), t);
            return this;
        }
    }

    private C4878c(String str, Map<Class<?>, Object> map) {
        this.f13708a = str;
        this.f13709b = map;
    }

    /* renamed from: a */
    public static C4880b m18654a(String str) {
        return new C4880b(str);
    }

    /* renamed from: d */
    public static C4878c m18655d(String str) {
        return new C4878c(str, Collections.emptyMap());
    }

    /* renamed from: b */
    public String mo14847b() {
        return this.f13708a;
    }

    /* renamed from: c */
    public <T extends Annotation> T mo14848c(Class<T> cls) {
        return (Annotation) this.f13709b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4878c)) {
            return false;
        }
        C4878c cVar = (C4878c) obj;
        return this.f13708a.equals(cVar.f13708a) && this.f13709b.equals(cVar.f13709b);
    }

    public int hashCode() {
        return (this.f13708a.hashCode() * 31) + this.f13709b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f13708a + ", properties=" + this.f13709b.values() + "}";
    }
}
