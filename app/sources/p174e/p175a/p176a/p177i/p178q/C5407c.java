package p174e.p175a.p176a.p177i.p178q;

import androidx.recyclerview.widget.RecyclerView;
import p174e.p175a.p176a.C5377b;
import p174e.p175a.p176a.C5380e;
import p174e.p175a.p176a.p177i.C5391h;
import p174e.p175a.p176a.p180k.C5414a;

/* renamed from: e.a.a.i.q.c */
public final class C5407c {
    /* renamed from: a */
    public static C5406b m20091a(String str, String str2) {
        if (str == null || str2 == null) {
            throw new C5377b("Parameter must not be null", 4);
        }
        C5406b bVar = new C5406b();
        C5405a aVar = new C5405a();
        aVar.f15101a = str2;
        m20093c(str, aVar, bVar);
        while (aVar.f15105e < str2.length()) {
            aVar.f15104d = aVar.f15105e;
            m20095e(str2, aVar);
            int i = aVar.f15104d;
            aVar.f15105e = i;
            C5408d d = str2.charAt(i) != '[' ? m20094d(aVar) : m20092b(aVar);
            if (d.mo16304b() == 1) {
                if (d.mo16305c().charAt(0) == '@') {
                    d.mo16310h("?" + d.mo16305c().substring(1));
                    if (!"?xml:lang".equals(d.mo16305c())) {
                        throw new C5377b("Only xml:lang allowed with '@'", 102);
                    }
                }
                if (d.mo16305c().charAt(0) == '?') {
                    aVar.f15102b++;
                    d.mo16309g(2);
                }
            } else {
                if (d.mo16304b() != 6) {
                    continue;
                } else {
                    if (d.mo16305c().charAt(1) == '@') {
                        d.mo16310h("[?" + d.mo16305c().substring(2));
                        if (!d.mo16305c().startsWith("[?xml:lang=")) {
                            throw new C5377b("Only xml:lang allowed with '@'", 102);
                        }
                    }
                    if (d.mo16305c().charAt(1) == '?') {
                        aVar.f15102b++;
                        d.mo16309g(5);
                    }
                }
                bVar.mo16299a(d);
            }
            m20096f(aVar.f15101a.substring(aVar.f15102b, aVar.f15103c));
            bVar.mo16299a(d);
        }
        return bVar;
    }

    /* renamed from: b */
    private static C5408d m20092b(C5405a aVar) {
        C5408d dVar;
        int i = aVar.f15105e + 1;
        aVar.f15105e = i;
        if ('0' > aVar.f15101a.charAt(i) || aVar.f15101a.charAt(aVar.f15105e) > '9') {
            while (aVar.f15105e < aVar.f15101a.length() && aVar.f15101a.charAt(aVar.f15105e) != ']' && aVar.f15101a.charAt(aVar.f15105e) != '=') {
                aVar.f15105e++;
            }
            if (aVar.f15105e >= aVar.f15101a.length()) {
                throw new C5377b("Missing ']' or '=' for array index", 102);
            } else if (aVar.f15101a.charAt(aVar.f15105e) != ']') {
                aVar.f15102b = aVar.f15104d + 1;
                int i2 = aVar.f15105e;
                aVar.f15103c = i2;
                int i3 = i2 + 1;
                aVar.f15105e = i3;
                char charAt = aVar.f15101a.charAt(i3);
                if (charAt == '\'' || charAt == '\"') {
                    while (true) {
                        aVar.f15105e++;
                        if (aVar.f15105e < aVar.f15101a.length()) {
                            if (aVar.f15101a.charAt(aVar.f15105e) == charAt) {
                                if (aVar.f15105e + 1 >= aVar.f15101a.length() || aVar.f15101a.charAt(aVar.f15105e + 1) != charAt) {
                                    break;
                                }
                                aVar.f15105e++;
                            }
                        } else {
                            break;
                        }
                    }
                    if (aVar.f15105e < aVar.f15101a.length()) {
                        aVar.f15105e++;
                        dVar = new C5408d((String) null, 6);
                    } else {
                        throw new C5377b("No terminating quote for array selector", 102);
                    }
                } else {
                    throw new C5377b("Invalid quote in array selector", 102);
                }
            } else if ("[last()".equals(aVar.f15101a.substring(aVar.f15104d, aVar.f15105e))) {
                dVar = new C5408d((String) null, 4);
            } else {
                throw new C5377b("Invalid non-numeric array index", 102);
            }
        } else {
            while (aVar.f15105e < aVar.f15101a.length() && '0' <= aVar.f15101a.charAt(aVar.f15105e) && aVar.f15101a.charAt(aVar.f15105e) <= '9') {
                aVar.f15105e++;
            }
            dVar = new C5408d((String) null, 3);
        }
        if (aVar.f15105e >= aVar.f15101a.length() || aVar.f15101a.charAt(aVar.f15105e) != ']') {
            throw new C5377b("Missing ']' for array index", 102);
        }
        int i4 = aVar.f15105e + 1;
        aVar.f15105e = i4;
        dVar.mo16310h(aVar.f15101a.substring(aVar.f15104d, i4));
        return dVar;
    }

