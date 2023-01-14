package p027c.p082m.p083a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.content.C1135a;
import androidx.core.graphics.drawable.C1164a;
import java.util.ArrayList;
import java.util.List;
import p027c.p064i.p072j.C1904a;
import p027c.p064i.p072j.C1915d;
import p027c.p064i.p072j.C1988t;
import p027c.p064i.p072j.p073g0.C1955c;
import p027c.p077k.p078a.C2019a;
import p027c.p077k.p079b.C2030c;

/* renamed from: c.m.a.a */
public class C2039a extends ViewGroup {

    /* renamed from: f */
    private static final int[] f5855f = {16843828};

    /* renamed from: o */
    static final int[] f5856o = {16842931};

    /* renamed from: p */
    static final boolean f5857p;

    /* renamed from: q */
    private static final boolean f5858q;

    /* renamed from: A */
    private final C2047g f5859A;

    /* renamed from: B */
    private int f5860B;

    /* renamed from: C */
    private boolean f5861C;

    /* renamed from: D */
    private boolean f5862D;

    /* renamed from: E */
    private int f5863E;

    /* renamed from: F */
    private int f5864F;

    /* renamed from: G */
    private int f5865G;

    /* renamed from: H */
    private int f5866H;

    /* renamed from: I */
    private boolean f5867I;

    /* renamed from: J */
    private boolean f5868J;

    /* renamed from: K */
    private C2043d f5869K;

    /* renamed from: L */
    private List<C2043d> f5870L;

    /* renamed from: M */
    private float f5871M;

    /* renamed from: N */
    private float f5872N;

    /* renamed from: O */
    private Drawable f5873O;

    /* renamed from: P */
    private Drawable f5874P;

    /* renamed from: Q */
    private Drawable f5875Q;

    /* renamed from: R */
    private CharSequence f5876R;

    /* renamed from: S */
    private CharSequence f5877S;

    /* renamed from: T */
    private Object f5878T;

    /* renamed from: U */
    private boolean f5879U;

    /* renamed from: V */
    private Drawable f5880V;

    /* renamed from: W */
    private Drawable f5881W;

    /* renamed from: a0 */
    private Drawable f5882a0;

    /* renamed from: b0 */
    private Drawable f5883b0;

    /* renamed from: c0 */
    private final ArrayList<View> f5884c0;

    /* renamed from: d0 */
    private Rect f5885d0;

    /* renamed from: e0 */
    private Matrix f5886e0;

    /* renamed from: r */
    private final C2042c f5887r;

    /* renamed from: s */
    private float f5888s;

    /* renamed from: t */
    private int f5889t;

    /* renamed from: u */
    private int f5890u;

    /* renamed from: v */
    private float f5891v;

    /* renamed from: w */
    private Paint f5892w;

    /* renamed from: x */
    private final C2030c f5893x;

    /* renamed from: y */
    private final C2030c f5894y;

    /* renamed from: z */
    private final C2047g f5895z;

