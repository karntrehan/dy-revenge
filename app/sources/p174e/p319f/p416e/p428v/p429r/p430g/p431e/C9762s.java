package p174e.p319f.p416e.p428v.p429r.p430g.p431e;

import p174e.p319f.p416e.C9660f;
import p174e.p319f.p416e.p420s.C9679a;

/* renamed from: e.f.e.v.r.g.e.s */
final class C9762s {

    /* renamed from: a */
    private final C9679a f26143a;

    /* renamed from: b */
    private final C9755m f26144b = new C9755m();

    /* renamed from: c */
    private final StringBuilder f26145c = new StringBuilder();

    C9762s(C9679a aVar) {
        this.f26143a = aVar;
    }

    /* renamed from: b */
    private C9757n m33266b(int i) {
        char c;
        int f = mo24424f(i, 5);
        if (f == 15) {
            return new C9757n(i + 5, '$');
        }
        if (f >= 5 && f < 15) {
            return new C9757n(i + 5, (char) ((f + 48) - 5));
        }
        int f2 = mo24424f(i, 6);
        if (f2 >= 32 && f2 < 58) {
            return new C9757n(i + 6, (char) (f2 + 33));
        }
        switch (f2) {
            case 58:
                c = '*';
                break;
            case 59:
                c = ',';
                break;
            case 60:
                c = '-';
                break;
            case 61:
                c = '.';
                break;
            case 62:
                c = '/';
                break;
            default:
                throw new IllegalStateException("Decoding invalid alphanumeric value: ".concat(String.valueOf(f2)));
        }
        return new C9757n(i + 6, c);
    }

    /* renamed from: d */
    private C9757n m33267d(int i) {
        char c;
        int f = mo24424f(i, 5);
        if (f == 15) {
            return new C9757n(i + 5, '$');
        }
        if (f >= 5 && f < 15) {
            return new C9757n(i + 5, (char) ((f + 48) - 5));
        }
        int f2 = mo24424f(i, 7);
        if (f2 >= 64 && f2 < 90) {
            return new C9757n(i + 7, (char) (f2 + 1));
        }
        if (f2 >= 90 && f2 < 116) {
            return new C9757n(i + 7, (char) (f2 + 7));
        }
        switch (mo24424f(i, 8)) {
            case 232:
                c = '!';
                break;
            case 233:
                c = '\"';
                break;
            case 234:
                c = '%';
                break;
            case 235:
                c = '&';
                break;
            case 236:
                c = '\'';
                break;
            case 237:
                c = '(';
                break;
            case 238:
                c = ')';
                break;
            case 239:
                c = '*';
                break;
            case 240:
                c = '+';
                break;
            case 241:
                c = ',';
                break;
            case 242:
                c = '-';
                break;
            case 243:
                c = '.';
                break;
            case 244:
                c = '/';
                break;
            case 245:
                c = ':';
                break;
            case 246:
                c = ';';
                break;
            case 247:
                c = '<';
                break;
            case 248:
                c = '=';
                break;
            case 249:
                c = '>';
                break;
            case 250:
                c = '?';
                break;
            case 251:
                c = '_';
                break;
            case 252:
                c = ' ';
                break;
            default:
                throw C9660f.m32836a();
        }
        return new C9757n(i + 8, c);
    }

    /* renamed from: e */
    private C9759p m33268e(int i) {
        int i2 = i + 7;
        if (i2 > this.f26143a.mo24254j()) {
            int f = mo24424f(i, 4);
            return f == 0 ? new C9759p(this.f26143a.mo24254j(), 10, 10) : new C9759p(this.f26143a.mo24254j(), f - 1, 10);
        }
        int f2 = mo24424f(i, 7) - 8;
        return new C9759p(i2, f2 / 11, f2 % 11);
    }

