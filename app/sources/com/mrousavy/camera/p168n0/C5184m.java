package com.mrousavy.camera.p168n0;

import java.util.Collection;
import java.util.List;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.mrousavy.camera.n0.m */
public final class C5184m {
    /* renamed from: a */
    public static final <T> boolean m19465a(List<? extends T> list, List<? extends T> list2) {
        C10457l.m35320e(list, "<this>");
        C10457l.m35320e(list2, "elements");
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (T contains : list2) {
            if (list.contains(contains)) {
                return true;
            }
        }
        return false;
    }
}