    /* renamed from: c.m.a.a$a */
    class C2040a implements View.OnApplyWindowInsetsListener {
        C2040a() {
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((C2039a) view).mo6819Q(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* renamed from: c.m.a.a$b */
    class C2041b extends C1904a {

        /* renamed from: d */
        private final Rect f5897d = new Rect();

        C2041b() {
        }

        /* renamed from: n */
        private void m8745n(C1955c cVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (C2039a.m8698A(childAt)) {
                    cVar.mo6581c(childAt);
                }
            }
        }

        /* renamed from: o */
        private void m8746o(C1955c cVar, C1955c cVar2) {
            Rect rect = this.f5897d;
            cVar2.mo6598m(rect);
            cVar.mo6573W(rect);
            cVar2.mo6600n(rect);
            cVar.mo6574X(rect);
            cVar.mo6558D0(cVar2.mo6568M());
            cVar.mo6603o0(cVar2.mo6613u());
            cVar.mo6578a0(cVar2.mo6604p());
            cVar.mo6585e0(cVar2.mo6607r());
            cVar.mo6590h0(cVar2.mo6559E());
            cVar.mo6580b0(cVar2.mo6557D());
            cVar.mo6594j0(cVar2.mo6561F());
            cVar.mo6596k0(cVar2.mo6562G());
            cVar.mo6572U(cVar2.mo6551A());
            cVar.mo6617w0(cVar2.mo6566K());
            cVar.mo6601n0(cVar2.mo6563H());
            cVar.mo6577a(cVar2.mo6595k());
        }

        /* renamed from: a */
        public boolean mo5206a(View view, AccessibilityEvent accessibilityEvent) {
            CharSequence s;
            if (accessibilityEvent.getEventType() != 32) {
                return super.mo5206a(view, accessibilityEvent);
            }
            List text = accessibilityEvent.getText();
            View p = C2039a.this.mo6860p();
            if (p == null || (s = C2039a.this.mo6865s(C2039a.this.mo6873t(p))) == null) {
                return true;
            }
            text.add(s);
            return true;
        }

        /* renamed from: f */
        public void mo3775f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo3775f(view, accessibilityEvent);
            accessibilityEvent.setClassName(C2039a.class.getName());
        }

        /* renamed from: g */
        public void mo3776g(View view, C1955c cVar) {
            if (C2039a.f5857p) {
                super.mo3776g(view, cVar);
            } else {
                C1955c P = C1955c.m8190P(cVar);
                super.mo3776g(view, P);
                cVar.mo6620y0(view);
                ViewParent E = C1988t.m8341E(view);
                if (E instanceof View) {
                    cVar.mo6606q0((View) E);
                }
                m8746o(cVar, P);
                P.mo6570R();
                m8745n(cVar, (ViewGroup) view);
            }
            cVar.mo6578a0(C2039a.class.getName());
            cVar.mo6594j0(false);
            cVar.mo6596k0(false);
            cVar.mo6571S(C1955c.C1956a.f5703a);
            cVar.mo6571S(C1955c.C1956a.f5704b);
        }

        /* renamed from: i */
        public boolean mo5209i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (C2039a.f5857p || C2039a.m8698A(view)) {
                return super.mo5209i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* renamed from: c.m.a.a$c */
    static final class C2042c extends C1904a {
        C2042c() {
        }

        /* renamed from: g */
        public void mo3776g(View view, C1955c cVar) {
            super.mo3776g(view, cVar);
            if (!C2039a.m8698A(view)) {
                cVar.mo6606q0((View) null);
            }
        }
    }

    /* renamed from: c.m.a.a$d */
    public interface C2043d {
        /* renamed from: a */
        void mo6876a(View view);

        /* renamed from: b */
        void mo6877b(View view);

        /* renamed from: c */
        void mo6878c(int i);

        /* renamed from: d */
        void mo6879d(View view, float f);
    }

    /* renamed from: c.m.a.a$e */
    public static class C2044e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f5899a = 0;

        /* renamed from: b */
        float f5900b;

        /* renamed from: c */
        boolean f5901c;

        /* renamed from: d */
        int f5902d;

        public C2044e(int i, int i2) {
            super(i, i2);
        }

        public C2044e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2039a.f5856o);
            this.f5899a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C2044e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C2044e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C2044e(C2044e eVar) {
            super(eVar);
            this.f5899a = eVar.f5899a;
        }
    }

    /* renamed from: c.m.a.a$f */
    protected static class C2045f extends C2019a {
        public static final Parcelable.Creator<C2045f> CREATOR = new C2046a();

        /* renamed from: p */
        int f5903p = 0;

        /* renamed from: q */
        int f5904q;

        /* renamed from: r */
        int f5905r;

        /* renamed from: s */
        int f5906s;

        /* renamed from: t */
        int f5907t;

        /* renamed from: c.m.a.a$f$a */
        static class C2046a implements Parcelable.ClassLoaderCreator<C2045f> {
            C2046a() {
            }

            /* renamed from: a */
            public C2045f createFromParcel(Parcel parcel) {
                return new C2045f(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C2045f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C2045f(parcel, classLoader);
            }

            /* renamed from: c */
            public C2045f[] newArray(int i) {
                return new C2045f[i];
            }
        }

        public C2045f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5903p = parcel.readInt();
            this.f5904q = parcel.readInt();
            this.f5905r = parcel.readInt();
            this.f5906s = parcel.readInt();
            this.f5907t = parcel.readInt();
        }

        public C2045f(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5903p);
            parcel.writeInt(this.f5904q);
            parcel.writeInt(this.f5905r);
            parcel.writeInt(this.f5906s);
            parcel.writeInt(this.f5907t);
        }
    }

    /* renamed from: c.m.a.a$g */
    private class C2047g extends C2030c.C2033c {

        /* renamed from: a */
        private final int f5908a;

        /* renamed from: b */
        private C2030c f5909b;

        /* renamed from: c */
        private final Runnable f5910c = new C2048a();

        /* renamed from: c.m.a.a$g$a */
        class C2048a implements Runnable {
            C2048a() {
            }

            public void run() {
                C2047g.this.mo6886o();
            }
        }

        C2047g(int i) {
            this.f5908a = i;
        }

        /* renamed from: n */
        private void m8759n() {
            int i = 3;
            if (this.f5908a == 3) {
                i = 5;
            }
            View n = C2039a.this.mo6846n(i);
            if (n != null) {
                C2039a.this.mo6834f(n);
            }
        }

        /* renamed from: a */
        public int mo6782a(View view, int i, int i2) {
            int width;
            int width2;
            if (C2039a.this.mo6827c(view, 3)) {
                width2 = -view.getWidth();
                width = 0;
            } else {
                width = C2039a.this.getWidth();
                width2 = width - view.getWidth();
            }
            return Math.max(width2, Math.min(i, width));
        }

