package p493i.p494g0;

import p455g.p470y.p472d.C10457l;
import p493i.C10589b;
import p493i.C10603f;
import p493i.C10628t;
import p493i.C10636y;

/* renamed from: i.g0.a */
public final class C10609a {

    /* renamed from: a */
    private static final byte[] f28045a = C10589b.m35963a("0123456789abcdef");

    /* renamed from: a */
    public static final byte[] m36065a() {
        return f28045a;
    }

    /* renamed from: b */
    public static final boolean m36066b(C10636y yVar, int i, byte[] bArr, int i2, int i3) {
        C10457l.m35320e(yVar, "segment");
        C10457l.m35320e(bArr, "bytes");
        int i4 = yVar.f28092d;
        byte[] bArr2 = yVar.f28090b;
        while (i2 < i3) {
            if (i == i4) {
                yVar = yVar.f28095g;
                C10457l.m35317b(yVar);
                byte[] bArr3 = yVar.f28090b;
                int i5 = yVar.f28091c;
                bArr2 = bArr3;
                i = i5;
                i4 = yVar.f28092d;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    /* renamed from: c */
    public static final String m36067c(C10603f fVar, long j) {
        String str;
        C10457l.m35320e(fVar, "$this$readUtf8Line");
        long j2 = 1;
        if (j > 0) {
            long j3 = j - 1;
            if (fVar.mo26392y0(j3) == ((byte) 13)) {
                str = fVar.mo26321K0(j3);
                j2 = 2;
                fVar.mo26358l(j2);
                return str;
            }
        }
        str = fVar.mo26321K0(j);
        fVar.mo26358l(j2);
        return str;
    }

    /* renamed from: d */
    public static final int m36068d(C10603f fVar, C10628t tVar, boolean z) {
        int i;
        int i2;
        int i3;
        C10636y yVar;
        int i4;
        C10603f fVar2 = fVar;
        C10457l.m35320e(fVar2, "$this$selectPrefix");
        C10457l.m35320e(tVar, "options");
        C10636y yVar2 = fVar2.f28034f;
        if (yVar2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = yVar2.f28090b;
        int i5 = yVar2.f28091c;
        int i6 = yVar2.f28092d;
        int[] k = tVar.mo26447k();
        C10636y yVar3 = yVar2;
        int i7 = 0;
        int i8 = -1;
        loop0:
        while (true) {
            int i9 = i7 + 1;
            int i10 = k[i7];
            int i11 = i9 + 1;
            int i12 = k[i9];
            if (i12 != -1) {
                i8 = i12;
            }
            if (yVar3 == null) {
                break;
            }
            if (i10 < 0) {
                int i13 = i11 + (i10 * -1);
                while (true) {
                    int i14 = i5 + 1;
                    int i15 = i11 + 1;
                    if ((bArr[i5] & 255) != k[i11]) {
                        return i8;
                    }
                    boolean z2 = i15 == i13;
                    if (i14 == i6) {
                        C10457l.m35317b(yVar3);
                        C10636y yVar4 = yVar3.f28095g;
                        C10457l.m35317b(yVar4);
                        i4 = yVar4.f28091c;
                        byte[] bArr2 = yVar4.f28090b;
                        i3 = yVar4.f28092d;
                        if (yVar4 != yVar2) {
                            byte[] bArr3 = bArr2;
                            yVar = yVar4;
                            bArr = bArr3;
                        } else if (!z2) {
                            break loop0;
                        } else {
                            bArr = bArr2;
                            yVar = null;
                        }
                    } else {
                        C10636y yVar5 = yVar3;
                        i3 = i6;
                        i4 = i14;
                        yVar = yVar5;
                    }
                    if (z2) {
                        i2 = k[i15];
                        i = i4;
                        i6 = i3;
                        yVar3 = yVar;
                        break;
                    }
                    i5 = i4;
                    i6 = i3;
                    i11 = i15;
                    yVar3 = yVar;
                }
            } else {
                i = i5 + 1;
                byte b = bArr[i5] & 255;
                int i16 = i11 + i10;
                while (i11 != i16) {
                    if (b == k[i11]) {
                        i2 = k[i11 + i10];
                        if (i == i6) {
                            yVar3 = yVar3.f28095g;
                            C10457l.m35317b(yVar3);
                            i = yVar3.f28091c;
                            bArr = yVar3.f28090b;
                            i6 = yVar3.f28092d;
                            if (yVar3 == yVar2) {
                                yVar3 = null;
                            }
                        }
                    } else {
                        i11++;
                    }
                }
                return i8;
            }
            if (i2 >= 0) {
                return i2;
            }
            i7 = -i2;
            i5 = i;
        }
        if (z) {
            return -2;
        }
        return i8;
    }

    /* renamed from: e */
    public static /* synthetic */ int m36069e(C10603f fVar, C10628t tVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m36068d(fVar, tVar, z);
    }
}
