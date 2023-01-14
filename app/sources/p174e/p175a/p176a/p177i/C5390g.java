package p174e.p175a.p176a.p177i;

import p174e.p175a.p176a.C5377b;

/* renamed from: e.a.a.i.g */
class C5390g {

    /* renamed from: a */
    private String f15038a;

    /* renamed from: b */
    private int f15039b = 0;

    public C5390g(String str) {
        this.f15038a = str;
    }

    /* renamed from: a */
    public char mo16222a() {
        if (this.f15039b < this.f15038a.length()) {
            return this.f15038a.charAt(this.f15039b);
        }
        return 0;
    }

    /* renamed from: b */
    public char mo16223b(int i) {
        if (i < this.f15038a.length()) {
            return this.f15038a.charAt(i);
        }
        return 0;
    }

    /* renamed from: c */
    public int mo16224c(String str, int i) {
        char b = mo16223b(this.f15039b);
        int i2 = 0;
        boolean z = false;
        while ('0' <= b && b <= '9') {
            i2 = (i2 * 10) + (b - '0');
            int i3 = this.f15039b + 1;
            this.f15039b = i3;
            b = mo16223b(i3);
            z = true;
        }
        if (!z) {
            throw new C5377b(str, 5);
        } else if (i2 > i) {
            return i;
        } else {
            if (i2 < 0) {
                return 0;
            }
            return i2;
        }
    }

    /* renamed from: d */
    public boolean mo16225d() {
        return this.f15039b < this.f15038a.length();
    }

    /* renamed from: e */
    public int mo16226e() {
        return this.f15039b;
    }

    /* renamed from: f */
    public void mo16227f() {
        this.f15039b++;
    }
}
