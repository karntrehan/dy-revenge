package com.facebook.react.views.text;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.C3038r;

/* renamed from: com.facebook.react.views.text.z */
public class C3205z {

    /* renamed from: a */
    private boolean f9015a = true;

    /* renamed from: b */
    private float f9016b = Float.NaN;

    /* renamed from: c */
    private float f9017c = Float.NaN;

    /* renamed from: d */
    private float f9018d = Float.NaN;

    /* renamed from: e */
    private float f9019e = Float.NaN;

    /* renamed from: f */
    private float f9020f = Float.NaN;

    /* renamed from: g */
    private C3174e0 f9021g = C3174e0.UNSET;

    /* renamed from: a */
    public C3205z mo10418a(C3205z zVar) {
        C3205z zVar2 = new C3205z();
        zVar2.f9015a = this.f9015a;
        zVar2.f9016b = !Float.isNaN(zVar.f9016b) ? zVar.f9016b : this.f9016b;
        zVar2.f9017c = !Float.isNaN(zVar.f9017c) ? zVar.f9017c : this.f9017c;
        zVar2.f9018d = !Float.isNaN(zVar.f9018d) ? zVar.f9018d : this.f9018d;
        zVar2.f9019e = !Float.isNaN(zVar.f9019e) ? zVar.f9019e : this.f9019e;
        zVar2.f9020f = !Float.isNaN(zVar.f9020f) ? zVar.f9020f : this.f9020f;
        C3174e0 e0Var = zVar.f9021g;
        if (e0Var == C3174e0.UNSET) {
            e0Var = this.f9021g;
        }
        zVar2.f9021g = e0Var;
        return zVar2;
    }

    /* renamed from: b */
    public boolean mo10419b() {
        return this.f9015a;
    }

    /* renamed from: c */
    public int mo10420c() {
        float f = !Float.isNaN(this.f9016b) ? this.f9016b : 14.0f;
        return (int) Math.ceil((double) (this.f9015a ? C3038r.m12009f(f, mo10423f()) : C3038r.m12006c(f)));
    }

    /* renamed from: d */
    public float mo10421d() {
        if (Float.isNaN(this.f9018d)) {
            return Float.NaN;
        }
        return (this.f9015a ? C3038r.m12009f(this.f9018d, mo10423f()) : C3038r.m12006c(this.f9018d)) / ((float) mo10420c());
    }

    /* renamed from: e */
    public float mo10422e() {
        if (Float.isNaN(this.f9017c)) {
            return Float.NaN;
        }
        float f = this.f9015a ? C3038r.m12009f(this.f9017c, mo10423f()) : C3038r.m12006c(this.f9017c);
        return !Float.isNaN(this.f9020f) && (this.f9020f > f ? 1 : (this.f9020f == f ? 0 : -1)) > 0 ? this.f9020f : f;
    }

    /* renamed from: f */
    public float mo10423f() {
        if (!Float.isNaN(this.f9019e)) {
            return this.f9019e;
        }
        return 0.0f;
    }

    /* renamed from: g */
    public float mo10424g() {
        return this.f9016b;
    }

    /* renamed from: h */
    public float mo10425h() {
        return this.f9020f;
    }

    /* renamed from: i */
    public float mo10426i() {
        return this.f9018d;
    }

    /* renamed from: j */
    public float mo10427j() {
        return this.f9017c;
    }

    /* renamed from: k */
    public float mo10428k() {
        return this.f9019e;
    }

    /* renamed from: l */
    public C3174e0 mo10429l() {
        return this.f9021g;
    }

    /* renamed from: m */
    public void mo10430m(boolean z) {
        this.f9015a = z;
    }

    /* renamed from: n */
    public void mo10431n(float f) {
        this.f9016b = f;
    }

    /* renamed from: o */
    public void mo10432o(float f) {
        this.f9020f = f;
    }

    /* renamed from: p */
    public void mo10433p(float f) {
        this.f9018d = f;
    }

    /* renamed from: q */
    public void mo10434q(float f) {
        this.f9017c = f;
    }

    /* renamed from: r */
    public void mo10435r(float f) {
        if (f == 0.0f || f >= 1.0f) {
            this.f9019e = f;
            return;
        }
        throw new JSApplicationIllegalArgumentException("maxFontSizeMultiplier must be NaN, 0, or >= 1");
    }

    /* renamed from: s */
    public void mo10436s(C3174e0 e0Var) {
        this.f9021g = e0Var;
    }

    public String toString() {
        return "TextAttributes {\n  getAllowFontScaling(): " + mo10419b() + "\n  getFontSize(): " + mo10424g() + "\n  getEffectiveFontSize(): " + mo10420c() + "\n  getHeightOfTallestInlineViewOrImage(): " + mo10425h() + "\n  getLetterSpacing(): " + mo10426i() + "\n  getEffectiveLetterSpacing(): " + mo10421d() + "\n  getLineHeight(): " + mo10427j() + "\n  getEffectiveLineHeight(): " + mo10422e() + "\n  getTextTransform(): " + mo10429l() + "\n  getMaxFontSizeMultiplier(): " + mo10428k() + "\n  getEffectiveMaxFontSizeMultiplier(): " + mo10423f() + "\n}";
    }
}
