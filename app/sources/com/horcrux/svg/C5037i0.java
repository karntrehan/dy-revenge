package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.p120j1.C2991a;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.i0 */
class C5037i0 extends C5062u0 {

    /* renamed from: j1 */
    private String f14105j1;

    /* renamed from: k1 */
    private C5058s0 f14106k1;

    /* renamed from: l1 */
    private C5056r0 f14107l1;

    /* renamed from: m1 */
    private C5020c0 f14108m1;

    /* renamed from: n1 */
    private C5054q0 f14109n1 = C5054q0.align;

    /* renamed from: o1 */
    private C5060t0 f14110o1 = C5060t0.exact;

    public C5037i0(ReactContext reactContext) {
        super(reactContext);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo15193F(Canvas canvas, Paint paint, float f) {
        mo15264c0(canvas, paint, f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public Path mo15183I(Canvas canvas, Paint paint) {
        return mo15360n0(canvas, paint);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public void mo15270h0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public void mo15271i0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r0 */
    public C5056r0 mo15272r0() {
        return this.f14107l1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s0 */
    public C5058s0 mo15273s0() {
        return this.f14106k1;
    }

    @C2991a(name = "href")
    public void setHref(String str) {
        this.f14105j1 = str;
        invalidate();
    }

    @C2991a(name = "method")
    public void setMethod(String str) {
        this.f14109n1 = C5054q0.valueOf(str);
        invalidate();
    }

    @C2991a(name = "midLine")
    public void setSharp(String str) {
        this.f14107l1 = C5056r0.valueOf(str);
        invalidate();
    }

    @C2991a(name = "side")
    public void setSide(String str) {
        this.f14106k1 = C5058s0.valueOf(str);
        invalidate();
    }

    @C2991a(name = "spacing")
    public void setSpacing(String str) {
        this.f14110o1 = C5060t0.valueOf(str);
        invalidate();
    }

    @C2991a(name = "startOffset")
    public void setStartOffset(Dynamic dynamic) {
        this.f14108m1 = C5020c0.m18971b(dynamic);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public C5020c0 mo15280t0() {
        return this.f14108m1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public Path mo15281u0(Canvas canvas, Paint paint) {
        C5070x0 O = getSvgView().mo15230O(this.f14105j1);
        if (!(O instanceof C5017b0)) {
            return null;
        }
        return ((C5017b0) O).mo15183I(canvas, paint);
    }
}
