package p027c.p100v;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: c.v.d0 */
public class C2144d0 {

    /* renamed from: a */
    public final Map<String, Object> f6290a = new HashMap();

    /* renamed from: b */
    public View f6291b;

    /* renamed from: c */
    final ArrayList<C2214x> f6292c = new ArrayList<>();

    @Deprecated
    public C2144d0() {
    }

    public C2144d0(View view) {
        this.f6291b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2144d0)) {
            return false;
        }
        C2144d0 d0Var = (C2144d0) obj;
        return this.f6291b == d0Var.f6291b && this.f6290a.equals(d0Var.f6290a);
    }

    public int hashCode() {
        return (this.f6291b.hashCode() * 31) + this.f6290a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f6291b + "\n") + "    values:";
        for (String next : this.f6290a.keySet()) {
            str = str + "    " + next + ": " + this.f6290a.get(next) + "\n";
        }
        return str;
    }
}
