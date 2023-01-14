package p174e.p247e.p294k.p302f;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p174e.p247e.p249b.p251b.C6016c;
import p174e.p247e.p249b.p251b.C6019d;
import p174e.p247e.p249b.p251b.C6022e;
import p174e.p247e.p249b.p251b.C6030i;

/* renamed from: e.e.k.f.c */
public class C6322c implements C6326g {

    /* renamed from: a */
    private C6323d f17487a;

    public C6322c(C6323d dVar) {
        this.f17487a = dVar;
    }

    /* renamed from: b */
    public static C6022e m23947b(C6016c cVar, C6019d dVar) {
        return m23948c(cVar, dVar, Executors.newSingleThreadExecutor());
    }

    /* renamed from: c */
    public static C6022e m23948c(C6016c cVar, C6019d dVar, Executor executor) {
        return new C6022e(dVar, cVar.mo17965h(), new C6022e.C6025c(cVar.mo17968k(), cVar.mo17967j(), cVar.mo17963f()), cVar.mo17962e(), cVar.mo17961d(), cVar.mo17964g(), executor, cVar.mo17966i());
    }

    /* renamed from: a */
    public C6030i mo18706a(C6016c cVar) {
        return m23947b(cVar, this.f17487a.mo18707a(cVar));
    }
}
