package p027c.p043d.p053b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.camera.core.C0629c3;
import androidx.camera.core.C0949o2;
import androidx.camera.core.C0962r2;
import androidx.camera.core.C0967s2;
import androidx.camera.core.C1011z2;
import androidx.camera.core.impl.C0888u0;
import androidx.camera.core.impl.C0899w0;
import androidx.camera.core.impl.p014a3.C0743m;
import androidx.core.content.C1135a;
import androidx.lifecycle.C1300m;
import androidx.lifecycle.LiveData;
import java.util.concurrent.atomic.AtomicReference;
import p027c.p043d.p053b.p054a0.p055a.p056a.C1733a;
import p027c.p043d.p053b.p054a0.p055a.p056a.C1735c;
import p027c.p043d.p053b.p054a0.p055a.p056a.C1736d;
import p027c.p043d.p053b.p057b0.C1738a;
import p027c.p064i.p072j.C1988t;

/* renamed from: c.d.b.t */
public final class C1759t extends FrameLayout {

    /* renamed from: f */
    private static final C1762c f5206f = C1762c.PERFORMANCE;

    /* renamed from: o */
    C1762c f5207o;

    /* renamed from: p */
    C1766u f5208p;

    /* renamed from: q */
    final C1757s f5209q;

    /* renamed from: r */
    final C1300m<C1765f> f5210r;

    /* renamed from: s */
    final AtomicReference<C1754r> f5211s;

    /* renamed from: t */
    C1753q f5212t;

    /* renamed from: u */
    C1768v f5213u;

    /* renamed from: v */
    private final ScaleGestureDetector f5214v;

    /* renamed from: w */
    private MotionEvent f5215w;

    /* renamed from: x */
    private final View.OnLayoutChangeListener f5216x;

    /* renamed from: y */
    final C0967s2.C0971d f5217y;

