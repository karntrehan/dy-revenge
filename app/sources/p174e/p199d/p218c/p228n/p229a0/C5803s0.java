package p174e.p199d.p218c.p228n.p229a0;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import p174e.p199d.p218c.C5737g;
import p174e.p199d.p218c.C5739i;
import p174e.p319f.p320a.p363d.C9024k;

/* renamed from: e.d.c.n.a0.s0 */
public class C5803s0 extends C5739i<C5805t0> {
    public C5803s0(C5805t0 t0Var) {
        super(t0Var);
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        switch (i) {
            case 0:
                return ((C5805t0) this.f16215a).mo17153r(i);
            case 10:
                return String.format("0x%08X", new Object[]{((C5805t0) this.f16215a).mo17148l(i)});
            case 14:
                return String.format("%d", new Object[]{((C5805t0) this.f16215a).mo17148l(i)});
            case 18:
                return String.format("0x%08X", new Object[]{((C5805t0) this.f16215a).mo17148l(i)});
            case 22:
                return String.format("%d", new Object[]{((C5805t0) this.f16215a).mo17148l(i)});
            case 24:
            case 31:
            case 38:
            case C9024k.f24746n4 /*45*/:
            case 52:
                return ((C5805t0) this.f16215a).mo17153r(i);
            case 53:
                int[] k = ((C5805t0) this.f16215a).mo17147k(i);
                if (k == null) {
                    return null;
                }
                return String.format("%d/%d", new Object[]{Integer.valueOf(k[0]), Integer.valueOf(k[1])});
            case 55:
                return String.format("%d", new Object[]{((C5805t0) this.f16215a).mo17148l(i)});
            case 59:
                String r = ((C5805t0) this.f16215a).mo17153r(i);
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
                    return simpleDateFormat.format(simpleDateFormat.parse(r));
                } catch (ParseException unused) {
                    return null;
                }
            case 67:
                return mo17194m(i, "New", "Waxing Crescent", "First Quarter", "Waxing Gibbous", "Full", "Waning Gibbous", "Last Quarter", "Waning Crescent");
            case 68:
            case 70:
                return String.format("%d", new Object[]{((C5805t0) this.f16215a).mo17148l(i)});
            case 72:
                return mo17194m(i, "Off", "On");
            case 73:
                Double h = ((C5805t0) this.f16215a).mo17144h(i);
                DecimalFormat decimalFormat = new DecimalFormat("0.000");
                if (h == null) {
                    return null;
                }
                return decimalFormat.format(h);
            case 75:
                C5737g t = ((C5805t0) this.f16215a).mo17155t(i);
                if (t == null) {
                    return null;
                }
                return t.toString();
            case 80:
                return ((C5805t0) this.f16215a).mo17153r(i);
            default:
                return super.mo17110f(i);
        }
    }
}
