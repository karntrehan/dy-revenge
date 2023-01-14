package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p027c.p028a.C1435a;

/* renamed from: androidx.appcompat.widget.u */
public class C0274u extends SeekBar {

    /* renamed from: f */
    private final C0276v f1197f;

    public C0274u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1435a.seekBarStyle);
    }

    public C0274u(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0271s0.m1349a(this, getContext());
        C0276v vVar = new C0276v(this);
        this.f1197f = vVar;
        vVar.mo1640c(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1197f.mo1713h();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1197f.mo1714i();
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1197f.mo1712g(canvas);
    }
}
