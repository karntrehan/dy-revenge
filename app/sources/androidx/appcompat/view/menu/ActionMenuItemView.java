package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.C0124g;
import androidx.appcompat.view.menu.C0141n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C0225h0;
import androidx.appcompat.widget.C0298z;
import androidx.appcompat.widget.C0299z0;
import p027c.p028a.C1444j;

public class ActionMenuItemView extends C0298z implements C0141n.C0142a, View.OnClickListener, ActionMenuView.C0156a {

    /* renamed from: A */
    private int f403A;

    /* renamed from: B */
    private int f404B;

    /* renamed from: r */
    C0128i f405r;

    /* renamed from: s */
    private CharSequence f406s;

    /* renamed from: t */
    private Drawable f407t;

    /* renamed from: u */
    C0124g.C0126b f408u;

    /* renamed from: v */
    private C0225h0 f409v;

    /* renamed from: w */
    C0111b f410w;

    /* renamed from: x */
    private boolean f411x;

    /* renamed from: y */
    private boolean f412y;

    /* renamed from: z */
    private int f413z;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    private class C0110a extends C0225h0 {
        public C0110a() {
            super(ActionMenuItemView.this);
        }

        /* renamed from: b */
        public C0144p mo445b() {
            C0111b bVar = ActionMenuItemView.this.f410w;
            if (bVar != null) {
                return bVar.mo447a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
            r0 = mo445b();
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo446c() {
            /*
                r3 = this;
                androidx.appcompat.view.menu.ActionMenuItemView r0 = androidx.appcompat.view.menu.ActionMenuItemView.this
                androidx.appcompat.view.menu.g$b r1 = r0.f408u
                r2 = 0
                if (r1 == 0) goto L_0x001c
                androidx.appcompat.view.menu.i r0 = r0.f405r
                boolean r0 = r1.mo448a(r0)
                if (r0 == 0) goto L_0x001c
                androidx.appcompat.view.menu.p r0 = r3.mo445b()
                if (r0 == 0) goto L_0x001c
                boolean r0 = r0.mo544b()
                if (r0 == 0) goto L_0x001c
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.C0110a.mo446c():boolean");
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class C0111b {
        /* renamed from: a */
        public abstract C0144p mo447a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f411x = m513i();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1444j.f4434v, i, 0);
        this.f413z = obtainStyledAttributes.getDimensionPixelSize(C1444j.f4439w, 0);
        obtainStyledAttributes.recycle();
        this.f404B = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f403A = -1;
        setSaveEnabled(false);
    }

    /* renamed from: i */
    private boolean m513i() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: j */
    private void m514j() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f406s);
        if (this.f407t != null && (!this.f405r.mo665B() || (!this.f411x && !this.f412y))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.f406s : null);
        CharSequence contentDescription = this.f405r.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z3 ? null : this.f405r.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f405r.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence = this.f405r.getTitle();
            }
            C0299z0.m1497a(this, charSequence);
            return;
        }
        C0299z0.m1497a(this, tooltipText);
    }

    /* renamed from: a */
    public boolean mo426a() {
        return mo431h();
    }

    /* renamed from: b */
    public boolean mo427b() {
        return mo431h() && this.f405r.getIcon() == null;
    }

    /* renamed from: d */
    public boolean mo428d() {
        return true;
    }

    /* renamed from: e */
    public void mo429e(C0128i iVar, int i) {
        this.f405r = iVar;
        setIcon(iVar.getIcon());
        setTitle(iVar.mo683i(this));
        setId(iVar.getItemId());
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.f409v == null) {
            this.f409v = new C0110a();
        }
    }

    public C0128i getItemData() {
        return this.f405r;
    }

    /* renamed from: h */
    public boolean mo431h() {
        return !TextUtils.isEmpty(getText());
    }

    public void onClick(View view) {
        C0124g.C0126b bVar = this.f408u;
        if (bVar != null) {
            bVar.mo448a(this.f405r);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f411x = m513i();
        m514j();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        boolean h = mo431h();
        if (h && (i3 = this.f403A) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f413z) : this.f413z;
        if (mode != 1073741824 && this.f413z > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!h && this.f407t != null) {
            super.setPadding((getMeasuredWidth() - this.f407t.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0225h0 h0Var;
        if (!this.f405r.hasSubMenu() || (h0Var = this.f409v) == null || !h0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f412y != z) {
            this.f412y = z;
            C0128i iVar = this.f405r;
            if (iVar != null) {
                iVar.mo666c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f407t = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f404B;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i) / ((float) intrinsicHeight)));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        m514j();
    }

    public void setItemInvoker(C0124g.C0126b bVar) {
        this.f408u = bVar;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f403A = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(C0111b bVar) {
        this.f410w = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f406s = charSequence;
        m514j();
    }
}
