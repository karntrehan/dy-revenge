package p174e.p319f.p320a.p335c.p343d;

import android.os.IBinder;
import android.os.IInterface;
import p174e.p319f.p320a.p335c.p345f.p351f.C6688b;

/* renamed from: e.f.a.c.d.a */
public interface C6634a extends IInterface {

    /* renamed from: e.f.a.c.d.a$a */
    public static abstract class C6635a extends C6688b implements C6634a {
        public C6635a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: k */
        public static C6634a m25275k(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof C6634a ? (C6634a) queryLocalInterface : new C6637c(iBinder);
        }
    }
}
