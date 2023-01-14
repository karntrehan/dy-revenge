package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.C0222g0;

public class FitWindowsFrameLayout extends FrameLayout implements C0222g0 {

    /* renamed from: f */
    private C0222g0.C0223a f726f;

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        C0222g0.C0223a aVar = this.f726f;
        if (aVar != null) {
            aVar.mo320a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(C0222g0.C0223a aVar) {
        this.f726f = aVar;
    }
}
