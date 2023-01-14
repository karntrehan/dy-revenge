package com.facebook.hermes.intl;

import android.os.Build;
import com.facebook.hermes.intl.C2339e;
import com.facebook.hermes.intl.C2366q;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import p174e.p247e.p317m.p318a.C6410a;

@C6410a
public class NumberFormat {

    /* renamed from: a */
    private static String[] f6874a = {"acre", "bit", "byte", "celsius", "centimeter", "day", "degree", "fahrenheit", "fluid-ounce", "foot", "gallon", "gigabit", "gigabyte", "gram", "hectare", "hour", "inch", "kilobit", "kilobyte", "kilogram", "kilometer", "liter", "megabit", "megabyte", "meter", "mile", "mile-scandinavian", "milliliter", "millimeter", "millisecond", "minute", "month", "ounce", "percent", "petabyte", "pound", "second", "stone", "terabit", "terabyte", "week", "yard", "year"};

    /* renamed from: b */
    private C2339e.C2347h f6875b;

    /* renamed from: c */
    private String f6876c = null;

    /* renamed from: d */
    private C2339e.C2342c f6877d = C2339e.C2342c.SYMBOL;

    /* renamed from: e */
    private C2339e.C2343d f6878e = C2339e.C2343d.STANDARD;

    /* renamed from: f */
    private String f6879f = null;

    /* renamed from: g */
    private C2339e.C2348i f6880g;

    /* renamed from: h */
    private boolean f6881h = true;

    /* renamed from: i */
    private int f6882i = -1;

    /* renamed from: j */
    private int f6883j = -1;

    /* renamed from: k */
    private int f6884k = -1;

    /* renamed from: l */
    private int f6885l = -1;

    /* renamed from: m */
    private int f6886m = -1;

    /* renamed from: n */
    private C2339e.C2345f f6887n;

    /* renamed from: o */
    private C2339e.C2346g f6888o = C2339e.C2346g.AUTO;

    /* renamed from: p */
    private C2339e f6889p;

    /* renamed from: q */
    private boolean f6890q;

    /* renamed from: r */
    private String f6891r = null;

    /* renamed from: s */
    private C2339e.C2344e f6892s = null;

    /* renamed from: t */
    private C2339e.C2341b f6893t;

    /* renamed from: u */
    private C2320b<?> f6894u = null;

    /* renamed from: v */
    private C2320b<?> f6895v = null;

    @C6410a
    public NumberFormat(List<String> list, Map<String, Object> map) {
        this.f6889p = Build.VERSION.SDK_INT >= 24 ? new C2380x() : new C2378w();
        m9638a(list, map);
        this.f6889p.mo7990k(this.f6894u, this.f6890q ? HttpUrl.FRAGMENT_ENCODE_SET : this.f6891r, this.f6875b, this.f6878e, this.f6892s, this.f6893t).mo7985f(this.f6876c, this.f6877d).mo7989j(this.f6881h).mo7988i(this.f6882i).mo7986g(this.f6887n, this.f6885l, this.f6886m).mo7991l(this.f6887n, this.f6883j, this.f6884k).mo7984e(this.f6888o).mo7983d(this.f6879f, this.f6880g);
    }