        /* renamed from: b */
        public int mo6783b(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: d */
        public int mo6785d(View view) {
            if (C2039a.this.mo6811D(view)) {
                return view.getWidth();
            }
            return 0;
        }

        /* renamed from: f */
        public void mo6787f(int i, int i2) {
            C2039a aVar;
            int i3;
            if ((i & 1) == 1) {
                aVar = C2039a.this;
                i3 = 3;
            } else {
                aVar = C2039a.this;
                i3 = 5;
            }
            View n = aVar.mo6846n(i3);
            if (n != null && C2039a.this.mo6862r(n) == 0) {
                this.f5909b.mo6771b(n, i2);
            }
        }

        /* renamed from: g */
        public boolean mo6788g(int i) {
            return false;
        }

        /* renamed from: h */
        public void mo6789h(int i, int i2) {
            C2039a.this.postDelayed(this.f5910c, 160);
        }

        /* renamed from: i */
        public void mo6790i(View view, int i) {
            ((C2044e) view.getLayoutParams()).f5901c = false;
            m8759n();
        }

        /* renamed from: j */
        public void mo6791j(int i) {
            C2039a.this.mo6822U(this.f5908a, i, this.f5909b.mo6776v());
        }

        /* renamed from: k */
        public void mo6792k(View view, int i, int i2, int i3, int i4) {
            int width = view.getWidth();
            float width2 = (C2039a.this.mo6827c(view, 3) ? (float) (i + width) : (float) (C2039a.this.getWidth() - i)) / ((float) width);
            C2039a.this.mo6821S(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            C2039a.this.invalidate();
        }

        /* renamed from: l */
        public void mo6793l(View view, float f, float f2) {
            int i;
            float u = C2039a.this.mo6874u(view);
            int width = view.getWidth();
            if (C2039a.this.mo6827c(view, 3)) {
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                i = (i2 > 0 || (i2 == 0 && u > 0.5f)) ? 0 : -width;
            } else {
                int width2 = C2039a.this.getWidth();
                if (f < 0.0f || (f == 0.0f && u > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f5909b.mo6766M(i, view.getTop());
            C2039a.this.invalidate();
        }

        /* renamed from: m */
        public boolean mo6794m(View view, int i) {
            return C2039a.this.mo6811D(view) && C2039a.this.mo6827c(view, this.f5908a) && C2039a.this.mo6862r(view) == 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo6886o() {
            View view;
            int i;
            int w = this.f5909b.mo6777w();
            int i2 = 0;
            boolean z = this.f5908a == 3;
            if (z) {
                view = C2039a.this.mo6846n(3);
                if (view != null) {
                    i2 = -view.getWidth();
                }
                i = i2 + w;
            } else {
                view = C2039a.this.mo6846n(5);
                i = C2039a.this.getWidth() - w;
            }
            if (view == null) {
                return;
            }
            if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && C2039a.this.mo6862r(view) == 0) {
                this.f5909b.mo6768O(view, i, view.getTop());
                ((C2044e) view.getLayoutParams()).f5901c = true;
                C2039a.this.invalidate();
                m8759n();
                C2039a.this.mo6826b();
            }
        }

        /* renamed from: p */
        public void mo6887p() {
            C2039a.this.removeCallbacks(this.f5910c);
        }

        /* renamed from: q */
        public void mo6888q(C2030c cVar) {
            this.f5909b = cVar;
        }
    }

    static {
        boolean z = true;
        int i = Build.VERSION.SDK_INT;
        f5857p = i >= 19;
        if (i < 21) {
            z = false;
        }
        f5858q = z;
    }

    public C2039a(Context context) {
        this(context, (AttributeSet) null);
    }

    public C2039a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C2039a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5887r = new C2042c();
        this.f5890u = -1728053248;
        this.f5892w = new Paint();
        this.f5862D = true;
        this.f5863E = 3;
        this.f5864F = 3;
        this.f5865G = 3;
        this.f5866H = 3;
        this.f5880V = null;
        this.f5881W = null;
        this.f5882a0 = null;
        this.f5883b0 = null;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f5889t = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        C2047g gVar = new C2047g(3);
        this.f5895z = gVar;
        C2047g gVar2 = new C2047g(5);
        this.f5859A = gVar2;
        C2030c n = C2030c.m8600n(this, 1.0f, gVar);
        this.f5893x = n;
        n.mo6764K(1);
        n.mo6765L(f2);
        gVar.mo6888q(n);
        C2030c n2 = C2030c.m8600n(this, 1.0f, gVar2);
        this.f5894y = n2;
        n2.mo6764K(2);
        n2.mo6765L(f2);
        gVar2.mo6888q(n2);
        setFocusableInTouchMode(true);
        C1988t.m8414w0(this, 1);
        C1988t.m8394m0(this, new C2041b());
        setMotionEventSplittingEnabled(false);
        if (C1988t.m8411v(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new C2040a());
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f5855f);
                try {
                    this.f5873O = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.f5873O = null;
            }
        }
        this.f5888s = f * 10.0f;
        this.f5884c0 = new ArrayList<>();
    }

    /* renamed from: A */
    static boolean m8698A(View view) {
        return (C1988t.m8413w(view) == 4 || C1988t.m8413w(view) == 2) ? false : true;
    }

    /* renamed from: F */
    private boolean m8699F(float f, float f2, View view) {
        if (this.f5885d0 == null) {
            this.f5885d0 = new Rect();
        }
        view.getHitRect(this.f5885d0);
        return this.f5885d0.contains((int) f, (int) f2);
    }

    /* renamed from: G */
    private boolean m8700G(Drawable drawable, int i) {
        if (drawable == null || !C1164a.m4544h(drawable)) {
            return false;
        }
        C1164a.m4549m(drawable, i);
        return true;
    }

    /* renamed from: N */
    private Drawable m8701N() {
        int y = C1988t.m8417y(this);
        if (y == 0) {
            Drawable drawable = this.f5880V;
            if (drawable != null) {
                m8700G(drawable, y);
                return this.f5880V;
            }
        } else {
            Drawable drawable2 = this.f5881W;
            if (drawable2 != null) {
                m8700G(drawable2, y);
                return this.f5881W;
            }
        }
        return this.f5882a0;
    }

    /* renamed from: O */
    private Drawable m8702O() {
        int y = C1988t.m8417y(this);
        if (y == 0) {
            Drawable drawable = this.f5881W;
            if (drawable != null) {
                m8700G(drawable, y);
                return this.f5881W;
            }
        } else {
            Drawable drawable2 = this.f5880V;
            if (drawable2 != null) {
                m8700G(drawable2, y);
                return this.f5880V;
            }
        }
        return this.f5883b0;
    }

    /* renamed from: P */
    private void m8703P() {
        if (!f5858q) {
            this.f5874P = m8701N();
            this.f5875Q = m8702O();
        }
    }

    /* renamed from: T */
    private void m8704T(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C1988t.m8414w0(childAt, ((z || mo6811D(childAt)) && (!z || childAt != view)) ? 4 : 1);
        }
    }

    /* renamed from: m */
    private boolean m8705m(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent v = m8706v(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(v);
            v.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = (float) (getScrollX() - view.getLeft());
        float scrollY = (float) (getScrollY() - view.getTop());
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    /* renamed from: v */
    private MotionEvent m8706v(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation((float) (getScrollX() - view.getLeft()), (float) (getScrollY() - view.getTop()));
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.f5886e0 == null) {
                this.f5886e0 = new Matrix();
            }
            matrix.invert(this.f5886e0);
            obtain.transform(this.f5886e0);
        }
        return obtain;
    }

    /* renamed from: w */
    static String m8707w(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    /* renamed from: x */
    private static boolean m8708x(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    /* renamed from: y */
    private boolean m8709y() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C2044e) getChildAt(i).getLayoutParams()).f5901c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    private boolean m8710z() {
        return mo6860p() != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public boolean mo6809B(View view) {
        return ((C2044e) view.getLayoutParams()).f5899a == 0;
    }

    /* renamed from: C */
    public boolean mo6810C(View view) {
        if (mo6811D(view)) {
            return (((C2044e) view.getLayoutParams()).f5902d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean mo6811D(View view) {
        int b = C1915d.m8012b(((C2044e) view.getLayoutParams()).f5899a, C1988t.m8417y(view));
        return ((b & 3) == 0 && (b & 5) == 0) ? false : true;
    }

    /* renamed from: E */
    public boolean mo6812E(View view) {
        if (mo6811D(view)) {
            return ((C2044e) view.getLayoutParams()).f5900b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo6813H(View view, float f) {
        float u = mo6874u(view);
        float width = (float) view.getWidth();
        int i = ((int) (width * f)) - ((int) (u * width));
        if (!mo6827c(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        mo6821S(view, f);
    }

    /* renamed from: I */
    public void mo6814I(int i) {
        mo6815J(i, true);
    }

    /* renamed from: J */
    public void mo6815J(int i, boolean z) {
        View n = mo6846n(i);
        if (n != null) {
            mo6817L(n, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m8707w(i));
    }

    /* renamed from: K */
    public void mo6816K(View view) {
        mo6817L(view, true);
    }

    /* renamed from: L */
    public void mo6817L(View view, boolean z) {
        if (mo6811D(view)) {
            C2044e eVar = (C2044e) view.getLayoutParams();
            if (this.f5862D) {
                eVar.f5900b = 1.0f;
                eVar.f5902d = 1;
                m8704T(view, true);
            } else if (z) {
                eVar.f5902d |= 2;
                if (mo6827c(view, 3)) {
                    this.f5893x.mo6768O(view, 0, view.getTop());
                } else {
                    this.f5894y.mo6768O(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                mo6813H(view, 1.0f);
                mo6822U(eVar.f5899a, 0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* renamed from: M */
    public void mo6818M(C2043d dVar) {
        List<C2043d> list;
        if (dVar != null && (list = this.f5870L) != null) {
            list.remove(dVar);
        }
    }

    /* renamed from: Q */
    public void mo6819Q(Object obj, boolean z) {
        this.f5878T = obj;
        this.f5879U = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    /* renamed from: R */
    public void mo6820R(int i, int i2) {
        View n;
        int b = C1915d.m8012b(i2, C1988t.m8417y(this));
        if (i2 == 3) {
            this.f5863E = i;
        } else if (i2 == 5) {
            this.f5864F = i;
        } else if (i2 == 8388611) {
            this.f5865G = i;
        } else if (i2 == 8388613) {
            this.f5866H = i;
        }
        if (i != 0) {
            (b == 3 ? this.f5893x : this.f5894y).mo6770a();
        }
        if (i == 1) {
            View n2 = mo6846n(b);
            if (n2 != null) {
                mo6834f(n2);
            }
        } else if (i == 2 && (n = mo6846n(b)) != null) {
            mo6816K(n);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo6821S(View view, float f) {
        C2044e eVar = (C2044e) view.getLayoutParams();
        if (f != eVar.f5900b) {
            eVar.f5900b = f;
            mo6845l(view, f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo6822U(int i, int i2, View view) {
        int z = this.f5893x.mo6779z();
        int z2 = this.f5894y.mo6779z();
        int i3 = 2;
        if (z == 1 || z2 == 1) {
            i3 = 1;
        } else if (!(z == 2 || z2 == 2)) {
            i3 = 0;
        }
        if (view != null && i2 == 0) {
            float f = ((C2044e) view.getLayoutParams()).f5900b;
            if (f == 0.0f) {
                mo6843j(view);
            } else if (f == 1.0f) {
                mo6844k(view);
            }
        }
        if (i3 != this.f5860B) {
            this.f5860B = i3;
            List<C2043d> list = this.f5870L;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f5870L.get(size).mo6878c(i3);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo6823a(C2043d dVar) {
        if (dVar != null) {
            if (this.f5870L == null) {
                this.f5870L = new ArrayList();
            }
            this.f5870L.add(dVar);
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z = false;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!mo6811D(childAt)) {
                    this.f5884c0.add(childAt);
                } else if (mo6810C(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            }
            if (!z) {
                int size = this.f5884c0.size();
                for (int i4 = 0; i4 < size; i4++) {
                    View view = this.f5884c0.get(i4);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                }
            }
            this.f5884c0.clear();
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        C1988t.m8414w0(view, (mo6847o() != null || mo6811D(view)) ? 4 : 1);
        if (!f5857p) {
            C1988t.m8394m0(view, this.f5887r);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo6826b() {
        if (!this.f5868J) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.f5868J = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo6827c(View view, int i) {
        return (mo6873t(view) & i) == i;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C2044e) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((C2044e) getChildAt(i).getLayoutParams()).f5900b);
        }
        this.f5891v = f;
        boolean m = this.f5893x.mo6774m(true);
        boolean m2 = this.f5894y.mo6774m(true);
        if (m || m2) {
            C1988t.m8376d0(this);
        }
    }

    /* renamed from: d */
    public void mo6830d(int i) {
        mo6833e(i, true);
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f5891v <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (m8699F(x, y, childAt) && !mo6809B(childAt) && m8705m(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        Drawable drawable;
        Canvas canvas2 = canvas;
        View view2 = view;
        int height = getHeight();
        boolean B = mo6809B(view2);
        int width = getWidth();
        int save = canvas.save();
        int i = 0;
        if (B) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view2 && childAt.getVisibility() == 0 && m8708x(childAt) && mo6811D(childAt) && childAt.getHeight() >= height) {
                    if (mo6827c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f = this.f5891v;
        if (f <= 0.0f || !B) {
            if (this.f5874P != null && mo6827c(view2, 3)) {
                int intrinsicWidth = this.f5874P.getIntrinsicWidth();
                int right2 = view.getRight();
                float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.f5893x.mo6777w()), 1.0f));
                this.f5874P.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
                this.f5874P.setAlpha((int) (max * 255.0f));
                drawable = this.f5874P;
            } else if (this.f5875Q != null && mo6827c(view2, 5)) {
                int intrinsicWidth2 = this.f5875Q.getIntrinsicWidth();
                int left2 = view.getLeft();
                float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left2)) / ((float) this.f5894y.mo6777w()), 1.0f));
                this.f5875Q.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
                this.f5875Q.setAlpha((int) (max2 * 255.0f));
                drawable = this.f5875Q;
            }
            drawable.draw(canvas);
        } else {
            int i4 = this.f5890u;
            this.f5892w.setColor((i4 & 16777215) | (((int) (((float) ((-16777216 & i4) >>> 24)) * f)) << 24));
            canvas.drawRect((float) i, 0.0f, (float) width, (float) getHeight(), this.f5892w);
        }
        return drawChild;
    }

    /* renamed from: e */
    public void mo6833e(int i, boolean z) {
        View n = mo6846n(i);
        if (n != null) {
            mo6835g(n, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m8707w(i));
    }

    /* renamed from: f */
    public void mo6834f(View view) {
        mo6835g(view, true);
    }

    /* renamed from: g */
    public void mo6835g(View view, boolean z) {
        C2030c cVar;
        int i;
        if (mo6811D(view)) {
            C2044e eVar = (C2044e) view.getLayoutParams();
            if (this.f5862D) {
                eVar.f5900b = 0.0f;
                eVar.f5902d = 0;
            } else if (z) {
                eVar.f5902d |= 4;
                if (mo6827c(view, 3)) {
                    cVar = this.f5893x;
                    i = -view.getWidth();
                } else {
                    cVar = this.f5894y;
                    i = getWidth();
                }
                cVar.mo6768O(view, i, view.getTop());
            } else {
                mo6813H(view, 0.0f);
                mo6822U(eVar.f5899a, 0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C2044e(-1, -1);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2044e(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2044e ? new C2044e((C2044e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C2044e((ViewGroup.MarginLayoutParams) layoutParams) : new C2044e(layoutParams);
    }

    public float getDrawerElevation() {
        if (f5858q) {
            return this.f5888s;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f5873O;
    }

    /* renamed from: h */
    public void mo6841h() {
        mo6842i(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo6842i(boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C2044e eVar = (C2044e) childAt.getLayoutParams();
            if (mo6811D(childAt) && (!z || eVar.f5901c)) {
                z2 |= mo6827c(childAt, 3) ? this.f5893x.mo6768O(childAt, -childAt.getWidth(), childAt.getTop()) : this.f5894y.mo6768O(childAt, getWidth(), childAt.getTop());
                eVar.f5901c = false;
            }
        }
        this.f5895z.mo6887p();
        this.f5859A.mo6887p();
        if (z2) {
            invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo6843j(View view) {
        View rootView;
        C2044e eVar = (C2044e) view.getLayoutParams();
        if ((eVar.f5902d & 1) == 1) {
            eVar.f5902d = 0;
            List<C2043d> list = this.f5870L;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f5870L.get(size).mo6877b(view);
                }
            }
            m8704T(view, false);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo6844k(View view) {
        C2044e eVar = (C2044e) view.getLayoutParams();
        if ((eVar.f5902d & 1) == 0) {
            eVar.f5902d = 1;
            List<C2043d> list = this.f5870L;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f5870L.get(size).mo6876a(view);
                }
            }
            m8704T(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo6845l(View view, float f) {
        List<C2043d> list = this.f5870L;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f5870L.get(size).mo6879d(view, f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public View mo6846n(int i) {
        int b = C1915d.m8012b(i, C1988t.m8417y(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((mo6873t(childAt) & 7) == b) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public View mo6847o() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((C2044e) childAt.getLayoutParams()).f5902d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5862D = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5862D = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r4.f5878T;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r5) {
        /*
            r4 = this;
            super.onDraw(r5)
            boolean r0 = r4.f5879U
            if (r0 == 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r4.f5873O
            if (r0 == 0) goto L_0x002e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            r2 = 0
            if (r0 < r1) goto L_0x001d
            java.lang.Object r0 = r4.f5878T
            if (r0 == 0) goto L_0x001d
            android.view.WindowInsets r0 = (android.view.WindowInsets) r0
            int r0 = r0.getSystemWindowInsetTop()
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r1 = r4.f5873O
            int r3 = r4.getWidth()
            r1.setBounds(r2, r2, r3, r0)
            android.graphics.drawable.Drawable r0 = r4.f5873O
            r0.draw(r5)
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p082m.p083a.C2039a.onDraw(android.graphics.Canvas):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
        r7 = r6.f5893x.mo6775t((int) r0, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r0 != 3) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            c.k.b.c r1 = r6.f5893x
            boolean r1 = r1.mo6767N(r7)
            c.k.b.c r2 = r6.f5894y
            boolean r2 = r2.mo6767N(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x003a
            if (r0 == r2) goto L_0x0031
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L_0x001e
            if (r0 == r4) goto L_0x0031
            goto L_0x0038
        L_0x001e:
            c.k.b.c r7 = r6.f5893x
            boolean r7 = r7.mo6772d(r4)
            if (r7 == 0) goto L_0x0038
            c.m.a.a$g r7 = r6.f5895z
            r7.mo6887p()
            c.m.a.a$g r7 = r6.f5859A
            r7.mo6887p()
            goto L_0x0038
        L_0x0031:
            r6.mo6842i(r2)
            r6.f5867I = r3
            r6.f5868J = r3
        L_0x0038:
            r7 = 0
            goto L_0x0064
        L_0x003a:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f5871M = r0
            r6.f5872N = r7
            float r4 = r6.f5891v
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x005f
            c.k.b.c r4 = r6.f5893x
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.mo6775t(r0, r7)
            if (r7 == 0) goto L_0x005f
            boolean r7 = r6.mo6809B(r7)
            if (r7 == 0) goto L_0x005f
            r7 = 1
            goto L_0x0060
        L_0x005f:
            r7 = 0
        L_0x0060:
            r6.f5867I = r3
            r6.f5868J = r3
        L_0x0064:
            if (r1 != 0) goto L_0x0074
            if (r7 != 0) goto L_0x0074
            boolean r7 = r6.m8709y()
            if (r7 != 0) goto L_0x0074
            boolean r7 = r6.f5868J
            if (r7 == 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r2 = 0
        L_0x0074:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p082m.p083a.C2039a.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !m8710z()) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View p = mo6860p();
        if (p != null && mo6862r(p) == 0) {
            mo6841h();
        }
        return p != null;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        int measuredHeight;
        int i6;
        int i7;
        this.f5861C = true;
        int i8 = i3 - i;
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C2044e eVar = (C2044e) childAt.getLayoutParams();
                if (mo6809B(childAt)) {
                    int i10 = eVar.leftMargin;
                    childAt.layout(i10, eVar.topMargin, childAt.getMeasuredWidth() + i10, eVar.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    if (mo6827c(childAt, 3)) {
                        float f2 = (float) measuredWidth;
                        i5 = (-measuredWidth) + ((int) (eVar.f5900b * f2));
                        f = ((float) (measuredWidth + i5)) / f2;
                    } else {
                        float f3 = (float) measuredWidth;
                        int i11 = i8 - ((int) (eVar.f5900b * f3));
                        f = ((float) (i8 - i11)) / f3;
                        i5 = i11;
                    }
                    boolean z2 = f != eVar.f5900b;
                    int i12 = eVar.f5899a & 112;
                    if (i12 != 16) {
                        if (i12 != 80) {
                            measuredHeight = eVar.topMargin;
                            i6 = measuredWidth + i5;
                            i7 = measuredHeight2 + measuredHeight;
                        } else {
                            int i13 = i4 - i2;
                            measuredHeight = (i13 - eVar.bottomMargin) - childAt.getMeasuredHeight();
                            i6 = measuredWidth + i5;
                            i7 = i13 - eVar.bottomMargin;
                        }
                        childAt.layout(i5, measuredHeight, i6, i7);
                    } else {
                        int i14 = i4 - i2;
                        int i15 = (i14 - measuredHeight2) / 2;
                        int i16 = eVar.topMargin;
                        if (i15 < i16) {
                            i15 = i16;
                        } else {
                            int i17 = i15 + measuredHeight2;
                            int i18 = eVar.bottomMargin;
                            if (i17 > i14 - i18) {
                                i15 = (i14 - i18) - measuredHeight2;
                            }
                        }
                        childAt.layout(i5, i15, measuredWidth + i5, measuredHeight2 + i15);
                    }
                    if (z2) {
                        mo6821S(childAt, f);
                    }
                    int i19 = eVar.f5900b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i19) {
                        childAt.setVisibility(i19);
                    }
                }
            }
        }
        this.f5861C = false;
        this.f5862D = false;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = 300;
                }
                if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        boolean z = this.f5878T != null && C1988t.m8411v(this);
        int y = C1988t.m8417y(this);
        int childCount = getChildCount();
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C2044e eVar = (C2044e) childAt.getLayoutParams();
                if (z) {
                    int b = C1915d.m8012b(eVar.f5899a, y);
                    boolean v = C1988t.m8411v(childAt);
                    int i5 = Build.VERSION.SDK_INT;
                    if (v) {
                        if (i5 >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.f5878T;
                            if (b == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                            } else if (b == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i3, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (i5 >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.f5878T;
                        if (b == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i3, windowInsets2.getSystemWindowInsetBottom());
                        } else if (b == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i3, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        eVar.leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        eVar.topMargin = windowInsets2.getSystemWindowInsetTop();
                        eVar.rightMargin = windowInsets2.getSystemWindowInsetRight();
                        eVar.bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (mo6809B(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - eVar.leftMargin) - eVar.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - eVar.topMargin) - eVar.bottomMargin, 1073741824));
                } else if (mo6811D(childAt)) {
                    if (f5858q) {
                        float t = C1988t.m8407t(childAt);
                        float f = this.f5888s;
                        if (t != f) {
                            C1988t.m8408t0(childAt, f);
                        }
                    }
                    int t2 = mo6873t(childAt) & 7;
                    boolean z4 = t2 == 3;
                    if ((!z4 || !z2) && (z4 || !z3)) {
                        if (z4) {
                            z2 = true;
                        } else {
                            z3 = true;
                        }
                        childAt.measure(ViewGroup.getChildMeasureSpec(i, this.f5889t + eVar.leftMargin + eVar.rightMargin, eVar.width), ViewGroup.getChildMeasureSpec(i2, eVar.topMargin + eVar.bottomMargin, eVar.height));
                        i4++;
                        i3 = 0;
                    } else {
                        throw new IllegalStateException("Child drawer has absolute gravity " + m8707w(t2) + " but this " + "DrawerLayout" + " already has a " + "drawer view along that edge");
                    }
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i4 + " does not have a valid layout_gravity - must be Gravity.LEFT, " + "Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
            int i6 = i;
            int i7 = i2;
            i4++;
            i3 = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        View n;
        if (!(parcelable instanceof C2045f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2045f fVar = (C2045f) parcelable;
        super.onRestoreInstanceState(fVar.mo6726a());
        int i = fVar.f5903p;
        if (!(i == 0 || (n = mo6846n(i)) == null)) {
            mo6816K(n);
        }
        int i2 = fVar.f5904q;
        if (i2 != 3) {
            mo6820R(i2, 3);
        }
        int i3 = fVar.f5905r;
        if (i3 != 3) {
            mo6820R(i3, 5);
        }
        int i4 = fVar.f5906s;
        if (i4 != 3) {
            mo6820R(i4, 8388611);
        }
        int i5 = fVar.f5907t;
        if (i5 != 3) {
            mo6820R(i5, 8388613);
        }
    }

    public void onRtlPropertiesChanged(int i) {
        m8703P();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C2045f fVar = new C2045f(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            C2044e eVar = (C2044e) getChildAt(i).getLayoutParams();
            int i2 = eVar.f5902d;
            boolean z = true;
            boolean z2 = i2 == 1;
            if (i2 != 2) {
                z = false;
            }
            if (z2 || z) {
                fVar.f5903p = eVar.f5899a;
            } else {
                i++;
            }
        }
        fVar.f5904q = this.f5863E;
        fVar.f5905r = this.f5864F;
        fVar.f5906s = this.f5865G;
        fVar.f5907t = this.f5866H;
        return fVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View o;
        this.f5893x.mo6762E(motionEvent);
        this.f5894y.mo6762E(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action == 1) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                View t = this.f5893x.mo6775t((int) x, (int) y);
                if (t != null && mo6809B(t)) {
                    float f = x - this.f5871M;
                    float f2 = y - this.f5872N;
                    int y2 = this.f5893x.mo6778y();
                    if (!((f * f) + (f2 * f2) >= ((float) (y2 * y2)) || (o = mo6847o()) == null || mo6862r(o) == 2)) {
                        z = false;
                        mo6842i(z);
                        this.f5867I = false;
                    }
                }
                z = true;
                mo6842i(z);
                this.f5867I = false;
            } else if (action == 3) {
                mo6842i(true);
            }
            return true;
        }
        float x2 = motionEvent.getX();
        float y3 = motionEvent.getY();
        this.f5871M = x2;
        this.f5872N = y3;
        this.f5867I = false;
        this.f5868J = false;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public View mo6860p() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (mo6811D(childAt) && mo6812E(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: q */
    public int mo6861q(int i) {
        int y = C1988t.m8417y(this);
        if (i == 3) {
            int i2 = this.f5863E;
            if (i2 != 3) {
                return i2;
            }
            int i3 = y == 0 ? this.f5865G : this.f5866H;
            if (i3 != 3) {
                return i3;
            }
            return 0;
        } else if (i == 5) {
            int i4 = this.f5864F;
            if (i4 != 3) {
                return i4;
            }
            int i5 = y == 0 ? this.f5866H : this.f5865G;
            if (i5 != 3) {
                return i5;
            }
            return 0;
        } else if (i == 8388611) {
            int i6 = this.f5865G;
            if (i6 != 3) {
                return i6;
            }
            int i7 = y == 0 ? this.f5863E : this.f5864F;
            if (i7 != 3) {
                return i7;
            }
            return 0;
        } else if (i != 8388613) {
            return 0;
        } else {
            int i8 = this.f5866H;
            if (i8 != 3) {
                return i8;
            }
            int i9 = y == 0 ? this.f5864F : this.f5863E;
            if (i9 != 3) {
                return i9;
            }
            return 0;
        }
    }

    /* renamed from: r */
    public int mo6862r(View view) {
        if (mo6811D(view)) {
            return mo6861q(((C2044e) view.getLayoutParams()).f5899a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f5867I = z;
        if (z) {
            mo6842i(true);
        }
    }

    public void requestLayout() {
        if (!this.f5861C) {
            super.requestLayout();
        }
    }

    /* renamed from: s */
    public CharSequence mo6865s(int i) {
        int b = C1915d.m8012b(i, C1988t.m8417y(this));
        if (b == 3) {
            return this.f5876R;
        }
        if (b == 5) {
            return this.f5877S;
        }
        return null;
    }

    public void setDrawerElevation(float f) {
        this.f5888s = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (mo6811D(childAt)) {
                C1988t.m8408t0(childAt, this.f5888s);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(C2043d dVar) {
        C2043d dVar2 = this.f5869K;
        if (dVar2 != null) {
            mo6818M(dVar2);
        }
        if (dVar != null) {
            mo6823a(dVar);
        }
        this.f5869K = dVar;
    }

    public void setDrawerLockMode(int i) {
        mo6820R(i, 3);
        mo6820R(i, 5);
    }

    public void setScrimColor(int i) {
        this.f5890u = i;
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.f5873O = i != 0 ? C1135a.m4419e(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f5873O = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.f5873O = new ColorDrawable(i);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public int mo6873t(View view) {
        return C1915d.m8012b(((C2044e) view.getLayoutParams()).f5899a, C1988t.m8417y(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public float mo6874u(View view) {
        return ((C2044e) view.getLayoutParams()).f5900b;
    }
}
