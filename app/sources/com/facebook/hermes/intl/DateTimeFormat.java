package com.facebook.hermes.intl;

import android.os.Build;
import com.facebook.hermes.intl.C2326d;
import com.facebook.hermes.intl.C2366q;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import p174e.p247e.p317m.p318a.C6410a;

@C6410a
public class DateTimeFormat {

    /* renamed from: a */
    C2326d f6855a;

    /* renamed from: b */
    private C2320b<?> f6856b = null;

    /* renamed from: c */
    private C2320b<?> f6857c = null;

    /* renamed from: d */
    private boolean f6858d;

    /* renamed from: e */
    private String f6859e;

    /* renamed from: f */
    private boolean f6860f;

    /* renamed from: g */
    private String f6861g;

    /* renamed from: h */
    private C2326d.C2332f f6862h;

    /* renamed from: i */
    private C2326d.C2330d f6863i;

    /* renamed from: j */
    private C2326d.C2337k f6864j;

    /* renamed from: k */
    private C2326d.C2329c f6865k;

    /* renamed from: l */
    private C2326d.C2338l f6866l;

    /* renamed from: m */
    private C2326d.C2334h f6867m;

    /* renamed from: n */
    private C2326d.C2328b f6868n;

    /* renamed from: o */
    private C2326d.C2331e f6869o;

    /* renamed from: p */
    private C2326d.C2333g f6870p;

    /* renamed from: q */
    private C2326d.C2335i f6871q;

    /* renamed from: r */
    private C2326d.C2336j f6872r;

    /* renamed from: s */
    private Object f6873s = null;

    @C6410a
    public DateTimeFormat(List<String> list, Map<String, Object> map) {
        this.f6855a = Build.VERSION.SDK_INT >= 24 ? new C2376v() : new C2374u();
        m9633c(list, map);
        C2326d dVar = this.f6855a;
        C2320b<?> bVar = this.f6856b;
        boolean z = this.f6858d;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        dVar.mo7954e(bVar, z ? str : this.f6859e, !this.f6860f ? this.f6861g : str, this.f6863i, this.f6864j, this.f6865k, this.f6866l, this.f6867m, this.f6868n, this.f6869o, this.f6870p, this.f6871q, this.f6872r, this.f6862h, this.f6873s);
    }

    /* renamed from: a */
    private Object m9631a() {
        return this.f6855a.mo7953d(this.f6856b);
    }

    /* renamed from: b */
    private Object m9632b(Object obj, String str, String str2) {
        Object obj2 = obj;
        String str3 = str;
        String str4 = str2;
        if (C2350g.m9725l(obj)) {
            boolean z = true;
            if (str3.equals("date") || str3.equals("any")) {
                String[] strArr = {"weekday", "year", "month", "day"};
                for (int i = 0; i < 4; i++) {
                    if (!C2350g.m9727n(C2350g.m9714a(obj2, strArr[i]))) {
                        z = false;
                    }
                }
            }
            if (str3.equals("time") || str3.equals("any")) {
                String[] strArr2 = {"hour", "minute", "second"};
                for (int i2 = 0; i2 < 3; i2++) {
                    if (!C2350g.m9727n(C2350g.m9714a(obj2, strArr2[i2]))) {
                        z = false;
                    }
                }
            }
            if (z && (str4.equals("date") || str4.equals("all"))) {
                String[] strArr3 = {"year", "month", "day"};
                for (int i3 = 0; i3 < 3; i3++) {
                    C2350g.m9716c(obj2, strArr3[i3], "numeric");
                }
            }
            if (z && (str4.equals("time") || str4.equals("all"))) {
                String[] strArr4 = {"hour", "minute", "second"};
                for (int i4 = 0; i4 < 3; i4++) {
                    C2350g.m9716c(obj2, strArr4[i4], "numeric");
                }
            }
            return obj2;
        }
        throw new C2354h("Invalid options object !");
    }

