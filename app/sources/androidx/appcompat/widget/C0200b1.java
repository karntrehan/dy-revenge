package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.reactnativecommunity.webview.RNCWebViewManager;
import p027c.p028a.C1438d;
import p027c.p028a.C1440f;
import p027c.p028a.C1441g;
import p027c.p028a.C1443i;

/* renamed from: androidx.appcompat.widget.b1 */
class C0200b1 {

    /* renamed from: a */
    private final Context f899a;

    /* renamed from: b */
    private final View f900b;

    /* renamed from: c */
    private final TextView f901c;

    /* renamed from: d */
    private final WindowManager.LayoutParams f902d;

    /* renamed from: e */
    private final Rect f903e = new Rect();

    /* renamed from: f */
    private final int[] f904f = new int[2];

    /* renamed from: g */
    private final int[] f905g = new int[2];

    C0200b1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f902d = layoutParams;
        this.f899a = context;
        View inflate = LayoutInflater.from(context).inflate(C1441g.abc_tooltip, (ViewGroup) null);
        this.f900b = inflate;
        this.f901c = (TextView) inflate.findViewById(C1440f.message);
        layoutParams.setTitle(C0200b1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = RNCWebViewManager.COMMAND_CLEAR_HISTORY;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C1443i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    /* renamed from: a */
    private void m1021a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int i3;
        int i4;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f899a.getResources().getDimensionPixelOffset(C1438d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f899a.getResources().getDimensionPixelOffset(C1438d.tooltip_precise_anchor_extra_offset);
            i4 = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            i4 = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f899a.getResources().getDimensionPixelOffset(z ? C1438d.tooltip_y_offset_touch : C1438d.tooltip_y_offset_non_touch);
        View b = m1022b(view);
        if (b == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b.getWindowVisibleDisplayFrame(this.f903e);
        Rect rect = this.f903e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f899a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f903e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b.getLocationOnScreen(this.f905g);
        view.getLocationOnScreen(this.f904f);
        int[] iArr = this.f904f;
        int i5 = iArr[0];
        int[] iArr2 = this.f905g;
        iArr[0] = i5 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i) - (b.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f900b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f900b.getMeasuredHeight();
        int[] iArr3 = this.f904f;
        int i6 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
        int i7 = iArr3[1] + i4 + dimensionPixelOffset3;
        if (!z ? measuredHeight + i7 > this.f903e.height() : i6 >= 0) {
            layoutParams.y = i6;
        } else {
            layoutParams.y = i7;
        }
    }

    /* renamed from: b */
    private static View m1022b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1255c() {
        if (mo1256d()) {
            ((WindowManager) this.f899a.getSystemService("window")).removeView(this.f900b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo1256d() {
        return this.f900b.getParent() != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo1257e(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (mo1256d()) {
            mo1255c();
        }
        this.f901c.setText(charSequence);
        m1021a(view, i, i2, z, this.f902d);
        ((WindowManager) this.f899a.getSystemService("window")).addView(this.f900b, this.f902d);
    }
}
