package p174e.p446g.p448b;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C3038r;
import java.util.Arrays;
import p174e.p446g.p448b.C10200h;
import p455g.p470y.p471c.C10430l;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;
import p455g.p470y.p472d.C10468w;

/* renamed from: e.g.b.h */
public class C10200h<ConcreteGestureHandlerT extends C10200h<ConcreteGestureHandlerT>> {

    /* renamed from: a */
    public static final C10202b f27304a = new C10202b((C10452g) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static MotionEvent.PointerProperties[] f27305b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static MotionEvent.PointerCoords[] f27306c;

    /* renamed from: d */
    private static short f27307d;

    /* renamed from: A */
    private float f27308A;

    /* renamed from: B */
    private float f27309B;

    /* renamed from: C */
    private boolean f27310C;

    /* renamed from: D */
    private int f27311D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public C10205j f27312E;

    /* renamed from: F */
    private C10216p f27313F;

    /* renamed from: G */
    private C10204i f27314G;

    /* renamed from: H */
    private int f27315H;

    /* renamed from: I */
    private boolean f27316I;

    /* renamed from: J */
    private boolean f27317J;

    /* renamed from: K */
    private boolean f27318K;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final int[] f27319e = new int[12];
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f27320f;

    /* renamed from: g */
    private final int[] f27321g;

    /* renamed from: h */
    private int f27322h;

    /* renamed from: i */
    private View f27323i;

    /* renamed from: j */
    private int f27324j;

    /* renamed from: k */
    private float f27325k;

    /* renamed from: l */
    private float f27326l;

    /* renamed from: m */
    private boolean f27327m;

    /* renamed from: n */
    private boolean f27328n;

    /* renamed from: o */
    private int f27329o;

    /* renamed from: p */
    private WritableArray f27330p;

    /* renamed from: q */
    private WritableArray f27331q;

    /* renamed from: r */
    private int f27332r;

    /* renamed from: s */
    private int f27333s;

    /* renamed from: t */
    private final C10203c[] f27334t;

    /* renamed from: u */
    private boolean f27335u;

    /* renamed from: v */
    private float[] f27336v;

    /* renamed from: w */
    private short f27337w;

    /* renamed from: x */
    private float f27338x;

    /* renamed from: y */
    private float f27339y;

    /* renamed from: z */
    private boolean f27340z;

    /* renamed from: e.g.b.h$a */
    public static final class C10201a extends Exception {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10201a(C10200h<?> hVar, MotionEvent motionEvent, IllegalArgumentException illegalArgumentException) {
            super(C10290i.m34916f("\n    handler: " + C10468w.m35335b(hVar.getClass()).mo25574a() + "\n    state: " + hVar.mo25427N() + "\n    view: " + hVar.mo25431R() + "\n    orchestrator: " + hVar.f27312E + "\n    isEnabled: " + hVar.mo25436X() + "\n    isActive: " + hVar.mo25434V() + "\n    isAwaiting: " + hVar.mo25435W() + "\n    trackedPointersCount: " + hVar.f27320f + "\n    trackedPointers: " + C10343h.m35093x(hVar.f27319e, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C10430l) null, 62, (Object) null) + "\n    while handling event: " + motionEvent + "\n  "), illegalArgumentException);
            C10457l.m35320e(hVar, "handler");
            C10457l.m35320e(motionEvent, "event");
            C10457l.m35320e(illegalArgumentException, "e");
        }
    }

    /* renamed from: e.g.b.h$b */
    public static final class C10202b {
        private C10202b() {
        }

        public /* synthetic */ C10202b(C10452g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final boolean m34604c(float f) {
            return !Float.isNaN(f);
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final void m34605d(int i) {
            if (C10200h.f27305b == null) {
                C10200h.f27305b = new MotionEvent.PointerProperties[12];
                C10200h.f27306c = new MotionEvent.PointerCoords[12];
            }
            while (i > 0) {
                MotionEvent.PointerProperties[] c = C10200h.f27305b;
                if (c != null) {
                    int i2 = i - 1;
                    if (c[i2] == null) {
                        MotionEvent.PointerProperties[] c2 = C10200h.f27305b;
                        if (c2 != null) {
                            c2[i2] = new MotionEvent.PointerProperties();
                            MotionEvent.PointerCoords[] b = C10200h.f27306c;
                            if (b != null) {
                                b[i2] = new MotionEvent.PointerCoords();
                                i--;
                            } else {
                                C10457l.m35332q("pointerCoords");
                                throw null;
                            }
                        } else {
                            C10457l.m35332q("pointerProps");
                            throw null;
                        }
                    } else {
                        return;
                    }
                } else {
                    C10457l.m35332q("pointerProps");
                    throw null;
                }
            }
        }
    }

    /* renamed from: e.g.b.h$c */
    private static final class C10203c {

        /* renamed from: a */
        private final int f27341a;

        /* renamed from: b */
        private float f27342b;

        /* renamed from: c */
        private float f27343c;

        /* renamed from: d */
        private float f27344d;

        /* renamed from: e */
        private float f27345e;

        public C10203c(int i, float f, float f2, float f3, float f4) {
            this.f27341a = i;
            this.f27342b = f;
            this.f27343c = f2;
            this.f27344d = f3;
            this.f27345e = f4;
        }

        /* renamed from: a */
        public final float mo25467a() {
            return this.f27344d;
        }

        /* renamed from: b */
        public final float mo25468b() {
            return this.f27345e;
        }

        /* renamed from: c */
        public final int mo25469c() {
            return this.f27341a;
        }

        /* renamed from: d */
        public final float mo25470d() {
            return this.f27342b;
        }

        /* renamed from: e */
        public final float mo25471e() {
            return this.f27343c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10203c)) {
                return false;
            }
            C10203c cVar = (C10203c) obj;
            return this.f27341a == cVar.f27341a && C10457l.m35316a(Float.valueOf(this.f27342b), Float.valueOf(cVar.f27342b)) && C10457l.m35316a(Float.valueOf(this.f27343c), Float.valueOf(cVar.f27343c)) && C10457l.m35316a(Float.valueOf(this.f27344d), Float.valueOf(cVar.f27344d)) && C10457l.m35316a(Float.valueOf(this.f27345e), Float.valueOf(cVar.f27345e));
        }

