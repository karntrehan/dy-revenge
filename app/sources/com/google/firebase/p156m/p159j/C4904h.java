package com.google.firebase.p156m.p159j;

import com.google.firebase.p156m.C4877b;
import com.google.firebase.p156m.C4881d;
import com.google.firebase.p156m.C4882e;
import com.google.firebase.p156m.C4883f;
import com.google.firebase.p156m.p157h.C4885a;
import com.google.firebase.p156m.p157h.C4886b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.firebase.m.j.h */
public class C4904h {

    /* renamed from: a */
    private final Map<Class<?>, C4881d<?>> f13753a;

    /* renamed from: b */
    private final Map<Class<?>, C4883f<?>> f13754b;

    /* renamed from: c */
    private final C4881d<Object> f13755c;

    /* renamed from: com.google.firebase.m.j.h$a */
    public static final class C4905a implements C4886b<C4905a> {

        /* renamed from: a */
        private static final C4881d<Object> f13756a = C4895b.f13733a;

        /* renamed from: b */
        private final Map<Class<?>, C4881d<?>> f13757b = new HashMap();

        /* renamed from: c */
        private final Map<Class<?>, C4883f<?>> f13758c = new HashMap();

        /* renamed from: d */
        private C4881d<Object> f13759d = f13756a;

        /* renamed from: d */
        static /* synthetic */ void m18745d(Object obj, C4882e eVar) {
            throw new C4877b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        /* renamed from: b */
        public C4904h mo14905b() {
            return new C4904h(new HashMap(this.f13757b), new HashMap(this.f13758c), this.f13759d);
        }

        /* renamed from: c */
        public C4905a mo14906c(C4885a aVar) {
            aVar.mo10874a(this);
            return this;
        }

        /* renamed from: e */
        public <U> C4905a mo14861a(Class<U> cls, C4881d<? super U> dVar) {
            this.f13757b.put(cls, dVar);
            this.f13758c.remove(cls);
            return this;
        }
    }

    C4904h(Map<Class<?>, C4881d<?>> map, Map<Class<?>, C4883f<?>> map2, C4881d<Object> dVar) {
        this.f13753a = map;
        this.f13754b = map2;
        this.f13755c = dVar;
    }

    /* renamed from: a */
    public static C4905a m18742a() {
        return new C4905a();
    }

    /* renamed from: b */
    public void mo14903b(Object obj, OutputStream outputStream) {
        new C4902g(outputStream, this.f13753a, this.f13754b, this.f13755c).mo14902r(obj);
    }

    /* renamed from: c */
    public byte[] mo14904c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            mo14903b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
