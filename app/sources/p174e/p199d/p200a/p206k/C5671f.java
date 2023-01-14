package p174e.p199d.p200a.p206k;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: e.d.a.k.f */
public enum C5671f {
    APP0((byte) -32, true),
    APP1((byte) -31, true),
    APP2((byte) -30, true),
    APP3((byte) -29, true),
    APP4((byte) -28, true),
    APP5((byte) -27, true),
    APP6((byte) -26, true),
    APP7((byte) -25, true),
    APP8((byte) -24, true),
    APP9((byte) -23, true),
    APPA((byte) -22, true),
    APPB((byte) -21, true),
    APPC((byte) -20, true),
    APPD((byte) -19, true),
    APPE((byte) -18, true),
    APPF((byte) -17, true),
    SOI((byte) -40, false),
    DQT((byte) -37, false),
    DNL((byte) -36, false),
    DRI((byte) -35, false),
    DHP((byte) -34, false),
    EXP((byte) -33, false),
    DHT((byte) -60, false),
    DAC((byte) -52, false),
    SOF0((byte) -64, true),
    SOF1((byte) -63, true),
    SOF2((byte) -62, true),
    SOF3((byte) -61, true),
    SOF5((byte) -59, true),
    SOF6((byte) -58, true),
    SOF7((byte) -57, true),
    JPG((byte) -56, true),
    SOF9((byte) -55, true),
    SOF10((byte) -54, true),
    SOF11((byte) -53, true),
    SOF13((byte) -51, true),
    SOF14((byte) -50, true),
    SOF15((byte) -49, true),
    COM((byte) -2, true);
    

    /* renamed from: a0 */
    public static final Collection<C5671f> f16059a0 = null;

    /* renamed from: c0 */
    public final byte f16074c0;

    /* renamed from: d0 */
    public final boolean f16075d0;

    static {
        int i;
        ArrayList arrayList = new ArrayList();
        for (C5671f fVar : (C5671f[]) C5671f.class.getEnumConstants()) {
            if (fVar.f16075d0) {
                arrayList.add(fVar);
            }
        }
        f16059a0 = arrayList;
    }

    private C5671f(byte b, boolean z) {
        this.f16074c0 = b;
        this.f16075d0 = z;
    }

    /* renamed from: e */
    public static C5671f m21109e(byte b) {
        for (C5671f fVar : (C5671f[]) C5671f.class.getEnumConstants()) {
            if (fVar.f16074c0 == b) {
                return fVar;
            }
        }
        return null;
    }
}
