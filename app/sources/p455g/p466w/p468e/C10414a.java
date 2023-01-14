package p455g.p466w.p468e;

import p455g.p466w.p467d.C10412a;
import p455g.p474z.C10475c;
import p455g.p474z.p475d.C10477a;

/* renamed from: g.w.e.a */
public class C10414a extends C10412a {

    /* renamed from: g.w.e.a$a */
    private static final class C10415a {

        /* renamed from: a */
        public static final C10415a f27605a = new C10415a();

        /* renamed from: b */
        public static final Integer f27606b;

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        static {
            /*
                g.w.e.a$a r0 = new g.w.e.a$a
                r0.<init>()
                f27605a = r0
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
                f27606b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p455g.p466w.p468e.C10414a.C10415a.<clinit>():void");
        }

        private C10415a() {
        }
    }

    /* renamed from: c */
    private final boolean m35286c(int i) {
        Integer num = C10415a.f27606b;
        return num == null || num.intValue() >= i;
    }

    /* renamed from: b */
    public C10475c mo25805b() {
        return m35286c(24) ? new C10477a() : super.mo25805b();
    }
}
