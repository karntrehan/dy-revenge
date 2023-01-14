package p027c.p077k.p079b;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.ArrayList;
import java.util.List;
import p027c.p060f.C1802h;
import p027c.p064i.p072j.C1904a;
import p027c.p064i.p072j.C1988t;
import p027c.p064i.p072j.C2007x;
import p027c.p064i.p072j.p073g0.C1955c;
import p027c.p064i.p072j.p073g0.C1960d;
import p027c.p064i.p072j.p073g0.C1964e;
import p027c.p077k.p079b.C2026b;

/* renamed from: c.k.b.a */
public abstract class C2022a extends C1904a {

    /* renamed from: d */
    private static final Rect f5808d = new Rect(RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO, RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);

    /* renamed from: e */
    private static final C2026b.C2027a<C1955c> f5809e = new C2023a();

    /* renamed from: f */
    private static final C2026b.C2028b<C1802h<C1955c>, C1955c> f5810f = new C2024b();

    /* renamed from: g */
    private final Rect f5811g = new Rect();

    /* renamed from: h */
    private final Rect f5812h = new Rect();

    /* renamed from: i */
    private final Rect f5813i = new Rect();

    /* renamed from: j */
    private final int[] f5814j = new int[2];

    /* renamed from: k */
    private final AccessibilityManager f5815k;

    /* renamed from: l */
    private final View f5816l;

    /* renamed from: m */
    private C2025c f5817m;

    /* renamed from: n */
    int f5818n = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: o */
    int f5819o = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: p */
    private int f5820p = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: c.k.b.a$a */
    static class C2023a implements C2026b.C2027a<C1955c> {
        C2023a() {
        }

        /* renamed from: b */
        public void mo6752a(C1955c cVar, Rect rect) {
            cVar.mo6598m(rect);
        }
    }

    /* renamed from: c.k.b.a$b */
    static class C2024b implements C2026b.C2028b<C1802h<C1955c>, C1955c> {
        C2024b() {
        }

        /* renamed from: c */
        public C1955c mo6754a(C1802h<C1955c> hVar, int i) {
            return hVar.mo6284q(i);
        }

        /* renamed from: d */
        public int mo6755b(C1802h<C1955c> hVar) {
            return hVar.mo6283p();
        }
    }

    /* renamed from: c.k.b.a$c */
    private class C2025c extends C1960d {
        C2025c() {
        }

        /* renamed from: b */
        public C1955c mo6629b(int i) {
            return C1955c.m8190P(C2022a.this.mo6737H(i));
        }

        /* renamed from: d */
        public C1955c mo6631d(int i) {
            int i2 = i == 2 ? C2022a.this.f5818n : C2022a.this.f5819o;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return mo6629b(i2);
        }

        /* renamed from: f */
        public boolean mo6633f(int i, int i2, Bundle bundle) {
            return C2022a.this.mo6745P(i, i2, bundle);
        }
    }

