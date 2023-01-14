package com.facebook.hermes.intl;

import java.text.AttributedCharacterIterator;
import okhttp3.HttpUrl;

/* renamed from: com.facebook.hermes.intl.d */
public interface C2326d {

    /* renamed from: com.facebook.hermes.intl.d$a */
    static /* synthetic */ class C2327a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6917a;

        /* renamed from: b */
        static final /* synthetic */ int[] f6918b;

        /* renamed from: c */
        static final /* synthetic */ int[] f6919c;

        /* renamed from: d */
        static final /* synthetic */ int[] f6920d;

        /* renamed from: e */
        static final /* synthetic */ int[] f6921e;

        /* renamed from: f */
        static final /* synthetic */ int[] f6922f;

        /* renamed from: g */
        static final /* synthetic */ int[] f6923g;

        /* renamed from: h */
        static final /* synthetic */ int[] f6924h;

        /* renamed from: i */
        static final /* synthetic */ int[] f6925i;

        /* renamed from: j */
        static final /* synthetic */ int[] f6926j;

        /* renamed from: k */
        static final /* synthetic */ int[] f6927k;

        /* JADX WARNING: Can't wrap try/catch for region: R(80:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|(2:17|18)|19|21|22|23|24|25|26|27|29|30|31|32|(2:33|34)|35|37|38|39|40|(2:41|42)|43|45|46|47|48|(2:49|50)|51|(2:53|54)|55|57|58|(2:59|60)|61|63|64|65|66|(2:67|68)|69|71|72|73|74|75|76|(2:77|78)|79|81|82|83|84|85|86|87|88|89|91|92|93|94|95|96|97|98|(2:99|100)|101|103|104|(3:105|106|108)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(83:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|(2:17|18)|19|21|22|23|24|25|26|27|29|30|31|32|(2:33|34)|35|37|38|39|40|41|42|43|45|46|47|48|(2:49|50)|51|(2:53|54)|55|57|58|59|60|61|63|64|65|66|(2:67|68)|69|71|72|73|74|75|76|(2:77|78)|79|81|82|83|84|85|86|87|88|89|91|92|93|94|95|96|97|98|99|100|101|103|104|(3:105|106|108)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(84:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|(2:17|18)|19|21|22|23|24|25|26|27|29|30|31|32|(2:33|34)|35|37|38|39|40|41|42|43|45|46|47|48|(2:49|50)|51|53|54|55|57|58|59|60|61|63|64|65|66|(2:67|68)|69|71|72|73|74|75|76|(2:77|78)|79|81|82|83|84|85|86|87|88|89|91|92|93|94|95|96|97|98|99|100|101|103|104|(3:105|106|108)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(85:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|(2:17|18)|19|21|22|23|24|25|26|27|29|30|31|32|(2:33|34)|35|37|38|39|40|41|42|43|45|46|47|48|(2:49|50)|51|53|54|55|57|58|59|60|61|63|64|65|66|(2:67|68)|69|71|72|73|74|75|76|(2:77|78)|79|81|82|83|84|85|86|87|88|89|91|92|93|94|95|96|97|98|99|100|101|103|104|(3:105|106|108)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(87:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|(2:17|18)|19|21|22|23|24|25|26|27|29|30|31|32|(2:33|34)|35|37|38|39|40|41|42|43|45|46|47|48|49|50|51|53|54|55|57|58|59|60|61|63|64|65|66|67|68|69|71|72|73|74|75|76|(2:77|78)|79|81|82|83|84|85|86|87|88|89|91|92|93|94|95|96|97|98|99|100|101|103|104|(3:105|106|108)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(88:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|16|(2:17|18)|19|21|22|23|24|25|26|27|29|30|31|32|(2:33|34)|35|37|38|39|40|41|42|43|45|46|47|48|49|50|51|53|54|55|57|58|59|60|61|63|64|65|66|67|68|69|71|72|73|74|75|76|(2:77|78)|79|81|82|83|84|85|86|87|88|89|91|92|93|94|95|96|97|98|99|100|101|103|104|(3:105|106|108)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(90:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|16|(2:17|18)|19|21|22|23|24|25|26|27|29|30|31|32|(2:33|34)|35|37|38|39|40|41|42|43|45|46|47|48|49|50|51|53|54|55|57|58|59|60|61|63|64|65|66|67|68|69|71|72|73|74|75|76|(2:77|78)|79|81|82|83|84|85|86|87|88|89|91|92|93|94|95|96|97|98|99|100|101|103|104|105|106|108) */
        /* JADX WARNING: Can't wrap try/catch for region: R(93:0|1|2|3|5|6|7|9|10|11|13|14|15|16|(2:17|18)|19|21|22|23|24|25|26|27|29|30|31|32|33|34|35|37|38|39|40|41|42|43|45|46|47|48|49|50|51|53|54|55|57|58|59|60|61|63|64|65|66|67|68|69|71|72|73|74|75|76|77|78|79|81|82|83|84|85|86|87|88|89|91|92|93|94|95|96|97|98|99|100|101|103|104|105|106|108) */
        /* JADX WARNING: Can't wrap try/catch for region: R(94:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|29|30|31|32|33|34|35|37|38|39|40|41|42|43|45|46|47|48|49|50|51|53|54|55|57|58|59|60|61|63|64|65|66|67|68|69|71|72|73|74|75|76|77|78|79|81|82|83|84|85|86|87|88|89|91|92|93|94|95|96|97|98|99|100|101|103|104|105|106|108) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:105:0x01cf */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0068 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00b2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00cd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00d7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00f7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0113 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x011d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x0138 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0142 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x014c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x0167 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x0171 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x017b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x0196 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x01a0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x01aa */
        /* JADX WARNING: Missing exception handler attribute for start block: B:99:0x01b4 */
        static {
            /*
                com.facebook.hermes.intl.d$j[] r0 = com.facebook.hermes.intl.C2326d.C2336j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6927k = r0
                r1 = 1
                com.facebook.hermes.intl.d$j r2 = com.facebook.hermes.intl.C2326d.C2336j.LONG     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f6927k     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.hermes.intl.d$j r3 = com.facebook.hermes.intl.C2326d.C2336j.SHORT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f6927k     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.hermes.intl.d$j r4 = com.facebook.hermes.intl.C2326d.C2336j.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.facebook.hermes.intl.d$i[] r3 = com.facebook.hermes.intl.C2326d.C2335i.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f6926j = r3
                com.facebook.hermes.intl.d$i r4 = com.facebook.hermes.intl.C2326d.C2335i.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r3 = f6926j     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.facebook.hermes.intl.d$i r4 = com.facebook.hermes.intl.C2326d.C2335i.DIGIT2     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r3 = f6926j     // Catch:{ NoSuchFieldError -> 0x004d }
                com.facebook.hermes.intl.d$i r4 = com.facebook.hermes.intl.C2326d.C2335i.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x004d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                com.facebook.hermes.intl.d$g[] r3 = com.facebook.hermes.intl.C2326d.C2333g.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f6925i = r3
                com.facebook.hermes.intl.d$g r4 = com.facebook.hermes.intl.C2326d.C2333g.NUMERIC     // Catch:{ NoSuchFieldError -> 0x005e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                int[] r3 = f6925i     // Catch:{ NoSuchFieldError -> 0x0068 }
                com.facebook.hermes.intl.d$g r4 = com.facebook.hermes.intl.C2326d.C2333g.DIGIT2     // Catch:{ NoSuchFieldError -> 0x0068 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0068 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0068 }
            L_0x0068:
                int[] r3 = f6925i     // Catch:{ NoSuchFieldError -> 0x0072 }
                com.facebook.hermes.intl.d$g r4 = com.facebook.hermes.intl.C2326d.C2333g.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x0072 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0072 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0072 }
            L_0x0072:
                com.facebook.hermes.intl.d$e[] r3 = com.facebook.hermes.intl.C2326d.C2331e.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f6924h = r3
                com.facebook.hermes.intl.d$e r4 = com.facebook.hermes.intl.C2326d.C2331e.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r3 = f6924h     // Catch:{ NoSuchFieldError -> 0x008d }
                com.facebook.hermes.intl.d$e r4 = com.facebook.hermes.intl.C2326d.C2331e.DIGIT2     // Catch:{ NoSuchFieldError -> 0x008d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x008d }
            L_0x008d:
                int[] r3 = f6924h     // Catch:{ NoSuchFieldError -> 0x0097 }
                com.facebook.hermes.intl.d$e r4 = com.facebook.hermes.intl.C2326d.C2331e.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x0097 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0097 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0097 }
            L_0x0097:
                com.facebook.hermes.intl.d$b[] r3 = com.facebook.hermes.intl.C2326d.C2328b.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f6923g = r3
                com.facebook.hermes.intl.d$b r4 = com.facebook.hermes.intl.C2326d.C2328b.NUMERIC     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r3 = f6923g     // Catch:{ NoSuchFieldError -> 0x00b2 }
                com.facebook.hermes.intl.d$b r4 = com.facebook.hermes.intl.C2326d.C2328b.DIGIT2     // Catch:{ NoSuchFieldError -> 0x00b2 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b2 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x00b2 }
            L_0x00b2:
                int[] r3 = f6923g     // Catch:{ NoSuchFieldError -> 0x00bc }
                com.facebook.hermes.intl.d$b r4 = com.facebook.hermes.intl.C2326d.C2328b.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x00bc }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00bc }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x00bc }
            L_0x00bc:
                com.facebook.hermes.intl.d$h[] r3 = com.facebook.hermes.intl.C2326d.C2334h.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f6922f = r3
                com.facebook.hermes.intl.d$h r4 = com.facebook.hermes.intl.C2326d.C2334h.NUMERIC     // Catch:{ NoSuchFieldError -> 0x00cd }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cd }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x00cd }
            L_0x00cd:
                int[] r3 = f6922f     // Catch:{ NoSuchFieldError -> 0x00d7 }
                com.facebook.hermes.intl.d$h r4 = com.facebook.hermes.intl.C2326d.C2334h.DIGIT2     // Catch:{ NoSuchFieldError -> 0x00d7 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d7 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x00d7 }
            L_0x00d7:
                int[] r3 = f6922f     // Catch:{ NoSuchFieldError -> 0x00e1 }
                com.facebook.hermes.intl.d$h r4 = com.facebook.hermes.intl.C2326d.C2334h.LONG     // Catch:{ NoSuchFieldError -> 0x00e1 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e1 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x00e1 }
            L_0x00e1:
                r3 = 4
                int[] r4 = f6922f     // Catch:{ NoSuchFieldError -> 0x00ec }
                com.facebook.hermes.intl.d$h r5 = com.facebook.hermes.intl.C2326d.C2334h.SHORT     // Catch:{ NoSuchFieldError -> 0x00ec }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ec }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x00ec }
            L_0x00ec:
                r4 = 5
                int[] r5 = f6922f     // Catch:{ NoSuchFieldError -> 0x00f7 }
                com.facebook.hermes.intl.d$h r6 = com.facebook.hermes.intl.C2326d.C2334h.NARROW     // Catch:{ NoSuchFieldError -> 0x00f7 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f7 }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x00f7 }
            L_0x00f7:
                int[] r5 = f6922f     // Catch:{ NoSuchFieldError -> 0x0102 }
                com.facebook.hermes.intl.d$h r6 = com.facebook.hermes.intl.C2326d.C2334h.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x0102 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0102 }
                r7 = 6
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0102 }
            L_0x0102:
                com.facebook.hermes.intl.d$l[] r5 = com.facebook.hermes.intl.C2326d.C2338l.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f6921e = r5
                com.facebook.hermes.intl.d$l r6 = com.facebook.hermes.intl.C2326d.C2338l.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0113 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0113 }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x0113 }
            L_0x0113:
                int[] r5 = f6921e     // Catch:{ NoSuchFieldError -> 0x011d }
                com.facebook.hermes.intl.d$l r6 = com.facebook.hermes.intl.C2326d.C2338l.DIGIT2     // Catch:{ NoSuchFieldError -> 0x011d }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x011d }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x011d }
            L_0x011d:
                int[] r5 = f6921e     // Catch:{ NoSuchFieldError -> 0x0127 }
                com.facebook.hermes.intl.d$l r6 = com.facebook.hermes.intl.C2326d.C2338l.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x0127 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0127 }
                r5[r6] = r2     // Catch:{ NoSuchFieldError -> 0x0127 }
            L_0x0127:
                com.facebook.hermes.intl.d$c[] r5 = com.facebook.hermes.intl.C2326d.C2329c.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f6920d = r5
                com.facebook.hermes.intl.d$c r6 = com.facebook.hermes.intl.C2326d.C2329c.LONG     // Catch:{ NoSuchFieldError -> 0x0138 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0138 }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x0138 }
            L_0x0138:
                int[] r5 = f6920d     // Catch:{ NoSuchFieldError -> 0x0142 }
                com.facebook.hermes.intl.d$c r6 = com.facebook.hermes.intl.C2326d.C2329c.SHORT     // Catch:{ NoSuchFieldError -> 0x0142 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0142 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0142 }
            L_0x0142:
                int[] r5 = f6920d     // Catch:{ NoSuchFieldError -> 0x014c }
                com.facebook.hermes.intl.d$c r6 = com.facebook.hermes.intl.C2326d.C2329c.NARROW     // Catch:{ NoSuchFieldError -> 0x014c }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x014c }
                r5[r6] = r2     // Catch:{ NoSuchFieldError -> 0x014c }
            L_0x014c:
                int[] r5 = f6920d     // Catch:{ NoSuchFieldError -> 0x0156 }
                com.facebook.hermes.intl.d$c r6 = com.facebook.hermes.intl.C2326d.C2329c.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x0156 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0156 }
                r5[r6] = r3     // Catch:{ NoSuchFieldError -> 0x0156 }
            L_0x0156:
                com.facebook.hermes.intl.d$k[] r5 = com.facebook.hermes.intl.C2326d.C2337k.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f6919c = r5
                com.facebook.hermes.intl.d$k r6 = com.facebook.hermes.intl.C2326d.C2337k.LONG     // Catch:{ NoSuchFieldError -> 0x0167 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0167 }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x0167 }
            L_0x0167:
                int[] r5 = f6919c     // Catch:{ NoSuchFieldError -> 0x0171 }
                com.facebook.hermes.intl.d$k r6 = com.facebook.hermes.intl.C2326d.C2337k.SHORT     // Catch:{ NoSuchFieldError -> 0x0171 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0171 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0171 }
            L_0x0171:
                int[] r5 = f6919c     // Catch:{ NoSuchFieldError -> 0x017b }
                com.facebook.hermes.intl.d$k r6 = com.facebook.hermes.intl.C2326d.C2337k.NARROW     // Catch:{ NoSuchFieldError -> 0x017b }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x017b }
                r5[r6] = r2     // Catch:{ NoSuchFieldError -> 0x017b }
            L_0x017b:
                int[] r5 = f6919c     // Catch:{ NoSuchFieldError -> 0x0185 }
                com.facebook.hermes.intl.d$k r6 = com.facebook.hermes.intl.C2326d.C2337k.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x0185 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0185 }
                r5[r6] = r3     // Catch:{ NoSuchFieldError -> 0x0185 }
            L_0x0185:
                com.facebook.hermes.intl.d$f[] r5 = com.facebook.hermes.intl.C2326d.C2332f.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f6918b = r5
                com.facebook.hermes.intl.d$f r6 = com.facebook.hermes.intl.C2326d.C2332f.H11     // Catch:{ NoSuchFieldError -> 0x0196 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0196 }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x0196 }
            L_0x0196:
                int[] r5 = f6918b     // Catch:{ NoSuchFieldError -> 0x01a0 }
                com.facebook.hermes.intl.d$f r6 = com.facebook.hermes.intl.C2326d.C2332f.H12     // Catch:{ NoSuchFieldError -> 0x01a0 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x01a0 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x01a0 }
            L_0x01a0:
                int[] r5 = f6918b     // Catch:{ NoSuchFieldError -> 0x01aa }
                com.facebook.hermes.intl.d$f r6 = com.facebook.hermes.intl.C2326d.C2332f.H23     // Catch:{ NoSuchFieldError -> 0x01aa }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x01aa }
                r5[r6] = r2     // Catch:{ NoSuchFieldError -> 0x01aa }
            L_0x01aa:
                int[] r2 = f6918b     // Catch:{ NoSuchFieldError -> 0x01b4 }
                com.facebook.hermes.intl.d$f r5 = com.facebook.hermes.intl.C2326d.C2332f.H24     // Catch:{ NoSuchFieldError -> 0x01b4 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x01b4 }
                r2[r5] = r3     // Catch:{ NoSuchFieldError -> 0x01b4 }
            L_0x01b4:
                int[] r2 = f6918b     // Catch:{ NoSuchFieldError -> 0x01be }
                com.facebook.hermes.intl.d$f r3 = com.facebook.hermes.intl.C2326d.C2332f.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x01be }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x01be }
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x01be }
            L_0x01be:
                com.facebook.hermes.intl.d$d[] r2 = com.facebook.hermes.intl.C2326d.C2330d.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f6917a = r2
                com.facebook.hermes.intl.d$d r3 = com.facebook.hermes.intl.C2326d.C2330d.BESTFIT     // Catch:{ NoSuchFieldError -> 0x01cf }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x01cf }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x01cf }
            L_0x01cf:
                int[] r1 = f6917a     // Catch:{ NoSuchFieldError -> 0x01d9 }
                com.facebook.hermes.intl.d$d r2 = com.facebook.hermes.intl.C2326d.C2330d.BASIC     // Catch:{ NoSuchFieldError -> 0x01d9 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x01d9 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x01d9 }
            L_0x01d9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.hermes.intl.C2326d.C2327a.<clinit>():void");
        }
    }

    /* renamed from: com.facebook.hermes.intl.d$b */
    public enum C2328b {
        NUMERIC,
        DIGIT2,
        UNDEFINED;

        /* renamed from: e */
        public String mo7959e() {
            int i = C2327a.f6923g[ordinal()];
            if (i == 1) {
                return "d";
            }
            if (i == 2) {
                return "dd";
            }
            if (i == 3) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            throw new IllegalArgumentException();
        }

        public String toString() {
            int i = C2327a.f6923g[ordinal()];
            if (i == 1) {
                return "numeric";
            }
            if (i == 2) {
                return "2-digit";
            }
            if (i == 3) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: com.facebook.hermes.intl.d$c */
    public enum C2329c {
        LONG,
        SHORT,
        NARROW,
        UNDEFINED;

        /* renamed from: e */
        public String mo7961e() {
            int i = C2327a.f6920d[ordinal()];
            if (i == 1) {
                return "GGGG";
            }
            if (i == 2) {
                return "GGG";
            }
            if (i == 3) {
                return "G5";
            }
            if (i == 4) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            throw new IllegalArgumentException();
        }

        public String toString() {
            int i = C2327a.f6920d[ordinal()];
            if (i == 1) {
                return "long";
            }
            if (i == 2) {
                return "short";
            }
            if (i == 3) {
                return "narrow";
            }
            if (i == 4) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: com.facebook.hermes.intl.d$d */
    public enum C2330d {
        BESTFIT,
        BASIC;

        public String toString() {
            int i = C2327a.f6917a[ordinal()];
            if (i == 1) {
                return "best fit";
            }
            if (i == 2) {
                return "basic";
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: com.facebook.hermes.intl.d$e */
    public enum C2331e {
        NUMERIC,
        DIGIT2,
        UNDEFINED;

        /* renamed from: e */
        public String mo7964e() {
            int i = C2327a.f6924h[ordinal()];
            if (i == 1) {
                return "h";
            }
            if (i == 2) {
                return "hh";
            }
            if (i == 3) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: g */
        public String mo7965g() {
            int i = C2327a.f6924h[ordinal()];
            if (i == 1) {
                return "k";
            }
            if (i == 2) {
                return "kk";
            }
            if (i == 3) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            throw new IllegalArgumentException();
        }

        public String toString() {
            int i = C2327a.f6924h[ordinal()];
            if (i == 1) {
                return "numeric";
            }
            if (i == 2) {
                return "2-digit";
            }
            if (i == 3) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: com.facebook.hermes.intl.d$f */
    public enum C2332f {
        H11,
        H12,
        H23,
        H24,
        UNDEFINED;

        public String toString() {
            int i = C2327a.f6918b[ordinal()];
            if (i == 1) {
                return "h11";
            }
            if (i == 2) {
                return "h12";
            }
            if (i == 3) {
                return "h23";
            }
            if (i == 4) {
                return "h24";
            }
            if (i == 5) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: com.facebook.hermes.intl.d$g */
    public enum C2333g {
        NUMERIC,
        DIGIT2,
        UNDEFINED;

        /* renamed from: e */
        public String mo7968e() {
            int i = C2327a.f6925i[ordinal()];
            if (i == 1) {
                return "m";
            }
            if (i == 2) {
                return "mm";
            }
            if (i == 3) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            throw new IllegalArgumentException();
        }

        public String toString() {
            int i = C2327a.f6925i[ordinal()];
            if (i == 1) {
                return "numeric";
            }
            if (i == 2) {
                return "2-digit";
            }
            if (i == 3) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: com.facebook.hermes.intl.d$h */
    public enum C2334h {
        NUMERIC,
        DIGIT2,
        LONG,
        SHORT,
        NARROW,
        UNDEFINED;

        /* renamed from: e */
        public String mo7970e() {
            switch (C2327a.f6922f[ordinal()]) {
                case 1:
                    return "M";
                case 2:
                    return "MM";
                case 3:
                    return "MMMM";
                case 4:
                    return "MMM";
                case 5:
                    return "MMMMM";
                case 6:
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public String toString() {
            switch (C2327a.f6922f[ordinal()]) {
                case 1:
                    return "numeric";
                case 2:
                    return "2-digit";
                case 3:
                    return "long";
                case 4:
                    return "short";
                case 5:
                    return "narrow";
                case 6:
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    /* renamed from: com.facebook.hermes.intl.d$i */
    public enum C2335i {
        NUMERIC,
        DIGIT2,
        UNDEFINED;

        /* renamed from: e */
        public String mo7972e() {
            int i = C2327a.f6926j[ordinal()];
            if (i == 1) {
                return "s";
            }
            if (i == 2) {
                return "ss";
            }
            if (i == 3) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            throw new IllegalArgumentException();
        }

        public String toString() {
            int i = C2327a.f6926j[ordinal()];
            if (i == 1) {
                return "numeric";
            }
            if (i == 2) {
                return "2-digit";
            }
            if (i == 3) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: com.facebook.hermes.intl.d$j */
    public enum C2336j {
        LONG,
        SHORT,
        UNDEFINED;

        /* renamed from: e */
        public String mo7974e() {
            int i = C2327a.f6927k[ordinal()];
            if (i == 1) {
                return "VV";
            }
            if (i == 2) {
                return "O";
            }
            if (i == 3) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            throw new IllegalArgumentException();
        }

        public String toString() {
            int i = C2327a.f6927k[ordinal()];
            if (i == 1) {
                return "long";
            }
            if (i == 2) {
                return "short";
            }
            if (i == 3) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: com.facebook.hermes.intl.d$k */
    public enum C2337k {
        LONG,
        SHORT,
        NARROW,
        UNDEFINED;

        /* renamed from: e */
        public String mo7976e() {
            int i = C2327a.f6919c[ordinal()];
            if (i == 1) {
                return "EEEE";
            }
            if (i == 2) {
                return "EEE";
            }
            if (i == 3) {
                return "EEEEE";
            }
            if (i == 4) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            throw new IllegalArgumentException();
        }

        public String toString() {
            int i = C2327a.f6919c[ordinal()];
            if (i == 1) {
                return "long";
            }
            if (i == 2) {
                return "short";
            }
            if (i == 3) {
                return "narrow";
            }
            if (i == 4) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: com.facebook.hermes.intl.d$l */
    public enum C2338l {
        NUMERIC,
        DIGIT2,
        UNDEFINED;

        /* renamed from: e */
        public String mo7978e() {
            int i = C2327a.f6921e[ordinal()];
            if (i == 1) {
                return "yyyy";
            }
            if (i == 2) {
                return "yy";
            }
            if (i == 3) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            throw new IllegalArgumentException();
        }

        public String toString() {
            int i = C2327a.f6921e[ordinal()];
            if (i == 1) {
                return "numeric";
            }
            if (i == 2) {
                return "2-digit";
            }
            if (i == 3) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    String mo7950a(C2320b<?> bVar);

    /* renamed from: b */
    AttributedCharacterIterator mo7951b(double d);

    /* renamed from: c */
    String mo7952c(double d);

    /* renamed from: d */
    String mo7953d(C2320b<?> bVar);

    /* renamed from: e */
    void mo7954e(C2320b<?> bVar, String str, String str2, C2330d dVar, C2337k kVar, C2329c cVar, C2338l lVar, C2334h hVar, C2328b bVar2, C2331e eVar, C2333g gVar, C2335i iVar, C2336j jVar, C2332f fVar, Object obj);

    /* renamed from: f */
    C2332f mo7955f(C2320b<?> bVar);

    /* renamed from: g */
    String mo7956g(AttributedCharacterIterator.Attribute attribute, String str);

    /* renamed from: h */
    String mo7957h(C2320b<?> bVar);

    /* renamed from: i */
    boolean mo7958i(String str);
}
