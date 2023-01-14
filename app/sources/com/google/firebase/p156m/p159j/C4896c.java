package com.google.firebase.p156m.p159j;

import com.google.firebase.p156m.p159j.C4900f;
import java.lang.annotation.Annotation;

/* renamed from: com.google.firebase.m.j.c */
public final class C4896c {

    /* renamed from: a */
    private int f13734a;

    /* renamed from: b */
    private C4900f.C4901a f13735b = C4900f.C4901a.DEFAULT;

    /* renamed from: com.google.firebase.m.j.c$a */
    private static final class C4897a implements C4900f {

        /* renamed from: a */
        private final int f13736a;

        /* renamed from: b */
        private final C4900f.C4901a f13737b;

        C4897a(int i, C4900f.C4901a aVar) {
            this.f13736a = i;
            this.f13737b = aVar;
        }

        public Class<? extends Annotation> annotationType() {
            return C4900f.class;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4900f)) {
                return false;
            }
            C4900f fVar = (C4900f) obj;
            return this.f13736a == fVar.tag() && this.f13737b.equals(fVar.intEncoding());
        }

        public int hashCode() {
            return (this.f13736a ^ 14552422) + (this.f13737b.hashCode() ^ 2041407134);
        }

        public C4900f.C4901a intEncoding() {
            return this.f13737b;
        }

        public int tag() {
            return this.f13736a;
        }

        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf" + '(' + "tag=" + this.f13736a + "intEncoding=" + this.f13737b + ')';
        }
    }

    /* renamed from: b */
    public static C4896c m18714b() {
        return new C4896c();
    }

    /* renamed from: a */
    public C4900f mo14880a() {
        return new C4897a(this.f13734a, this.f13735b);
    }

    /* renamed from: c */
    public C4896c mo14881c(int i) {
        this.f13734a = i;
        return this;
    }
}
