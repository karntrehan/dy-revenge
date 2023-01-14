package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import androidx.core.util.C1176g;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.p126z.C3257a;
import p174e.p247e.p315l.p316a.C6409a;

/* renamed from: com.facebook.react.uimanager.events.i */
public class C2955i extends C2944c<C2955i> {

    /* renamed from: h */
    private static final String f8271h = "i";

    /* renamed from: i */
    private static final C1176g<C2955i> f8272i = new C1176g<>(3);

    /* renamed from: j */
    private MotionEvent f8273j;

    /* renamed from: k */
    private C2958k f8274k;

    /* renamed from: l */
    private short f8275l;

    /* renamed from: m */
    private float f8276m;

    /* renamed from: n */
    private float f8277n;

    /* renamed from: com.facebook.react.uimanager.events.i$a */
    static /* synthetic */ class C2956a {

        /* renamed from: a */
        static final /* synthetic */ int[] f8278a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.facebook.react.uimanager.events.k[] r0 = com.facebook.react.uimanager.events.C2958k.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8278a = r0
                com.facebook.react.uimanager.events.k r1 = com.facebook.react.uimanager.events.C2958k.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8278a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.react.uimanager.events.k r1 = com.facebook.react.uimanager.events.C2958k.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8278a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.react.uimanager.events.k r1 = com.facebook.react.uimanager.events.C2958k.CANCEL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8278a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.react.uimanager.events.k r1 = com.facebook.react.uimanager.events.C2958k.MOVE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.events.C2955i.C2956a.<clinit>():void");
        }
    }

    private C2955i() {
    }

    /* renamed from: A */
    public static C2955i m11772A(int i, int i2, C2958k kVar, MotionEvent motionEvent, long j, float f, float f2, C2957j jVar) {
        C2955i b = f8272i.mo3702b();
        if (b == null) {
            b = new C2955i();
        }
        b.m11774z(i, i2, kVar, (MotionEvent) C6409a.m24521c(motionEvent), j, f, f2, jVar);
        return b;
    }

    /* renamed from: y */
    private boolean m11773y() {
        return this.f8273j != null;
    }

    /* renamed from: z */
    private void m11774z(int i, int i2, C2958k kVar, MotionEvent motionEvent, long j, float f, float f2, C2957j jVar) {
        super.mo9646r(i, i2, motionEvent.getEventTime());
        short s = 0;
        SoftAssertions.assertCondition(j != Long.MIN_VALUE, "Gesture start time must be initialized");
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    s = jVar.mo9667b(j);
                } else if (action != 3) {
                    if (action == 5 || action == 6) {
                        jVar.mo9669d(j);
                    } else {
                        throw new RuntimeException("Unhandled MotionEvent action: " + action);
                    }
                }
            }
            jVar.mo9670e(j);
        } else {
            jVar.mo9666a(j);
        }
        this.f8274k = kVar;
        this.f8273j = MotionEvent.obtain(motionEvent);
        this.f8275l = s;
        this.f8276m = f;
        this.f8277n = f2;
    }

    /* renamed from: a */
    public boolean mo9631a() {
        int i = C2956a.f8278a[((C2958k) C6409a.m24521c(this.f8274k)).ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4) {
            return true;
        }
        throw new RuntimeException("Unknown touch event type: " + this.f8274k);
    }

    /* renamed from: c */
    public void mo9633c(RCTEventEmitter rCTEventEmitter) {
        if (!m11773y()) {
            ReactSoftExceptionLogger.logSoftException(f8271h, new IllegalStateException("Cannot dispatch a TouchEvent that has no MotionEvent; the TouchEvent has been recycled"));
        } else {
            C2959l.m11797d(rCTEventEmitter, this);
        }
    }

    /* renamed from: d */
    public void mo9634d(RCTModernEventEmitter rCTModernEventEmitter) {
        if (C3257a.f9233n) {
            C2959l.m11798e(rCTModernEventEmitter, this, false);
        } else {
            mo9633c(rCTModernEventEmitter);
        }
    }

    /* renamed from: e */
    public void mo9635e(RCTModernEventEmitter rCTModernEventEmitter) {
        if (C3257a.f9233n) {
            C2959l.m11798e(rCTModernEventEmitter, this, true);
        } else {
            mo9633c(rCTModernEventEmitter);
        }
    }

    /* renamed from: g */
    public short mo9637g() {
        return this.f8275l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo9638h() {
        C2958k kVar = this.f8274k;
        if (kVar == null) {
            return 2;
        }
        int i = C2956a.f8278a[kVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2 || i == 3) {
            return 1;
        }
        if (i != 4) {
            return super.mo9638h();
        }
        return 4;
    }

    /* renamed from: j */
    public String mo9630j() {
        return C2958k.m11792e((C2958k) C6409a.m24521c(this.f8274k));
    }

    /* renamed from: t */
    public void mo9648t() {
        MotionEvent motionEvent = this.f8273j;
        this.f8273j = null;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        try {
            f8272i.mo3701a(this);
        } catch (IllegalStateException e) {
            ReactSoftExceptionLogger.logSoftException(f8271h, e);
        }
    }

    /* renamed from: u */
    public MotionEvent mo9662u() {
        C6409a.m24521c(this.f8273j);
        return this.f8273j;
    }

    /* renamed from: v */
    public C2958k mo9663v() {
        return (C2958k) C6409a.m24521c(this.f8274k);
    }

    /* renamed from: w */
    public float mo9664w() {
        return this.f8276m;
    }

    /* renamed from: x */
    public float mo9665x() {
        return this.f8277n;
    }
}
