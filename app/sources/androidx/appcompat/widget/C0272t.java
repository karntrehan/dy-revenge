package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p027c.p028a.C1435a;

/* renamed from: androidx.appcompat.widget.t */
public class C0272t extends RatingBar {

    /* renamed from: f */
    private final C0267r f1196f;

    public C0272t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1435a.ratingBarStyle);
    }

    public C0272t(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0271s0.m1349a(this, getContext());
        C0267r rVar = new C0267r(this);
        this.f1196f = rVar;
        rVar.mo1640c(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap b = this.f1196f.mo1639b();
        if (b != null) {
            setMeasuredDimension(View.resolveSizeAndState(b.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