    /* renamed from: a */
    private void m9638a(List<String> list, Map<String, Object> map) {
        String str;
        Object obj;
        double d;
        Object q = C2350g.m9730q();
        C2366q.C2367a aVar = C2366q.C2367a.STRING;
        C2350g.m9716c(q, "localeMatcher", C2366q.m9806c(map, "localeMatcher", aVar, C2319a.f6896a, "best fit"));
        Object c = C2366q.m9806c(map, "numberingSystem", aVar, C2350g.m9717d(), C2350g.m9717d());
        if (C2350g.m9727n(c) || m9639b(C2350g.m9721h(c))) {
            C2350g.m9716c(q, "nu", c);
            HashMap<String, Object> a = C2365p.m9803a(list, q, Collections.singletonList("nu"));
            C2320b<?> bVar = (C2320b) C2350g.m9720g(a).get("locale");
            this.f6894u = bVar;
            this.f6895v = bVar.mo7936e();
            Object a2 = C2350g.m9714a(a, "nu");
            if (!C2350g.m9723j(a2)) {
                this.f6890q = false;
                str = C2350g.m9721h(a2);
            } else {
                this.f6890q = true;
                str = this.f6889p.mo7980a(this.f6894u);
            }
            this.f6891r = str;
            m9645h(map);
            if (this.f6875b == C2339e.C2347h.CURRENCY) {
                d = (double) (Build.VERSION.SDK_INT >= 24 ? C2380x.m9865n(this.f6876c) : C2378w.m9843n(this.f6876c));
                obj = C2350g.m9729p(d);
            } else {
                d = 0.0d;
                obj = C2350g.m9729p(0.0d);
                if (this.f6875b != C2339e.C2347h.PERCENT) {
                    d = 3.0d;
                }
            }
            Object p = C2350g.m9729p(d);
            this.f6892s = (C2339e.C2344e) C2366q.m9807d(C2339e.C2344e.class, C2350g.m9721h(C2366q.m9806c(map, "notation", aVar, new String[]{"standard", "scientific", "engineering", "compact"}, "standard")));
            m9644g(map, obj, p);
            Object c2 = C2366q.m9806c(map, "compactDisplay", aVar, new String[]{"short", "long"}, "short");
            if (this.f6892s == C2339e.C2344e.COMPACT) {
                this.f6893t = (C2339e.C2341b) C2366q.m9807d(C2339e.C2341b.class, C2350g.m9721h(c2));
            }
            this.f6881h = C2350g.m9718e(C2366q.m9806c(map, "useGrouping", C2366q.C2367a.BOOLEAN, C2350g.m9717d(), C2350g.m9728o(true)));
            this.f6888o = (C2339e.C2346g) C2366q.m9807d(C2339e.C2346g.class, C2350g.m9721h(C2366q.m9806c(map, "signDisplay", aVar, new String[]{"auto", "never", "always", "exceptZero"}, "auto")));
            return;
        }
        throw new C2354h("Invalid numbering system !");
    }

    /* renamed from: b */
    private boolean m9639b(String str) {
        return C2349f.m9709o(str, 0, str.length() - 1);
    }

    /* renamed from: c */
    private boolean m9640c(String str) {
        return Arrays.binarySearch(f6874a, str) >= 0;
    }

    /* renamed from: d */
    private boolean m9641d(String str) {
        return m9643f(str).matches("^[A-Z][A-Z][A-Z]$");
    }

    /* renamed from: e */
    private boolean m9642e(String str) {
        if (m9640c(str)) {
            return true;
        }
        int indexOf = str.indexOf("-per-");
        return indexOf >= 0 && str.indexOf("-per-", indexOf + 1) < 0 && m9640c(str.substring(0, indexOf)) && m9640c(str.substring(indexOf + 5));
    }

