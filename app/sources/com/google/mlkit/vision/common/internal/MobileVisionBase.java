package com.google.mlkit.vision.common.internal;

import androidx.annotation.RecentlyNonNull;
import androidx.lifecycle.C1286d;
import androidx.lifecycle.C1290f;
import androidx.lifecycle.C1302o;
import com.google.android.gms.common.internal.C3675i;
import com.google.android.gms.common.internal.C3705r;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;
import p174e.p319f.p320a.p335c.p345f.p355j.C7722u6;
import p174e.p319f.p320a.p335c.p362h.C8943b;
import p174e.p319f.p320a.p335c.p362h.C8963l;
import p174e.p319f.p320a.p335c.p362h.C8969o;
import p174e.p319f.p406d.p407a.C9585a;
import p174e.p319f.p406d.p407a.p409c.C9601f;
import p174e.p319f.p406d.p411b.p413b.C9631a;

public class MobileVisionBase<DetectionResultT> implements Closeable, C1290f {

    /* renamed from: f */
    private static final C3675i f13844f = new C3675i("MobileVisionBase", HttpUrl.FRAGMENT_ENCODE_SET);

    /* renamed from: o */
    public static final /* synthetic */ int f13845o = 0;

    /* renamed from: p */
    private final AtomicBoolean f13846p = new AtomicBoolean(false);

    /* renamed from: q */
    private final C9601f<DetectionResultT, C9631a> f13847q;

    /* renamed from: r */
    private final C8943b f13848r;

    /* renamed from: s */
    private final Executor f13849s;

    public MobileVisionBase(@RecentlyNonNull C9601f<DetectionResultT, C9631a> fVar, @RecentlyNonNull Executor executor) {
        this.f13847q = fVar;
        C8943b bVar = new C8943b();
        this.f13848r = bVar;
        this.f13849s = executor;
        fVar.mo24101c();
        fVar.mo24100a(executor, C4971h.f13863a, bVar.mo22756b()).mo22768d(C4969f.f13860a);
    }

    @RecentlyNonNull
    /* renamed from: a */
    public synchronized C8963l<DetectionResultT> mo14971a(@RecentlyNonNull C9631a aVar) {
        C3705r.m14347l(aVar, "InputImage can not be null");
        if (this.f13846p.get()) {
            return C8969o.m29866e(new C9585a("This detector is already closed!", 14));
        } else if (aVar.mo24134k() < 32 || aVar.mo24130g() < 32) {
            return C8969o.m29866e(new C9585a("InputImage width and height should be at least 32!", 3));
        } else {
            return this.f13847q.mo24100a(this.f13849s, new C4970g(this, aVar), this.f13848r.mo22756b());
        }
    }

    @C1302o(C1286d.C1287a.ON_DESTROY)
    public synchronized void close() {
        if (!this.f13846p.getAndSet(true)) {
            this.f13848r.mo22755a();
            this.f13847q.mo24102e(this.f13849s);
        }
    }

    @RecentlyNonNull
    /* renamed from: o */
    public final /* synthetic */ Object mo14973o(@RecentlyNonNull C9631a aVar) {
        C7722u6 A = C7722u6.m27794A("detectorTaskWithResource#run");
        A.mo21165b();
        try {
            DetectionResultT h = this.f13847q.mo14958h(aVar);
            A.close();
            return h;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
