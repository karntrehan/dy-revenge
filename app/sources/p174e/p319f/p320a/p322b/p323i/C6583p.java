package p174e.p319f.p320a.p322b.p323i;

import android.util.Base64;
import okhttp3.HttpUrl;
import p174e.p319f.p320a.p322b.C6465d;
import p174e.p319f.p320a.p322b.p323i.C6564e;

/* renamed from: e.f.a.b.i.p */
public abstract class C6583p {

    /* renamed from: e.f.a.b.i.p$a */
    public static abstract class C6584a {
        /* renamed from: a */
        public abstract C6583p mo19361a();

        /* renamed from: b */
        public abstract C6584a mo19362b(String str);

        /* renamed from: c */
        public abstract C6584a mo19363c(byte[] bArr);

        /* renamed from: d */
        public abstract C6584a mo19364d(C6465d dVar);
    }

    /* renamed from: a */
    public static C6584a m25165a() {
        return new C6564e.C6566b().mo19364d(C6465d.DEFAULT);
    }

    /* renamed from: b */
    public abstract String mo19356b();

    /* renamed from: c */
    public abstract byte[] mo19357c();

    /* renamed from: d */
    public abstract C6465d mo19358d();

    /* renamed from: e */
    public boolean mo19388e() {
        return mo19357c() != null;
    }

    /* renamed from: f */
    public C6583p mo19389f(C6465d dVar) {
        return m25165a().mo19362b(mo19356b()).mo19364d(dVar).mo19363c(mo19357c()).mo19361a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = mo19356b();
        objArr[1] = mo19358d();
        objArr[2] = mo19357c() == null ? HttpUrl.FRAGMENT_ENCODE_SET : Base64.encodeToString(mo19357c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
