package p027c.p043d.p044a;

import androidx.camera.core.impl.C0796d2;
import androidx.camera.core.impl.C0816h1;

/* renamed from: c.d.a.d1 */
public abstract class C1523d1 {

    /* renamed from: a */
    static final Integer f4770a = 0;

    /* renamed from: b */
    static final C1523d1 f4771b = m6816c(0, C1524a.INACTIVE);

    /* renamed from: c */
    static final C0796d2<C1523d1> f4772c = C0816h1.m3215g(m6816c(0, C1524a.ACTIVE));

    /* renamed from: c.d.a.d1$a */
    enum C1524a {
        ACTIVE,
        INACTIVE
    }

    C1523d1() {
    }

    /* renamed from: c */
    static C1523d1 m6816c(Integer num, C1524a aVar) {
        return new C1697o0(num, aVar);
    }

    /* renamed from: a */
    public abstract Integer mo5644a();

    /* renamed from: b */
    public abstract C1524a mo5645b();
}
