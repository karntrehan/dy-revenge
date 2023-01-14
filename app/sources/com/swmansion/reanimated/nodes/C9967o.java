package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.C9911d;
import com.swmansion.reanimated.C9921h;

/* renamed from: com.swmansion.reanimated.nodes.o */
public class C9967o extends C9965m {

    /* renamed from: A */
    private static final C9981g0 f26670A = new C9995s();

    /* renamed from: B */
    private static final C9981g0 f26671B = new C9996t();

    /* renamed from: C */
    private static final C9981g0 f26672C = new C9997u();

    /* renamed from: D */
    private static final C9981g0 f26673D = new C9999w();

    /* renamed from: E */
    private static final C9981g0 f26674E = new C10000x();

    /* renamed from: a */
    private static final C9981g0 f26675a = new C9987k();

    /* renamed from: b */
    private static final C9981g0 f26676b = new C9998v();

    /* renamed from: c */
    private static final C9981g0 f26677c = new C10001y();

    /* renamed from: d */
    private static final C9981g0 f26678d = new C10002z();

    /* renamed from: e */
    private static final C9981g0 f26679e = new C9969a0();

    /* renamed from: f */
    private static final C9981g0 f26680f = new C9971b0();

    /* renamed from: g */
    private static final C9981g0 f26681g = new C9973c0();

    /* renamed from: h */
    private static final C9981g0 f26682h = new C9975d0();

    /* renamed from: i */
    private static final C9981g0 f26683i = new C9977e0();

    /* renamed from: j */
    private static final C9981g0 f26684j = new C9968a();

    /* renamed from: k */
    private static final C9981g0 f26685k = new C9970b();

    /* renamed from: l */
    private static final C9981g0 f26686l = new C9972c();

    /* renamed from: m */
    private static final C9981g0 f26687m = new C9974d();

    /* renamed from: n */
    private static final C9981g0 f26688n = new C9976e();

    /* renamed from: o */
    private static final C9981g0 f26689o = new C9978f();

    /* renamed from: p */
    private static final C9981g0 f26690p = new C9980g();

    /* renamed from: q */
    private static final C9981g0 f26691q = new C9982h();

    /* renamed from: r */
    private static final C9981g0 f26692r = new C9984i();

    /* renamed from: s */
    private static final C9981g0 f26693s = new C9986j();

    /* renamed from: t */
    private static final C9981g0 f26694t = new C9988l();

    /* renamed from: u */
    private static final C9981g0 f26695u = new C9989m();

    /* renamed from: v */
    private static final C9981g0 f26696v = new C9990n();

    /* renamed from: w */
    private static final C9981g0 f26697w = new C9991o();

    /* renamed from: x */
    private static final C9981g0 f26698x = new C9992p();

    /* renamed from: y */
    private static final C9981g0 f26699y = new C9993q();

    /* renamed from: z */
    private static final C9981g0 f26700z = new C9994r();

    /* renamed from: F */
    private final int[] f26701F;

    /* renamed from: G */
    private final C9965m[] f26702G;

    /* renamed from: H */
    private final C9981g0 f26703H;

    /* renamed from: com.swmansion.reanimated.nodes.o$a */
    class C9968a extends C9985i0 {
        C9968a() {
            super((C9987k) null);
        }

        /* renamed from: b */
        public double mo24871b(Double d) {
            return Math.cos(d.doubleValue());
        }
    }

    /* renamed from: com.swmansion.reanimated.nodes.o$a0 */
    class C9969a0 extends C9983h0 {
        C9969a0() {
            super((C9987k) null);
        }

        /* renamed from: b */
        public double mo24872b(Double d, Double d2) {
            return Math.pow(d.doubleValue(), d2.doubleValue());
        }
    }

    /* renamed from: com.swmansion.reanimated.nodes.o$b */
    class C9970b extends C9985i0 {
        C9970b() {
            super((C9987k) null);
        }

        /* renamed from: b */
        public double mo24871b(Double d) {
            return Math.tan(d.doubleValue());
        }
    }

    /* renamed from: com.swmansion.reanimated.nodes.o$b0 */
    class C9971b0 extends C9983h0 {
        C9971b0() {
            super((C9987k) null);
        }

        /* renamed from: b */
        public double mo24872b(Double d, Double d2) {
            return ((d.doubleValue() % d2.doubleValue()) + d2.doubleValue()) % d2.doubleValue();
        }
    }

    /* renamed from: com.swmansion.reanimated.nodes.o$c */
    class C9972c extends C9985i0 {
        C9972c() {
            super((C9987k) null);
        }

        /* renamed from: b */
        public double mo24871b(Double d) {
            return Math.acos(d.doubleValue());
        }
    }

