package com.lwansbrough.RCTCamera;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.List;

/* renamed from: com.lwansbrough.RCTCamera.d */
public class C5111d extends ViewGroup {

    /* renamed from: f */
    private final OrientationEventListener f14482f;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final Context f14483o;

    /* renamed from: p */
    private C5113e f14484p = null;

    /* renamed from: q */
    private int f14485q = -1;

    /* renamed from: r */
    private int f14486r = 1;

    /* renamed from: s */
    private int f14487s = 0;

    /* renamed from: t */
    private String f14488t = RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_HIGH;

    /* renamed from: u */
    private int f14489u = -1;

    /* renamed from: v */
    private int f14490v = -1;

    /* renamed from: w */
    private int f14491w = 0;

    /* renamed from: x */
    private boolean f14492x = false;

    /* renamed from: com.lwansbrough.RCTCamera.d$a */
    class C5112a extends OrientationEventListener {
        C5112a(Context context, int i) {
            super(context, i);
        }

        public void onOrientationChanged(int i) {
            C5111d dVar = C5111d.this;
            if (dVar.m19304g(dVar.f14483o)) {
                C5111d.this.m19302e();
            }
        }
    }

    public C5111d(Context context) {
        super(context);
        this.f14483o = context;
        C5107b.m19268d(m19301d(context));
        C5112a aVar = new C5112a(context, 3);
        this.f14482f = aVar;
        if (aVar.canDetectOrientation()) {
            aVar.enable();
        } else {
            aVar.disable();
        }
    }

    /* renamed from: d */
    private int m19301d(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getOrientation();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m19302e() {
        m19303f(getLeft(), getTop(), getRight(), getBottom());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r0 > r2) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r0 < r2) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r9 = (int) (r2 / r8);
        r8 = (int) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        r8 = (int) r0;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m19303f(int r6, int r7, int r8, int r9) {
        /*
            r5 = this;
            com.lwansbrough.RCTCamera.e r0 = r5.f14484p
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r8 = r8 - r6
            float r6 = (float) r8
            int r9 = r9 - r7
            float r7 = (float) r9
            int r8 = r5.f14486r
            if (r8 == 0) goto L_0x0020
            r9 = 1
            if (r8 == r9) goto L_0x0013
            int r8 = (int) r6
        L_0x0011:
            int r9 = (int) r7
            goto L_0x0032
        L_0x0013:
            double r8 = r0.mo15622f()
            double r0 = (double) r7
            double r0 = r0 * r8
            double r2 = (double) r6
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0030
            goto L_0x002c
        L_0x0020:
            double r8 = r0.mo15622f()
            double r0 = (double) r7
            double r0 = r0 * r8
            double r2 = (double) r6
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0030
        L_0x002c:
            double r2 = r2 / r8
            int r9 = (int) r2
            int r8 = (int) r6
            goto L_0x0032
        L_0x0030:
            int r8 = (int) r0
            goto L_0x0011
        L_0x0032:
            float r0 = (float) r8
            float r0 = r6 - r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            int r0 = (int) r0
            float r2 = (float) r9
            float r2 = r7 - r2
            float r2 = r2 / r1
            int r1 = (int) r2
            com.lwansbrough.RCTCamera.b r2 = com.lwansbrough.RCTCamera.C5107b.m19270h()
            com.lwansbrough.RCTCamera.e r3 = r5.f14484p
            int r3 = r3.mo15621d()
            int r6 = (int) r6
            int r7 = (int) r7
            r2.mo15580A(r3, r6, r7)
            com.lwansbrough.RCTCamera.e r6 = r5.f14484p
            int r8 = r8 + r0
            int r9 = r9 + r1
            r6.layout(r0, r1, r8, r9)
            int r6 = r5.getLeft()
            int r7 = r5.getTop()
            int r8 = r5.getRight()
            int r9 = r5.getBottom()
            r5.postInvalidate(r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lwansbrough.RCTCamera.C5111d.m19303f(int, int, int, int):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m19304g(Context context) {
        int d = m19301d(context);
        if (this.f14485q == d) {
            return false;
        }
        this.f14485q = d;
        C5107b.m19270h().mo15596r(this.f14485q);
        return true;
    }

    /* renamed from: h */
    public void mo15605h() {
        C5113e eVar = this.f14484p;
        if (eVar != null) {
            eVar.mo15637s();
        }
    }

    /* renamed from: i */
    public void mo15606i() {
        C5113e eVar = this.f14484p;
        if (eVar != null) {
            eVar.mo15638u();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        m19303f(i, i2, i3, i4);
    }

    public void onViewAdded(View view) {
        C5113e eVar = this.f14484p;
        if (eVar != view) {
            removeView(eVar);
            addView(this.f14484p, 0);
        }
    }

    public void setAspect(int i) {
        this.f14486r = i;
        m19302e();
    }

    public void setBarCodeTypes(List<String> list) {
        C5107b.m19270h().mo15598t(list);
    }

    public void setBarcodeScannerEnabled(boolean z) {
        C5107b.m19270h().mo15599u(z);
    }

    public void setCameraType(int i) {
        C5113e eVar = this.f14484p;
        if (eVar != null) {
            eVar.mo15624k(i);
            C5107b.m19270h().mo15585c(i);
            return;
        }
        C5113e eVar2 = new C5113e(this.f14483o, i);
        this.f14484p = eVar2;
        int i2 = this.f14490v;
        if (-1 != i2) {
            eVar2.mo15628o(i2);
        }
        int i3 = this.f14489u;
        if (-1 != i3) {
            this.f14484p.mo15635p(i3);
        }
        int i4 = this.f14491w;
        if (i4 != 0) {
            this.f14484p.mo15636q(i4);
        }
        this.f14484p.mo15627n(this.f14492x);
        addView(this.f14484p);
    }

    public void setCaptureMode(int i) {
        this.f14487s = i;
        C5113e eVar = this.f14484p;
        if (eVar != null) {
            eVar.mo15625l(i);
        }
    }

    public void setCaptureQuality(String str) {
        this.f14488t = str;
        C5113e eVar = this.f14484p;
        if (eVar != null) {
            eVar.mo15626m(str);
        }
    }

    public void setClearWindowBackground(boolean z) {
        this.f14492x = z;
        C5113e eVar = this.f14484p;
        if (eVar != null) {
            eVar.mo15627n(z);
        }
    }

    public void setFlashMode(int i) {
        this.f14490v = i;
        C5113e eVar = this.f14484p;
        if (eVar != null) {
            eVar.mo15628o(i);
        }
    }

    public void setOrientation(int i) {
        C5107b.m19270h().mo15604z(i);
        if (this.f14484p != null) {
            m19302e();
        }
    }

    public void setTorchMode(int i) {
        this.f14489u = i;
        C5113e eVar = this.f14484p;
        if (eVar != null) {
            eVar.mo15635p(i);
        }
    }

    public void setZoom(int i) {
        this.f14491w = i;
        C5113e eVar = this.f14484p;
        if (eVar != null) {
            eVar.mo15636q(i);
        }
    }
}
