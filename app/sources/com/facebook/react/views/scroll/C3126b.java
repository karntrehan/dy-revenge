package com.facebook.react.views.scroll;

import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.facebook.react.views.scroll.b */
public class C3126b {

    /* renamed from: a */
    private int f8689a = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: b */
    private int f8690b = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: c */
    private float f8691c = 0.0f;

    /* renamed from: d */
    private float f8692d = 0.0f;

    /* renamed from: e */
    private long f8693e = -11;

    /* renamed from: a */
    public float mo10123a() {
        return this.f8691c;
    }

    /* renamed from: b */
    public float mo10124b() {
        return this.f8692d;
    }

    /* renamed from: c */
    public boolean mo10125c(int i, int i2) {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.f8693e;
        boolean z = (uptimeMillis - j <= 10 && this.f8689a == i && this.f8690b == i2) ? false : true;
        if (uptimeMillis - j != 0) {
            this.f8691c = ((float) (i - this.f8689a)) / ((float) (uptimeMillis - j));
            this.f8692d = ((float) (i2 - this.f8690b)) / ((float) (uptimeMillis - j));
        }
        this.f8693e = uptimeMillis;
        this.f8689a = i;
        this.f8690b = i2;
        return z;
    }
}
