package p174e.p175a.p176a.p179j;

import java.util.Map;
import p174e.p175a.p176a.C5377b;

/* renamed from: e.a.a.j.c */
public abstract class C5411c {

    /* renamed from: a */
    private int f15111a = 0;

    /* renamed from: b */
    private Map f15112b = null;

    public C5411c() {
    }

    public C5411c(int i) {
        m20119b(i);
        mo16328g(i);
    }

    /* renamed from: b */
    private void m20119b(int i) {
        int i2 = (~mo16312e()) & i;
        if (i2 == 0) {
            mo16323a(i);
            return;
        }
        throw new C5377b("The option bit(s) 0x" + Integer.toHexString(i2) + " are invalid!", 103);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16323a(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo16324c(int i) {
        return (i & this.f15111a) != 0;
    }

    /* renamed from: d */
    public int mo16325d() {
        return this.f15111a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo16312e();

    public boolean equals(Object obj) {
        return mo16325d() == ((C5411c) obj).mo16325d();
    }

    /* renamed from: f */
    public void mo16327f(int i, boolean z) {
        int i2;
        if (z) {
            i2 = i | this.f15111a;
        } else {
            i2 = (~i) & this.f15111a;
        }
        this.f15111a = i2;
    }

    /* renamed from: g */
    public void mo16328g(int i) {
        m20119b(i);
        this.f15111a = i;
    }

    public int hashCode() {
        return mo16325d();
    }

    public String toString() {
        return "0x" + Integer.toHexString(this.f15111a);
    }
}
