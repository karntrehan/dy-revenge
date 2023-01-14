package p174e.p319f.p320a.p335c.p345f.p356k;

import com.google.firebase.p156m.C4881d;
import com.google.firebase.p156m.C4883f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* renamed from: e.f.a.c.f.k.s1 */
public final class C8005s1 {

    /* renamed from: a */
    private final Map<Class<?>, C4881d<?>> f21761a;

    /* renamed from: b */
    private final Map<Class<?>, C4883f<?>> f21762b;

    /* renamed from: c */
    private final C4881d<Object> f21763c;

    C8005s1(Map<Class<?>, C4881d<?>> map, Map<Class<?>, C4883f<?>> map2, C4881d<Object> dVar) {
        this.f21761a = map;
        this.f21762b = map2;
        this.f21763c = dVar;
    }

    /* renamed from: a */
    public final byte[] mo21572a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C7966p1(byteArrayOutputStream, this.f21761a, this.f21762b, this.f21763c).mo21532j(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
