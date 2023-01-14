package p174e.p247e.p274h.p288i;

import java.util.ArrayList;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p274h.p287h.C6233b;

/* renamed from: e.e.h.i.e */
public class C6241e<DH extends C6233b> {

    /* renamed from: a */
    boolean f17284a = false;

    /* renamed from: b */
    ArrayList<C6238b<DH>> f17285b = new ArrayList<>();

    /* renamed from: a */
    public void mo18551a(int i, C6238b<DH> bVar) {
        C6062k.m22839g(bVar);
        C6062k.m22837e(i, this.f17285b.size() + 1);
        this.f17285b.add(i, bVar);
        if (this.f17284a) {
            bVar.mo18520k();
        }
    }

    /* renamed from: b */
    public void mo18552b(C6238b<DH> bVar) {
        mo18551a(this.f17285b.size(), bVar);
    }

    /* renamed from: c */
    public void mo18553c() {
        if (this.f17284a) {
            for (int i = 0; i < this.f17285b.size(); i++) {
                this.f17285b.get(i).mo18521l();
            }
        }
        this.f17285b.clear();
    }

    /* renamed from: d */
    public void mo18554d() {
        if (!this.f17284a) {
            this.f17284a = true;
            for (int i = 0; i < this.f17285b.size(); i++) {
                this.f17285b.get(i).mo18520k();
            }
        }
    }

    /* renamed from: e */
    public void mo18555e() {
        if (this.f17284a) {
            this.f17284a = false;
            for (int i = 0; i < this.f17285b.size(); i++) {
                this.f17285b.get(i).mo18521l();
            }
        }
    }
}