    /* renamed from: c.d.b.t$a */
    class C1760a implements C0967s2.C0971d {
        C1760a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void mo6011c(C1011z2 z2Var) {
            C1759t.this.f5217y.mo2686a(z2Var);
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void mo6012e(C0899w0 w0Var, C1011z2 z2Var, C1011z2.C1018g gVar) {
            C0949o2.m3688a("PreviewView", "Preview transformation info updated. " + gVar);
            C1759t.this.f5209q.mo5990o(gVar, z2Var.mo3295d(), w0Var.mo2400m().mo2455c().intValue() == 0);
            C1759t.this.mo5994e();
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void mo6013g(C1754r rVar, C0899w0 w0Var) {
            if (C1759t.this.f5211s.compareAndSet(rVar, (Object) null)) {
                rVar.mo5979m(C1765f.IDLE);
            }
            rVar.mo5974d();
            w0Var.mo2391g().mo2974a(rVar);
        }

        @SuppressLint({"UnsafeOptInUsageError"})
        /* renamed from: a */
        public void mo2686a(C1011z2 z2Var) {
            C1766u uVar;
            if (!C0743m.m3043b()) {
                C1135a.m4422h(C1759t.this.getContext()).execute(new C1742f(this, z2Var));
                return;
            }
            C0949o2.m3688a("PreviewView", "Surface requested by Preview.");
            C0899w0 b = z2Var.mo3293b();
            z2Var.mo3299p(C1135a.m4422h(C1759t.this.getContext()), new C1741e(this, b, z2Var));
            C1759t tVar = C1759t.this;
            if (C1759t.m7443f(z2Var, tVar.f5207o)) {
                C1759t tVar2 = C1759t.this;
                uVar = new C1773y(tVar2, tVar2.f5209q);
            } else {
                C1759t tVar3 = C1759t.this;
                uVar = new C1770x(tVar3, tVar3.f5209q);
            }
            tVar.f5208p = uVar;
            C0888u0 m = b.mo2400m();
            C1759t tVar4 = C1759t.this;
            C1754r rVar = new C1754r(m, tVar4.f5210r, tVar4.f5208p);
            C1759t.this.f5211s.set(rVar);
            b.mo2391g().mo2976e(C1135a.m4422h(C1759t.this.getContext()), rVar);
            C1759t.this.f5208p.mo6023g(z2Var, new C1740d(this, rVar, b));
        }
    }

    /* renamed from: c.d.b.t$b */
    static /* synthetic */ class C1761b {

        /* renamed from: a */
        static final /* synthetic */ int[] f5219a;

        /* renamed from: b */
        static final /* synthetic */ int[] f5220b;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0059 */
        static {
            /*
                c.d.b.t$c[] r0 = p027c.p043d.p053b.C1759t.C1762c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5220b = r0
                r1 = 1
                c.d.b.t$c r2 = p027c.p043d.p053b.C1759t.C1762c.COMPATIBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f5220b     // Catch:{ NoSuchFieldError -> 0x001d }
                c.d.b.t$c r3 = p027c.p043d.p053b.C1759t.C1762c.PERFORMANCE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                c.d.b.t$e[] r2 = p027c.p043d.p053b.C1759t.C1764e.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f5219a = r2
                c.d.b.t$e r3 = p027c.p043d.p053b.C1759t.C1764e.FILL_END     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f5219a     // Catch:{ NoSuchFieldError -> 0x0038 }
                c.d.b.t$e r2 = p027c.p043d.p053b.C1759t.C1764e.FILL_CENTER     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = f5219a     // Catch:{ NoSuchFieldError -> 0x0043 }
                c.d.b.t$e r1 = p027c.p043d.p053b.C1759t.C1764e.FILL_START     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f5219a     // Catch:{ NoSuchFieldError -> 0x004e }
                c.d.b.t$e r1 = p027c.p043d.p053b.C1759t.C1764e.FIT_END     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f5219a     // Catch:{ NoSuchFieldError -> 0x0059 }
                c.d.b.t$e r1 = p027c.p043d.p053b.C1759t.C1764e.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = f5219a     // Catch:{ NoSuchFieldError -> 0x0064 }
                c.d.b.t$e r1 = p027c.p043d.p053b.C1759t.C1764e.FIT_START     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p027c.p043d.p053b.C1759t.C1761b.<clinit>():void");
        }
    }

    /* renamed from: c.d.b.t$c */
    public enum C1762c {
        PERFORMANCE(0),
        COMPATIBLE(1);
        

        /* renamed from: q */
        private final int f5224q;

        private C1762c(int i) {
            this.f5224q = i;
        }

        /* renamed from: e */
        static C1762c m7454e(int i) {
            for (C1762c cVar : values()) {
                if (cVar.f5224q == i) {
                    return cVar;
                }
            }
            throw new IllegalArgumentException("Unknown implementation mode id " + i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public int mo6014g() {
            return this.f5224q;
        }
    }

    /* renamed from: c.d.b.t$d */
    class C1763d extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        C1763d() {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            if (C1759t.this.f5212t == null) {
                return true;
            }
            scaleGestureDetector.getScaleFactor();
            throw null;
        }
    }

    /* renamed from: c.d.b.t$e */
    public enum C1764e {
        FILL_START(0),
        FILL_CENTER(1),
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);
        

        /* renamed from: u */
        private final int f5233u;

        private C1764e(int i) {
            this.f5233u = i;
        }

        /* renamed from: e */
        static C1764e m7456e(int i) {
            for (C1764e eVar : values()) {
                if (eVar.f5233u == i) {
                    return eVar;
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public int mo6016g() {
            return this.f5233u;
        }
    }

    /* renamed from: c.d.b.t$f */
    public enum C1765f {
        IDLE,
        STREAMING
    }

    public C1759t(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1759t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1759t(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* JADX INFO: finally extract failed */
    public C1759t(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C1762c cVar = f5206f;
        this.f5207o = cVar;
        C1757s sVar = new C1757s();
        this.f5209q = sVar;
        this.f5210r = new C1300m<>(C1765f.IDLE);
        this.f5211s = new AtomicReference<>();
        this.f5213u = new C1768v(sVar);
        this.f5216x = new C1743g(this);
        this.f5217y = new C1760a();
        C0743m.m3042a();
        Resources.Theme theme = context.getTheme();
        int[] iArr = C1769w.f5244a;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i, i2);
        C1988t.m8390k0(this, context, iArr, attributeSet, obtainStyledAttributes, i, i2);
        try {
            setScaleType(C1764e.m7456e(obtainStyledAttributes.getInteger(C1769w.f5246c, sVar.mo5984f().mo6016g())));
            setImplementationMode(C1762c.m7454e(obtainStyledAttributes.getInteger(C1769w.f5245b, cVar.mo6014g())));
            obtainStyledAttributes.recycle();
            this.f5214v = new ScaleGestureDetector(context, new C1763d());
            if (getBackground() == null) {
                setBackgroundColor(C1135a.m4417c(getContext(), 17170444));
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: a */
    private void m7441a(boolean z) {
        C0743m.m3042a();
        Display display = getDisplay();
        C0629c3 viewPort = getViewPort();
        if (this.f5212t != null && viewPort != null && isAttachedToWindow() && display != null) {
            try {
                getSurfaceProvider();
                throw null;
            } catch (IllegalStateException e) {
                if (z) {
                    C0949o2.m3691d("PreviewView", e.toString(), e);
                    return;
                }
                throw e;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void mo5993d(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if ((i3 - i == i7 - i5 && i4 - i2 == i8 - i6) ? false : true) {
            mo5994e();
            m7441a(true);
        }
    }

    /* renamed from: f */
    static boolean m7443f(C1011z2 z2Var, C1762c cVar) {
        int i;
        boolean equals = z2Var.mo3293b().mo2400m().mo2456d().equals("androidx.camera.camera2.legacy");
        boolean z = (C1733a.m7394a(C1736d.class) == null && C1733a.m7394a(C1735c.class) == null) ? false : true;
        if (z2Var.mo3296e() || Build.VERSION.SDK_INT <= 24 || equals || z || (i = C1761b.f5220b[cVar.ordinal()]) == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + cVar);
    }

    private int getViewPortScaleType() {
        switch (C1761b.f5219a[getScaleType().ordinal()]) {
            case 1:
                return 2;
            case 2:
                return 1;
            case 3:
                return 0;
            case 4:
            case 5:
            case 6:
                return 3;
            default:
                throw new IllegalStateException("Unexpected scale type: " + getScaleType());
        }
    }

    @SuppressLint({"WrongConstant", "UnsafeOptInUsageError"})
    /* renamed from: b */
    public C0629c3 mo5992b(int i) {
        C0743m.m3042a();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return new C0629c3.C0630a(new Rational(getWidth(), getHeight()), i).mo2632c(getViewPortScaleType()).mo2631b(getLayoutDirection()).mo2630a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo5994e() {
        C0743m.m3042a();
        C1766u uVar = this.f5208p;
        if (uVar != null) {
            uVar.mo6024h();
        }
        this.f5213u.mo6026e(new Size(getWidth(), getHeight()), getLayoutDirection());
        if (this.f5212t != null) {
            getOutputTransform();
            throw null;
        }
    }

    public Bitmap getBitmap() {
        C0743m.m3042a();
        C1766u uVar = this.f5208p;
        if (uVar == null) {
            return null;
        }
        return uVar.mo6017a();
    }

    public C1753q getController() {
        C0743m.m3042a();
        return this.f5212t;
    }

    public C1762c getImplementationMode() {
        C0743m.m3042a();
        return this.f5207o;
    }

    public C0962r2 getMeteringPointFactory() {
        C0743m.m3042a();
        return this.f5213u;
    }

    public C1738a getOutputTransform() {
        Matrix matrix;
        C0743m.m3042a();
        try {
            matrix = this.f5209q.mo5986h(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrix = null;
        }
        Rect g = this.f5209q.mo5985g();
        if (matrix == null || g == null) {
            C0949o2.m3688a("PreviewView", "Transform info is not ready");
            return null;
        }
        matrix.preConcat(C1776z.m7510a(g));
        if (this.f5208p instanceof C1773y) {
            matrix.postConcat(getMatrix());
        } else {
            C0949o2.m3698k("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
        }
        return new C1738a(matrix, new Size(g.width(), g.height()));
    }

    public LiveData<C1765f> getPreviewStreamState() {
        return this.f5210r;
    }

    public C1764e getScaleType() {
        C0743m.m3042a();
        return this.f5209q.mo5984f();
    }

    public C0967s2.C0971d getSurfaceProvider() {
        C0743m.m3042a();
        return this.f5217y;
    }

    public C0629c3 getViewPort() {
        C0743m.m3042a();
        if (getDisplay() == null) {
            return null;
        }
        return mo5992b(getDisplay().getRotation());
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        addOnLayoutChangeListener(this.f5216x);
        C1766u uVar = this.f5208p;
        if (uVar != null) {
            uVar.mo6020d();
        }
        m7441a(true);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f5216x);
        C1766u uVar = this.f5208p;
        if (uVar != null) {
            uVar.mo6021e();
        }
        if (this.f5212t != null) {
            throw null;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f5212t == null) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z = motionEvent.getPointerCount() == 1;
        boolean z2 = motionEvent.getAction() == 1;
        boolean z3 = motionEvent.getEventTime() - motionEvent.getDownTime() < ((long) ViewConfiguration.getLongPressTimeout());
        if (!z || !z2 || !z3) {
            return this.f5214v.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
        }
        this.f5215w = motionEvent;
        performClick();
        return true;
    }

    public boolean performClick() {
        if (this.f5212t != null) {
            MotionEvent motionEvent = this.f5215w;
            if (motionEvent != null) {
                motionEvent.getX();
            } else {
                getWidth();
            }
            MotionEvent motionEvent2 = this.f5215w;
            if (motionEvent2 != null) {
                motionEvent2.getY();
            } else {
                getHeight();
            }
            throw null;
        }
        this.f5215w = null;
        return super.performClick();
    }

    public void setController(C1753q qVar) {
        C0743m.m3042a();
        C1753q qVar2 = this.f5212t;
        if (qVar2 == null || qVar2 == qVar) {
            m7441a(false);
            return;
        }
        throw null;
    }

    public void setImplementationMode(C1762c cVar) {
        C0743m.m3042a();
        this.f5207o = cVar;
    }

    public void setScaleType(C1764e eVar) {
        C0743m.m3042a();
        this.f5209q.mo5989n(eVar);
        mo5994e();
        m7441a(false);
    }
}
