package com.swmansion.gesturehandler.react;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.p109b0.p110a.C2639a;
import com.facebook.react.p115e0.C2744l;
import com.facebook.react.p115e0.C2745m;
import com.facebook.react.uimanager.C2928c1;
import com.facebook.react.uimanager.C3031o0;
import com.facebook.react.uimanager.C3038r;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.p120j1.C2991a;
import p027c.p064i.p072j.C2004w;
import p174e.p446g.p448b.C10213o;
import p455g.p458c0.C10268d;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

@C2639a(name = "RNGestureHandlerButton")
public final class RNGestureHandlerButtonViewManager extends ViewGroupManager<C9856a> implements C2745m<C9856a> {
    public static final C9858b Companion = new C9858b((C10452g) null);
    public static final String REACT_CLASS = "RNGestureHandlerButton";
    private final C2928c1<C9856a> mDelegate = new C2744l(this);

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$a */
    public static final class C9856a extends ViewGroup implements C10213o.C10215b {

        /* renamed from: f */
        public static final C9857a f26389f = new C9857a((C10452g) null);

        /* renamed from: o */
        private static TypedValue f26390o = new TypedValue();

        /* renamed from: p */
        private static C9856a f26391p;

        /* renamed from: q */
        private static View.OnClickListener f26392q = C9871a.f26421f;

        /* renamed from: A */
        private int f26393A = -1;

        /* renamed from: B */
        private boolean f26394B;

        /* renamed from: r */
        private Integer f26395r;

        /* renamed from: s */
        private Integer f26396s;

        /* renamed from: t */
        private boolean f26397t;

        /* renamed from: u */
        private boolean f26398u;

        /* renamed from: v */
        private float f26399v;

        /* renamed from: w */
        private boolean f26400w = true;

        /* renamed from: x */
        private int f26401x;
        /* access modifiers changed from: private */

        /* renamed from: y */
        public boolean f26402y;

        /* renamed from: z */
        private long f26403z = -1;

        /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$a$a */
        public static final class C9857a {
            private C9857a() {
            }

            public /* synthetic */ C9857a(C10452g gVar) {
                this();
            }

            /* access modifiers changed from: private */
            @TargetApi(21)
            /* renamed from: b */
            public final int m33589b(Context context, String str) {
                SoftAssertions.assertNotNull(str);
                if (C10457l.m35316a(str, "selectableItemBackground")) {
                    return 16843534;
                }
                if (C10457l.m35316a(str, "selectableItemBackgroundBorderless")) {
                    return 16843868;
                }
                return context.getResources().getIdentifier(str, "attr", "android");
            }
        }

        public C9856a(Context context) {
            super(context);
            setOnClickListener(f26392q);
            setClickable(true);
            setFocusable(true);
            this.f26402y = true;
        }

        /* renamed from: d */
        private final Drawable m33577d(Drawable drawable) {
            ColorStateList colorStateList;
            Integer num = this.f26395r;
            int i = Build.VERSION.SDK_INT;
            if (i >= 21 && (drawable instanceof RippleDrawable)) {
                int[][] iArr = {new int[]{16842910}};
                if (num != null) {
                    colorStateList = new ColorStateList(iArr, new int[]{num.intValue()});
                } else {
                    getContext().getTheme().resolveAttribute(16843820, f26390o, true);
                    colorStateList = new ColorStateList(iArr, new int[]{f26390o.data});
                }
                ((RippleDrawable) drawable).setColor(colorStateList);
            }
            Integer num2 = this.f26396s;
            if (i >= 23 && num2 != null && (drawable instanceof RippleDrawable)) {
                ((RippleDrawable) drawable).setRadius((int) C3038r.m12006c((float) num2.intValue()));
            }
            return drawable;
        }

