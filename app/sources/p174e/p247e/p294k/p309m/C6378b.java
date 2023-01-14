package p174e.p247e.p294k.p309m;

import com.facebook.imagepipeline.producers.C2531p0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p174e.p247e.p253d.p258e.C6071a;

/* renamed from: e.e.k.m.b */
public class C6378b implements C6380d {

    /* renamed from: a */
    private final List<C6380d> f17778a;

    public C6378b(Set<C6380d> set) {
        this.f17778a = new ArrayList(set.size());
        for (C6380d next : set) {
            if (next != null) {
                this.f17778a.add(next);
            }
        }
    }

    /* renamed from: l */
    private void m24371l(String str, Throwable th) {
        C6071a.m22876j("ForwardingRequestListener2", str, th);
    }

    /* renamed from: a */
    public void mo8323a(C2531p0 p0Var, String str, String str2) {
        int size = this.f17778a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f17778a.get(i).mo8323a(p0Var, str, str2);
            } catch (Exception e) {
                m24371l("InternalListener exception in onIntermediateChunkStart", e);
            }
        }
    }

    /* renamed from: b */
    public void mo8361b(C2531p0 p0Var) {
        int size = this.f17778a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f17778a.get(i).mo8361b(p0Var);
            } catch (Exception e) {
                m24371l("InternalListener exception in onRequestStart", e);
            }
        }
    }

    /* renamed from: c */
    public void mo8324c(C2531p0 p0Var, String str, boolean z) {
        int size = this.f17778a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f17778a.get(i).mo8324c(p0Var, str, z);
            } catch (Exception e) {
                m24371l("InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    /* renamed from: d */
    public void mo8325d(C2531p0 p0Var, String str, Map<String, String> map) {
        int size = this.f17778a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f17778a.get(i).mo8325d(p0Var, str, map);
            } catch (Exception e) {
                m24371l("InternalListener exception in onProducerFinishWithCancellation", e);
            }
        }
    }

    /* renamed from: e */
    public void mo8326e(C2531p0 p0Var, String str) {
        int size = this.f17778a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f17778a.get(i).mo8326e(p0Var, str);
            } catch (Exception e) {
                m24371l("InternalListener exception in onProducerStart", e);
            }
        }
    }

    /* renamed from: f */
    public void mo8362f(C2531p0 p0Var) {
        int size = this.f17778a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f17778a.get(i).mo8362f(p0Var);
            } catch (Exception e) {
                m24371l("InternalListener exception in onRequestSuccess", e);
            }
        }
    }

    /* renamed from: g */
    public boolean mo8327g(C2531p0 p0Var, String str) {
        int size = this.f17778a.size();
        for (int i = 0; i < size; i++) {
            if (this.f17778a.get(i).mo8327g(p0Var, str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public void mo8363h(C2531p0 p0Var, Throwable th) {
        int size = this.f17778a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f17778a.get(i).mo8363h(p0Var, th);
            } catch (Exception e) {
                m24371l("InternalListener exception in onRequestFailure", e);
            }
        }
    }

    /* renamed from: i */
    public void mo8364i(C2531p0 p0Var) {
        int size = this.f17778a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f17778a.get(i).mo8364i(p0Var);
            } catch (Exception e) {
                m24371l("InternalListener exception in onRequestCancellation", e);
            }
        }
    }

    /* renamed from: j */
    public void mo8328j(C2531p0 p0Var, String str, Map<String, String> map) {
        int size = this.f17778a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f17778a.get(i).mo8328j(p0Var, str, map);
            } catch (Exception e) {
                m24371l("InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    /* renamed from: k */
    public void mo8329k(C2531p0 p0Var, String str, Throwable th, Map<String, String> map) {
        int size = this.f17778a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f17778a.get(i).mo8329k(p0Var, str, th, map);
            } catch (Exception e) {
                m24371l("InternalListener exception in onProducerFinishWithFailure", e);
            }
        }
    }
}
