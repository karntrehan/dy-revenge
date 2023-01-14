package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.C2983h1;
import com.facebook.react.uimanager.C2987j;
import com.facebook.react.uimanager.C3029o;
import com.facebook.react.uimanager.C3038r;
import com.facebook.react.uimanager.p120j1.C2992b;
import java.util.EnumSet;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.th3rdwave.safeareacontext.p */
public final class C10119p extends C2987j {

    /* renamed from: A */
    private C10117n f26968A;

    /* renamed from: B */
    private final float[] f26969B;

    /* renamed from: C */
    private final float[] f26970C;

    /* renamed from: D */
    private boolean f26971D;

    public C10119p() {
        int[] iArr = C2983h1.f8307b;
        this.f26969B = new float[iArr.length];
        this.f26970C = new float[iArr.length];
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            this.f26969B[i] = Float.NaN;
            this.f26970C[i] = Float.NaN;
        }
    }

    /* renamed from: q1 */
    private final void m34231q1(C10118o oVar) {
        if (oVar == C10118o.PADDING) {
            super.mo9579V0(1, this.f26969B[1]);
            super.mo9579V0(2, this.f26969B[1]);
            super.mo9579V0(3, this.f26969B[3]);
            super.mo9579V0(0, this.f26969B[0]);
        } else {
            super.mo9574Q0(1, this.f26970C[1]);
            super.mo9574Q0(2, this.f26970C[1]);
            super.mo9574Q0(3, this.f26970C[3]);
            super.mo9574Q0(0, this.f26970C[0]);
        }
        mo9621x0();
    }

    /* renamed from: r1 */
    private final void m34232r1() {
        float f;
        float f2;
        float f3;
        C10117n nVar = this.f26968A;
        if (nVar != null) {
            C10118o c = nVar.mo25186c();
            C10118o oVar = C10118o.PADDING;
            float[] fArr = c == oVar ? this.f26969B : this.f26970C;
            float f4 = fArr[8];
            if (!Float.isNaN(f4)) {
                f3 = f4;
                f2 = f3;
                f = f2;
            } else {
                f4 = 0.0f;
                f3 = 0.0f;
                f2 = 0.0f;
                f = 0.0f;
            }
            float f5 = fArr[7];
            if (!Float.isNaN(f5)) {
                f4 = f5;
                f2 = f4;
            }
            float f6 = fArr[6];
            if (!Float.isNaN(f6)) {
                f3 = f6;
                f = f3;
            }
            float f7 = fArr[1];
            if (!Float.isNaN(f7)) {
                f4 = f7;
            }
            float f8 = fArr[2];
            if (!Float.isNaN(f8)) {
                f3 = f8;
            }
            float f9 = fArr[3];
            if (!Float.isNaN(f9)) {
                f2 = f9;
            }
            float f10 = fArr[0];
            if (!Float.isNaN(f10)) {
                f = f10;
            }
            float c2 = C3038r.m12006c(f4);
            float c3 = C3038r.m12006c(f3);
            float c4 = C3038r.m12006c(f2);
            float c5 = C3038r.m12006c(f);
            EnumSet<C10116m> a = nVar.mo25184a();
            C10107e b = nVar.mo25185b();
            float d = a.contains(C10116m.TOP) ? b.mo25165d() : 0.0f;
            float c6 = a.contains(C10116m.RIGHT) ? b.mo25164c() : 0.0f;
            float a2 = a.contains(C10116m.BOTTOM) ? b.mo25162a() : 0.0f;
            float b2 = a.contains(C10116m.LEFT) ? b.mo25163b() : 0.0f;
            if (nVar.mo25186c() == oVar) {
                super.mo9579V0(1, d + c2);
                super.mo9579V0(2, c6 + c3);
                super.mo9579V0(3, a2 + c4);
                super.mo9579V0(0, b2 + c5);
                return;
            }
            super.mo9574Q0(1, d + c2);
            super.mo9574Q0(2, c6 + c3);
            super.mo9574Q0(3, a2 + c4);
            super.mo9574Q0(0, b2 + c5);
        }
    }

    /* renamed from: H */
    public void mo9505H(Object obj) {
        C10457l.m35320e(obj, "data");
        if (obj instanceof C10117n) {
            C10117n nVar = this.f26968A;
            if (!(nVar == null || nVar.mo25186c() == ((C10117n) obj).mo25186c())) {
                m34231q1(nVar.mo25186c());
            }
            this.f26968A = (C10117n) obj;
            this.f26971D = false;
            m34232r1();
        }
    }

    /* renamed from: W */
    public void mo9520W(C3029o oVar) {
        C10457l.m35320e(oVar, "nativeViewHierarchyOptimizer");
        if (this.f26971D) {
            this.f26971D = false;
            m34232r1();
        }
    }

    @C2992b(names = {"margin", "marginVertical", "marginHorizontal", "marginStart", "marginEnd", "marginTop", "marginBottom", "marginLeft", "marginRight"})
    public void setMargins(int i, Dynamic dynamic) {
        C10457l.m35320e(dynamic, "margin");
        this.f26970C[C2983h1.f8307b[i]] = dynamic.getType() == ReadableType.Number ? (float) dynamic.asDouble() : Float.NaN;
        super.setMargins(i, dynamic);
        this.f26971D = true;
    }

    @C2992b(names = {"padding", "paddingVertical", "paddingHorizontal", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight"})
    public void setPaddings(int i, Dynamic dynamic) {
        C10457l.m35320e(dynamic, "padding");
        this.f26969B[C2983h1.f8307b[i]] = dynamic.getType() == ReadableType.Number ? (float) dynamic.asDouble() : Float.NaN;
        super.setPaddings(i, dynamic);
        this.f26971D = true;
    }
}