        /* renamed from: e */
        private final Drawable m33578e() {
            String str;
            Drawable drawable;
            int i = Build.VERSION.SDK_INT;
            String str2 = (!this.f26398u || i < 21) ? "selectableItemBackground" : "selectableItemBackgroundBorderless";
            C9857a aVar = f26389f;
            Context context = getContext();
            C10457l.m35319d(context, "context");
            getContext().getTheme().resolveAttribute(aVar.m33589b(context, str2), f26390o, true);
            if (i >= 21) {
                drawable = getResources().getDrawable(f26390o.resourceId, getContext().getTheme());
                str = "{\n        resources.getDrawable(resolveOutValue.resourceId, context.theme)\n      }";
            } else {
                drawable = getResources().getDrawable(f26390o.resourceId);
                str = "{\n        @Suppress(\"Deprecation\")\n        resources.getDrawable(resolveOutValue.resourceId)\n      }";
            }
            C10457l.m35319d(drawable, str);
            return drawable;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public static final void m33579f(View view) {
        }

        /* renamed from: g */
        private final boolean m33580g(C10268d<? extends View> dVar) {
            for (View view : dVar) {
                if (view instanceof C9856a) {
                    C9856a aVar = (C9856a) view;
                    if (aVar.f26394B || aVar.isPressed()) {
                        return true;
                    }
                }
                if (view instanceof ViewGroup) {
                    return m33580g(C2004w.m8475a((ViewGroup) view));
                }
            }
            return false;
        }

        /* renamed from: h */
        static /* synthetic */ boolean m33581h(C9856a aVar, C10268d<View> dVar, int i, Object obj) {
            if ((i & 1) != 0) {
                dVar = C2004w.m8475a(aVar);
            }
            return aVar.m33580g(dVar);
        }

        /* renamed from: j */
        private final void m33583j() {
            if (f26391p == this) {
                f26391p = null;
            }
        }

        /* renamed from: k */
        private final boolean m33584k() {
            if (m33581h(this, (C10268d) null, 1, (Object) null)) {
                return false;
            }
            C9856a aVar = f26391p;
            if (aVar == null) {
                f26391p = this;
                return true;
            }
            if (!this.f26400w) {
                if (!(aVar == null ? false : aVar.f26400w)) {
                    return true;
                }
            } else if (aVar == this) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo24654a() {
            boolean k = m33584k();
            if (k) {
                this.f26394B = true;
            }
            return k;
        }

        /* renamed from: b */
        public void mo24655b() {
            m33583j();
            this.f26394B = false;
        }

        public void dispatchDrawableHotspotChanged(float f, float f2) {
        }

        public void drawableHotspotChanged(float f, float f2) {
            C9856a aVar = f26391p;
            if (aVar == null || aVar == this) {
                super.drawableHotspotChanged(f, f2);
            }
        }

        public final float getBorderRadius() {
            return this.f26399v;
        }

        public final boolean getExclusive() {
            return this.f26400w;
        }

        public final Integer getRippleColor() {
            return this.f26395r;
        }

        public final Integer getRippleRadius() {
            return this.f26396s;
        }

        public final boolean getUseBorderlessDrawable() {
            return this.f26398u;
        }

        public final boolean getUseDrawableOnForeground() {
            return this.f26397t;
        }

        /* renamed from: l */
        public final void mo24664l() {
            if (this.f26402y) {
                this.f26402y = false;
                if (this.f26401x == 0) {
                    setBackground((Drawable) null);
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 23) {
                    setForeground((Drawable) null);
                }
                if (this.f26397t && i >= 23) {
                    setForeground(m33577d(m33578e()));
                    int i2 = this.f26401x;
                    if (i2 != 0) {
                        setBackgroundColor(i2);
                    }
                } else if (this.f26401x == 0 && this.f26395r == null) {
                    setBackground(m33578e());
                } else {
                    PaintDrawable paintDrawable = new PaintDrawable(this.f26401x);
                    Drawable e = m33578e();
                    float f = this.f26399v;
                    if (!(f == 0.0f)) {
                        paintDrawable.setCornerRadius(f);
                        if (i >= 21 && (e instanceof RippleDrawable)) {
                            PaintDrawable paintDrawable2 = new PaintDrawable(-1);
                            paintDrawable2.setCornerRadius(this.f26399v);
                            ((RippleDrawable) e).setDrawableByLayerId(16908334, paintDrawable2);
                        }
                    }
                    m33577d(e);
                    setBackground(new LayerDrawable(new Drawable[]{paintDrawable, e}));
                }
            }
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            C10457l.m35320e(motionEvent, "ev");
            if (super.onInterceptTouchEvent(motionEvent)) {
                return true;
            }
            onTouchEvent(motionEvent);
            return isPressed();
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            C10457l.m35320e(motionEvent, "event");
            long eventTime = motionEvent.getEventTime();
            int action = motionEvent.getAction();
            if (this.f26403z == eventTime && this.f26393A == action) {
                return false;
            }
            this.f26403z = eventTime;
            this.f26393A = action;
            return super.onTouchEvent(motionEvent);
        }

        public void setBackgroundColor(int i) {
            this.f26401x = i;
            this.f26402y = true;
        }

        public final void setBorderRadius(float f) {
            this.f26399v = f * getResources().getDisplayMetrics().density;
            this.f26402y = true;
        }

        public final void setExclusive(boolean z) {
            this.f26400w = z;
        }

        public void setPressed(boolean z) {
            if (z) {
                m33584k();
            }
            boolean z2 = false;
            if (!this.f26400w) {
                C9856a aVar = f26391p;
                if (!(aVar != null && aVar.f26400w) && !m33581h(this, (C10268d) null, 1, (Object) null)) {
                    z2 = true;
                }
            }
            if (!z || f26391p == this || z2) {
                super.setPressed(z);
                this.f26394B = z;
            }
            if (!z && f26391p == this) {
                f26391p = null;
            }
        }

        public final void setRippleColor(Integer num) {
            this.f26395r = num;
            this.f26402y = true;
        }

        public final void setRippleRadius(Integer num) {
            this.f26396s = num;
            this.f26402y = true;
        }

        public final void setTouched(boolean z) {
            this.f26394B = z;
        }

        public final void setUseBorderlessDrawable(boolean z) {
            this.f26398u = z;
        }

        public final void setUseDrawableOnForeground(boolean z) {
            this.f26397t = z;
            this.f26402y = true;
        }
    }

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$b */
    public static final class C9858b {
        private C9858b() {
        }

        public /* synthetic */ C9858b(C10452g gVar) {
            this();
        }
    }

    public C9856a createViewInstance(C3031o0 o0Var) {
        C10457l.m35320e(o0Var, "context");
        return new C9856a(o0Var);
    }

    /* access modifiers changed from: protected */
    public C2928c1<C9856a> getDelegate() {
        return this.mDelegate;
    }

    public String getName() {
        return REACT_CLASS;
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(C9856a aVar) {
        C10457l.m35320e(aVar, "view");
        aVar.mo24664l();
    }

    @C2991a(name = "borderRadius")
    public void setBorderRadius(C9856a aVar, float f) {
        C10457l.m35320e(aVar, "view");
        aVar.setBorderRadius(f);
    }

    @C2991a(name = "borderless")
    public void setBorderless(C9856a aVar, boolean z) {
        C10457l.m35320e(aVar, "view");
        aVar.setUseBorderlessDrawable(z);
    }

    @C2991a(name = "enabled")
    public void setEnabled(C9856a aVar, boolean z) {
        C10457l.m35320e(aVar, "view");
        aVar.setEnabled(z);
    }

    @C2991a(name = "exclusive")
    public void setExclusive(C9856a aVar, boolean z) {
        C10457l.m35320e(aVar, "view");
        aVar.setExclusive(z);
    }

    @C2991a(name = "foreground")
    @TargetApi(23)
    public void setForeground(C9856a aVar, boolean z) {
        C10457l.m35320e(aVar, "view");
        aVar.setUseDrawableOnForeground(z);
    }

    @C2991a(name = "rippleColor")
    public void setRippleColor(C9856a aVar, Integer num) {
        C10457l.m35320e(aVar, "view");
        aVar.setRippleColor(num);
    }

    @C2991a(name = "rippleRadius")
    public void setRippleRadius(C9856a aVar, int i) {
        C10457l.m35320e(aVar, "view");
        aVar.setRippleRadius(Integer.valueOf(i));
    }
}
