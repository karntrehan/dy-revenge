package p455g.p470y.p472d;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: g.y.d.y */
public class C10470y {

    /* renamed from: a */
    private final ArrayList<Object> f27628a;

    public C10470y(int i) {
        this.f27628a = new ArrayList<>(i);
    }

    /* renamed from: a */
    public void mo25843a(Object obj) {
        this.f27628a.add(obj);
    }

    /* renamed from: b */
    public void mo25844b(Object obj) {
        if (obj != null) {
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    ArrayList<Object> arrayList = this.f27628a;
                    arrayList.ensureCapacity(arrayList.size() + objArr.length);
                    Collections.addAll(this.f27628a, objArr);
                }
            } else if (obj instanceof Collection) {
                this.f27628a.addAll((Collection) obj);
            } else if (obj instanceof Iterable) {
                for (Object add : (Iterable) obj) {
                    this.f27628a.add(add);
                }
            } else if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                while (it.hasNext()) {
                    this.f27628a.add(it.next());
                }
            } else {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
        }
    }

    /* renamed from: c */
    public int mo25845c() {
        return this.f27628a.size();
    }

    /* renamed from: d */
    public Object[] mo25846d(Object[] objArr) {
        return this.f27628a.toArray(objArr);
    }
}
