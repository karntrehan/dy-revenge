package com.facebook.react.views.slider;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.C2693e;
import com.facebook.react.p115e0.C2754v;
import com.facebook.react.p115e0.C2755w;
import com.facebook.react.uimanager.C2928c1;
import com.facebook.react.uimanager.C2987j;
import com.facebook.react.uimanager.C3031o0;
import com.facebook.react.uimanager.C3038r;
import com.facebook.react.uimanager.C3046u;
import com.facebook.react.uimanager.C3051u0;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.events.C2945d;
import com.facebook.react.uimanager.p120j1.C2991a;
import com.facebook.yoga.C3313m;
import com.facebook.yoga.C3314n;
import com.facebook.yoga.C3315o;
import com.facebook.yoga.C3316p;
import java.util.Map;
import p027c.p064i.p072j.C1988t;
import p027c.p064i.p072j.p073g0.C1955c;

public class ReactSliderManager extends SimpleViewManager<C3153a> implements C2755w<C3153a> {
    /* access modifiers changed from: private */
    public static final SeekBar.OnSeekBarChangeListener ON_CHANGE_LISTENER = new C3150a();
    public static final String REACT_CLASS = "RCTSlider";
    private static final int STYLE = 16842875;
    private final C2928c1<C3153a> mDelegate = new C2754v(this);

    /* renamed from: com.facebook.react.views.slider.ReactSliderManager$a */
    static class C3150a implements SeekBar.OnSeekBarChangeListener {
        C3150a() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C2945d b = C3051u0.m12085b((ReactContext) seekBar.getContext(), seekBar.getId());
            if (b != null) {
                b.mo9651c(new C3154b(seekBar.getId(), ((C3153a) seekBar).mo10249b(i), z));
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            C2945d b = C3051u0.m12085b((ReactContext) seekBar.getContext(), seekBar.getId());
            if (b != null) {
                b.mo9651c(new C3155c(C3051u0.m12088e(seekBar), seekBar.getId(), ((C3153a) seekBar).mo10249b(seekBar.getProgress())));
            }
        }
    }

    /* renamed from: com.facebook.react.views.slider.ReactSliderManager$b */
    protected class C3151b extends C3046u {
        protected C3151b() {
        }

        /* renamed from: r */
        private boolean m12388r(int i) {
            return i == C1955c.C1956a.f5715m.mo6623b() || i == C1955c.C1956a.f5716n.mo6623b() || i == C1955c.C1956a.f5697H.mo6623b();
        }

        /* renamed from: j */
        public boolean mo3777j(View view, int i, Bundle bundle) {
            if (m12388r(i)) {
                ReactSliderManager.ON_CHANGE_LISTENER.onStartTrackingTouch((SeekBar) view);
            }
            boolean j = super.mo3777j(view, i, bundle);
            if (m12388r(i)) {
                ReactSliderManager.ON_CHANGE_LISTENER.onStopTrackingTouch((SeekBar) view);
            }
            return j;
        }
    }

    /* renamed from: com.facebook.react.views.slider.ReactSliderManager$c */
    static class C3152c extends C2987j implements C3313m {

        /* renamed from: A */
        private int f8825A;

        /* renamed from: B */
        private int f8826B;

        /* renamed from: C */
        private boolean f8827C;

        private C3152c() {
            m12390q1();
        }

        /* synthetic */ C3152c(C3150a aVar) {
            this();
        }

        /* renamed from: q1 */
        private void m12390q1() {
            mo9577T0(this);
        }

        /* renamed from: c */
        public long mo10055c(C3316p pVar, float f, C3314n nVar, float f2, C3314n nVar2) {
            if (!this.f8827C) {
                C3153a aVar = new C3153a(mo9506I(), (AttributeSet) null, ReactSliderManager.STYLE);
                aVar.mo10248a();
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
                aVar.measure(makeMeasureSpec, makeMeasureSpec);
                this.f8825A = aVar.getMeasuredWidth();
                this.f8826B = aVar.getMeasuredHeight();
                this.f8827C = true;
            }
            return C3315o.m12982b(this.f8825A, this.f8826B);
        }
    }

