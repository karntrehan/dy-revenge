package com.facebook.yoga;

import com.facebook.yoga.C3316p;
import java.util.ArrayList;
import java.util.List;
import p174e.p247e.p317m.p318a.C6410a;

@C6410a
public abstract class YogaNodeJNIBase extends C3316p implements Cloneable {
    @C6410a
    private float[] arr;

    /* renamed from: f */
    private YogaNodeJNIBase f9316f;
    @C6410a
    private int mLayoutDirection;

    /* renamed from: o */
    private List<YogaNodeJNIBase> f9317o;

    /* renamed from: p */
    private C3313m f9318p;

    /* renamed from: q */
    private C3302b f9319q;

    /* renamed from: r */
    protected long f9320r;

    /* renamed from: s */
    private Object f9321s;

    /* renamed from: t */
    private boolean f9322t;

    /* renamed from: com.facebook.yoga.YogaNodeJNIBase$a */
    static /* synthetic */ class C3300a {

        /* renamed from: a */
        static final /* synthetic */ int[] f9323a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.facebook.yoga.j[] r0 = com.facebook.yoga.C3310j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9323a = r0
                com.facebook.yoga.j r1 = com.facebook.yoga.C3310j.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9323a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.yoga.j r1 = com.facebook.yoga.C3310j.TOP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9323a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.yoga.j r1 = com.facebook.yoga.C3310j.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9323a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.yoga.j r1 = com.facebook.yoga.C3310j.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f9323a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facebook.yoga.j r1 = com.facebook.yoga.C3310j.START     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f9323a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.facebook.yoga.j r1 = com.facebook.yoga.C3310j.END     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.yoga.YogaNodeJNIBase.C3300a.<clinit>():void");
        }
    }

    YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }

    private YogaNodeJNIBase(long j) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.f9322t = true;
        if (j != 0) {
            this.f9320r = j;
            return;
        }
        throw new IllegalStateException("Failed to allocate native memory");
    }

    YogaNodeJNIBase(C3303c cVar) {
        this(YogaNative.jni_YGNodeNewWithConfigJNI(((C3305e) cVar).f9334a));
    }

    @C6410a
    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i) {
        List<YogaNodeJNIBase> list = this.f9317o;
        if (list != null) {
            list.remove(i);
            this.f9317o.add(i, yogaNodeJNIBase);
            yogaNodeJNIBase.f9316f = this;
            return yogaNodeJNIBase.f9320r;
        }
        throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
    }

    /* renamed from: t0 */
    private void m12900t0(C3316p pVar) {
        Object u0 = mo10810u0();
        if (u0 instanceof C3316p.C3317a) {
            ((C3316p.C3317a) u0).mo10827a(this, pVar);
        }
    }

    /* renamed from: w0 */
    private static C3323v m12901w0(long j) {
        return new C3323v(Float.intBitsToFloat((int) j), (int) (j >> 32));
    }

    /* renamed from: B */
    public void mo10754B(C3310j jVar, float f) {
        YogaNative.jni_YGNodeStyleSetBorderJNI(this.f9320r, jVar.mo10824g(), f);
    }

    /* renamed from: C */
    public void mo10755C(Object obj) {
        this.f9321s = obj;
    }

    /* renamed from: D */
    public void mo10756D(C3308h hVar) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.f9320r, hVar.mo10822g());
    }

    /* renamed from: F */
    public void mo10757F(C3309i iVar) {
        YogaNative.jni_YGNodeStyleSetDisplayJNI(this.f9320r, iVar.mo10823e());
    }

    /* renamed from: G */
    public void mo10758G(float f) {
        YogaNative.jni_YGNodeStyleSetFlexJNI(this.f9320r, f);
    }

    /* renamed from: H */
    public void mo10759H(float f) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.f9320r, f);
    }

    /* renamed from: J */
    public void mo10760J() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.f9320r);
    }

    /* renamed from: K */
    public void mo10761K(float f) {
        YogaNative.jni_YGNodeStyleSetFlexBasisPercentJNI(this.f9320r, f);
    }

    /* renamed from: M */
    public void mo10762M(C3311k kVar) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.f9320r, kVar.mo10825e());
    }

    /* renamed from: N */
    public void mo10763N(float f) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.f9320r, f);
    }

    /* renamed from: O */
    public void mo10764O(float f) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.f9320r, f);
    }

    /* renamed from: P */
    public void mo10765P(float f) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.f9320r, f);
    }

    /* renamed from: Q */
    public void mo10766Q() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.f9320r);
    }

    /* renamed from: R */
    public void mo10767R(float f) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.f9320r, f);
    }

    /* renamed from: S */
    public void mo10768S(C3312l lVar) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.f9320r, lVar.mo10826e());
    }

    /* renamed from: T */
    public void mo10769T(C3310j jVar, float f) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.f9320r, jVar.mo10824g(), f);
    }

    /* renamed from: U */
    public void mo10770U(C3310j jVar) {
        YogaNative.jni_YGNodeStyleSetMarginAutoJNI(this.f9320r, jVar.mo10824g());
    }

    /* renamed from: V */
    public void mo10771V(C3310j jVar, float f) {
        YogaNative.jni_YGNodeStyleSetMarginPercentJNI(this.f9320r, jVar.mo10824g(), f);
    }

    /* renamed from: Y */
    public void mo10772Y(float f) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.f9320r, f);
    }

    /* renamed from: Z */
    public void mo10773Z(float f) {
        YogaNative.jni_YGNodeStyleSetMaxHeightPercentJNI(this.f9320r, f);
    }

    /* renamed from: a0 */
    public void mo10774a0(float f) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.f9320r, f);
    }

    /* renamed from: b0 */
    public void mo10775b0(float f) {
        YogaNative.jni_YGNodeStyleSetMaxWidthPercentJNI(this.f9320r, f);
    }

    @C6410a
    public final float baseline(float f, float f2) {
        return this.f9319q.mo10375a(this, f, f2);
    }

    /* renamed from: c */
    public void mo10777c(C3316p pVar, int i) {
        if (pVar instanceof YogaNodeJNIBase) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) pVar;
            if (yogaNodeJNIBase.f9316f == null) {
                if (this.f9317o == null) {
                    this.f9317o = new ArrayList(4);
                }
                this.f9317o.add(i, yogaNodeJNIBase);
                yogaNodeJNIBase.f9316f = this;
                YogaNative.jni_YGNodeInsertChildJNI(this.f9320r, yogaNodeJNIBase.f9320r, i);
                return;
            }
            throw new IllegalStateException("Child already has a parent, it must be removed first.");
        }
    }

    /* renamed from: c0 */
    public void mo10778c0(C3313m mVar) {
        this.f9318p = mVar;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.f9320r, mVar != null);
    }

    /* renamed from: d */
    public void mo10779d(float f, float f2) {
        m12900t0((C3316p) null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i = 0; i < arrayList.size(); i++) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) arrayList.get(i);
            List<YogaNodeJNIBase> list = yogaNodeJNIBase.f9317o;
            if (list != null) {
                for (YogaNodeJNIBase next : list) {
                    next.m12900t0(yogaNodeJNIBase);
                    arrayList.add(next);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i2 = 0; i2 < yogaNodeJNIBaseArr.length; i2++) {
            jArr[i2] = yogaNodeJNIBaseArr[i2].f9320r;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.f9320r, f, f2, jArr, yogaNodeJNIBaseArr);
    }

    /* renamed from: d0 */
    public void mo10780d0(float f) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.f9320r, f);
    }

    /* renamed from: e */
    public void mo10781e() {
        YogaNative.jni_YGNodeMarkDirtyJNI(this.f9320r);
    }

    /* renamed from: f */
    public C3323v mo10782f() {
        return m12901w0(YogaNative.jni_YGNodeStyleGetHeightJNI(this.f9320r));
    }

    /* renamed from: f0 */
    public void mo10783f0(float f) {
        YogaNative.jni_YGNodeStyleSetMinHeightPercentJNI(this.f9320r, f);
    }

    /* renamed from: g */
    public C3308h mo10784g() {
        float[] fArr = this.arr;
        return C3308h.m12972e(fArr != null ? (int) fArr[5] : this.mLayoutDirection);
    }

    /* renamed from: g0 */
    public void mo10785g0(float f) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.f9320r, f);
    }

    /* renamed from: h0 */
    public void mo10786h0(float f) {
        YogaNative.jni_YGNodeStyleSetMinWidthPercentJNI(this.f9320r, f);
    }

    /* renamed from: i */
    public float mo10787i() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    /* renamed from: j */
    public float mo10788j(C3310j jVar) {
        float[] fArr = this.arr;
        if (fArr == null) {
            return 0.0f;
        }
        int i = 0;
        if ((((int) fArr[0]) & 2) != 2) {
            return 0.0f;
        }
        if ((((int) fArr[0]) & 1) != 1) {
            i = 4;
        }
        int i2 = 10 - i;
        switch (C3300a.f9323a[jVar.ordinal()]) {
            case 1:
                return this.arr[i2];
            case 2:
                return this.arr[i2 + 1];
            case 3:
                return this.arr[i2 + 2];
            case 4:
                return this.arr[i2 + 3];
            case 5:
                return mo10784g() == C3308h.RTL ? this.arr[i2 + 2] : this.arr[i2];
            case 6:
                return mo10784g() == C3308h.RTL ? this.arr[i2] : this.arr[i2 + 2];
            default:
                throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
        }
    }

    /* renamed from: j0 */
    public void mo10789j0(C3320s sVar) {
        YogaNative.jni_YGNodeStyleSetOverflowJNI(this.f9320r, sVar.mo10830e());
    }

    /* renamed from: k */
    public float mo10790k() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    /* renamed from: k0 */
    public void mo10791k0(C3310j jVar, float f) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.f9320r, jVar.mo10824g(), f);
    }

    /* renamed from: l */
    public float mo10792l() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    /* renamed from: l0 */
    public void mo10793l0(C3310j jVar, float f) {
        YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(this.f9320r, jVar.mo10824g(), f);
    }

    /* renamed from: m */
    public float mo10794m() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    /* renamed from: m0 */
    public void mo10795m0(C3310j jVar, float f) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.f9320r, jVar.mo10824g(), f);
    }

    @C6410a
    public final long measure(float f, int i, float f2, int i2) {
        if (mo10804r()) {
            return this.f9318p.mo10055c(this, f, C3314n.m12980e(i), f2, C3314n.m12980e(i2));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    /* renamed from: n */
    public C3323v mo10797n() {
        return m12901w0(YogaNative.jni_YGNodeStyleGetWidthJNI(this.f9320r));
    }

    /* renamed from: n0 */
    public void mo10798n0(C3310j jVar, float f) {
        YogaNative.jni_YGNodeStyleSetPositionPercentJNI(this.f9320r, jVar.mo10824g(), f);
    }

    /* renamed from: o0 */
    public void mo10799o0(C3321t tVar) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.f9320r, tVar.mo10831e());
    }

    /* renamed from: p */
    public boolean mo10800p() {
        float[] fArr = this.arr;
        return fArr != null ? (((int) fArr[0]) & 16) == 16 : this.f9322t;
    }

    /* renamed from: p0 */
    public void mo10801p0(float f) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.f9320r, f);
    }

    /* renamed from: q */
    public boolean mo10802q() {
        return YogaNative.jni_YGNodeIsDirtyJNI(this.f9320r);
    }

    /* renamed from: q0 */
    public void mo10803q0() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.f9320r);
    }

    /* renamed from: r */
    public boolean mo10804r() {
        return this.f9318p != null;
    }

    /* renamed from: r0 */
    public void mo10805r0(float f) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.f9320r, f);
    }

    /* renamed from: s */
    public void mo10806s() {
        float[] fArr = this.arr;
        if (fArr != null) {
            fArr[0] = (float) (((int) fArr[0]) & -17);
        }
        this.f9322t = false;
    }

    /* renamed from: s0 */
    public void mo10807s0(C3325w wVar) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.f9320r, wVar.mo10836e());
    }

    /* renamed from: u */
    public void mo10809u() {
        this.f9318p = null;
        this.f9319q = null;
        this.f9321s = null;
        this.arr = null;
        this.f9322t = true;
        this.mLayoutDirection = 0;
        YogaNative.jni_YGNodeResetJNI(this.f9320r);
    }

    /* renamed from: u0 */
    public Object mo10810u0() {
        return this.f9321s;
    }

    /* renamed from: v */
    public void mo10811v(C3301a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.f9320r, aVar.mo10817e());
    }

    /* renamed from: v0 */
    public YogaNodeJNIBase mo10808t(int i) {
        List<YogaNodeJNIBase> list = this.f9317o;
        if (list != null) {
            YogaNodeJNIBase remove = list.remove(i);
            remove.f9316f = null;
            YogaNative.jni_YGNodeRemoveChildJNI(this.f9320r, remove.f9320r);
            return remove;
        }
        throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
    }

    /* renamed from: w */
    public void mo10813w(C3301a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.f9320r, aVar.mo10817e());
    }

    /* renamed from: x */
    public void mo10814x(C3301a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.f9320r, aVar.mo10817e());
    }

    /* renamed from: y */
    public void mo10815y(float f) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.f9320r, f);
    }

    /* renamed from: z */
    public void mo10816z(C3302b bVar) {
        this.f9319q = bVar;
        YogaNative.jni_YGNodeSetHasBaselineFuncJNI(this.f9320r, bVar != null);
    }
}
