package p174e.p446g.p448b;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import p455g.C10313k;
import p455g.C10323s;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

/* renamed from: e.g.b.j */
public final class C10205j {

    /* renamed from: a */
    public static final C10206a f27346a = new C10206a((C10452g) null);

    /* renamed from: b */
    private static final PointF f27347b = new PointF();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final float[] f27348c = new float[2];
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Matrix f27349d = new Matrix();

    /* renamed from: e */
    private static final float[] f27350e = new float[2];

    /* renamed from: f */
    private static final Comparator<C10200h<?>> f27351f = C10194c.f27291f;

    /* renamed from: g */
    private final ViewGroup f27352g;

    /* renamed from: h */
    private final C10208k f27353h;

    /* renamed from: i */
    private final C10234z f27354i;

    /* renamed from: j */
    private float f27355j;

    /* renamed from: k */
    private final C10200h<?>[] f27356k = new C10200h[20];

    /* renamed from: l */
    private final C10200h<?>[] f27357l = new C10200h[20];

    /* renamed from: m */
    private final C10200h<?>[] f27358m = new C10200h[20];

    /* renamed from: n */
    private final C10200h<?>[] f27359n = new C10200h[20];

    /* renamed from: o */
    private int f27360o;

    /* renamed from: p */
    private int f27361p;

    /* renamed from: q */
    private boolean f27362q;

    /* renamed from: r */
    private int f27363r;

    /* renamed from: s */
    private boolean f27364s;

    /* renamed from: t */
    private int f27365t;

    /* renamed from: e.g.b.j$a */
    public static final class C10206a {
        private C10206a() {
        }

        public /* synthetic */ C10206a(C10452g gVar) {
            this();
        }

