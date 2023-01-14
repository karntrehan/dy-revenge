package p174e.p181b.p182a.p188w;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: e.b.a.w.e */
public class C5528e {

    /* renamed from: a */
    public static final C5528e f15616a = new C5528e("COMPOSITION");

    /* renamed from: b */
    private final List<String> f15617b;

    /* renamed from: c */
    private C5529f f15618c;

    private C5528e(C5528e eVar) {
        this.f15617b = new ArrayList(eVar.f15617b);
        this.f15618c = eVar.f15618c;
    }

    public C5528e(String... strArr) {
        this.f15617b = Arrays.asList(strArr);
    }

    /* renamed from: b */
    private boolean m20590b() {
        List<String> list = this.f15617b;
        return list.get(list.size() - 1).equals("**");
    }

    /* renamed from: f */
    private boolean m20591f(String str) {
        return "__container".equals(str);
    }

    /* renamed from: a */
    public C5528e mo16678a(String str) {
        C5528e eVar = new C5528e(this);
        eVar.f15617b.add(str);
        return eVar;
    }

    /* renamed from: c */
    public boolean mo16679c(String str, int i) {
        if (i >= this.f15617b.size()) {
            return false;
        }
        boolean z = i == this.f15617b.size() - 1;
        String str2 = this.f15617b.get(i);
        if (!str2.equals("**")) {
            return (z || (i == this.f15617b.size() + -2 && m20590b())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z && this.f15617b.get(i + 1).equals(str)) {
            return i == this.f15617b.size() + -2 || (i == this.f15617b.size() + -3 && m20590b());
        }
        if (z) {
            return true;
        }
        int i2 = i + 1;
        if (i2 < this.f15617b.size() - 1) {
            return false;
        }
        return this.f15617b.get(i2).equals(str);
    }

    /* renamed from: d */
    public C5529f mo16680d() {
        return this.f15618c;
    }

    /* renamed from: e */
    public int mo16681e(String str, int i) {
        if (m20591f(str)) {
            return 0;
        }
        if (!this.f15617b.get(i).equals("**")) {
            return 1;
        }
        return (i != this.f15617b.size() - 1 && this.f15617b.get(i + 1).equals(str)) ? 2 : 0;
    }

    /* renamed from: g */
    public boolean mo16682g(String str, int i) {
        if (m20591f(str)) {
            return true;
        }
        if (i >= this.f15617b.size()) {
            return false;
        }
        return this.f15617b.get(i).equals(str) || this.f15617b.get(i).equals("**") || this.f15617b.get(i).equals("*");
    }

    /* renamed from: h */
    public boolean mo16683h(String str, int i) {
        return "__container".equals(str) || i < this.f15617b.size() - 1 || this.f15617b.get(i).equals("**");
    }

    /* renamed from: i */
    public C5528e mo16684i(C5529f fVar) {
        C5528e eVar = new C5528e(this);
        eVar.f15618c = fVar;
        return eVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.f15617b);
        sb.append(",resolved=");
        sb.append(this.f15618c != null);
        sb.append('}');
        return sb.toString();
    }
}
