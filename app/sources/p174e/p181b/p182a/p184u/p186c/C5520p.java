package p174e.p181b.p182a.p184u.p186c;

import java.util.Collections;
import p174e.p181b.p182a.p183a0.C5417a;
import p174e.p181b.p182a.p183a0.C5418b;
import p174e.p181b.p182a.p183a0.C5419c;

/* renamed from: e.b.a.u.c.p */
public class C5520p<K, A> extends C5499a<K, A> {

    /* renamed from: i */
    private final C5418b<A> f15574i;

    /* renamed from: j */
    private final A f15575j;

    public C5520p(C5419c<A> cVar) {
        this(cVar, (Object) null);
    }

    public C5520p(C5419c<A> cVar, A a) {
        super(Collections.emptyList());
        this.f15574i = new C5418b<>();
        mo16618n(cVar);
        this.f15575j = a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo16608c() {
        return 1.0f;
    }

    /* renamed from: h */
    public A mo16612h() {
        C5419c<A> cVar = this.f15530e;
        A a = this.f15575j;
        return cVar.mo16370b(0.0f, 0.0f, a, a, mo16611f(), mo16611f(), mo16611f());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public A mo16613i(C5417a<K> aVar, float f) {
        return mo16612h();
    }

    /* renamed from: k */
    public void mo16615k() {
        if (this.f15530e != null) {
            super.mo16615k();
        }
    }

    /* renamed from: m */
    public void mo16617m(float f) {
        this.f15529d = f;
    }
}
