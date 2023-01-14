package com.google.mlkit.vision.text.internal;

import java.util.Comparator;
import java.util.Map;

/* renamed from: com.google.mlkit.vision.text.internal.h */
public final /* synthetic */ class C4993h implements Comparator {

    /* renamed from: f */
    public static final /* synthetic */ C4993h f13917f = new C4993h();

    private /* synthetic */ C4993h() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((Integer) ((Map.Entry) obj).getValue()).compareTo((Integer) ((Map.Entry) obj2).getValue());
    }
}
