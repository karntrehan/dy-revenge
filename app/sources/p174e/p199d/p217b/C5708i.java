package p174e.p199d.p217b;

import java.text.DecimalFormat;

/* renamed from: e.d.b.i */
public final class C5708i {

    /* renamed from: a */
    private final double f16160a;

    /* renamed from: b */
    private final double f16161b;

    public C5708i(double d, double d2) {
        this.f16160a = d;
        this.f16161b = d2;
    }

    /* renamed from: a */
    public static double[] m21217a(double d) {
        int i = (int) d;
        double abs = Math.abs((d % 1.0d) * 60.0d);
        return new double[]{(double) i, (double) ((int) abs), (abs % 1.0d) * 60.0d};
    }

    /* renamed from: b */
    public static String m21218b(double d) {
        double[] a = m21217a(d);
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        return String.format("%s° %s' %s\"", new Object[]{decimalFormat.format(a[0]), decimalFormat.format(a[1]), decimalFormat.format(a[2])});
    }

    /* renamed from: c */
    public static Double m21219c(C5712m mVar, C5712m mVar2, C5712m mVar3, boolean z) {
        double abs = Math.abs(mVar.doubleValue()) + (mVar2.doubleValue() / 60.0d) + (mVar3.doubleValue() / 3600.0d);
        if (Double.isNaN(abs)) {
            return null;
        }
        if (z) {
            abs *= -1.0d;
        }
        return Double.valueOf(abs);
    }

    /* renamed from: d */
    public double mo17032d() {
        return this.f16160a;
    }

    /* renamed from: e */
    public double mo17033e() {
        return this.f16161b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5708i.class != obj.getClass()) {
            return false;
        }
        C5708i iVar = (C5708i) obj;
        return Double.compare(iVar.f16160a, this.f16160a) == 0 && Double.compare(iVar.f16161b, this.f16161b) == 0;
    }

    public int hashCode() {
        double d = this.f16160a;
        long j = 0;
        long doubleToLongBits = d != 0.0d ? Double.doubleToLongBits(d) : 0;
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        double d2 = this.f16161b;
        if (d2 != 0.0d) {
            j = Double.doubleToLongBits(d2);
        }
        return (i * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return this.f16160a + ", " + this.f16161b;
    }
}
