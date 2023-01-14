package p174e.p319f.p416e.p432w.p433d.p434k;

import p174e.p319f.p416e.C9658d;

/* renamed from: e.f.e.w.d.k.a */
public final class C9778a {

    /* renamed from: a */
    private final C9779b f26200a = C9779b.f26201a;

    /* renamed from: b */
    private int[] m33396b(C9780c cVar) {
        int d = cVar.mo24498d();
        int[] iArr = new int[d];
        int i = 0;
        for (int i2 = 1; i2 < this.f26200a.mo24489e() && i < d; i2++) {
            if (cVar.mo24496b(i2) == 0) {
                iArr[i] = this.f26200a.mo24491g(i2);
                i++;
            }
        }
        if (i == d) {
            return iArr;
        }
        throw C9658d.m32835a();
    }

    /* renamed from: c */
    private int[] m33397c(C9780c cVar, C9780c cVar2, int[] iArr) {
        int d = cVar2.mo24498d();
        int[] iArr2 = new int[d];
        for (int i = 1; i <= d; i++) {
            iArr2[d - i] = this.f26200a.mo24493i(i, cVar2.mo24497c(i));
        }
        C9780c cVar3 = new C9780c(this.f26200a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int g = this.f26200a.mo24491g(iArr[i2]);
            iArr3[i2] = this.f26200a.mo24493i(this.f26200a.mo24494j(0, cVar.mo24496b(g)), this.f26200a.mo24491g(cVar3.mo24496b(g)));
        }
        return iArr3;
    }

    /* renamed from: d */
    private C9780c[] m33398d(C9780c cVar, C9780c cVar2, int i) {
        if (cVar.mo24498d() < cVar2.mo24498d()) {
            C9780c cVar3 = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        C9780c f = this.f26200a.mo24490f();
        C9780c d = this.f26200a.mo24488d();
        while (true) {
            C9780c cVar4 = r11;
            r11 = cVar;
            cVar = cVar4;
            C9780c cVar5 = d;
            C9780c cVar6 = f;
            f = cVar5;
            if (cVar.mo24498d() < i / 2) {
                int c = f.mo24497c(0);
                if (c != 0) {
                    int g = this.f26200a.mo24491g(c);
                    return new C9780c[]{f.mo24500f(g), cVar.mo24500f(g)};
                }
                throw C9658d.m32835a();
            } else if (!cVar.mo24499e()) {
                C9780c f2 = this.f26200a.mo24490f();
                int g2 = this.f26200a.mo24491g(cVar.mo24497c(cVar.mo24498d()));
                while (r11.mo24498d() >= cVar.mo24498d() && !r11.mo24499e()) {
                    int d2 = r11.mo24498d() - cVar.mo24498d();
                    int i2 = this.f26200a.mo24493i(r11.mo24497c(r11.mo24498d()), g2);
                    f2 = f2.mo24495a(this.f26200a.mo24486b(d2, i2));
                    r11 = r11.mo24504j(cVar.mo24502h(d2, i2));
                }
                d = f2.mo24501g(f).mo24504j(cVar6).mo24503i();
            } else {
                throw C9658d.m32835a();
            }
        }
    }

    /* renamed from: a */
    public int mo24484a(int[] iArr, int i, int[] iArr2) {
        C9780c cVar = new C9780c(this.f26200a, iArr);
        int[] iArr3 = new int[i];
        int i2 = 0;
        boolean z = false;
        for (int i3 = i; i3 > 0; i3--) {
            int b = cVar.mo24496b(this.f26200a.mo24487c(i3));
            iArr3[i - i3] = b;
            if (b != 0) {
                z = true;
            }
        }
        if (!z) {
            return 0;
        }
        C9780c d = this.f26200a.mo24488d();
        if (iArr2 != null) {
            for (int length : iArr2) {
                int c = this.f26200a.mo24487c((iArr.length - 1) - length);
                C9779b bVar = this.f26200a;
                d = d.mo24501g(new C9780c(bVar, new int[]{bVar.mo24494j(0, c), 1}));
            }
        }
        C9780c[] d2 = m33398d(this.f26200a.mo24486b(i, 1), new C9780c(this.f26200a, iArr3), i);
        C9780c cVar2 = d2[0];
        C9780c cVar3 = d2[1];
        int[] b2 = m33396b(cVar2);
        int[] c2 = m33397c(cVar3, cVar2, b2);
        while (i2 < b2.length) {
            int length2 = (iArr.length - 1) - this.f26200a.mo24492h(b2[i2]);
            if (length2 >= 0) {
                iArr[length2] = this.f26200a.mo24494j(iArr[length2], c2[i2]);
                i2++;
            } else {
                throw C9658d.m32835a();
            }
        }
        return b2.length;
    }
}