    /* renamed from: c */
    private void m9633c(List<String> list, Map<String, Object> map) {
        String str;
        String str2;
        C2326d.C2332f fVar;
        List asList = Arrays.asList(new String[]{"ca", "nu", "hc"});
        Object b = m9632b(map, "any", "date");
        Object q = C2350g.m9730q();
        C2366q.C2367a aVar = C2366q.C2367a.STRING;
        C2350g.m9716c(q, "localeMatcher", C2366q.m9806c(b, "localeMatcher", aVar, C2319a.f6896a, "best fit"));
        Object c = C2366q.m9806c(b, "calendar", aVar, C2350g.m9717d(), C2350g.m9717d());
        if (C2350g.m9727n(c) || m9634d(C2350g.m9721h(c))) {
            C2350g.m9716c(q, "ca", c);
            Object c2 = C2366q.m9806c(b, "numberingSystem", aVar, C2350g.m9717d(), C2350g.m9717d());
            if (C2350g.m9727n(c2) || m9634d(C2350g.m9721h(c2))) {
                C2350g.m9716c(q, "nu", c2);
                Object c3 = C2366q.m9806c(b, "hour12", C2366q.C2367a.BOOLEAN, C2350g.m9717d(), C2350g.m9717d());
                Object c4 = C2366q.m9806c(b, "hourCycle", aVar, new String[]{"h11", "h12", "h23", "h24"}, C2350g.m9717d());
                if (!C2350g.m9727n(c3)) {
                    c4 = C2350g.m9715b();
                }
                C2350g.m9716c(q, "hc", c4);
                HashMap<String, Object> a = C2365p.m9803a(list, q, asList);
                C2320b<?> bVar = (C2320b) C2350g.m9720g(a).get("locale");
                this.f6856b = bVar;
                this.f6857c = bVar.mo7936e();
                Object a2 = C2350g.m9714a(a, "ca");
                if (!C2350g.m9723j(a2)) {
                    this.f6858d = false;
                    str = C2350g.m9721h(a2);
                } else {
                    this.f6858d = true;
                    str = this.f6855a.mo7957h(this.f6856b);
                }
                this.f6859e = str;
                Object a3 = C2350g.m9714a(a, "nu");
                if (!C2350g.m9723j(a3)) {
                    this.f6860f = false;
                    str2 = C2350g.m9721h(a3);
                } else {
                    this.f6860f = true;
                    str2 = this.f6855a.mo7950a(this.f6856b);
                }
                this.f6861g = str2;
                Object a4 = C2350g.m9714a(a, "hc");
                Object a5 = C2350g.m9714a(b, "timeZone");
                if (C2350g.m9727n(a5)) {
                    a5 = m9631a();
                } else if (!m9635e(m9636f(C2350g.m9721h(a5)))) {
                    throw new C2354h("Invalid timezone name!");
                }
                this.f6873s = a5;
                this.f6863i = (C2326d.C2330d) C2366q.m9807d(C2326d.C2330d.class, C2350g.m9721h(C2366q.m9806c(b, "formatMatcher", aVar, new String[]{"basic", "best fit"}, "best fit")));
                this.f6864j = (C2326d.C2337k) C2366q.m9807d(C2326d.C2337k.class, C2366q.m9806c(b, "weekday", aVar, new String[]{"long", "short", "narrow"}, C2350g.m9717d()));
                this.f6865k = (C2326d.C2329c) C2366q.m9807d(C2326d.C2329c.class, C2366q.m9806c(b, "era", aVar, new String[]{"long", "short", "narrow"}, C2350g.m9717d()));
                this.f6866l = (C2326d.C2338l) C2366q.m9807d(C2326d.C2338l.class, C2366q.m9806c(b, "year", aVar, new String[]{"numeric", "2-digit"}, C2350g.m9717d()));
                this.f6867m = (C2326d.C2334h) C2366q.m9807d(C2326d.C2334h.class, C2366q.m9806c(b, "month", aVar, new String[]{"numeric", "2-digit", "long", "short", "narrow"}, C2350g.m9717d()));
                this.f6868n = (C2326d.C2328b) C2366q.m9807d(C2326d.C2328b.class, C2366q.m9806c(b, "day", aVar, new String[]{"numeric", "2-digit"}, C2350g.m9717d()));
                Object c5 = C2366q.m9806c(b, "hour", aVar, new String[]{"numeric", "2-digit"}, C2350g.m9717d());
                this.f6869o = (C2326d.C2331e) C2366q.m9807d(C2326d.C2331e.class, c5);
                this.f6870p = (C2326d.C2333g) C2366q.m9807d(C2326d.C2333g.class, C2366q.m9806c(b, "minute", aVar, new String[]{"numeric", "2-digit"}, C2350g.m9717d()));
                this.f6871q = (C2326d.C2335i) C2366q.m9807d(C2326d.C2335i.class, C2366q.m9806c(b, "second", aVar, new String[]{"numeric", "2-digit"}, C2350g.m9717d()));
                this.f6872r = (C2326d.C2336j) C2366q.m9807d(C2326d.C2336j.class, C2366q.m9806c(b, "timeZoneName", aVar, new String[]{"long", "short"}, C2350g.m9717d()));
                if (C2350g.m9727n(c5)) {
                    fVar = C2326d.C2332f.UNDEFINED;
                } else {
                    C2326d.C2332f f = this.f6855a.mo7955f(this.f6856b);
                    fVar = C2350g.m9723j(a4) ? f : (C2326d.C2332f) C2366q.m9807d(C2326d.C2332f.class, a4);
                    if (!C2350g.m9727n(c3)) {
                        if (C2350g.m9718e(c3)) {
                            fVar = C2326d.C2332f.H11;
                            if (!(f == fVar || f == C2326d.C2332f.H23)) {
                                fVar = C2326d.C2332f.H12;
                            }
                        } else {
                            fVar = (f == C2326d.C2332f.H11 || f == C2326d.C2332f.H23) ? C2326d.C2332f.H23 : C2326d.C2332f.H24;
                        }
                    }
                }
                this.f6862h = fVar;
                return;
            }
            throw new C2354h("Invalid numbering system !");
        }
        throw new C2354h("Invalid calendar option !");
    }

