package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p027c.p028a.C1435a;
import p027c.p028a.C1444j;
import p027c.p064i.p072j.C1988t;
import p027c.p064i.p072j.C2008y;
import p027c.p064i.p072j.C2012z;

/* renamed from: androidx.appcompat.widget.a */
abstract class C0189a extends ViewGroup {

    /* renamed from: f */
    protected final C0190a f859f;

    /* renamed from: o */
    protected final Context f860o;

    /* renamed from: p */
    protected ActionMenuView f861p;

    /* renamed from: q */
    protected C0201c f862q;

    /* renamed from: r */
    protected int f863r;

    /* renamed from: s */
    protected C2008y f864s;

    /* renamed from: t */
    private boolean f865t;

    /* renamed from: u */
    private boolean f866u;

    /* renamed from: androidx.appcompat.widget.a$a */
    protected class C0190a implements C2012z {

        /* renamed from: a */
        private boolean f867a = false;

        /* renamed from: b */
        int f868b;

        protected C0190a() {
        }

        /* renamed from: a */
        public void mo1224a(View view) {
            this.f867a = true;
        }

        /* renamed from: b */
        public void mo324b(View view) {
            if (!this.f867a) {
                C0189a aVar = C0189a.this;
                aVar.f864s = null;
                C0189a.super.setVisibility(this.f868b);
            }
        }

        /* renamed from: c */
        public void mo325c(View view) {
            C0189a.super.setVisibility(0);
            this.f867a = false;
        }

        /* renamed from: d */
        public C0190a mo1225d(C2008y yVar, int i) {
            C0189a.this.f864s = yVar;
            this.f868b = i;
            return this;
        }
    }

    C0189a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    C0189a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f859f = new C0190a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C1435a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f860o = context;
        } else {
            this.f860o = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* renamed from: d */
    protected static int m969d(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo1221c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, RecyclerView.UNDEFINED_DURATION), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo1222e(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: f */
    public C2008y mo874f(int i, long j) {
        C2008y a;
        C2008y yVar = this.f864s;
        if (yVar != null) {
            yVar.mo6697b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            a = C1988t.m8373c(this).mo6696a(1.0f);
        } else {
            a = C1988t.m8373c(this).mo6696a(0.0f);
        }
        a.mo6699d(j);
        a.mo6701f(this.f859f.mo1225d(a, i));
        return a;
    }

    public int getAnimatedVisibility() {
        return this.f864s != null ? this.f859f.f868b : getVisibility();
    }

    public int getContentHeight() {
        return this.f863r;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C1444j.f4329a, C1435a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C1444j.f4374j, 0));
        obtainStyledAttributes.recycle();
        C0201c cVar = this.f862q;
        if (cVar != null) {
            cVar.mo1263F(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f866u = false;
        }
        if (!this.f866u) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f866u = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f866u = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f865t = false;
        }
        if (!this.f865t) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f865t = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f865t = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C2008y yVar = this.f864s;
            if (yVar != null) {
                yVar.mo6697b();
            }
            super.setVisibility(i);
        }
    }
}
