package com.google.firebase.components;

import com.google.firebase.p162p.C4927b;
import java.util.Set;

/* renamed from: com.google.firebase.components.m */
abstract class C4500m implements C4504o {
    C4500m() {
    }

    /* renamed from: a */
    public <T> T mo14013a(Class<T> cls) {
        C4927b<T> b = mo14014b(cls);
        if (b == null) {
            return null;
        }
        return b.get();
    }

    /* renamed from: d */
    public <T> Set<T> mo14016d(Class<T> cls) {
        return mo14015c(cls).get();
    }
}
