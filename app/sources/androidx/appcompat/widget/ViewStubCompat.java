package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p027c.p028a.C1444j;

public final class ViewStubCompat extends View {

    /* renamed from: f */
    private int f854f;

    /* renamed from: o */
    private int f855o;

    /* renamed from: p */
    private WeakReference<View> f856p;

    /* renamed from: q */
    private LayoutInflater f857q;

    /* renamed from: r */
    private C0188a f858r;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    public interface C0188a {
        /* renamed from: a */
        void mo1220a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f854f = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1444j.f4309V3, i, 0);
        this.f855o = obtainStyledAttributes.getResourceId(C1444j.f4324Y3, -1);
        this.f854f = obtainStyledAttributes.getResourceId(C1444j.f4319X3, 0);
        setId(obtainStyledAttributes.getResourceId(C1444j.f4314W3, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* renamed from: a */
    public View mo1208a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f854f != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f857q;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f854f, viewGroup, false);
            int i = this.f855o;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f856p = new WeakReference<>(inflate);
            C0188a aVar = this.f858r;
            if (aVar != null) {
                aVar.mo1220a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f855o;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f857q;
    }

    public int getLayoutResource() {
        return this.f854f;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f855o = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f857q = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f854f = i;
    }

    public void setOnInflateListener(C0188a aVar) {
        this.f858r = aVar;
    }

    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f856p;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            mo1208a();
        }
    }
}
