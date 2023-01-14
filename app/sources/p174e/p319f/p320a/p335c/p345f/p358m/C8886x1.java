package p174e.p319f.p320a.p335c.p345f.p358m;

import com.google.firebase.p156m.C4881d;
import com.google.firebase.p156m.C4883f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* renamed from: e.f.a.c.f.m.x1 */
public final class C8886x1 {

    /* renamed from: a */
    private final Map<Class<?>, C4881d<?>> f24198a;

    /* renamed from: b */
    private final Map<Class<?>, C4883f<?>> f24199b;

    /* renamed from: c */
    private final C4881d<Object> f24200c;

    C8886x1(Map<Class<?>, C4881d<?>> map, Map<Class<?>, C4883f<?>> map2, C4881d<Object> dVar) {
        this.f24198a = map;
        this.f24199b = map2;
        this.f24200c = dVar;
    }

    /* renamed from: a */
    public final byte[] mo22697a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C8848u1(byteArrayOutputStream, this.f24198a, this.f24199b, this.f24200c).mo22669j(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
