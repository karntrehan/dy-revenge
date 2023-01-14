package p174e.p175a.p176a.p177i.p178q;

import java.util.ArrayList;
import java.util.List;

/* renamed from: e.a.a.i.q.b */
public class C5406b {

    /* renamed from: a */
    private List f15106a = new ArrayList(5);

    /* renamed from: a */
    public void mo16299a(C5408d dVar) {
        this.f15106a.add(dVar);
    }

    /* renamed from: b */
    public C5408d mo16300b(int i) {
        return (C5408d) this.f15106a.get(i);
    }

    /* renamed from: c */
    public int mo16301c() {
        return this.f15106a.size();
    }

    public String toString() {
        int b;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 1; i < mo16301c(); i++) {
            stringBuffer.append(mo16300b(i));
            if (i < mo16301c() - 1 && ((b = mo16300b(i + 1).mo16304b()) == 1 || b == 2)) {
                stringBuffer.append('/');
            }
        }
        return stringBuffer.toString();
    }
}
