package kotlinx.coroutines;

import java.io.Closeable;
import p455g.p462v.C10373b;
import p455g.p462v.C10381g;
import p455g.p470y.p471c.C10430l;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10458m;

/* renamed from: kotlinx.coroutines.g1 */
public abstract class C10716g1 extends C10707f0 implements Closeable {

    /* renamed from: o */
    public static final C10717a f28202o = new C10717a((C10452g) null);

    /* renamed from: kotlinx.coroutines.g1$a */
    public static final class C10717a extends C10373b<C10707f0, C10716g1> {

        /* renamed from: kotlinx.coroutines.g1$a$a */
        static final class C10718a extends C10458m implements C10430l<C10381g.C10384b, C10716g1> {

            /* renamed from: f */
            public static final C10718a f28203f = new C10718a();

            C10718a() {
                super(1);
            }

            /* renamed from: a */
            public final C10716g1 invoke(C10381g.C10384b bVar) {
                if (bVar instanceof C10716g1) {
                    return (C10716g1) bVar;
                }
                return null;
            }
        }

        private C10717a() {
            super(C10707f0.f28190f, C10718a.f28203f);
        }

        public /* synthetic */ C10717a(C10452g gVar) {
            this();
        }
    }
}
