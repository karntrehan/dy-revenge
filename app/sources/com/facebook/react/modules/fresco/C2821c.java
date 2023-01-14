package com.facebook.react.modules.fresco;

import android.util.Pair;
import com.facebook.systrace.C3294a;
import java.util.HashMap;
import java.util.Map;
import p174e.p247e.p294k.p309m.C6377a;
import p174e.p247e.p294k.p311o.C6384b;

/* renamed from: com.facebook.react.modules.fresco.c */
public class C2821c extends C6377a {

    /* renamed from: a */
    int f7971a = 0;

    /* renamed from: b */
    Map<String, Pair<Integer, String>> f7972b = new HashMap();

    /* renamed from: c */
    Map<String, Pair<Integer, String>> f7973c = new HashMap();

    /* renamed from: a */
    public void mo9185a(C6384b bVar, Object obj, String str, boolean z) {
        if (C3294a.m12886h(0)) {
            Pair create = Pair.create(Integer.valueOf(this.f7971a), "FRESCO_REQUEST_" + bVar.mo18938r().toString().replace(':', '_'));
            C3294a.m12879a(0, (String) create.second, this.f7971a);
            this.f7973c.put(str, create);
            this.f7971a = this.f7971a + 1;
        }
    }

    /* renamed from: b */
    public void mo8332b(String str, String str2) {
        if (C3294a.m12886h(0)) {
            Pair create = Pair.create(Integer.valueOf(this.f7971a), "FRESCO_PRODUCER_" + str2.replace(':', '_'));
            C3294a.m12879a(0, (String) create.second, this.f7971a);
            this.f7972b.put(str, create);
            this.f7971a = this.f7971a + 1;
        }
    }

    /* renamed from: c */
    public void mo9186c(C6384b bVar, String str, boolean z) {
        if (C3294a.m12886h(0) && this.f7973c.containsKey(str)) {
            Pair pair = this.f7973c.get(str);
            C3294a.m12883e(0, (String) pair.second, ((Integer) pair.first).intValue());
            this.f7973c.remove(str);
        }
    }

    /* renamed from: d */
    public void mo8333d(String str, String str2, Map<String, String> map) {
        if (C3294a.m12886h(0) && this.f7972b.containsKey(str)) {
            Pair pair = this.f7972b.get(str);
            C3294a.m12883e(0, (String) pair.second, ((Integer) pair.first).intValue());
            this.f7972b.remove(str);
        }
    }

    /* renamed from: f */
    public boolean mo8335f(String str) {
        return false;
    }

    /* renamed from: g */
    public void mo9187g(C6384b bVar, String str, Throwable th, boolean z) {
        if (C3294a.m12886h(0) && this.f7973c.containsKey(str)) {
            Pair pair = this.f7973c.get(str);
            C3294a.m12883e(0, (String) pair.second, ((Integer) pair.first).intValue());
            this.f7973c.remove(str);
        }
    }

    /* renamed from: h */
    public void mo8336h(String str, String str2, String str3) {
        if (C3294a.m12886h(0)) {
            C3294a.m12890l(0, "FRESCO_PRODUCER_EVENT_" + str.replace(':', '_') + "_" + str2.replace(':', '_') + "_" + str3.replace(':', '_'), C3294a.C3295a.THREAD);
        }
    }

    /* renamed from: i */
    public void mo8337i(String str, String str2, Map<String, String> map) {
        if (C3294a.m12886h(0) && this.f7972b.containsKey(str)) {
            Pair pair = this.f7972b.get(str);
            C3294a.m12883e(0, (String) pair.second, ((Integer) pair.first).intValue());
            this.f7972b.remove(str);
        }
    }

    /* renamed from: j */
    public void mo8338j(String str, String str2, Throwable th, Map<String, String> map) {
        if (C3294a.m12886h(0) && this.f7972b.containsKey(str)) {
            Pair pair = this.f7972b.get(str);
            C3294a.m12883e(0, (String) pair.second, ((Integer) pair.first).intValue());
            this.f7972b.remove(str);
        }
    }

    /* renamed from: k */
    public void mo9188k(String str) {
        if (C3294a.m12886h(0) && this.f7973c.containsKey(str)) {
            Pair pair = this.f7973c.get(str);
            C3294a.m12883e(0, (String) pair.second, ((Integer) pair.first).intValue());
            this.f7973c.remove(str);
        }
    }
}
