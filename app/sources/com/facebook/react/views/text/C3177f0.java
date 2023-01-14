package com.facebook.react.views.text;

import android.graphics.Typeface;
import android.os.Build;

/* renamed from: com.facebook.react.views.text.f0 */
class C3177f0 {

    /* renamed from: a */
    private final boolean f8885a;

    /* renamed from: b */
    private final int f8886b;

    public C3177f0(int i) {
        boolean z = false;
        i = i == -1 ? 0 : i;
        this.f8885a = (i & 2) != 0 ? true : z;
        this.f8886b = (i & 1) != 0 ? 700 : 400;
    }

    public C3177f0(int i, int i2) {
        boolean z = false;
        i = i == -1 ? 0 : i;
        this.f8885a = (i & 2) != 0 ? true : z;
        this.f8886b = i2 == -1 ? (i & 1) != 0 ? 700 : 400 : i2;
    }

    /* renamed from: a */
    public Typeface mo10328a(Typeface typeface) {
        return Build.VERSION.SDK_INT < 28 ? Typeface.create(typeface, mo10329b()) : Typeface.create(typeface, this.f8886b, this.f8885a);
    }

    /* renamed from: b */
    public int mo10329b() {
        return this.f8886b < 700 ? this.f8885a ? 2 : 0 : this.f8885a ? 3 : 1;
    }
}
