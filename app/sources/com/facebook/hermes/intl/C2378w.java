package com.facebook.hermes.intl;

import com.facebook.hermes.intl.C2339e;
import java.math.RoundingMode;
import java.text.AttributedCharacterIterator;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import okhttp3.HttpUrl;

/* renamed from: com.facebook.hermes.intl.w */
public class C2378w implements C2339e {

    /* renamed from: a */
    private Format f7077a;

    /* renamed from: b */
    private DecimalFormat f7078b;

    /* renamed from: c */
    private C2363n f7079c;

    /* renamed from: d */
    private C2339e.C2347h f7080d;

    /* renamed from: com.facebook.hermes.intl.w$a */
    static /* synthetic */ class C2379a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7081a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.facebook.hermes.intl.e$c[] r0 = com.facebook.hermes.intl.C2339e.C2342c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7081a = r0
                com.facebook.hermes.intl.e$c r1 = com.facebook.hermes.intl.C2339e.C2342c.NAME     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7081a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.hermes.intl.e$c r1 = com.facebook.hermes.intl.C2339e.C2342c.CODE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f7081a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.hermes.intl.e$c r1 = com.facebook.hermes.intl.C2339e.C2342c.SYMBOL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f7081a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.hermes.intl.e$c r1 = com.facebook.hermes.intl.C2339e.C2342c.NARROWSYMBOL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.hermes.intl.C2378w.C2379a.<clinit>():void");
        }
    }

    C2378w() {
    }

    /* renamed from: n */
    public static int m9843n(String str) {
        try {
            return Currency.getInstance(str).getDefaultFractionDigits();
        } catch (IllegalArgumentException unused) {
            throw new C2354h("Invalid currency code !");
        }
    }

    /* renamed from: o */
    private void m9844o(DecimalFormat decimalFormat, C2320b<?> bVar, C2339e.C2347h hVar) {
        this.f7078b = decimalFormat;
        this.f7077a = decimalFormat;
        this.f7079c = (C2363n) bVar;
        this.f7080d = hVar;
    }

    /* renamed from: a */
    public String mo7980a(C2320b<?> bVar) {
        return "latn";
    }

    /* renamed from: b */
    public AttributedCharacterIterator mo7981b(double d) {
        return this.f7077a.formatToCharacterIterator(Double.valueOf(d));
    }

    /* renamed from: c */
    public String mo7982c(double d) {
        return this.f7077a.format(Double.valueOf(d));
    }

    /* renamed from: h */
    public String mo7987h(AttributedCharacterIterator.Attribute attribute, double d) {
        return "literal";
    }

    /* renamed from: m */
    public C2378w mo7990k(C2320b<?> bVar, String str, C2339e.C2347h hVar, C2339e.C2343d dVar, C2339e.C2344e eVar, C2339e.C2341b bVar2) {
        NumberFormat instance = NumberFormat.getInstance((Locale) bVar.mo7939h());
        instance.setRoundingMode(RoundingMode.HALF_UP);
        m9844o((DecimalFormat) instance, bVar, hVar);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r4 != 2) goto L_0x001d;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.hermes.intl.C2378w mo7985f(java.lang.String r3, com.facebook.hermes.intl.C2339e.C2342c r4) {
        /*
            r2 = this;
            com.facebook.hermes.intl.e$h r0 = r2.f7080d
            com.facebook.hermes.intl.e$h r1 = com.facebook.hermes.intl.C2339e.C2347h.CURRENCY
            if (r0 != r1) goto L_0x004f
            java.util.Currency r0 = java.util.Currency.getInstance(r3)
            java.text.DecimalFormat r1 = r2.f7078b
            r1.setCurrency(r0)
            int[] r1 = com.facebook.hermes.intl.C2378w.C2379a.f7081a
            int r4 = r4.ordinal()
            r4 = r1[r4]
            r1 = 1
            if (r4 == r1) goto L_0x0028
            r1 = 2
            if (r4 == r1) goto L_0x0038
        L_0x001d:
            com.facebook.hermes.intl.n r3 = r2.f7079c
            java.util.Locale r3 = r3.mo7939h()
            java.lang.String r3 = r0.getSymbol(r3)
            goto L_0x0038
        L_0x0028:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 19
            if (r3 < r4) goto L_0x001d
            com.facebook.hermes.intl.n r3 = r2.f7079c
            java.util.Locale r3 = r3.mo7939h()
            java.lang.String r3 = r0.getDisplayName(r3)
        L_0x0038:
            java.text.DecimalFormat r4 = r2.f7078b
            java.text.DecimalFormatSymbols r4 = r4.getDecimalFormatSymbols()
            r4.setCurrencySymbol(r3)
            java.text.DecimalFormat r0 = r2.f7078b
            r0.setDecimalFormatSymbols(r4)
            java.text.DecimalFormat r4 = r2.f7078b
            java.text.DecimalFormatSymbols r4 = r4.getDecimalFormatSymbols()
            r4.setCurrencySymbol(r3)
        L_0x004f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.hermes.intl.C2378w.mo7985f(java.lang.String, com.facebook.hermes.intl.e$c):com.facebook.hermes.intl.w");
    }

    /* renamed from: q */
    public C2378w mo7991l(C2339e.C2345f fVar, int i, int i2) {
        if (fVar == C2339e.C2345f.FRACTION_DIGITS) {
            if (i >= 0) {
                this.f7078b.setMinimumFractionDigits(i);
            }
            if (i2 >= 0) {
                this.f7078b.setMaximumFractionDigits(i2);
            }
        }
        return this;
    }

    /* renamed from: r */
    public C2378w mo7989j(boolean z) {
        this.f7078b.setGroupingUsed(z);
        return this;
    }

    /* renamed from: s */
    public C2378w mo7988i(int i) {
        if (i != -1) {
            this.f7078b.setMinimumIntegerDigits(i);
        }
        return this;
    }

    /* renamed from: t */
    public C2378w mo7984e(C2339e.C2346g gVar) {
        if (gVar == C2339e.C2346g.NEVER) {
            this.f7078b.setPositivePrefix(HttpUrl.FRAGMENT_ENCODE_SET);
            this.f7078b.setPositiveSuffix(HttpUrl.FRAGMENT_ENCODE_SET);
            this.f7078b.setNegativePrefix(HttpUrl.FRAGMENT_ENCODE_SET);
            this.f7078b.setNegativeSuffix(HttpUrl.FRAGMENT_ENCODE_SET);
        }
        return this;
    }

    /* renamed from: u */
    public C2378w mo7986g(C2339e.C2345f fVar, int i, int i2) {
        return this;
    }

    /* renamed from: v */
    public C2378w mo7983d(String str, C2339e.C2348i iVar) {
        return this;
    }
}
