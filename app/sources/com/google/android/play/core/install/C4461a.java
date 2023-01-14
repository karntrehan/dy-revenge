package com.google.android.play.core.install;

import com.google.android.play.core.install.p137d.C4464a;
import p174e.p319f.p320a.p382e.p383a.p389f.C9166n;

/* renamed from: com.google.android.play.core.install.a */
public class C4461a extends C9166n {

    /* renamed from: f */
    private final int f12739f;

    public C4461a(int i) {
        super(String.format("Install Error(%d): %s", new Object[]{Integer.valueOf(i), C4464a.m17051a(i)}));
        if (i != 0) {
            this.f12739f = i;
            return;
        }
        throw new IllegalArgumentException("errorCode should not be 0.");
    }
}