        /* renamed from: f */
        public final void mo25473f(float f) {
            this.f27344d = f;
        }

        /* renamed from: g */
        public final void mo25474g(float f) {
            this.f27345e = f;
        }

        /* renamed from: h */
        public final void mo25475h(float f) {
            this.f27342b = f;
        }

        public int hashCode() {
            return (((((((this.f27341a * 31) + Float.floatToIntBits(this.f27342b)) * 31) + Float.floatToIntBits(this.f27343c)) * 31) + Float.floatToIntBits(this.f27344d)) * 31) + Float.floatToIntBits(this.f27345e);
        }

        /* renamed from: i */
        public final void mo25477i(float f) {
            this.f27343c = f;
        }

        public String toString() {
            return "PointerData(pointerId=" + this.f27341a + ", x=" + this.f27342b + ", y=" + this.f27343c + ", absoluteX=" + this.f27344d + ", absoluteY=" + this.f27345e + ')';
        }
    }

    public C10200h() {
        int[] iArr = new int[2];
        for (int i = 0; i < 2; i++) {
            iArr[i] = 0;
        }
        this.f27321g = iArr;
        this.f27328n = true;
        C10203c[] cVarArr = new C10203c[12];
        for (int i2 = 0; i2 < 12; i2++) {
            cVarArr[i2] = null;
        }
        this.f27334t = cVarArr;
    }

    /* renamed from: A */
    private final void m34516A() {
        this.f27331q = null;
        C10203c[] cVarArr = this.f27334t;
        int length = cVarArr.length;
        int i = 0;
        while (i < length) {
            C10203c cVar = cVarArr[i];
            i++;
            if (cVar != null) {
                m34532m(cVar);
            }
        }
    }

    /* renamed from: C */
    private final int m34517C() {
        int[] iArr;
        int i = 0;
        while (i < this.f27320f) {
            int i2 = 0;
            while (true) {
                iArr = this.f27319e;
                if (i2 < iArr.length && iArr[i2] != i) {
                    i2++;
                }
            }
            if (i2 == iArr.length) {
                return i;
            }
            i++;
        }
        return i;
    }

