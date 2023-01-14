package p027c.p041c.p042b;

import android.os.Bundle;

/* renamed from: c.c.b.a */
public final class C1495a {

    /* renamed from: a */
    public final Integer f4651a;

    /* renamed from: b */
    public final Integer f4652b;

    /* renamed from: c */
    public final Integer f4653c;

    /* renamed from: d */
    public final Integer f4654d;

    /* renamed from: c.c.b.a$a */
    public static final class C1496a {

        /* renamed from: a */
        private Integer f4655a;

        /* renamed from: b */
        private Integer f4656b;

        /* renamed from: c */
        private Integer f4657c;

        /* renamed from: d */
        private Integer f4658d;

        /* renamed from: a */
        public C1495a mo5551a() {
            return new C1495a(this.f4655a, this.f4656b, this.f4657c, this.f4658d);
        }
    }

    C1495a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f4651a = num;
        this.f4652b = num2;
        this.f4653c = num3;
        this.f4654d = num4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Bundle mo5550a() {
        Bundle bundle = new Bundle();
        Integer num = this.f4651a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f4652b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f4653c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f4654d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
