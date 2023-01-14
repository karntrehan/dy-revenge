package com.mrousavy.camera.p167m0;

import android.util.Size;
import android.util.SizeF;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.mrousavy.camera.m0.c */
public final class C5169c {
    /* renamed from: a */
    public static final boolean m19434a(Size size, Size size2) {
        C10457l.m35320e(size, "size1");
        C10457l.m35320e(size2, "size2");
        return size.getWidth() * size.getHeight() == size2.getWidth() * size2.getHeight();
    }

    /* renamed from: b */
    public static final float m19435b(SizeF sizeF) {
        C10457l.m35320e(sizeF, "<this>");
        return Math.max(sizeF.getWidth(), sizeF.getHeight());
    }

    /* renamed from: c */
    public static final int m19436c(Size size) {
        C10457l.m35320e(size, "<this>");
        return Math.max(size.getWidth(), size.getHeight());
    }
}
