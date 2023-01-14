package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C3408r;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p174e.p319f.p320a.p322b.C6465d;
import p174e.p319f.p320a.p322b.p323i.p327c0.C6552a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.t */
public abstract class C3412t {

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.t$a */
    public static class C3413a {

        /* renamed from: a */
        private C6552a f9657a;

        /* renamed from: b */
        private Map<C6465d, C3414b> f9658b = new HashMap();

        /* renamed from: a */
        public C3413a mo11005a(C6465d dVar, C3414b bVar) {
            this.f9658b.put(dVar, bVar);
            return this;
        }

        /* renamed from: b */
        public C3412t mo11006b() {
            Objects.requireNonNull(this.f9657a, "missing required property: clock");
            if (this.f9658b.keySet().size() >= C6465d.values().length) {
                Map<C6465d, C3414b> map = this.f9658b;
                this.f9658b = new HashMap();
                return C3412t.m13298d(this.f9657a, map);
            }
            throw new IllegalStateException("Not all priorities have been configured");
        }

        /* renamed from: c */
        public C3413a mo11007c(C6552a aVar) {
            this.f9657a = aVar;
            return this;
        }
    }

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.t$b */
    public static abstract class C3414b {

        /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.t$b$a */
        public static abstract class C3415a {
            /* renamed from: a */
            public abstract C3414b mo10998a();

            /* renamed from: b */
            public abstract C3415a mo10999b(long j);

            /* renamed from: c */
            public abstract C3415a mo11000c(Set<C3416c> set);

            /* renamed from: d */
            public abstract C3415a mo11001d(long j);
        }

        /* renamed from: a */
        public static C3415a m13309a() {
            return new C3408r.C3410b().mo11000c(Collections.emptySet());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract long mo10992b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract Set<C3416c> mo10993c();

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract long mo10994d();
    }

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.t$c */
    public enum C3416c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* renamed from: a */
    private long m13296a(int i, long j) {
        int i2 = i - 1;
        return (long) (Math.pow(3.0d, (double) i2) * ((double) j) * Math.max(1.0d, Math.log(10000.0d) / Math.log((double) ((j > 1 ? j : 2) * ((long) i2)))));
    }

    /* renamed from: b */
    public static C3413a m13297b() {
        return new C3413a();
    }

    /* renamed from: d */
    static C3412t m13298d(C6552a aVar, Map<C6465d, C3414b> map) {
        return new C3407q(aVar, map);
    }

    /* renamed from: f */
    public static C3412t m13299f(C6552a aVar) {
        return m13297b().mo11005a(C6465d.DEFAULT, C3414b.m13309a().mo10999b(30000).mo11001d(86400000).mo10998a()).mo11005a(C6465d.HIGHEST, C3414b.m13309a().mo10999b(1000).mo11001d(86400000).mo10998a()).mo11005a(C6465d.VERY_LOW, C3414b.m13309a().mo10999b(86400000).mo11001d(86400000).mo11000c(m13300i(C3416c.NETWORK_UNMETERED, C3416c.DEVICE_IDLE)).mo10998a()).mo11007c(aVar).mo11006b();
    }

    /* renamed from: i */
    private static <T> Set<T> m13300i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    /* renamed from: j */
    private void m13301j(JobInfo.Builder builder, Set<C3416c> set) {
        if (set.contains(C3416c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(C3416c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(C3416c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    /* renamed from: c */
    public JobInfo.Builder mo11003c(JobInfo.Builder builder, C6465d dVar, long j, int i) {
        builder.setMinimumLatency(mo11004g(dVar, j, i));
        m13301j(builder, mo10989h().get(dVar).mo10993c());
        return builder;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract C6552a mo10987e();

    /* renamed from: g */
    public long mo11004g(C6465d dVar, long j, int i) {
        long a = j - mo10987e().mo19339a();
        C3414b bVar = mo10989h().get(dVar);
        return Math.min(Math.max(m13296a(i, bVar.mo10992b()), a), bVar.mo10994d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract Map<C6465d, C3414b> mo10989h();
}
