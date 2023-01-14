package p174e.p247e.p249b.p251b;

import com.facebook.common.time.C2316a;
import com.facebook.common.time.C2318c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p174e.p247e.p248a.C5992a;
import p174e.p247e.p249b.p250a.C5994a;
import p174e.p247e.p249b.p250a.C5997c;
import p174e.p247e.p249b.p250a.C5999d;
import p174e.p247e.p249b.p250a.C6000e;
import p174e.p247e.p249b.p250a.C6005j;
import p174e.p247e.p249b.p251b.C6019d;
import p174e.p247e.p253d.p254a.C6033a;
import p174e.p247e.p253d.p254a.C6034b;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p258e.C6071a;
import p174e.p247e.p253d.p262i.C6101a;

/* renamed from: e.e.b.b.e */
public class C6022e implements C6030i, C6033a {

    /* renamed from: a */
    private static final Class<?> f16641a = C6022e.class;

    /* renamed from: b */
    private static final long f16642b = TimeUnit.HOURS.toMillis(2);

    /* renamed from: c */
    private static final long f16643c = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: d */
    private final long f16644d;

    /* renamed from: e */
    private final long f16645e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final CountDownLatch f16646f;

    /* renamed from: g */
    private long f16647g;

    /* renamed from: h */
    private final C5997c f16648h;

    /* renamed from: i */
    final Set<String> f16649i;

    /* renamed from: j */
    private long f16650j;

    /* renamed from: k */
    private final long f16651k;

    /* renamed from: l */
    private final C6101a f16652l;

    /* renamed from: m */
    private final C6019d f16653m;

    /* renamed from: n */
    private final C6029h f16654n;

    /* renamed from: o */
    private final C5994a f16655o;

    /* renamed from: p */
    private final boolean f16656p;

    /* renamed from: q */
    private final C6024b f16657q;

    /* renamed from: r */
    private final C2316a f16658r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final Object f16659s = new Object();
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f16660t;

    /* renamed from: e.e.b.b.e$a */
    class C6023a implements Runnable {
        C6023a() {
        }

        public void run() {
            synchronized (C6022e.this.f16659s) {
                boolean unused = C6022e.this.m22739p();
            }
            boolean unused2 = C6022e.this.f16660t = true;
            C6022e.this.f16646f.countDown();
        }
    }

    /* renamed from: e.e.b.b.e$b */
    static class C6024b {

        /* renamed from: a */
        private boolean f16662a = false;

        /* renamed from: b */
        private long f16663b = -1;

        /* renamed from: c */
        private long f16664c = -1;

        C6024b() {
        }

        /* renamed from: a */
        public synchronized long mo17981a() {
            return this.f16664c;
        }

        /* renamed from: b */
        public synchronized long mo17982b() {
            return this.f16663b;
        }

        /* renamed from: c */
        public synchronized void mo17983c(long j, long j2) {
            if (this.f16662a) {
                this.f16663b += j;
                this.f16664c += j2;
            }
        }

        /* renamed from: d */
        public synchronized boolean mo17984d() {
            return this.f16662a;
        }

        /* renamed from: e */
        public synchronized void mo17985e() {
            this.f16662a = false;
            this.f16664c = -1;
            this.f16663b = -1;
        }

        /* renamed from: f */
        public synchronized void mo17986f(long j, long j2) {
            this.f16664c = j2;
            this.f16663b = j;
            this.f16662a = true;
        }
    }

    /* renamed from: e.e.b.b.e$c */
    public static class C6025c {

        /* renamed from: a */
        public final long f16665a;

        /* renamed from: b */
        public final long f16666b;

        /* renamed from: c */
        public final long f16667c;

        public C6025c(long j, long j2, long j3) {
            this.f16665a = j;
            this.f16666b = j2;
            this.f16667c = j3;
        }
    }

