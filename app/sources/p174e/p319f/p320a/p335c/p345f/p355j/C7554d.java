package p174e.p319f.p320a.p335c.p345f.p355j;

import com.google.firebase.p156m.C4881d;
import com.google.firebase.p156m.C4883f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* renamed from: e.f.a.c.f.j.d */
public final class C7554d {

    /* renamed from: a */
    private final Map<Class<?>, C4881d<?>> f20315a;

    /* renamed from: b */
    private final Map<Class<?>, C4883f<?>> f20316b;

    /* renamed from: c */
    private final C4881d<Object> f20317c;

    C7554d(Map<Class<?>, C4881d<?>> map, Map<Class<?>, C4883f<?>> map2, C4881d<Object> dVar) {
        this.f20315a = map;
        this.f20316b = map2;
        this.f20317c = dVar;
    }

    /* renamed from: a */
    public final byte[] mo21061a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C7633k8(byteArrayOutputStream, this.f20315a, this.f20316b, this.f20317c).mo21112j(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