    /* renamed from: d */
    private boolean m9634d(String str) {
        return C2349f.m9709o(str, 0, str.length() - 1);
    }

    /* renamed from: e */
    private boolean m9635e(String str) {
        return this.f6855a.mo7958i(str);
    }

    /* renamed from: f */
    private String m9636f(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= 'a' && charAt <= 'z') {
                charAt = (char) (charAt - ' ');
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    @C6410a
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) {
        String h = C2350g.m9721h(C2366q.m9806c(map, "localeMatcher", C2366q.C2367a.STRING, C2319a.f6896a, "best fit"));
        String[] strArr = new String[list.size()];
        return (Build.VERSION.SDK_INT < 24 || !h.equals("best fit")) ? Arrays.asList(C2360l.m9771h((String[]) list.toArray(strArr))) : Arrays.asList(C2360l.m9767d((String[]) list.toArray(strArr)));
    }

    @C6410a
    public String format(double d) {
        return this.f6855a.mo7952c(d);
    }

    @C6410a
    public List<Map<String, String>> formatToParts(double d) {
        ArrayList arrayList = new ArrayList();
        AttributedCharacterIterator b = this.f6855a.mo7951b(d);
        StringBuilder sb = new StringBuilder();
        for (char first = b.first(); first != 65535; first = b.next()) {
            sb.append(first);
            if (b.getIndex() + 1 == b.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it = b.getAttributes().keySet().iterator();
                String g = it.hasNext() ? this.f6855a.mo7956g(it.next(), sb.toString()) : "literal";
                String sb2 = sb.toString();
                sb.setLength(0);
                HashMap hashMap = new HashMap();
                hashMap.put("type", g);
                hashMap.put("value", sb2);
                arrayList.add(hashMap);
            }
        }
        return arrayList;
    }

    @C6410a
    public Map<String, Object> resolvedOptions() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f6857c.mo7932a());
        linkedHashMap.put("numberingSystem", this.f6861g);
        linkedHashMap.put("calendar", this.f6859e);
        linkedHashMap.put("timeZone", this.f6873s);
        C2326d.C2332f fVar = this.f6862h;
        if (fVar != C2326d.C2332f.UNDEFINED) {
            linkedHashMap.put("hourCycle", fVar.toString());
            C2326d.C2332f fVar2 = this.f6862h;
            linkedHashMap.put("hour12", (fVar2 == C2326d.C2332f.H11 || fVar2 == C2326d.C2332f.H12) ? Boolean.TRUE : Boolean.FALSE);
        }
        C2326d.C2337k kVar = this.f6864j;
        if (kVar != C2326d.C2337k.UNDEFINED) {
            linkedHashMap.put("weekday", kVar.toString());
        }
        C2326d.C2329c cVar = this.f6865k;
        if (cVar != C2326d.C2329c.UNDEFINED) {
            linkedHashMap.put("era", cVar.toString());
        }
        C2326d.C2338l lVar = this.f6866l;
        if (lVar != C2326d.C2338l.UNDEFINED) {
            linkedHashMap.put("year", lVar.toString());
        }
        C2326d.C2334h hVar = this.f6867m;
        if (hVar != C2326d.C2334h.UNDEFINED) {
            linkedHashMap.put("month", hVar.toString());
        }
        C2326d.C2328b bVar = this.f6868n;
        if (bVar != C2326d.C2328b.UNDEFINED) {
            linkedHashMap.put("day", bVar.toString());
        }
        C2326d.C2331e eVar = this.f6869o;
        if (eVar != C2326d.C2331e.UNDEFINED) {
            linkedHashMap.put("hour", eVar.toString());
        }
        C2326d.C2333g gVar = this.f6870p;
        if (gVar != C2326d.C2333g.UNDEFINED) {
            linkedHashMap.put("minute", gVar.toString());
        }
        C2326d.C2335i iVar = this.f6871q;
        if (iVar != C2326d.C2335i.UNDEFINED) {
            linkedHashMap.put("second", iVar.toString());
        }
        C2326d.C2336j jVar = this.f6872r;
        if (jVar != C2326d.C2336j.UNDEFINED) {
            linkedHashMap.put("timeZoneName", jVar.toString());
        }
        return linkedHashMap;
    }
}
