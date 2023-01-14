package com.facebook.imageutils;

import android.graphics.ColorSpace;
import android.util.Pair;

/* renamed from: com.facebook.imageutils.b */
public class C2569b {

    /* renamed from: a */
    private final Pair<Integer, Integer> f7559a;

    /* renamed from: b */
    private final ColorSpace f7560b;

    public C2569b(int i, int i2, ColorSpace colorSpace) {
        this.f7559a = (i == -1 || i2 == -1) ? null : new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
        this.f7560b = colorSpace;
    }

    /* renamed from: a */
    public ColorSpace mo8365a() {
        return this.f7560b;
    }

    /* renamed from: b */
    public Pair<Integer, Integer> mo8366b() {
        return this.f7559a;
    }
}