    /* renamed from: com.swmansion.reanimated.nodes.o$c0 */
    class C9973c0 extends C9985i0 {
        C9973c0() {
            super((C9987k) null);
        }

        /* renamed from: b */
        public double mo24871b(Double d) {
            return Math.sqrt(d.doubleValue());
        }
    }

    /* renamed from: com.swmansion.reanimated.nodes.o$d */
    class C9974d extends C9985i0 {
        C9974d() {
            super((C9987k) null);
        }

        /* renamed from: b */
        public double mo24871b(Double d) {
            return Math.asin(d.doubleValue());
        }
    }

    /* renamed from: com.swmansion.reanimated.nodes.o$d0 */
    class C9975d0 extends C9985i0 {
        C9975d0() {
            super((C9987k) null);
        }

        /* renamed from: b */
        public double mo24871b(Double d) {
            return Math.log(d.doubleValue());
        }
    }

    /* renamed from: com.swmansion.reanimated.nodes.o$e */
    class C9976e extends C9985i0 {
        C9976e() {
            super((C9987k) null);
        }

        /* renamed from: b */
        public double mo24871b(Double d) {
            return Math.atan(d.doubleValue());
        }
    }

    /* renamed from: com.swmansion.reanimated.nodes.o$e0 */
    class C9977e0 extends C9985i0 {
        C9977e0() {
            super((C9987k) null);
        }

        /* renamed from: b */
        public double mo24871b(Double d) {
            return Math.sin(d.doubleValue());
        }
    }

    /* renamed from: com.swmansion.reanimated.nodes.o$f */
    class C9978f extends C9985i0 {
        C9978f() {
            super((C9987k) null);
        }

        /* renamed from: b */
        public double mo24871b(Double d) {
            return Math.exp(d.doubleValue());
        }
    }

    /* renamed from: com.swmansion.reanimated.nodes.o$f0 */
    private static abstract class C9979f0 implements C9981g0 {
        private C9979f0() {
        }

        /* synthetic */ C9979f0(C9987k kVar) {
            this();
        }

        /* renamed from: a */
        public double mo24873a(C9965m[] mVarArr) {
            return mo24874b((Double) mVarArr[0].value(), (Double) mVarArr[1].value()) ? 1.0d : 0.0d;
        }

        /* renamed from: b */
        public abstract boolean mo24874b(Double d, Double d2);
    }

    /* renamed from: com.swmansion.reanimated.nodes.o$g */
    class C9980g extends C9985i0 {
        C9980g() {
            super((C9987k) null);
        }

        /* renamed from: b */
        public double mo24871b(Double d) {
            return (double) Math.round(d.doubleValue());
        }
    }

    /* renamed from: com.swmansion.reanimated.nodes.o$g0 */
    private interface C9981g0 {
        /* renamed from: a */
        double mo24873a(C9965m[] mVarArr);
    }

    /* renamed from: com.swmansion.reanimated.nodes.o$h */
    class C9982h extends C9985i0 {
        C9982h() {
            super((C9987k) null);
        }

        /* renamed from: b */
        public double mo24871b(Double d) {
            return Math.abs(d.doubleValue());
        }
    }

    /* renamed from: com.swmansion.reanimated.nodes.o$h0 */
    private static abstract class C9983h0 implements C9981g0 {
        private C9983h0() {
        }

        /* synthetic */ C9983h0(C9987k kVar) {
            this();
        }

        /* renamed from: a */
        public double mo24873a(C9965m[] mVarArr) {
            double doubleValue = mVarArr[0].doubleValue().doubleValue();
            for (int i = 1; i < mVarArr.length; i++) {
                doubleValue = mo24872b(Double.valueOf(doubleValue), mVarArr[i].doubleValue());
            }
            return doubleValue;
        }

        /* renamed from: b */
        public abstract double mo24872b(Double d, Double d2);
    }

    /* renamed from: com.swmansion.reanimated.nodes.o$i */
    class C9984i extends C9985i0 {
        C9984i() {
            super((C9987k) null);
        }

        /* renamed from: b */
        public double mo24871b(Double d) {
            return Math.floor(d.doubleValue());
        }
    }

    /* renamed from: com.swmansion.reanimated.nodes.o$i0 */
    private static abstract class C9985i0 implements C9981g0 {
        private C9985i0() {
        }

        /* synthetic */ C9985i0(C9987k kVar) {
            this();
        }

        /* renamed from: a */
        public double mo24873a(C9965m[] mVarArr) {
            return mo24871b((Double) mVarArr[0].value());
        }

        /* renamed from: b */
        public abstract double mo24871b(Double d);
    }

