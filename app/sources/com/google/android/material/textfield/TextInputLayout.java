package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0215e0;
import androidx.appcompat.widget.C0231j;
import androidx.appcompat.widget.C0298z;
import androidx.core.content.C1135a;
import androidx.core.graphics.drawable.C1164a;
import androidx.core.widget.C1194i;
import com.google.android.material.internal.C4262a;
import com.google.android.material.internal.C4264b;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p027c.p028a.p029k.p030a.C1445a;
import p027c.p064i.p072j.C1904a;
import p027c.p064i.p072j.C1988t;
import p027c.p064i.p072j.p073g0.C1955c;
import p027c.p077k.p078a.C2019a;
import p174e.p319f.p320a.p363d.C9013b;
import p174e.p319f.p320a.p363d.C9016c;
import p174e.p319f.p320a.p363d.C9019f;
import p174e.p319f.p320a.p363d.C9022i;
import p174e.p319f.p320a.p363d.C9023j;
import p174e.p319f.p320a.p363d.p364a0.C8990g;
import p174e.p319f.p320a.p363d.p364a0.C8997k;
import p174e.p319f.p320a.p363d.p366l.C9025a;
import p174e.p319f.p320a.p363d.p372q.C9052a;

public class TextInputLayout extends LinearLayout {

    /* renamed from: f */
    private static final int f12192f = C9023j.Widget_Design_TextInputLayout;

    /* renamed from: A */
    private ColorStateList f12193A;

    /* renamed from: A0 */
    final C4262a f12194A0;

    /* renamed from: B */
    private boolean f12195B;

    /* renamed from: B0 */
    private boolean f12196B0;

    /* renamed from: C */
    private CharSequence f12197C;

    /* renamed from: C0 */
    private ValueAnimator f12198C0;

    /* renamed from: D */
    private boolean f12199D;

    /* renamed from: D0 */
    private boolean f12200D0;

    /* renamed from: E */
    private C8990g f12201E;
    /* access modifiers changed from: private */

    /* renamed from: E0 */
    public boolean f12202E0;

    /* renamed from: F */
    private C8990g f12203F;

    /* renamed from: G */
    private C8997k f12204G;

    /* renamed from: H */
    private final int f12205H;

    /* renamed from: I */
    private int f12206I;

    /* renamed from: J */
    private final int f12207J;

    /* renamed from: K */
    private int f12208K;

    /* renamed from: L */
    private final int f12209L;

    /* renamed from: M */
    private final int f12210M;

    /* renamed from: N */
    private int f12211N;

    /* renamed from: O */
    private int f12212O;

    /* renamed from: P */
    private final Rect f12213P;

    /* renamed from: Q */
    private final Rect f12214Q;

    /* renamed from: R */
    private final RectF f12215R;

    /* renamed from: S */
    private Typeface f12216S;

    /* renamed from: T */
    private final CheckableImageButton f12217T;

    /* renamed from: U */
    private ColorStateList f12218U;

    /* renamed from: V */
    private boolean f12219V;

    /* renamed from: W */
    private PorterDuff.Mode f12220W;

    /* renamed from: a0 */
    private boolean f12221a0;

    /* renamed from: b0 */
    private Drawable f12222b0;

    /* renamed from: c0 */
    private View.OnLongClickListener f12223c0;

    /* renamed from: d0 */
    private final LinkedHashSet<C4311f> f12224d0;

    /* renamed from: e0 */
    private int f12225e0;

    /* renamed from: f0 */
    private final SparseArray<C4336e> f12226f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public final CheckableImageButton f12227g0;

    /* renamed from: h0 */
    private final LinkedHashSet<C4312g> f12228h0;

    /* renamed from: i0 */
    private ColorStateList f12229i0;

    /* renamed from: j0 */
    private boolean f12230j0;

    /* renamed from: k0 */
    private PorterDuff.Mode f12231k0;

    /* renamed from: l0 */
    private boolean f12232l0;

    /* renamed from: m0 */
    private Drawable f12233m0;

    /* renamed from: n0 */
    private Drawable f12234n0;

    /* renamed from: o */
    private final FrameLayout f12235o;

    /* renamed from: o0 */
    private final CheckableImageButton f12236o0;

    /* renamed from: p */
    private final FrameLayout f12237p;

    /* renamed from: p0 */
    private View.OnLongClickListener f12238p0;

    /* renamed from: q */
    EditText f12239q;

    /* renamed from: q0 */
    private ColorStateList f12240q0;

    /* renamed from: r */
    private CharSequence f12241r;

    /* renamed from: r0 */
    private ColorStateList f12242r0;

    /* renamed from: s */
    private final C4337f f12243s;

    /* renamed from: s0 */
    private final int f12244s0;

    /* renamed from: t */
    boolean f12245t;

    /* renamed from: t0 */
    private final int f12246t0;

    /* renamed from: u */
    private int f12247u;

    /* renamed from: u0 */
    private int f12248u0;

    /* renamed from: v */
    private boolean f12249v;

    /* renamed from: v0 */
    private int f12250v0;

    /* renamed from: w */
    private TextView f12251w;

    /* renamed from: w0 */
    private final int f12252w0;

    /* renamed from: x */
    private int f12253x;

    /* renamed from: x0 */
    private final int f12254x0;

    /* renamed from: y */
    private int f12255y;

    /* renamed from: y0 */
    private final int f12256y0;

    /* renamed from: z */
    private ColorStateList f12257z;

