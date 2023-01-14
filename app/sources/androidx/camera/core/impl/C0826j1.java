package androidx.camera.core.impl;

import android.view.Surface;
import androidx.camera.core.impl.C0820i1;
import androidx.camera.core.impl.p014a3.p016o.C0765d;
import androidx.camera.core.impl.p014a3.p016o.C0768f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p027c.p061g.p062a.C1814b;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.core.impl.j1 */
public final class C0826j1 {

    /* renamed from: androidx.camera.core.impl.j1$a */
    class C0827a implements C0765d<List<Surface>> {

        /* renamed from: a */
        final /* synthetic */ boolean f2450a;

        /* renamed from: b */
        final /* synthetic */ C1814b.C1815a f2451b;

        /* renamed from: c */
        final /* synthetic */ ScheduledFuture f2452c;

        C0827a(boolean z, C1814b.C1815a aVar, ScheduledFuture scheduledFuture) {
            this.f2450a = z;
            this.f2451b = aVar;
            this.f2452c = scheduledFuture;
        }

        /* renamed from: b */
        public void mo1981b(Throwable th) {
            this.f2451b.mo6308c(Collections.unmodifiableList(Collections.emptyList()));
            this.f2452c.cancel(true);
        }

        /* renamed from: c */
        public void mo1980a(List<Surface> list) {
            ArrayList arrayList = new ArrayList(list);
            if (this.f2450a) {
                arrayList.removeAll(Collections.singleton((Object) null));
            }
            this.f2451b.mo6308c(arrayList);
            this.f2452c.cancel(true);
        }
    }

    /* renamed from: a */
    public static void m3239a(List<C0820i1> list) {
        for (C0820i1 b : list) {
            b.mo3002b();
        }
    }

    /* renamed from: b */
    public static void m3240b(List<C0820i1> list) {
        if (!list.isEmpty()) {
            int i = 0;
            do {
                try {
                    list.get(i).mo3008h();
                    i++;
                } catch (C0820i1.C0821a e) {
                    for (int i2 = i - 1; i2 >= 0; i2--) {
                        list.get(i2).mo3002b();
                    }
                    throw e;
                }
            } while (i < list.size());
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m3241c(C9172b bVar, C1814b.C1815a aVar, long j) {
        if (!bVar.isDone()) {
            aVar.mo6310f(new TimeoutException("Cannot complete surfaceList within " + j));
            bVar.cancel(true);
        }
    }

    /* renamed from: f */
    static /* synthetic */ Object m3244f(List list, ScheduledExecutorService scheduledExecutorService, Executor executor, long j, boolean z, C1814b.C1815a aVar) {
        C9172b m = C0768f.m3087m(list);
        ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new C0814h(executor, m, aVar, j), j, TimeUnit.MILLISECONDS);
        aVar.mo6306a(new C0798e(m), executor);
        C0768f.m3075a(m, new C0827a(z, aVar, schedule), executor);
        return "surfaceList";
    }

    /* renamed from: g */
    public static C9172b<List<Surface>> m3245g(Collection<C0820i1> collection, boolean z, long j, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        ArrayList arrayList = new ArrayList();
        for (C0820i1 f : collection) {
            arrayList.add(C0768f.m3083i(f.mo3006f()));
        }
        return C1814b.m7736a(new C0807g(arrayList, scheduledExecutorService, executor, j, z));
    }
}