    public C2022a(View view) {
        if (view != null) {
            this.f5816l = view;
            this.f5815k = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (C1988t.m8413w(view) == 0) {
                C1988t.m8414w0(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    /* renamed from: D */
    private static Rect m8522D(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f A[SYNTHETIC] */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m8523E(android.graphics.Rect r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x0032
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x000a
            goto L_0x0032
        L_0x000a:
            android.view.View r4 = r3.f5816l
            int r4 = r4.getWindowVisibility()
            if (r4 == 0) goto L_0x0013
            return r0
        L_0x0013:
            android.view.View r4 = r3.f5816l
        L_0x0015:
            android.view.ViewParent r4 = r4.getParent()
            boolean r1 = r4 instanceof android.view.View
            if (r1 == 0) goto L_0x002f
            android.view.View r4 = (android.view.View) r4
            float r1 = r4.getAlpha()
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x002e
            int r1 = r4.getVisibility()
            if (r1 == 0) goto L_0x0015
        L_0x002e:
            return r0
        L_0x002f:
            if (r4 == 0) goto L_0x0032
            r0 = 1
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p077k.p079b.C2022a.m8523E(android.graphics.Rect):boolean");
    }

    /* renamed from: F */
    private static int m8524F(int i) {
        if (i == 19) {
            return 33;
        }
        if (i != 21) {
            return i != 22 ? 130 : 66;
        }
        return 17;
    }

    /* renamed from: G */
    private boolean m8525G(int i, Rect rect) {
        Object obj;
        C1802h<C1955c> y = m8537y();
        int i2 = this.f5819o;
        int i3 = RecyclerView.UNDEFINED_DURATION;
        C1955c g = i2 == Integer.MIN_VALUE ? null : y.mo6276g(i2);
        if (i == 1 || i == 2) {
            obj = C2026b.m8572d(y, f5810f, f5809e, g, i, C1988t.m8417y(this.f5816l) == 1, false);
        } else if (i == 17 || i == 33 || i == 66 || i == 130) {
            Rect rect2 = new Rect();
            int i4 = this.f5819o;
            if (i4 != Integer.MIN_VALUE) {
                m8538z(i4, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m8522D(this.f5816l, i, rect2);
            }
            obj = C2026b.m8571c(y, f5810f, f5809e, g, rect2, i);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        C1955c cVar = (C1955c) obj;
        if (cVar != null) {
            i3 = y.mo6280l(y.mo6279k(cVar));
        }
        return mo6746T(i3);
    }

    /* renamed from: Q */
    private boolean m8526Q(int i, int i2, Bundle bundle) {
        return i2 != 1 ? i2 != 2 ? i2 != 64 ? i2 != 128 ? mo6739J(i, i2, bundle) : m8530n(i) : m8528S(i) : mo6748o(i) : mo6746T(i);
    }

    /* renamed from: R */
    private boolean m8527R(int i, Bundle bundle) {
        return C1988t.m8374c0(this.f5816l, i, bundle);
    }

    /* renamed from: S */
    private boolean m8528S(int i) {
        int i2;
        if (!this.f5815k.isEnabled() || !this.f5815k.isTouchExplorationEnabled() || (i2 = this.f5818n) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m8530n(i2);
        }
        this.f5818n = i;
        this.f5816l.invalidate();
        mo6747U(i, 32768);
        return true;
    }

    /* renamed from: V */
    private void m8529V(int i) {
        int i2 = this.f5820p;
        if (i2 != i) {
            this.f5820p = i;
            mo6747U(i, 128);
            mo6747U(i2, 256);
        }
    }

    /* renamed from: n */
    private boolean m8530n(int i) {
        if (this.f5818n != i) {
            return false;
        }
        this.f5818n = RecyclerView.UNDEFINED_DURATION;
        this.f5816l.invalidate();
        mo6747U(i, 65536);
        return true;
    }

    /* renamed from: p */
    private boolean m8531p() {
        int i = this.f5819o;
        return i != Integer.MIN_VALUE && mo6739J(i, 16, (Bundle) null);
    }

    /* renamed from: q */
    private AccessibilityEvent m8532q(int i, int i2) {
        return i != -1 ? m8533r(i, i2) : m8534s(i2);
    }

    /* renamed from: r */
    private AccessibilityEvent m8533r(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        C1955c H = mo6737H(i);
        obtain.getText().add(H.mo6616w());
        obtain.setContentDescription(H.mo6607r());
        obtain.setScrollable(H.mo6565J());
        obtain.setPassword(H.mo6564I());
        obtain.setEnabled(H.mo6559E());
        obtain.setChecked(H.mo6555C());
        mo6741L(i, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(H.mo6604p());
            C1964e.m8287c(obtain, this.f5816l, i);
            obtain.setPackageName(this.f5816l.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    /* renamed from: s */
    private AccessibilityEvent m8534s(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.f5816l.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    /* renamed from: t */
    private C1955c m8535t(int i) {
        C1955c N = C1955c.m8188N();
        N.mo6590h0(true);
        N.mo6594j0(true);
        N.mo6578a0("android.view.View");
        Rect rect = f5808d;
        N.mo6573W(rect);
        N.mo6574X(rect);
        N.mo6606q0(this.f5816l);
        mo6743N(i, N);
        if (N.mo6616w() == null && N.mo6607r() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        N.mo6598m(this.f5812h);
        if (!this.f5812h.equals(rect)) {
            int k = N.mo6595k();
            if ((k & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((k & 128) == 0) {
                N.mo6603o0(this.f5816l.getContext().getPackageName());
                N.mo6621z0(this.f5816l, i);
                if (this.f5818n == i) {
                    N.mo6572U(true);
                    N.mo6577a(128);
                } else {
                    N.mo6572U(false);
                    N.mo6577a(64);
                }
                boolean z = this.f5819o == i;
                if (z) {
                    N.mo6577a(2);
                } else if (N.mo6561F()) {
                    N.mo6577a(1);
                }
                N.mo6596k0(z);
                this.f5816l.getLocationOnScreen(this.f5814j);
                N.mo6600n(this.f5811g);
                if (this.f5811g.equals(rect)) {
                    N.mo6598m(this.f5811g);
                    if (N.f5688c != -1) {
                        C1955c N2 = C1955c.m8188N();
                        for (int i2 = N.f5688c; i2 != -1; i2 = N2.f5688c) {
                            N2.mo6608r0(this.f5816l, -1);
                            N2.mo6573W(f5808d);
                            mo6743N(i2, N2);
                            N2.mo6598m(this.f5812h);
                            Rect rect2 = this.f5811g;
                            Rect rect3 = this.f5812h;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        N2.mo6570R();
                    }
                    this.f5811g.offset(this.f5814j[0] - this.f5816l.getScrollX(), this.f5814j[1] - this.f5816l.getScrollY());
                }
                if (this.f5816l.getLocalVisibleRect(this.f5813i)) {
                    this.f5813i.offset(this.f5814j[0] - this.f5816l.getScrollX(), this.f5814j[1] - this.f5816l.getScrollY());
                    if (this.f5811g.intersect(this.f5813i)) {
                        N.mo6574X(this.f5811g);
                        if (m8523E(this.f5811g)) {
                            N.mo6558D0(true);
                        }
                    }
                }
                return N;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    /* renamed from: u */
    private C1955c m8536u() {
        C1955c O = C1955c.m8189O(this.f5816l);
        C1988t.m8370a0(this.f5816l, O);
        ArrayList arrayList = new ArrayList();
        mo6736C(arrayList);
        if (O.mo6602o() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                O.mo6583d(this.f5816l, ((Integer) arrayList.get(i)).intValue());
            }
            return O;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    /* renamed from: y */
    private C1802h<C1955c> m8537y() {
        ArrayList arrayList = new ArrayList();
        mo6736C(arrayList);
        C1802h<C1955c> hVar = new C1802h<>();
        for (int i = 0; i < arrayList.size(); i++) {
            hVar.mo6281m(i, m8535t(i));
        }
        return hVar;
    }

    /* renamed from: z */
    private void m8538z(int i, Rect rect) {
        mo6737H(i).mo6598m(rect);
    }

    /* renamed from: A */
    public final int mo6734A() {
        return this.f5819o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public abstract int mo6735B(float f, float f2);

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public abstract void mo6736C(List<Integer> list);

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public C1955c mo6737H(int i) {
        return i == -1 ? m8536u() : m8535t(i);
    }

    /* renamed from: I */
    public final void mo6738I(boolean z, int i, Rect rect) {
        int i2 = this.f5819o;
        if (i2 != Integer.MIN_VALUE) {
            mo6748o(i2);
        }
        if (z) {
            m8525G(i, rect);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public abstract boolean mo6739J(int i, int i2, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo6740K(AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo6741L(int i, AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo6742M(C1955c cVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public abstract void mo6743N(int i, C1955c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public void mo6744O(int i, boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public boolean mo6745P(int i, int i2, Bundle bundle) {
        return i != -1 ? m8526Q(i, i2, bundle) : m8527R(i2, bundle);
    }

    /* renamed from: T */
    public final boolean mo6746T(int i) {
        int i2;
        if ((!this.f5816l.isFocused() && !this.f5816l.requestFocus()) || (i2 = this.f5819o) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            mo6748o(i2);
        }
        this.f5819o = i;
        mo6744O(i, true);
        mo6747U(i, 8);
        return true;
    }

    /* renamed from: U */
    public final boolean mo6747U(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f5815k.isEnabled() || (parent = this.f5816l.getParent()) == null) {
            return false;
        }
        return C2007x.m8485h(parent, this.f5816l, m8532q(i, i2));
    }

    /* renamed from: b */
    public C1960d mo5207b(View view) {
        if (this.f5817m == null) {
            this.f5817m = new C2025c();
        }
        return this.f5817m;
    }

    /* renamed from: f */
    public void mo3775f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo3775f(view, accessibilityEvent);
        mo6740K(accessibilityEvent);
    }

    /* renamed from: g */
    public void mo3776g(View view, C1955c cVar) {
        super.mo3776g(view, cVar);
        mo6742M(cVar);
    }

    /* renamed from: o */
    public final boolean mo6748o(int i) {
        if (this.f5819o != i) {
            return false;
        }
        this.f5819o = RecyclerView.UNDEFINED_DURATION;
        mo6744O(i, false);
        mo6747U(i, 8);
        return true;
    }

    /* renamed from: v */
    public final boolean mo6749v(MotionEvent motionEvent) {
        if (!this.f5815k.isEnabled() || !this.f5815k.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int B = mo6735B(motionEvent.getX(), motionEvent.getY());
            m8529V(B);
            return B != Integer.MIN_VALUE;
        } else if (action != 10 || this.f5820p == Integer.MIN_VALUE) {
            return false;
        } else {
            m8529V(RecyclerView.UNDEFINED_DURATION);
            return true;
        }
    }

    /* renamed from: w */
    public final boolean mo6750w(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int F = m8524F(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i < repeatCount && m8525G(F, (Rect) null)) {
                            i++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            m8531p();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return m8525G(2, (Rect) null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return m8525G(1, (Rect) null);
            }
            return false;
        }
    }

    /* renamed from: x */
    public final int mo6751x() {
        return this.f5818n;
    }
}