    /* renamed from: c */
    private static void m20093c(String str, C5405a aVar, C5406b bVar) {
        C5408d dVar;
        while (aVar.f15105e < aVar.f15101a.length() && "/[*".indexOf(aVar.f15101a.charAt(aVar.f15105e)) < 0) {
            aVar.f15105e++;
        }
        int i = aVar.f15105e;
        int i2 = aVar.f15104d;
        if (i != i2) {
            String h = m20098h(str, aVar.f15101a.substring(i2, i));
            C5414a d = C5380e.m19891a().mo16213d(h);
            if (d == null) {
                bVar.mo16299a(new C5408d(str, RecyclerView.UNDEFINED_DURATION));
                dVar = new C5408d(h, 1);
            } else {
                bVar.mo16299a(new C5408d(d.mo16294a(), RecyclerView.UNDEFINED_DURATION));
                C5408d dVar2 = new C5408d(m20098h(d.mo16294a(), d.mo16296c()), 1);
                dVar2.mo16307e(true);
                dVar2.mo16308f(d.mo16297d().mo16325d());
                bVar.mo16299a(dVar2);
                if (d.mo16297d().mo16314i()) {
                    dVar = new C5408d("[?xml:lang='x-default']", 5);
                } else if (d.mo16297d().mo16313h()) {
                    dVar = new C5408d("[1]", 3);
                } else {
                    return;
                }
                dVar.mo16307e(true);
                dVar.mo16308f(d.mo16297d().mo16325d());
            }
            bVar.mo16299a(dVar);
            return;
        }
        throw new C5377b("Empty initial XMPPath step", 102);
    }

    /* renamed from: d */
    private static C5408d m20094d(C5405a aVar) {
        aVar.f15102b = aVar.f15104d;
        while (aVar.f15105e < aVar.f15101a.length() && "/[*".indexOf(aVar.f15101a.charAt(aVar.f15105e)) < 0) {
            aVar.f15105e++;
        }
        int i = aVar.f15105e;
        aVar.f15103c = i;
        int i2 = aVar.f15104d;
        if (i != i2) {
            return new C5408d(aVar.f15101a.substring(i2, i), 1);
        }
        throw new C5377b("Empty XMPPath segment", 102);
    }

    /* renamed from: e */
    private static void m20095e(String str, C5405a aVar) {
        if (str.charAt(aVar.f15104d) == '/') {
            int i = aVar.f15104d + 1;
            aVar.f15104d = i;
            if (i >= str.length()) {
                throw new C5377b("Empty XMPPath segment", 102);
            }
        }
        if (str.charAt(aVar.f15104d) == '*') {
            int i2 = aVar.f15104d + 1;
            aVar.f15104d = i2;
            if (i2 >= str.length() || str.charAt(aVar.f15104d) != '[') {
                throw new C5377b("Missing '[' after '*'", 102);
            }
        }
    }

    /* renamed from: f */
    private static void m20096f(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf > 0) {
            String substring = str.substring(0, indexOf);
            if (C5391h.m19958g(substring)) {
                if (C5380e.m19891a().mo16211b(substring) == null) {
                    throw new C5377b("Unknown namespace prefix for qualified name", 102);
                }
                return;
            }
        }
        throw new C5377b("Ill-formed qualified name", 102);
    }

    /* renamed from: g */
    private static void m20097g(String str) {
        if (!C5391h.m19957f(str)) {
            throw new C5377b("Bad XML name", 102);
        }
    }

    /* renamed from: h */
    private static String m20098h(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new C5377b("Schema namespace URI is required", 101);
        } else if (str2.charAt(0) == '?' || str2.charAt(0) == '@') {
            throw new C5377b("Top level name must not be a qualifier", 102);
        } else if (str2.indexOf(47) >= 0 || str2.indexOf(91) >= 0) {
            throw new C5377b("Top level name must be simple", 102);
        } else {
            String a = C5380e.m19891a().mo16210a(str);
            if (a != null) {
                int indexOf = str2.indexOf(58);
                if (indexOf < 0) {
                    m20097g(str2);
                    return a + str2;
                }
                m20097g(str2.substring(0, indexOf));
                m20097g(str2.substring(indexOf));
                String substring = str2.substring(0, indexOf + 1);
                String a2 = C5380e.m19891a().mo16210a(str);
                if (a2 == null) {
                    throw new C5377b("Unknown schema namespace prefix", 101);
                } else if (substring.equals(a2)) {
                    return str2;
                } else {
                    throw new C5377b("Schema namespace URI and prefix mismatch", 101);
                }
            } else {
                throw new C5377b("Unregistered schema namespace URI", 101);
            }
        }
    }
}
