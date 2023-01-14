package p174e.p319f.p416e.p428v;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p174e.p319f.p416e.C9655a;
import p174e.p319f.p416e.C9659e;
import p174e.p319f.p416e.C9664j;
import p174e.p319f.p416e.C9667m;
import p174e.p319f.p416e.C9668n;
import p174e.p319f.p416e.p420s.C9679a;
import p174e.p319f.p416e.p428v.p429r.C9737e;
import p174e.p319f.p416e.p428v.p429r.p430g.C9742d;

/* renamed from: e.f.e.v.i */
public final class C9724i extends C9726k {

    /* renamed from: a */
    private final C9726k[] f26058a;

    public C9724i(Map<C9659e, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(C9659e.POSSIBLE_FORMATS);
        boolean z = (map == null || map.get(C9659e.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(C9655a.EAN_13) || collection.contains(C9655a.UPC_A) || collection.contains(C9655a.EAN_8) || collection.contains(C9655a.UPC_E)) {
                arrayList.add(new C9725j(map));
            }
            if (collection.contains(C9655a.CODE_39)) {
                arrayList.add(new C9718c(z));
            }
            if (collection.contains(C9655a.CODE_93)) {
                arrayList.add(new C9719d());
            }
            if (collection.contains(C9655a.CODE_128)) {
                arrayList.add(new C9717b());
            }
            if (collection.contains(C9655a.ITF)) {
                arrayList.add(new C9723h());
            }
            if (collection.contains(C9655a.CODABAR)) {
                arrayList.add(new C9716a());
            }
            if (collection.contains(C9655a.RSS_14)) {
                arrayList.add(new C9737e());
            }
            if (collection.contains(C9655a.RSS_EXPANDED)) {
                arrayList.add(new C9742d());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C9725j(map));
            arrayList.add(new C9718c());
            arrayList.add(new C9716a());
            arrayList.add(new C9719d());
            arrayList.add(new C9717b());
            arrayList.add(new C9723h());
            arrayList.add(new C9737e());
            arrayList.add(new C9742d());
        }
        this.f26058a = (C9726k[]) arrayList.toArray(new C9726k[arrayList.size()]);
    }

    /* renamed from: a */
    public void mo24216a() {
        for (C9726k a : this.f26058a) {
            a.mo24216a();
        }
    }

    /* renamed from: c */
    public C9668n mo24349c(int i, C9679a aVar, Map<C9659e, ?> map) {
        C9726k[] kVarArr = this.f26058a;
        int i2 = 0;
        while (i2 < kVarArr.length) {
            try {
                return kVarArr[i2].mo24349c(i, aVar, map);
            } catch (C9667m unused) {
                i2++;
            }
        }
        throw C9664j.m32854a();
    }
}