    /* renamed from: com.swmansion.reanimated.nodes.o$j */
    class C9986j extends C9985i0 {
        C9986j() {
            super((C9987k) null);
        }

        /* renamed from: b */
        public double mo24871b(Double d) {
            return Math.ceil(d.doubleValue());
        }
    }

    /* renamed from: com.swmansion.reanimated.nodes.o$k */
    class C9987k extends C9983h0 {
        C9987k() {
            super((C9987k) null);
        }

        /* renamed from: b */
        public double mo24872b(Double d, Double d2) {
            return d.doubleValue() + d2.doubleValue();
        }
    }

    /* renamed from: com.swmansion.reanimated.nodes.o$l */
    class C9988l extends C9983h0 {
        C9988l() {
            super((C9987k) null);
        }

        /* renamed from: b */
        public double mo24872b(Double d, Double d2) {
            return Math.min(d.doubleValue(), d2.doubleValue());
        }
    }

    /* renamed from: com.swmansion.reanimated.nodes.o$m */
    class C9989m extends C9983h0 {
        C9989m() {
            super((C9987k) null);
        }

        /* renamed from: b */
        public double mo24872b(Double d, Double d2) {
            return Math.max(d.doubleValue(), d2.doubleValue());
        }
    }

    /* renamed from: com.swmansion.reanimated.nodes.o$n */
    class C9990n implements C9981g0 {
        C9990n() {
        }

        /* renamed from: a */
        public double mo24873a(C9965m[] mVarArr) {
            boolean b = C9967o.m33905c(mVarArr[0].value());
            for (int i = 1; i < mVarArr.length && b; i++) {
                b = b && C9967o.m33905c(mVarArr[i].value());
            }
            return b ? 1.0d : 0.0d;
        }
    }

    /* renamed from: com.swmansion.reanimated.nodes.o$o */
    class C9991o implements C9981g0 {
        C9991o() {
        }

        /* renamed from: a */
        public double mo24873a(C9965m[] mVarArr) {
            boolean b = C9967o.m33905c(mVarArr[0].value());
            for (int i = 1; i < mVarArr.length && !b; i++) {
                b = b || C9967o.m33905c(mVarArr[i].value());
            }
            return b ? 1.0d : 0.0d;
        }
    }

    /* renamed from: com.swmansion.reanimated.nodes.o$p */
    class C9992p implements C9981g0 {
        C9992p() {
        }

        /* renamed from: a */
        public double mo24873a(C9965m[] mVarArr) {
            return C9967o.m33905c(mVarArr[0].value()) ? 0.0d : 1.0d;
        }
    }

    /* renamed from: com.swmansion.reanimated.nodes.o$q */
    class C9993q implements C9981g0 {
        C9993q() {
        }

        /* renamed from: a */
        public double mo24873a(C9965m[] mVarArr) {
            Object value = mVarArr[0].value();
            return (value == null || ((value instanceof Double) && ((Double) value).isNaN())) ? 0.0d : 1.0d;
        }
    }

    /* renamed from: com.swmansion.reanimated.nodes.o$r */
    class C9994r extends C9979f0 {
        C9994r() {
            super((C9987k) null);
        }

        /* renamed from: b */
        public boolean mo24874b(Double d, Double d2) {
            return (d == null || d2 == null || d.doubleValue() >= d2.doubleValue()) ? false : true;
        }
    }

    /* renamed from: com.swmansion.reanimated.nodes.o$s */
    class C9995s extends C9979f0 {
        C9995s() {
            super((C9987k) null);
        }

        /* renamed from: b */
        public boolean mo24874b(Double d, Double d2) {
            return (d == null || d2 == null) ? d == d2 : d.doubleValue() == d2.doubleValue();
        }
    }

    /* renamed from: com.swmansion.reanimated.nodes.o$t */
    class C9996t extends C9979f0 {
        C9996t() {
            super((C9987k) null);
        }

        /* renamed from: b */
        public boolean mo24874b(Double d, Double d2) {
            return (d == null || d2 == null || d.doubleValue() <= d2.doubleValue()) ? false : true;
        }
    }

    /* renamed from: com.swmansion.reanimated.nodes.o$u */
    class C9997u extends C9979f0 {
        C9997u() {
            super((C9987k) null);
        }

        /* renamed from: b */
        public boolean mo24874b(Double d, Double d2) {
            return d.doubleValue() <= d2.doubleValue();
        }
    }

    /* renamed from: com.swmansion.reanimated.nodes.o$v */
    class C9998v extends C9983h0 {
        C9998v() {
            super((C9987k) null);
        }

        /* renamed from: b */
        public double mo24872b(Double d, Double d2) {
            return d.doubleValue() - d2.doubleValue();
        }
    }

