package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: e.f.a.c.f.g.ua */
final class C7029ua extends C6789fb {
    C7029ua(int i) {
        super(i, (C6772eb) null);
    }

    /* renamed from: a */
    public final void mo19769a() {
        if (!mo19780j()) {
            for (int i = 0; i < mo19770b(); i++) {
                Map.Entry g = mo19777g(i);
                if (((C6963q8) g.getKey()).mo20102a()) {
                    g.setValue(Collections.unmodifiableList((List) g.getValue()));
                }
            }
            for (Map.Entry entry : mo19771c()) {
                if (((C6963q8) entry.getKey()).mo20102a()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo19769a();
    }
}
