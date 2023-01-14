package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import p174e.p247e.p253d.p257d.C6062k;

/* renamed from: com.facebook.imagepipeline.memory.f0 */
public class C2408f0 {

    /* renamed from: a */
    public final int f7172a;

    /* renamed from: b */
    public final int f7173b;

    /* renamed from: c */
    public final SparseIntArray f7174c;

    /* renamed from: d */
    public final int f7175d;

    /* renamed from: e */
    public final int f7176e;

    /* renamed from: f */
    public boolean f7177f;

    /* renamed from: g */
    public final int f7178g;

    public C2408f0(int i, int i2, SparseIntArray sparseIntArray) {
        this(i, i2, sparseIntArray, 0, RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO, -1);
    }

    public C2408f0(int i, int i2, SparseIntArray sparseIntArray, int i3, int i4, int i5) {
        C6062k.m22841i(i >= 0 && i2 >= i);
        this.f7173b = i;
        this.f7172a = i2;
        this.f7174c = sparseIntArray;
        this.f7175d = i3;
        this.f7176e = i4;
        this.f7178g = i5;
    }
}
