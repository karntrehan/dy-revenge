package p174e.p319f.p320a.p335c.p345f.p358m;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p174e.p319f.p320a.p335c.p343d.C6634a;

/* renamed from: e.f.a.c.f.m.wa */
public final class C8883wa extends C8586a implements IInterface {
    C8883wa(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.text.aidls.ITextRecognizer");
    }

    /* renamed from: P0 */
    public final void mo22686P0() {
        mo22302m(2, mo22300j());
    }

    /* renamed from: Y */
    public final C8676gb mo22687Y(C6634a aVar, C8857ua uaVar) {
        Parcel j = mo22300j();
        C8601b1.m29385c(j, aVar);
        C8601b1.m29384b(j, uaVar);
        Parcel k = mo22301k(3, j);
        C8676gb gbVar = (C8676gb) C8601b1.m29383a(k, C8676gb.CREATOR);
        k.recycle();
        return gbVar;
    }

    /* renamed from: c */
    public final void mo22688c() {
        mo22302m(1, mo22300j());
    }
}
