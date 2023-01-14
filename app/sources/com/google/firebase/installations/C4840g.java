package com.google.firebase.installations;

import com.google.firebase.C4871j;

/* renamed from: com.google.firebase.installations.g */
public class C4840g extends C4871j {

    /* renamed from: f */
    private final C4841a f13622f;

    /* renamed from: com.google.firebase.installations.g$a */
    public enum C4841a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public C4840g(C4841a aVar) {
        this.f13622f = aVar;
    }

    public C4840g(String str, C4841a aVar) {
        super(str);
        this.f13622f = aVar;
    }
}
