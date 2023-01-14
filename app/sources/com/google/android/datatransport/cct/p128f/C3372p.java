package com.google.android.datatransport.cct.p128f;

import android.util.SparseArray;

/* renamed from: com.google.android.datatransport.cct.f.p */
public enum C3372p {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: t */
    private static final SparseArray<C3372p> f9580t = null;

    /* renamed from: v */
    private final int f9582v;

    static {
        C3372p pVar;
        C3372p pVar2;
        C3372p pVar3;
        C3372p pVar4;
        C3372p pVar5;
        C3372p pVar6;
        SparseArray<C3372p> sparseArray = new SparseArray<>();
        f9580t = sparseArray;
        sparseArray.put(0, pVar);
        sparseArray.put(1, pVar2);
        sparseArray.put(2, pVar3);
        sparseArray.put(3, pVar4);
        sparseArray.put(4, pVar5);
        sparseArray.put(-1, pVar6);
    }

    private C3372p(int i) {
        this.f9582v = i;
    }
}
