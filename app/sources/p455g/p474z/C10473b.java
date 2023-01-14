package p455g.p474z;

import java.util.Random;
import p455g.p470y.p472d.C10457l;

/* renamed from: g.z.b */
public final class C10473b extends C10472a {

    /* renamed from: p */
    private final C10474a f27630p = new C10474a();

    /* renamed from: g.z.b$a */
    public static final class C10474a extends ThreadLocal<Random> {
        C10474a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    }

    /* renamed from: c */
    public Random mo25848c() {
        Object obj = this.f27630p.get();
        C10457l.m35319d(obj, "implStorage.get()");
        return (Random) obj;
    }
}
