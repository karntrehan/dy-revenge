package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.core.graphics.drawable.C1164a;
import com.google.android.material.internal.C4274h;
import p027c.p064i.p072j.C1988t;
import p174e.p319f.p320a.p363d.C9013b;
import p174e.p319f.p320a.p363d.C9024k;
import p174e.p319f.p320a.p363d.p364a0.C8990g;
import p174e.p319f.p320a.p363d.p364a0.C8997k;
import p174e.p319f.p320a.p363d.p364a0.C9012n;
import p174e.p319f.p320a.p363d.p372q.C9052a;
import p174e.p319f.p320a.p363d.p379x.C9062c;
import p174e.p319f.p320a.p363d.p380y.C9068a;
import p174e.p319f.p320a.p363d.p380y.C9071b;

/* renamed from: com.google.android.material.button.a */
class C4179a {

    /* renamed from: a */
    private static final boolean f11689a = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: b */
    private final MaterialButton f11690b;

    /* renamed from: c */
    private C8997k f11691c;

    /* renamed from: d */
    private int f11692d;

    /* renamed from: e */
    private int f11693e;

    /* renamed from: f */
    private int f11694f;

    /* renamed from: g */
    private int f11695g;

    /* renamed from: h */
    private int f11696h;

    /* renamed from: i */
    private int f11697i;

    /* renamed from: j */
    private PorterDuff.Mode f11698j;

    /* renamed from: k */
    private ColorStateList f11699k;

    /* renamed from: l */
    private ColorStateList f11700l;

    /* renamed from: m */
    private ColorStateList f11701m;

    /* renamed from: n */
    private Drawable f11702n;

    /* renamed from: o */
    private boolean f11703o = false;

    /* renamed from: p */
    private boolean f11704p = false;

    /* renamed from: q */
    private boolean f11705q = false;

    /* renamed from: r */
    private boolean f11706r;

    /* renamed from: s */
    private LayerDrawable f11707s;

    C4179a(MaterialButton materialButton, C8997k kVar) {
        this.f11690b = materialButton;
        this.f11691c = kVar;
    }

    /* renamed from: A */
    private void m15796A(C8997k kVar) {
        if (mo12819d() != null) {
            mo12819d().setShapeAppearanceModel(kVar);
        }
        if (m15801l() != null) {
            m15801l().setShapeAppearanceModel(kVar);
        }
        if (mo12818c() != null) {
            mo12818c().setShapeAppearanceModel(kVar);
        }
    }

    /* renamed from: C */
    private void m15797C() {
        C8990g d = mo12819d();
        C8990g l = m15801l();
        if (d != null) {
            d.mo22825Z((float) this.f11697i, this.f11700l);
            if (l != null) {
                l.mo22824Y((float) this.f11697i, this.f11703o ? C9052a.m30172c(this.f11690b, C9013b.colorSurface) : 0);
            }
        }
    }

    /* renamed from: D */
    private InsetDrawable m15798D(Drawable drawable) {
        return new InsetDrawable(drawable, this.f11692d, this.f11694f, this.f11693e, this.f11695g);
    }

    /* renamed from: a */
    private Drawable m15799a() {
        C8990g gVar = new C8990g(this.f11691c);
        gVar.mo22815L(this.f11690b.getContext());
        C1164a.m4551o(gVar, this.f11699k);
        PorterDuff.Mode mode = this.f11698j;
        if (mode != null) {
            C1164a.m4552p(gVar, mode);
        }
        gVar.mo22825Z((float) this.f11697i, this.f11700l);
        C8990g gVar2 = new C8990g(this.f11691c);
        gVar2.setTint(0);
        gVar2.mo22824Y((float) this.f11697i, this.f11703o ? C9052a.m30172c(this.f11690b, C9013b.colorSurface) : 0);
        if (f11689a) {
            C8990g gVar3 = new C8990g(this.f11691c);
            this.f11702n = gVar3;
            C1164a.m4550n(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(C9071b.m30223a(this.f11701m), m15798D(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f11702n);
            this.f11707s = rippleDrawable;
            return rippleDrawable;
        }
        C9068a aVar = new C9068a(this.f11691c);
        this.f11702n = aVar;
        C1164a.m4551o(aVar, C9071b.m30223a(this.f11701m));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f11702n});
        this.f11707s = layerDrawable;
        return m15798D(layerDrawable);
    }

