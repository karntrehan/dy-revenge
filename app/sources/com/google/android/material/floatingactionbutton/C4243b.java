package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.graphics.drawable.C1164a;
import androidx.core.util.C1177h;
import com.google.android.material.internal.C4267e;
import java.util.ArrayList;
import java.util.Iterator;
import p027c.p064i.p072j.C1988t;
import p174e.p319f.p320a.p363d.C8983a;
import p174e.p319f.p320a.p363d.p364a0.C8990g;
import p174e.p319f.p320a.p363d.p364a0.C8994h;
import p174e.p319f.p320a.p363d.p364a0.C8997k;
import p174e.p319f.p320a.p363d.p364a0.C9012n;
import p174e.p319f.p320a.p363d.p366l.C9025a;
import p174e.p319f.p320a.p363d.p366l.C9026b;
import p174e.p319f.p320a.p363d.p366l.C9030f;
import p174e.p319f.p320a.p363d.p366l.C9031g;
import p174e.p319f.p320a.p363d.p366l.C9032h;
import p174e.p319f.p320a.p363d.p380y.C9071b;
import p174e.p319f.p320a.p363d.p381z.C9073b;

/* renamed from: com.google.android.material.floatingactionbutton.b */
class C4243b {

    /* renamed from: a */
    static final TimeInterpolator f11966a = C9025a.f24821c;

    /* renamed from: b */
    static final int[] f11967b = {16842919, 16842910};

    /* renamed from: c */
    static final int[] f11968c = {16843623, 16842908, 16842910};

    /* renamed from: d */
    static final int[] f11969d = {16842908, 16842910};

    /* renamed from: e */
    static final int[] f11970e = {16843623, 16842910};

    /* renamed from: f */
    static final int[] f11971f = {16842910};

    /* renamed from: g */
    static final int[] f11972g = new int[0];

    /* renamed from: A */
    private int f11973A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public int f11974B = 0;

    /* renamed from: C */
    private ArrayList<Animator.AnimatorListener> f11975C;

    /* renamed from: D */
    private ArrayList<Animator.AnimatorListener> f11976D;

    /* renamed from: E */
    private ArrayList<C4252i> f11977E;

    /* renamed from: F */
    final FloatingActionButton f11978F;

    /* renamed from: G */
    final C9073b f11979G;

    /* renamed from: H */
    private final Rect f11980H = new Rect();

    /* renamed from: I */
    private final RectF f11981I = new RectF();

    /* renamed from: J */
    private final RectF f11982J = new RectF();

    /* renamed from: K */
    private final Matrix f11983K = new Matrix();

    /* renamed from: L */
    private ViewTreeObserver.OnPreDrawListener f11984L;

    /* renamed from: h */
    C8997k f11985h;

    /* renamed from: i */
    C8990g f11986i;

    /* renamed from: j */
    Drawable f11987j;

    /* renamed from: k */
    C4242a f11988k;

    /* renamed from: l */
    Drawable f11989l;

    /* renamed from: m */
    boolean f11990m;

    /* renamed from: n */
    boolean f11991n = true;

    /* renamed from: o */
    float f11992o;

    /* renamed from: p */
    float f11993p;

    /* renamed from: q */
    float f11994q;

    /* renamed from: r */
    int f11995r;

    /* renamed from: s */
    private final C4267e f11996s;

    /* renamed from: t */
    private C9032h f11997t;

    /* renamed from: u */
    private C9032h f11998u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public Animator f11999v;

    /* renamed from: w */
    private C9032h f12000w;

    /* renamed from: x */
    private C9032h f12001x;

    /* renamed from: y */
    private float f12002y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public float f12003z = 1.0f;

    /* renamed from: com.google.android.material.floatingactionbutton.b$a */
    class C4244a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f12004a;

        /* renamed from: b */
        final /* synthetic */ boolean f12005b;

        /* renamed from: c */
        final /* synthetic */ C4253j f12006c;

