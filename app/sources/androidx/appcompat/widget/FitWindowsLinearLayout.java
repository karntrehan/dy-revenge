package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.C0222g0;

public class FitWindowsLinearLayout extends LinearLayout implements C0222g0 {

    /* renamed from: f */
    private C0222g0.C0223a f727f;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        C0222g0.C0223a aVar = this.f727f;
        if (aVar != null) {
            aVar.mo320a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(C0222g0.C0223a aVar) {
        this.f727f = aVar;
    }
}