    /* renamed from: z0 */
    private boolean f12258z0;

    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    class C4306a implements TextWatcher {
        C4306a() {
        }

        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.mo13598c0(!textInputLayout.f12202E0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f12245t) {
                textInputLayout2.mo13594V(editable.length());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    class C4307b implements Runnable {
        C4307b() {
        }

        public void run() {
            TextInputLayout.this.f12227g0.performClick();
            TextInputLayout.this.f12227g0.jumpDrawablesToCurrentState();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    class C4308c implements Runnable {
        C4308c() {
        }

        public void run() {
            TextInputLayout.this.f12239q.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    class C4309d implements ValueAnimator.AnimatorUpdateListener {
        C4309d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f12194A0.mo13467O(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$e */
    public static class C4310e extends C1904a {

        /* renamed from: d */
        private final TextInputLayout f12263d;

        public C4310e(TextInputLayout textInputLayout) {
            this.f12263d = textInputLayout;
        }

        /* renamed from: g */
        public void mo3776g(View view, C1955c cVar) {
            super.mo3776g(view, cVar);
            EditText editText = this.f12263d.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f12263d.getHint();
            CharSequence error = this.f12263d.getError();
            CharSequence counterOverflowDescription = this.f12263d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !TextUtils.isEmpty(error);
            boolean z4 = false;
            boolean z5 = z3 || !TextUtils.isEmpty(counterOverflowDescription);
            if (z) {
                cVar.mo6554B0(text);
            } else if (z2) {
                cVar.mo6554B0(hint);
            }
            if (z2) {
                cVar.mo6599m0(hint);
                if (!z && z2) {
                    z4 = true;
                }
                cVar.mo6619x0(z4);
            }
            if (z5) {
                if (!z3) {
                    error = counterOverflowDescription;
                }
                cVar.mo6593i0(error);
                cVar.mo6588f0(true);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$f */
    public interface C4311f {
        /* renamed from: a */
        void mo13710a(TextInputLayout textInputLayout);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$g */
    public interface C4312g {
        /* renamed from: a */
        void mo13711a(TextInputLayout textInputLayout, int i);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$h */
    static class C4313h extends C2019a {
        public static final Parcelable.Creator<C4313h> CREATOR = new C4314a();

        /* renamed from: p */
        CharSequence f12264p;

        /* renamed from: q */
        boolean f12265q;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$h$a */
        static class C4314a implements Parcelable.ClassLoaderCreator<C4313h> {
            C4314a() {
            }

            /* renamed from: a */
            public C4313h createFromParcel(Parcel parcel) {
                return new C4313h(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C4313h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C4313h(parcel, classLoader);
            }

            /* renamed from: c */
            public C4313h[] newArray(int i) {
                return new C4313h[i];
            }
        }

        C4313h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f12264p = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f12265q = parcel.readInt() != 1 ? false : true;
        }

        C4313h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.f12264p + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f12264p, parcel, i);
            parcel.writeInt(this.f12265q ? 1 : 0);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9013b.textInputStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r20, android.util.AttributeSet r21, int r22) {
        /*
            r19 = this;
            r0 = r19
            r7 = r21
            r8 = r22
            int r9 = f12192f
            r1 = r20
            android.content.Context r1 = com.google.android.material.internal.C4273g.m16424f(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            com.google.android.material.textfield.f r1 = new com.google.android.material.textfield.f
            r1.<init>(r0)
            r0.f12243s = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f12213P = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f12214Q = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f12215R = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f12224d0 = r1
            r10 = 0
            r0.f12225e0 = r10
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r0.f12226f0 = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f12228h0 = r1
            com.google.android.material.internal.a r1 = new com.google.android.material.internal.a
            r1.<init>(r0)
            r0.f12194A0 = r1
            android.content.Context r11 = r19.getContext()
            r12 = 1
            r0.setOrientation(r12)
            r0.setWillNotDraw(r10)
            r0.setAddStatesFromChildren(r12)
            android.widget.FrameLayout r13 = new android.widget.FrameLayout
            r13.<init>(r11)
            r0.f12235o = r13
            r13.setAddStatesFromChildren(r12)
            r0.addView(r13)
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r11)
            r0.f12237p = r2
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = -2
            r5 = 8388629(0x800015, float:1.1754973E-38)
            r3.<init>(r4, r4, r5)
            r2.setLayoutParams(r3)
            r13.addView(r2)
            android.animation.TimeInterpolator r2 = p174e.p319f.p320a.p363d.p366l.C9025a.f24819a
            r1.mo13471T(r2)
            r1.mo13468Q(r2)
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.mo13460F(r2)
            int[] r3 = p174e.p319f.p320a.p363d.C9024k.f24793v3
            r1 = 5
            int[] r6 = new int[r1]
            int r14 = p174e.p319f.p320a.p363d.C9024k.f24597M3
            r6[r10] = r14
            int r15 = p174e.p319f.p320a.p363d.C9024k.f24587K3
            r6[r12] = r15
            int r5 = p174e.p319f.p320a.p363d.C9024k.f24657Y3
            r4 = 2
            r6[r4] = r5
            int r2 = p174e.p319f.p320a.p363d.C9024k.f24680c4
            r1 = 3
            r6[r1] = r2
            int r10 = p174e.p319f.p320a.p363d.C9024k.f24704g4
            r16 = 4
            r6[r16] = r10
            r1 = r11
            r17 = r2
            r2 = r21
            r4 = r22
            r18 = r5
            r5 = r9
            androidx.appcompat.widget.x0 r1 = com.google.android.material.internal.C4273g.m16430l(r1, r2, r3, r4, r5, r6)
            int r2 = p174e.p319f.p320a.p363d.C9024k.f24698f4
            boolean r2 = r1.mo1784a(r2, r12)
            r0.f12195B = r2
            int r2 = p174e.p319f.p320a.p363d.C9024k.f24805x3
            java.lang.CharSequence r2 = r1.mo1799p(r2)
            r0.setHint(r2)
            int r2 = p174e.p319f.p320a.p363d.C9024k.f24692e4
            boolean r2 = r1.mo1784a(r2, r12)
            r0.f12196B0 = r2
            e.f.a.d.a0.k$b r2 = p174e.p319f.p320a.p363d.p364a0.C8997k.m29998e(r11, r7, r8, r9)
            e.f.a.d.a0.k r2 = r2.mo22872m()
            r0.f12204G = r2
            android.content.res.Resources r2 = r11.getResources()
            int r3 = p174e.p319f.p320a.p363d.C9017d.mtrl_textinput_box_label_cutout_padding
            int r2 = r2.getDimensionPixelOffset(r3)
            r0.f12205H = r2
            int r2 = p174e.p319f.p320a.p363d.C9024k.f24536A3
            r3 = 0
            int r2 = r1.mo1788e(r2, r3)
            r0.f12207J = r2
            int r2 = p174e.p319f.p320a.p363d.C9024k.f24567G3
            android.content.res.Resources r3 = r11.getResources()
            int r4 = p174e.p319f.p320a.p363d.C9017d.mtrl_textinput_box_stroke_width_default
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r1.mo1789f(r2, r3)
            r0.f12209L = r2
            int r3 = p174e.p319f.p320a.p363d.C9024k.f24572H3
            android.content.res.Resources r4 = r11.getResources()
            int r5 = p174e.p319f.p320a.p363d.C9017d.mtrl_textinput_box_stroke_width_focused
            int r4 = r4.getDimensionPixelSize(r5)
            int r3 = r1.mo1789f(r3, r4)
            r0.f12210M = r3
            r0.f12208K = r2
            int r2 = p174e.p319f.p320a.p363d.C9024k.f24557E3
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r1.mo1787d(r2, r3)
            int r4 = p174e.p319f.p320a.p363d.C9024k.f24552D3
            float r4 = r1.mo1787d(r4, r3)
            int r5 = p174e.p319f.p320a.p363d.C9024k.f24542B3
            float r5 = r1.mo1787d(r5, r3)
            int r6 = p174e.p319f.p320a.p363d.C9024k.f24547C3
            float r3 = r1.mo1787d(r6, r3)
            e.f.a.d.a0.k r6 = r0.f12204G
            e.f.a.d.a0.k$b r6 = r6.mo22864v()
            r7 = 0
            int r8 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r8 < 0) goto L_0x013c
            r6.mo22884z(r2)
        L_0x013c:
            int r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0143
            r6.mo22870D(r4)
        L_0x0143:
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x014a
            r6.mo22880v(r5)
        L_0x014a:
            int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0151
            r6.mo22876r(r3)
        L_0x0151:
            e.f.a.d.a0.k r2 = r6.mo22872m()
            r0.f12204G = r2
            int r2 = p174e.p319f.p320a.p363d.C9024k.f24811y3
            android.content.res.ColorStateList r2 = p174e.p319f.p320a.p363d.p379x.C9062c.m30198b(r11, r1, r2)
            r3 = 16843623(0x1010367, float:2.3696E-38)
            r4 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            r5 = -1
            if (r2 == 0) goto L_0x01a4
            int r6 = r2.getDefaultColor()
            r0.f12250v0 = r6
            r0.f12212O = r6
            boolean r6 = r2.isStateful()
            if (r6 == 0) goto L_0x0188
            int[] r6 = new int[r12]
            r7 = 0
            r6[r7] = r4
            int r6 = r2.getColorForState(r6, r5)
            r0.f12252w0 = r6
            int[] r6 = new int[r12]
            r6[r7] = r3
            int r2 = r2.getColorForState(r6, r5)
            goto L_0x01a1
        L_0x0188:
            r7 = 0
            int r2 = p174e.p319f.p320a.p363d.C9016c.mtrl_filled_background_color
            android.content.res.ColorStateList r2 = p027c.p028a.p029k.p030a.C1445a.m6445c(r11, r2)
            int[] r6 = new int[r12]
            r6[r7] = r4
            int r6 = r2.getColorForState(r6, r5)
            r0.f12252w0 = r6
            int[] r6 = new int[r12]
            r6[r7] = r3
            int r2 = r2.getColorForState(r6, r5)
        L_0x01a1:
            r0.f12254x0 = r2
            goto L_0x01ad
        L_0x01a4:
            r7 = 0
            r0.f12212O = r7
            r0.f12250v0 = r7
            r0.f12252w0 = r7
            r0.f12254x0 = r7
        L_0x01ad:
            int r2 = p174e.p319f.p320a.p363d.C9024k.f24799w3
            boolean r6 = r1.mo1802s(r2)
            if (r6 == 0) goto L_0x01bd
            android.content.res.ColorStateList r2 = r1.mo1786c(r2)
            r0.f12242r0 = r2
            r0.f12240q0 = r2
        L_0x01bd:
            int r2 = p174e.p319f.p320a.p363d.C9024k.f24562F3
            android.content.res.ColorStateList r6 = p174e.p319f.p320a.p363d.p379x.C9062c.m30198b(r11, r1, r2)
            if (r6 == 0) goto L_0x01f4
            boolean r7 = r6.isStateful()
            if (r7 == 0) goto L_0x01f4
            int r2 = r6.getDefaultColor()
            r0.f12244s0 = r2
            int[] r2 = new int[r12]
            r7 = 0
            r2[r7] = r4
            int r2 = r6.getColorForState(r2, r5)
            r0.f12256y0 = r2
            int[] r2 = new int[r12]
            r2[r7] = r3
            int r2 = r6.getColorForState(r2, r5)
            r0.f12246t0 = r2
            int[] r2 = new int[r12]
            r3 = 16842908(0x101009c, float:2.3693995E-38)
            r2[r7] = r3
            int r2 = r6.getColorForState(r2, r5)
            r0.f12248u0 = r2
            goto L_0x0213
        L_0x01f4:
            r7 = 0
            int r2 = r1.mo1785b(r2, r7)
            r0.f12248u0 = r2
            int r2 = p174e.p319f.p320a.p363d.C9016c.mtrl_textinput_default_box_stroke_color
            int r2 = androidx.core.content.C1135a.m4417c(r11, r2)
            r0.f12244s0 = r2
            int r2 = p174e.p319f.p320a.p363d.C9016c.mtrl_textinput_disabled_color
            int r2 = androidx.core.content.C1135a.m4417c(r11, r2)
            r0.f12256y0 = r2
            int r2 = p174e.p319f.p320a.p363d.C9016c.mtrl_textinput_hovered_box_stroke_color
            int r2 = androidx.core.content.C1135a.m4417c(r11, r2)
            r0.f12246t0 = r2
        L_0x0213:
            int r2 = r1.mo1797n(r10, r5)
            if (r2 == r5) goto L_0x0222
            r2 = 0
            int r3 = r1.mo1797n(r10, r2)
            r0.setHintTextAppearance(r3)
            goto L_0x0223
        L_0x0222:
            r2 = 0
        L_0x0223:
            r3 = r18
            int r3 = r1.mo1797n(r3, r2)
            int r4 = p174e.p319f.p320a.p363d.C9024k.f24637U3
            boolean r4 = r1.mo1784a(r4, r2)
            android.content.Context r6 = r19.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            int r7 = p174e.p319f.p320a.p363d.C9021h.design_text_input_end_icon
            android.view.View r6 = r6.inflate(r7, r13, r2)
            com.google.android.material.internal.CheckableImageButton r6 = (com.google.android.material.internal.CheckableImageButton) r6
            r0.f12236o0 = r6
            r13.addView(r6)
            r2 = 8
            r6.setVisibility(r2)
            int r8 = p174e.p319f.p320a.p363d.C9024k.f24642V3
            boolean r9 = r1.mo1802s(r8)
            if (r9 == 0) goto L_0x0258
            android.graphics.drawable.Drawable r8 = r1.mo1790g(r8)
            r0.setErrorIconDrawable((android.graphics.drawable.Drawable) r8)
        L_0x0258:
            int r8 = p174e.p319f.p320a.p363d.C9024k.f24647W3
            boolean r9 = r1.mo1802s(r8)
            if (r9 == 0) goto L_0x0267
            android.content.res.ColorStateList r8 = p174e.p319f.p320a.p363d.p379x.C9062c.m30198b(r11, r1, r8)
            r0.setErrorIconTintList(r8)
        L_0x0267:
            int r8 = p174e.p319f.p320a.p363d.C9024k.f24652X3
            boolean r9 = r1.mo1802s(r8)
            r10 = 0
            if (r9 == 0) goto L_0x027b
            int r8 = r1.mo1794k(r8, r5)
            android.graphics.PorterDuff$Mode r8 = com.google.android.material.internal.C4274h.m16433c(r8, r10)
            r0.setErrorIconTintMode(r8)
        L_0x027b:
            android.content.res.Resources r8 = r19.getResources()
            int r9 = p174e.p319f.p320a.p363d.C9022i.error_icon_content_description
            java.lang.CharSequence r8 = r8.getText(r9)
            r6.setContentDescription(r8)
            r8 = 2
            p027c.p064i.p072j.C1988t.m8414w0(r6, r8)
            r9 = 0
            r6.setClickable(r9)
            r6.setPressable(r9)
            r6.setFocusable(r9)
            r6 = r17
            int r6 = r1.mo1797n(r6, r9)
            int r8 = p174e.p319f.p320a.p363d.C9024k.f24674b4
            boolean r8 = r1.mo1784a(r8, r9)
            int r12 = p174e.p319f.p320a.p363d.C9024k.f24668a4
            java.lang.CharSequence r12 = r1.mo1799p(r12)
            int r10 = p174e.p319f.p320a.p363d.C9024k.f24577I3
            boolean r10 = r1.mo1784a(r10, r9)
            int r2 = p174e.p319f.p320a.p363d.C9024k.f24582J3
            int r2 = r1.mo1794k(r2, r5)
            r0.setCounterMaxLength(r2)
            int r2 = r1.mo1797n(r14, r9)
            r0.f12255y = r2
            int r2 = r1.mo1797n(r15, r9)
            r0.f12253x = r2
            android.content.Context r2 = r19.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            int r14 = p174e.p319f.p320a.p363d.C9021h.design_text_input_start_icon
            android.view.View r2 = r2.inflate(r14, r13, r9)
            com.google.android.material.internal.CheckableImageButton r2 = (com.google.android.material.internal.CheckableImageButton) r2
            r0.f12217T = r2
            r13.addView(r2)
            r9 = 8
            r2.setVisibility(r9)
            r2 = 0
            r0.setStartIconOnClickListener(r2)
            r0.setStartIconOnLongClickListener(r2)
            int r2 = p174e.p319f.p320a.p363d.C9024k.f24758p4
            boolean r9 = r1.mo1802s(r2)
            if (r9 == 0) goto L_0x030c
            android.graphics.drawable.Drawable r2 = r1.mo1790g(r2)
            r0.setStartIconDrawable((android.graphics.drawable.Drawable) r2)
            int r2 = p174e.p319f.p320a.p363d.C9024k.f24752o4
            boolean r9 = r1.mo1802s(r2)
            if (r9 == 0) goto L_0x0302
            java.lang.CharSequence r2 = r1.mo1799p(r2)
            r0.setStartIconContentDescription((java.lang.CharSequence) r2)
        L_0x0302:
            int r2 = p174e.p319f.p320a.p363d.C9024k.f24746n4
            r9 = 1
            boolean r2 = r1.mo1784a(r2, r9)
            r0.setStartIconCheckable(r2)
        L_0x030c:
            int r2 = p174e.p319f.p320a.p363d.C9024k.f24764q4
            boolean r9 = r1.mo1802s(r2)
            if (r9 == 0) goto L_0x031b
            android.content.res.ColorStateList r2 = p174e.p319f.p320a.p363d.p379x.C9062c.m30198b(r11, r1, r2)
            r0.setStartIconTintList(r2)
        L_0x031b:
            int r2 = p174e.p319f.p320a.p363d.C9024k.f24770r4
            boolean r9 = r1.mo1802s(r2)
            if (r9 == 0) goto L_0x032f
            int r2 = r1.mo1794k(r2, r5)
            r9 = 0
            android.graphics.PorterDuff$Mode r2 = com.google.android.material.internal.C4274h.m16433c(r2, r9)
            r0.setStartIconTintMode(r2)
        L_0x032f:
            r0.setHelperTextEnabled(r8)
            r0.setHelperText(r12)
            r0.setHelperTextTextAppearance(r6)
            r0.setErrorEnabled(r4)
            r0.setErrorTextAppearance(r3)
            int r2 = r0.f12255y
            r0.setCounterTextAppearance(r2)
            int r2 = r0.f12253x
            r0.setCounterOverflowTextAppearance(r2)
            int r2 = p174e.p319f.p320a.p363d.C9024k.f24662Z3
            boolean r3 = r1.mo1802s(r2)
            if (r3 == 0) goto L_0x0357
            android.content.res.ColorStateList r2 = r1.mo1786c(r2)
            r0.setErrorTextColor(r2)
        L_0x0357:
            int r2 = p174e.p319f.p320a.p363d.C9024k.f24686d4
            boolean r3 = r1.mo1802s(r2)
            if (r3 == 0) goto L_0x0366
            android.content.res.ColorStateList r2 = r1.mo1786c(r2)
            r0.setHelperTextColor(r2)
        L_0x0366:
            int r2 = p174e.p319f.p320a.p363d.C9024k.f24710h4
            boolean r3 = r1.mo1802s(r2)
            if (r3 == 0) goto L_0x0375
            android.content.res.ColorStateList r2 = r1.mo1786c(r2)
            r0.setHintTextColor(r2)
        L_0x0375:
            int r2 = p174e.p319f.p320a.p363d.C9024k.f24602N3
            boolean r3 = r1.mo1802s(r2)
            if (r3 == 0) goto L_0x0384
            android.content.res.ColorStateList r2 = r1.mo1786c(r2)
            r0.setCounterTextColor(r2)
        L_0x0384:
            int r2 = p174e.p319f.p320a.p363d.C9024k.f24592L3
            boolean r3 = r1.mo1802s(r2)
            if (r3 == 0) goto L_0x0393
            android.content.res.ColorStateList r2 = r1.mo1786c(r2)
            r0.setCounterOverflowTextColor(r2)
        L_0x0393:
            r0.setCounterEnabled(r10)
            int r2 = p174e.p319f.p320a.p363d.C9024k.f24817z3
            r3 = 0
            int r2 = r1.mo1794k(r2, r3)
            r0.setBoxBackgroundMode(r2)
            android.content.Context r2 = r19.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            android.widget.FrameLayout r4 = r0.f12237p
            android.view.View r2 = r2.inflate(r7, r4, r3)
            com.google.android.material.internal.CheckableImageButton r2 = (com.google.android.material.internal.CheckableImageButton) r2
            r0.f12227g0 = r2
            android.widget.FrameLayout r3 = r0.f12237p
            r3.addView(r2)
            r3 = 8
            r2.setVisibility(r3)
            android.util.SparseArray<com.google.android.material.textfield.e> r2 = r0.f12226f0
            com.google.android.material.textfield.b r3 = new com.google.android.material.textfield.b
            r3.<init>(r0)
            r2.append(r5, r3)
            android.util.SparseArray<com.google.android.material.textfield.e> r2 = r0.f12226f0
            com.google.android.material.textfield.g r3 = new com.google.android.material.textfield.g
            r3.<init>(r0)
            r4 = 0
            r2.append(r4, r3)
            android.util.SparseArray<com.google.android.material.textfield.e> r2 = r0.f12226f0
            com.google.android.material.textfield.h r3 = new com.google.android.material.textfield.h
            r3.<init>(r0)
            r4 = 1
            r2.append(r4, r3)
            android.util.SparseArray<com.google.android.material.textfield.e> r2 = r0.f12226f0
            com.google.android.material.textfield.a r3 = new com.google.android.material.textfield.a
            r3.<init>(r0)
            r4 = 2
            r2.append(r4, r3)
            android.util.SparseArray<com.google.android.material.textfield.e> r2 = r0.f12226f0
            com.google.android.material.textfield.d r3 = new com.google.android.material.textfield.d
            r3.<init>(r0)
            r4 = 3
            r2.append(r4, r3)
            int r2 = p174e.p319f.p320a.p363d.C9024k.f24622R3
            boolean r3 = r1.mo1802s(r2)
            if (r3 == 0) goto L_0x042b
            r3 = 0
            int r2 = r1.mo1794k(r2, r3)
            r0.setEndIconMode(r2)
            int r2 = p174e.p319f.p320a.p363d.C9024k.f24617Q3
            boolean r3 = r1.mo1802s(r2)
            if (r3 == 0) goto L_0x0411
            android.graphics.drawable.Drawable r2 = r1.mo1790g(r2)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r2)
        L_0x0411:
            int r2 = p174e.p319f.p320a.p363d.C9024k.f24612P3
            boolean r3 = r1.mo1802s(r2)
            if (r3 == 0) goto L_0x0420
            java.lang.CharSequence r2 = r1.mo1799p(r2)
            r0.setEndIconContentDescription((java.lang.CharSequence) r2)
        L_0x0420:
            int r2 = p174e.p319f.p320a.p363d.C9024k.f24607O3
            r3 = 1
            boolean r2 = r1.mo1784a(r2, r3)
            r0.setEndIconCheckable(r2)
            goto L_0x0470
        L_0x042b:
            int r2 = p174e.p319f.p320a.p363d.C9024k.f24728k4
            boolean r3 = r1.mo1802s(r2)
            if (r3 == 0) goto L_0x0470
            r3 = 0
            boolean r2 = r1.mo1784a(r2, r3)
            r0.setEndIconMode(r2)
            int r2 = p174e.p319f.p320a.p363d.C9024k.f24722j4
            android.graphics.drawable.Drawable r2 = r1.mo1790g(r2)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r2)
            int r2 = p174e.p319f.p320a.p363d.C9024k.f24716i4
            java.lang.CharSequence r2 = r1.mo1799p(r2)
            r0.setEndIconContentDescription((java.lang.CharSequence) r2)
            int r2 = p174e.p319f.p320a.p363d.C9024k.f24734l4
            boolean r3 = r1.mo1802s(r2)
            if (r3 == 0) goto L_0x045c
            android.content.res.ColorStateList r2 = p174e.p319f.p320a.p363d.p379x.C9062c.m30198b(r11, r1, r2)
            r0.setEndIconTintList(r2)
        L_0x045c:
            int r2 = p174e.p319f.p320a.p363d.C9024k.f24740m4
            boolean r3 = r1.mo1802s(r2)
            if (r3 == 0) goto L_0x0470
            int r2 = r1.mo1794k(r2, r5)
            r3 = 0
            android.graphics.PorterDuff$Mode r2 = com.google.android.material.internal.C4274h.m16433c(r2, r3)
            r0.setEndIconTintMode(r2)
        L_0x0470:
            int r2 = p174e.p319f.p320a.p363d.C9024k.f24728k4
            boolean r2 = r1.mo1802s(r2)
            if (r2 != 0) goto L_0x049b
            int r2 = p174e.p319f.p320a.p363d.C9024k.f24627S3
            boolean r3 = r1.mo1802s(r2)
            if (r3 == 0) goto L_0x0487
            android.content.res.ColorStateList r2 = p174e.p319f.p320a.p363d.p379x.C9062c.m30198b(r11, r1, r2)
            r0.setEndIconTintList(r2)
        L_0x0487:
            int r2 = p174e.p319f.p320a.p363d.C9024k.f24632T3
            boolean r3 = r1.mo1802s(r2)
            if (r3 == 0) goto L_0x049b
            int r2 = r1.mo1794k(r2, r5)
            r3 = 0
            android.graphics.PorterDuff$Mode r2 = com.google.android.material.internal.C4274h.m16433c(r2, r3)
            r0.setEndIconTintMode(r2)
        L_0x049b:
            r1.mo1803w()
            r1 = 2
            p027c.p064i.p072j.C1988t.m8414w0(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: A */
    private void m16533A(Canvas canvas) {
        if (this.f12195B) {
            this.f12194A0.mo13474i(canvas);
        }
    }

    /* renamed from: B */
    private void m16534B(boolean z) {
        ValueAnimator valueAnimator = this.f12198C0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f12198C0.cancel();
        }
        if (!z || !this.f12196B0) {
            this.f12194A0.mo13467O(0.0f);
        } else {
            mo13604e(0.0f);
        }
        if (m16574w() && ((C4324c) this.f12201E).mo13728f0()) {
            m16572u();
        }
        this.f12258z0 = true;
    }

    /* renamed from: C */
    private boolean m16535C() {
        return this.f12225e0 != 0;
    }

    /* renamed from: D */
    private boolean m16536D() {
        return getStartIconDrawable() != null;
    }

    /* renamed from: H */
    private boolean m16537H() {
        return this.f12206I == 1 && (Build.VERSION.SDK_INT < 16 || this.f12239q.getMinLines() <= 1);
    }

    /* renamed from: J */
    private void m16538J() {
        m16563l();
        m16541M();
        mo13605e0();
        if (this.f12206I != 0) {
            m16555b0();
        }
    }

    /* renamed from: K */
    private void m16539K() {
        if (m16574w()) {
            RectF rectF = this.f12215R;
            this.f12194A0.mo13475k(rectF);
            m16559h(rectF);
            rectF.offset((float) (-getPaddingLeft()), 0.0f);
            ((C4324c) this.f12201E).mo13731l0(rectF);
        }
    }

    /* renamed from: L */
    private static void m16540L(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m16540L((ViewGroup) childAt, z);
            }
        }
    }

    /* renamed from: M */
    private void m16541M() {
        if (m16545R()) {
            C1988t.m8400p0(this.f12239q, this.f12201E);
        }
    }

    /* renamed from: N */
    private static void m16542N(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean M = C1988t.m8355M(checkableImageButton);
        boolean z = false;
        int i = 1;
        boolean z2 = onLongClickListener != null;
        if (M || z2) {
            z = true;
        }
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(M);
        checkableImageButton.setPressable(M);
        checkableImageButton.setLongClickable(z2);
        if (!z) {
            i = 2;
        }
        C1988t.m8414w0(checkableImageButton, i);
    }

    /* renamed from: O */
    private static void m16543O(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        m16542N(checkableImageButton, onLongClickListener);
    }

    /* renamed from: P */
    private static void m16544P(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m16542N(checkableImageButton, onLongClickListener);
    }

    /* renamed from: R */
    private boolean m16545R() {
        EditText editText = this.f12239q;
        return (editText == null || this.f12201E == null || editText.getBackground() != null || this.f12206I == 0) ? false : true;
    }

    /* renamed from: S */
    private void m16546S(boolean z) {
        if (!z || getEndIconDrawable() == null) {
            m16560i();
            return;
        }
        Drawable mutate = C1164a.m4554r(getEndIconDrawable()).mutate();
        C1164a.m4550n(mutate, this.f12243s.mo13757n());
        this.f12227g0.setImageDrawable(mutate);
    }

    /* renamed from: T */
    private void m16547T(Rect rect) {
        C8990g gVar = this.f12203F;
        if (gVar != null) {
            int i = rect.bottom;
            gVar.setBounds(rect.left, i - this.f12210M, rect.right, i);
        }
    }

    /* renamed from: U */
    private void m16548U() {
        if (this.f12251w != null) {
            EditText editText = this.f12239q;
            mo13594V(editText == null ? 0 : editText.getText().length());
        }
    }

    /* renamed from: W */
    private static void m16549W(Context context, TextView textView, int i, int i2, boolean z) {
        textView.setContentDescription(context.getString(z ? C9022i.character_counter_overflowed_content_description : C9022i.character_counter_content_description, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* renamed from: X */
    private void m16550X() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f12251w;
        if (textView != null) {
            mo13593Q(textView, this.f12249v ? this.f12253x : this.f12255y);
            if (!this.f12249v && (colorStateList2 = this.f12257z) != null) {
                this.f12251w.setTextColor(colorStateList2);
            }
            if (this.f12249v && (colorStateList = this.f12193A) != null) {
                this.f12251w.setTextColor(colorStateList);
            }
        }
    }

    /* renamed from: Z */
    private boolean m16551Z() {
        int max;
        if (this.f12239q == null || this.f12239q.getMeasuredHeight() >= (max = Math.max(this.f12227g0.getMeasuredHeight(), this.f12217T.getMeasuredHeight()))) {
            return false;
        }
        this.f12239q.setMinimumHeight(max);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ca  */
    /* renamed from: a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m16553a0() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f12239q
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r10.m16536D()
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0060
            boolean r0 = r10.mo13592I()
            if (r0 == 0) goto L_0x0060
            com.google.android.material.internal.CheckableImageButton r0 = r10.f12217T
            int r0 = r0.getMeasuredWidth()
            if (r0 <= 0) goto L_0x0060
            android.graphics.drawable.Drawable r0 = r10.f12222b0
            if (r0 != 0) goto L_0x0048
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>()
            r10.f12222b0 = r0
            com.google.android.material.internal.CheckableImageButton r0 = r10.f12217T
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.f12239q
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            com.google.android.material.internal.CheckableImageButton r6 = r10.f12217T
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r6 = p027c.p064i.p072j.C1952g.m8183a(r6)
            int r0 = r0 + r6
            android.graphics.drawable.Drawable r6 = r10.f12222b0
            r6.setBounds(r1, r1, r0, r5)
        L_0x0048:
            android.widget.EditText r0 = r10.f12239q
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.C1194i.m4694a(r0)
            r6 = r0[r1]
            android.graphics.drawable.Drawable r7 = r10.f12222b0
            if (r6 == r7) goto L_0x0079
            android.widget.EditText r6 = r10.f12239q
            r8 = r0[r5]
            r9 = r0[r4]
            r0 = r0[r3]
            androidx.core.widget.C1194i.m4702i(r6, r7, r8, r9, r0)
            goto L_0x0077
        L_0x0060:
            android.graphics.drawable.Drawable r0 = r10.f12222b0
            if (r0 == 0) goto L_0x0079
            android.widget.EditText r0 = r10.f12239q
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.C1194i.m4694a(r0)
            android.widget.EditText r6 = r10.f12239q
            r7 = r0[r5]
            r8 = r0[r4]
            r0 = r0[r3]
            androidx.core.widget.C1194i.m4702i(r6, r2, r7, r8, r0)
            r10.f12222b0 = r2
        L_0x0077:
            r0 = 1
            goto L_0x007a
        L_0x0079:
            r0 = 0
        L_0x007a:
            com.google.android.material.internal.CheckableImageButton r6 = r10.getEndIconToUpdateDummyDrawable()
            if (r6 == 0) goto L_0x00ca
            int r7 = r6.getMeasuredWidth()
            if (r7 <= 0) goto L_0x00ca
            android.graphics.drawable.Drawable r2 = r10.f12233m0
            if (r2 != 0) goto L_0x00ac
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r2.<init>()
            r10.f12233m0 = r2
            int r2 = r6.getMeasuredWidth()
            android.widget.EditText r7 = r10.f12239q
            int r7 = r7.getPaddingRight()
            int r2 = r2 - r7
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r6 = p027c.p064i.p072j.C1952g.m8184b(r6)
            int r2 = r2 + r6
            android.graphics.drawable.Drawable r6 = r10.f12233m0
            r6.setBounds(r1, r1, r2, r5)
        L_0x00ac:
            android.widget.EditText r2 = r10.f12239q
            android.graphics.drawable.Drawable[] r2 = androidx.core.widget.C1194i.m4694a(r2)
            r6 = r2[r4]
            android.graphics.drawable.Drawable r7 = r10.f12233m0
            if (r6 == r7) goto L_0x00c8
            r0 = r2[r4]
            r10.f12234n0 = r0
            android.widget.EditText r0 = r10.f12239q
            r1 = r2[r1]
            r4 = r2[r5]
            r2 = r2[r3]
            androidx.core.widget.C1194i.m4702i(r0, r1, r4, r7, r2)
            goto L_0x00eb
        L_0x00c8:
            r5 = r0
            goto L_0x00eb
        L_0x00ca:
            android.graphics.drawable.Drawable r6 = r10.f12233m0
            if (r6 == 0) goto L_0x00ec
            android.widget.EditText r6 = r10.f12239q
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.C1194i.m4694a(r6)
            r4 = r6[r4]
            android.graphics.drawable.Drawable r7 = r10.f12233m0
            if (r4 != r7) goto L_0x00e8
            android.widget.EditText r0 = r10.f12239q
            r1 = r6[r1]
            r4 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f12234n0
            r3 = r6[r3]
            androidx.core.widget.C1194i.m4702i(r0, r1, r4, r7, r3)
            goto L_0x00e9
        L_0x00e8:
            r5 = r0
        L_0x00e9:
            r10.f12233m0 = r2
        L_0x00eb:
            r0 = r5
        L_0x00ec:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m16553a0():boolean");
    }

    /* renamed from: b0 */
    private void m16555b0() {
        if (this.f12206I != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f12235o.getLayoutParams();
            int r = m16569r();
            if (r != layoutParams.topMargin) {
                layoutParams.topMargin = r;
                this.f12235o.requestLayout();
            }
        }
    }

    /* renamed from: d0 */
    private void m16556d0(boolean z, boolean z2) {
        ColorStateList colorStateList;
        C4262a aVar;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f12239q;
        boolean z3 = true;
        boolean z4 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f12239q;
        if (editText2 == null || !editText2.hasFocus()) {
            z3 = false;
        }
        boolean k = this.f12243s.mo13755k();
        ColorStateList colorStateList2 = this.f12240q0;
        if (colorStateList2 != null) {
            this.f12194A0.mo13459E(colorStateList2);
            this.f12194A0.mo13464K(this.f12240q0);
        }
        if (!isEnabled) {
            this.f12194A0.mo13459E(ColorStateList.valueOf(this.f12256y0));
            this.f12194A0.mo13464K(ColorStateList.valueOf(this.f12256y0));
        } else if (k) {
            this.f12194A0.mo13459E(this.f12243s.mo13758o());
        } else {
            if (this.f12249v && (textView = this.f12251w) != null) {
                aVar = this.f12194A0;
                colorStateList = textView.getTextColors();
            } else if (z3 && (colorStateList = this.f12242r0) != null) {
                aVar = this.f12194A0;
            }
            aVar.mo13459E(colorStateList);
        }
        if (z4 || (isEnabled() && (z3 || k))) {
            if (z2 || this.f12258z0) {
                m16573v(z);
            }
        } else if (z2 || !this.f12258z0) {
            m16534B(z);
        }
    }

    /* renamed from: f */
    private void m16557f() {
        C8990g gVar = this.f12201E;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(this.f12204G);
            if (m16570s()) {
                this.f12201E.mo22824Y((float) this.f12208K, this.f12211N);
            }
            int m = m16564m();
            this.f12212O = m;
            this.f12201E.mo22819T(ColorStateList.valueOf(m));
            if (this.f12225e0 == 3) {
                this.f12239q.getBackground().invalidateSelf();
            }
            m16558g();
            invalidate();
        }
    }

    /* renamed from: g */
    private void m16558g() {
        if (this.f12203F != null) {
            if (m16571t()) {
                this.f12203F.mo22819T(ColorStateList.valueOf(this.f12211N));
            }
            invalidate();
        }
    }

    private C4336e getEndIconDelegate() {
        C4336e eVar = this.f12226f0.get(this.f12225e0);
        return eVar != null ? eVar : this.f12226f0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f12236o0.getVisibility() == 0) {
            return this.f12236o0;
        }
        if (!m16535C() || !mo13589E()) {
            return null;
        }
        return this.f12227g0;
    }

    /* renamed from: h */
    private void m16559h(RectF rectF) {
        float f = rectF.left;
        int i = this.f12205H;
        rectF.left = f - ((float) i);
        rectF.top -= (float) i;
        rectF.right += (float) i;
        rectF.bottom += (float) i;
    }

    /* renamed from: i */
    private void m16560i() {
        m16561j(this.f12227g0, this.f12230j0, this.f12229i0, this.f12232l0, this.f12231k0);
    }

    /* renamed from: j */
    private void m16561j(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = C1164a.m4554r(drawable).mutate();
            if (z) {
                C1164a.m4551o(drawable, colorStateList);
            }
            if (z2) {
                C1164a.m4552p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: k */
    private void m16562k() {
        m16561j(this.f12217T, this.f12219V, this.f12218U, this.f12221a0, this.f12220W);
    }

    /* renamed from: l */
    private void m16563l() {
        int i = this.f12206I;
        if (i == 0) {
            this.f12201E = null;
        } else if (i == 1) {
            this.f12201E = new C8990g(this.f12204G);
            this.f12203F = new C8990g();
            return;
        } else if (i == 2) {
            this.f12201E = (!this.f12195B || (this.f12201E instanceof C4324c)) ? new C8990g(this.f12204G) : new C4324c(this.f12204G);
        } else {
            throw new IllegalArgumentException(this.f12206I + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
        this.f12203F = null;
    }

    /* renamed from: m */
    private int m16564m() {
        return this.f12206I == 1 ? C9052a.m30174e(C9052a.m30173d(this, C9013b.colorSurface, 0), this.f12212O) : this.f12212O;
    }

    /* renamed from: n */
    private Rect m16565n(Rect rect) {
        int i;
        int i2;
        int i3;
        EditText editText = this.f12239q;
        if (editText != null) {
            Rect rect2 = this.f12214Q;
            rect2.bottom = rect.bottom;
            int i4 = this.f12206I;
            if (i4 == 1) {
                rect2.left = rect.left + editText.getCompoundPaddingLeft();
                i = rect.top + this.f12207J;
            } else if (i4 != 2) {
                rect2.left = rect.left + editText.getCompoundPaddingLeft();
                i = getPaddingTop();
            } else {
                rect2.left = rect.left + editText.getPaddingLeft();
                rect2.top = rect.top - m16569r();
                i2 = rect.right;
                i3 = this.f12239q.getPaddingRight();
                rect2.right = i2 - i3;
                return rect2;
            }
            rect2.top = i;
            i2 = rect.right;
            i3 = this.f12239q.getCompoundPaddingRight();
            rect2.right = i2 - i3;
            return rect2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: o */
    private int m16566o(Rect rect, Rect rect2, float f) {
        return this.f12206I == 1 ? (int) (((float) rect2.top) + f) : rect.bottom - this.f12239q.getCompoundPaddingBottom();
    }

    /* renamed from: p */
    private int m16567p(Rect rect, float f) {
        return m16537H() ? (int) (((float) rect.centerY()) - (f / 2.0f)) : rect.top + this.f12239q.getCompoundPaddingTop();
    }

    /* renamed from: q */
    private Rect m16568q(Rect rect) {
        if (this.f12239q != null) {
            Rect rect2 = this.f12214Q;
            float q = this.f12194A0.mo13479q();
            rect2.left = rect.left + this.f12239q.getCompoundPaddingLeft();
            rect2.top = m16567p(rect, q);
            rect2.right = rect.right - this.f12239q.getCompoundPaddingRight();
            rect2.bottom = m16566o(rect, rect2, q);
            return rect2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: r */
    private int m16569r() {
        float m;
        if (!this.f12195B) {
            return 0;
        }
        int i = this.f12206I;
        if (i == 0 || i == 1) {
            m = this.f12194A0.mo13477m();
        } else if (i != 2) {
            return 0;
        } else {
            m = this.f12194A0.mo13477m() / 2.0f;
        }
        return (int) m;
    }

    /* renamed from: s */
    private boolean m16570s() {
        return this.f12206I == 2 && m16571t();
    }

    private void setEditText(EditText editText) {
        if (this.f12239q == null) {
            if (this.f12225e0 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f12239q = editText;
            m16538J();
            setTextInputAccessibilityDelegate(new C4310e(this));
            this.f12194A0.mo13472U(this.f12239q.getTypeface());
            this.f12194A0.mo13466M(this.f12239q.getTextSize());
            int gravity = this.f12239q.getGravity();
            this.f12194A0.mo13460F((gravity & -113) | 48);
            this.f12194A0.mo13465L(gravity);
            this.f12239q.addTextChangedListener(new C4306a());
            if (this.f12240q0 == null) {
                this.f12240q0 = this.f12239q.getHintTextColors();
            }
            if (this.f12195B) {
                if (TextUtils.isEmpty(this.f12197C)) {
                    CharSequence hint = this.f12239q.getHint();
                    this.f12241r = hint;
                    setHint(hint);
                    this.f12239q.setHint((CharSequence) null);
                }
                this.f12199D = true;
            }
            if (this.f12251w != null) {
                mo13594V(this.f12239q.getText().length());
            }
            mo13595Y();
            this.f12243s.mo13753e();
            this.f12217T.bringToFront();
            this.f12237p.bringToFront();
            this.f12236o0.bringToFront();
            m16575x();
            m16556d0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z) {
        int i = 0;
        this.f12236o0.setVisibility(z ? 0 : 8);
        FrameLayout frameLayout = this.f12237p;
        if (z) {
            i = 8;
        }
        frameLayout.setVisibility(i);
        if (!m16535C()) {
            m16553a0();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f12197C)) {
            this.f12197C = charSequence;
            this.f12194A0.mo13470S(charSequence);
            if (!this.f12258z0) {
                m16539K();
            }
        }
    }

    /* renamed from: t */
    private boolean m16571t() {
        return this.f12208K > -1 && this.f12211N != 0;
    }

    /* renamed from: u */
    private void m16572u() {
        if (m16574w()) {
            ((C4324c) this.f12201E).mo13729i0();
        }
    }

    /* renamed from: v */
    private void m16573v(boolean z) {
        ValueAnimator valueAnimator = this.f12198C0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f12198C0.cancel();
        }
        if (!z || !this.f12196B0) {
            this.f12194A0.mo13467O(1.0f);
        } else {
            mo13604e(1.0f);
        }
        this.f12258z0 = false;
        if (m16574w()) {
            m16539K();
        }
    }

    /* renamed from: w */
    private boolean m16574w() {
        return this.f12195B && !TextUtils.isEmpty(this.f12197C) && (this.f12201E instanceof C4324c);
    }

    /* renamed from: x */
    private void m16575x() {
        Iterator it = this.f12224d0.iterator();
        while (it.hasNext()) {
            ((C4311f) it.next()).mo13710a(this);
        }
    }

    /* renamed from: y */
    private void m16576y(int i) {
        Iterator it = this.f12228h0.iterator();
        while (it.hasNext()) {
            ((C4312g) it.next()).mo13711a(this, i);
        }
    }

    /* renamed from: z */
    private void m16577z(Canvas canvas) {
        C8990g gVar = this.f12203F;
        if (gVar != null) {
            Rect bounds = gVar.getBounds();
            bounds.top = bounds.bottom - this.f12208K;
            this.f12203F.draw(canvas);
        }
    }

    /* renamed from: E */
    public boolean mo13589E() {
        return this.f12237p.getVisibility() == 0 && this.f12227g0.getVisibility() == 0;
    }

    /* renamed from: F */
    public boolean mo13590F() {
        return this.f12243s.mo13765w();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public boolean mo13591G() {
        return this.f12199D;
    }

    /* renamed from: I */
    public boolean mo13592I() {
        return this.f12217T.getVisibility() == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo13593Q(TextView textView, int i) {
        boolean z = true;
        try {
            C1194i.m4707n(textView, i);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            C1194i.m4707n(textView, C9023j.TextAppearance_AppCompat_Caption);
            textView.setTextColor(C1135a.m4417c(getContext(), C9016c.design_error));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo13594V(int i) {
        boolean z = this.f12249v;
        if (this.f12247u == -1) {
            this.f12251w.setText(String.valueOf(i));
            this.f12251w.setContentDescription((CharSequence) null);
            this.f12249v = false;
        } else {
            if (C1988t.m8393m(this.f12251w) == 1) {
                C1988t.m8398o0(this.f12251w, 0);
            }
            this.f12249v = i > this.f12247u;
            m16549W(getContext(), this.f12251w, i, this.f12247u, this.f12249v);
            if (z != this.f12249v) {
                m16550X();
                if (this.f12249v) {
                    C1988t.m8398o0(this.f12251w, 1);
                }
            }
            this.f12251w.setText(getContext().getString(C9022i.character_counter_pattern, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f12247u)}));
        }
        if (this.f12239q != null && z != this.f12249v) {
            mo13598c0(false);
            mo13605e0();
            mo13595Y();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo13595Y() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.f12239q;
        if (editText != null && this.f12206I == 0 && (background = editText.getBackground()) != null) {
            if (C0215e0.m1117a(background)) {
                background = background.mutate();
            }
            if (this.f12243s.mo13755k()) {
                currentTextColor = this.f12243s.mo13757n();
            } else if (!this.f12249v || (textView = this.f12251w) == null) {
                C1164a.m4539c(background);
                this.f12239q.refreshDrawableState();
                return;
            } else {
                currentTextColor = textView.getCurrentTextColor();
            }
            background.setColorFilter(C0231j.m1179e(currentTextColor, PorterDuff.Mode.SRC_IN));
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f12235o.addView(view, layoutParams2);
            this.f12235o.setLayoutParams(layoutParams);
            m16555b0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: c */
    public void mo13597c(C4311f fVar) {
        this.f12224d0.add(fVar);
        if (this.f12239q != null) {
            fVar.mo13710a(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void mo13598c0(boolean z) {
        m16556d0(z, false);
    }

    /* renamed from: d */
    public void mo13599d(C4312g gVar) {
        this.f12228h0.add(gVar);
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText;
        if (this.f12241r == null || (editText = this.f12239q) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        boolean z = this.f12199D;
        this.f12199D = false;
        CharSequence hint = editText.getHint();
        this.f12239q.setHint(this.f12241r);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
        } finally {
            this.f12239q.setHint(hint);
            this.f12199D = z;
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f12202E0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f12202E0 = false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        m16533A(canvas);
        m16577z(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (!this.f12200D0) {
            boolean z = true;
            this.f12200D0 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            C4262a aVar = this.f12194A0;
            boolean R = aVar != null ? aVar.mo13469R(drawableState) | false : false;
            if (!C1988t.m8361S(this) || !isEnabled()) {
                z = false;
            }
            mo13598c0(z);
            mo13595Y();
            mo13605e0();
            if (R) {
                invalidate();
            }
            this.f12200D0 = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo13604e(float f) {
        if (this.f12194A0.mo13480r() != f) {
            if (this.f12198C0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f12198C0 = valueAnimator;
                valueAnimator.setInterpolator(C9025a.f24820b);
                this.f12198C0.setDuration(167);
                this.f12198C0.addUpdateListener(new C4309d());
            }
            this.f12198C0.setFloatValues(new float[]{this.f12194A0.mo13480r(), f});
            this.f12198C0.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r5.f12239q;
     */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13605e0() {
        /*
            r5 = this;
            e.f.a.d.a0.g r0 = r5.f12201E
            if (r0 == 0) goto L_0x00c5
            int r0 = r5.f12206I
            if (r0 != 0) goto L_0x000a
            goto L_0x00c5
        L_0x000a:
            boolean r0 = r5.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r5.f12239q
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = 0
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            boolean r3 = r5.isHovered()
            if (r3 != 0) goto L_0x0033
            android.widget.EditText r3 = r5.f12239q
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            goto L_0x0034
        L_0x0033:
            r3 = 1
        L_0x0034:
            boolean r4 = r5.isEnabled()
            if (r4 != 0) goto L_0x003f
            int r4 = r5.f12256y0
        L_0x003c:
            r5.f12211N = r4
            goto L_0x0068
        L_0x003f:
            com.google.android.material.textfield.f r4 = r5.f12243s
            boolean r4 = r4.mo13755k()
            if (r4 == 0) goto L_0x004e
            com.google.android.material.textfield.f r4 = r5.f12243s
            int r4 = r4.mo13757n()
            goto L_0x003c
        L_0x004e:
            boolean r4 = r5.f12249v
            if (r4 == 0) goto L_0x005b
            android.widget.TextView r4 = r5.f12251w
            if (r4 == 0) goto L_0x005b
            int r4 = r4.getCurrentTextColor()
            goto L_0x003c
        L_0x005b:
            if (r0 == 0) goto L_0x0060
            int r4 = r5.f12248u0
            goto L_0x003c
        L_0x0060:
            if (r3 == 0) goto L_0x0065
            int r4 = r5.f12246t0
            goto L_0x003c
        L_0x0065:
            int r4 = r5.f12244s0
            goto L_0x003c
        L_0x0068:
            com.google.android.material.textfield.f r4 = r5.f12243s
            boolean r4 = r4.mo13755k()
            if (r4 == 0) goto L_0x007c
            com.google.android.material.textfield.e r4 = r5.getEndIconDelegate()
            boolean r4 = r4.mo13733c()
            if (r4 == 0) goto L_0x007c
            r4 = 1
            goto L_0x007d
        L_0x007c:
            r4 = 0
        L_0x007d:
            r5.m16546S(r4)
            android.graphics.drawable.Drawable r4 = r5.getErrorIconDrawable()
            if (r4 == 0) goto L_0x0097
            com.google.android.material.textfield.f r4 = r5.f12243s
            boolean r4 = r4.mo13764v()
            if (r4 == 0) goto L_0x0097
            com.google.android.material.textfield.f r4 = r5.f12243s
            boolean r4 = r4.mo13755k()
            if (r4 == 0) goto L_0x0097
            r1 = 1
        L_0x0097:
            r5.setErrorIconVisible(r1)
            if (r3 != 0) goto L_0x009e
            if (r0 == 0) goto L_0x00a7
        L_0x009e:
            boolean r0 = r5.isEnabled()
            if (r0 == 0) goto L_0x00a7
            int r0 = r5.f12210M
            goto L_0x00a9
        L_0x00a7:
            int r0 = r5.f12209L
        L_0x00a9:
            r5.f12208K = r0
            int r0 = r5.f12206I
            if (r0 != r2) goto L_0x00c2
            boolean r0 = r5.isEnabled()
            if (r0 != 0) goto L_0x00ba
            int r0 = r5.f12252w0
        L_0x00b7:
            r5.f12212O = r0
            goto L_0x00c2
        L_0x00ba:
            if (r3 == 0) goto L_0x00bf
            int r0 = r5.f12254x0
            goto L_0x00b7
        L_0x00bf:
            int r0 = r5.f12250v0
            goto L_0x00b7
        L_0x00c2:
            r5.m16557f()
        L_0x00c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mo13605e0():void");
    }

    public int getBaseline() {
        EditText editText = this.f12239q;
        return editText != null ? editText.getBaseline() + getPaddingTop() + m16569r() : super.getBaseline();
    }

    /* access modifiers changed from: package-private */
    public C8990g getBoxBackground() {
        int i = this.f12206I;
        if (i == 1 || i == 2) {
            return this.f12201E;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f12212O;
    }

    public int getBoxBackgroundMode() {
        return this.f12206I;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.f12201E.mo22836r();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.f12201E.mo22837s();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.f12201E.mo22812F();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f12201E.mo22811E();
    }

    public int getBoxStrokeColor() {
        return this.f12248u0;
    }

    public int getCounterMaxLength() {
        return this.f12247u;
    }

    /* access modifiers changed from: package-private */
    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.f12245t || !this.f12249v || (textView = this.f12251w) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f12257z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f12257z;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f12240q0;
    }

    public EditText getEditText() {
        return this.f12239q;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f12227g0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f12227g0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f12225e0;
    }

    /* access modifiers changed from: package-private */
    public CheckableImageButton getEndIconView() {
        return this.f12227g0;
    }

    public CharSequence getError() {
        if (this.f12243s.mo13764v()) {
            return this.f12243s.mo13756m();
        }
        return null;
    }

    public int getErrorCurrentTextColors() {
        return this.f12243s.mo13757n();
    }

    public Drawable getErrorIconDrawable() {
        return this.f12236o0.getDrawable();
    }

    /* access modifiers changed from: package-private */
    public final int getErrorTextCurrentColor() {
        return this.f12243s.mo13757n();
    }

    public CharSequence getHelperText() {
        if (this.f12243s.mo13765w()) {
            return this.f12243s.mo13759p();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f12243s.mo13760q();
    }

    public CharSequence getHint() {
        if (this.f12195B) {
            return this.f12197C;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final float getHintCollapsedTextHeight() {
        return this.f12194A0.mo13477m();
    }

    /* access modifiers changed from: package-private */
    public final int getHintCurrentCollapsedTextColor() {
        return this.f12194A0.mo13478n();
    }

    public ColorStateList getHintTextColor() {
        return this.f12242r0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f12227g0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f12227g0.getDrawable();
    }

    public CharSequence getStartIconContentDescription() {
        return this.f12217T.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f12217T.getDrawable();
    }

    public Typeface getTypeface() {
        return this.f12216S;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f12239q;
        if (editText != null) {
            Rect rect = this.f12213P;
            C4264b.m16395a(this, editText, rect);
            m16547T(rect);
            if (this.f12195B) {
                this.f12194A0.mo13457C(m16565n(rect));
                this.f12194A0.mo13463J(m16568q(rect));
                this.f12194A0.mo13483z();
                if (m16574w() && !this.f12258z0) {
                    m16539K();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean Z = m16551Z();
        boolean a0 = m16553a0();
        if (Z || a0) {
            this.f12239q.post(new C4308c());
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C4313h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C4313h hVar = (C4313h) parcelable;
        super.onRestoreInstanceState(hVar.mo6726a());
        setError(hVar.f12264p);
        if (hVar.f12265q) {
            this.f12227g0.post(new C4307b());
        }
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        C4313h hVar = new C4313h(super.onSaveInstanceState());
        if (this.f12243s.mo13755k()) {
            hVar.f12264p = getError();
        }
        hVar.f12265q = m16535C() && this.f12227g0.isChecked();
        return hVar;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f12212O != i) {
            this.f12212O = i;
            this.f12250v0 = i;
            m16557f();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(C1135a.m4417c(getContext(), i));
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.f12206I) {
            this.f12206I = i;
            if (this.f12239q != null) {
                m16538J();
            }
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.f12248u0 != i) {
            this.f12248u0 = i;
            mo13605e0();
        }
    }

    public void setCounterEnabled(boolean z) {
        if (this.f12245t != z) {
            if (z) {
                C0298z zVar = new C0298z(getContext());
                this.f12251w = zVar;
                zVar.setId(C9019f.textinput_counter);
                Typeface typeface = this.f12216S;
                if (typeface != null) {
                    this.f12251w.setTypeface(typeface);
                }
                this.f12251w.setMaxLines(1);
                this.f12243s.mo13752d(this.f12251w, 2);
                m16550X();
                m16548U();
            } else {
                this.f12243s.mo13766x(this.f12251w, 2);
                this.f12251w = null;
            }
            this.f12245t = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f12247u != i) {
            if (i <= 0) {
                i = -1;
            }
            this.f12247u = i;
            if (this.f12245t) {
                m16548U();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f12253x != i) {
            this.f12253x = i;
            m16550X();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f12193A != colorStateList) {
            this.f12193A = colorStateList;
            m16550X();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f12255y != i) {
            this.f12255y = i;
            m16550X();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f12257z != colorStateList) {
            this.f12257z = colorStateList;
            m16550X();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f12240q0 = colorStateList;
        this.f12242r0 = colorStateList;
        if (this.f12239q != null) {
            mo13598c0(false);
        }
    }

    public void setEnabled(boolean z) {
        m16540L(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f12227g0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f12227g0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f12227g0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? C1445a.m6446d(getContext(), i) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f12227g0.setImageDrawable(drawable);
    }

    public void setEndIconMode(int i) {
        int i2 = this.f12225e0;
        this.f12225e0 = i;
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().mo13732b(this.f12206I)) {
            getEndIconDelegate().mo13719a();
            m16560i();
            m16576y(i2);
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.f12206I + " is not supported by the end icon mode " + i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        m16543O(this.f12227g0, onClickListener, this.f12238p0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f12238p0 = onLongClickListener;
        m16544P(this.f12227g0, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f12229i0 != colorStateList) {
            this.f12229i0 = colorStateList;
            this.f12230j0 = true;
            m16560i();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f12231k0 != mode) {
            this.f12231k0 = mode;
            this.f12232l0 = true;
            m16560i();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (mo13589E() != z) {
            this.f12227g0.setVisibility(z ? 0 : 4);
            m16553a0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f12243s.mo13764v()) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f12243s.mo13750J(charSequence);
        } else {
            this.f12243s.mo13761r();
        }
    }

    public void setErrorEnabled(boolean z) {
        this.f12243s.mo13767z(z);
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? C1445a.m6446d(getContext(), i) : null);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f12236o0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f12243s.mo13764v());
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f12236o0.getDrawable();
        if (drawable != null) {
            drawable = C1164a.m4554r(drawable).mutate();
            C1164a.m4551o(drawable, colorStateList);
        }
        if (this.f12236o0.getDrawable() != drawable) {
            this.f12236o0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f12236o0.getDrawable();
        if (drawable != null) {
            drawable = C1164a.m4554r(drawable).mutate();
            C1164a.m4552p(drawable, mode);
        }
        if (this.f12236o0.getDrawable() != drawable) {
            this.f12236o0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        this.f12243s.mo13744A(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f12243s.mo13745B(colorStateList);
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!mo13590F()) {
                setHelperTextEnabled(true);
            }
            this.f12243s.mo13751K(charSequence);
        } else if (mo13590F()) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f12243s.mo13748E(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.f12243s.mo13747D(z);
    }

    public void setHelperTextTextAppearance(int i) {
        this.f12243s.mo13746C(i);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f12195B) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f12196B0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f12195B) {
            this.f12195B = z;
            if (!z) {
                this.f12199D = false;
                if (!TextUtils.isEmpty(this.f12197C) && TextUtils.isEmpty(this.f12239q.getHint())) {
                    this.f12239q.setHint(this.f12197C);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.f12239q.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f12197C)) {
                        setHint(hint);
                    }
                    this.f12239q.setHint((CharSequence) null);
                }
                this.f12199D = true;
            }
            if (this.f12239q != null) {
                m16555b0();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.f12194A0.mo13458D(i);
        this.f12242r0 = this.f12194A0.mo13476l();
        if (this.f12239q != null) {
            mo13598c0(false);
            m16555b0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f12242r0 != colorStateList) {
            if (this.f12240q0 == null) {
                this.f12194A0.mo13459E(colorStateList);
            }
            this.f12242r0 = colorStateList;
            if (this.f12239q != null) {
                mo13598c0(false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f12227g0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C1445a.m6446d(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f12227g0.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.f12225e0 != 1) {
            setEndIconMode(1);
        } else if (!z) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f12229i0 = colorStateList;
        this.f12230j0 = true;
        m16560i();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f12231k0 = mode;
        this.f12232l0 = true;
        m16560i();
    }

    public void setStartIconCheckable(boolean z) {
        this.f12217T.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f12217T.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? C1445a.m6446d(getContext(), i) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f12217T.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            m16562k();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener((View.OnClickListener) null);
        setStartIconOnLongClickListener((View.OnLongClickListener) null);
        setStartIconContentDescription((CharSequence) null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        m16543O(this.f12217T, onClickListener, this.f12223c0);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f12223c0 = onLongClickListener;
        m16544P(this.f12217T, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.f12218U != colorStateList) {
            this.f12218U = colorStateList;
            this.f12219V = true;
            m16562k();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.f12220W != mode) {
            this.f12220W = mode;
            this.f12221a0 = true;
            m16562k();
        }
    }

    public void setStartIconVisible(boolean z) {
        if (mo13592I() != z) {
            this.f12217T.setVisibility(z ? 0 : 8);
            m16553a0();
        }
    }

    public void setTextInputAccessibilityDelegate(C4310e eVar) {
        EditText editText = this.f12239q;
        if (editText != null) {
            C1988t.m8394m0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f12216S) {
            this.f12216S = typeface;
            this.f12194A0.mo13472U(typeface);
            this.f12243s.mo13749G(typeface);
            TextView textView = this.f12251w;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }
}