    public C6022e(C6019d dVar, C6029h hVar, C6025c cVar, C5997c cVar2, C5994a aVar, C6034b bVar, Executor executor, boolean z) {
        CountDownLatch countDownLatch;
        this.f16644d = cVar.f16666b;
        long j = cVar.f16667c;
        this.f16645e = j;
        this.f16647g = j;
        this.f16652l = C6101a.m22981d();
        this.f16653m = dVar;
        this.f16654n = hVar;
        this.f16650j = -1;
        this.f16648h = cVar2;
        this.f16651k = cVar.f16665a;
        this.f16655o = aVar;
        this.f16657q = new C6024b();
        this.f16658r = C2318c.m9629a();
        this.f16656p = z;
        this.f16649i = new HashSet();
        if (bVar != null) {
            bVar.mo17999a(this);
        }
        if (z) {
            this.f16646f = countDownLatch;
            executor.execute(new C6023a());
            return;
        }
        countDownLatch = new CountDownLatch(0);
        this.f16646f = countDownLatch;
    }

    /* renamed from: l */
    private C5992a m22735l(C6019d.C6021b bVar, C5999d dVar, String str) {
        C5992a k;
        synchronized (this.f16659s) {
            k = bVar.mo17955k(dVar);
            this.f16649i.add(str);
            this.f16657q.mo17983c(k.size(), 1);
        }
        return k;
    }

    /* renamed from: m */
    private void m22736m(long j, C5997c.C5998a aVar) {
        long j2 = j;
        try {
            Collection<C6019d.C6020a> n = m22737n(this.f16653m.mo17936h());
            long b = this.f16657q.mo17982b();
            long j3 = b - j2;
            int i = 0;
            long j4 = 0;
            for (C6019d.C6020a next : n) {
                if (j4 > j3) {
                    break;
                }
                long i2 = this.f16653m.mo17937i(next);
                this.f16649i.remove(next.mo17945a());
                if (i2 > 0) {
                    i++;
                    j4 += i2;
                    C6031j e = C6031j.m22777a().mo17997j(next.mo17945a()).mo17994g(aVar).mo17996i(i2).mo17993f(b - j4).mo17992e(j2);
                    this.f16648h.mo17911b(e);
                    e.mo17990b();
                } else {
                    C5997c.C5998a aVar2 = aVar;
                }
            }
            this.f16657q.mo17983c(-j4, (long) (-i));
            this.f16653m.mo17931c();
        } catch (IOException e2) {
            C5994a aVar3 = this.f16655o;
            C5994a.C5995a aVar4 = C5994a.C5995a.EVICTION;
            Class<?> cls = f16641a;
            aVar3.mo17909a(aVar4, cls, "evictAboveSize: " + e2.getMessage(), e2);
            throw e2;
        }
    }

