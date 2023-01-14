package p174e.p319f.p320a.p335c.p345f.p354i;

import com.google.firebase.p156m.C4881d;
import com.google.firebase.p156m.C4883f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* renamed from: e.f.a.c.f.i.i2 */
public final class C7275i2 {

    /* renamed from: a */
    private final Map<Class<?>, C4881d<?>> f19381a;

    /* renamed from: b */
    private final Map<Class<?>, C4883f<?>> f19382b;

    /* renamed from: c */
    private final C4881d<Object> f19383c;

    C7275i2(Map<Class<?>, C4881d<?>> map, Map<Class<?>, C4883f<?>> map2, C4881d<Object> dVar) {
        this.f19381a = map;
        this.f19382b = map2;
        this.f19383c = dVar;
    }

    /* renamed from: a */
    public final byte[] mo20770a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C7230f2(byteArrayOutputStream, this.f19381a, this.f19382b, this.f19383c).mo20698j(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
