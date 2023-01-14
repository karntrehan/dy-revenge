package androidx.appcompat.widget;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.C0058a;
import androidx.appcompat.widget.C0229i0;
import p027c.p028a.C1435a;
import p027c.p028a.p035o.C1465a;

/* renamed from: androidx.appcompat.widget.p0 */
public class C0259p0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: f */
    private static final Interpolator f1098f = new DecelerateInterpolator();

    /* renamed from: o */
    Runnable f1099o;

    /* renamed from: p */
    private C0262c f1100p;

    /* renamed from: q */
    C0229i0 f1101q;

    /* renamed from: r */
    private Spinner f1102r;

    /* renamed from: s */
    private boolean f1103s;

    /* renamed from: t */
    int f1104t;

    /* renamed from: u */
    int f1105u;

    /* renamed from: v */
    private int f1106v;

    /* renamed from: w */
    private int f1107w;

    /* renamed from: androidx.appcompat.widget.p0$a */
    class C0260a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ View f1108f;

        C0260a(View view) {
            this.f1108f = view;
        }

        public void run() {
            C0259p0.this.smoothScrollTo(this.f1108f.getLeft() - ((C0259p0.this.getWidth() - this.f1108f.getWidth()) / 2), 0);
            C0259p0.this.f1099o = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.p0$b */
    private class C0261b extends BaseAdapter {
        C0261b() {
        }

        public int getCount() {
            return C0259p0.this.f1101q.getChildCount();
        }

        public Object getItem(int i) {
            return ((C0263d) C0259p0.this.f1101q.getChildAt(i)).mo1616b();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C0259p0.this.mo1599c((C0058a.C0061c) getItem(i), true);
            }
            ((C0263d) view).mo1615a((C0058a.C0061c) getItem(i));
            return view;
        }
    }

    /* renamed from: androidx.appcompat.widget.p0$c */
    private class C0262c implements View.OnClickListener {
        C0262c() {
        }

        public void onClick(View view) {
            ((C0263d) view).mo1616b().mo206e();
            int childCount = C0259p0.this.f1101q.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C0259p0.this.f1101q.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.p0$d */
    private class C0263d extends LinearLayout {

        /* renamed from: f */
        private final int[] f1112f;

        /* renamed from: o */
        private C0058a.C0061c f1113o;

        /* renamed from: p */
        private TextView f1114p;

        /* renamed from: q */
        private ImageView f1115q;

        /* renamed from: r */
        private View f1116r;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C0263d(android.content.Context r6, androidx.appcompat.app.C0058a.C0061c r7, boolean r8) {
            /*
                r4 = this;
                androidx.appcompat.widget.C0259p0.this = r5
                int r5 = p027c.p028a.C1435a.actionBarTabStyle
                r0 = 0
                r4.<init>(r6, r0, r5)
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r3 = 0
                r1[r3] = r2
                r4.f1112f = r1
                r4.f1113o = r7
                androidx.appcompat.widget.x0 r5 = androidx.appcompat.widget.C0292x0.m1407v(r6, r0, r1, r5, r3)
                boolean r6 = r5.mo1802s(r3)
                if (r6 == 0) goto L_0x0026
                android.graphics.drawable.Drawable r6 = r5.mo1790g(r3)
                r4.setBackgroundDrawable(r6)
            L_0x0026:
                r5.mo1803w()
                if (r8 == 0) goto L_0x0031
                r5 = 8388627(0x800013, float:1.175497E-38)
                r4.setGravity(r5)
            L_0x0031:
                r4.mo1617c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0259p0.C0263d.<init>(androidx.appcompat.widget.p0, android.content.Context, androidx.appcompat.app.a$c, boolean):void");
        }

        /* renamed from: a */
        public void mo1615a(C0058a.C0061c cVar) {
            this.f1113o = cVar;
            mo1617c();
        }

        /* renamed from: b */
        public C0058a.C0061c mo1616b() {
            return this.f1113o;
        }

        /* renamed from: c */
        public void mo1617c() {
            C0058a.C0061c cVar = this.f1113o;
            View b = cVar.mo203b();
            CharSequence charSequence = null;
            if (b != null) {
                ViewParent parent = b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b);
                    }
                    addView(b);
                }
                this.f1116r = b;
                TextView textView = this.f1114p;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1115q;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1115q.setImageDrawable((Drawable) null);
                    return;
                }
                return;
            }
            View view = this.f1116r;
            if (view != null) {
                removeView(view);
                this.f1116r = null;
            }
            Drawable c = cVar.mo204c();
            CharSequence d = cVar.mo205d();
            if (c != null) {
                if (this.f1115q == null) {
                    C0256o oVar = new C0256o(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    oVar.setLayoutParams(layoutParams);
                    addView(oVar, 0);
                    this.f1115q = oVar;
                }
                this.f1115q.setImageDrawable(c);
                this.f1115q.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1115q;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1115q.setImageDrawable((Drawable) null);
                }
            }
            boolean z = !TextUtils.isEmpty(d);
            if (z) {
                if (this.f1114p == null) {
                    C0298z zVar = new C0298z(getContext(), (AttributeSet) null, C1435a.actionBarTabTextStyle);
                    zVar.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    zVar.setLayoutParams(layoutParams2);
                    addView(zVar);
                    this.f1114p = zVar;
                }
                this.f1114p.setText(d);
                this.f1114p.setVisibility(0);
            } else {
                TextView textView2 = this.f1114p;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1114p.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1115q;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.mo202a());
            }
            if (!z) {
                charSequence = cVar.mo202a();
            }
            C0299z0.m1497a(this, charSequence);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onMeasure(int i, int i2) {
            int i3;
            super.onMeasure(i, i2);
            if (C0259p0.this.f1104t > 0 && getMeasuredWidth() > (i3 = C0259p0.this.f1104t)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
            }
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* renamed from: b */
    private Spinner m1296b() {
        C0278w wVar = new C0278w(getContext(), (AttributeSet) null, C1435a.actionDropDownStyle);
        wVar.setLayoutParams(new C0229i0.C0230a(-2, -1));
        wVar.setOnItemSelectedListener(this);
        return wVar;
    }

    /* renamed from: d */
    private boolean m1297d() {
        Spinner spinner = this.f1102r;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: e */
    private void m1298e() {
        if (!m1297d()) {
            if (this.f1102r == null) {
                this.f1102r = m1296b();
            }
            removeView(this.f1101q);
            addView(this.f1102r, new ViewGroup.LayoutParams(-2, -1));
            if (this.f1102r.getAdapter() == null) {
                this.f1102r.setAdapter(new C0261b());
            }
            Runnable runnable = this.f1099o;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f1099o = null;
            }
            this.f1102r.setSelection(this.f1107w);
        }
    }

    /* renamed from: f */
    private boolean m1299f() {
        if (!m1297d()) {
            return false;
        }
        removeView(this.f1102r);
        addView(this.f1101q, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1102r.getSelectedItemPosition());
        return false;
    }

    /* renamed from: a */
    public void mo1598a(int i) {
        View childAt = this.f1101q.getChildAt(i);
        Runnable runnable = this.f1099o;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        C0260a aVar = new C0260a(childAt);
        this.f1099o = aVar;
        post(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0263d mo1599c(C0058a.C0061c cVar, boolean z) {
        C0263d dVar = new C0263d(getContext(), cVar, z);
        if (z) {
            dVar.setBackgroundDrawable((Drawable) null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1106v));
        } else {
            dVar.setFocusable(true);
            if (this.f1100p == null) {
                this.f1100p = new C0262c();
            }
            dVar.setOnClickListener(this.f1100p);
        }
        return dVar;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1099o;
        if (runnable != null) {
            post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1465a b = C1465a.m6531b(getContext());
        setContentHeight(b.mo5448f());
        this.f1105u = b.mo5447e();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1099o;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C0263d) view).mo1616b().mo206e();
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f1101q.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i3 = -1;
        } else {
            if (childCount > 2) {
                this.f1104t = (int) (((float) View.MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.f1104t = View.MeasureSpec.getSize(i) / 2;
            }
            i3 = Math.min(this.f1104t, this.f1105u);
        }
        this.f1104t = i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1106v, 1073741824);
        if (z2 || !this.f1103s) {
            z = false;
        }
        if (z) {
            this.f1101q.measure(0, makeMeasureSpec);
            if (this.f1101q.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                m1298e();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z2 && measuredWidth != measuredWidth2) {
                    setTabSelected(this.f1107w);
                    return;
                }
            }
        }
        m1299f();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z2) {
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f1103s = z;
    }

    public void setContentHeight(int i) {
        this.f1106v = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f1107w = i;
        int childCount = this.f1101q.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f1101q.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                mo1598a(i);
            }
            i2++;
        }
        Spinner spinner = this.f1102r;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }
}
