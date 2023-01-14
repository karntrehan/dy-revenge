package p174e.p319f.p393c.p394a;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: e.f.c.a.n */
public final class C9235n {

    /* renamed from: a */
    private static final CopyOnWriteArrayList<C9234m> f25146a = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    public static C9234m m30677a(String str) {
        Iterator<C9234m> it = f25146a.iterator();
        while (it.hasNext()) {
            C9234m next = it.next();
            if (next.mo23226a(str)) {
                return next;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + str);
    }
}
