package com.google.firebase.p156m.p159j;

/* renamed from: com.google.firebase.m.j.f */
public @interface C4900f {

    /* renamed from: com.google.firebase.m.j.f$a */
    public enum C4901a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    C4901a intEncoding() default C4901a.DEFAULT;

    int tag();
}
