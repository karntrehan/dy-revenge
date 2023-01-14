package p174e.p446g.p448b;

import android.view.MotionEvent;
import p455g.p470y.p472d.C10457l;

/* renamed from: e.g.b.l */
public final class C10209l {

    /* renamed from: a */
    public static final C10209l f27367a = new C10209l();

    private C10209l() {
    }

    /* renamed from: a */
    public final float mo25482a(MotionEvent motionEvent, boolean z) {
        C10457l.m35320e(motionEvent, "event");
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        int actionIndex = motionEvent.getActionMasked() == 6 ? motionEvent.getActionIndex() : -1;
        if (z) {
            float f = 0.0f;
            int pointerCount = motionEvent.getPointerCount();
            int i = 0;
            if (pointerCount > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i + 1;
                    if (i != actionIndex) {
                        f += motionEvent.getX(i) + rawX;
                        i2++;
                    }
                    if (i3 >= pointerCount) {
                        break;
                    }
                    i = i3;
                }
                i = i2;
            }
            return f / ((float) i);
        }
        int pointerCount2 = motionEvent.getPointerCount() - 1;
        if (pointerCount2 == actionIndex) {
            pointerCount2--;
        }
        return motionEvent.getX(pointerCount2) + rawX;
    }

    /* renamed from: b */
    public final float mo25483b(MotionEvent motionEvent, boolean z) {
        C10457l.m35320e(motionEvent, "event");
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        int actionIndex = motionEvent.getActionMasked() == 6 ? motionEvent.getActionIndex() : -1;
        if (z) {
            float f = 0.0f;
            int pointerCount = motionEvent.getPointerCount();
            int i = 0;
            if (pointerCount > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i + 1;
                    if (i != actionIndex) {
                        f += motionEvent.getY(i) + rawY;
                        i2++;
                    }
                    if (i3 >= pointerCount) {
                        break;
                    }
                    i = i3;
                }
                i = i2;
            }
            return f / ((float) i);
        }
        int pointerCount2 = motionEvent.getPointerCount() - 1;
        if (pointerCount2 == actionIndex) {
            pointerCount2--;
        }
        return motionEvent.getY(pointerCount2) + rawY;
    }
}
