package p174e.p319f.p320a.p363d.p378w;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0270s;
import androidx.core.widget.C1188c;
import p174e.p319f.p320a.p363d.C9013b;
import p174e.p319f.p320a.p363d.C9023j;
import p174e.p319f.p320a.p363d.p372q.C9052a;

/* renamed from: e.f.a.d.w.a */
public class C9058a extends C0270s {

    /* renamed from: q */
    private static final int f24874q = C9023j.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: r */
    private static final int[][] f24875r = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: s */
    private ColorStateList f24876s;

    /* renamed from: t */
    private boolean f24877t;

    public C9058a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9013b.f24530t);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9058a(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = f24874q
            android.content.Context r7 = com.google.android.material.internal.C4273g.m16424f(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            int[] r2 = p174e.p319f.p320a.p363d.C9024k.f24720j2
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.C4273g.m16429k(r0, r1, r2, r3, r4, r5)
            int r9 = p174e.p319f.p320a.p363d.C9024k.f24726k2
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f24877t = r7
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p363d.p378w.C9058a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f24876s == null) {
            int c = C9052a.m30172c(this, C9013b.f24526g);
            int c2 = C9052a.m30172c(this, C9013b.colorOnSurface);
            int c3 = C9052a.m30172c(this, C9013b.colorSurface);
            int[][] iArr = f24875r;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = C9052a.m30175f(c3, c, 1.0f);
            iArr2[1] = C9052a.m30175f(c3, c2, 0.54f);
            iArr2[2] = C9052a.m30175f(c3, c2, 0.38f);
            iArr2[3] = C9052a.m30175f(c3, c2, 0.38f);
            this.f24876s = new ColorStateList(iArr, iArr2);
        }
        return this.f24876s;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f24877t && C1188c.m4678b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f24877t = z;
        C1188c.m4679c(this, z ? getMaterialThemeColorsTintList() : null);
    }
}
