package com.facebook.hermes.intl;

import android.icu.text.MeasureFormat;
import java.text.AttributedCharacterIterator;

/* renamed from: com.facebook.hermes.intl.e */
public interface C2339e {

    /* renamed from: com.facebook.hermes.intl.e$a */
    static /* synthetic */ class C2340a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6978a;

        /* renamed from: b */
        static final /* synthetic */ int[] f6979b;

        /* renamed from: c */
        static final /* synthetic */ int[] f6980c;

        /* renamed from: d */
        static final /* synthetic */ int[] f6981d;

        /* renamed from: e */
        static final /* synthetic */ int[] f6982e;

        /* renamed from: f */
        static final /* synthetic */ int[] f6983f;

        /* renamed from: g */
        static final /* synthetic */ int[] f6984g;

        /* JADX WARNING: Can't wrap try/catch for region: R(48:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|(2:15|16)|17|(2:19|20)|21|23|24|25|26|27|28|29|31|32|33|34|35|36|(2:37|38)|39|41|42|(2:43|44)|45|47|48|49|50|51|52|53|54|55|57|58|59|60|61|62|(3:63|64|66)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(49:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|15|16|17|(2:19|20)|21|23|24|25|26|27|28|29|31|32|33|34|35|36|(2:37|38)|39|41|42|(2:43|44)|45|47|48|49|50|51|52|53|54|55|57|58|59|60|61|62|(3:63|64|66)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(54:0|(2:1|2)|3|5|6|7|9|10|(2:11|12)|13|15|16|17|(2:19|20)|21|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|41|42|43|44|45|47|48|49|50|51|52|53|54|55|57|58|59|60|61|62|63|64|66) */
        /* JADX WARNING: Can't wrap try/catch for region: R(56:0|1|2|3|5|6|7|9|10|11|12|13|15|16|17|(2:19|20)|21|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|41|42|43|44|45|47|48|49|50|51|52|53|54|55|57|58|59|60|61|62|63|64|66) */
        /* JADX WARNING: Can't wrap try/catch for region: R(57:0|1|2|3|5|6|7|9|10|11|12|13|15|16|17|19|20|21|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|41|42|43|44|45|47|48|49|50|51|52|53|54|55|57|58|59|60|61|62|63|64|66) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0069 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x008e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0098 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00b3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00ce */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00e2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00fd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x0107 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0111 */
        static {
            /*
                com.facebook.hermes.intl.e$d[] r0 = com.facebook.hermes.intl.C2339e.C2343d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6984g = r0
                r1 = 1
                com.facebook.hermes.intl.e$d r2 = com.facebook.hermes.intl.C2339e.C2343d.ACCOUNTING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f6984g     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.hermes.intl.e$d r3 = com.facebook.hermes.intl.C2339e.C2343d.STANDARD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.facebook.hermes.intl.e$c[] r2 = com.facebook.hermes.intl.C2339e.C2342c.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f6983f = r2
                com.facebook.hermes.intl.e$c r3 = com.facebook.hermes.intl.C2339e.C2342c.SYMBOL     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f6983f     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.facebook.hermes.intl.e$c r3 = com.facebook.hermes.intl.C2339e.C2342c.NARROWSYMBOL     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                r2 = 3
                int[] r3 = f6983f     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.facebook.hermes.intl.e$c r4 = com.facebook.hermes.intl.C2339e.C2342c.CODE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                r3 = 4
                int[] r4 = f6983f     // Catch:{ NoSuchFieldError -> 0x004e }
                com.facebook.hermes.intl.e$c r5 = com.facebook.hermes.intl.C2339e.C2342c.NAME     // Catch:{ NoSuchFieldError -> 0x004e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                com.facebook.hermes.intl.e$i[] r4 = com.facebook.hermes.intl.C2339e.C2348i.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f6982e = r4
                com.facebook.hermes.intl.e$i r5 = com.facebook.hermes.intl.C2339e.C2348i.SHORT     // Catch:{ NoSuchFieldError -> 0x005f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x005f }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x005f }
            L_0x005f:
                int[] r4 = f6982e     // Catch:{ NoSuchFieldError -> 0x0069 }
                com.facebook.hermes.intl.e$i r5 = com.facebook.hermes.intl.C2339e.C2348i.NARROW     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                int[] r4 = f6982e     // Catch:{ NoSuchFieldError -> 0x0073 }
                com.facebook.hermes.intl.e$i r5 = com.facebook.hermes.intl.C2339e.C2348i.LONG     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                com.facebook.hermes.intl.e$g[] r4 = com.facebook.hermes.intl.C2339e.C2346g.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f6981d = r4
                com.facebook.hermes.intl.e$g r5 = com.facebook.hermes.intl.C2339e.C2346g.AUTO     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r4 = f6981d     // Catch:{ NoSuchFieldError -> 0x008e }
                com.facebook.hermes.intl.e$g r5 = com.facebook.hermes.intl.C2339e.C2346g.ALWAYS     // Catch:{ NoSuchFieldError -> 0x008e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x008e }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x008e }
            L_0x008e:
                int[] r4 = f6981d     // Catch:{ NoSuchFieldError -> 0x0098 }
                com.facebook.hermes.intl.e$g r5 = com.facebook.hermes.intl.C2339e.C2346g.NEVER     // Catch:{ NoSuchFieldError -> 0x0098 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0098 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0098 }
            L_0x0098:
                int[] r4 = f6981d     // Catch:{ NoSuchFieldError -> 0x00a2 }
                com.facebook.hermes.intl.e$g r5 = com.facebook.hermes.intl.C2339e.C2346g.EXCEPTZERO     // Catch:{ NoSuchFieldError -> 0x00a2 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a2 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x00a2 }
            L_0x00a2:
                com.facebook.hermes.intl.e$b[] r4 = com.facebook.hermes.intl.C2339e.C2341b.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f6980c = r4
                com.facebook.hermes.intl.e$b r5 = com.facebook.hermes.intl.C2339e.C2341b.SHORT     // Catch:{ NoSuchFieldError -> 0x00b3 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b3 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x00b3 }
            L_0x00b3:
                int[] r4 = f6980c     // Catch:{ NoSuchFieldError -> 0x00bd }
                com.facebook.hermes.intl.e$b r5 = com.facebook.hermes.intl.C2339e.C2341b.LONG     // Catch:{ NoSuchFieldError -> 0x00bd }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00bd }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x00bd }
            L_0x00bd:
                com.facebook.hermes.intl.e$e[] r4 = com.facebook.hermes.intl.C2339e.C2344e.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f6979b = r4
                com.facebook.hermes.intl.e$e r5 = com.facebook.hermes.intl.C2339e.C2344e.STANDARD     // Catch:{ NoSuchFieldError -> 0x00ce }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ce }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x00ce }
            L_0x00ce:
                int[] r4 = f6979b     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.facebook.hermes.intl.e$e r5 = com.facebook.hermes.intl.C2339e.C2344e.SCIENTIFIC     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r4 = f6979b     // Catch:{ NoSuchFieldError -> 0x00e2 }
                com.facebook.hermes.intl.e$e r5 = com.facebook.hermes.intl.C2339e.C2344e.ENGINEERING     // Catch:{ NoSuchFieldError -> 0x00e2 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e2 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x00e2 }
            L_0x00e2:
                int[] r4 = f6979b     // Catch:{ NoSuchFieldError -> 0x00ec }
                com.facebook.hermes.intl.e$e r5 = com.facebook.hermes.intl.C2339e.C2344e.COMPACT     // Catch:{ NoSuchFieldError -> 0x00ec }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ec }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x00ec }
            L_0x00ec:
                com.facebook.hermes.intl.e$h[] r4 = com.facebook.hermes.intl.C2339e.C2347h.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f6978a = r4
                com.facebook.hermes.intl.e$h r5 = com.facebook.hermes.intl.C2339e.C2347h.DECIMAL     // Catch:{ NoSuchFieldError -> 0x00fd }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fd }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x00fd }
            L_0x00fd:
                int[] r1 = f6978a     // Catch:{ NoSuchFieldError -> 0x0107 }
                com.facebook.hermes.intl.e$h r4 = com.facebook.hermes.intl.C2339e.C2347h.PERCENT     // Catch:{ NoSuchFieldError -> 0x0107 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0107 }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0107 }
            L_0x0107:
                int[] r0 = f6978a     // Catch:{ NoSuchFieldError -> 0x0111 }
                com.facebook.hermes.intl.e$h r1 = com.facebook.hermes.intl.C2339e.C2347h.CURRENCY     // Catch:{ NoSuchFieldError -> 0x0111 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0111 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0111 }
            L_0x0111:
                int[] r0 = f6978a     // Catch:{ NoSuchFieldError -> 0x011b }
                com.facebook.hermes.intl.e$h r1 = com.facebook.hermes.intl.C2339e.C2347h.UNIT     // Catch:{ NoSuchFieldError -> 0x011b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011b }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x011b }
            L_0x011b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.hermes.intl.C2339e.C2340a.<clinit>():void");
        }
    }

    /* renamed from: com.facebook.hermes.intl.e$b */
    public enum C2341b {
        SHORT,
        LONG;

        public String toString() {
            int i = C2340a.f6980c[ordinal()];
            if (i == 1) {
                return "short";
            }
            if (i == 2) {
                return "long";
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: com.facebook.hermes.intl.e$c */
    public enum C2342c {
        SYMBOL,
        NARROWSYMBOL,
        CODE,
        NAME;

        /* renamed from: e */
        public int mo7993e() {
            return C2340a.f6983f[ordinal()] != 4 ? 0 : 1;
        }

        public String toString() {
            int i = C2340a.f6983f[ordinal()];
            if (i == 1) {
                return "symbol";
            }
            if (i == 2) {
                return "narrowSymbol";
            }
            if (i == 3) {
                return "code";
            }
            if (i == 4) {
                return "name";
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: com.facebook.hermes.intl.e$d */
    public enum C2343d {
        STANDARD,
        ACCOUNTING;

        public String toString() {
            int i = C2340a.f6984g[ordinal()];
            if (i == 1) {
                return "accounting";
            }
            if (i == 2) {
                return "standard";
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: com.facebook.hermes.intl.e$e */
    public enum C2344e {
        STANDARD,
        SCIENTIFIC,
        ENGINEERING,
        COMPACT;

        public String toString() {
            int i = C2340a.f6979b[ordinal()];
            if (i == 1) {
                return "standard";
            }
            if (i == 2) {
                return "scientific";
            }
            if (i == 3) {
                return "engineering";
            }
            if (i == 4) {
                return "compact";
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: com.facebook.hermes.intl.e$f */
    public enum C2345f {
        SIGNIFICANT_DIGITS,
        FRACTION_DIGITS,
        COMPACT_ROUNDING
    }

    /* renamed from: com.facebook.hermes.intl.e$g */
    public enum C2346g {
        AUTO,
        ALWAYS,
        NEVER,
        EXCEPTZERO;

        public String toString() {
            int i = C2340a.f6981d[ordinal()];
            if (i == 1) {
                return "auto";
            }
            if (i == 2) {
                return "always";
            }
            if (i == 3) {
                return "never";
            }
            if (i == 4) {
                return "exceptZero";
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: com.facebook.hermes.intl.e$h */
    public enum C2347h {
        DECIMAL,
        PERCENT,
        CURRENCY,
        UNIT;

        /* renamed from: e */
        public int mo7998e(C2344e eVar, C2343d dVar) {
            int i = C2340a.f6978a[ordinal()];
            if (i == 2) {
                return 2;
            }
            if (i != 3) {
                return (eVar == C2344e.SCIENTIFIC || eVar == C2344e.ENGINEERING) ? 3 : 0;
            }
            if (dVar == C2343d.ACCOUNTING) {
                return 7;
            }
            if (dVar == C2343d.STANDARD) {
                return 1;
            }
            throw new C2354h("Unrecognized formatting style requested.");
        }

        public String toString() {
            int i = C2340a.f6978a[ordinal()];
            if (i == 1) {
                return "decimal";
            }
            if (i == 2) {
                return "percent";
            }
            if (i == 3) {
                return "currency";
            }
            if (i == 4) {
                return "unit";
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: com.facebook.hermes.intl.e$i */
    public enum C2348i {
        SHORT,
        NARROW,
        LONG;

        /* renamed from: e */
        public MeasureFormat.FormatWidth mo8000e() {
            int i = C2340a.f6982e[ordinal()];
            return i != 2 ? i != 3 ? MeasureFormat.FormatWidth.SHORT : MeasureFormat.FormatWidth.WIDE : MeasureFormat.FormatWidth.NARROW;
        }

        public String toString() {
            int i = C2340a.f6982e[ordinal()];
            if (i == 1) {
                return "short";
            }
            if (i == 2) {
                return "narrow";
            }
            if (i == 3) {
                return "long";
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    String mo7980a(C2320b<?> bVar);

    /* renamed from: b */
    AttributedCharacterIterator mo7981b(double d);

    /* renamed from: c */
    String mo7982c(double d);

    /* renamed from: d */
    C2339e mo7983d(String str, C2348i iVar);

    /* renamed from: e */
    C2339e mo7984e(C2346g gVar);

    /* renamed from: f */
    C2339e mo7985f(String str, C2342c cVar);

    /* renamed from: g */
    C2339e mo7986g(C2345f fVar, int i, int i2);

    /* renamed from: h */
    String mo7987h(AttributedCharacterIterator.Attribute attribute, double d);

    /* renamed from: i */
    C2339e mo7988i(int i);

    /* renamed from: j */
    C2339e mo7989j(boolean z);

    /* renamed from: k */
    C2339e mo7990k(C2320b<?> bVar, String str, C2347h hVar, C2343d dVar, C2344e eVar, C2341b bVar2);

    /* renamed from: l */
    C2339e mo7991l(C2345f fVar, int i, int i2);
}
