package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p027c.p041c.C1494a;

@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: f */
    private final int f1290f = getResources().getDimensionPixelOffset(C1494a.browser_actions_context_menu_min_padding);

    /* renamed from: o */
    private final int f1291o = getResources().getDimensionPixelOffset(C1494a.browser_actions_context_menu_max_width);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f1290f * 2), this.f1291o), 1073741824), i2);
    }
}
