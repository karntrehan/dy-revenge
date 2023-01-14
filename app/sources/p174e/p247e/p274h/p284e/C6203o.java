package p174e.p247e.p274h.p284e;

import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;
import p174e.p247e.p294k.p312p.C6394b;

/* renamed from: e.e.h.e.o */
public class C6203o extends C6202n {
    public C6203o(NinePatchDrawable ninePatchDrawable) {
        super(ninePatchDrawable);
    }

    public void draw(Canvas canvas) {
        if (C6394b.m24481d()) {
            C6394b.m24478a("RoundedNinePatchDrawable#draw");
        }
        if (!mo18410e()) {
            super.draw(canvas);
            if (C6394b.m24481d()) {
                C6394b.m24479b();
                return;
            }
            return;
        }
        mo18431h();
        mo18425f();
        canvas.clipPath(this.f17183r);
        super.draw(canvas);
        if (C6394b.m24481d()) {
            C6394b.m24479b();
        }
    }
}