    /* renamed from: com.swmansion.reanimated.nodes.o$w */
    class C9999w extends C9979f0 {
        C9999w() {
            super((C9987k) null);
        }

        /* renamed from: b */
        public boolean mo24874b(Double d, Double d2) {
            return d.doubleValue() >= d2.doubleValue();
        }
    }

    /* renamed from: com.swmansion.reanimated.nodes.o$x */
    class C10000x extends C9979f0 {
        C10000x() {
            super((C9987k) null);
        }

        /* renamed from: b */
        public boolean mo24874b(Double d, Double d2) {
            return (d == null || d2 == null) ? d == d2 : d.doubleValue() != d2.doubleValue();
        }
    }

    /* renamed from: com.swmansion.reanimated.nodes.o$y */
    class C10001y extends C9983h0 {
        C10001y() {
            super((C9987k) null);
        }

        /* renamed from: b */
        public double mo24872b(Double d, Double d2) {
            return d.doubleValue() * d2.doubleValue();
        }
    }

    /* renamed from: com.swmansion.reanimated.nodes.o$z */
    class C10002z extends C9983h0 {
        C10002z() {
            super((C9987k) null);
        }

        /* renamed from: b */
        public double mo24872b(Double d, Double d2) {
            return d.doubleValue() / d2.doubleValue();
        }
    }

    public C9967o(int i, ReadableMap readableMap, C9911d dVar) {
        super(i, readableMap, dVar);
        C9981g0 g0Var;
        int[] a = C9921h.m33809a(readableMap.getArray("input"));
        this.f26701F = a;
        this.f26702G = new C9965m[a.length];
        String string = readableMap.getString("op");
        if ("add".equals(string)) {
            g0Var = f26675a;
        } else if ("sub".equals(string)) {
            g0Var = f26676b;
        } else if ("multiply".equals(string)) {
            g0Var = f26677c;
        } else if ("divide".equals(string)) {
            g0Var = f26678d;
        } else if ("pow".equals(string)) {
            g0Var = f26679e;
        } else if ("modulo".equals(string)) {
            g0Var = f26680f;
        } else if ("sqrt".equals(string)) {
            g0Var = f26681g;
        } else if ("log".equals(string)) {
            g0Var = f26682h;
        } else if ("sin".equals(string)) {
            g0Var = f26683i;
        } else if ("cos".equals(string)) {
            g0Var = f26684j;
        } else if ("tan".equals(string)) {
            g0Var = f26685k;
        } else if ("acos".equals(string)) {
            g0Var = f26686l;
        } else if ("asin".equals(string)) {
            g0Var = f26687m;
        } else if ("atan".equals(string)) {
            g0Var = f26688n;
        } else if ("exp".equals(string)) {
            g0Var = f26689o;
        } else if ("round".equals(string)) {
            g0Var = f26690p;
        } else if ("and".equals(string)) {
            g0Var = f26696v;
        } else if ("or".equals(string)) {
            g0Var = f26697w;
        } else if ("not".equals(string)) {
            g0Var = f26698x;
        } else if ("defined".equals(string)) {
            g0Var = f26699y;
        } else if ("lessThan".equals(string)) {
            g0Var = f26700z;
        } else if ("eq".equals(string)) {
            g0Var = f26670A;
        } else if ("greaterThan".equals(string)) {
            g0Var = f26671B;
        } else if ("lessOrEq".equals(string)) {
            g0Var = f26672C;
        } else if ("greaterOrEq".equals(string)) {
            g0Var = f26673D;
        } else if ("neq".equals(string)) {
            g0Var = f26674E;
        } else if ("abs".equals(string)) {
            g0Var = f26691q;
        } else if ("floor".equals(string)) {
            g0Var = f26692r;
        } else if ("ceil".equals(string)) {
            g0Var = f26693s;
        } else if ("max".equals(string)) {
            g0Var = f26695u;
        } else if ("min".equals(string)) {
            g0Var = f26694t;
        } else {
            throw new JSApplicationIllegalArgumentException("Unrecognized operator " + string);
        }
        this.f26703H = g0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static boolean m33905c(Object obj) {
        return obj != null && !obj.equals(Double.valueOf(0.0d));
    }

    /* access modifiers changed from: protected */
    public Object evaluate() {
        int i = 0;
        while (true) {
            int[] iArr = this.f26701F;
            if (i >= iArr.length) {
                return Double.valueOf(this.f26703H.mo24873a(this.f26702G));
            }
            this.f26702G[i] = this.mNodesManager.mo24809r(iArr[i], C9965m.class);
            i++;
        }
    }
}
