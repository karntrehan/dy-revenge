package com.facebook.hermes.intl;

import android.icu.text.DateFormat;
import android.icu.text.NumberingSystem;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.icu.util.ULocale;
import com.facebook.hermes.intl.C2326d;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Date;

/* renamed from: com.facebook.hermes.intl.v */
public class C2376v implements C2326d {

    /* renamed from: a */
    private DateFormat f7076a = null;

    /* renamed from: com.facebook.hermes.intl.v$a */
    private static class C2377a {
        /* renamed from: a */
        public static String m9842a(String str) {
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

    C2376v() {
    }

    /* renamed from: j */
    private static String m9832j(C2326d.C2337k kVar, C2326d.C2329c cVar, C2326d.C2338l lVar, C2326d.C2334h hVar, C2326d.C2328b bVar, C2326d.C2331e eVar, C2326d.C2333g gVar, C2326d.C2335i iVar, C2326d.C2336j jVar, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(kVar.mo7976e());
        sb.append(cVar.mo7961e());
        sb.append(lVar.mo7978e());
        sb.append(hVar.mo7970e());
        sb.append(bVar.mo7959e());
        sb.append(z ? eVar.mo7964e() : eVar.mo7965g());
        sb.append(gVar.mo7968e());
        sb.append(iVar.mo7972e());
        sb.append(jVar.mo7974e());
        return sb.toString();
    }

    /* renamed from: a */
    public String mo7950a(C2320b<?> bVar) {
        return NumberingSystem.getInstance((ULocale) bVar.mo7939h()).getName();
    }

    /* renamed from: b */
    public AttributedCharacterIterator mo7951b(double d) {
        return this.f7076a.formatToCharacterIterator(Double.valueOf(d));
    }

    /* renamed from: c */
    public String mo7952c(double d) {
        return this.f7076a.format(new Date((long) d));
    }

    /* renamed from: d */
    public String mo7953d(C2320b<?> bVar) {
        return Calendar.getInstance((ULocale) bVar.mo7939h()).getTimeZone().getID();
    }

    /* renamed from: e */
    public void mo7954e(C2320b<?> bVar, String str, String str2, C2326d.C2330d dVar, C2326d.C2337k kVar, C2326d.C2329c cVar, C2326d.C2338l lVar, C2326d.C2334h hVar, C2326d.C2328b bVar2, C2326d.C2331e eVar, C2326d.C2333g gVar, C2326d.C2335i iVar, C2326d.C2336j jVar, C2326d.C2332f fVar, Object obj) {
        String str3 = str2;
        C2326d.C2332f fVar2 = fVar;
        String j = m9832j(kVar, cVar, lVar, hVar, bVar2, eVar, gVar, iVar, jVar, fVar2 == C2326d.C2332f.H11 || fVar2 == C2326d.C2332f.H12);
        Calendar calendar = null;
        if (!str.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(C2350g.m9721h(str));
            C2320b<?> e = bVar.mo7936e();
            e.mo7938g("ca", arrayList);
            calendar = Calendar.getInstance((ULocale) e.mo7939h());
        }
        if (!str2.isEmpty()) {
            try {
                if (NumberingSystem.getInstanceByName(C2350g.m9721h(str2)) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(C2350g.m9721h(str2));
                    C2320b<?> bVar3 = bVar;
                    bVar.mo7938g("nu", arrayList2);
                } else {
                    throw new C2354h("Invalid numbering system: " + str3);
                }
            } catch (RuntimeException unused) {
                throw new C2354h("Invalid numbering system: " + str3);
            }
        } else {
            C2320b<?> bVar4 = bVar;
        }
        ULocale uLocale = (ULocale) bVar.mo7939h();
        this.f7076a = calendar != null ? DateFormat.getPatternInstance(calendar, j, uLocale) : DateFormat.getPatternInstance(j, uLocale);
        if (!C2350g.m9727n(obj) && !C2350g.m9723j(obj)) {
            this.f7076a.setTimeZone(TimeZone.getTimeZone(C2350g.m9721h(obj)));
        }
    }

    /* renamed from: f */
    public C2326d.C2332f mo7955f(C2320b<?> bVar) {
        try {
            String a = C2377a.m9842a(((SimpleDateFormat) DateFormat.getTimeInstance(0, (ULocale) bVar.mo7939h())).toPattern());
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
        return C2382y.m9891d(DateFormat.getDateInstance(3, (ULocale) bVar.mo7939h()).getCalendar().getType());
    }

    /* renamed from: i */
    public boolean mo7958i(String str) {
        return TimeZone.getTimeZone(str).getID().equals(str);
    }
}
