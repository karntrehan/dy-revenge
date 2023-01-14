package p174e.p199d.p218c.p228n.p229a0;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import p027c.p028a.C1444j;
import p174e.p199d.p218c.C5737g;
import p174e.p199d.p218c.C5739i;
import p174e.p319f.p320a.p363d.C9024k;

/* renamed from: e.d.c.n.a0.q0 */
public class C5799q0 extends C5739i<C5801r0> {
    public C5799q0(C5801r0 r0Var) {
        super(r0Var);
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        switch (i) {
            case 0:
                return String.format("%d", new Object[]{((C5801r0) this.f16215a).mo17148l(i)});
            case 2:
                return ((C5801r0) this.f16215a).mo17153r(i);
            case 12:
                return ((C5801r0) this.f16215a).mo17153r(i);
            case 14:
                int[] k = ((C5801r0) this.f16215a).mo17147k(i);
                if (k == null) {
                    return null;
                }
                return String.format("%d/%d", new Object[]{Integer.valueOf(k[0]), Integer.valueOf(k[1])});
            case 18:
                return String.format("%d", new Object[]{((C5801r0) this.f16215a).mo17148l(i)});
            case 22:
                String r = ((C5801r0) this.f16215a).mo17153r(i);
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
                    return simpleDateFormat.format(simpleDateFormat.parse(r));
                } catch (ParseException unused) {
                    return null;
                }
            case C9024k.f24704g4 /*36*/:
                return mo17194m(i, "New", "Waxing Crescent", "First Quarter", "Waxing Gibbous", "Full", "Waning Gibbous", "Last Quarter", "Waning Crescent");
            case 38:
            case C9024k.f24728k4 /*40*/:
                return String.format("%d", new Object[]{((C5801r0) this.f16215a).mo17148l(i)});
            case C9024k.f24740m4 /*42*/:
                C5737g t = ((C5801r0) this.f16215a).mo17155t(i);
                if (t == null) {
                    return null;
                }
                return t.toString();
            case 72:
            case 74:
            case 76:
            case ModuleDescriptor.MODULE_VERSION:
                return String.format("%d", new Object[]{((C5801r0) this.f16215a).mo17148l(i)});
            case 80:
                return mo17194m(i, "Off", "On");
            case 82:
                return String.format("%d", new Object[]{((C5801r0) this.f16215a).mo17148l(i)});
            case C1444j.f4211C0:
                Double h = ((C5801r0) this.f16215a).mo17144h(i);
                DecimalFormat decimalFormat = new DecimalFormat("0.000");
                if (h == null) {
                    return null;
                }
                return decimalFormat.format(h);
            case 86:
                return ((C5801r0) this.f16215a).mo17153r(i);
            default:
                return super.mo17110f(i);
        }
    }
}
