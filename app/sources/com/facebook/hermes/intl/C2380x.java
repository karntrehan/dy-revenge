package com.facebook.hermes.intl;

import android.icu.text.CompactDecimalFormat;
import android.icu.text.DecimalFormat;
import android.icu.text.DecimalFormatSymbols;
import android.icu.text.MeasureFormat;
import android.icu.text.NumberFormat;
import android.icu.text.NumberingSystem;
import android.icu.util.Currency;
import android.icu.util.MeasureUnit;
import android.icu.util.ULocale;
import com.facebook.hermes.intl.C2339e;
import java.text.AttributedCharacterIterator;
import java.text.Format;
import java.util.ArrayList;
import okhttp3.HttpUrl;

/* renamed from: com.facebook.hermes.intl.x */
public class C2380x implements C2339e {

    /* renamed from: a */
    private Format f7082a;

    /* renamed from: b */
    private NumberFormat f7083b;

    /* renamed from: c */
    private C2364o f7084c;

    /* renamed from: d */
    private C2339e.C2347h f7085d;

    /* renamed from: e */
    private MeasureUnit f7086e;

    /* renamed from: com.facebook.hermes.intl.x$a */
    static /* synthetic */ class C2381a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7087a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.facebook.hermes.intl.e$g[] r0 = com.facebook.hermes.intl.C2339e.C2346g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7087a = r0
                com.facebook.hermes.intl.e$g r1 = com.facebook.hermes.intl.C2339e.C2346g.NEVER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7087a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.hermes.intl.e$g r1 = com.facebook.hermes.intl.C2339e.C2346g.ALWAYS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f7087a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.hermes.intl.e$g r1 = com.facebook.hermes.intl.C2339e.C2346g.EXCEPTZERO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.hermes.intl.C2380x.C2381a.<clinit>():void");
        }
    }

    C2380x() {
    }

    /* renamed from: n */
    public static int m9865n(String str) {
        try {
            return Currency.getInstance(str).getDefaultFractionDigits();
        } catch (IllegalArgumentException unused) {
            throw new C2354h("Invalid currency code !");
        }
    }

    /* renamed from: o */
    private void m9866o(NumberFormat numberFormat, C2320b<?> bVar, C2339e.C2347h hVar) {
        this.f7083b = numberFormat;
        this.f7082a = numberFormat;
        this.f7084c = (C2364o) bVar;
        this.f7085d = hVar;
        numberFormat.setRoundingMode(4);
    }

    /* renamed from: p */
    private static MeasureUnit m9867p(String str) {
        for (MeasureUnit next : MeasureUnit.getAvailable()) {
            if (!next.getSubtype().equals(str)) {
                String subtype = next.getSubtype();
                if (subtype.equals(next.getType() + "-" + str)) {
                }
            }
            return next;
        }
        throw new C2354h("Unknown unit: " + str);
    }

    /* renamed from: a */
    public String mo7980a(C2320b<?> bVar) {
        return NumberingSystem.getInstance((ULocale) bVar.mo7939h()).getName();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        return android.icu.text.NumberFormat.getInstance(android.icu.util.ULocale.forLanguageTag("en")).formatToCharacterIterator(java.lang.Double.valueOf(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        return android.icu.text.NumberFormat.getInstance(android.icu.util.ULocale.getDefault()).formatToCharacterIterator(java.lang.Double.valueOf(r6));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.text.AttributedCharacterIterator mo7981b(double r6) {
        /*
            r5 = this;
            java.lang.String r0 = "en"
            java.text.Format r1 = r5.f7082a     // Catch:{ NumberFormatException -> 0x0033 }
            boolean r2 = r1 instanceof android.icu.text.MeasureFormat     // Catch:{ NumberFormatException -> 0x0033 }
            if (r2 == 0) goto L_0x001c
            android.icu.util.MeasureUnit r2 = r5.f7086e     // Catch:{ NumberFormatException -> 0x0033 }
            if (r2 == 0) goto L_0x001c
            android.icu.util.Measure r2 = new android.icu.util.Measure     // Catch:{ NumberFormatException -> 0x0033 }
            java.lang.Double r3 = java.lang.Double.valueOf(r6)     // Catch:{ NumberFormatException -> 0x0033 }
            android.icu.util.MeasureUnit r4 = r5.f7086e     // Catch:{ NumberFormatException -> 0x0033 }
            r2.<init>(r3, r4)     // Catch:{ NumberFormatException -> 0x0033 }
        L_0x0017:
            java.text.AttributedCharacterIterator r6 = r1.formatToCharacterIterator(r2)     // Catch:{ NumberFormatException -> 0x0033 }
            goto L_0x0021
        L_0x001c:
            java.lang.Double r2 = java.lang.Double.valueOf(r6)     // Catch:{ NumberFormatException -> 0x0033 }
            goto L_0x0017
        L_0x0021:
            return r6
        L_0x0022:
            android.icu.util.ULocale r0 = android.icu.util.ULocale.forLanguageTag(r0)
            android.icu.text.NumberFormat r0 = android.icu.text.NumberFormat.getInstance(r0)
            java.lang.Double r6 = java.lang.Double.valueOf(r6)
            java.text.AttributedCharacterIterator r6 = r0.formatToCharacterIterator(r6)
            return r6
        L_0x0033:
            android.icu.util.ULocale r1 = android.icu.util.ULocale.getDefault()     // Catch:{ Exception -> 0x0022 }
            android.icu.text.NumberFormat r1 = android.icu.text.NumberFormat.getInstance(r1)     // Catch:{ Exception -> 0x0022 }
            java.lang.Double r2 = java.lang.Double.valueOf(r6)     // Catch:{ Exception -> 0x0022 }
            java.text.AttributedCharacterIterator r6 = r1.formatToCharacterIterator(r2)     // Catch:{ Exception -> 0x0022 }
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.hermes.intl.C2380x.mo7981b(double):java.text.AttributedCharacterIterator");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        return android.icu.text.NumberFormat.getInstance(android.icu.util.ULocale.getDefault()).format(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        return android.icu.text.NumberFormat.getInstance(android.icu.util.ULocale.forLanguageTag("en")).format(r5);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0020 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo7982c(double r5) {
        /*
            r4 = this;
            java.text.Format r0 = r4.f7082a     // Catch:{ NumberFormatException -> 0x0020 }
            boolean r1 = r0 instanceof android.icu.text.MeasureFormat     // Catch:{ NumberFormatException -> 0x0020 }
            if (r1 == 0) goto L_0x001a
            android.icu.util.MeasureUnit r1 = r4.f7086e     // Catch:{ NumberFormatException -> 0x0020 }
            if (r1 == 0) goto L_0x001a
            android.icu.util.Measure r1 = new android.icu.util.Measure     // Catch:{ NumberFormatException -> 0x0020 }
            java.lang.Double r2 = java.lang.Double.valueOf(r5)     // Catch:{ NumberFormatException -> 0x0020 }
            android.icu.util.MeasureUnit r3 = r4.f7086e     // Catch:{ NumberFormatException -> 0x0020 }
            r1.<init>(r2, r3)     // Catch:{ NumberFormatException -> 0x0020 }
        L_0x0015:
            java.lang.String r5 = r0.format(r1)     // Catch:{ NumberFormatException -> 0x0020 }
            goto L_0x001f
        L_0x001a:
            java.lang.Double r1 = java.lang.Double.valueOf(r5)     // Catch:{ NumberFormatException -> 0x0020 }
            goto L_0x0015
        L_0x001f:
            return r5
        L_0x0020:
            android.icu.util.ULocale r0 = android.icu.util.ULocale.getDefault()     // Catch:{ RuntimeException -> 0x002d }
            android.icu.text.NumberFormat r0 = android.icu.text.NumberFormat.getInstance(r0)     // Catch:{ RuntimeException -> 0x002d }
            java.lang.String r5 = r0.format(r5)     // Catch:{ RuntimeException -> 0x002d }
            return r5
        L_0x002d:
            java.lang.String r0 = "en"
            android.icu.util.ULocale r0 = android.icu.util.ULocale.forLanguageTag(r0)
            android.icu.text.NumberFormat r0 = android.icu.text.NumberFormat.getInstance(r0)
            java.lang.String r5 = r0.format(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.hermes.intl.C2380x.mo7982c(double):java.lang.String");
    }

    /* renamed from: h */
    public String mo7987h(AttributedCharacterIterator.Attribute attribute, double d) {
        return attribute == NumberFormat.Field.SIGN ? Double.compare(d, 0.0d) >= 0 ? "plusSign" : "minusSign" : attribute == NumberFormat.Field.INTEGER ? Double.isNaN(d) ? "nan" : Double.isInfinite(d) ? "infinity" : "integer" : attribute == NumberFormat.Field.FRACTION ? "fraction" : attribute == NumberFormat.Field.EXPONENT ? "exponentInteger" : attribute == NumberFormat.Field.EXPONENT_SIGN ? "exponentMinusSign" : attribute == NumberFormat.Field.EXPONENT_SYMBOL ? "exponentSeparator" : attribute == NumberFormat.Field.DECIMAL_SEPARATOR ? "decimal" : attribute == NumberFormat.Field.GROUPING_SEPARATOR ? "group" : attribute == NumberFormat.Field.PERCENT ? "percentSign" : attribute == NumberFormat.Field.PERMILLE ? "permilleSign" : attribute == NumberFormat.Field.CURRENCY ? "currency" : attribute.toString().equals("android.icu.text.NumberFormat$Field(compact)") ? "compact" : "literal";
    }

    /* renamed from: m */
    public C2380x mo7990k(C2320b<?> bVar, String str, C2339e.C2347h hVar, C2339e.C2343d dVar, C2339e.C2344e eVar, C2339e.C2341b bVar2) {
        NumberFormat numberFormat;
        if (!str.isEmpty()) {
            try {
                if (NumberingSystem.getInstanceByName(C2350g.m9721h(str)) != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(C2350g.m9721h(str));
                    bVar.mo7938g("nu", arrayList);
                } else {
                    throw new C2354h("Invalid numbering system: " + str);
                }
            } catch (RuntimeException unused) {
                throw new C2354h("Invalid numbering system: " + str);
            }
        }
        if (eVar == C2339e.C2344e.COMPACT && (hVar == C2339e.C2347h.DECIMAL || hVar == C2339e.C2347h.UNIT)) {
            numberFormat = CompactDecimalFormat.getInstance((ULocale) bVar.mo7939h(), bVar2 == C2339e.C2341b.SHORT ? CompactDecimalFormat.CompactStyle.SHORT : CompactDecimalFormat.CompactStyle.LONG);
        } else {
            numberFormat = NumberFormat.getInstance((ULocale) bVar.mo7939h(), hVar.mo7998e(eVar, dVar));
            if (eVar == C2339e.C2344e.ENGINEERING) {
                numberFormat.setMaximumIntegerDigits(3);
            }
        }
        m9866o(numberFormat, bVar, hVar);
        return this;
    }

    /* renamed from: q */
    public C2380x mo7985f(String str, C2339e.C2342c cVar) {
        if (this.f7085d == C2339e.C2347h.CURRENCY) {
            Currency instance = Currency.getInstance(str);
            this.f7083b.setCurrency(instance);
            if (cVar != C2339e.C2342c.CODE) {
                str = instance.getName(this.f7084c.mo7939h(), cVar.mo7993e(), (boolean[]) null);
            }
            NumberFormat numberFormat = this.f7083b;
            if (numberFormat instanceof DecimalFormat) {
                DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
                DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
                decimalFormatSymbols.setCurrencySymbol(str);
                decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
            }
        }
        return this;
    }

    /* renamed from: r */
    public C2380x mo7991l(C2339e.C2345f fVar, int i, int i2) {
        if (fVar == C2339e.C2345f.FRACTION_DIGITS) {
            if (i >= 0) {
                this.f7083b.setMinimumFractionDigits(i);
            }
            if (i2 >= 0) {
                this.f7083b.setMaximumFractionDigits(i2);
            }
            NumberFormat numberFormat = this.f7083b;
            if (numberFormat instanceof DecimalFormat) {
                ((DecimalFormat) numberFormat).setSignificantDigitsUsed(false);
            }
        }
        return this;
    }

    /* renamed from: s */
    public C2380x mo7989j(boolean z) {
        this.f7083b.setGroupingUsed(z);
        return this;
    }

    /* renamed from: t */
    public C2380x mo7988i(int i) {
        if (i != -1) {
            this.f7083b.setMinimumIntegerDigits(i);
        }
        return this;
    }

    /* renamed from: u */
    public C2380x mo7984e(C2339e.C2346g gVar) {
        NumberFormat numberFormat = this.f7083b;
        if (numberFormat instanceof DecimalFormat) {
            DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
            DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
            int i = C2381a.f7087a[gVar.ordinal()];
            if (i == 1) {
                decimalFormat.setPositivePrefix(HttpUrl.FRAGMENT_ENCODE_SET);
                decimalFormat.setPositiveSuffix(HttpUrl.FRAGMENT_ENCODE_SET);
                decimalFormat.setNegativePrefix(HttpUrl.FRAGMENT_ENCODE_SET);
                decimalFormat.setNegativeSuffix(HttpUrl.FRAGMENT_ENCODE_SET);
            } else if (i == 2 || i == 3) {
                if (!decimalFormat.getNegativePrefix().isEmpty()) {
                    decimalFormat.setPositivePrefix(new String(new char[]{decimalFormatSymbols.getPlusSign()}));
                }
                if (!decimalFormat.getNegativeSuffix().isEmpty()) {
                    decimalFormat.setPositiveSuffix(new String(new char[]{decimalFormatSymbols.getPlusSign()}));
                }
            }
        }
        return this;
    }

    /* renamed from: v */
    public C2380x mo7986g(C2339e.C2345f fVar, int i, int i2) {
        NumberFormat numberFormat = this.f7083b;
        if ((numberFormat instanceof DecimalFormat) && fVar == C2339e.C2345f.SIGNIFICANT_DIGITS) {
            DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
            if (i >= 0) {
                decimalFormat.setMinimumSignificantDigits(i);
            }
            if (i2 >= 0) {
                if (i2 >= decimalFormat.getMinimumSignificantDigits()) {
                    decimalFormat.setMaximumSignificantDigits(i2);
                } else {
                    throw new C2354h("maximumSignificantDigits should be at least equal to minimumSignificantDigits");
                }
            }
            decimalFormat.setSignificantDigitsUsed(true);
        }
        return this;
    }

    /* renamed from: w */
    public C2380x mo7983d(String str, C2339e.C2348i iVar) {
        if (this.f7085d == C2339e.C2347h.UNIT) {
            this.f7086e = m9867p(str);
            this.f7082a = MeasureFormat.getInstance(this.f7084c.mo7939h(), iVar.mo8000e(), this.f7083b);
        }
        return this;
    }
}
