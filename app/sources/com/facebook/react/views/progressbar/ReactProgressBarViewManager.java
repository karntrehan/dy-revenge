package com.facebook.react.views.progressbar;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.p109b0.p110a.C2639a;
import com.facebook.react.p115e0.C2735c;
import com.facebook.react.p115e0.C2736d;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C2928c1;
import com.facebook.react.uimanager.C3031o0;
import com.facebook.react.uimanager.C3038r;
import com.facebook.react.uimanager.p120j1.C2991a;
import com.facebook.yoga.C3314n;
import com.facebook.yoga.C3315o;
import java.util.WeakHashMap;

@C2639a(name = "AndroidProgressBar")
public class ReactProgressBarViewManager extends BaseViewManager<C3123a, C3124b> implements C2736d<C3123a> {
    static final String DEFAULT_STYLE = "Normal";
    static final String PROP_ANIMATING = "animating";
    static final String PROP_INDETERMINATE = "indeterminate";
    static final String PROP_PROGRESS = "progress";
    static final String PROP_STYLE = "styleAttr";
    public static final String REACT_CLASS = "AndroidProgressBar";
    private static Object sProgressBarCtorLock = new Object();
    private final C2928c1<C3123a> mDelegate = new C2735c(this);
    private final WeakHashMap<Integer, Pair<Integer, Integer>> mMeasuredStyles = new WeakHashMap<>();

    public static ProgressBar createProgressBar(Context context, int i) {
        ProgressBar progressBar;
        synchronized (sProgressBarCtorLock) {
            progressBar = new ProgressBar(context, (AttributeSet) null, i);
        }
        return progressBar;
    }

    static int getStyleFromString(String str) {
        if (str == null) {
            throw new JSApplicationIllegalArgumentException("ProgressBar needs to have a style, null received");
        } else if (str.equals("Horizontal")) {
            return 16842872;
        } else {
            if (str.equals("Small")) {
                return 16842873;
            }
            if (str.equals("Large")) {
                return 16842874;
            }
            if (str.equals("Inverse")) {
                return 16843399;
            }
            if (str.equals("SmallInverse")) {
                return 16843400;
            }
            if (str.equals("LargeInverse")) {
                return 16843401;
            }
            if (str.equals(DEFAULT_STYLE)) {
                return 16842871;
            }
            throw new JSApplicationIllegalArgumentException("Unknown ProgressBar style: " + str);
        }
    }

    public C3124b createShadowNodeInstance() {
        return new C3124b();
    }

    /* access modifiers changed from: protected */
    public C3123a createViewInstance(C3031o0 o0Var) {
        return new C3123a(o0Var);
    }

    /* access modifiers changed from: protected */
    public C2928c1<C3123a> getDelegate() {
        return this.mDelegate;
    }

    public String getName() {
        return REACT_CLASS;
    }

    public Class<C3124b> getShadowNodeClass() {
        return C3124b.class;
    }

    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f, C3314n nVar, float f2, C3314n nVar2, float[] fArr) {
        Integer valueOf = Integer.valueOf(getStyleFromString(readableMap2.getString(PROP_STYLE)));
        Pair pair = this.mMeasuredStyles.get(valueOf);
        if (pair == null) {
            ProgressBar createProgressBar = createProgressBar(context, valueOf.intValue());
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
            createProgressBar.measure(makeMeasureSpec, makeMeasureSpec);
            pair = Pair.create(Integer.valueOf(createProgressBar.getMeasuredWidth()), Integer.valueOf(createProgressBar.getMeasuredHeight()));
            this.mMeasuredStyles.put(valueOf, pair);
        }
        return C3315o.m12981a(C3038r.m12004a((float) ((Integer) pair.first).intValue()), C3038r.m12004a((float) ((Integer) pair.second).intValue()));
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(C3123a aVar) {
        aVar.mo10049a();
    }

    @C2991a(name = "animating")
    public void setAnimating(C3123a aVar, boolean z) {
        aVar.mo10050b(z);
    }

    @C2991a(customType = "Color", name = "color")
    public void setColor(C3123a aVar, Integer num) {
        aVar.mo10051d(num);
    }

    @C2991a(name = "indeterminate")
    public void setIndeterminate(C3123a aVar, boolean z) {
        aVar.mo10052e(z);
    }

    @C2991a(name = "progress")
    public void setProgress(C3123a aVar, double d) {
        aVar.mo10053f(d);
    }

    @C2991a(name = "styleAttr")
    public void setStyleAttr(C3123a aVar, String str) {
        aVar.mo10054g(str);
    }

    public void setTestID(C3123a aVar, String str) {
        super.setTestId(aVar, str);
    }

    public void setTypeAttr(C3123a aVar, String str) {
    }

    public void updateExtraData(C3123a aVar, Object obj) {
    }
}