    /* renamed from: g */
    static int m33269g(C9679a aVar, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (aVar.mo24248e(i + i4)) {
                i3 |= 1 << ((i2 - i4) - 1);
            }
        }
        return i3;
    }

    /* renamed from: h */
    private boolean m33270h(int i) {
        int i2 = i + 3;
        if (i2 > this.f26143a.mo24254j()) {
            return false;
        }
        while (i < i2) {
            if (this.f26143a.mo24248e(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: i */
    private boolean m33271i(int i) {
        int i2;
        if (i + 1 > this.f26143a.mo24254j()) {
            return false;
        }
        int i3 = 0;
        while (i3 < 5 && (i2 = i3 + i) < this.f26143a.mo24254j()) {
            if (i3 == 2) {
                if (!this.f26143a.mo24248e(i + 2)) {
                    return false;
                }
            } else if (this.f26143a.mo24248e(i2)) {
                return false;
            }
            i3++;
        }
        return true;
    }

    /* renamed from: j */
    private boolean m33272j(int i) {
        int i2;
        if (i + 1 > this.f26143a.mo24254j()) {
            return false;
        }
        int i3 = 0;
        while (i3 < 4 && (i2 = i3 + i) < this.f26143a.mo24254j()) {
            if (this.f26143a.mo24248e(i2)) {
                return false;
            }
            i3++;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        r6 = mo24424f(r6, 6);
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m33273k(int r6) {
        /*
            r5 = this;
            int r0 = r6 + 5
            e.f.e.s.a r1 = r5.f26143a
            int r1 = r1.mo24254j()
            r2 = 0
            if (r0 <= r1) goto L_0x000c
            return r2
        L_0x000c:
            r0 = 5
            int r1 = r5.mo24424f(r6, r0)
            r3 = 1
            r4 = 16
            if (r1 < r0) goto L_0x0019
            if (r1 >= r4) goto L_0x0019
            return r3
        L_0x0019:
            int r0 = r6 + 6
            e.f.e.s.a r1 = r5.f26143a
            int r1 = r1.mo24254j()
            if (r0 <= r1) goto L_0x0024
            return r2
        L_0x0024:
            r0 = 6
            int r6 = r5.mo24424f(r6, r0)
            if (r6 < r4) goto L_0x0030
            r0 = 63
            if (r6 >= r0) goto L_0x0030
            return r3
        L_0x0030:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p416e.p428v.p429r.p430g.p431e.C9762s.m33273k(int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        r5 = mo24424f(r5, 8);
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m33274l(int r5) {
        /*
            r4 = this;
            int r0 = r5 + 5
            e.f.e.s.a r1 = r4.f26143a
            int r1 = r1.mo24254j()
            r2 = 0
            if (r0 <= r1) goto L_0x000c
            return r2
        L_0x000c:
            r0 = 5
            int r1 = r4.mo24424f(r5, r0)
            r3 = 1
            if (r1 < r0) goto L_0x0019
            r0 = 16
            if (r1 >= r0) goto L_0x0019
            return r3
        L_0x0019:
            int r0 = r5 + 7
            e.f.e.s.a r1 = r4.f26143a
            int r1 = r1.mo24254j()
            if (r0 <= r1) goto L_0x0024
            return r2
        L_0x0024:
            r0 = 7
            int r0 = r4.mo24424f(r5, r0)
            r1 = 64
            if (r0 < r1) goto L_0x0032
            r1 = 116(0x74, float:1.63E-43)
            if (r0 >= r1) goto L_0x0032
            return r3
        L_0x0032:
            int r0 = r5 + 8
            e.f.e.s.a r1 = r4.f26143a
            int r1 = r1.mo24254j()
            if (r0 <= r1) goto L_0x003d
            return r2
        L_0x003d:
            r0 = 8
            int r5 = r4.mo24424f(r5, r0)
            r0 = 232(0xe8, float:3.25E-43)
            if (r5 < r0) goto L_0x004c
            r0 = 253(0xfd, float:3.55E-43)
            if (r5 >= r0) goto L_0x004c
            return r3
        L_0x004c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p416e.p428v.p429r.p430g.p431e.C9762s.m33274l(int):boolean");
    }

    /* renamed from: m */
    private boolean m33275m(int i) {
        if (i + 7 > this.f26143a.mo24254j()) {
            return i + 4 <= this.f26143a.mo24254j();
        }
        int i2 = i;
        while (true) {
            int i3 = i + 3;
            if (i2 >= i3) {
                return this.f26143a.mo24248e(i3);
            }
            if (this.f26143a.mo24248e(i2)) {
                return true;
            }
            i2++;
        }
    }

    /* renamed from: n */
    private C9754l m33276n() {
        while (m33273k(this.f26144b.mo24404a())) {
            C9757n b = m33266b(this.f26144b.mo24404a());
            this.f26144b.mo24411h(b.mo24421a());
            if (b.mo24413c()) {
                return new C9754l(new C9758o(this.f26144b.mo24404a(), this.f26145c.toString()), true);
            }
            this.f26145c.append(b.mo24412b());
        }
        if (m33270h(this.f26144b.mo24404a())) {
            this.f26144b.mo24405b(3);
            this.f26144b.mo24410g();
        } else if (m33271i(this.f26144b.mo24404a())) {
            if (this.f26144b.mo24404a() + 5 < this.f26143a.mo24254j()) {
                this.f26144b.mo24405b(5);
            } else {
                this.f26144b.mo24411h(this.f26143a.mo24254j());
            }
            this.f26144b.mo24409f();
        }
        return new C9754l(false);
    }

    /* renamed from: o */
    private C9758o m33277o() {
        C9754l n;
        boolean b;
        do {
            int a = this.f26144b.mo24404a();
            n = this.f26144b.mo24406c() ? m33276n() : this.f26144b.mo24407d() ? m33278p() : m33279q();
            b = n.mo24403b();
            if (!(a != this.f26144b.mo24404a()) && !b) {
                break;
            }
        } while (!b);
        return n.mo24402a();
    }

    /* renamed from: p */
    private C9754l m33278p() {
        while (m33274l(this.f26144b.mo24404a())) {
            C9757n d = m33267d(this.f26144b.mo24404a());
            this.f26144b.mo24411h(d.mo24421a());
            if (d.mo24413c()) {
                return new C9754l(new C9758o(this.f26144b.mo24404a(), this.f26145c.toString()), true);
            }
            this.f26145c.append(d.mo24412b());
        }
        if (m33270h(this.f26144b.mo24404a())) {
            this.f26144b.mo24405b(3);
            this.f26144b.mo24410g();
        } else if (m33271i(this.f26144b.mo24404a())) {
            if (this.f26144b.mo24404a() + 5 < this.f26143a.mo24254j()) {
                this.f26144b.mo24405b(5);
            } else {
                this.f26144b.mo24411h(this.f26143a.mo24254j());
            }
            this.f26144b.mo24408e();
        }
        return new C9754l(false);
    }

    /* renamed from: q */
    private C9754l m33279q() {
        while (m33275m(this.f26144b.mo24404a())) {
            C9759p e = m33268e(this.f26144b.mo24404a());
            this.f26144b.mo24411h(e.mo24421a());
            if (e.mo24419d()) {
                return new C9754l(e.mo24420e() ? new C9758o(this.f26144b.mo24404a(), this.f26145c.toString()) : new C9758o(this.f26144b.mo24404a(), this.f26145c.toString(), e.mo24418c()), true);
            }
            this.f26145c.append(e.mo24417b());
            if (e.mo24420e()) {
                return new C9754l(new C9758o(this.f26144b.mo24404a(), this.f26145c.toString()), true);
            }
            this.f26145c.append(e.mo24418c());
        }
        if (m33272j(this.f26144b.mo24404a())) {
            this.f26144b.mo24408e();
            this.f26144b.mo24405b(4);
        }
        return new C9754l(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo24422a(StringBuilder sb, int i) {
        String str = null;
        while (true) {
            C9758o c = mo24423c(i, str);
            String a = C9761r.m33263a(c.mo24414b());
            if (a != null) {
                sb.append(a);
            }
            String valueOf = c.mo24416d() ? String.valueOf(c.mo24415c()) : null;
            if (i == c.mo24421a()) {
                return sb.toString();
            }
            i = c.mo24421a();
            str = valueOf;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C9758o mo24423c(int i, String str) {
        this.f26145c.setLength(0);
        if (str != null) {
            this.f26145c.append(str);
        }
        this.f26144b.mo24411h(i);
        C9758o o = m33277o();
        return (o == null || !o.mo24416d()) ? new C9758o(this.f26144b.mo24404a(), this.f26145c.toString()) : new C9758o(this.f26144b.mo24404a(), this.f26145c.toString(), o.mo24415c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo24424f(int i, int i2) {
        return m33269g(this.f26143a, i, i2);
    }
}