    /* renamed from: n */
    private Collection<C6019d.C6020a> m22737n(Collection<C6019d.C6020a> collection) {
        long now = this.f16658r.now() + f16642b;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        for (C6019d.C6020a next : collection) {
            if (next.mo17946b() > now) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        Collections.sort(arrayList2, this.f16654n.get());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* renamed from: o */
    private void m22738o() {
        synchronized (this.f16659s) {
            boolean p = m22739p();
            m22742s();
            long b = this.f16657q.mo17982b();
            if (b > this.f16647g && !p) {
                this.f16657q.mo17985e();
                m22739p();
            }
            long j = this.f16647g;
            if (b > j) {
                m22736m((j * 9) / 10, C5997c.C5998a.CACHE_FULL);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public boolean m22739p() {
        long now = this.f16658r.now();
        if (this.f16657q.mo17984d()) {
            long j = this.f16650j;
            if (j != -1 && now - j <= f16643c) {
                return false;
            }
        }
        return m22740q();
    }

    /* renamed from: q */
    private boolean m22740q() {
        long j;
        long now = this.f16658r.now();
        long j2 = f16642b + now;
        Set<String> hashSet = (!this.f16656p || !this.f16649i.isEmpty()) ? this.f16656p ? new HashSet<>() : null : this.f16649i;
        try {
            long j3 = 0;
            long j4 = -1;
            int i = 0;
            boolean z = false;
            int i2 = 0;
            int i3 = 0;
            for (C6019d.C6020a next : this.f16653m.mo17936h()) {
                i2++;
                j3 += next.mo17948h();
                if (next.mo17946b() > j2) {
                    i3++;
                    i = (int) (((long) i) + next.mo17948h());
                    j = j2;
                    j4 = Math.max(next.mo17946b() - now, j4);
                    z = true;
                } else {
                    j = j2;
                    if (this.f16656p) {
                        C6062k.m22839g(hashSet);
                        hashSet.add(next.mo17945a());
                    }
                }
                j2 = j;
            }
            if (z) {
                C5994a aVar = this.f16655o;
                C5994a.C5995a aVar2 = C5994a.C5995a.READ_INVALID_ENTRY;
                Class<?> cls = f16641a;
                aVar.mo17909a(aVar2, cls, "Future timestamp found in " + i3 + " files , with a total size of " + i + " bytes, and a maximum time delta of " + j4 + "ms", (Throwable) null);
            }
            long j5 = (long) i2;
            if (!(this.f16657q.mo17981a() == j5 && this.f16657q.mo17982b() == j3)) {
                if (this.f16656p && this.f16649i != hashSet) {
                    C6062k.m22839g(hashSet);
                    this.f16649i.clear();
                    this.f16649i.addAll(hashSet);
                }
                this.f16657q.mo17986f(j3, j5);
            }
            this.f16650j = now;
            return true;
        } catch (IOException e) {
            C5994a aVar3 = this.f16655o;
            C5994a.C5995a aVar4 = C5994a.C5995a.GENERIC_IO;
            Class<?> cls2 = f16641a;
            aVar3.mo17909a(aVar4, cls2, "calcFileCacheSize: " + e.getMessage(), e);
            return false;
        }
    }

    /* renamed from: r */
    private C6019d.C6021b m22741r(String str, C5999d dVar) {
        m22738o();
        return this.f16653m.mo17932d(str, dVar);
    }

    /* renamed from: s */
    private void m22742s() {
        this.f16647g = this.f16652l.mo18096f(this.f16653m.mo17930b() ? C6101a.C6102a.EXTERNAL : C6101a.C6102a.INTERNAL, this.f16645e - this.f16657q.mo17982b()) ? this.f16644d : this.f16645e;
    }

    /* renamed from: a */
    public void mo17973a() {
        synchronized (this.f16659s) {
            try {
                this.f16653m.mo17929a();
                this.f16649i.clear();
                this.f16648h.mo17912c();
            } catch (IOException | NullPointerException e) {
                C5994a aVar = this.f16655o;
                C5994a.C5995a aVar2 = C5994a.C5995a.EVICTION;
                Class<?> cls = f16641a;
                aVar.mo17909a(aVar2, cls, "clearAll: " + e.getMessage(), e);
            }
            this.f16657q.mo17985e();
        }
    }

    /* renamed from: b */
    public boolean mo17974b(C5999d dVar) {
        String str;
        IOException e;
        String str2 = null;
        try {
            synchronized (this.f16659s) {
                try {
                    List<String> b = C6000e.m22617b(dVar);
                    int i = 0;
                    while (i < b.size()) {
                        String str3 = b.get(i);
                        try {
                            if (this.f16653m.mo17933e(str3, dVar)) {
                                this.f16649i.add(str3);
                                return true;
                            }
                            i++;
                            str2 = str3;
                        } catch (Throwable th) {
                            th = th;
                            try {
                                throw th;
                            } catch (IOException e2) {
                                e = e2;
                            }
                        }
                    }
                    return false;
                } catch (Throwable th2) {
                    str = str2;
                    th = th2;
                    throw th;
                }
            }
        } catch (IOException e3) {
            str = null;
            e = e3;
            C6031j h = C6031j.m22777a().mo17991d(dVar).mo17997j(str).mo17995h(e);
            this.f16648h.mo17916g(h);
            h.mo17990b();
            return false;
        }
    }

    /* renamed from: c */
    public C5992a mo17975c(C5999d dVar) {
        C5992a aVar;
        C6031j d = C6031j.m22777a().mo17991d(dVar);
        try {
            synchronized (this.f16659s) {
                List<String> b = C6000e.m22617b(dVar);
                int i = 0;
                String str = null;
                aVar = null;
                while (true) {
                    if (i >= b.size()) {
                        break;
                    }
                    str = b.get(i);
                    d.mo17997j(str);
                    aVar = this.f16653m.mo17935g(str, dVar);
                    if (aVar != null) {
                        break;
                    }
                    i++;
                }
                if (aVar == null) {
                    this.f16648h.mo17910a(d);
                    this.f16649i.remove(str);
                } else {
                    C6062k.m22839g(str);
                    this.f16648h.mo17914e(d);
                    this.f16649i.add(str);
                }
            }
            d.mo17990b();
            return aVar;
        } catch (IOException e) {
            try {
                this.f16655o.mo17909a(C5994a.C5995a.GENERIC_IO, f16641a, "getResource", e);
                d.mo17995h(e);
                this.f16648h.mo17916g(d);
                return null;
            } finally {
                d.mo17990b();
            }
        }
    }

    /* renamed from: d */
    public boolean mo17976d(C5999d dVar) {
        synchronized (this.f16659s) {
            List<String> b = C6000e.m22617b(dVar);
            for (int i = 0; i < b.size(); i++) {
                if (this.f16649i.contains(b.get(i))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: e */
    public void mo17977e(C5999d dVar) {
        synchronized (this.f16659s) {
            try {
                List<String> b = C6000e.m22617b(dVar);
                for (int i = 0; i < b.size(); i++) {
                    String str = b.get(i);
                    this.f16653m.remove(str);
                    this.f16649i.remove(str);
                }
            } catch (IOException e) {
                C5994a aVar = this.f16655o;
                C5994a.C5995a aVar2 = C5994a.C5995a.DELETE_FILE;
                Class<?> cls = f16641a;
                aVar.mo17909a(aVar2, cls, "delete: " + e.getMessage(), e);
            }
        }
    }

    /* renamed from: f */
    public boolean mo17978f(C5999d dVar) {
        synchronized (this.f16659s) {
            if (mo17976d(dVar)) {
                return true;
            }
            try {
                List<String> b = C6000e.m22617b(dVar);
                for (int i = 0; i < b.size(); i++) {
                    String str = b.get(i);
                    if (this.f16653m.mo17934f(str, dVar)) {
                        this.f16649i.add(str);
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    /* renamed from: g */
    public C5992a mo17979g(C5999d dVar, C6005j jVar) {
        String a;
        C6019d.C6021b r;
        C6031j d = C6031j.m22777a().mo17991d(dVar);
        this.f16648h.mo17917h(d);
        synchronized (this.f16659s) {
            a = C6000e.m22616a(dVar);
        }
        d.mo17997j(a);
        try {
            r = m22741r(a, dVar);
            r.mo17954j(jVar, dVar);
            C5992a l = m22735l(r, dVar, a);
            d.mo17996i(l.size()).mo17993f(this.f16657q.mo17982b());
            this.f16648h.mo17915f(d);
            if (!r.mo17953i()) {
                C6071a.m22871e(f16641a, "Failed to delete temp file");
            }
            d.mo17990b();
            return l;
        } catch (IOException e) {
            try {
                d.mo17995h(e);
                this.f16648h.mo17913d(d);
                C6071a.m22872f(f16641a, "Failed inserting a file into the cache", e);
                throw e;
            } catch (Throwable th) {
                d.mo17990b();
                throw th;
            }
        } catch (Throwable th2) {
            if (!r.mo17953i()) {
                C6071a.m22871e(f16641a, "Failed to delete temp file");
            }
            throw th2;
        }
    }
}
