package p455g.p466w.p467d;

import p455g.p466w.C10408a;
import p455g.p470y.p472d.C10457l;

/* renamed from: g.w.d.a */
public class C10412a extends C10408a {

    /* renamed from: g.w.d.a$a */
    private static final class C10413a {

        /* renamed from: a */
        public static final C10413a f27603a = new C10413a();

        /* renamed from: b */
        public static final Integer f27604b;

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        static {
            /*
                g.w.d.a$a r0 = new g.w.d.a$a
                r0.<init>()
                f27603a = r0
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x001f }
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch:{ all -> 0x001f }
                java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x001f }
                boolean r2 = r1 instanceof java.lang.Integer     // Catch:{ all -> 0x001f }
                if (r2 == 0) goto L_0x001f
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x001f }
                goto L_0x0020
            L_0x001f:
                r1 = r0
            L_0x0020:
                if (r1 == 0) goto L_0x002e
                int r2 = r1.intValue()
                if (r2 <= 0) goto L_0x002a
                r2 = 1
                goto L_0x002b
            L_0x002a:
                r2 = 0
            L_0x002b:
                if (r2 == 0) goto L_0x002e
                r0 = r1
            L_0x002e:
                f27604b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p455g.p466w.p467d.C10412a.C10413a.<clinit>():void");
        }

        private C10413a() {
        }
    }

    /* renamed from: c */
    private final boolean m35284c(int i) {
        Integer num = C10413a.f27604b;
        return num == null || num.intValue() >= i;
    }

    /* renamed from: a */
    public void mo25804a(Throwable th, Throwable th2) {
        C10457l.m35320e(th, "cause");
        C10457l.m35320e(th2, "exception");
        if (m35284c(19)) {
            th.addSuppressed(th2);
        } else {
            super.mo25804a(th, th2);
        }
    }
}
