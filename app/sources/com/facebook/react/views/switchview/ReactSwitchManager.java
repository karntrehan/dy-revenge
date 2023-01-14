package com.facebook.react.views.switchview;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.p115e0.C2739g;
import com.facebook.react.p115e0.C2740h;
import com.facebook.react.uimanager.C2928c1;
import com.facebook.react.uimanager.C2987j;
import com.facebook.react.uimanager.C3031o0;
import com.facebook.react.uimanager.C3038r;
import com.facebook.react.uimanager.C3051u0;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.p120j1.C2991a;
import com.facebook.yoga.C3313m;
import com.facebook.yoga.C3314n;
import com.facebook.yoga.C3315o;
import com.facebook.yoga.C3316p;

public class ReactSwitchManager extends SimpleViewManager<C3161a> implements C2740h<C3161a> {
    private static final CompoundButton.OnCheckedChangeListener ON_CHECKED_CHANGE_LISTENER = new C3159a();
    public static final String REACT_CLASS = "AndroidSwitch";
    private final C2928c1<C3161a> mDelegate = new C2739g(this);

    /* renamed from: com.facebook.react.views.switchview.ReactSwitchManager$a */
    static class C3159a implements CompoundButton.OnCheckedChangeListener {
        C3159a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ReactContext reactContext = (ReactContext) compoundButton.getContext();
            int id = compoundButton.getId();
            C3051u0.m12085b(reactContext, id).mo9651c(new C3162b(C3051u0.m12087d(reactContext), id, z));
        }
    }

    /* renamed from: com.facebook.react.views.switchview.ReactSwitchManager$b */
    static class C3160b extends C2987j implements C3313m {

        /* renamed from: A */
        private int f8846A;

        /* renamed from: B */
        private int f8847B;

        /* renamed from: C */
        private boolean f8848C;

        private C3160b() {
            m12409q1();
        }

        /* synthetic */ C3160b(C3159a aVar) {
            this();
        }

        /* renamed from: q1 */
        private void m12409q1() {
            mo9577T0(this);
        }

        /* renamed from: c */
        public long mo10055c(C3316p pVar, float f, C3314n nVar, float f2, C3314n nVar2) {
            if (!this.f8848C) {
                C3161a aVar = new C3161a(mo9506I());
                aVar.setShowText(false);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                aVar.measure(makeMeasureSpec, makeMeasureSpec);
                this.f8846A = aVar.getMeasuredWidth();
                this.f8847B = aVar.getMeasuredHeight();
                this.f8848C = true;
            }
            return C3315o.m12982b(this.f8846A, this.f8847B);
        }
    }

    private static void setValueInternal(C3161a aVar, boolean z) {
        aVar.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        aVar.mo10283n(z);
        aVar.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    /* access modifiers changed from: protected */
    public void addEventEmitters(C3031o0 o0Var, C3161a aVar) {
        aVar.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    public C2987j createShadowNodeInstance() {
        return new C3160b((C3159a) null);
    }

    /* access modifiers changed from: protected */
    public C3161a createViewInstance(C3031o0 o0Var) {
        C3161a aVar = new C3161a(o0Var);
        aVar.setShowText(false);
        return aVar;
    }

    /* access modifiers changed from: protected */
    public C2928c1<C3161a> getDelegate() {
        return this.mDelegate;
    }

    public String getName() {
        return REACT_CLASS;
    }

    public Class getShadowNodeClass() {
        return C3160b.class;
    }

    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f, C3314n nVar, float f2, C3314n nVar2, float[] fArr) {
        C3161a aVar = new C3161a(context);
        aVar.setShowText(false);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        aVar.measure(makeMeasureSpec, makeMeasureSpec);
        return C3315o.m12981a(C3038r.m12004a((float) aVar.getMeasuredWidth()), C3038r.m12004a((float) aVar.getMeasuredHeight()));
    }

    public void receiveCommand(C3161a aVar, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("setNativeValue")) {
            boolean z = false;
            if (readableArray != null && readableArray.getBoolean(0)) {
                z = true;
            }
            setValueInternal(aVar, z);
        }
    }

    @C2991a(defaultBoolean = false, name = "disabled")
    public void setDisabled(C3161a aVar, boolean z) {
        aVar.setEnabled(!z);
    }

    @C2991a(defaultBoolean = true, name = "enabled")
    public void setEnabled(C3161a aVar, boolean z) {
        aVar.setEnabled(z);
    }

    public void setNativeValue(C3161a aVar, boolean z) {
        setValueInternal(aVar, z);
    }

    @C2991a(name = "on")
    public void setOn(C3161a aVar, boolean z) {
        setValueInternal(aVar, z);
    }

    @C2991a(customType = "Color", name = "thumbColor")
    public void setThumbColor(C3161a aVar, Integer num) {
        aVar.mo10284o(num);
    }

    @C2991a(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(C3161a aVar, Integer num) {
        setThumbColor(aVar, num);
    }

    @C2991a(customType = "Color", name = "trackColorForFalse")
    public void setTrackColorForFalse(C3161a aVar, Integer num) {
        aVar.mo10286r(num);
    }

    @C2991a(customType = "Color", name = "trackColorForTrue")
    public void setTrackColorForTrue(C3161a aVar, Integer num) {
        aVar.mo10287s(num);
    }

    @C2991a(customType = "Color", name = "trackTintColor")
    public void setTrackTintColor(C3161a aVar, Integer num) {
        aVar.mo10285p(num);
    }

    @C2991a(name = "value")
    public void setValue(C3161a aVar, boolean z) {
        setValueInternal(aVar, z);
    }
}