    /* access modifiers changed from: protected */
    public void addEventEmitters(C3031o0 o0Var, C3153a aVar) {
        aVar.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }

    public C2987j createShadowNodeInstance() {
        return new C3152c((C3150a) null);
    }

    /* access modifiers changed from: protected */
    public C3153a createViewInstance(C3031o0 o0Var) {
        C3153a aVar = new C3153a(o0Var, (AttributeSet) null, STYLE);
        C1988t.m8394m0(aVar, new C3151b());
        return aVar;
    }

    /* access modifiers changed from: protected */
    public C2928c1<C3153a> getDelegate() {
        return this.mDelegate;
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        return C2693e.m10914d("topSlidingComplete", C2693e.m10914d("registrationName", "onSlidingComplete"));
    }

    public String getName() {
        return REACT_CLASS;
    }

    public Class getShadowNodeClass() {
        return C3152c.class;
    }

    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f, C3314n nVar, float f2, C3314n nVar2, float[] fArr) {
        C3153a aVar = new C3153a(context, (AttributeSet) null, STYLE);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
        aVar.measure(makeMeasureSpec, makeMeasureSpec);
        return C3315o.m12981a(C3038r.m12004a((float) aVar.getMeasuredWidth()), C3038r.m12004a((float) aVar.getMeasuredHeight()));
    }

    public void setDisabled(C3153a aVar, boolean z) {
    }

    @C2991a(defaultBoolean = true, name = "enabled")
    public void setEnabled(C3153a aVar, boolean z) {
        aVar.setEnabled(z);
    }

    public void setMaximumTrackImage(C3153a aVar, ReadableMap readableMap) {
    }

    @C2991a(customType = "Color", name = "maximumTrackTintColor")
    public void setMaximumTrackTintColor(C3153a aVar, Integer num) {
        Drawable findDrawableByLayerId = ((LayerDrawable) aVar.getProgressDrawable().getCurrent()).findDrawableByLayerId(16908288);
        if (num == null) {
            findDrawableByLayerId.clearColorFilter();
        } else {
            findDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @C2991a(defaultDouble = 1.0d, name = "maximumValue")
    public void setMaximumValue(C3153a aVar, double d) {
        aVar.setMaxValue(d);
    }

    public void setMinimumTrackImage(C3153a aVar, ReadableMap readableMap) {
    }

    @C2991a(customType = "Color", name = "minimumTrackTintColor")
    public void setMinimumTrackTintColor(C3153a aVar, Integer num) {
        Drawable findDrawableByLayerId = ((LayerDrawable) aVar.getProgressDrawable().getCurrent()).findDrawableByLayerId(16908301);
        if (num == null) {
            findDrawableByLayerId.clearColorFilter();
        } else {
            findDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @C2991a(defaultDouble = 0.0d, name = "minimumValue")
    public void setMinimumValue(C3153a aVar, double d) {
        aVar.setMinValue(d);
    }

    @C2991a(defaultDouble = 0.0d, name = "step")
    public void setStep(C3153a aVar, double d) {
        aVar.setStep(d);
    }

    public void setTestID(C3153a aVar, String str) {
        super.setTestId(aVar, str);
    }

    public void setThumbImage(C3153a aVar, ReadableMap readableMap) {
    }

    @C2991a(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(C3153a aVar, Integer num) {
        Drawable thumb = aVar.getThumb();
        if (num == null) {
            thumb.clearColorFilter();
        } else {
            thumb.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    public void setTrackImage(C3153a aVar, ReadableMap readableMap) {
    }

    @C2991a(defaultDouble = 0.0d, name = "value")
    public void setValue(C3153a aVar, double d) {
        aVar.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) null);
        aVar.setValue(d);
        aVar.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }
}
