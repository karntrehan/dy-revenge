package p174e.p199d.p200a.p206k;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: e.d.a.k.c */
public class C5668c {

    /* renamed from: a */
    private final HashMap<Byte, List<byte[]>> f16032a = new HashMap<>(10);

    /* renamed from: b */
    private List<byte[]> m21101b(byte b) {
        if (this.f16032a.containsKey(Byte.valueOf(b))) {
            return this.f16032a.get(Byte.valueOf(b));
        }
        ArrayList arrayList = new ArrayList();
        this.f16032a.put(Byte.valueOf(b), arrayList);
        return arrayList;
    }

    /* renamed from: c */
    private List<byte[]> m21102c(byte b) {
        return this.f16032a.get(Byte.valueOf(b));
    }

    /* renamed from: a */
    public void mo16938a(byte b, byte[] bArr) {
        m21101b(b).add(bArr);
    }

    /* renamed from: d */
    public Iterable<byte[]> mo16939d(byte b) {
        List<byte[]> c = m21102c(b);
        return c == null ? new ArrayList() : c;
    }

    /* renamed from: e */
    public Iterable<byte[]> mo16940e(C5671f fVar) {
        return mo16939d(fVar.f16074c0);
    }
}
