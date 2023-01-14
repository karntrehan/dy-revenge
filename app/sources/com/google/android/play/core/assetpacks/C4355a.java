package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.p136m2.C4406a;
import p174e.p319f.p320a.p382e.p383a.p389f.C9166n;

/* renamed from: com.google.android.play.core.assetpacks.a */
public class C4355a extends C9166n {

    /* renamed from: f */
    private final int f12377f;

    C4355a(int i) {
        super(String.format("Asset Pack Download Error(%d): %s", new Object[]{Integer.valueOf(i), C4406a.m16888a(i)}));
        if (i != 0) {
            this.f12377f = i;
            return;
        }
        throw new IllegalArgumentException("errorCode should not be 0.");
    }
}
