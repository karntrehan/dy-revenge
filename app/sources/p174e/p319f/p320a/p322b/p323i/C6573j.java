package p174e.p319f.p320a.p322b.p323i;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;
import p174e.p319f.p320a.p322b.p323i.C6549c;

/* renamed from: e.f.a.b.i.j */
public abstract class C6573j {

    /* renamed from: e.f.a.b.i.j$a */
    public static abstract class C6574a {
        /* renamed from: a */
        public final C6574a mo19380a(String str, int i) {
            mo19332e().put(str, String.valueOf(i));
            return this;
        }

        /* renamed from: b */
        public final C6574a mo19381b(String str, long j) {
            mo19332e().put(str, String.valueOf(j));
            return this;
        }

        /* renamed from: c */
        public final C6574a mo19382c(String str, String str2) {
            mo19332e().put(str, str2);
            return this;
        }

        /* renamed from: d */
        public abstract C6573j mo19331d();

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public abstract Map<String, String> mo19332e();

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public abstract C6574a mo19333f(Map<String, String> map);

        /* renamed from: g */
        public abstract C6574a mo19334g(Integer num);

        /* renamed from: h */
        public abstract C6574a mo19335h(C6572i iVar);

        /* renamed from: i */
        public abstract C6574a mo19336i(long j);

        /* renamed from: j */
        public abstract C6574a mo19337j(String str);

        /* renamed from: k */
        public abstract C6574a mo19338k(long j);
    }

    /* renamed from: a */
    public static C6574a m25122a() {
        return new C6549c.C6551b().mo19333f(new HashMap());
    }

    /* renamed from: b */
    public final String mo19375b(String str) {
        String str2 = mo19322c().get(str);
        return str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Map<String, String> mo19322c();

    /* renamed from: d */
    public abstract Integer mo19323d();

    /* renamed from: e */
    public abstract C6572i mo19324e();

    /* renamed from: f */
    public abstract long mo19326f();

    /* renamed from: g */
    public final int mo19376g(String str) {
        String str2 = mo19322c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: h */
    public final long mo19377h(String str) {
        String str2 = mo19322c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Long.valueOf(str2).longValue();
    }

    /* renamed from: i */
    public final Map<String, String> mo19378i() {
        return Collections.unmodifiableMap(mo19322c());
    }

    /* renamed from: j */
    public abstract String mo19328j();

    /* renamed from: k */
    public abstract long mo19329k();

    /* renamed from: l */
    public C6574a mo19379l() {
        return new C6549c.C6551b().mo19337j(mo19328j()).mo19334g(mo19323d()).mo19335h(mo19324e()).mo19336i(mo19326f()).mo19338k(mo19329k()).mo19333f(new HashMap(mo19322c()));
    }
}