        /* renamed from: g */
        private final boolean m34653g(C10200h<?> hVar, C10200h<?> hVar2) {
            return hVar == hVar2 || hVar.mo25410B0(hVar2) || hVar2.mo25410B0(hVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public final boolean m34654h(int i) {
            return i == 3 || i == 1 || i == 5;
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public final boolean m34655i(float f, float f2, View view) {
            if (0.0f <= f && f <= ((float) view.getWidth())) {
                if (0.0f <= f2 && f2 <= ((float) view.getHeight())) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public final boolean m34656j(C10200h<?> hVar, C10200h<?> hVar2) {
            if (!hVar.mo25433U(hVar2) || m34653g(hVar, hVar2)) {
                return false;
            }
            if (hVar == hVar2 || (!hVar.mo25435W() && hVar.mo25427N() != 4)) {
                return true;
            }
            return hVar.mo25408A0(hVar2);
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public final boolean m34657k(C10200h<?> hVar, C10200h<?> hVar2) {
            return hVar != hVar2 && (hVar.mo25413D0(hVar2) || hVar2.mo25411C0(hVar));
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public final boolean m34658l(View view, float[] fArr) {
            return (!(view instanceof ViewGroup) || view.getBackground() != null) && m34655i(fArr[0], fArr[1], view);
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public final void m34659m(float f, float f2, ViewGroup viewGroup, View view, PointF pointF) {
            float scrollX = (f + ((float) viewGroup.getScrollX())) - ((float) view.getLeft());
            float scrollY = (f2 + ((float) viewGroup.getScrollY())) - ((float) view.getTop());
            Matrix matrix = view.getMatrix();
            if (!matrix.isIdentity()) {
                float[] b = C10205j.f27348c;
                b[0] = scrollX;
                b[1] = scrollY;
                matrix.invert(C10205j.f27349d);
                C10205j.f27349d.mapPoints(b);
                float f3 = b[0];
                scrollY = b[1];
                scrollX = f3;
            }
            pointF.set(scrollX, scrollY);
        }
    }

    /* renamed from: e.g.b.j$b */
    public /* synthetic */ class C10207b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27366a;

        static {
            int[] iArr = new int[C10221s.values().length];
            iArr[C10221s.NONE.ordinal()] = 1;
            iArr[C10221s.BOX_ONLY.ordinal()] = 2;
            iArr[C10221s.BOX_NONE.ordinal()] = 3;
            iArr[C10221s.AUTO.ordinal()] = 4;
            f27366a = iArr;
        }
    }

    public C10205j(ViewGroup viewGroup, C10208k kVar, C10234z zVar) {
        C10457l.m35320e(viewGroup, "wrapperView");
        C10457l.m35320e(kVar, "handlerRegistry");
        C10457l.m35320e(zVar, "viewConfigHelper");
        this.f27352g = viewGroup;
        this.f27353h = kVar;
        this.f27354i = zVar;
    }

    /* renamed from: A */
    private final boolean m34619A(View view, float[] fArr, int i) {
        int i2 = C10207b.f27366a[this.f27354i.mo24750a(view).ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        boolean m = view instanceof ViewGroup ? m34633m((ViewGroup) view, fArr, i) : false;
                        if (m34642x(view, fArr, i) || m || f27346a.m34658l(view, fArr)) {
                            return true;
                        }
                    } else {
                        throw new C10313k();
                    }
                } else if (view instanceof ViewGroup) {
                    return m34633m((ViewGroup) view, fArr, i);
                }
            } else if (m34642x(view, fArr, i) || f27346a.m34658l(view, fArr)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B */
    private final void m34620B(C10200h<?> hVar) {
        if (m34635o(hVar)) {
            m34623c(hVar);
            return;
        }
        m34640t(hVar);
        hVar.mo25450p0(false);
    }

    /* renamed from: c */
    private final void m34623c(C10200h<?> hVar) {
        int i = this.f27361p;
        boolean z = false;
        if (i > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (this.f27357l[i2] != hVar) {
                    if (i3 >= i) {
                        break;
                    }
                    i2 = i3;
                } else {
                    return;
                }
            }
        }
        int i4 = this.f27361p;
        C10200h<?>[] hVarArr = this.f27357l;
        if (i4 < hVarArr.length) {
            z = true;
        }
        if (z) {
            this.f27361p = i4 + 1;
            hVarArr[i4] = hVar;
            hVar.mo25450p0(true);
            int i5 = this.f27365t;
            this.f27365t = i5 + 1;
            hVar.mo25447n0(i5);
            return;
        }
        throw new IllegalStateException("Too many recognizers".toString());
    }

    /* renamed from: d */
    private final boolean m34624d(View view) {
        return view.getVisibility() == 0 && view.getAlpha() >= this.f27355j;
    }

    /* renamed from: e */
    private final void m34625e() {
        int i = this.f27361p - 1;
        if (i >= 0) {
            while (true) {
                int i2 = i - 1;
                C10200h<?> hVar = this.f27357l[i];
                C10457l.m35317b(hVar);
                hVar.mo25448o();
                if (i2 < 0) {
                    break;
                }
                i = i2;
            }
        }
        int i3 = this.f27360o;
        int i4 = 0;
        if (i3 > 0) {
            while (true) {
                int i5 = i4 + 1;
                this.f27358m[i4] = this.f27356k[i4];
                if (i5 >= i3) {
                    break;
                }
                i4 = i5;
            }
        }
        int i6 = i3 - 1;
        if (i6 >= 0) {
            while (true) {
                int i7 = i6 - 1;
                C10200h<?> hVar2 = this.f27358m[i6];
                C10457l.m35317b(hVar2);
                hVar2.mo25448o();
                if (i7 >= 0) {
                    i6 = i7;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: f */
    private final void m34626f() {
        C10200h<?>[] hVarArr = this.f27357l;
        int i = this.f27361p;
        int i2 = 0;
        if (i > 0) {
            int i3 = 0;
            while (true) {
                int i4 = i2 + 1;
                C10200h<?> hVar = hVarArr[i2];
                C10457l.m35317b(hVar);
                if (hVar.mo25435W()) {
                    hVarArr[i3] = hVarArr[i2];
                    i3++;
                }
                if (i4 >= i) {
                    break;
                }
                i2 = i4;
            }
            i2 = i3;
        }
        this.f27361p = i2;
    }

    /* renamed from: g */
    private final void m34627g() {
        int i;
        int i2 = this.f27360o - 1;
        boolean z = false;
        if (i2 >= 0) {
            while (true) {
                int i3 = i2 - 1;
                C10200h<?> hVar = this.f27356k[i2];
                C10457l.m35317b(hVar);
                if (f27346a.m34654h(hVar.mo25427N()) && !hVar.mo25435W()) {
                    this.f27356k[i2] = null;
                    hVar.mo25442i0();
                    hVar.mo25449o0(false);
                    hVar.mo25450p0(false);
                    hVar.mo25447n0(RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO);
                    z = true;
                }
                if (i3 < 0) {
                    break;
                }
                i2 = i3;
            }
        }
        if (z) {
            C10200h<?>[] hVarArr = this.f27356k;
            int i4 = this.f27360o;
            if (i4 > 0) {
                int i5 = 0;
                i = 0;
                while (true) {
                    int i6 = i5 + 1;
                    if (hVarArr[i5] != null) {
                        hVarArr[i] = hVarArr[i5];
                        i++;
                    }
                    if (i6 >= i4) {
                        break;
                    }
                    i5 = i6;
                }
            } else {
                i = 0;
            }
            this.f27360o = i;
        }
        this.f27364s = false;
    }

    /* renamed from: h */
    private final void m34628h(C10200h<?> hVar, MotionEvent motionEvent) {
        if (!m34637q(hVar.mo25431R())) {
            hVar.mo25448o();
        } else if (hVar.mo25421H0()) {
            int actionMasked = motionEvent.getActionMasked();
            float[] fArr = f27350e;
            m34631k(hVar.mo25431R(), motionEvent, fArr);
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            motionEvent.setLocation(fArr[0], fArr[1]);
            if (hVar.mo25424K() && hVar.mo25427N() != 0) {
                hVar.mo25419G0(motionEvent);
            }
            if (!hVar.mo25435W() || actionMasked != 2) {
                boolean z = hVar.mo25427N() == 0;
                hVar.mo25432T(motionEvent);
                if (hVar.mo25434V()) {
                    if (hVar.mo25426M()) {
                        hVar.mo25464y0(false);
                        hVar.mo25443k0();
                    }
                    hVar.mo25455t(motionEvent);
                }
                if (hVar.mo25424K() && z) {
                    hVar.mo25419G0(motionEvent);
                }
                if (actionMasked == 1 || actionMasked == 6) {
                    hVar.mo25417F0(motionEvent.getPointerId(motionEvent.getActionIndex()));
                }
            }
            motionEvent.setLocation(x, y);
        }
    }

    /* renamed from: i */
    private final void m34629i(MotionEvent motionEvent) {
        int i = this.f27360o;
        int i2 = 0;
        T[] unused = C10341g.m35068d(this.f27356k, this.f27358m, 0, 0, i);
        C10341g.m35077m(this.f27358m, f27351f, 0, i);
        if (i > 0) {
            while (true) {
                int i3 = i2 + 1;
                C10200h<?> hVar = this.f27358m[i2];
                C10457l.m35317b(hVar);
                m34628h(hVar, motionEvent);
                if (i3 < i) {
                    i2 = i3;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: j */
    private final boolean m34630j(View view, float[] fArr, int i) {
        boolean z = false;
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                ArrayList<C10200h<?>> a = this.f27353h.mo24729a((View) parent);
                if (a == null) {
                    continue;
                } else {
                    synchronized (a) {
                        Iterator<C10200h<?>> it = a.iterator();
                        while (it.hasNext()) {
                            C10200h next = it.next();
                            if (next.mo25436X() && next.mo25438Z(view, fArr[0], fArr[1])) {
                                C10457l.m35319d(next, "handler");
                                m34641w(next, viewGroup);
                                next.mo25415E0(i);
                                z = true;
                            }
                        }
                        C10323s sVar = C10323s.f27547a;
                    }
                }
            }
        }
        return z;
    }

    /* renamed from: k */
    private final void m34631k(View view, MotionEvent motionEvent, float[] fArr) {
        if (view == this.f27352g) {
            fArr[0] = motionEvent.getX();
            fArr[1] = motionEvent.getY();
            return;
        }
        if (view != null && (view.getParent() instanceof ViewGroup)) {
            ViewParent parent = view.getParent();
            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent;
            m34631k(viewGroup, motionEvent, fArr);
            PointF pointF = f27347b;
            f27346a.m34659m(fArr[0], fArr[1], viewGroup, view, pointF);
            fArr[0] = pointF.x;
            fArr[1] = pointF.y;
            return;
        }
        throw new IllegalArgumentException("Parent is null? View is no longer in the tree".toString());
    }

    /* renamed from: l */
    private final void m34632l(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        float[] fArr = f27350e;
        fArr[0] = motionEvent.getX(actionIndex);
        fArr[1] = motionEvent.getY(actionIndex);
        m34619A(this.f27352g, fArr, pointerId);
        m34633m(this.f27352g, fArr, pointerId);
    }

    /* renamed from: m */
    private final boolean m34633m(ViewGroup viewGroup, float[] fArr, int i) {
        int childCount = viewGroup.getChildCount() - 1;
        if (childCount >= 0) {
            while (true) {
                int i2 = childCount - 1;
                View c = this.f27354i.mo24752c(viewGroup, childCount);
                if (m34624d(c)) {
                    PointF pointF = f27347b;
                    C10206a aVar = f27346a;
                    aVar.m34659m(fArr[0], fArr[1], viewGroup, c, pointF);
                    float f = fArr[0];
                    float f2 = fArr[1];
                    fArr[0] = pointF.x;
                    fArr[1] = pointF.y;
                    boolean A = (!m34636p(c) || aVar.m34655i(fArr[0], fArr[1], c)) ? m34619A(c, fArr, i) : false;
                    fArr[0] = f;
                    fArr[1] = f2;
                    if (A) {
                        return true;
                    }
                }
                if (i2 < 0) {
                    break;
                }
                childCount = i2;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final int m34634n(C10200h hVar, C10200h hVar2) {
        if ((hVar.mo25434V() && hVar2.mo25434V()) || (hVar.mo25435W() && hVar2.mo25435W())) {
            return Integer.signum(hVar2.mo25414E() - hVar.mo25414E());
        }
        if (!hVar.mo25434V()) {
            if (hVar2.mo25434V()) {
                return 1;
            }
            if (!hVar.mo25435W()) {
                return hVar2.mo25435W() ? 1 : 0;
            }
        }
        return -1;
    }

    /* renamed from: o */
    private final boolean m34635o(C10200h<?> hVar) {
        int i = this.f27360o;
        if (i > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                C10200h<?> hVar2 = this.f27356k[i2];
                C10457l.m35317b(hVar2);
                C10206a aVar = f27346a;
                if (!aVar.m34654h(hVar2.mo25427N()) && aVar.m34657k(hVar, hVar2)) {
                    return true;
                }
                if (i3 >= i) {
                    break;
                }
                i2 = i3;
            }
        }
        return false;
    }

    /* renamed from: p */
    private final boolean m34636p(View view) {
        return !(view instanceof ViewGroup) || this.f27354i.mo24751b((ViewGroup) view);
    }

    /* renamed from: q */
    private final boolean m34637q(View view) {
        if (view == null) {
            return false;
        }
        if (view == this.f27352g) {
            return true;
        }
        ViewParent parent = view.getParent();
        while (parent != null && parent != this.f27352g) {
            parent = parent.getParent();
        }
        return parent == this.f27352g;
    }

    /* renamed from: r */
    private final boolean m34638r(View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return false;
        }
        Matrix matrix = view.getMatrix();
        float[] fArr = f27348c;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        matrix.mapPoints(fArr);
        float left = fArr[0] + ((float) view.getLeft());
        float top = fArr[1] + ((float) view.getTop());
        return left < 0.0f || left + ((float) view.getWidth()) > ((float) viewGroup.getWidth()) || top < 0.0f || top + ((float) view.getHeight()) > ((float) viewGroup.getHeight());
    }

    /* renamed from: t */
    private final void m34640t(C10200h<?> hVar) {
        int i;
        int N = hVar.mo25427N();
        hVar.mo25450p0(false);
        hVar.mo25449o0(true);
        hVar.mo25464y0(true);
        int i2 = this.f27365t;
        this.f27365t = i2 + 1;
        hVar.mo25447n0(i2);
        int i3 = this.f27360o;
        if (i3 > 0) {
            int i4 = 0;
            i = 0;
            while (true) {
                int i5 = i4 + 1;
                C10200h<?> hVar2 = this.f27356k[i4];
                C10457l.m35317b(hVar2);
                if (f27346a.m34656j(hVar2, hVar)) {
                    this.f27359n[i] = hVar2;
                    i++;
                }
                if (i5 >= i3) {
                    break;
                }
                i4 = i5;
            }
        } else {
            i = 0;
        }
        int i6 = i - 1;
        if (i6 >= 0) {
            while (true) {
                int i7 = i6 - 1;
                C10200h<?> hVar3 = this.f27359n[i6];
                C10457l.m35317b(hVar3);
                hVar3.mo25448o();
                if (i7 < 0) {
                    break;
                }
                i6 = i7;
            }
        }
        int i8 = this.f27361p - 1;
        if (i8 >= 0) {
            while (true) {
                int i9 = i8 - 1;
                C10200h<?> hVar4 = this.f27357l[i8];
                C10457l.m35317b(hVar4);
                if (f27346a.m34656j(hVar4, hVar)) {
                    hVar4.mo25448o();
                    hVar4.mo25450p0(false);
                }
                if (i9 < 0) {
                    break;
                }
                i8 = i9;
            }
        }
        m34626f();
        hVar.mo25458u(4, 2);
        if (N != 4) {
            hVar.mo25458u(5, 4);
            if (N != 5) {
                hVar.mo25458u(0, 5);
            }
        }
    }

    /* renamed from: w */
    private final void m34641w(C10200h<?> hVar, View view) {
        int i = this.f27360o;
        if (i > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (this.f27356k[i2] != hVar) {
                    if (i3 >= i) {
                        break;
                    }
                    i2 = i3;
                } else {
                    return;
                }
            }
        }
        int i4 = this.f27360o;
        C10200h<?>[] hVarArr = this.f27356k;
        if (i4 < hVarArr.length) {
            this.f27360o = i4 + 1;
            hVarArr[i4] = hVar;
            hVar.mo25449o0(false);
            hVar.mo25450p0(false);
            hVar.mo25447n0(RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO);
            hVar.mo25440h0(view, this);
            return;
        }
        throw new IllegalStateException("Too many recognizers".toString());
    }

    /* renamed from: x */
    private final boolean m34642x(View view, float[] fArr, int i) {
        boolean z;
        ArrayList<C10200h<?>> a = this.f27353h.mo24729a(view);
        boolean z2 = false;
        if (a == null) {
            z = false;
        } else {
            synchronized (a) {
                Iterator<C10200h<?>> it = a.iterator();
                z = false;
                while (it.hasNext()) {
                    C10200h next = it.next();
                    if (next.mo25436X() && next.mo25438Z(view, fArr[0], fArr[1])) {
                        C10457l.m35319d(next, "handler");
                        m34641w(next, view);
                        next.mo25415E0(i);
                        z = true;
                    }
                }
                C10323s sVar = C10323s.f27547a;
            }
        }
        float width = (float) view.getWidth();
        float f = fArr[0];
        if (0.0f <= f && f <= width) {
            float height = (float) view.getHeight();
            float f2 = fArr[1];
            if (0.0f <= f2 && f2 <= height) {
                z2 = true;
            }
            if (z2 && m34638r(view) && m34630j(view, fArr, i)) {
                return true;
            }
        }
        return z;
    }

    /* renamed from: y */
    private final void m34643y() {
        if (this.f27362q || this.f27363r != 0) {
            this.f27364s = true;
        } else {
            m34627g();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        if (r8 == 3) goto L_0x005f;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25479u(p174e.p446g.p448b.C10200h<?> r7, int r8, int r9) {
        /*
            r6 = this;
            java.lang.String r0 = "handler"
            p455g.p470y.p472d.C10457l.m35320e(r7, r0)
            int r0 = r6.f27363r
            int r0 = r0 + 1
            r6.f27363r = r0
            e.g.b.j$a r0 = f27346a
            boolean r0 = r0.m34654h(r8)
            r1 = 5
            if (r0 == 0) goto L_0x003f
            int r0 = r6.f27361p
            if (r0 <= 0) goto L_0x003c
            r2 = 0
            r3 = 0
        L_0x001a:
            int r4 = r3 + 1
            e.g.b.h<?>[] r5 = r6.f27357l
            r3 = r5[r3]
            e.g.b.j$a r5 = f27346a
            p455g.p470y.p472d.C10457l.m35317b(r3)
            boolean r5 = r5.m34657k(r3, r7)
            if (r5 == 0) goto L_0x0037
            if (r8 != r1) goto L_0x0034
            r3.mo25448o()
            r3.mo25450p0(r2)
            goto L_0x0037
        L_0x0034:
            r6.m34620B(r3)
        L_0x0037:
            if (r4 < r0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r3 = r4
            goto L_0x001a
        L_0x003c:
            r6.m34626f()
        L_0x003f:
            r0 = 4
            if (r8 != r0) goto L_0x0046
            r6.m34620B(r7)
            goto L_0x005f
        L_0x0046:
            if (r9 == r0) goto L_0x0051
            if (r9 != r1) goto L_0x004b
            goto L_0x0051
        L_0x004b:
            if (r9 != 0) goto L_0x0057
            r0 = 3
            if (r8 == r0) goto L_0x005f
            goto L_0x0057
        L_0x0051:
            boolean r1 = r7.mo25434V()
            if (r1 == 0) goto L_0x005b
        L_0x0057:
            r7.mo25458u(r8, r9)
            goto L_0x005f
        L_0x005b:
            if (r9 != r0) goto L_0x005f
            r9 = 2
            goto L_0x0057
        L_0x005f:
            int r7 = r6.f27363r
            int r7 = r7 + -1
            r6.f27363r = r7
            r6.m34643y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p446g.p448b.C10205j.mo25479u(e.g.b.h, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r1 != 5) goto L_0x001c;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo25480v(android.view.MotionEvent r4) {
        /*
            r3 = this;
            java.lang.String r0 = "event"
            p455g.p470y.p472d.C10457l.m35320e(r4, r0)
            r0 = 1
            r3.f27362q = r0
            int r1 = r4.getActionMasked()
            if (r1 == 0) goto L_0x0019
            r2 = 3
            if (r1 == r2) goto L_0x0015
            r2 = 5
            if (r1 == r2) goto L_0x0019
            goto L_0x001c
        L_0x0015:
            r3.m34625e()
            goto L_0x001c
        L_0x0019:
            r3.m34632l(r4)
        L_0x001c:
            r3.m34629i(r4)
            r4 = 0
            r3.f27362q = r4
            boolean r4 = r3.f27364s
            if (r4 == 0) goto L_0x002d
            int r4 = r3.f27363r
            if (r4 != 0) goto L_0x002d
            r3.m34627g()
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p446g.p448b.C10205j.mo25480v(android.view.MotionEvent):boolean");
    }

    /* renamed from: z */
    public final void mo25481z(float f) {
        this.f27355j = f;
    }
}
