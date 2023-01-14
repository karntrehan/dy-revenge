package p174e.p247e.p253d.p257d;

import java.util.Arrays;
import okhttp3.HttpUrl;

/* renamed from: e.e.d.d.j */
public final class C6058j {

    /* renamed from: e.e.d.d.j$b */
    public static final class C6060b {

        /* renamed from: a */
        private final String f16696a;

        /* renamed from: b */
        private final C6061a f16697b;

        /* renamed from: c */
        private C6061a f16698c;

        /* renamed from: d */
        private boolean f16699d;

        /* renamed from: e.e.d.d.j$b$a */
        private static final class C6061a {

            /* renamed from: a */
            String f16700a;

            /* renamed from: b */
            Object f16701b;

            /* renamed from: c */
            C6061a f16702c;

            private C6061a() {
            }
        }

        private C6060b(String str) {
            C6061a aVar = new C6061a();
            this.f16697b = aVar;
            this.f16698c = aVar;
            this.f16699d = false;
            this.f16696a = (String) C6062k.m22839g(str);
        }

        /* renamed from: d */
        private C6061a m22828d() {
            C6061a aVar = new C6061a();
            this.f16698c.f16702c = aVar;
            this.f16698c = aVar;
            return aVar;
        }

        /* renamed from: e */
        private C6060b m22829e(String str, Object obj) {
            C6061a d = m22828d();
            d.f16701b = obj;
            d.f16700a = (String) C6062k.m22839g(str);
            return this;
        }

        /* renamed from: a */
        public C6060b mo18043a(String str, int i) {
            return m22829e(str, String.valueOf(i));
        }

        /* renamed from: b */
        public C6060b mo18044b(String str, Object obj) {
            return m22829e(str, obj);
        }

        /* renamed from: c */
        public C6060b mo18045c(String str, boolean z) {
            return m22829e(str, String.valueOf(z));
        }

        public String toString() {
            boolean z = this.f16699d;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f16696a);
            sb.append('{');
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            for (C6061a aVar = this.f16697b.f16702c; aVar != null; aVar = aVar.f16702c) {
                Object obj = aVar.f16701b;
                if (!z || obj != null) {
                    sb.append(str);
                    String str2 = aVar.f16700a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append(deepToString, 1, deepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static boolean m22825a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m22826b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: c */
    public static C6060b m22827c(Object obj) {
        return new C6060b(obj.getClass().getSimpleName());
    }
}
