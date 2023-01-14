package com.facebook.react.views.text;

import android.annotation.TargetApi;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextPaint;
import com.facebook.react.uimanager.C2931d0;
import com.facebook.react.uimanager.C3029o;
import com.facebook.react.uimanager.C3061z0;
import com.facebook.react.uimanager.p120j1.C2991a;
import com.facebook.yoga.C3302b;
import com.facebook.yoga.C3308h;
import com.facebook.yoga.C3313m;
import com.facebook.yoga.C3314n;
import com.facebook.yoga.C3316p;
import java.util.ArrayList;
import java.util.Map;
import p174e.p247e.p315l.p316a.C6409a;

@TargetApi(23)
/* renamed from: com.facebook.react.views.text.q */
public class C3193q extends C3181h {
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public static final TextPaint f8945a0 = new TextPaint(1);
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public Spannable f8946b0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public boolean f8947c0;

    /* renamed from: d0 */
    private final C3313m f8948d0;

    /* renamed from: e0 */
    private final C3302b f8949e0;

    /* renamed from: com.facebook.react.views.text.q$a */
    class C3194a implements C3313m {
        C3194a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:47:0x014a, code lost:
            if (r2 > r21) goto L_0x014c;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo10055c(com.facebook.yoga.C3316p r18, float r19, com.facebook.yoga.C3314n r20, float r21, com.facebook.yoga.C3314n r22) {
            /*
                r17 = this;
                r0 = r17
                r1 = r19
                r2 = r20
                r3 = r22
                com.facebook.react.views.text.q r4 = com.facebook.react.views.text.C3193q.this
                android.text.Spannable r4 = r4.f8946b0
                java.lang.String r5 = "Spannable element has not been prepared in onBeforeLayout"
                java.lang.Object r4 = p174e.p247e.p315l.p316a.C6409a.m24522d(r4, r5)
                android.text.Spannable r4 = (android.text.Spannable) r4
                com.facebook.react.views.text.q r5 = com.facebook.react.views.text.C3193q.this
                android.text.Layout r5 = r5.m12491y1(r4, r1, r2)
                com.facebook.react.views.text.q r6 = com.facebook.react.views.text.C3193q.this
                boolean r7 = r6.f8924S
                r8 = -1
                r9 = 0
                if (r7 == 0) goto L_0x00b5
                com.facebook.react.views.text.z r6 = r6.f8907B
                int r6 = r6.mo10420c()
                com.facebook.react.views.text.q r7 = com.facebook.react.views.text.C3193q.this
                com.facebook.react.views.text.z r7 = r7.f8907B
                int r7 = r7.mo10420c()
                com.facebook.react.views.text.q r10 = com.facebook.react.views.text.C3193q.this
                float r10 = r10.f8925T
                float r6 = (float) r6
                float r10 = r10 * r6
                r11 = 1082130432(0x40800000, float:4.0)
                float r11 = com.facebook.react.uimanager.C3038r.m12006c(r11)
                float r10 = java.lang.Math.max(r10, r11)
                int r10 = (int) r10
            L_0x0044:
                if (r7 <= r10) goto L_0x00b5
                com.facebook.react.views.text.q r11 = com.facebook.react.views.text.C3193q.this
                int r11 = r11.f8912G
                if (r11 == r8) goto L_0x0056
                int r11 = r5.getLineCount()
                com.facebook.react.views.text.q r12 = com.facebook.react.views.text.C3193q.this
                int r12 = r12.f8912G
                if (r11 > r12) goto L_0x0063
            L_0x0056:
                com.facebook.yoga.n r11 = com.facebook.yoga.C3314n.UNDEFINED
                if (r3 == r11) goto L_0x00b5
                int r11 = r5.getHeight()
                float r11 = (float) r11
                int r11 = (r11 > r21 ? 1 : (r11 == r21 ? 0 : -1))
                if (r11 <= 0) goto L_0x00b5
            L_0x0063:
                r5 = 1065353216(0x3f800000, float:1.0)
                float r5 = com.facebook.react.uimanager.C3038r.m12006c(r5)
                int r5 = (int) r5
                int r7 = r7 - r5
                float r5 = (float) r7
                float r5 = r5 / r6
                int r11 = r4.length()
                java.lang.Class<com.facebook.react.views.text.f> r12 = com.facebook.react.views.text.C3176f.class
                java.lang.Object[] r11 = r4.getSpans(r9, r11, r12)
                com.facebook.react.views.text.f[] r11 = (com.facebook.react.views.text.C3176f[]) r11
                int r12 = r11.length
                r13 = 0
            L_0x007b:
                if (r13 >= r12) goto L_0x00ac
                r14 = r11[r13]
                com.facebook.react.views.text.f r15 = new com.facebook.react.views.text.f
                int r9 = r14.getSize()
                float r9 = (float) r9
                float r9 = r9 * r5
                float r8 = (float) r10
                float r8 = java.lang.Math.max(r9, r8)
                int r8 = (int) r8
                r15.<init>(r8)
                int r8 = r4.getSpanStart(r14)
                int r9 = r4.getSpanEnd(r14)
                r16 = r5
                int r5 = r4.getSpanFlags(r14)
                r4.setSpan(r15, r8, r9, r5)
                r4.removeSpan(r14)
                int r13 = r13 + 1
                r5 = r16
                r8 = -1
                r9 = 0
                goto L_0x007b
            L_0x00ac:
                com.facebook.react.views.text.q r5 = com.facebook.react.views.text.C3193q.this
                android.text.Layout r5 = r5.m12491y1(r4, r1, r2)
                r8 = -1
                r9 = 0
                goto L_0x0044
            L_0x00b5:
                com.facebook.react.views.text.q r6 = com.facebook.react.views.text.C3193q.this
                boolean r6 = r6.f8947c0
                if (r6 == 0) goto L_0x00fa
                com.facebook.react.views.text.q r6 = com.facebook.react.views.text.C3193q.this
                com.facebook.react.uimanager.o0 r6 = r6.mo9506I()
                android.text.TextPaint r7 = com.facebook.react.views.text.C3193q.f8945a0
                com.facebook.react.bridge.WritableArray r4 = com.facebook.react.views.text.C3173e.m12452a(r4, r5, r7, r6)
                com.facebook.react.bridge.WritableMap r7 = com.facebook.react.bridge.Arguments.createMap()
                java.lang.String r8 = "lines"
                r7.putArray(r8, r4)
                boolean r4 = r6.hasActiveReactInstance()
                if (r4 == 0) goto L_0x00ee
                java.lang.Class<com.facebook.react.uimanager.events.RCTEventEmitter> r4 = com.facebook.react.uimanager.events.RCTEventEmitter.class
                com.facebook.react.bridge.JavaScriptModule r4 = r6.getJSModule(r4)
                com.facebook.react.uimanager.events.RCTEventEmitter r4 = (com.facebook.react.uimanager.events.RCTEventEmitter) r4
                com.facebook.react.views.text.q r6 = com.facebook.react.views.text.C3193q.this
                int r6 = r6.mo9548t()
                java.lang.String r8 = "topTextLayout"
                r4.receiveEvent(r6, r8, r7)
                goto L_0x00fa
            L_0x00ee:
                com.facebook.react.bridge.ReactNoCrashSoftException r4 = new com.facebook.react.bridge.ReactNoCrashSoftException
                java.lang.String r6 = "Cannot get RCTEventEmitter, no CatalystInstance"
                r4.<init>((java.lang.String) r6)
                java.lang.String r6 = "ReactTextShadowNode"
                com.facebook.react.bridge.ReactSoftExceptionLogger.logSoftException(r6, r4)
            L_0x00fa:
                com.facebook.react.views.text.q r4 = com.facebook.react.views.text.C3193q.this
                int r4 = r4.f8912G
                r6 = -1
                if (r4 != r6) goto L_0x0106
                int r4 = r5.getLineCount()
                goto L_0x010e
            L_0x0106:
                int r6 = r5.getLineCount()
                int r4 = java.lang.Math.min(r4, r6)
            L_0x010e:
                r6 = 0
                com.facebook.yoga.n r7 = com.facebook.yoga.C3314n.EXACTLY
                if (r2 != r7) goto L_0x0114
                goto L_0x012d
            L_0x0114:
                r9 = 0
            L_0x0115:
                if (r9 >= r4) goto L_0x0123
                float r7 = r5.getLineWidth(r9)
                int r8 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
                if (r8 <= 0) goto L_0x0120
                r6 = r7
            L_0x0120:
                int r9 = r9 + 1
                goto L_0x0115
            L_0x0123:
                com.facebook.yoga.n r7 = com.facebook.yoga.C3314n.AT_MOST
                if (r2 != r7) goto L_0x012c
                int r2 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r2 <= 0) goto L_0x012c
                goto L_0x012d
            L_0x012c:
                r1 = r6
            L_0x012d:
                int r2 = android.os.Build.VERSION.SDK_INT
                r6 = 29
                if (r2 <= r6) goto L_0x0139
                double r1 = (double) r1
                double r1 = java.lang.Math.ceil(r1)
                float r1 = (float) r1
            L_0x0139:
                com.facebook.yoga.n r2 = com.facebook.yoga.C3314n.EXACTLY
                if (r3 == r2) goto L_0x014c
                int r4 = r4 + -1
                int r2 = r5.getLineBottom(r4)
                float r2 = (float) r2
                com.facebook.yoga.n r4 = com.facebook.yoga.C3314n.AT_MOST
                if (r3 != r4) goto L_0x014e
                int r3 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
                if (r3 <= 0) goto L_0x014e
            L_0x014c:
                r2 = r21
            L_0x014e:
                long r1 = com.facebook.yoga.C3315o.m12981a(r1, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.C3193q.C3194a.mo10055c(com.facebook.yoga.p, float, com.facebook.yoga.n, float, com.facebook.yoga.n):long");
        }
    }

    /* renamed from: com.facebook.react.views.text.q$b */
    class C3195b implements C3302b {
        C3195b() {
        }

        /* renamed from: a */
        public float mo10375a(C3316p pVar, float f, float f2) {
            Layout t1 = C3193q.this.m12491y1((Spannable) C6409a.m24522d(C3193q.this.f8946b0, "Spannable element has not been prepared in onBeforeLayout"), f, C3314n.EXACTLY);
            return (float) t1.getLineBaseline(t1.getLineCount() - 1);
        }
    }

    public C3193q() {
        this((C3199t) null);
    }

    public C3193q(C3199t tVar) {
        super(tVar);
        this.f8948d0 = new C3194a();
        this.f8949e0 = new C3195b();
        m12490x1();
    }

    /* renamed from: w1 */
    private int m12489w1() {
        int i = this.f8913H;
        if (mo9593g0() != C3308h.RTL) {
            return i;
        }
        if (i == 5) {
            return 3;
        }
        if (i == 3) {
            return 5;
        }
        return i;
    }

    /* renamed from: x1 */
    private void m12490x1() {
        if (!mo9551w()) {
            mo9577T0(this.f8948d0);
            mo9563F0(this.f8949e0);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009b, code lost:
        if (r14 >= 28) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f5, code lost:
        if (r14 >= 28) goto L_0x00f7;
     */
    /* renamed from: y1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.text.Layout m12491y1(android.text.Spannable r12, float r13, com.facebook.yoga.C3314n r14) {
        /*
            r11 = this;
            android.text.TextPaint r2 = f8945a0
            com.facebook.react.views.text.z r0 = r11.f8907B
            int r0 = r0.mo10420c()
            float r0 = (float) r0
            r2.setTextSize(r0)
            android.text.BoringLayout$Metrics r6 = android.text.BoringLayout.isBoring(r12, r2)
            if (r6 != 0) goto L_0x0017
            float r0 = android.text.Layout.getDesiredWidth(r12, r2)
            goto L_0x0019
        L_0x0017:
            r0 = 2143289344(0x7fc00000, float:NaN)
        L_0x0019:
            com.facebook.yoga.n r1 = com.facebook.yoga.C3314n.UNDEFINED
            r3 = 0
            r4 = 0
            r5 = 1
            if (r14 == r1) goto L_0x0027
            int r14 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r14 >= 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r14 = 0
            goto L_0x0028
        L_0x0027:
            r14 = 1
        L_0x0028:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            int r7 = r11.m12489w1()
            if (r7 == r5) goto L_0x003e
            r8 = 3
            if (r7 == r8) goto L_0x003b
            r8 = 5
            if (r7 == r8) goto L_0x0038
        L_0x0036:
            r7 = r1
            goto L_0x0041
        L_0x0038:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x0036
        L_0x003b:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x0036
        L_0x003e:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x0036
        L_0x0041:
            r1 = 28
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 23
            if (r6 != 0) goto L_0x009e
            if (r14 != 0) goto L_0x0055
            boolean r10 = com.facebook.yoga.C3307g.m12971a(r0)
            if (r10 != 0) goto L_0x009e
            int r10 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r10 > 0) goto L_0x009e
        L_0x0055:
            double r13 = (double) r0
            double r13 = java.lang.Math.ceil(r13)
            int r13 = (int) r13
            int r14 = android.os.Build.VERSION.SDK_INT
            if (r14 >= r9) goto L_0x0070
            android.text.StaticLayout r14 = new android.text.StaticLayout
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            boolean r8 = r11.f8923R
            r0 = r14
            r1 = r12
            r3 = r13
            r4 = r7
            r7 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x00fe
        L_0x0070:
            int r0 = r12.length()
            android.text.StaticLayout$Builder r12 = android.text.StaticLayout.Builder.obtain(r12, r4, r0, r2, r13)
            android.text.StaticLayout$Builder r12 = r12.setAlignment(r7)
            android.text.StaticLayout$Builder r12 = r12.setLineSpacing(r3, r8)
            boolean r13 = r11.f8923R
            android.text.StaticLayout$Builder r12 = r12.setIncludePad(r13)
            int r13 = r11.f8914I
            android.text.StaticLayout$Builder r12 = r12.setBreakStrategy(r13)
            int r13 = r11.f8915J
            android.text.StaticLayout$Builder r12 = r12.setHyphenationFrequency(r13)
            r13 = 26
            if (r14 < r13) goto L_0x009b
            int r13 = r11.f8916K
            r12.setJustificationMode(r13)
        L_0x009b:
            if (r14 < r1) goto L_0x00fa
            goto L_0x00f7
        L_0x009e:
            if (r6 == 0) goto L_0x00be
            if (r14 != 0) goto L_0x00a9
            int r14 = r6.width
            float r14 = (float) r14
            int r14 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r14 > 0) goto L_0x00be
        L_0x00a9:
            int r13 = r6.width
            int r13 = java.lang.Math.max(r13, r4)
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            boolean r14 = r11.f8923R
            r0 = r12
            r1 = r2
            r2 = r13
            r3 = r7
            r7 = r14
            android.text.BoringLayout r14 = android.text.BoringLayout.make(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x00fe
        L_0x00be:
            int r14 = android.os.Build.VERSION.SDK_INT
            if (r14 >= r9) goto L_0x00d2
            android.text.StaticLayout r14 = new android.text.StaticLayout
            int r3 = (int) r13
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            boolean r13 = r11.f8923R
            r0 = r14
            r1 = r12
            r4 = r7
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x00fe
        L_0x00d2:
            int r0 = r12.length()
            int r13 = (int) r13
            android.text.StaticLayout$Builder r12 = android.text.StaticLayout.Builder.obtain(r12, r4, r0, r2, r13)
            android.text.StaticLayout$Builder r12 = r12.setAlignment(r7)
            android.text.StaticLayout$Builder r12 = r12.setLineSpacing(r3, r8)
            boolean r13 = r11.f8923R
            android.text.StaticLayout$Builder r12 = r12.setIncludePad(r13)
            int r13 = r11.f8914I
            android.text.StaticLayout$Builder r12 = r12.setBreakStrategy(r13)
            int r13 = r11.f8915J
            android.text.StaticLayout$Builder r12 = r12.setHyphenationFrequency(r13)
            if (r14 < r1) goto L_0x00fa
        L_0x00f7:
            r12.setUseLineSpacingFromFallbacks(r5)
        L_0x00fa:
            android.text.StaticLayout r14 = r12.build()
        L_0x00fe:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.C3193q.m12491y1(android.text.Spannable, float, com.facebook.yoga.n):android.text.Layout");
    }

    /* renamed from: W */
    public void mo9520W(C3029o oVar) {
        this.f8946b0 = mo10341r1(this, (String) null, true, oVar);
        mo9621x0();
    }

    /* renamed from: o0 */
    public boolean mo9607o0() {
        return true;
    }

    /* renamed from: q */
    public Iterable<? extends C2931d0> mo9545q() {
        Map<Integer, C2931d0> map = this.f8931Z;
        if (map == null || map.isEmpty()) {
            return null;
        }
        Spanned spanned = (Spanned) C6409a.m24522d(this.f8946b0, "Spannable element has not been prepared in onBeforeLayout");
        C3166b0[] b0VarArr = (C3166b0[]) spanned.getSpans(0, spanned.length(), C3166b0.class);
        ArrayList arrayList = new ArrayList(b0VarArr.length);
        for (C3166b0 b : b0VarArr) {
            C2931d0 d0Var = this.f8931Z.get(Integer.valueOf(b.mo10320b()));
            d0Var.mo9550v();
            arrayList.add(d0Var);
        }
        return arrayList;
    }

    @C2991a(name = "onTextLayout")
    public void setShouldNotifyOnTextLayout(boolean z) {
        this.f8947c0 = z;
    }

    /* renamed from: u0 */
    public boolean mo9618u0() {
        return false;
    }

    /* renamed from: x0 */
    public void mo9621x0() {
        super.mo9621x0();
        super.mo9539k();
    }

    /* renamed from: z0 */
    public void mo9623z0(C3061z0 z0Var) {
        super.mo9623z0(z0Var);
        Spannable spannable = this.f8946b0;
        if (spannable != null) {
            z0Var.mo9890R(mo9548t(), new C3196r(spannable, -1, this.f8930Y, mo9601k0(4), mo9601k0(1), mo9601k0(5), mo9601k0(3), m12489w1(), this.f8914I, this.f8916K));
        }
    }
}
