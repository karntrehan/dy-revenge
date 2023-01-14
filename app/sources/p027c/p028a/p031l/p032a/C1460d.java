package p027c.p028a.p031l.p032a;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import p027c.p028a.p031l.p032a.C1455b;

@SuppressLint({"RestrictedAPI"})
/* renamed from: c.a.l.a.d */
class C1460d extends C1455b {

    /* renamed from: A */
    private boolean f4529A;

    /* renamed from: z */
    private C1461a f4530z;

    /* renamed from: c.a.l.a.d$a */
    static class C1461a extends C1455b.C1458c {

        /* renamed from: J */
        int[][] f4531J;

        C1461a(C1461a aVar, C1460d dVar, Resources resources) {
            super(aVar, dVar, resources);
            if (aVar != null) {
                this.f4531J = aVar.f4531J;
            } else {
                this.f4531J = new int[mo5391f()][];
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public int mo5440A(int[] iArr) {
            int[][] iArr2 = this.f4531J;
            int h = mo5394h();
            for (int i = 0; i < h; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        public Drawable newDrawable() {
            return new C1460d(this, (Resources) null);
        }

        public Drawable newDrawable(Resources resources) {
            return new C1460d(this, resources);
        }

        /* renamed from: o */
        public void mo5401o(int i, int i2) {
            super.mo5401o(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.f4531J, 0, iArr, 0, i);
            this.f4531J = iArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo5367r() {
            int[][] iArr = this.f4531J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f4531J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f4531J = iArr2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public int mo5441z(int[] iArr, Drawable drawable) {
            int a = mo5386a(drawable);
            this.f4531J[a] = iArr;
            return a;
        }
    }

    C1460d(C1461a aVar) {
        if (aVar != null) {
            mo5336h(aVar);
        }
    }

    C1460d(C1461a aVar, Resources resources) {
        mo5336h(new C1461a(aVar, this, resources));
        onStateChange(getState());
    }

    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo5336h(C1455b.C1458c cVar) {
        super.mo5336h(cVar);
        if (cVar instanceof C1461a) {
            this.f4530z = (C1461a) cVar;
        }
    }

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C1461a mo5322b() {
        return new C1461a(this.f4530z, this, (Resources) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int[] mo5439k(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    public Drawable mutate() {
        if (!this.f4529A && super.mutate() == this) {
            this.f4530z.mo5367r();
            this.f4529A = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int A = this.f4530z.mo5440A(iArr);
        if (A < 0) {
            A = this.f4530z.mo5440A(StateSet.WILD_CARD);
        }
        return mo5375g(A) || onStateChange;
    }
}
