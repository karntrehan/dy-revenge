package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.Iterator;

/* renamed from: e.f.a.c.f.g.u */
public final class C7018u implements Iterable, C6954q {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final String f18976f;

    public C7018u(String str) {
        if (str != null) {
            this.f18976f = str;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }

    /* renamed from: b */
    public final C6954q mo19738b() {
        return new C7018u(this.f18976f);
    }

    /* renamed from: d */
    public final Double mo19739d() {
        double d;
        if (this.f18976f.isEmpty()) {
            d = 0.0d;
        } else {
            try {
                return Double.valueOf(this.f18976f);
            } catch (NumberFormatException unused) {
                d = Double.NaN;
            }
        }
        return Double.valueOf(d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7018u)) {
            return false;
        }
        return this.f18976f.equals(((C7018u) obj).f18976f);
    }

    /* renamed from: g */
    public final String mo19741g() {
        return this.f18976f;
    }

    /* renamed from: h */
    public final Boolean mo19742h() {
        return Boolean.valueOf(!this.f18976f.isEmpty());
    }

    public final int hashCode() {
        return this.f18976f.hashCode();
    }

    public final Iterator iterator() {
        return new C7002t(this);
    }

    /* renamed from: j */
    public final Iterator mo19745j() {
        return new C6986s(this);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0190, code lost:
        throw new java.lang.IllegalArgumentException("Command not supported");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0191, code lost:
        p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26538h(r5, 0, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01a6, code lost:
        p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26538h(r5, 0, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01bd, code lost:
        r0 = r21;
        p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26538h(r6, 0, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01c7, code lost:
        p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26538h("toLowerCase", 0, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01de, code lost:
        p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26538h("toLocaleLowerCase", 0, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01f4, code lost:
        p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26538h(r14, 0, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0209, code lost:
        r1 = r24;
        p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26540j("substring", 2, r1);
        r2 = r21.f18976f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0218, code lost:
        if (r24.isEmpty() != false) goto L_0x0234;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x021a, code lost:
        r3 = r23;
        r4 = (int) p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26531a(r3.mo20144b((p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r1.get(0)).mo19739d().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0234, code lost:
        r3 = r23;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x023c, code lost:
        if (r24.size() <= 1) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x023e, code lost:
        r1 = (int) p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26531a(r3.mo20144b((p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r1.get(1)).mo19739d().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0256, code lost:
        r1 = r2.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x025a, code lost:
        r4 = java.lang.Math.min(java.lang.Math.max(r4, 0), r2.length());
        r1 = java.lang.Math.min(java.lang.Math.max(r1, 0), r2.length());
        r3 = new p174e.p319f.p320a.p335c.p345f.p352g.C7018u(r2.substring(java.lang.Math.min(r4, r1), java.lang.Math.max(r4, r1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0286, code lost:
        r0 = r21;
        r3 = r23;
        r1 = r24;
        p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26540j("split", 2, r1);
        r2 = r0.f18976f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0296, code lost:
        if (r2.length() != 0) goto L_0x02a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02a9, code lost:
        r5 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02b3, code lost:
        if (r24.isEmpty() == false) goto L_0x02ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02b5, code lost:
        r5.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02ba, code lost:
        r4 = r3.mo20144b((p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r1.get(0)).mo19741g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02cd, code lost:
        if (r24.size() <= 1) goto L_0x02e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02cf, code lost:
        r6 = p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26534d(r3.mo20144b((p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r1.get(1)).mo19739d().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02e6, code lost:
        r6 = 2147483647L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02ed, code lost:
        if (r6 != 0) goto L_0x02f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02f6, code lost:
        r1 = r2.split(java.util.regex.Pattern.quote(r4), ((int) r6) + 1);
        r2 = r1.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0306, code lost:
        if (r4.isEmpty() == false) goto L_0x031d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0308, code lost:
        if (r2 <= 0) goto L_0x031d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x030a, code lost:
        r14 = r1[0].isEmpty();
        r3 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0319, code lost:
        if (r1[r3].isEmpty() != false) goto L_0x031f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x031b, code lost:
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x031d, code lost:
        r3 = r2;
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0322, code lost:
        if (((long) r2) <= r6) goto L_0x0326;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0324, code lost:
        r3 = r3 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0326, code lost:
        if (r14 >= r3) goto L_0x0335;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0328, code lost:
        r5.add(new p174e.p319f.p320a.p335c.p345f.p352g.C7018u(r1[r14]));
        r14 = r14 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x033c, code lost:
        r3 = r23;
        r1 = r24;
        p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26540j("slice", 2, r1);
        r2 = r21.f18976f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x034c, code lost:
        if (r24.isEmpty() != false) goto L_0x0362;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x034e, code lost:
        r4 = r3.mo20144b((p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r1.get(0)).mo19739d().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0362, code lost:
        r4 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0364, code lost:
        r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26531a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x036c, code lost:
        if (r4 >= 0.0d) goto L_0x0379;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x036e, code lost:
        r4 = java.lang.Math.max(((double) r2.length()) + r4, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0379, code lost:
        r4 = java.lang.Math.min(r4, (double) r2.length());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0382, code lost:
        r4 = (int) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0388, code lost:
        if (r24.size() <= 1) goto L_0x039d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x038a, code lost:
        r5 = r3.mo20144b((p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r1.get(1)).mo19739d().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x039d, code lost:
        r5 = (double) r2.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03a2, code lost:
        r5 = p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26531a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03aa, code lost:
        if (r5 >= 0.0d) goto L_0x03b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03ac, code lost:
        r5 = java.lang.Math.max(((double) r2.length()) + r5, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03b7, code lost:
        r5 = java.lang.Math.min(r5, (double) r2.length());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03c0, code lost:
        r3 = new p174e.p319f.p320a.p335c.p345f.p352g.C7018u(r2.substring(r4, java.lang.Math.max(0, ((int) r5) - r4) + r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03d3, code lost:
        r0 = r21;
        r3 = r23;
        r1 = r24;
        p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26540j("search", 1, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03e2, code lost:
        if (r24.isEmpty() != false) goto L_0x03f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03e4, code lost:
        r17 = r3.mo20144b((p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r1.get(0)).mo19741g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03f2, code lost:
        r1 = java.util.regex.Pattern.compile(r17).matcher(r0.f18976f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0400, code lost:
        if (r1.find() == false) goto L_0x0412;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x041f, code lost:
        r0 = r21;
        r3 = r23;
        r1 = r24;
        p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26540j("replace", 2, r1);
        r2 = p174e.p319f.p320a.p335c.p345f.p352g.C6954q.f18804c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x042f, code lost:
        if (r24.isEmpty() != false) goto L_0x0451;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0431, code lost:
        r17 = r3.mo20144b((p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r1.get(0)).mo19741g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0445, code lost:
        if (r24.size() <= 1) goto L_0x0451;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0447, code lost:
        r2 = r3.mo20144b((p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r1.get(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0451, code lost:
        r1 = r17;
        r4 = r0.f18976f;
        r5 = r4.indexOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0459, code lost:
        if (r5 < 0) goto L_0x0633;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x045d, code lost:
        if ((r2 instanceof p174e.p319f.p320a.p335c.p345f.p352g.C6842j) == false) goto L_0x0484;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x045f, code lost:
        r2 = ((p174e.p319f.p320a.p335c.p345f.p352g.C6842j) r2).mo19542a(r3, java.util.Arrays.asList(new p174e.p319f.p320a.p335c.p345f.p352g.C6954q[]{new p174e.p319f.p320a.p335c.p345f.p352g.C7018u(r1), new p174e.p319f.p320a.p335c.p345f.p352g.C6826i(java.lang.Double.valueOf((double) r5)), r0}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0484, code lost:
        r3 = new p174e.p319f.p320a.p335c.p345f.p352g.C7018u(r4.substring(0, r5) + r2.mo19741g() + r4.substring(r5 + r1.length()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04af, code lost:
        r3 = r23;
        r1 = r24;
        p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26540j("match", 1, r1);
        r2 = r21.f18976f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04bf, code lost:
        if (r24.size() > 0) goto L_0x04c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04c1, code lost:
        r1 = okhttp3.HttpUrl.FRAGMENT_ENCODE_SET;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x04c4, code lost:
        r1 = r3.mo20144b((p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r1.get(0)).mo19741g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x04d3, code lost:
        r1 = java.util.regex.Pattern.compile(r1).matcher(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x04df, code lost:
        if (r1.find() == false) goto L_0x04fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x04ff, code lost:
        r3 = r23;
        r1 = r24;
        p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26540j("lastIndexOf", 2, r1);
        r4 = r21.f18976f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0510, code lost:
        if (r24.size() > 0) goto L_0x0513;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0513, code lost:
        r17 = r3.mo20144b((p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r1.get(0)).mo19741g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0521, code lost:
        r5 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0527, code lost:
        if (r24.size() >= 2) goto L_0x052c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0529, code lost:
        r1 = Double.NaN;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x052c, code lost:
        r1 = r3.mo20144b((p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r1.get(1)).mo19739d().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0543, code lost:
        if (java.lang.Double.isNaN(r1) == false) goto L_0x0548;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0545, code lost:
        r1 = Double.POSITIVE_INFINITY;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0548, code lost:
        r1 = p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26531a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x054c, code lost:
        r3 = new p174e.p319f.p320a.p335c.p345f.p352g.C6826i(java.lang.Double.valueOf((double) r4.lastIndexOf(r5, (int) r1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x055c, code lost:
        r3 = r23;
        r1 = r24;
        p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26540j("indexOf", 2, r1);
        r4 = r21.f18976f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x056e, code lost:
        if (r24.size() > 0) goto L_0x0571;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0571, code lost:
        r17 = r3.mo20144b((p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r1.get(0)).mo19741g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0580, code lost:
        r5 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0586, code lost:
        if (r24.size() >= 2) goto L_0x058a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0588, code lost:
        r1 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x058a, code lost:
        r1 = r3.mo20144b((p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r1.get(1)).mo19739d().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x059d, code lost:
        r3 = new p174e.p319f.p320a.p335c.p345f.p352g.C6826i(java.lang.Double.valueOf((double) r4.indexOf(r5, (int) p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26531a(r1))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x05b3, code lost:
        r1 = r24;
        p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26538h(r20, 1, r1);
        r2 = r21.f18976f;
        r1 = r23.mo20144b((p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r1.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x05d6, code lost:
        if ("length".equals(r1.mo19741g()) == false) goto L_0x05dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x05dc, code lost:
        r3 = r1.mo19739d().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x05ea, code lost:
        if (r3 != java.lang.Math.floor(r3)) goto L_0x05f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x05ec, code lost:
        r1 = (int) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x05ed, code lost:
        if (r1 < 0) goto L_0x05f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x05f3, code lost:
        if (r1 >= r2.length()) goto L_0x05f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x05fa, code lost:
        r0 = r21;
        r3 = r23;
        r1 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0604, code lost:
        if (r24.isEmpty() != false) goto L_0x0633;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0606, code lost:
        r2 = new java.lang.StringBuilder(r0.f18976f);
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0612, code lost:
        if (r14 >= r24.size()) goto L_0x0628;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0614, code lost:
        r2.append(r3.mo20144b((p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r1.get(r14)).mo19741g());
        r14 = r14 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0635, code lost:
        r0 = r21;
        r3 = r23;
        r1 = r24;
        p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26540j(r19, 1, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0645, code lost:
        if (r24.isEmpty() != false) goto L_0x0660;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0647, code lost:
        r14 = (int) p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26531a(r3.mo20144b((p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r1.get(0)).mo19739d().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0660, code lost:
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0662, code lost:
        r1 = r0.f18976f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0664, code lost:
        if (r14 < 0) goto L_0x067b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x066a, code lost:
        if (r14 < r1.length()) goto L_0x066d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:?, code lost:
        return p174e.p319f.p320a.p335c.p345f.p352g.C6954q.f18811k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:?, code lost:
        return new p174e.p319f.p320a.p335c.p345f.p352g.C7018u(r21.f18976f.trim());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:?, code lost:
        return new p174e.p319f.p320a.p335c.p345f.p352g.C7018u(r21.f18976f.toUpperCase(java.util.Locale.ENGLISH));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:?, code lost:
        return new p174e.p319f.p320a.p335c.p345f.p352g.C7018u(r21.f18976f.toLowerCase(java.util.Locale.ENGLISH));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:?, code lost:
        return new p174e.p319f.p320a.p335c.p345f.p352g.C7018u(r21.f18976f.toLowerCase());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:?, code lost:
        return new p174e.p319f.p320a.p335c.p345f.p352g.C7018u(r21.f18976f.toUpperCase());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:?, code lost:
        return new p174e.p319f.p320a.p335c.p345f.p352g.C6777f(java.util.Arrays.asList(new p174e.p319f.p320a.p335c.p345f.p352g.C6954q[]{r0}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:?, code lost:
        return new p174e.p319f.p320a.p335c.p345f.p352g.C6777f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:?, code lost:
        return new p174e.p319f.p320a.p335c.p345f.p352g.C6777f(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:?, code lost:
        return new p174e.p319f.p320a.p335c.p345f.p352g.C6826i(java.lang.Double.valueOf((double) r1.start()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:?, code lost:
        return new p174e.p319f.p320a.p335c.p345f.p352g.C6826i(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:?, code lost:
        return new p174e.p319f.p320a.p335c.p345f.p352g.C6777f(java.util.Arrays.asList(new p174e.p319f.p320a.p335c.p345f.p352g.C6954q[]{new p174e.p319f.p320a.p335c.p345f.p352g.C7018u(r1.group())}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:?, code lost:
        return p174e.p319f.p320a.p335c.p345f.p352g.C6954q.f18805d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:?, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:?, code lost:
        return p174e.p319f.p320a.p335c.p345f.p352g.C6954q.f18809i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:?, code lost:
        return p174e.p319f.p320a.p335c.p345f.p352g.C6954q.f18810j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:?, code lost:
        return new p174e.p319f.p320a.p335c.p345f.p352g.C7018u(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:?, code lost:
        return new p174e.p319f.p320a.p335c.p345f.p352g.C7018u(java.lang.String.valueOf(r1.charAt(r14)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00be, code lost:
        r4 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c0, code lost:
        r3 = r17;
        r6 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x012f, code lost:
        r4 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0158, code lost:
        r3 = r17;
        r6 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x017d, code lost:
        r1 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x017e, code lost:
        r17 = "undefined";
        r20 = r3;
        r19 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0184, code lost:
        switch(r1) {
            case 0: goto L_0x0635;
            case 1: goto L_0x05fa;
            case 2: goto L_0x05b3;
            case 3: goto L_0x055c;
            case 4: goto L_0x04ff;
            case 5: goto L_0x04af;
            case 6: goto L_0x041f;
            case 7: goto L_0x03d3;
            case 8: goto L_0x033c;
            case 9: goto L_0x0286;
            case 10: goto L_0x0209;
            case 11: goto L_0x01f4;
            case 12: goto L_0x01de;
            case 13: goto L_0x01c7;
            case 14: goto L_0x01bd;
            case 15: goto L_0x01a6;
            case 16: goto L_0x0191;
            default: goto L_0x0187;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0187, code lost:
        r0 = r21;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x016f  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p174e.p319f.p320a.p335c.p345f.p352g.C6954q mo19748p(java.lang.String r22, p174e.p319f.p320a.p335c.p345f.p352g.C6991s4 r23, java.util.List r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            java.lang.String r4 = "charAt"
            boolean r5 = r4.equals(r1)
            java.lang.String r6 = "concat"
            java.lang.String r7 = "indexOf"
            java.lang.String r8 = "replace"
            java.lang.String r9 = "substring"
            java.lang.String r10 = "split"
            java.lang.String r11 = "slice"
            java.lang.String r12 = "match"
            java.lang.String r13 = "lastIndexOf"
            java.lang.String r14 = "toLocaleUpperCase"
            java.lang.String r15 = "search"
            java.lang.String r2 = "toLowerCase"
            java.lang.String r0 = "toLocaleLowerCase"
            java.lang.String r3 = "toString"
            r16 = r4
            java.lang.String r4 = "hasOwnProperty"
            r17 = r14
            java.lang.String r14 = "toUpperCase"
            r18 = r14
            if (r5 != 0) goto L_0x00af
            boolean r5 = r6.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r4.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r7.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r13.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r12.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r8.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r15.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r11.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r10.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r9.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r2.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r0.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r3.equals(r1)
            if (r5 != 0) goto L_0x00af
            r5 = r18
            boolean r18 = r5.equals(r1)
            r14 = r17
            if (r18 != 0) goto L_0x00b3
            boolean r17 = r14.equals(r1)
            if (r17 != 0) goto L_0x00b3
            r17 = r4
            java.lang.String r4 = "trim"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x009d
            goto L_0x00b5
        L_0x009d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            java.lang.String r1 = "%s is not a String function"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
        L_0x00af:
            r14 = r17
            r5 = r18
        L_0x00b3:
            r17 = r4
        L_0x00b5:
            int r4 = r22.hashCode()
            r19 = r3
            switch(r4) {
                case -1789698943: goto L_0x016f;
                case -1776922004: goto L_0x015d;
                case -1464939364: goto L_0x014e;
                case -1361633751: goto L_0x0140;
                case -1354795244: goto L_0x0132;
                case -1137582698: goto L_0x0127;
                case -906336856: goto L_0x011f;
                case -726908483: goto L_0x0116;
                case -467511597: goto L_0x010e;
                case -399551817: goto L_0x0105;
                case 3568674: goto L_0x00fa;
                case 103668165: goto L_0x00f2;
                case 109526418: goto L_0x00e9;
                case 109648666: goto L_0x00e0;
                case 530542161: goto L_0x00d7;
                case 1094496948: goto L_0x00cf;
                case 1943291465: goto L_0x00c6;
                default: goto L_0x00be;
            }
        L_0x00be:
            r4 = r16
        L_0x00c0:
            r3 = r17
            r6 = r19
            goto L_0x017d
        L_0x00c6:
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x00be
            r1 = 3
            goto L_0x012f
        L_0x00cf:
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x00be
            r1 = 6
            goto L_0x012f
        L_0x00d7:
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x00be
            r1 = 10
            goto L_0x012f
        L_0x00e0:
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x00be
            r1 = 9
            goto L_0x012f
        L_0x00e9:
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x00be
            r1 = 8
            goto L_0x012f
        L_0x00f2:
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x00be
            r1 = 5
            goto L_0x012f
        L_0x00fa:
            java.lang.String r4 = "trim"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00be
            r1 = 16
            goto L_0x012f
        L_0x0105:
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x00be
            r1 = 15
            goto L_0x012f
        L_0x010e:
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x00be
            r1 = 4
            goto L_0x012f
        L_0x0116:
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto L_0x00be
            r1 = 11
            goto L_0x012f
        L_0x011f:
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto L_0x00be
            r1 = 7
            goto L_0x012f
        L_0x0127:
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00be
            r1 = 13
        L_0x012f:
            r4 = r16
            goto L_0x0158
        L_0x0132:
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00be
            r4 = r16
            r3 = r17
            r6 = r19
            r1 = 1
            goto L_0x017e
        L_0x0140:
            r4 = r16
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00c0
            r3 = r17
            r6 = r19
            r1 = 0
            goto L_0x017e
        L_0x014e:
            r4 = r16
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00c0
            r1 = 12
        L_0x0158:
            r3 = r17
            r6 = r19
            goto L_0x017e
        L_0x015d:
            r4 = r16
            r6 = r19
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x016c
            r1 = 14
            r3 = r17
            goto L_0x017e
        L_0x016c:
            r3 = r17
            goto L_0x017d
        L_0x016f:
            r4 = r16
            r3 = r17
            r6 = r19
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x017d
            r1 = 2
            goto L_0x017e
        L_0x017d:
            r1 = -1
        L_0x017e:
            java.lang.String r17 = "undefined"
            r20 = r3
            r19 = r4
            switch(r1) {
                case 0: goto L_0x0635;
                case 1: goto L_0x05fa;
                case 2: goto L_0x05b3;
                case 3: goto L_0x055c;
                case 4: goto L_0x04ff;
                case 5: goto L_0x04af;
                case 6: goto L_0x041f;
                case 7: goto L_0x03d3;
                case 8: goto L_0x033c;
                case 9: goto L_0x0286;
                case 10: goto L_0x0209;
                case 11: goto L_0x01f4;
                case 12: goto L_0x01de;
                case 13: goto L_0x01c7;
                case 14: goto L_0x01bd;
                case 15: goto L_0x01a6;
                case 16: goto L_0x0191;
                default: goto L_0x0187;
            }
        L_0x0187:
            r0 = r21
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Command not supported"
            r1.<init>(r2)
            throw r1
        L_0x0191:
            r1 = r24
            r3 = 0
            p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26538h(r5, r3, r1)
            r0 = r21
            java.lang.String r1 = r0.f18976f
            e.f.a.c.f.g.u r2 = new e.f.a.c.f.g.u
            java.lang.String r1 = r1.trim()
            r2.<init>(r1)
            goto L_0x067d
        L_0x01a6:
            r3 = 0
            r0 = r21
            r1 = r24
            p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26538h(r5, r3, r1)
            java.lang.String r1 = r0.f18976f
            e.f.a.c.f.g.u r2 = new e.f.a.c.f.g.u
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.lang.String r1 = r1.toUpperCase(r3)
            r2.<init>(r1)
            goto L_0x067d
        L_0x01bd:
            r3 = 0
            r0 = r21
            r1 = r24
            p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26538h(r6, r3, r1)
            goto L_0x0633
        L_0x01c7:
            r3 = 0
            r0 = r21
            r1 = r24
            p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26538h(r2, r3, r1)
            java.lang.String r1 = r0.f18976f
            e.f.a.c.f.g.u r2 = new e.f.a.c.f.g.u
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.lang.String r1 = r1.toLowerCase(r3)
            r2.<init>(r1)
            goto L_0x067d
        L_0x01de:
            r3 = 0
            r1 = r24
            r2 = r0
            r0 = r21
            p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26538h(r2, r3, r1)
            java.lang.String r1 = r0.f18976f
            e.f.a.c.f.g.u r2 = new e.f.a.c.f.g.u
            java.lang.String r1 = r1.toLowerCase()
            r2.<init>(r1)
            goto L_0x067d
        L_0x01f4:
            r3 = 0
            r0 = r21
            r1 = r24
            p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26538h(r14, r3, r1)
            java.lang.String r1 = r0.f18976f
            e.f.a.c.f.g.u r2 = new e.f.a.c.f.g.u
            java.lang.String r1 = r1.toUpperCase()
            r2.<init>(r1)
            goto L_0x067d
        L_0x0209:
            r0 = r21
            r1 = r24
            r2 = 2
            r3 = 0
            p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26540j(r9, r2, r1)
            java.lang.String r2 = r0.f18976f
            boolean r4 = r24.isEmpty()
            if (r4 != 0) goto L_0x0234
            java.lang.Object r4 = r1.get(r3)
            e.f.a.c.f.g.q r4 = (p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r4
            r3 = r23
            e.f.a.c.f.g.q r4 = r3.mo20144b(r4)
            java.lang.Double r4 = r4.mo19739d()
            double r4 = r4.doubleValue()
            double r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26531a(r4)
            int r4 = (int) r4
            goto L_0x0237
        L_0x0234:
            r3 = r23
            r4 = 0
        L_0x0237:
            int r5 = r24.size()
            r6 = 1
            if (r5 <= r6) goto L_0x0256
            java.lang.Object r1 = r1.get(r6)
            e.f.a.c.f.g.q r1 = (p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r1
            e.f.a.c.f.g.q r1 = r3.mo20144b(r1)
            java.lang.Double r1 = r1.mo19739d()
            double r5 = r1.doubleValue()
            double r5 = p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26531a(r5)
            int r1 = (int) r5
            goto L_0x025a
        L_0x0256:
            int r1 = r2.length()
        L_0x025a:
            r3 = 0
            int r4 = java.lang.Math.max(r4, r3)
            int r5 = r2.length()
            int r4 = java.lang.Math.min(r4, r5)
            int r1 = java.lang.Math.max(r1, r3)
            int r3 = r2.length()
            int r1 = java.lang.Math.min(r1, r3)
            e.f.a.c.f.g.u r3 = new e.f.a.c.f.g.u
            int r5 = java.lang.Math.min(r4, r1)
            int r1 = java.lang.Math.max(r4, r1)
            java.lang.String r1 = r2.substring(r5, r1)
            r3.<init>(r1)
            goto L_0x05b0
        L_0x0286:
            r0 = r21
            r3 = r23
            r1 = r24
            r2 = 2
            p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26540j(r10, r2, r1)
            java.lang.String r2 = r0.f18976f
            int r4 = r2.length()
            if (r4 != 0) goto L_0x02a9
            e.f.a.c.f.g.f r2 = new e.f.a.c.f.g.f
            r1 = 1
            e.f.a.c.f.g.q[] r1 = new p174e.p319f.p320a.p335c.p345f.p352g.C6954q[r1]
            r4 = 0
            r1[r4] = r0
            java.util.List r1 = java.util.Arrays.asList(r1)
            r2.<init>(r1)
            goto L_0x067d
        L_0x02a9:
            r4 = 0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            boolean r6 = r24.isEmpty()
            if (r6 == 0) goto L_0x02ba
            r5.add(r0)
            goto L_0x0335
        L_0x02ba:
            java.lang.Object r6 = r1.get(r4)
            e.f.a.c.f.g.q r6 = (p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r6
            e.f.a.c.f.g.q r4 = r3.mo20144b(r6)
            java.lang.String r4 = r4.mo19741g()
            int r6 = r24.size()
            r7 = 1
            if (r6 <= r7) goto L_0x02e6
            java.lang.Object r1 = r1.get(r7)
            e.f.a.c.f.g.q r1 = (p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r1
            e.f.a.c.f.g.q r1 = r3.mo20144b(r1)
            java.lang.Double r1 = r1.mo19739d()
            double r6 = r1.doubleValue()
            long r6 = p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26534d(r6)
            goto L_0x02e9
        L_0x02e6:
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
        L_0x02e9:
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x02f6
            e.f.a.c.f.g.f r2 = new e.f.a.c.f.g.f
            r2.<init>()
            goto L_0x067d
        L_0x02f6:
            java.lang.String r1 = java.util.regex.Pattern.quote(r4)
            int r3 = (int) r6
            r8 = 1
            int r3 = r3 + r8
            java.lang.String[] r1 = r2.split(r1, r3)
            int r2 = r1.length
            boolean r3 = r4.isEmpty()
            if (r3 == 0) goto L_0x031d
            if (r2 <= 0) goto L_0x031d
            r3 = 0
            r3 = r1[r3]
            boolean r14 = r3.isEmpty()
            int r3 = r2 + -1
            r4 = r1[r3]
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x031f
            r3 = r2
            goto L_0x031f
        L_0x031d:
            r3 = r2
            r14 = 0
        L_0x031f:
            long r8 = (long) r2
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x0326
            int r3 = r3 + -1
        L_0x0326:
            if (r14 >= r3) goto L_0x0335
            e.f.a.c.f.g.u r2 = new e.f.a.c.f.g.u
            r4 = r1[r14]
            r2.<init>(r4)
            r5.add(r2)
            int r14 = r14 + 1
            goto L_0x0326
        L_0x0335:
            e.f.a.c.f.g.f r2 = new e.f.a.c.f.g.f
            r2.<init>(r5)
            goto L_0x067d
        L_0x033c:
            r0 = r21
            r3 = r23
            r1 = r24
            r2 = 2
            p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26540j(r11, r2, r1)
            java.lang.String r2 = r0.f18976f
            boolean r4 = r24.isEmpty()
            if (r4 != 0) goto L_0x0362
            r4 = 0
            java.lang.Object r5 = r1.get(r4)
            e.f.a.c.f.g.q r5 = (p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r5
            e.f.a.c.f.g.q r4 = r3.mo20144b(r5)
            java.lang.Double r4 = r4.mo19739d()
            double r4 = r4.doubleValue()
            goto L_0x0364
        L_0x0362:
            r4 = 0
        L_0x0364:
            double r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26531a(r4)
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0379
            int r8 = r2.length()
            double r8 = (double) r8
            double r8 = r8 + r4
            double r4 = java.lang.Math.max(r8, r6)
            goto L_0x0382
        L_0x0379:
            int r6 = r2.length()
            double r6 = (double) r6
            double r4 = java.lang.Math.min(r4, r6)
        L_0x0382:
            int r4 = (int) r4
            int r5 = r24.size()
            r6 = 1
            if (r5 <= r6) goto L_0x039d
            java.lang.Object r1 = r1.get(r6)
            e.f.a.c.f.g.q r1 = (p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r1
            e.f.a.c.f.g.q r1 = r3.mo20144b(r1)
            java.lang.Double r1 = r1.mo19739d()
            double r5 = r1.doubleValue()
            goto L_0x03a2
        L_0x039d:
            int r1 = r2.length()
            double r5 = (double) r1
        L_0x03a2:
            double r5 = p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26531a(r5)
            r8 = 0
            int r1 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x03b7
            int r1 = r2.length()
            double r10 = (double) r1
            double r10 = r10 + r5
            double r5 = java.lang.Math.max(r10, r8)
            goto L_0x03c0
        L_0x03b7:
            int r1 = r2.length()
            double r7 = (double) r1
            double r5 = java.lang.Math.min(r5, r7)
        L_0x03c0:
            int r1 = (int) r5
            int r1 = r1 - r4
            r5 = 0
            int r1 = java.lang.Math.max(r5, r1)
            e.f.a.c.f.g.u r3 = new e.f.a.c.f.g.u
            int r1 = r1 + r4
            java.lang.String r1 = r2.substring(r4, r1)
            r3.<init>(r1)
            goto L_0x05b0
        L_0x03d3:
            r0 = r21
            r3 = r23
            r1 = r24
            r2 = 1
            r5 = 0
            p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26540j(r15, r2, r1)
            boolean r2 = r24.isEmpty()
            if (r2 != 0) goto L_0x03f2
            java.lang.Object r1 = r1.get(r5)
            e.f.a.c.f.g.q r1 = (p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r1
            e.f.a.c.f.g.q r1 = r3.mo20144b(r1)
            java.lang.String r17 = r1.mo19741g()
        L_0x03f2:
            java.lang.String r1 = r0.f18976f
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r17)
            java.util.regex.Matcher r1 = r2.matcher(r1)
            boolean r2 = r1.find()
            if (r2 == 0) goto L_0x0412
            e.f.a.c.f.g.i r2 = new e.f.a.c.f.g.i
            int r1 = r1.start()
            double r3 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r2.<init>(r1)
            goto L_0x067d
        L_0x0412:
            e.f.a.c.f.g.i r2 = new e.f.a.c.f.g.i
            r3 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r2.<init>(r1)
            goto L_0x067d
        L_0x041f:
            r2 = 2
            r0 = r21
            r3 = r23
            r1 = r24
            p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26540j(r8, r2, r1)
            e.f.a.c.f.g.q r2 = p174e.p319f.p320a.p335c.p345f.p352g.C6954q.f18804c
            boolean r4 = r24.isEmpty()
            if (r4 != 0) goto L_0x0451
            r4 = 0
            java.lang.Object r5 = r1.get(r4)
            e.f.a.c.f.g.q r5 = (p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r5
            e.f.a.c.f.g.q r4 = r3.mo20144b(r5)
            java.lang.String r17 = r4.mo19741g()
            int r4 = r24.size()
            r5 = 1
            if (r4 <= r5) goto L_0x0451
            java.lang.Object r1 = r1.get(r5)
            e.f.a.c.f.g.q r1 = (p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r1
            e.f.a.c.f.g.q r2 = r3.mo20144b(r1)
        L_0x0451:
            r1 = r17
            java.lang.String r4 = r0.f18976f
            int r5 = r4.indexOf(r1)
            if (r5 < 0) goto L_0x0633
            boolean r6 = r2 instanceof p174e.p319f.p320a.p335c.p345f.p352g.C6842j
            if (r6 == 0) goto L_0x0484
            e.f.a.c.f.g.j r2 = (p174e.p319f.p320a.p335c.p345f.p352g.C6842j) r2
            r6 = 3
            e.f.a.c.f.g.q[] r6 = new p174e.p319f.p320a.p335c.p345f.p352g.C6954q[r6]
            e.f.a.c.f.g.u r7 = new e.f.a.c.f.g.u
            r7.<init>(r1)
            r8 = 0
            r6[r8] = r7
            e.f.a.c.f.g.i r7 = new e.f.a.c.f.g.i
            double r8 = (double) r5
            java.lang.Double r8 = java.lang.Double.valueOf(r8)
            r7.<init>(r8)
            r8 = 1
            r6[r8] = r7
            r7 = 2
            r6[r7] = r0
            java.util.List r6 = java.util.Arrays.asList(r6)
            e.f.a.c.f.g.q r2 = r2.mo19542a(r3, r6)
        L_0x0484:
            e.f.a.c.f.g.u r3 = new e.f.a.c.f.g.u
            r6 = 0
            java.lang.String r6 = r4.substring(r6, r5)
            java.lang.String r2 = r2.mo19741g()
            int r1 = r1.length()
            int r5 = r5 + r1
            java.lang.String r1 = r4.substring(r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r3.<init>(r1)
            goto L_0x05b0
        L_0x04af:
            r0 = r21
            r3 = r23
            r1 = r24
            r2 = 1
            p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26540j(r12, r2, r1)
            java.lang.String r2 = r0.f18976f
            int r4 = r24.size()
            if (r4 > 0) goto L_0x04c4
            java.lang.String r1 = ""
            goto L_0x04d3
        L_0x04c4:
            r4 = 0
            java.lang.Object r1 = r1.get(r4)
            e.f.a.c.f.g.q r1 = (p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r1
            e.f.a.c.f.g.q r1 = r3.mo20144b(r1)
            java.lang.String r1 = r1.mo19741g()
        L_0x04d3:
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.util.regex.Matcher r1 = r1.matcher(r2)
            boolean r2 = r1.find()
            if (r2 == 0) goto L_0x04fb
            e.f.a.c.f.g.f r2 = new e.f.a.c.f.g.f
            r3 = 1
            e.f.a.c.f.g.q[] r3 = new p174e.p319f.p320a.p335c.p345f.p352g.C6954q[r3]
            e.f.a.c.f.g.u r4 = new e.f.a.c.f.g.u
            java.lang.String r1 = r1.group()
            r4.<init>(r1)
            r5 = 0
            r3[r5] = r4
            java.util.List r1 = java.util.Arrays.asList(r3)
            r2.<init>(r1)
            goto L_0x067d
        L_0x04fb:
            e.f.a.c.f.g.q r2 = p174e.p319f.p320a.p335c.p345f.p352g.C6954q.f18805d
            goto L_0x067d
        L_0x04ff:
            r0 = r21
            r3 = r23
            r1 = r24
            r2 = 2
            r5 = 0
            p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26540j(r13, r2, r1)
            java.lang.String r4 = r0.f18976f
            int r6 = r24.size()
            if (r6 > 0) goto L_0x0513
            goto L_0x0521
        L_0x0513:
            java.lang.Object r5 = r1.get(r5)
            e.f.a.c.f.g.q r5 = (p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r5
            e.f.a.c.f.g.q r5 = r3.mo20144b(r5)
            java.lang.String r17 = r5.mo19741g()
        L_0x0521:
            r5 = r17
            int r6 = r24.size()
            if (r6 >= r2) goto L_0x052c
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            goto L_0x053f
        L_0x052c:
            r2 = 1
            java.lang.Object r1 = r1.get(r2)
            e.f.a.c.f.g.q r1 = (p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r1
            e.f.a.c.f.g.q r1 = r3.mo20144b(r1)
            java.lang.Double r1 = r1.mo19739d()
            double r1 = r1.doubleValue()
        L_0x053f:
            boolean r3 = java.lang.Double.isNaN(r1)
            if (r3 == 0) goto L_0x0548
            r1 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            goto L_0x054c
        L_0x0548:
            double r1 = p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26531a(r1)
        L_0x054c:
            e.f.a.c.f.g.i r3 = new e.f.a.c.f.g.i
            int r1 = (int) r1
            int r1 = r4.lastIndexOf(r5, r1)
            double r1 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r3.<init>(r1)
            goto L_0x05b0
        L_0x055c:
            r0 = r21
            r3 = r23
            r1 = r24
            r2 = 2
            r8 = 0
            p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26540j(r7, r2, r1)
            java.lang.String r4 = r0.f18976f
            int r5 = r24.size()
            if (r5 > 0) goto L_0x0571
            goto L_0x0580
        L_0x0571:
            r5 = 0
            java.lang.Object r5 = r1.get(r5)
            e.f.a.c.f.g.q r5 = (p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r5
            e.f.a.c.f.g.q r5 = r3.mo20144b(r5)
            java.lang.String r17 = r5.mo19741g()
        L_0x0580:
            r5 = r17
            int r6 = r24.size()
            if (r6 >= r2) goto L_0x058a
            r1 = r8
            goto L_0x059d
        L_0x058a:
            r2 = 1
            java.lang.Object r1 = r1.get(r2)
            e.f.a.c.f.g.q r1 = (p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r1
            e.f.a.c.f.g.q r1 = r3.mo20144b(r1)
            java.lang.Double r1 = r1.mo19739d()
            double r1 = r1.doubleValue()
        L_0x059d:
            double r1 = p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26531a(r1)
            e.f.a.c.f.g.i r3 = new e.f.a.c.f.g.i
            int r1 = (int) r1
            int r1 = r4.indexOf(r5, r1)
            double r1 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r3.<init>(r1)
        L_0x05b0:
            r2 = r3
            goto L_0x067d
        L_0x05b3:
            r0 = r21
            r3 = r23
            r1 = r24
            r2 = r20
            r4 = 1
            p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26538h(r2, r4, r1)
            java.lang.String r2 = r0.f18976f
            r4 = 0
            java.lang.Object r1 = r1.get(r4)
            e.f.a.c.f.g.q r1 = (p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r1
            e.f.a.c.f.g.q r1 = r3.mo20144b(r1)
            java.lang.String r3 = r1.mo19741g()
            java.lang.String r4 = "length"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x05dc
        L_0x05d8:
            e.f.a.c.f.g.q r2 = p174e.p319f.p320a.p335c.p345f.p352g.C6954q.f18809i
            goto L_0x067d
        L_0x05dc:
            java.lang.Double r1 = r1.mo19739d()
            double r3 = r1.doubleValue()
            double r5 = java.lang.Math.floor(r3)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x05f6
            int r1 = (int) r3
            if (r1 < 0) goto L_0x05f6
            int r2 = r2.length()
            if (r1 >= r2) goto L_0x05f6
            goto L_0x05d8
        L_0x05f6:
            e.f.a.c.f.g.q r2 = p174e.p319f.p320a.p335c.p345f.p352g.C6954q.f18810j
            goto L_0x067d
        L_0x05fa:
            r0 = r21
            r3 = r23
            r1 = r24
            boolean r2 = r24.isEmpty()
            if (r2 != 0) goto L_0x0633
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = r0.f18976f
            r2.<init>(r4)
            r14 = 0
        L_0x060e:
            int r4 = r24.size()
            if (r14 >= r4) goto L_0x0628
            java.lang.Object r4 = r1.get(r14)
            e.f.a.c.f.g.q r4 = (p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r4
            e.f.a.c.f.g.q r4 = r3.mo20144b(r4)
            java.lang.String r4 = r4.mo19741g()
            r2.append(r4)
            int r14 = r14 + 1
            goto L_0x060e
        L_0x0628:
            e.f.a.c.f.g.u r1 = new e.f.a.c.f.g.u
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            r2 = r1
            goto L_0x067d
        L_0x0633:
            r2 = r0
            goto L_0x067d
        L_0x0635:
            r0 = r21
            r3 = r23
            r1 = r24
            r2 = r19
            r4 = 1
            p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26540j(r2, r4, r1)
            boolean r2 = r24.isEmpty()
            if (r2 != 0) goto L_0x0660
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            e.f.a.c.f.g.q r1 = (p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r1
            e.f.a.c.f.g.q r1 = r3.mo20144b(r1)
            java.lang.Double r1 = r1.mo19739d()
            double r1 = r1.doubleValue()
            double r1 = p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26531a(r1)
            int r14 = (int) r1
            goto L_0x0662
        L_0x0660:
            r2 = 0
            r14 = 0
        L_0x0662:
            java.lang.String r1 = r0.f18976f
            if (r14 < 0) goto L_0x067b
            int r2 = r1.length()
            if (r14 < r2) goto L_0x066d
            goto L_0x067b
        L_0x066d:
            e.f.a.c.f.g.u r2 = new e.f.a.c.f.g.u
            char r1 = r1.charAt(r14)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2.<init>(r1)
            goto L_0x067d
        L_0x067b:
            e.f.a.c.f.g.q r2 = p174e.p319f.p320a.p335c.p345f.p352g.C6954q.f18811k
        L_0x067d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p345f.p352g.C7018u.mo19748p(java.lang.String, e.f.a.c.f.g.s4, java.util.List):e.f.a.c.f.g.q");
    }

    public final String toString() {
        String str = this.f18976f;
        return "\"" + str + "\"";
    }
}