        C4244a(boolean z, C4253j jVar) {
            this.f12005b = z;
            this.f12006c = jVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f12004a = true;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = C4243b.this.f11974B = 0;
            Animator unused2 = C4243b.this.f11999v = null;
            if (!this.f12004a) {
                FloatingActionButton floatingActionButton = C4243b.this.f11978F;
                boolean z = this.f12005b;
                floatingActionButton.mo13513b(z ? 8 : 4, z);
                C4253j jVar = this.f12006c;
                if (jVar != null) {
                    jVar.mo13347b();
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            C4243b.this.f11978F.mo13513b(0, this.f12005b);
            int unused = C4243b.this.f11974B = 1;
            Animator unused2 = C4243b.this.f11999v = animator;
            this.f12004a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$b */
    class C4245b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f12008a;

        /* renamed from: b */
        final /* synthetic */ C4253j f12009b;

        C4245b(boolean z, C4253j jVar) {
            this.f12008a = z;
            this.f12009b = jVar;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = C4243b.this.f11974B = 0;
            Animator unused2 = C4243b.this.f11999v = null;
            C4253j jVar = this.f12009b;
            if (jVar != null) {
                jVar.mo13346a();
            }
        }

        public void onAnimationStart(Animator animator) {
            C4243b.this.f11978F.mo13513b(0, this.f12008a);
            int unused = C4243b.this.f11974B = 2;
            Animator unused2 = C4243b.this.f11999v = animator;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$c */
    class C4246c extends C9031g {
        C4246c() {
        }

        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            float unused = C4243b.this.f12003z = f;
            return super.mo13405a(f, matrix, matrix2);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$d */
    class C4247d implements TypeEvaluator<Float> {

        /* renamed from: a */
        FloatEvaluator f12012a = new FloatEvaluator();

        C4247d() {
        }

        /* renamed from: a */
        public Float evaluate(float f, Float f2, Float f3) {
            float floatValue = this.f12012a.evaluate(f, f2, f3).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$e */
    class C4248e implements ViewTreeObserver.OnPreDrawListener {
        C4248e() {
        }

        public boolean onPreDraw() {
            C4243b.this.mo13360F();
            return true;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$f */
    private class C4249f extends C4255l {
        C4249f() {
            super(C4243b.this, (C4244a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo13410a() {
            return 0.0f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$g */
    private class C4250g extends C4255l {
        C4250g() {
            super(C4243b.this, (C4244a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo13410a() {
            C4243b bVar = C4243b.this;
            return bVar.f11992o + bVar.f11993p;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$h */
    private class C4251h extends C4255l {
        C4251h() {
            super(C4243b.this, (C4244a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo13410a() {
            C4243b bVar = C4243b.this;
            return bVar.f11992o + bVar.f11994q;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$i */
    interface C4252i {
        /* renamed from: a */
        void mo13351a();

        /* renamed from: b */
        void mo13352b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$j */
    interface C4253j {
        /* renamed from: a */
        void mo13346a();

        /* renamed from: b */
        void mo13347b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$k */
    private class C4254k extends C4255l {
        C4254k() {
            super(C4243b.this, (C4244a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo13410a() {
            return C4243b.this.f11992o;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$l */
    private abstract class C4255l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private boolean f12019a;

        /* renamed from: b */
        private float f12020b;

        /* renamed from: c */
        private float f12021c;

        private C4255l() {
        }

        /* synthetic */ C4255l(C4243b bVar, C4244a aVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract float mo13410a();

        public void onAnimationEnd(Animator animator) {
            C4243b.this.mo13382c0((float) ((int) this.f12021c));
            this.f12019a = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f12019a) {
                C8990g gVar = C4243b.this.f11986i;
                this.f12020b = gVar == null ? 0.0f : gVar.mo22839v();
                this.f12021c = mo13410a();
                this.f12019a = true;
            }
            C4243b bVar = C4243b.this;
            float f = this.f12020b;
            bVar.mo13382c0((float) ((int) (f + ((this.f12021c - f) * valueAnimator.getAnimatedFraction()))));
        }
    }

    C4243b(FloatingActionButton floatingActionButton, C9073b bVar) {
        this.f11978F = floatingActionButton;
        this.f11979G = bVar;
        C4267e eVar = new C4267e();
        this.f11996s = eVar;
        eVar.mo13501a(f11967b, m16253i(new C4251h()));
        eVar.mo13501a(f11968c, m16253i(new C4250g()));
        eVar.mo13501a(f11969d, m16253i(new C4250g()));
        eVar.mo13501a(f11970e, m16253i(new C4250g()));
        eVar.mo13501a(f11971f, m16253i(new C4254k()));
        eVar.mo13501a(f11972g, m16253i(new C4249f()));
        this.f12002y = floatingActionButton.getRotation();
    }

    /* renamed from: W */
    private boolean m16246W() {
        return C1988t.m8361S(this.f11978F) && !this.f11978F.isInEditMode();
    }

    /* renamed from: d0 */
    private void m16250d0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT == 26) {
            objectAnimator.setEvaluator(new C4247d());
        }
    }

    /* renamed from: g */
    private void m16251g(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f11978F.getDrawable();
        if (drawable != null && this.f11973A != 0) {
            RectF rectF = this.f11981I;
            RectF rectF2 = this.f11982J;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i = this.f11973A;
            rectF2.set(0.0f, 0.0f, (float) i, (float) i);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i2 = this.f11973A;
            matrix.postScale(f, f, ((float) i2) / 2.0f, ((float) i2) / 2.0f);
        }
    }

    /* renamed from: h */
    private AnimatorSet m16252h(C9032h hVar, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f11978F, View.ALPHA, new float[]{f});
        hVar.mo22922e("opacity").mo22930a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f11978F, View.SCALE_X, new float[]{f2});
        hVar.mo22922e("scale").mo22930a(ofFloat2);
        m16250d0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f11978F, View.SCALE_Y, new float[]{f2});
        hVar.mo22922e("scale").mo22930a(ofFloat3);
        m16250d0(ofFloat3);
        arrayList.add(ofFloat3);
        m16251g(f3, this.f11983K);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f11978F, new C9030f(), new C4246c(), new Matrix[]{new Matrix(this.f11983K)});
        hVar.mo22922e("iconScale").mo22930a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C9026b.m30121a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: i */
    private ValueAnimator m16253i(C4255l lVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f11966a);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(lVar);
        valueAnimator.addUpdateListener(lVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    /* renamed from: k */
    private C9032h m16254k() {
        if (this.f11998u == null) {
            this.f11998u = C9032h.m30133c(this.f11978F.getContext(), C8983a.design_fab_hide_motion_spec);
        }
        return (C9032h) C1177h.m4583e(this.f11998u);
    }

    /* renamed from: l */
    private C9032h m16255l() {
        if (this.f11997t == null) {
            this.f11997t = C9032h.m30133c(this.f11978F.getContext(), C8983a.design_fab_show_motion_spec);
        }
        return (C9032h) C1177h.m4583e(this.f11997t);
    }

    /* renamed from: q */
    private ViewTreeObserver.OnPreDrawListener m16256q() {
        if (this.f11984L == null) {
            this.f11984L = new C4248e();
        }
        return this.f11984L;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo13355A() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo13356B() {
        ViewTreeObserver viewTreeObserver = this.f11978F.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f11984L;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f11984L = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo13357C(int[] iArr) {
        this.f11996s.mo13503d(iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo13358D(float f, float f2, float f3) {
        mo13381b0();
        mo13382c0(f);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.graphics.drawable.InsetDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.graphics.drawable.InsetDrawable} */
    /* JADX WARNING: type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13359E(android.graphics.Rect r8) {
        /*
            r7 = this;
            android.graphics.drawable.Drawable r0 = r7.f11989l
            java.lang.String r1 = "Didn't initialize content background"
            androidx.core.util.C1177h.m4584f(r0, r1)
            boolean r0 = r7.mo13376V()
            if (r0 == 0) goto L_0x0020
            android.graphics.drawable.InsetDrawable r0 = new android.graphics.drawable.InsetDrawable
            android.graphics.drawable.Drawable r2 = r7.f11989l
            int r3 = r8.left
            int r4 = r8.top
            int r5 = r8.right
            int r6 = r8.bottom
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            e.f.a.d.z.b r8 = r7.f11979G
            goto L_0x0024
        L_0x0020:
            e.f.a.d.z.b r8 = r7.f11979G
            android.graphics.drawable.Drawable r0 = r7.f11989l
        L_0x0024:
            r8.mo13350c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.C4243b.mo13359E(android.graphics.Rect):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo13360F() {
        float rotation = this.f11978F.getRotation();
        if (this.f12002y != rotation) {
            this.f12002y = rotation;
            mo13379Z();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo13361G() {
        ArrayList<C4252i> arrayList = this.f11977E;
        if (arrayList != null) {
            Iterator<C4252i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo13352b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo13362H() {
        ArrayList<C4252i> arrayList = this.f11977E;
        if (arrayList != null) {
            Iterator<C4252i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo13351a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public boolean mo13363I() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo13364J(ColorStateList colorStateList) {
        C8990g gVar = this.f11986i;
        if (gVar != null) {
            gVar.setTintList(colorStateList);
        }
        if (this.f11988k != null) {
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo13365K(PorterDuff.Mode mode) {
        C8990g gVar = this.f11986i;
        if (gVar != null) {
            gVar.setTintMode(mode);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final void mo13366L(float f) {
        if (this.f11992o != f) {
            this.f11992o = f;
            mo13358D(f, this.f11993p, this.f11994q);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo13367M(boolean z) {
        this.f11990m = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final void mo13368N(C9032h hVar) {
        this.f12001x = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final void mo13369O(float f) {
        if (this.f11993p != f) {
            this.f11993p = f;
            mo13358D(this.f11992o, f, this.f11994q);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final void mo13370P(float f) {
        this.f12003z = f;
        Matrix matrix = this.f11983K;
        m16251g(f, matrix);
        this.f11978F.setImageMatrix(matrix);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final void mo13371Q(float f) {
        if (this.f11994q != f) {
            this.f11994q = f;
            mo13358D(this.f11992o, this.f11993p, f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo13372R(ColorStateList colorStateList) {
        Drawable drawable = this.f11987j;
        if (drawable != null) {
            C1164a.m4551o(drawable, C9071b.m30223a(colorStateList));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo13373S(boolean z) {
        this.f11991n = z;
        mo13381b0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public final void mo13374T(C8997k kVar) {
        this.f11985h = kVar;
        C8990g gVar = this.f11986i;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        Drawable drawable = this.f11987j;
        if (drawable instanceof C9012n) {
            ((C9012n) drawable).setShapeAppearanceModel(kVar);
        }
        if (this.f11988k != null) {
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public final void mo13375U(C9032h hVar) {
        this.f12000w = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public boolean mo13376V() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public final boolean mo13377X() {
        return !this.f11990m || this.f11978F.getSizeDimension() >= this.f11995r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo13378Y(C4253j jVar, boolean z) {
        if (!mo13397x()) {
            Animator animator = this.f11999v;
            if (animator != null) {
                animator.cancel();
            }
            if (m16246W()) {
                if (this.f11978F.getVisibility() != 0) {
                    this.f11978F.setAlpha(0.0f);
                    this.f11978F.setScaleY(0.0f);
                    this.f11978F.setScaleX(0.0f);
                    mo13370P(0.0f);
                }
                C9032h hVar = this.f12000w;
                if (hVar == null) {
                    hVar = m16255l();
                }
                AnimatorSet h = m16252h(hVar, 1.0f, 1.0f, 1.0f);
                h.addListener(new C4245b(z, jVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.f11975C;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        h.addListener(it.next());
                    }
                }
                h.start();
                return;
            }
            this.f11978F.mo13513b(0, z);
            this.f11978F.setAlpha(1.0f);
            this.f11978F.setScaleY(1.0f);
            this.f11978F.setScaleX(1.0f);
            mo13370P(1.0f);
            if (jVar != null) {
                jVar.mo13346a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo13379Z() {
        int i;
        FloatingActionButton floatingActionButton;
        if (Build.VERSION.SDK_INT == 19) {
            if (this.f12002y % 90.0f != 0.0f) {
                i = 1;
                if (this.f11978F.getLayerType() != 1) {
                    floatingActionButton = this.f11978F;
                }
            } else if (this.f11978F.getLayerType() != 0) {
                floatingActionButton = this.f11978F;
                i = 0;
            }
            floatingActionButton.setLayerType(i, (Paint) null);
        }
        C8990g gVar = this.f11986i;
        if (gVar != null) {
            gVar.mo22823X((int) this.f12002y);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public final void mo13380a0() {
        mo13370P(this.f12003z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public final void mo13381b0() {
        Rect rect = this.f11980H;
        mo13391r(rect);
        mo13359E(rect);
        this.f11979G.mo13348a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void mo13382c0(float f) {
        C8990g gVar = this.f11986i;
        if (gVar != null) {
            gVar.mo22818S(f);
        }
    }

    /* renamed from: d */
    public void mo13383d(Animator.AnimatorListener animatorListener) {
        if (this.f11976D == null) {
            this.f11976D = new ArrayList<>();
        }
        this.f11976D.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo13384e(Animator.AnimatorListener animatorListener) {
        if (this.f11975C == null) {
            this.f11975C = new ArrayList<>();
        }
        this.f11975C.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo13385f(C4252i iVar) {
        if (this.f11977E == null) {
            this.f11977E = new ArrayList<>();
        }
        this.f11977E.add(iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final Drawable mo13386j() {
        return this.f11989l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public float mo13387m() {
        return this.f11992o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo13388n() {
        return this.f11990m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final C9032h mo13389o() {
        return this.f12001x;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public float mo13390p() {
        return this.f11993p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo13391r(Rect rect) {
        int sizeDimension = this.f11990m ? (this.f11995r - this.f11978F.getSizeDimension()) / 2 : 0;
        float m = this.f11991n ? mo13387m() + this.f11994q : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil((double) m));
        int max2 = Math.max(sizeDimension, (int) Math.ceil((double) (m * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public float mo13392s() {
        return this.f11994q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final C8997k mo13393t() {
        return this.f11985h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final C9032h mo13394u() {
        return this.f12000w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo13395v(C4253j jVar, boolean z) {
        if (!mo13396w()) {
            Animator animator = this.f11999v;
            if (animator != null) {
                animator.cancel();
            }
            if (m16246W()) {
                C9032h hVar = this.f12001x;
                if (hVar == null) {
                    hVar = m16254k();
                }
                AnimatorSet h = m16252h(hVar, 0.0f, 0.0f, 0.0f);
                h.addListener(new C4244a(z, jVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.f11976D;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        h.addListener(it.next());
                    }
                }
                h.start();
                return;
            }
            this.f11978F.mo13513b(z ? 8 : 4, z);
            if (jVar != null) {
                jVar.mo13347b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo13396w() {
        return this.f11978F.getVisibility() == 0 ? this.f11974B == 1 : this.f11974B != 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo13397x() {
        return this.f11978F.getVisibility() != 0 ? this.f11974B == 2 : this.f11974B != 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo13398y() {
        this.f11996s.mo13502c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo13399z() {
        C8990g gVar = this.f11986i;
        if (gVar != null) {
            C8994h.m29991f(this.f11978F, gVar);
        }
        if (mo13363I()) {
            this.f11978F.getViewTreeObserver().addOnPreDrawListener(m16256q());
        }
    }
}
