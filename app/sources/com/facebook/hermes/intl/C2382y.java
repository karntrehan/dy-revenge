package com.facebook.hermes.intl;

import android.icu.text.NumberingSystem;
import android.icu.text.RuleBasedCollator;
import android.icu.util.Calendar;
import android.icu.util.ULocale;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.hermes.intl.y */
public class C2382y {

    /* renamed from: a */
    public static String f7088a = "calendar";

    /* renamed from: b */
    public static String f7089b = "ca";

    /* renamed from: c */
    public static String f7090c = "numbers";

    /* renamed from: d */
    public static String f7091d = "nu";

    /* renamed from: e */
    public static String f7092e = "hours";

    /* renamed from: f */
    public static String f7093f = "hc";

    /* renamed from: g */
    public static String f7094g = "collation";

    /* renamed from: h */
    public static String f7095h = "co";

    /* renamed from: i */
    public static String f7096i = "colnumeric";

    /* renamed from: j */
    public static String f7097j = "kn";

    /* renamed from: k */
    public static String f7098k = "colcasefirst";

    /* renamed from: l */
    public static String f7099l = "kf";

    /* renamed from: m */
    private static HashMap<String, String> f7100m = new C2383a();

    /* renamed from: n */
    private static HashMap<String, String> f7101n = new C2384b();

    /* renamed from: o */
    private static final Map<String, String> f7102o = new C2385c();

    /* renamed from: p */
    private static Map<String, String> f7103p = new C2386d();

    /* renamed from: q */
    private static Map<String, String> f7104q = new C2387e();

    /* renamed from: r */
    private static Map<String, String[]> f7105r = new C2388f();

    /* renamed from: com.facebook.hermes.intl.y$a */
    class C2383a extends HashMap<String, String> {
        C2383a() {
            put(C2382y.f7089b, C2382y.f7088a);
            put(C2382y.f7091d, C2382y.f7090c);
            put(C2382y.f7093f, C2382y.f7092e);
            put(C2382y.f7095h, C2382y.f7094g);
            put(C2382y.f7097j, C2382y.f7096i);
            put(C2382y.f7099l, C2382y.f7098k);
        }
    }

    /* renamed from: com.facebook.hermes.intl.y$b */
    class C2384b extends HashMap<String, String> {
        C2384b() {
            put(C2382y.f7088a, C2382y.f7089b);
            put(C2382y.f7090c, C2382y.f7091d);
            put(C2382y.f7092e, C2382y.f7093f);
            put(C2382y.f7094g, C2382y.f7095h);
            put(C2382y.f7096i, C2382y.f7097j);
            put(C2382y.f7098k, C2382y.f7099l);
        }
    }

    /* renamed from: com.facebook.hermes.intl.y$c */
    class C2385c extends HashMap<String, String> {
        C2385c() {
            put("dictionary", "dict");
            put("phonebook", "phonebk");
            put("traditional", "trad");
            put("gb2312han", "gb2312");
        }
    }

    /* renamed from: com.facebook.hermes.intl.y$d */
    class C2386d extends HashMap<String, String> {
        C2386d() {
            put("gregorian", "gregory");
        }
    }

    /* renamed from: com.facebook.hermes.intl.y$e */
    class C2387e extends HashMap<String, String> {
        C2387e() {
            put("traditional", "traditio");
        }
    }

    /* renamed from: com.facebook.hermes.intl.y$f */
    class C2388f extends HashMap<String, String[]> {
        C2388f() {
            put("nu", new String[]{"adlm", "ahom", "arab", "arabext", "bali", "beng", "bhks", "brah", "cakm", "cham", "deva", "diak", "fullwide", "gong", "gonm", "gujr", "guru", "hanidec", "hmng", "hmnp", "java", "kali", "khmr", "knda", "lana", "lanatham", "laoo", "latn", "lepc", "limb", "mathbold", "mathdbl", "mathmono", "mathsanb", "mathsans", "mlym", "modi", "mong", "mroo", "mtei", "mymr", "mymrshan", "mymrtlng", "newa", "nkoo", "olck", "orya", "osma", "rohg", "saur", "segment", "shrd", "sind", "sinh", "sora", "sund", "takr", "talu", "tamldec", "telu", "thai", "tibt", "tirh", "vaii", "wara", "wcho"});
            put("co", new String[]{"big5han", "compat", "dict", "direct", "ducet", "emoji", "eor", "gb2312", "phonebk", "phonetic", "pinyin", "reformed", "searchjl", "stroke", "trad", "unihan", "zhuyin"});
            put("ca", new String[]{"buddhist", "chinese", "coptic", "dangi", "ethioaa", "ethiopic", "gregory", "hebrew", "indian", "islamic", "islamic-umalqura", "islamic-tbla", "islamic-civil", "islamic-rgsa", "iso8601", "japanese", "persian", "roc"});
        }
    }

    /* renamed from: a */
    public static String m9888a(String str) {
        return f7100m.containsKey(str) ? f7100m.get(str) : str;
    }

    /* renamed from: b */
    public static String m9889b(String str) {
        return f7101n.containsKey(str) ? f7101n.get(str) : str;
    }

    /* renamed from: c */
    public static boolean m9890c(String str, String str2, C2320b bVar) {
        List asList;
        if (Build.VERSION.SDK_INT >= 24) {
            ULocale uLocale = (ULocale) bVar.mo7939h();
            String[] strArr = new String[0];
            if (str.equals("co")) {
                if (str2.equals("standard") || str2.equals("search")) {
                    return false;
                }
                strArr = RuleBasedCollator.getKeywordValuesForLocale("co", uLocale, false);
            } else if (str.equals("ca")) {
                strArr = Calendar.getKeywordValuesForLocale("ca", uLocale, false);
            } else if (str.equals("nu")) {
                strArr = NumberingSystem.getAvailableNames();
            }
            if (strArr.length == 0) {
                return true;
            }
            asList = Arrays.asList(strArr);
        } else if (!f7105r.containsKey(str)) {
            return true;
        } else {
            asList = Arrays.asList((Object[]) f7105r.get(str));
        }
        return asList.contains(str2);
    }

    /* renamed from: d */
    public static String m9891d(String str) {
        return !f7103p.containsKey(str) ? str : f7103p.get(str);
    }

    /* renamed from: e */
    public static String m9892e(String str) {
        Map<String, String> map = f7102o;
        return !map.containsKey(str) ? str : map.get(str);
    }

    /* renamed from: f */
    public static Object m9893f(String str, Object obj) {
        return (!str.equals("ca") || !C2350g.m9726m(obj)) ? (!str.equals("nu") || !C2350g.m9726m(obj)) ? (!str.equals("co") || !C2350g.m9726m(obj)) ? (!str.equals("kn") || !C2350g.m9726m(obj) || !obj.equals("yes")) ? ((str.equals("kn") || str.equals("kf")) && C2350g.m9726m(obj) && obj.equals("no")) ? C2350g.m9731r("false") : obj : C2350g.m9731r("true") : m9892e((String) obj) : m9894g((String) obj) : m9891d((String) obj);
    }

    /* renamed from: g */
    public static String m9894g(String str) {
        return !f7104q.containsKey(str) ? str : f7104q.get(str);
    }
}
