package p493i;

import java.util.concurrent.atomic.AtomicReference;
import p455g.p470y.p472d.C10457l;

/* renamed from: i.z */
public final class C10638z {

    /* renamed from: a */
    private static final int f28097a = 65536;

    /* renamed from: b */
    private static final C10636y f28098b = new C10636y(new byte[0], 0, 0, false, false);

    /* renamed from: c */
    private static final int f28099c;

    /* renamed from: d */
    private static final AtomicReference<C10636y>[] f28100d;

    /* renamed from: e */
    public static final C10638z f28101e = new C10638z();

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f28099c = highestOneBit;
        AtomicReference<C10636y>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        f28100d = atomicReferenceArr;
    }

    private C10638z() {
    }

    /* renamed from: a */
    private final AtomicReference<C10636y> m36237a() {
        Thread currentThread = Thread.currentThread();
        C10457l.m35319d(currentThread, "Thread.currentThread()");
        return f28100d[(int) (currentThread.getId() & (((long) f28099c) - 1))];
    }

    /* renamed from: b */
    public static final void m36238b(C10636y yVar) {
        AtomicReference<C10636y> a;
        C10636y yVar2;
        C10457l.m35320e(yVar, "segment");
        if (!(yVar.f28095g == null && yVar.f28096h == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!yVar.f28093e && (yVar2 = a.get()) != f28098b) {
            int i = yVar2 != null ? yVar2.f28092d : 0;
            if (i < f28097a) {
                yVar.f28095g = yVar2;
                yVar.f28091c = 0;
                yVar.f28092d = i + 8192;
                if (!(a = f28101e.m36237a()).compareAndSet(yVar2, yVar)) {
                    yVar.f28095g = null;
                }
            }
        }
    }

    /* renamed from: c */
    public static final C10636y m36239c() {
        AtomicReference<C10636y> a = f28101e.m36237a();
        C10636y yVar = f28098b;
        C10636y andSet = a.getAndSet(yVar);
        if (andSet == yVar) {
            return new C10636y();
        }
        if (andSet == null) {
            a.set((Object) null);
            return new C10636y();
        }
        a.set(andSet.f28095g);
        andSet.f28095g = null;
        andSet.f28092d = 0;
        return andSet;
    }
}
