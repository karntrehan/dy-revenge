package p174e.p319f.p416e;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p174e.p319f.p416e.p417r.C9673b;
import p174e.p319f.p416e.p423t.C9697a;
import p174e.p319f.p416e.p426u.C9712a;
import p174e.p319f.p416e.p428v.C9724i;
import p174e.p319f.p416e.p432w.C9764b;
import p174e.p319f.p416e.p436x.C9783a;

/* renamed from: e.f.e.i */
public final class C9663i implements C9666l {

    /* renamed from: a */
    private Map<C9659e, ?> f25835a;

    /* renamed from: b */
    private C9666l[] f25836b;

    /* renamed from: c */
    private C9668n m32849c(C9657c cVar) {
        C9666l[] lVarArr = this.f25836b;
        if (lVarArr != null) {
            int length = lVarArr.length;
            int i = 0;
            while (i < length) {
                try {
                    return lVarArr[i].mo24217b(cVar, this.f25835a);
                } catch (C9667m unused) {
                    i++;
                }
            }
        }
        throw C9664j.m32854a();
    }

    /* renamed from: a */
    public void mo24216a() {
        C9666l[] lVarArr = this.f25836b;
        if (lVarArr != null) {
            for (C9666l a : lVarArr) {
                a.mo24216a();
            }
        }
    }

    /* renamed from: b */
    public C9668n mo24217b(C9657c cVar, Map<C9659e, ?> map) {
        mo24219e(map);
        return m32849c(cVar);
    }

    /* renamed from: d */
    public C9668n mo24218d(C9657c cVar) {
        if (this.f25836b == null) {
            mo24219e((Map<C9659e, ?>) null);
        }
        return m32849c(cVar);
    }

    /* renamed from: e */
    public void mo24219e(Map<C9659e, ?> map) {
        this.f25835a = map;
        boolean z = true;
        boolean z2 = map != null && map.containsKey(C9659e.TRY_HARDER);
        Collection collection = map == null ? null : (Collection) map.get(C9659e.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (!collection.contains(C9655a.UPC_A) && !collection.contains(C9655a.UPC_E) && !collection.contains(C9655a.EAN_13) && !collection.contains(C9655a.EAN_8) && !collection.contains(C9655a.CODABAR) && !collection.contains(C9655a.CODE_39) && !collection.contains(C9655a.CODE_93) && !collection.contains(C9655a.CODE_128) && !collection.contains(C9655a.ITF) && !collection.contains(C9655a.RSS_14) && !collection.contains(C9655a.RSS_EXPANDED)) {
                z = false;
            }
            if (z && !z2) {
                arrayList.add(new C9724i(map));
            }
            if (collection.contains(C9655a.QR_CODE)) {
                arrayList.add(new C9783a());
            }
            if (collection.contains(C9655a.DATA_MATRIX)) {
                arrayList.add(new C9697a());
            }
            if (collection.contains(C9655a.AZTEC)) {
                arrayList.add(new C9673b());
            }
            if (collection.contains(C9655a.PDF_417)) {
                arrayList.add(new C9764b());
            }
            if (collection.contains(C9655a.MAXICODE)) {
                arrayList.add(new C9712a());
            }
            if (z && z2) {
                arrayList.add(new C9724i(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z2) {
                arrayList.add(new C9724i(map));
            }
            arrayList.add(new C9783a());
            arrayList.add(new C9697a());
            arrayList.add(new C9673b());
            arrayList.add(new C9764b());
            arrayList.add(new C9712a());
            if (z2) {
                arrayList.add(new C9724i(map));
            }
        }
        this.f25836b = (C9666l[]) arrayList.toArray(new C9666l[arrayList.size()]);
    }
}