    /* renamed from: f */
    private String m9643f(String str) {
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

    /* renamed from: g */
    private void m9644g(Map<String, Object> map, Object obj, Object obj2) {
        int i;
        double d;
        Object b = C2366q.m9805b(map, "minimumIntegerDigits", C2350g.m9729p(1.0d), C2350g.m9729p(21.0d), C2350g.m9729p(1.0d));
        Object a = C2350g.m9714a(map, "minimumFractionDigits");
        Object a2 = C2350g.m9714a(map, "maximumFractionDigits");
        Object a3 = C2350g.m9714a(map, "minimumSignificantDigits");
        Object a4 = C2350g.m9714a(map, "maximumSignificantDigits");
        this.f6882i = (int) Math.floor(C2350g.m9719f(b));
        if (!C2350g.m9727n(a3) || !C2350g.m9727n(a4)) {
            this.f6887n = C2339e.C2345f.SIGNIFICANT_DIGITS;
            Object a5 = C2366q.m9804a(a3, C2350g.m9729p(1.0d), C2350g.m9729p(21.0d), C2350g.m9729p(1.0d));
            Object a6 = C2366q.m9804a(a4, a5, C2350g.m9729p(21.0d), C2350g.m9729p(21.0d));
            this.f6885l = (int) Math.floor(C2350g.m9719f(a5));
            this.f6886m = (int) Math.floor(C2350g.m9719f(a6));
            return;
        }
        if (!C2350g.m9727n(a) || !C2350g.m9727n(a2)) {
            this.f6887n = C2339e.C2345f.FRACTION_DIGITS;
            Object a7 = C2366q.m9804a(a, C2350g.m9729p(0.0d), C2350g.m9729p(20.0d), obj);
            Object a8 = C2366q.m9804a(a2, a7, C2350g.m9729p(20.0d), C2350g.m9729p(Math.max(C2350g.m9719f(a7), C2350g.m9719f(obj2))));
            this.f6883j = (int) Math.floor(C2350g.m9719f(a7));
            d = C2350g.m9719f(a8);
        } else {
            C2339e.C2344e eVar = this.f6892s;
            if (eVar == C2339e.C2344e.COMPACT) {
                this.f6887n = C2339e.C2345f.COMPACT_ROUNDING;
                return;
            } else if (eVar == C2339e.C2344e.ENGINEERING) {
                this.f6887n = C2339e.C2345f.FRACTION_DIGITS;
                i = 5;
                this.f6884k = i;
            } else {
                this.f6887n = C2339e.C2345f.FRACTION_DIGITS;
                this.f6883j = (int) Math.floor(C2350g.m9719f(obj));
                d = C2350g.m9719f(obj2);
            }
        }
        i = (int) Math.floor(d);
        this.f6884k = i;
    }

    /* renamed from: h */
    private void m9645h(Map<String, Object> map) {
        C2366q.C2367a aVar = C2366q.C2367a.STRING;
        this.f6875b = (C2339e.C2347h) C2366q.m9807d(C2339e.C2347h.class, C2350g.m9721h(C2366q.m9806c(map, "style", aVar, new String[]{"decimal", "percent", "currency", "unit"}, "decimal")));
        Object c = C2366q.m9806c(map, "currency", aVar, C2350g.m9717d(), C2350g.m9717d());
        if (C2350g.m9727n(c)) {
            if (this.f6875b == C2339e.C2347h.CURRENCY) {
                throw new C2354h("Expected currency style !");
            }
        } else if (!m9641d(C2350g.m9721h(c))) {
            throw new C2354h("Malformed currency code !");
        }
        Object c2 = C2366q.m9806c(map, "currencyDisplay", aVar, new String[]{"symbol", "narrowSymbol", "code", "name"}, "symbol");
        Object c3 = C2366q.m9806c(map, "currencySign", aVar, new String[]{"accounting", "standard"}, "standard");
        Object c4 = C2366q.m9806c(map, "unit", aVar, C2350g.m9717d(), C2350g.m9717d());
        if (C2350g.m9727n(c4)) {
            if (this.f6875b == C2339e.C2347h.UNIT) {
                throw new C2354h("Expected unit !");
            }
        } else if (!m9642e(C2350g.m9721h(c4))) {
            throw new C2354h("Malformed unit identifier !");
        }
        Object c5 = C2366q.m9806c(map, "unitDisplay", aVar, new String[]{"long", "short", "narrow"}, "short");
        C2339e.C2347h hVar = this.f6875b;
        if (hVar == C2339e.C2347h.CURRENCY) {
            this.f6876c = m9643f(C2350g.m9721h(c));
            this.f6877d = (C2339e.C2342c) C2366q.m9807d(C2339e.C2342c.class, C2350g.m9721h(c2));
            this.f6878e = (C2339e.C2343d) C2366q.m9807d(C2339e.C2343d.class, C2350g.m9721h(c3));
        } else if (hVar == C2339e.C2347h.UNIT) {
            this.f6879f = C2350g.m9721h(c4);
            this.f6880g = (C2339e.C2348i) C2366q.m9807d(C2339e.C2348i.class, C2350g.m9721h(c5));
        }
    }

    @C6410a
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) {
        String h = C2350g.m9721h(C2366q.m9806c(map, "localeMatcher", C2366q.C2367a.STRING, C2319a.f6896a, "best fit"));
        String[] strArr = new String[list.size()];
        return (Build.VERSION.SDK_INT < 24 || !h.equals("best fit")) ? Arrays.asList(C2360l.m9771h((String[]) list.toArray(strArr))) : Arrays.asList(C2360l.m9767d((String[]) list.toArray(strArr)));
    }

    @C6410a
    public String format(double d) {
        return this.f6889p.mo7982c(d);
    }

