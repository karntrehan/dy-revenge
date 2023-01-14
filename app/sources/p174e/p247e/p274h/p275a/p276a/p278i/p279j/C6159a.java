package p174e.p247e.p274h.p275a.p276a.p278i.p279j;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.facebook.common.time.C2317b;
import java.io.Closeable;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p257d.C6065n;
import p174e.p247e.p274h.p275a.p276a.p278i.C6157h;
import p174e.p247e.p274h.p275a.p276a.p278i.C6158i;
import p174e.p247e.p289i.p291b.p292a.C6244a;
import p174e.p247e.p289i.p291b.p292a.C6245b;
import p174e.p247e.p294k.p307k.C6372g;

/* renamed from: e.e.h.a.a.i.j.a */
public class C6159a extends C6244a<C6372g> implements Closeable {

    /* renamed from: o */
    private final C2317b f16937o;

    /* renamed from: p */
    private final C6158i f16938p;

    /* renamed from: q */
    private final C6157h f16939q;

    /* renamed from: r */
    private final C6065n<Boolean> f16940r;

    /* renamed from: s */
    private final C6065n<Boolean> f16941s;

    /* renamed from: t */
    private Handler f16942t;

    /* renamed from: e.e.h.a.a.i.j.a$a */
    static class C6160a extends Handler {

        /* renamed from: a */
        private final C6157h f16943a;

        public C6160a(Looper looper, C6157h hVar) {
            super(looper);
            this.f16943a = hVar;
        }

        public void handleMessage(Message message) {
            C6158i iVar = (C6158i) C6062k.m22839g(message.obj);
            int i = message.what;
            if (i == 1) {
                this.f16943a.mo18205b(iVar, message.arg1);
            } else if (i == 2) {
                this.f16943a.mo18204a(iVar, message.arg1);
            }
        }
    }

    public C6159a(C2317b bVar, C6158i iVar, C6157h hVar, C6065n<Boolean> nVar, C6065n<Boolean> nVar2) {
        this.f16937o = bVar;
        this.f16938p = iVar;
        this.f16939q = hVar;
        this.f16940r = nVar;
        this.f16941s = nVar2;
    }

    /* renamed from: E */
    private synchronized void m23231E() {
        if (this.f16942t == null) {
            HandlerThread handlerThread = new HandlerThread("ImagePerfControllerListener2Thread");
            handlerThread.start();
            this.f16942t = new C6160a((Looper) C6062k.m22839g(handlerThread.getLooper()), this.f16939q);
        }
    }

    /* renamed from: I */
    private C6158i m23232I() {
        return this.f16941s.get().booleanValue() ? new C6158i() : this.f16938p;
    }

    /* renamed from: X */
    private void m23233X(C6158i iVar, long j) {
        iVar.mo18212A(false);
        iVar.mo18233t(j);
        m23236u0(iVar, 2);
    }

    /* renamed from: n0 */
    private boolean m23234n0() {
        boolean booleanValue = this.f16940r.get().booleanValue();
        if (booleanValue && this.f16942t == null) {
            m23231E();
        }
        return booleanValue;
    }

    /* renamed from: s0 */
    private void m23235s0(C6158i iVar, int i) {
        if (m23234n0()) {
            Message obtainMessage = ((Handler) C6062k.m22839g(this.f16942t)).obtainMessage();
            obtainMessage.what = 1;
            obtainMessage.arg1 = i;
            obtainMessage.obj = iVar;
            this.f16942t.sendMessage(obtainMessage);
            return;
        }
        this.f16939q.mo18205b(iVar, i);
    }

    /* renamed from: u0 */
    private void m23236u0(C6158i iVar, int i) {
        if (m23234n0()) {
            Message obtainMessage = ((Handler) C6062k.m22839g(this.f16942t)).obtainMessage();
            obtainMessage.what = 2;
            obtainMessage.arg1 = i;
            obtainMessage.obj = iVar;
            this.f16942t.sendMessage(obtainMessage);
            return;
        }
        this.f16939q.mo18204a(iVar, i);
    }

    /* renamed from: L */
    public void mo18240A(String str, C6372g gVar, C6245b.C6246a aVar) {
        long now = this.f16937o.now();
        C6158i I = m23232I();
        I.mo18226m(aVar);
        I.mo18220g(now);
        I.mo18231r(now);
        I.mo18221h(str);
        I.mo18227n(gVar);
        m23235s0(I, 3);
    }

    /* renamed from: W */
    public void mo18243a(String str, C6372g gVar) {
        long now = this.f16937o.now();
        C6158i I = m23232I();
        I.mo18223j(now);
        I.mo18221h(str);
        I.mo18227n(gVar);
        m23235s0(I, 2);
    }

    /* renamed from: b */
    public void mo18244b(String str, Object obj, C6245b.C6246a aVar) {
        long now = this.f16937o.now();
        C6158i I = m23232I();
        I.mo18216c();
        I.mo18224k(now);
        I.mo18221h(str);
        I.mo18217d(obj);
        I.mo18226m(aVar);
        m23235s0(I, 0);
        mo18246e0(I, now);
    }

    public void close() {
        mo18247i0();
    }

    /* renamed from: e0 */
    public void mo18246e0(C6158i iVar, long j) {
        iVar.mo18212A(true);
        iVar.mo18239z(j);
        m23236u0(iVar, 1);
    }

    /* renamed from: i0 */
    public void mo18247i0() {
        m23232I().mo18215b();
    }

    /* renamed from: o */
    public void mo18248o(String str, Throwable th, C6245b.C6246a aVar) {
        long now = this.f16937o.now();
        C6158i I = m23232I();
        I.mo18226m(aVar);
        I.mo18219f(now);
        I.mo18221h(str);
        I.mo18225l(th);
        m23235s0(I, 5);
        m23233X(I, now);
    }

    /* renamed from: r */
    public void mo18249r(String str, C6245b.C6246a aVar) {
        long now = this.f16937o.now();
        C6158i I = m23232I();
        I.mo18226m(aVar);
        I.mo18221h(str);
        int a = I.mo18214a();
        if (!(a == 3 || a == 5 || a == 6)) {
            I.mo18218e(now);
            m23235s0(I, 4);
        }
        m23233X(I, now);
    }
}
