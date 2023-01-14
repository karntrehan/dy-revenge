package p174e.p319f.p320a.p363d.p373r;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: e.f.a.d.r.a */
public class C9053a implements View.OnTouchListener {

    /* renamed from: f */
    private final Dialog f24866f;

    /* renamed from: o */
    private final int f24867o;

    /* renamed from: p */
    private final int f24868p;

    /* renamed from: q */
    private final int f24869q;

    public C9053a(Dialog dialog, Rect rect) {
        this.f24866f = dialog;
        this.f24867o = rect.left;
        this.f24868p = rect.top;
        this.f24869q = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f24867o + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.f24868p + findViewById.getTop();
        if (new RectF((float) left, (float) top, (float) width, (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(4);
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f24869q;
            obtain.setLocation((float) ((-i) - 1), (float) ((-i) - 1));
        }
        view.performClick();
        return this.f24866f.onTouchEvent(obtain);
    }
}
