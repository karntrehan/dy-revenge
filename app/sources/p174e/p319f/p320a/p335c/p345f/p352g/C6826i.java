package p174e.p319f.p320a.p335c.p345f.p352g;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* renamed from: e.f.a.c.f.g.i */
public final class C6826i implements C6954q {

    /* renamed from: f */
    private final Double f18528f;

    public C6826i(Double d) {
        if (d == null) {
            this.f18528f = Double.valueOf(Double.NaN);
        } else {
            this.f18528f = d;
        }
    }

    /* renamed from: b */
    public final C6954q mo19738b() {
        return new C6826i(this.f18528f);
    }

    /* renamed from: d */
    public final Double mo19739d() {
        return this.f18528f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6826i)) {
            return false;
        }
        return this.f18528f.equals(((C6826i) obj).f18528f);
    }

    /* renamed from: g */
    public final String mo19741g() {
        if (Double.isNaN(this.f18528f.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.f18528f.doubleValue())) {
            return this.f18528f.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal stripTrailingZeros = BigDecimal.valueOf(this.f18528f.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((stripTrailingZeros.scale() > 0 ? stripTrailingZeros.precision() : stripTrailingZeros.scale()) - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf("E");
        if (indexOf <= 0) {
            return format;
        }
        int parseInt = Integer.parseInt(format.substring(indexOf + 1));
        return ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) ? format.replace("E-", "e-").replace("E", "e+") : stripTrailingZeros.toPlainString();
    }

    /* renamed from: h */
    public final Boolean mo19742h() {
        boolean z = false;
        if (!Double.isNaN(this.f18528f.doubleValue()) && this.f18528f.doubleValue() != 0.0d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final int hashCode() {
        return this.f18528f.hashCode();
    }

    /* renamed from: j */
    public final Iterator mo19745j() {
        return null;
    }

    /* renamed from: p */
    public final C6954q mo19748p(String str, C6991s4 s4Var, List list) {
        if ("toString".equals(str)) {
            return new C7018u(mo19741g());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{mo19741g(), str}));
    }

    public final String toString() {
        return mo19741g();
    }
}
