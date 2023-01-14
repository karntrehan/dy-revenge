package com.reactnativecommunity.picker;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.C0278w;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.i18nmanager.C2822a;
import com.facebook.react.uimanager.UIManagerModule;

/* renamed from: com.reactnativecommunity.picker.h */
public class C5277h extends C0278w {

    /* renamed from: A */
    private Integer f14828A;

    /* renamed from: B */
    private int f14829B = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: C */
    private boolean f14830C = false;

    /* renamed from: D */
    private final AdapterView.OnItemSelectedListener f14831D = new C5278a();

    /* renamed from: E */
    private final Runnable f14832E = new C5279b();

    /* renamed from: w */
    private int f14833w = 0;

    /* renamed from: x */
    private Integer f14834x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public C5281d f14835y;

    /* renamed from: z */
    private C5280c f14836z;

    /* renamed from: com.reactnativecommunity.picker.h$a */
    class C5278a implements AdapterView.OnItemSelectedListener {
        C5278a() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (C5277h.this.f14835y != null) {
                C5277h.this.f14835y.mo15917a(i);
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
            if (C5277h.this.f14835y != null) {
                C5277h.this.f14835y.mo15917a(-1);
            }
        }
    }

    /* renamed from: com.reactnativecommunity.picker.h$b */
    class C5279b implements Runnable {
        C5279b() {
        }

        public void run() {
            C5277h hVar = C5277h.this;
            hVar.measure(View.MeasureSpec.makeMeasureSpec(hVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(C5277h.this.getHeight(), 1073741824));
            C5277h hVar2 = C5277h.this;
            hVar2.layout(hVar2.getLeft(), C5277h.this.getTop(), C5277h.this.getRight(), C5277h.this.getBottom());
        }
    }

    /* renamed from: com.reactnativecommunity.picker.h$c */
    public interface C5280c {
        /* renamed from: b */
        void mo15918b();

        /* renamed from: c */
        void mo15919c();
    }

    /* renamed from: com.reactnativecommunity.picker.h$d */
    public interface C5281d {
        /* renamed from: a */
        void mo15917a(int i);
    }

    public C5277h(Context context, int i) {
        super(context, i);
        this.f14833w = i;
        m19664d(context);
        m19665e();
    }

    /* renamed from: d */
    private void m19664d(Context context) {
        int i;
        if (C2822a.m11246d().mo9192g(context)) {
            setLayoutDirection(1);
            i = 4;
        } else {
            setLayoutDirection(0);
            i = 3;
        }
        setTextDirection(i);
    }

    /* renamed from: e */
    private void m19665e() {
        setBackgroundResource(C5273d.spinner_dropdown_background);
        setBackgroundColor(0);
    }

    private ReactContext getReactContext() {
        Context context = getContext();
        if (!(context instanceof ReactContext) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (ReactContext) context;
    }

    private void setSelectionWithSuppressEvent(int i) {
        if (i != getSelectedItemPosition()) {
            setOnItemSelectedListener((AdapterView.OnItemSelectedListener) null);
            setSelection(i, false);
            setOnItemSelectedListener(this.f14831D);
        }
    }

    /* renamed from: f */
    public void mo15930f() {
        Integer num = this.f14828A;
        if (num != null) {
            setSelectionWithSuppressEvent(num.intValue());
            this.f14828A = null;
        }
    }

    public int getMode() {
        return this.f14833w;
    }

    public C5280c getOnFocusListener() {
        return this.f14836z;
    }

    public C5281d getOnSelectListener() {
        return this.f14835y;
    }

    public Integer getPrimaryColor() {
        return this.f14834x;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getOnItemSelectedListener() == null) {
            setOnItemSelectedListener(this.f14831D);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition < 0 || getAdapter() == null || selectedItemPosition >= getAdapter().getCount()) {
            i3 = (int) TypedValue.applyDimension(1, 50.0f, Resources.getSystem().getDisplayMetrics());
        } else {
            View view = getAdapter().getView(selectedItemPosition, (View) null, this);
            measureChild(view, View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            i3 = view.getMeasuredHeight();
        }
        if (i3 != this.f14829B) {
            UIManagerModule uIManagerModule = (UIManagerModule) getReactContext().getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null) {
                uIManagerModule.setViewLocalData(getId(), new C5282i(i3));
            }
            this.f14829B = i3;
        }
    }

    public void onWindowFocusChanged(boolean z) {
        if (this.f14830C && z) {
            this.f14830C = false;
            C5280c cVar = this.f14836z;
            if (cVar != null) {
                cVar.mo15918b();
            }
        }
    }

    public boolean performClick() {
        this.f14830C = true;
        C5280c cVar = this.f14836z;
        if (cVar != null) {
            cVar.mo15919c();
        }
        return super.performClick();
    }

    public void requestLayout() {
        super.requestLayout();
        post(this.f14832E);
    }

    public void setBackgroundColor(int i) {
        ((GradientDrawable) ((LayerDrawable) getBackground()).findDrawableByLayerId(C5274e.dropdown_background)).setColor(i);
    }

    public void setDropdownIconColor(int i) {
        ((RippleDrawable) ((LayerDrawable) getBackground()).findDrawableByLayerId(C5274e.dropdown_icon)).setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
    }

    public void setDropdownIconRippleColor(int i) {
        ((RippleDrawable) ((LayerDrawable) getBackground()).findDrawableByLayerId(C5274e.dropdown_icon)).setColor(ColorStateList.valueOf(i));
    }

    public void setOnFocusListener(C5280c cVar) {
        this.f14836z = cVar;
    }

    public void setOnSelectListener(C5281d dVar) {
        this.f14835y = dVar;
    }

    public void setPrimaryColor(Integer num) {
        this.f14834x = num;
    }

    public void setStagedSelection(int i) {
        this.f14828A = Integer.valueOf(i);
    }
}