    /* renamed from: e */
    private C8990g m15800e(boolean z) {
        LayerDrawable layerDrawable = this.f11707s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C8990g) (f11689a ? (LayerDrawable) ((InsetDrawable) this.f11707s.getDrawable(0)).getDrawable() : this.f11707s).getDrawable(z ^ true ? 1 : 0);
    }

    /* renamed from: l */
    private C8990g m15801l() {
        return m15800e(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo12816B(int i, int i2) {
        Drawable drawable = this.f11702n;
        if (drawable != null) {
            drawable.setBounds(this.f11692d, this.f11694f, i2 - this.f11693e, i - this.f11695g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo12817b() {
        return this.f11696h;
    }

    /* renamed from: c */
    public C9012n mo12818c() {
        LayerDrawable layerDrawable = this.f11707s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (C9012n) (this.f11707s.getNumberOfLayers() > 2 ? this.f11707s.getDrawable(2) : this.f11707s.getDrawable(1));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C8990g mo12819d() {
        return m15800e(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public ColorStateList mo12820f() {
        return this.f11701m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C8997k mo12821g() {
        return this.f11691c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public ColorStateList mo12822h() {
        return this.f11700l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo12823i() {
        return this.f11697i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public ColorStateList mo12824j() {
        return this.f11699k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public PorterDuff.Mode mo12825k() {
        return this.f11698j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo12826m() {
        return this.f11704p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo12827n() {
        return this.f11706r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo12828o(TypedArray typedArray) {
        this.f11692d = typedArray.getDimensionPixelOffset(C9024k.f24773s1, 0);
        this.f11693e = typedArray.getDimensionPixelOffset(C9024k.f24779t1, 0);
        this.f11694f = typedArray.getDimensionPixelOffset(C9024k.f24785u1, 0);
        this.f11695g = typedArray.getDimensionPixelOffset(C9024k.f24791v1, 0);
        int i = C9024k.f24815z1;
        if (typedArray.hasValue(i)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i, -1);
            this.f11696h = dimensionPixelSize;
            mo12834u(this.f11691c.mo22865w((float) dimensionPixelSize));
            this.f11705q = true;
        }
        this.f11697i = typedArray.getDimensionPixelSize(C9024k.f24580J1, 0);
        this.f11698j = C4274h.m16433c(typedArray.getInt(C9024k.f24809y1, -1), PorterDuff.Mode.SRC_IN);
        this.f11699k = C9062c.m30197a(this.f11690b.getContext(), typedArray, C9024k.f24803x1);
        this.f11700l = C9062c.m30197a(this.f11690b.getContext(), typedArray, C9024k.f24575I1);
        this.f11701m = C9062c.m30197a(this.f11690b.getContext(), typedArray, C9024k.f24570H1);
        this.f11706r = typedArray.getBoolean(C9024k.f24797w1, false);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(C9024k.f24534A1, 0);
        int D = C1988t.m8339D(this.f11690b);
        int paddingTop = this.f11690b.getPaddingTop();
        int C = C1988t.m8337C(this.f11690b);
        int paddingBottom = this.f11690b.getPaddingBottom();
        this.f11690b.setInternalBackground(m15799a());
        C8990g d = mo12819d();
        if (d != null) {
            d.mo22818S((float) dimensionPixelSize2);
        }
        C1988t.m8336B0(this.f11690b, D + this.f11692d, paddingTop + this.f11694f, C + this.f11693e, paddingBottom + this.f11695g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo12829p(int i) {
        if (mo12819d() != null) {
            mo12819d().setTint(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo12830q() {
        this.f11704p = true;
        this.f11690b.setSupportBackgroundTintList(this.f11699k);
        this.f11690b.setSupportBackgroundTintMode(this.f11698j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo12831r(boolean z) {
        this.f11706r = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo12832s(int i) {
        if (!this.f11705q || this.f11696h != i) {
            this.f11696h = i;
            this.f11705q = true;
            mo12834u(this.f11691c.mo22865w((float) i));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo12833t(ColorStateList colorStateList) {
        if (this.f11701m != colorStateList) {
            this.f11701m = colorStateList;
            boolean z = f11689a;
            if (z && (this.f11690b.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f11690b.getBackground()).setColor(C9071b.m30223a(colorStateList));
            } else if (!z && (this.f11690b.getBackground() instanceof C9068a)) {
                ((C9068a) this.f11690b.getBackground()).setTintList(C9071b.m30223a(colorStateList));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo12834u(C8997k kVar) {
        this.f11691c = kVar;
        m15796A(kVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo12835v(boolean z) {
        this.f11703o = z;
        m15797C();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo12836w(ColorStateList colorStateList) {
        if (this.f11700l != colorStateList) {
            this.f11700l = colorStateList;
            m15797C();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo12837x(int i) {
        if (this.f11697i != i) {
            this.f11697i = i;
            m15797C();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo12838y(ColorStateList colorStateList) {
        if (this.f11699k != colorStateList) {
            this.f11699k = colorStateList;
            if (mo12819d() != null) {
                C1164a.m4551o(mo12819d(), this.f11699k);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo12839z(PorterDuff.Mode mode) {
        if (this.f11698j != mode) {
            this.f11698j = mode;
            if (mo12819d() != null && this.f11698j != null) {
                C1164a.m4552p(mo12819d(), this.f11698j);
            }
        }
    }
}
