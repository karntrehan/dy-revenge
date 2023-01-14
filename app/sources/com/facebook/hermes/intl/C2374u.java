package com.facebook.hermes.intl;

import com.facebook.hermes.intl.C2326d;
import java.text.AttributedCharacterIterator;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.facebook.hermes.intl.u */
public class C2374u implements C2326d {

    /* renamed from: a */
    private DateFormat f7075a = null;

    /* renamed from: com.facebook.hermes.intl.u$a */
    private static class C2375a {
        /* renamed from: a */
        public static String m9831a(String str) {
            StringBuilder sb = new StringBuilder();
            boolean z = false;
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (charAt == '\'') {
                    z = !z;
                } else if (!z && ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z'))) {
                    sb.append(str.charAt(i));
                }
            }
            return sb.toString();
        }
    }

    C2374u() {
    }

    /* renamed from: a */
    public String mo7950a(C2320b<?> bVar) {
        return "latn";
    }

    /* renamed from: b */
    public AttributedCharacterIterator mo7951b(double d) {
        return this.f7075a.formatToCharacterIterator(Double.valueOf(d));
    }

    /* renamed from: c */
    public String mo7952c(double d) {
        return this.f7075a.format(new Date((long) d));
    }

    /* renamed from: d */
    public String mo7953d(C2320b<?> bVar) {
        return Calendar.getInstance((Locale) bVar.mo7939h()).getTimeZone().getID();
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7954e(com.facebook.hermes.intl.C2320b<?> r1, java.lang.String r2, java.lang.String r3, com.facebook.hermes.intl.C2326d.C2330d r4, com.facebook.hermes.intl.C2326d.C2337k r5, com.facebook.hermes.intl.C2326d.C2329c r6, com.facebook.hermes.intl.C2326d.C2338l r7, com.facebook.hermes.intl.C2326d.C2334h r8, com.facebook.hermes.intl.C2326d.C2328b r9, com.facebook.hermes.intl.C2326d.C2331e r10, com.facebook.hermes.intl.C2326d.C2333g r11, com.facebook.hermes.intl.C2326d.C2335i r12, com.facebook.hermes.intl.C2326d.C2336j r13, com.facebook.hermes.intl.C2326d.C2332f r14, java.lang.Object r15) {
        /*
            r0 = this;
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L_0x0017
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.String r2 = com.facebook.hermes.intl.C2350g.m9721h(r2)
            r4.add(r2)
            java.lang.String r2 = "ca"
            r1.mo7938g(r2, r4)
        L_0x0017:
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x002e
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r3 = com.facebook.hermes.intl.C2350g.m9721h(r3)
            r2.add(r3)
            java.lang.String r3 = "nu"
            r1.mo7938g(r3, r2)
        L_0x002e:
            r2 = 1
            r3 = 0
            if (r7 != 0) goto L_0x0039
            if (r8 != 0) goto L_0x0039
            if (r9 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r4 = 0
            goto L_0x003a
        L_0x0039:
            r4 = 1
        L_0x003a:
            if (r10 != 0) goto L_0x0042
            if (r11 != 0) goto L_0x0042
            if (r12 == 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r2 = 0
        L_0x0042:
            if (r4 == 0) goto L_0x0051
            if (r2 == 0) goto L_0x0051
            java.lang.Object r1 = r1.mo7939h()
            java.util.Locale r1 = (java.util.Locale) r1
            java.text.DateFormat r1 = java.text.DateFormat.getDateTimeInstance(r3, r3, r1)
            goto L_0x005d
        L_0x0051:
            if (r4 == 0) goto L_0x0060
            java.lang.Object r1 = r1.mo7939h()
            java.util.Locale r1 = (java.util.Locale) r1
            java.text.DateFormat r1 = java.text.DateFormat.getDateInstance(r3, r1)
        L_0x005d:
            r0.f7075a = r1
            goto L_0x006d
        L_0x0060:
            if (r2 == 0) goto L_0x006d
            java.lang.Object r1 = r1.mo7939h()
            java.util.Locale r1 = (java.util.Locale) r1
            java.text.DateFormat r1 = java.text.DateFormat.getTimeInstance(r3, r1)
            goto L_0x005d
        L_0x006d:
            boolean r1 = com.facebook.hermes.intl.C2350g.m9727n(r15)
            if (r1 != 0) goto L_0x0086
            boolean r1 = com.facebook.hermes.intl.C2350g.m9723j(r15)
            if (r1 != 0) goto L_0x0086
            java.lang.String r1 = com.facebook.hermes.intl.C2350g.m9721h(r15)
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
            java.text.DateFormat r2 = r0.f7075a
            r2.setTimeZone(r1)
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.hermes.intl.C2374u.mo7954e(com.facebook.hermes.intl.b, java.lang.String, java.lang.String, com.facebook.hermes.intl.d$d, com.facebook.hermes.intl.d$k, com.facebook.hermes.intl.d$c, com.facebook.hermes.intl.d$l, com.facebook.hermes.intl.d$h, com.facebook.hermes.intl.d$b, com.facebook.hermes.intl.d$e, com.facebook.hermes.intl.d$g, com.facebook.hermes.intl.d$i, com.facebook.hermes.intl.d$j, com.facebook.hermes.intl.d$f, java.lang.Object):void");
    }

    /* renamed from: f */
    public C2326d.C2332f mo7955f(C2320b<?> bVar) {
        try {
            String a = C2375a.m9831a(((SimpleDateFormat) DateFormat.getTimeInstance(0, (Locale) bVar.mo7939h())).toPattern());
            return a.contains(String.valueOf('h')) ? C2326d.C2332f.H12 : a.contains(String.valueOf('K')) ? C2326d.C2332f.H11 : a.contains(String.valueOf('H')) ? C2326d.C2332f.H23 : C2326d.C2332f.H24;
        } catch (ClassCastException unused) {
            return C2326d.C2332f.H24;
        }
    }

    /* renamed from: g */
    public String mo7956g(AttributedCharacterIterator.Attribute attribute, String str) {
        if (attribute == DateFormat.Field.DAY_OF_WEEK) {
            return "weekday";
        }
        if (attribute == DateFormat.Field.ERA) {
            return "era";
        }
        if (attribute != DateFormat.Field.YEAR) {
            return attribute == DateFormat.Field.MONTH ? "month" : attribute == DateFormat.Field.DAY_OF_MONTH ? "day" : (attribute == DateFormat.Field.HOUR0 || attribute == DateFormat.Field.HOUR1 || attribute == DateFormat.Field.HOUR_OF_DAY0 || attribute == DateFormat.Field.HOUR_OF_DAY1) ? "hour" : attribute == DateFormat.Field.MINUTE ? "minute" : attribute == DateFormat.Field.SECOND ? "second" : attribute == DateFormat.Field.TIME_ZONE ? "timeZoneName" : attribute == DateFormat.Field.AM_PM ? "dayPeriod" : attribute.toString().equals("android.icu.text.DateFormat$Field(related year)") ? "relatedYear" : "literal";
        }
        try {
            Double.parseDouble(str);
            return "year";
        } catch (NumberFormatException unused) {
            return "yearName";
        }
    }

    /* renamed from: h */
    public String mo7957h(C2320b<?> bVar) {
        return DateFormat.getDateInstance(3, (Locale) bVar.mo7939h()).getCalendar().toString();
    }

    /* renamed from: i */
    public boolean mo7958i(String str) {
        return TimeZone.getTimeZone(str).getID().equals(str);
    }
}
