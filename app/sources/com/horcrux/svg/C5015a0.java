package com.horcrux.svg;

import android.annotation.SuppressLint;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.p120j1.C2991a;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.a0 */
class C5015a0 extends C5017b0 {

    /* renamed from: W0 */
    private C5020c0 f13987W0;

    /* renamed from: X0 */
    private C5020c0 f13988X0;

    /* renamed from: Y0 */
    private C5020c0 f13989Y0;

    /* renamed from: Z0 */
    private C5020c0 f13990Z0;

    /* renamed from: a1 */
    private C5020c0 f13991a1;

    /* renamed from: b1 */
    private C5020c0 f13992b1;

    public C5015a0(ReactContext reactContext) {
        super(reactContext);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0087  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Path mo15183I(android.graphics.Canvas r20, android.graphics.Paint r21) {
        /*
            r19 = this;
            r0 = r19
            android.graphics.Path r9 = new android.graphics.Path
            r9.<init>()
            com.horcrux.svg.c0 r1 = r0.f13987W0
            double r1 = r0.mo15383N(r1)
            com.horcrux.svg.c0 r3 = r0.f13988X0
            double r3 = r0.mo15381L(r3)
            com.horcrux.svg.c0 r5 = r0.f13989Y0
            double r5 = r0.mo15383N(r5)
            com.horcrux.svg.c0 r7 = r0.f13990Z0
            double r7 = r0.mo15381L(r7)
            com.horcrux.svg.c0 r10 = r0.f13991a1
            if (r10 != 0) goto L_0x003d
            com.horcrux.svg.c0 r11 = r0.f13992b1
            if (r11 == 0) goto L_0x0028
            goto L_0x003d
        L_0x0028:
            float r10 = (float) r1
            float r11 = (float) r3
            double r1 = r1 + r5
            float r5 = (float) r1
            double r3 = r3 + r7
            float r6 = (float) r3
            android.graphics.Path$Direction r7 = android.graphics.Path.Direction.CW
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r5
            r5 = r6
            r6 = r7
            r1.addRect(r2, r3, r4, r5, r6)
            r9.close()
            goto L_0x0099
        L_0x003d:
            if (r10 != 0) goto L_0x0047
            com.horcrux.svg.c0 r10 = r0.f13992b1
            double r10 = r0.mo15381L(r10)
        L_0x0045:
            r12 = r10
            goto L_0x005a
        L_0x0047:
            com.horcrux.svg.c0 r11 = r0.f13992b1
            if (r11 != 0) goto L_0x0050
            double r10 = r0.mo15383N(r10)
            goto L_0x0045
        L_0x0050:
            double r10 = r0.mo15383N(r10)
            com.horcrux.svg.c0 r12 = r0.f13992b1
            double r12 = r0.mo15381L(r12)
        L_0x005a:
            r14 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r16 = r5 / r14
            int r18 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r18 <= 0) goto L_0x0064
            r10 = r16
        L_0x0064:
            double r14 = r7 / r14
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x006b
            r12 = r14
        L_0x006b:
            int r14 = android.os.Build.VERSION.SDK_INT
            r15 = 21
            if (r14 < r15) goto L_0x0087
            float r14 = (float) r1
            float r15 = (float) r3
            double r1 = r1 + r5
            float r5 = (float) r1
            double r3 = r3 + r7
            float r6 = (float) r3
            float r7 = (float) r10
            float r8 = (float) r12
            android.graphics.Path$Direction r10 = android.graphics.Path.Direction.CW
            r1 = r9
            r2 = r14
            r3 = r15
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r10
            r1.addRoundRect(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0099
        L_0x0087:
            android.graphics.RectF r14 = new android.graphics.RectF
            float r15 = (float) r1
            float r0 = (float) r3
            double r1 = r1 + r5
            float r1 = (float) r1
            double r3 = r3 + r7
            float r2 = (float) r3
            r14.<init>(r15, r0, r1, r2)
            float r0 = (float) r10
            float r1 = (float) r12
            android.graphics.Path$Direction r2 = android.graphics.Path.Direction.CW
            r9.addRoundRect(r14, r0, r1, r2)
        L_0x0099:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.C5015a0.mo15183I(android.graphics.Canvas, android.graphics.Paint):android.graphics.Path");
    }

    @C2991a(name = "height")
    public void setHeight(Dynamic dynamic) {
        this.f13990Z0 = C5020c0.m18971b(dynamic);
        invalidate();
    }

    @C2991a(name = "rx")
    public void setRx(Dynamic dynamic) {
        this.f13991a1 = C5020c0.m18971b(dynamic);
        invalidate();
    }

    @C2991a(name = "ry")
    public void setRy(Dynamic dynamic) {
        this.f13992b1 = C5020c0.m18971b(dynamic);
        invalidate();
    }

    @C2991a(name = "width")
    public void setWidth(Dynamic dynamic) {
        this.f13989Y0 = C5020c0.m18971b(dynamic);
        invalidate();
    }

    @C2991a(name = "x")
    public void setX(Dynamic dynamic) {
        this.f13987W0 = C5020c0.m18971b(dynamic);
        invalidate();
    }

    @C2991a(name = "y")
    public void setY(Dynamic dynamic) {
        this.f13988X0 = C5020c0.m18971b(dynamic);
        invalidate();
    }
}
