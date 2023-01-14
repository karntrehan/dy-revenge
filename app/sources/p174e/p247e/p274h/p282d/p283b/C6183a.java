package p174e.p247e.p274h.p282d.p283b;

import android.graphics.drawable.Animatable;
import p174e.p247e.p274h.p281c.C6178c;

/* renamed from: e.e.h.d.b.a */
public class C6183a extends C6178c {

    /* renamed from: o */
    private long f17072o = -1;

    /* renamed from: p */
    private long f17073p = -1;

    /* renamed from: q */
    private C6184b f17074q;

    public C6183a(C6184b bVar) {
        this.f17074q = bVar;
    }

    /* renamed from: e */
    public void mo9987e(String str, Object obj, Animatable animatable) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f17073p = currentTimeMillis;
        C6184b bVar = this.f17074q;
        if (bVar != null) {
            bVar.mo18323a(currentTimeMillis - this.f17072o);
        }
    }

    /* renamed from: n */
    public void mo9989n(String str, Object obj) {
        this.f17072o = System.currentTimeMillis();
    }
}