    /* renamed from: S */
    private final Window m34518S(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return ((Activity) context).getWindow();
        }
        if (context instanceof ContextWrapper) {
            return m34518S(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: b0 */
    private final void m34522b0(int i) {
        UiThreadUtil.assertOnUiThread();
        if (this.f27324j != i) {
            if (this.f27333s > 0 && (i == 5 || i == 3 || i == 1)) {
                m34533p();
            }
            int i2 = this.f27324j;
            this.f27324j = i;
            if (i == 4) {
                short s = f27307d;
                f27307d = (short) (s + 1);
                this.f27337w = s;
            }
            C10205j jVar = this.f27312E;
            C10457l.m35317b(jVar);
            jVar.mo25479u(this, i, i2);
            mo25439g0(i, i2);
        }
    }

    /* renamed from: c0 */
    private final boolean m34524c0(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != this.f27320f) {
            return true;
        }
        int length = this.f27319e.length - 1;
        if (length >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                int i3 = this.f27319e[i];
                if (i3 != -1 && i3 != i) {
                    return true;
                }
                if (i2 > length) {
                    break;
                }
                i = i2;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0158  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.view.MotionEvent m34530k(android.view.MotionEvent r27) {
        /*
            r26 = this;
            r1 = r26
            r2 = r27
            boolean r0 = r26.m34524c0(r27)
            if (r0 != 0) goto L_0x000b
            return r2
        L_0x000b:
            int r0 = r27.getActionMasked()
            r3 = 2
            r4 = 5
            r5 = -1
            r7 = 1
            if (r0 == 0) goto L_0x0035
            r8 = 6
            if (r0 == r7) goto L_0x001f
            if (r0 == r4) goto L_0x0035
            if (r0 == r8) goto L_0x001f
            r3 = r0
            r0 = -1
            goto L_0x004a
        L_0x001f:
            int r0 = r27.getActionIndex()
            int r4 = r2.getPointerId(r0)
            int[] r9 = r1.f27319e
            r4 = r9[r4]
            if (r4 == r5) goto L_0x004a
            int r3 = r1.f27320f
            if (r3 != r7) goto L_0x0033
            r3 = 1
            goto L_0x004a
        L_0x0033:
            r3 = 6
            goto L_0x004a
        L_0x0035:
            int r0 = r27.getActionIndex()
            int r8 = r2.getPointerId(r0)
            int[] r9 = r1.f27319e
            r8 = r9[r8]
            if (r8 == r5) goto L_0x004a
            int r3 = r1.f27320f
            if (r3 != r7) goto L_0x0049
            r3 = 0
            goto L_0x004a
        L_0x0049:
            r3 = 5
        L_0x004a:
            e.g.b.h$b r4 = f27304a
            int r8 = r1.f27320f
            r4.m34605d(r8)
            float r4 = r27.getX()
            float r8 = r27.getY()
            float r9 = r27.getRawX()
            float r10 = r27.getRawY()
            r2.setLocation(r9, r10)
            int r9 = r27.getPointerCount()
            r14 = r3
            r3 = 0
            r15 = 0
        L_0x006b:
            java.lang.String r10 = "pointerCoords"
            java.lang.String r11 = "pointerProps"
            r12 = 0
            if (r3 >= r9) goto L_0x00b4
            int r13 = r2.getPointerId(r3)
            int[] r6 = r1.f27319e
            r6 = r6[r13]
            if (r6 == r5) goto L_0x00b1
            android.view.MotionEvent$PointerProperties[] r6 = f27305b
            if (r6 == 0) goto L_0x00ad
            r6 = r6[r15]
            r2.getPointerProperties(r3, r6)
            android.view.MotionEvent$PointerProperties[] r6 = f27305b
            if (r6 == 0) goto L_0x00a9
            r6 = r6[r15]
            p455g.p470y.p472d.C10457l.m35317b(r6)
            int[] r11 = r1.f27319e
            r11 = r11[r13]
            r6.id = r11
            android.view.MotionEvent$PointerCoords[] r6 = f27306c
            if (r6 == 0) goto L_0x00a5
            r6 = r6[r15]
            r2.getPointerCoords(r3, r6)
            if (r3 != r0) goto L_0x00a2
            int r6 = r15 << 8
            r14 = r14 | r6
        L_0x00a2:
            int r15 = r15 + 1
            goto L_0x00b1
        L_0x00a5:
            p455g.p470y.p472d.C10457l.m35332q(r10)
            throw r12
        L_0x00a9:
            p455g.p470y.p472d.C10457l.m35332q(r11)
            throw r12
        L_0x00ad:
            p455g.p470y.p472d.C10457l.m35332q(r11)
            throw r12
        L_0x00b1:
            int r3 = r3 + 1
            goto L_0x006b
        L_0x00b4:
            android.view.MotionEvent$PointerProperties[] r0 = f27305b
            if (r0 == 0) goto L_0x0158
            int r0 = r0.length
            if (r0 != 0) goto L_0x00bd
            r0 = 1
            goto L_0x00be
        L_0x00bd:
            r0 = 0
        L_0x00be:
            if (r0 != 0) goto L_0x0127
            android.view.MotionEvent$PointerCoords[] r0 = f27306c
            if (r0 == 0) goto L_0x0123
            int r0 = r0.length
            if (r0 != 0) goto L_0x00c9
            r6 = 1
            goto L_0x00ca
        L_0x00c9:
            r6 = 0
        L_0x00ca:
            if (r6 == 0) goto L_0x00cd
            goto L_0x0127
        L_0x00cd:
            long r5 = r27.getDownTime()     // Catch:{ IllegalArgumentException -> 0x011c }
            long r16 = r27.getEventTime()     // Catch:{ IllegalArgumentException -> 0x011c }
            android.view.MotionEvent$PointerProperties[] r0 = f27305b     // Catch:{ IllegalArgumentException -> 0x011c }
            if (r0 == 0) goto L_0x0118
            android.view.MotionEvent$PointerCoords[] r3 = f27306c     // Catch:{ IllegalArgumentException -> 0x011c }
            if (r3 == 0) goto L_0x0114
            int r18 = r27.getMetaState()     // Catch:{ IllegalArgumentException -> 0x011c }
            int r19 = r27.getButtonState()     // Catch:{ IllegalArgumentException -> 0x011c }
            float r20 = r27.getXPrecision()     // Catch:{ IllegalArgumentException -> 0x011c }
            float r21 = r27.getYPrecision()     // Catch:{ IllegalArgumentException -> 0x011c }
            int r22 = r27.getDeviceId()     // Catch:{ IllegalArgumentException -> 0x011c }
            int r23 = r27.getEdgeFlags()     // Catch:{ IllegalArgumentException -> 0x011c }
            int r24 = r27.getSource()     // Catch:{ IllegalArgumentException -> 0x011c }
            int r25 = r27.getFlags()     // Catch:{ IllegalArgumentException -> 0x011c }
            r10 = r5
            r12 = r16
            r16 = r0
            r17 = r3
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r10, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ IllegalArgumentException -> 0x011c }
            java.lang.String r3 = "obtain(\n        event.downTime,\n        event.eventTime,\n        action,\n        count,\n        pointerProps,  /* props are copied and hence it is safe to use static array here */\n        pointerCoords,  /* same applies to coords */\n        event.metaState,\n        event.buttonState,\n        event.xPrecision,\n        event.yPrecision,\n        event.deviceId,\n        event.edgeFlags,\n        event.source,\n        event.flags\n      )"
            p455g.p470y.p472d.C10457l.m35319d(r0, r3)     // Catch:{ IllegalArgumentException -> 0x011c }
            r2.setLocation(r4, r8)
            r0.setLocation(r4, r8)
            return r0
        L_0x0114:
            p455g.p470y.p472d.C10457l.m35332q(r10)     // Catch:{ IllegalArgumentException -> 0x011c }
            throw r12     // Catch:{ IllegalArgumentException -> 0x011c }
        L_0x0118:
            p455g.p470y.p472d.C10457l.m35332q(r11)     // Catch:{ IllegalArgumentException -> 0x011c }
            throw r12     // Catch:{ IllegalArgumentException -> 0x011c }
        L_0x011c:
            r0 = move-exception
            e.g.b.h$a r3 = new e.g.b.h$a
            r3.<init>(r1, r2, r0)
            throw r3
        L_0x0123:
            p455g.p470y.p472d.C10457l.m35332q(r10)
            throw r12
        L_0x0127:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "pointerCoords.size="
            r2.append(r3)
            android.view.MotionEvent$PointerCoords[] r3 = f27306c
            if (r3 == 0) goto L_0x0154
            int r3 = r3.length
            r2.append(r3)
            java.lang.String r3 = ", pointerProps.size="
            r2.append(r3)
            android.view.MotionEvent$PointerProperties[] r3 = f27305b
            if (r3 != 0) goto L_0x0148
            p455g.p470y.p472d.C10457l.m35332q(r11)
            throw r12
        L_0x0148:
            int r3 = r3.length
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0154:
            p455g.p470y.p472d.C10457l.m35332q(r10)
            throw r12
        L_0x0158:
            p455g.p470y.p472d.C10457l.m35332q(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p446g.p448b.C10200h.m34530k(android.view.MotionEvent):android.view.MotionEvent");
    }

    /* renamed from: l */
    private final void m34531l(C10203c cVar) {
        if (this.f27330p == null) {
            this.f27330p = Arguments.createArray();
        }
        WritableArray writableArray = this.f27330p;
        C10457l.m35317b(writableArray);
        writableArray.pushMap(m34535s(cVar));
    }

    /* renamed from: m */
    private final void m34532m(C10203c cVar) {
        if (this.f27331q == null) {
            this.f27331q = Arguments.createArray();
        }
        WritableArray writableArray = this.f27331q;
        C10457l.m35317b(writableArray);
        writableArray.pushMap(m34535s(cVar));
    }

    /* renamed from: p */
    private final void m34533p() {
        this.f27332r = 4;
        this.f27330p = null;
        m34516A();
        C10203c[] cVarArr = this.f27334t;
        int length = cVarArr.length;
        int i = 0;
        while (i < length) {
            C10203c cVar = cVarArr[i];
            i++;
            if (cVar != null) {
                m34531l(cVar);
            }
        }
        this.f27333s = 0;
        C10341g.m35075k(this.f27334t, (Object) null, 0, 0, 6, (Object) null);
        mo25461w();
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public static final void m34534r0(C10200h hVar) {
        C10457l.m35320e(hVar, "$this_applySelf");
        hVar.mo25448o();
    }

    /* renamed from: s */
    private final WritableMap m34535s(C10203c cVar) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", cVar.mo25469c());
        createMap.putDouble("x", (double) C3038r.m12004a(cVar.mo25470d()));
        createMap.putDouble("y", (double) C3038r.m12004a(cVar.mo25471e()));
        createMap.putDouble("absoluteX", (double) C3038r.m12004a(cVar.mo25467a()));
        createMap.putDouble("absoluteY", (double) C3038r.m12004a(cVar.mo25468b()));
        return createMap;
    }

    /* renamed from: v */
    private final void m34536v(MotionEvent motionEvent) {
        this.f27330p = null;
        this.f27332r = 1;
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        this.f27334t[pointerId] = new C10203c(pointerId, motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex()), (motionEvent.getX(motionEvent.getActionIndex()) + (motionEvent.getRawX() - motionEvent.getX())) - ((float) this.f27321g[0]), (motionEvent.getY(motionEvent.getActionIndex()) + (motionEvent.getRawY() - motionEvent.getY())) - ((float) this.f27321g[1]));
        this.f27333s++;
        C10203c cVar = this.f27334t[pointerId];
        C10457l.m35317b(cVar);
        m34531l(cVar);
        m34516A();
        mo25461w();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
        if ((r7.mo25471e() == r12.getY(r4)) == false) goto L_0x0051;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m34537x(android.view.MotionEvent r12) {
        /*
            r11 = this;
            r0 = 0
            r11.f27330p = r0
            r0 = 2
            r11.f27332r = r0
            float r0 = r12.getRawX()
            float r1 = r12.getX()
            float r0 = r0 - r1
            float r1 = r12.getRawY()
            float r2 = r12.getY()
            float r1 = r1 - r2
            int r2 = r12.getPointerCount()
            r3 = 0
            if (r2 <= 0) goto L_0x0086
            r4 = 0
            r5 = 0
        L_0x0021:
            int r6 = r4 + 1
            int r7 = r12.getPointerId(r4)
            e.g.b.h$c[] r8 = r11.f27334t
            r7 = r8[r7]
            if (r7 != 0) goto L_0x002e
            goto L_0x0080
        L_0x002e:
            float r8 = r7.mo25470d()
            float r9 = r12.getX(r4)
            r10 = 1
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x003d
            r8 = 1
            goto L_0x003e
        L_0x003d:
            r8 = 0
        L_0x003e:
            if (r8 == 0) goto L_0x0051
            float r8 = r7.mo25471e()
            float r9 = r12.getY(r4)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x004e
            r8 = 1
            goto L_0x004f
        L_0x004e:
            r8 = 0
        L_0x004f:
            if (r8 != 0) goto L_0x0080
        L_0x0051:
            float r8 = r12.getX(r4)
            r7.mo25475h(r8)
            float r8 = r12.getY(r4)
            r7.mo25477i(r8)
            float r8 = r12.getX(r4)
            float r8 = r8 + r0
            int[] r9 = r11.f27321g
            r9 = r9[r3]
            float r9 = (float) r9
            float r8 = r8 - r9
            r7.mo25473f(r8)
            float r4 = r12.getY(r4)
            float r4 = r4 + r1
            int[] r8 = r11.f27321g
            r8 = r8[r10]
            float r8 = (float) r8
            float r4 = r4 - r8
            r7.mo25474g(r4)
            r11.m34531l(r7)
            int r5 = r5 + 1
        L_0x0080:
            if (r6 < r2) goto L_0x0084
            r3 = r5
            goto L_0x0086
        L_0x0084:
            r4 = r6
            goto L_0x0021
        L_0x0086:
            if (r3 <= 0) goto L_0x008e
            r11.m34516A()
            r11.mo25461w()
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p446g.p448b.C10200h.m34537x(android.view.MotionEvent):void");
    }

    /* renamed from: y */
    private final void m34538y(MotionEvent motionEvent) {
        m34516A();
        this.f27330p = null;
        this.f27332r = 3;
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        this.f27334t[pointerId] = new C10203c(pointerId, motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex()), (motionEvent.getX(motionEvent.getActionIndex()) + (motionEvent.getRawX() - motionEvent.getX())) - ((float) this.f27321g[0]), (motionEvent.getY(motionEvent.getActionIndex()) + (motionEvent.getRawY() - motionEvent.getY())) - ((float) this.f27321g[1]));
        C10203c cVar = this.f27334t[pointerId];
        C10457l.m35317b(cVar);
        m34531l(cVar);
        this.f27334t[pointerId] = null;
        this.f27333s--;
        mo25461w();
    }

    /* renamed from: A0 */
    public boolean mo25408A0(C10200h<?> hVar) {
        C10204i iVar;
        C10457l.m35320e(hVar, "handler");
        if (hVar == this || (iVar = this.f27314G) == null) {
            return false;
        }
        return iVar.mo24722a(this, hVar);
    }

    /* renamed from: B */
    public final void mo25409B() {
        int i = this.f27324j;
        if (i == 4 || i == 0 || i == 2) {
            m34522b0(1);
        }
    }

    /* renamed from: B0 */
    public boolean mo25410B0(C10200h<?> hVar) {
        C10457l.m35320e(hVar, "handler");
        if (hVar == this) {
            return true;
        }
        C10204i iVar = this.f27314G;
        if (iVar == null) {
            return false;
        }
        return iVar.mo24723b(this, hVar);
    }

    /* renamed from: C0 */
    public boolean mo25411C0(C10200h<?> hVar) {
        C10204i iVar;
        C10457l.m35320e(hVar, "handler");
        if (hVar == this || (iVar = this.f27314G) == null) {
            return false;
        }
        return iVar.mo24725d(this, hVar);
    }

    /* renamed from: D */
    public final int mo25412D() {
        return this.f27329o;
    }

    /* renamed from: D0 */
    public final boolean mo25413D0(C10200h<?> hVar) {
        C10204i iVar;
        C10457l.m35320e(hVar, "handler");
        if (hVar == this || (iVar = this.f27314G) == null) {
            return false;
        }
        return iVar.mo24724c(this, hVar);
    }

    /* renamed from: E */
    public final int mo25414E() {
        return this.f27315H;
    }

    /* renamed from: E0 */
    public final void mo25415E0(int i) {
        int[] iArr = this.f27319e;
        if (iArr[i] == -1) {
            iArr[i] = m34517C();
            this.f27320f++;
        }
    }

    /* renamed from: F */
    public final short mo25416F() {
        return this.f27337w;
    }

    /* renamed from: F0 */
    public final void mo25417F0(int i) {
        int[] iArr = this.f27319e;
        if (iArr[i] != -1) {
            iArr[i] = -1;
            this.f27320f--;
        }
    }

    /* renamed from: G */
    public final float mo25418G() {
        return this.f27338x - ((float) this.f27321g[0]);
    }

    /* renamed from: G0 */
    public final void mo25419G0(MotionEvent motionEvent) {
        C10457l.m35320e(motionEvent, "event");
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            m34536v(motionEvent);
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
            m34537x(motionEvent);
            m34538y(motionEvent);
            return;
        } else if (motionEvent.getActionMasked() != 2) {
            return;
        }
        m34537x(motionEvent);
    }

    /* renamed from: H */
    public final float mo25420H() {
        return this.f27339y - ((float) this.f27321g[1]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r3.f27324j;
     */
    /* renamed from: H0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo25421H0() {
        /*
            r3 = this;
            boolean r0 = r3.f27328n
            r1 = 1
            if (r0 == 0) goto L_0x0014
            int r0 = r3.f27324j
            if (r0 == r1) goto L_0x0014
            r2 = 3
            if (r0 == r2) goto L_0x0014
            r2 = 5
            if (r0 == r2) goto L_0x0014
            int r0 = r3.f27320f
            if (r0 <= 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p446g.p448b.C10200h.mo25421H0():boolean");
    }

    /* renamed from: I */
    public final float mo25422I() {
        return this.f27338x - this.f27308A;
    }

    /* renamed from: J */
    public final float mo25423J() {
        return this.f27339y - this.f27309B;
    }

    /* renamed from: K */
    public final boolean mo25424K() {
        return this.f27335u;
    }

    /* renamed from: L */
    public final int mo25425L() {
        return this.f27311D;
    }

    /* renamed from: M */
    public final boolean mo25426M() {
        return this.f27318K;
    }

    /* renamed from: N */
    public final int mo25427N() {
        return this.f27324j;
    }

    /* renamed from: O */
    public final int mo25428O() {
        return this.f27322h;
    }

    /* renamed from: P */
    public final int mo25429P() {
        return this.f27332r;
    }

    /* renamed from: Q */
    public final int mo25430Q() {
        return this.f27333s;
    }

    /* renamed from: R */
    public final View mo25431R() {
        return this.f27323i;
    }

    /* renamed from: T */
    public final void mo25432T(MotionEvent motionEvent) {
        int i;
        C10457l.m35320e(motionEvent, "origEvent");
        if (this.f27328n && (i = this.f27324j) != 3 && i != 1 && i != 5 && this.f27320f >= 1) {
            try {
                MotionEvent k = m34530k(motionEvent);
                this.f27325k = k.getX();
                this.f27326l = k.getY();
                this.f27311D = k.getPointerCount();
                boolean Z = mo25438Z(this.f27323i, this.f27325k, this.f27326l);
                this.f27327m = Z;
                if (!this.f27310C || Z) {
                    C10209l lVar = C10209l.f27367a;
                    this.f27338x = lVar.mo25482a(k, true);
                    this.f27339y = lVar.mo25483b(k, true);
                    this.f27308A = k.getRawX() - k.getX();
                    this.f27309B = k.getRawY() - k.getY();
                    mo24742e0(k);
                    if (!C10457l.m35316a(k, motionEvent)) {
                        k.recycle();
                        return;
                    }
                    return;
                }
                int i2 = this.f27324j;
                if (i2 == 4) {
                    mo25448o();
                } else if (i2 == 2) {
                    mo25409B();
                }
            } catch (C10201a unused) {
                mo25409B();
            }
        }
    }

    /* renamed from: U */
    public final boolean mo25433U(C10200h<?> hVar) {
        C10457l.m35320e(hVar, "other");
        int length = this.f27319e.length - 1;
        if (length >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (this.f27319e[i] != -1 && hVar.f27319e[i] != -1) {
                    return true;
                }
                if (i2 > length) {
                    break;
                }
                i = i2;
            }
        }
        return false;
    }

    /* renamed from: V */
    public final boolean mo25434V() {
        return this.f27316I;
    }

    /* renamed from: W */
    public final boolean mo25435W() {
        return this.f27317J;
    }

    /* renamed from: X */
    public final boolean mo25436X() {
        return this.f27328n;
    }

    /* renamed from: Y */
    public final boolean mo25437Y() {
        return this.f27327m;
    }

    /* renamed from: Z */
    public final boolean mo25438Z(View view, float f, float f2) {
        float f3;
        C10457l.m35317b(view);
        float width = (float) view.getWidth();
        float height = (float) view.getHeight();
        float[] fArr = this.f27336v;
        float f4 = 0.0f;
        if (fArr != null) {
            C10457l.m35317b(fArr);
            float f5 = fArr[0];
            float[] fArr2 = this.f27336v;
            C10457l.m35317b(fArr2);
            float f6 = fArr2[1];
            float[] fArr3 = this.f27336v;
            C10457l.m35317b(fArr3);
            float f7 = fArr3[2];
            float[] fArr4 = this.f27336v;
            C10457l.m35317b(fArr4);
            float f8 = fArr4[3];
            C10202b bVar = f27304a;
            float f9 = bVar.m34604c(f5) ? 0.0f - f5 : 0.0f;
            if (bVar.m34604c(f6)) {
                f4 = 0.0f - f6;
            }
            if (bVar.m34604c(f7)) {
                width += f7;
            }
            if (bVar.m34604c(f8)) {
                height += f8;
            }
            float[] fArr5 = this.f27336v;
            C10457l.m35317b(fArr5);
            float f10 = fArr5[4];
            float[] fArr6 = this.f27336v;
            C10457l.m35317b(fArr6);
            float f11 = fArr6[5];
            if (bVar.m34604c(f10)) {
                if (!bVar.m34604c(f5)) {
                    f9 = width - f10;
                } else if (!bVar.m34604c(f7)) {
                    width = f10 + f9;
                }
            }
            if (bVar.m34604c(f11)) {
                if (!bVar.m34604c(f6)) {
                    f4 = height - f11;
                } else if (!bVar.m34604c(f8)) {
                    height = f4 + f11;
                }
            }
            f3 = f4;
            f4 = f9;
        } else {
            f3 = 0.0f;
        }
        if (f4 <= f && f <= width) {
            if (f3 <= f2 && f2 <= height) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public void mo24741d0() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public void mo24742e0(MotionEvent motionEvent) {
        C10457l.m35320e(motionEvent, "event");
        m34522b0(1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f0 */
    public void mo25405f0() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g0 */
    public void mo25439g0(int i, int i2) {
    }

    /* renamed from: h0 */
    public final void mo25440h0(View view, C10205j jVar) {
        if (this.f27323i == null && this.f27312E == null) {
            Arrays.fill(this.f27319e, -1);
            this.f27320f = 0;
            this.f27324j = 0;
            this.f27323i = view;
            this.f27312E = jVar;
            View view2 = null;
            Window S = m34518S(view == null ? null : view.getContext());
            if (S != null) {
                view2 = S.getDecorView();
            }
            if (view2 != null) {
                Rect rect = new Rect();
                view2.getWindowVisibleDisplayFrame(rect);
                int[] iArr = this.f27321g;
                iArr[0] = rect.left;
                iArr[1] = rect.top;
                return;
            }
            int[] iArr2 = this.f27321g;
            iArr2[0] = 0;
            iArr2[1] = 0;
            return;
        }
        throw new IllegalStateException("Already prepared or hasn't been reset".toString());
    }

    /* renamed from: i */
    public final void mo25441i() {
        mo25406j(false);
    }

    /* renamed from: i0 */
    public final void mo25442i0() {
        this.f27323i = null;
        this.f27312E = null;
        Arrays.fill(this.f27319e, -1);
        this.f27320f = 0;
        this.f27333s = 0;
        C10341g.m35075k(this.f27334t, (Object) null, 0, 0, 6, (Object) null);
        this.f27332r = 0;
        mo25405f0();
    }

    /* renamed from: j */
    public void mo25406j(boolean z) {
        if (!this.f27340z || z) {
            int i = this.f27324j;
            if (i == 0 || i == 2) {
                m34522b0(4);
            }
        }
    }

    /* renamed from: j0 */
    public void mo25407j0() {
        this.f27335u = false;
        this.f27340z = false;
        this.f27310C = false;
        this.f27328n = true;
        this.f27336v = null;
    }

    /* renamed from: k0 */
    public void mo25443k0() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l0 */
    public final ConcreteGestureHandlerT mo25444l0() {
        return this;
    }

    /* renamed from: m0 */
    public final void mo25445m0(int i) {
        this.f27329o = i;
    }

    /* renamed from: n */
    public final void mo25446n() {
        if (this.f27324j == 0) {
            m34522b0(2);
        }
    }

    /* renamed from: n0 */
    public final void mo25447n0(int i) {
        this.f27315H = i;
    }

    /* renamed from: o */
    public final void mo25448o() {
        int i = this.f27324j;
        if (i == 4 || i == 0 || i == 2) {
            mo24741d0();
            m34522b0(3);
        }
    }

    /* renamed from: o0 */
    public final void mo25449o0(boolean z) {
        this.f27316I = z;
    }

    /* renamed from: p0 */
    public final void mo25450p0(boolean z) {
        this.f27317J = z;
    }

    /* renamed from: q */
    public final WritableArray mo25451q() {
        WritableArray writableArray = this.f27331q;
        this.f27331q = null;
        return writableArray;
    }

    /* renamed from: q0 */
    public final ConcreteGestureHandlerT mo25452q0(boolean z) {
        ConcreteGestureHandlerT f = mo25444l0();
        if (!(f.mo25431R() == null || f.mo25436X() == z)) {
            UiThreadUtil.runOnUiThread(new C10193b(f));
        }
        f.f27328n = z;
        return f;
    }

    /* renamed from: r */
    public final WritableArray mo25453r() {
        WritableArray writableArray = this.f27330p;
        this.f27330p = null;
        return writableArray;
    }

    /* renamed from: s0 */
    public final ConcreteGestureHandlerT mo25454s0(float f, float f2, float f3, float f4, float f5, float f6) {
        ConcreteGestureHandlerT f7 = mo25444l0();
        if (f7.f27336v == null) {
            f7.f27336v = new float[6];
        }
        float[] fArr = f7.f27336v;
        C10457l.m35317b(fArr);
        boolean z = false;
        fArr[0] = f;
        float[] fArr2 = f7.f27336v;
        C10457l.m35317b(fArr2);
        fArr2[1] = f2;
        float[] fArr3 = f7.f27336v;
        C10457l.m35317b(fArr3);
        fArr3[2] = f3;
        float[] fArr4 = f7.f27336v;
        C10457l.m35317b(fArr4);
        fArr4[3] = f4;
        float[] fArr5 = f7.f27336v;
        C10457l.m35317b(fArr5);
        fArr5[4] = f5;
        float[] fArr6 = f7.f27336v;
        C10457l.m35317b(fArr6);
        fArr6[5] = f6;
        C10202b bVar = f27304a;
        if (!bVar.m34604c(f5) || !bVar.m34604c(f) || !bVar.m34604c(f3)) {
            if (!bVar.m34604c(f5) || bVar.m34604c(f) || bVar.m34604c(f3)) {
                if (!bVar.m34604c(f6) || !bVar.m34604c(f4) || !bVar.m34604c(f2)) {
                    if (!bVar.m34604c(f6) || bVar.m34604c(f4) || bVar.m34604c(f2)) {
                        z = true;
                    }
                    if (z) {
                        return f7;
                    }
                    throw new IllegalArgumentException("When height is set one of top or bottom pads need to be defined".toString());
                }
                throw new IllegalArgumentException("Cannot have all of top, bottom and height defined".toString());
            }
            throw new IllegalArgumentException("When width is set one of left or right pads need to be defined".toString());
        }
        throw new IllegalArgumentException("Cannot have all of left, right and width defined".toString());
    }

    /* renamed from: t */
    public void mo25455t(MotionEvent motionEvent) {
        C10457l.m35320e(motionEvent, "event");
        C10216p pVar = this.f27313F;
        if (pVar != null) {
            pVar.mo24715c(mo25444l0(), motionEvent);
        }
    }

    /* renamed from: t0 */
    public final ConcreteGestureHandlerT mo25456t0(C10204i iVar) {
        ConcreteGestureHandlerT f = mo25444l0();
        f.f27314G = iVar;
        return f;
    }

    public String toString() {
        String str;
        View view = this.f27323i;
        if (view == null) {
            str = null;
        } else {
            C10457l.m35317b(view);
            str = view.getClass().getSimpleName();
        }
        return getClass().getSimpleName() + "@[" + this.f27322h + "]:" + str;
    }

    /* renamed from: u */
    public void mo25458u(int i, int i2) {
        C10216p pVar = this.f27313F;
        if (pVar != null) {
            pVar.mo24714b(mo25444l0(), i, i2);
        }
    }

    /* renamed from: u0 */
    public final ConcreteGestureHandlerT mo25459u0(boolean z) {
        ConcreteGestureHandlerT f = mo25444l0();
        f.f27340z = z;
        return f;
    }

    /* renamed from: v0 */
    public final void mo25460v0(boolean z) {
        this.f27335u = z;
    }

    /* renamed from: w */
    public void mo25461w() {
        C10216p pVar;
        if (this.f27330p != null && (pVar = this.f27313F) != null) {
            pVar.mo24713a(mo25444l0());
        }
    }

    /* renamed from: w0 */
    public final C10200h<?> mo25462w0(C10216p pVar) {
        this.f27313F = pVar;
        return this;
    }

    /* renamed from: x0 */
    public final ConcreteGestureHandlerT mo25463x0(boolean z) {
        ConcreteGestureHandlerT f = mo25444l0();
        f.f27310C = z;
        return f;
    }

    /* renamed from: y0 */
    public final void mo25464y0(boolean z) {
        this.f27318K = z;
    }

    /* renamed from: z */
    public final void mo25465z() {
        int i = this.f27324j;
        if (i == 2 || i == 4) {
            m34522b0(5);
        }
    }

    /* renamed from: z0 */
    public final void mo25466z0(int i) {
        this.f27322h = i;
    }
}
