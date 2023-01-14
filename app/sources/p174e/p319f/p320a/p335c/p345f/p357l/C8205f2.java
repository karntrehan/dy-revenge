package p174e.p319f.p320a.p335c.p345f.p357l;

import com.google.firebase.p156m.C4881d;
import com.google.firebase.p156m.C4883f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* renamed from: e.f.a.c.f.l.f2 */
public final class C8205f2 {

    /* renamed from: a */
    private final Map<Class<?>, C4881d<?>> f22291a;

    /* renamed from: b */
    private final Map<Class<?>, C4883f<?>> f22292b;

    /* renamed from: c */
    private final C4881d<Object> f22293c;

    C8205f2(Map<Class<?>, C4881d<?>> map, Map<Class<?>, C4883f<?>> map2, C4881d<Object> dVar) {
        this.f22291a = map;
        this.f22292b = map2;
        this.f22293c = dVar;
    }

    /* renamed from: a */
    public final byte[] mo21783a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C8129b2(byteArrayOutputStream, this.f22291a, this.f22292b, this.f22293c).mo21682j(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
