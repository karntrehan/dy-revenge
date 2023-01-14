package com.facebook.hermes.intl;

import android.os.Build;
import com.facebook.hermes.intl.C2321c;
import com.facebook.hermes.intl.C2366q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p174e.p247e.p317m.p318a.C6410a;

@C6410a
public class Collator {

    /* renamed from: a */
    private C2321c.C2325d f6846a;

    /* renamed from: b */
    private C2321c.C2324c f6847b;

    /* renamed from: c */
    private boolean f6848c;

    /* renamed from: d */
    private String f6849d = "default";

    /* renamed from: e */
    private boolean f6850e;

    /* renamed from: f */
    private C2321c.C2323b f6851f;

    /* renamed from: g */
    private C2320b<?> f6852g;

    /* renamed from: h */
    private C2320b<?> f6853h;

    /* renamed from: i */
    private C2321c f6854i;

    @C6410a
    public Collator(List<String> list, Map<String, Object> map) {
        this.f6854i = Build.VERSION.SDK_INT >= 24 ? new C2372t() : new C2370s();
        m9630a(list, map);
        this.f6854i.mo7941b(this.f6852g).mo7944e(this.f6850e).mo7943d(this.f6851f).mo7945f(this.f6847b).mo7946g(this.f6848c);
    }

    /* renamed from: a */
    private void m9630a(List<String> list, Map<String, Object> map) {
        C2366q.C2367a aVar = C2366q.C2367a.STRING;
        this.f6846a = (C2321c.C2325d) C2366q.m9807d(C2321c.C2325d.class, C2350g.m9721h(C2366q.m9806c(map, "usage", aVar, C2319a.f6900e, "sort")));
        Object q = C2350g.m9730q();
        C2350g.m9716c(q, "localeMatcher", C2366q.m9806c(map, "localeMatcher", aVar, C2319a.f6896a, "best fit"));
        Object c = C2366q.m9806c(map, "numeric", C2366q.C2367a.BOOLEAN, C2350g.m9717d(), C2350g.m9717d());
        if (!C2350g.m9727n(c)) {
            c = C2350g.m9731r(String.valueOf(C2350g.m9718e(c)));
        }
        C2350g.m9716c(q, "kn", c);
        C2350g.m9716c(q, "kf", C2366q.m9806c(map, "caseFirst", aVar, C2319a.f6899d, C2350g.m9717d()));
        HashMap<String, Object> a = C2365p.m9803a(list, q, Arrays.asList(new String[]{"co", "kf", "kn"}));
        C2320b<?> bVar = (C2320b) C2350g.m9720g(a).get("locale");
        this.f6852g = bVar;
        this.f6853h = bVar.mo7936e();
        Object a2 = C2350g.m9714a(a, "co");
        if (C2350g.m9723j(a2)) {
            a2 = C2350g.m9731r("default");
        }
        this.f6849d = C2350g.m9721h(a2);
        Object a3 = C2350g.m9714a(a, "kn");
        this.f6850e = C2350g.m9723j(a3) ? false : Boolean.parseBoolean(C2350g.m9721h(a3));
        Object a4 = C2350g.m9714a(a, "kf");
        if (C2350g.m9723j(a4)) {
            a4 = C2350g.m9731r("false");
        }
        this.f6851f = (C2321c.C2323b) C2366q.m9807d(C2321c.C2323b.class, C2350g.m9721h(a4));
        if (this.f6846a == C2321c.C2325d.SEARCH) {
            ArrayList<String> c2 = this.f6852g.mo7934c("collation");
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = c2.iterator();
            while (it.hasNext()) {
                arrayList.add(C2382y.m9892e(it.next()));
            }
            arrayList.add(C2382y.m9892e("search"));
            this.f6852g.mo7938g("co", arrayList);
        }
        Object c3 = C2366q.m9806c(map, "sensitivity", C2366q.C2367a.STRING, C2319a.f6898c, C2350g.m9717d());
        this.f6847b = !C2350g.m9727n(c3) ? (C2321c.C2324c) C2366q.m9807d(C2321c.C2324c.class, C2350g.m9721h(c3)) : this.f6846a == C2321c.C2325d.SORT ? C2321c.C2324c.VARIANT : C2321c.C2324c.LOCALE;
        this.f6848c = C2350g.m9718e(C2366q.m9806c(map, "ignorePunctuation", C2366q.C2367a.BOOLEAN, C2350g.m9717d(), Boolean.FALSE));
    }

    @C6410a
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) {
        return (Build.VERSION.SDK_INT < 24 || !C2350g.m9721h(C2366q.m9806c(map, "localeMatcher", C2366q.C2367a.STRING, C2319a.f6896a, "best fit")).equals("best fit")) ? Arrays.asList(C2360l.m9771h((String[]) list.toArray(new String[list.size()]))) : Arrays.asList(C2360l.m9767d((String[]) list.toArray(new String[list.size()])));
    }

    @C6410a
    public double compare(String str, String str2) {
        return (double) this.f6854i.mo7940a(str, str2);
    }

    @C6410a
    public Map<String, Object> resolvedOptions() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f6853h.mo7932a().replace("-kn-true", "-kn"));
        linkedHashMap.put("usage", this.f6846a.toString());
        C2321c.C2324c cVar = this.f6847b;
        if (cVar == C2321c.C2324c.LOCALE) {
            cVar = this.f6854i.mo7942c();
        }
        linkedHashMap.put("sensitivity", cVar.toString());
        linkedHashMap.put("ignorePunctuation", Boolean.valueOf(this.f6848c));
        linkedHashMap.put("collation", this.f6849d);
        linkedHashMap.put("numeric", Boolean.valueOf(this.f6850e));
        linkedHashMap.put("caseFirst", this.f6851f.toString());
        return linkedHashMap;
    }
}
