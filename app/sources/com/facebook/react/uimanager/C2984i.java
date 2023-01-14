package com.facebook.react.uimanager;

import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.uimanager.events.C2945d;
import com.facebook.react.uimanager.events.C2955i;
import com.facebook.react.uimanager.events.C2957j;
import com.facebook.react.uimanager.events.C2958k;
import p174e.p247e.p253d.p258e.C6071a;
import p174e.p247e.p315l.p316a.C6409a;

/* renamed from: com.facebook.react.uimanager.i */
public class C2984i {

    /* renamed from: a */
    private int f8310a = -1;

    /* renamed from: b */
    private final float[] f8311b = new float[2];

    /* renamed from: c */
    private boolean f8312c = false;

    /* renamed from: d */
    private long f8313d = Long.MIN_VALUE;

    /* renamed from: e */
    private final ViewGroup f8314e;

    /* renamed from: f */
    private final C2957j f8315f = new C2957j();

    public C2984i(ViewGroup viewGroup) {
        this.f8314e = viewGroup;
    }

    /* renamed from: a */
    private void m11838a(MotionEvent motionEvent, C2945d dVar) {
        if (this.f8310a == -1) {
            C6071a.m22859G("ReactNative", "Can't cancel already finished gesture. Is a child View trying to start a gesture from an UP/CANCEL event?");
            return;
        }
        C6409a.m24520b(!this.f8312c, "Expected to not have already sent a cancel for this gesture");
        int c = m11840c();
        int i = this.f8310a;
        C2958k kVar = C2958k.CANCEL;
        long j = this.f8313d;
        float[] fArr = this.f8311b;
        ((C2945d) C6409a.m24521c(dVar)).mo9651c(C2955i.m11772A(c, i, kVar, motionEvent, j, fArr[0], fArr[1], this.f8315f));
    }

    /* renamed from: b */
    private int m11839b(MotionEvent motionEvent) {
        return C3033p0.m11988b(motionEvent.getX(), motionEvent.getY(), this.f8314e, this.f8311b, (int[]) null);
    }

    /* renamed from: c */
    private int m11840c() {
        ViewGroup viewGroup = this.f8314e;
        if (viewGroup == null || !(viewGroup instanceof C2923b0) || ((C2923b0) viewGroup).getUIManagerType() != 2) {
            return -1;
        }
        return this.f8314e.getContext() instanceof C3031o0 ? ((C3031o0) this.f8314e.getContext()).mo9808c() : ((C2923b0) this.f8314e).getRootViewTag();
    }

    /* renamed from: d */
    public void mo9687d(MotionEvent motionEvent, C2945d dVar) {
        int c;
        int i;
        C2958k kVar;
        long j;
        float f;
        float f2;
        C2955i A;
        C2945d dVar2 = dVar;
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            if (this.f8310a != -1) {
                C6071a.m22875i("ReactNative", "Got DOWN touch before receiving UP or CANCEL from last gesture");
            }
            this.f8312c = false;
            this.f8313d = motionEvent.getEventTime();
            this.f8310a = m11839b(motionEvent);
            int c2 = m11840c();
            int i2 = this.f8310a;
            C2958k kVar2 = C2958k.START;
            long j2 = this.f8313d;
            float[] fArr = this.f8311b;
            A = C2955i.m11772A(c2, i2, kVar2, motionEvent, j2, fArr[0], fArr[1], this.f8315f);
        } else if (!this.f8312c) {
            if (this.f8310a == -1) {
                C6071a.m22875i("ReactNative", "Unexpected state: received touch event but didn't get starting ACTION_DOWN for this gesture before");
                return;
            }
            if (action == 1) {
                m11839b(motionEvent);
                int c3 = m11840c();
                int i3 = this.f8310a;
                C2958k kVar3 = C2958k.END;
                long j3 = this.f8313d;
                float[] fArr2 = this.f8311b;
                dVar2.mo9651c(C2955i.m11772A(c3, i3, kVar3, motionEvent, j3, fArr2[0], fArr2[1], this.f8315f));
            } else {
                if (action == 2) {
                    m11839b(motionEvent);
                    c = m11840c();
                    i = this.f8310a;
                    kVar = C2958k.MOVE;
                    j = this.f8313d;
                    float[] fArr3 = this.f8311b;
                    f = fArr3[0];
                    f2 = fArr3[1];
                } else if (action == 5) {
                    c = m11840c();
                    i = this.f8310a;
                    kVar = C2958k.START;
                    j = this.f8313d;
                    float[] fArr4 = this.f8311b;
                    f = fArr4[0];
                    f2 = fArr4[1];
                } else if (action == 6) {
                    c = m11840c();
                    i = this.f8310a;
                    kVar = C2958k.END;
                    j = this.f8313d;
                    float[] fArr5 = this.f8311b;
                    f = fArr5[0];
                    f2 = fArr5[1];
                } else if (action != 3) {
                    C6071a.m22859G("ReactNative", "Warning : touch event was ignored. Action=" + action + " Target=" + this.f8310a);
                    return;
                } else if (this.f8315f.mo9668c(motionEvent.getDownTime())) {
                    m11838a(motionEvent, dVar);
                } else {
                    C6071a.m22875i("ReactNative", "Received an ACTION_CANCEL touch event for which we have no corresponding ACTION_DOWN");
                }
                A = C2955i.m11772A(c, i, kVar, motionEvent, j, f, f2, this.f8315f);
            }
            this.f8310a = -1;
            this.f8313d = Long.MIN_VALUE;
            return;
        } else {
            return;
        }
        dVar2.mo9651c(A);
    }

    /* renamed from: e */
    public void mo9688e(MotionEvent motionEvent, C2945d dVar) {
        if (!this.f8312c) {
            m11838a(motionEvent, dVar);
            this.f8312c = true;
            this.f8310a = -1;
        }
    }
}
