package p174e.p319f.p320a.p335c.p345f.p357l;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: e.f.a.c.f.l.ye */
final class C8565ye extends C8218ff {
    C8565ye(int i) {
        super(i, (C8565ye) null);
    }

    /* renamed from: a */
    public final void mo21806a() {
        if (!mo21817j()) {
            for (int i = 0; i < mo21807b(); i++) {
                Map.Entry g = mo21814g(i);
                ((C8491uc) g.getKey()).mo21714c();
                g.setValue(Collections.unmodifiableList((List) g.getValue()));
            }
            for (Map.Entry entry : mo21808c()) {
                ((C8491uc) entry.getKey()).mo21714c();
                entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
            }
        }
        super.mo21806a();
    }
}
