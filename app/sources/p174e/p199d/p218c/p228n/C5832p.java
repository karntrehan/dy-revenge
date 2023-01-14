package p174e.p199d.p218c.p228n;

import java.util.HashMap;
import p174e.p199d.p217b.C5708i;
import p174e.p199d.p217b.C5712m;

/* renamed from: e.d.c.n.p */
public class C5832p extends C5818b {

    /* renamed from: f */
    protected static final HashMap<Integer, String> f16317f;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f16317f = hashMap;
        C5818b.m22159V(hashMap);
        hashMap.put(0, "GPS Version ID");
        hashMap.put(1, "GPS Latitude Ref");
        hashMap.put(2, "GPS Latitude");
        hashMap.put(3, "GPS Longitude Ref");
        hashMap.put(4, "GPS Longitude");
        hashMap.put(5, "GPS Altitude Ref");
        hashMap.put(6, "GPS Altitude");
        hashMap.put(7, "GPS Time-Stamp");
        hashMap.put(8, "GPS Satellites");
        hashMap.put(9, "GPS Status");
        hashMap.put(10, "GPS Measure Mode");
        hashMap.put(11, "GPS DOP");
        hashMap.put(12, "GPS Speed Ref");
        hashMap.put(13, "GPS Speed");
        hashMap.put(14, "GPS Track Ref");
        hashMap.put(15, "GPS Track");
        hashMap.put(16, "GPS Img Direction Ref");
        hashMap.put(17, "GPS Img Direction");
        hashMap.put(18, "GPS Map Datum");
        hashMap.put(19, "GPS Dest Latitude Ref");
        hashMap.put(20, "GPS Dest Latitude");
        hashMap.put(21, "GPS Dest Longitude Ref");
        hashMap.put(22, "GPS Dest Longitude");
        hashMap.put(23, "GPS Dest Bearing Ref");
        hashMap.put(24, "GPS Dest Bearing");
        hashMap.put(25, "GPS Dest Distance Ref");
        hashMap.put(26, "GPS Dest Distance");
        hashMap.put(27, "GPS Processing Method");
        hashMap.put(28, "GPS Area Information");
        hashMap.put(29, "GPS Date Stamp");
        hashMap.put(30, "GPS Differential");
    }

    public C5832p() {
        mo17120E(new C5831o(this));
    }

    /* renamed from: W */
    public C5708i mo17762W() {
        C5712m[] q = mo17152q(2);
        C5712m[] q2 = mo17152q(4);
        String r = mo17153r(1);
        String r2 = mo17153r(3);
        if (!(q == null || q.length != 3 || q2 == null || q2.length != 3 || r == null || r2 == null)) {
            Double c = C5708i.m21219c(q[0], q[1], q[2], r.equalsIgnoreCase("S"));
            Double c2 = C5708i.m21219c(q2[0], q2[1], q2[2], r2.equalsIgnoreCase("W"));
            if (!(c == null || c2 == null)) {
                return new C5708i(c.doubleValue(), c2.doubleValue());
            }
        }
        return null;
    }

    /* renamed from: n */
    public String mo17104n() {
        return "GPS";
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public HashMap<Integer, String> mo17105w() {
        return f16317f;
    }
}
