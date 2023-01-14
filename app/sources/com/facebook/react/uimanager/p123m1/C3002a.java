package com.facebook.react.uimanager.p123m1;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.BaseInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.C2693e;
import com.facebook.react.uimanager.C2981h;
import java.util.Map;

/* renamed from: com.facebook.react.uimanager.m1.a */
abstract class C3002a {

    /* renamed from: a */
    private static final Map<C3006d, BaseInterpolator> f8340a = C2693e.m10917g(C3006d.LINEAR, new LinearInterpolator(), C3006d.EASE_IN, new AccelerateInterpolator(), C3006d.EASE_OUT, new DecelerateInterpolator(), C3006d.EASE_IN_EASE_OUT, new AccelerateDecelerateInterpolator());

    /* renamed from: b */
    private Interpolator f8341b;

    /* renamed from: c */
    private int f8342c;

    /* renamed from: d */
    protected C3003b f8343d;

    /* renamed from: e */
    protected int f8344e;

    C3002a() {
    }

    /* renamed from: c */
    private static Interpolator m11895c(C3006d dVar, ReadableMap readableMap) {
        Interpolator nVar = dVar.equals(C3006d.SPRING) ? new C3021n(C3021n.m11923a(readableMap)) : f8340a.get(dVar);
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalArgumentException("Missing interpolator for type : " + dVar);
    }

    /* renamed from: a */
    public final Animation mo9738a(View view, int i, int i2, int i3, int i4) {
        if (!mo9741e()) {
            return null;
        }
        Animation b = mo9739b(view, i, i2, i3, i4);
        if (b != null) {
            b.setDuration((long) (this.f8344e * 1));
            b.setStartOffset((long) (this.f8342c * 1));
            b.setInterpolator(this.f8341b);
        }
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract Animation mo9739b(View view, int i, int i2, int i3, int i4);

    /* renamed from: d */
    public void mo9740d(ReadableMap readableMap, int i) {
        this.f8343d = readableMap.hasKey("property") ? C3003b.m11901e(readableMap.getString("property")) : null;
        if (readableMap.hasKey("duration")) {
            i = readableMap.getInt("duration");
        }
        this.f8344e = i;
        this.f8342c = readableMap.hasKey("delay") ? readableMap.getInt("delay") : 0;
        if (readableMap.hasKey("type")) {
            this.f8341b = m11895c(C3006d.m11905e(readableMap.getString("type")), readableMap);
            if (!mo9741e()) {
                throw new C2981h("Invalid layout animation : " + readableMap);
            }
            return;
        }
        throw new IllegalArgumentException("Missing interpolation type.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract boolean mo9741e();

    /* renamed from: f */
    public void mo9742f() {
        this.f8343d = null;
        this.f8344e = 0;
        this.f8342c = 0;
        this.f8341b = null;
    }
}
