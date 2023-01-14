package com.yalantis.ucrop.p445m;

import android.view.MotionEvent;

/* renamed from: com.yalantis.ucrop.m.h */
public class C10168h {

    /* renamed from: a */
    private float f27136a;

    /* renamed from: b */
    private float f27137b;

    /* renamed from: c */
    private float f27138c;

    /* renamed from: d */
    private float f27139d;

    /* renamed from: e */
    private int f27140e = -1;

    /* renamed from: f */
    private int f27141f = -1;

    /* renamed from: g */
    private float f27142g;

    /* renamed from: h */
    private boolean f27143h;

    /* renamed from: i */
    private C10169a f27144i;

    /* renamed from: com.yalantis.ucrop.m.h$a */
    public interface C10169a {
        /* renamed from: a */
        boolean mo25287a(C10168h hVar);
    }

    /* renamed from: com.yalantis.ucrop.m.h$b */
    public static class C10170b implements C10169a {
    }

    public C10168h(C10169a aVar) {
        this.f27144i = aVar;
    }

    /* renamed from: a */
    private float m34416a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return m34417b((float) Math.toDegrees((double) ((float) Math.atan2((double) (f2 - f4), (double) (f - f3)))), (float) Math.toDegrees((double) ((float) Math.atan2((double) (f6 - f8), (double) (f5 - f7)))));
    }

    /* renamed from: b */
    private float m34417b(float f, float f2) {
        float f3;
        float f4 = (f2 % 360.0f) - (f % 360.0f);
        this.f27142g = f4;
        if (f4 < -180.0f) {
            f3 = f4 + 360.0f;
        } else {
            if (f4 > 180.0f) {
                f3 = f4 - 360.0f;
            }
            return this.f27142g;
        }
        this.f27142g = f3;
        return this.f27142g;
    }

    /* renamed from: c */
    public float mo25285c() {
        return this.f27142g;
    }

    /* renamed from: d */
    public boolean mo25286d(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.f27140e = -1;
            } else if (actionMasked != 2) {
                if (actionMasked == 5) {
                    this.f27136a = motionEvent.getX();
                    this.f27137b = motionEvent.getY();
                    this.f27141f = motionEvent2.findPointerIndex(motionEvent2.getPointerId(motionEvent.getActionIndex()));
                } else if (actionMasked == 6) {
                    this.f27141f = -1;
                }
            } else if (!(this.f27140e == -1 || this.f27141f == -1 || motionEvent.getPointerCount() <= this.f27141f)) {
                float x = motionEvent2.getX(this.f27140e);
                float y = motionEvent2.getY(this.f27140e);
                float x2 = motionEvent2.getX(this.f27141f);
                float y2 = motionEvent2.getY(this.f27141f);
                if (this.f27143h) {
                    this.f27142g = 0.0f;
                    this.f27143h = false;
                } else {
                    m34416a(this.f27136a, this.f27137b, this.f27138c, this.f27139d, x2, y2, x, y);
                }
                C10169a aVar = this.f27144i;
                if (aVar != null) {
                    aVar.mo25287a(this);
                }
                this.f27136a = x2;
                this.f27137b = y2;
                this.f27138c = x;
                this.f27139d = y;
            }
            return true;
        }
        this.f27138c = motionEvent.getX();
        this.f27139d = motionEvent.getY();
        this.f27140e = motionEvent2.findPointerIndex(motionEvent2.getPointerId(0));
        this.f27142g = 0.0f;
        this.f27143h = true;
        return true;
    }
}
