package p455g.p466w;

import java.lang.reflect.Method;
import p455g.p470y.p472d.C10457l;
import p455g.p474z.C10473b;
import p455g.p474z.C10475c;

/* renamed from: g.w.a */
public class C10408a {

    /* renamed from: g.w.a$a */
    private static final class C10409a {

        /* renamed from: a */
        public static final C10409a f27599a = new C10409a();

        /* renamed from: b */
        public static final Method f27600b;

        /* renamed from: c */
        public static final Method f27601c;

        /* JADX WARNING: Removed duplicated region for block: B:10:0x003f A[LOOP:0: B:1:0x0015->B:10:0x003f, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0043 A[EDGE_INSN: B:21:0x0043->B:12:0x0043 ?: BREAK  , SYNTHETIC] */
        static {
            /*
                g.w.a$a r0 = new g.w.a$a
                r0.<init>()
                f27599a = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                p455g.p470y.p472d.C10457l.m35319d(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = 0
            L_0x0015:
                r5 = 0
                if (r4 >= r2) goto L_0x0042
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = p455g.p470y.p472d.C10457l.m35316a(r7, r8)
                if (r7 == 0) goto L_0x003b
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "it.parameterTypes"
                p455g.p470y.p472d.C10457l.m35319d(r7, r8)
                java.lang.Object r7 = p455g.p460t.C10343h.m35095z(r7)
                boolean r7 = p455g.p470y.p472d.C10457l.m35316a(r7, r0)
                if (r7 == 0) goto L_0x003b
                r7 = 1
                goto L_0x003c
            L_0x003b:
                r7 = 0
            L_0x003c:
                if (r7 == 0) goto L_0x003f
                goto L_0x0043
            L_0x003f:
                int r4 = r4 + 1
                goto L_0x0015
            L_0x0042:
                r6 = r5
            L_0x0043:
                f27600b = r6
                int r0 = r1.length
            L_0x0046:
                if (r3 >= r0) goto L_0x005b
                r2 = r1[r3]
                java.lang.String r4 = r2.getName()
                java.lang.String r6 = "getSuppressed"
                boolean r4 = p455g.p470y.p472d.C10457l.m35316a(r4, r6)
                if (r4 == 0) goto L_0x0058
                r5 = r2
                goto L_0x005b
            L_0x0058:
                int r3 = r3 + 1
                goto L_0x0046
            L_0x005b:
                f27601c = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p455g.p466w.C10408a.C10409a.<clinit>():void");
        }

        private C10409a() {
        }
    }

    /* renamed from: a */
    public void mo25804a(Throwable th, Throwable th2) {
        C10457l.m35320e(th, "cause");
        C10457l.m35320e(th2, "exception");
        Method method = C10409a.f27600b;
        if (method != null) {
            method.invoke(th, new Object[]{th2});
        }
    }

    /* renamed from: b */
    public C10475c mo25805b() {
        return new C10473b();
    }
}
