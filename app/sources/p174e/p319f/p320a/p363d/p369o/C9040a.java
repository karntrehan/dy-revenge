package p174e.p319f.p320a.p363d.p369o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0221g;
import androidx.core.widget.C1188c;
import p174e.p319f.p320a.p363d.C9013b;
import p174e.p319f.p320a.p363d.C9023j;
import p174e.p319f.p320a.p363d.p372q.C9052a;

/* renamed from: e.f.a.d.o.a */
public class C9040a extends C0221g {

    /* renamed from: q */
    private static final int f24851q = C9023j.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: r */
    private static final int[][] f24852r = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: s */
    private ColorStateList f24853s;

    /* renamed from: t */
    private boolean f24854t;

    public C9040a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9013b.f24525d);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9040a(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f24851q
            android.content.Context r8 = com.google.android.material.internal.C4273g.m16424f(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = p174e.p319f.p320a.p363d.C9024k.f24702g2
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C4273g.m16429k(r0, r1, r2, r3, r4, r5)
            int r10 = p174e.p319f.p320a.p363d.C9024k.f24708h2
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x0028
            android.content.res.ColorStateList r8 = p174e.p319f.p320a.p363d.p379x.C9062c.m30197a(r8, r9, r10)
            androidx.core.widget.C1188c.m4679c(r7, r8)
        L_0x0028:
            int r8 = p174e.p319f.p320a.p363d.C9024k.f24714i2
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f24854t = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p363d.p369o.C9040a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f24853s == null) {
            int[][] iArr = f24852r;
            int[] iArr2 = new int[iArr.length];
            int c = C9052a.m30172c(this, C9013b.f24526g);
            int c2 = C9052a.m30172c(this, C9013b.colorSurface);
            int c3 = C9052a.m30172c(this, C9013b.colorOnSurface);
            iArr2[0] = C9052a.m30175f(c2, c, 1.0f);
            iArr2[1] = C9052a.m30175f(c2, c3, 0.54f);
            iArr2[2] = C9052a.m30175f(c2, c3, 0.38f);
            iArr2[3] = C9052a.m30175f(c2, c3, 0.38f);
            this.f24853s = new ColorStateList(iArr, iArr2);
        }
        return this.f24853s;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f24854t && C1188c.m4678b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f24854t = z;
        C1188c.m4679c(this, z ? getMaterialThemeColorsTintList() : null);
    }
}