    @C6410a
    public List<Map<String, String>> formatToParts(double d) {
        ArrayList arrayList = new ArrayList();
        AttributedCharacterIterator b = this.f6889p.mo7981b(d);
        StringBuilder sb = new StringBuilder();
        for (char first = b.first(); first != 65535; first = b.next()) {
            sb.append(first);
            if (b.getIndex() + 1 == b.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it = b.getAttributes().keySet().iterator();
                String h = it.hasNext() ? this.f6889p.mo7987h(it.next(), d) : "literal";
                String sb2 = sb.toString();
                sb.setLength(0);
                HashMap hashMap = new HashMap();
                hashMap.put("type", h);
                hashMap.put("value", sb2);
                arrayList.add(hashMap);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x005f  */
    @p174e.p247e.p317m.p318a.C6410a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map<java.lang.String, java.lang.Object> resolvedOptions() {
        /*
            r4 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            com.facebook.hermes.intl.b<?> r1 = r4.f6895v
            java.lang.String r1 = r1.mo7932a()
            java.lang.String r2 = "locale"
            r0.put(r2, r1)
            java.lang.String r1 = r4.f6891r
            java.lang.String r2 = "numberingSystem"
            r0.put(r2, r1)
            com.facebook.hermes.intl.e$h r1 = r4.f6875b
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "style"
            r0.put(r2, r1)
            com.facebook.hermes.intl.e$h r1 = r4.f6875b
            com.facebook.hermes.intl.e$h r2 = com.facebook.hermes.intl.C2339e.C2347h.CURRENCY
            if (r1 != r2) goto L_0x0046
            java.lang.String r1 = r4.f6876c
            java.lang.String r2 = "currency"
            r0.put(r2, r1)
            com.facebook.hermes.intl.e$c r1 = r4.f6877d
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "currencyDisplay"
            r0.put(r2, r1)
            com.facebook.hermes.intl.e$d r1 = r4.f6878e
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "currencySign"
        L_0x0042:
            r0.put(r2, r1)
            goto L_0x005a
        L_0x0046:
            com.facebook.hermes.intl.e$h r2 = com.facebook.hermes.intl.C2339e.C2347h.UNIT
            if (r1 != r2) goto L_0x005a
            java.lang.String r1 = r4.f6879f
            java.lang.String r2 = "unit"
            r0.put(r2, r1)
            com.facebook.hermes.intl.e$i r1 = r4.f6880g
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "unitDisplay"
            goto L_0x0042
        L_0x005a:
            int r1 = r4.f6882i
            r2 = -1
            if (r1 == r2) goto L_0x0068
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "minimumIntegerDigits"
            r0.put(r3, r1)
        L_0x0068:
            com.facebook.hermes.intl.e$f r1 = r4.f6887n
            com.facebook.hermes.intl.e$f r3 = com.facebook.hermes.intl.C2339e.C2345f.SIGNIFICANT_DIGITS
            if (r1 != r3) goto L_0x0089
            int r1 = r4.f6886m
            if (r1 == r2) goto L_0x007b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "minimumSignificantDigits"
            r0.put(r3, r1)
        L_0x007b:
            int r1 = r4.f6885l
            if (r1 == r2) goto L_0x00a5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "maximumSignificantDigits"
        L_0x0085:
            r0.put(r2, r1)
            goto L_0x00a5
        L_0x0089:
            com.facebook.hermes.intl.e$f r3 = com.facebook.hermes.intl.C2339e.C2345f.FRACTION_DIGITS
            if (r1 != r3) goto L_0x00a5
            int r1 = r4.f6883j
            if (r1 == r2) goto L_0x009a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "minimumFractionDigits"
            r0.put(r3, r1)
        L_0x009a:
            int r1 = r4.f6884k
            if (r1 == r2) goto L_0x00a5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "maximumFractionDigits"
            goto L_0x0085
        L_0x00a5:
            boolean r1 = r4.f6881h
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "useGrouping"
            r0.put(r2, r1)
            com.facebook.hermes.intl.e$e r1 = r4.f6892s
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "notation"
            r0.put(r2, r1)
            com.facebook.hermes.intl.e$e r1 = r4.f6892s
            com.facebook.hermes.intl.e$e r2 = com.facebook.hermes.intl.C2339e.C2344e.COMPACT
            if (r1 != r2) goto L_0x00cc
            com.facebook.hermes.intl.e$b r1 = r4.f6893t
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "compactDisplay"
            r0.put(r2, r1)
        L_0x00cc:
            com.facebook.hermes.intl.e$g r1 = r4.f6888o
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "signDisplay"
            r0.put(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.hermes.intl.NumberFormat.resolvedOptions():java.util.Map");
    }
}
