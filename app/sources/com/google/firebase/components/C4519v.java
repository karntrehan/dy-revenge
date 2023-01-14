package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.firebase.components.v */
public class C4519v extends C4520w {

    /* renamed from: f */
    private final List<C4501n<?>> f12842f;

    public C4519v(List<C4501n<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f12842f = list;
    }
}
