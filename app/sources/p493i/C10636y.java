package p493i;

import java.util.Arrays;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

/* renamed from: i.y */
public final class C10636y {

    /* renamed from: a */
    public static final C10637a f28089a = new C10637a((C10452g) null);

    /* renamed from: b */
    public final byte[] f28090b;

    /* renamed from: c */
    public int f28091c;

    /* renamed from: d */
    public int f28092d;

    /* renamed from: e */
    public boolean f28093e;

    /* renamed from: f */
    public boolean f28094f;

    /* renamed from: g */
    public C10636y f28095g;

    /* renamed from: h */
    public C10636y f28096h;

    /* renamed from: i.y$a */
    public static final class C10637a {
        private C10637a() {
        }

        public /* synthetic */ C10637a(C10452g gVar) {
            this();
        }
    }

    public C10636y() {
        this.f28090b = new byte[8192];
        this.f28094f = true;
        this.f28093e = false;
    }

    public C10636y(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        C10457l.m35320e(bArr, "data");
        this.f28090b = bArr;
        this.f28091c = i;
        this.f28092d = i2;
        this.f28093e = z;
        this.f28094f = z2;
    }

    /* renamed from: a */
    public final void mo26475a() {
        C10636y yVar = this.f28096h;
        int i = 0;
        if (yVar != this) {
            C10457l.m35317b(yVar);
            if (yVar.f28094f) {
                int i2 = this.f28092d - this.f28091c;
                C10636y yVar2 = this.f28096h;
                C10457l.m35317b(yVar2);
                int i3 = 8192 - yVar2.f28092d;
                C10636y yVar3 = this.f28096h;
                C10457l.m35317b(yVar3);
                if (!yVar3.f28093e) {
                    C10636y yVar4 = this.f28096h;
                    C10457l.m35317b(yVar4);
                    i = yVar4.f28091c;
                }
                if (i2 <= i3 + i) {
                    C10636y yVar5 = this.f28096h;
                    C10457l.m35317b(yVar5);
                    mo26481g(yVar5, i2);
                    mo26476b();
                    C10638z.m36238b(this);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("cannot compact".toString());
    }

    /* renamed from: b */
    public final C10636y mo26476b() {
        C10636y yVar = this.f28095g;
        if (yVar == this) {
            yVar = null;
        }
        C10636y yVar2 = this.f28096h;
        C10457l.m35317b(yVar2);
        yVar2.f28095g = this.f28095g;
        C10636y yVar3 = this.f28095g;
        C10457l.m35317b(yVar3);
        yVar3.f28096h = this.f28096h;
        this.f28095g = null;
        this.f28096h = null;
        return yVar;
    }

    /* renamed from: c */
    public final C10636y mo26477c(C10636y yVar) {
        C10457l.m35320e(yVar, "segment");
        yVar.f28096h = this;
        yVar.f28095g = this.f28095g;
        C10636y yVar2 = this.f28095g;
        C10457l.m35317b(yVar2);
        yVar2.f28096h = yVar;
        this.f28095g = yVar;
        return yVar;
    }

    /* renamed from: d */
    public final C10636y mo26478d() {
        this.f28093e = true;
        return new C10636y(this.f28090b, this.f28091c, this.f28092d, true, false);
    }

    /* renamed from: e */
    public final C10636y mo26479e(int i) {
        C10636y yVar;
        if (i > 0 && i <= this.f28092d - this.f28091c) {
            if (i >= 1024) {
                yVar = mo26478d();
            } else {
                yVar = C10638z.m36239c();
                byte[] bArr = this.f28090b;
                byte[] bArr2 = yVar.f28090b;
                int i2 = this.f28091c;
                byte[] unused = C10341g.m35069e(bArr, bArr2, 0, i2, i2 + i, 2, (Object) null);
            }
            yVar.f28092d = yVar.f28091c + i;
            this.f28091c += i;
            C10636y yVar2 = this.f28096h;
            C10457l.m35317b(yVar2);
            yVar2.mo26477c(yVar);
            return yVar;
        }
        throw new IllegalArgumentException("byteCount out of range".toString());
    }

    /* renamed from: f */
    public final C10636y mo26480f() {
        byte[] bArr = this.f28090b;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        C10457l.m35319d(copyOf, "java.util.Arrays.copyOf(this, size)");
        return new C10636y(copyOf, this.f28091c, this.f28092d, false, true);
    }

    /* renamed from: g */
    public final void mo26481g(C10636y yVar, int i) {
        C10457l.m35320e(yVar, "sink");
        if (yVar.f28094f) {
            int i2 = yVar.f28092d;
            if (i2 + i > 8192) {
                if (!yVar.f28093e) {
                    int i3 = yVar.f28091c;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = yVar.f28090b;
                        byte[] unused = C10341g.m35069e(bArr, bArr, 0, i3, i2, 2, (Object) null);
                        yVar.f28092d -= yVar.f28091c;
                        yVar.f28091c = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f28090b;
            byte[] bArr3 = yVar.f28090b;
            int i4 = yVar.f28092d;
            int i5 = this.f28091c;
            byte[] unused2 = C10341g.m35067c(bArr2, bArr3, i4, i5, i5 + i);
            yVar.f28092d += i;
            this.f28091c += i;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }
}
