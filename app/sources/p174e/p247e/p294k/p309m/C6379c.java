package p174e.p247e.p294k.p309m;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p174e.p247e.p253d.p258e.C6071a;
import p174e.p247e.p294k.p311o.C6384b;

/* renamed from: e.e.k.m.c */
public class C6379c implements C6381e {

    /* renamed from: a */
    private final List<C6381e> f17779a;

    public C6379c(Set<C6381e> set) {
        this.f17779a = new ArrayList(set.size());
        for (C6381e next : set) {
            if (next != null) {
                this.f17779a.add(next);
            }
        }
    }

    public C6379c(C6381e... eVarArr) {
        this.f17779a = new ArrayList(eVarArr.length);
        for (C6381e eVar : eVarArr) {
            if (eVar != null) {
                this.f17779a.add(eVar);
            }
        }
    }

    /* renamed from: m */
    private void m24383m(String str, Throwable th) {
        C6071a.m22876j("ForwardingRequestListener", str, th);
    }

    /* renamed from: a */
    public void mo9185a(C6384b bVar, Object obj, String str, boolean z) {
        int size = this.f17779a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f17779a.get(i).mo9185a(bVar, obj, str, z);
            } catch (Exception e) {
                m24383m("InternalListener exception in onRequestStart", e);
            }
        }
    }

    /* renamed from: b */
    public void mo8332b(String str, String str2) {
        int size = this.f17779a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f17779a.get(i).mo8332b(str, str2);
            } catch (Exception e) {
                m24383m("InternalListener exception in onProducerStart", e);
            }
        }
    }

    /* renamed from: c */
    public void mo9186c(C6384b bVar, String str, boolean z) {
        int size = this.f17779a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f17779a.get(i).mo9186c(bVar, str, z);
            } catch (Exception e) {
                m24383m("InternalListener exception in onRequestSuccess", e);
            }
        }
    }

    /* renamed from: d */
    public void mo8333d(String str, String str2, Map<String, String> map) {
        int size = this.f17779a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f17779a.get(i).mo8333d(str, str2, map);
            } catch (Exception e) {
                m24383m("InternalListener exception in onProducerFinishWithCancellation", e);
            }
        }
    }

    /* renamed from: e */
    public void mo8334e(String str, String str2, boolean z) {
        int size = this.f17779a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f17779a.get(i).mo8334e(str, str2, z);
            } catch (Exception e) {
                m24383m("InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    /* renamed from: f */
    public boolean mo8335f(String str) {
        int size = this.f17779a.size();
        for (int i = 0; i < size; i++) {
            if (this.f17779a.get(i).mo8335f(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public void mo9187g(C6384b bVar, String str, Throwable th, boolean z) {
        int size = this.f17779a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f17779a.get(i).mo9187g(bVar, str, th, z);
            } catch (Exception e) {
                m24383m("InternalListener exception in onRequestFailure", e);
            }
        }
    }

    /* renamed from: h */
    public void mo8336h(String str, String str2, String str3) {
        int size = this.f17779a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f17779a.get(i).mo8336h(str, str2, str3);
            } catch (Exception e) {
                m24383m("InternalListener exception in onIntermediateChunkStart", e);
            }
        }
    }

    /* renamed from: i */
    public void mo8337i(String str, String str2, Map<String, String> map) {
        int size = this.f17779a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f17779a.get(i).mo8337i(str, str2, map);
            } catch (Exception e) {
                m24383m("InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    /* renamed from: j */
    public void mo8338j(String str, String str2, Throwable th, Map<String, String> map) {
        int size = this.f17779a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f17779a.get(i).mo8338j(str, str2, th, map);
            } catch (Exception e) {
                m24383m("InternalListener exception in onProducerFinishWithFailure", e);
            }
        }
    }

    /* renamed from: k */
    public void mo9188k(String str) {
        int size = this.f17779a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f17779a.get(i).mo9188k(str);
            } catch (Exception e) {
                m24383m("InternalListener exception in onRequestCancellation", e);
            }
        }
    }

    /* renamed from: l */
    public void mo18918l(C6381e eVar) {
        this.f17779a.add(eVar);
    }
}
