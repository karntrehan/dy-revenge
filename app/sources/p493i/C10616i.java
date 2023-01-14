package p493i;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Objects;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;
import p493i.p494g0.C10610b;

/* renamed from: i.i */
public class C10616i implements Serializable, Comparable<C10616i> {

    /* renamed from: f */
    public static final C10616i f28049f = new C10616i(new byte[0]);

    /* renamed from: o */
    public static final C10617a f28050o = new C10617a((C10452g) null);

    /* renamed from: p */
    private transient int f28051p;

    /* renamed from: q */
    private transient String f28052q;

    /* renamed from: r */
    private final byte[] f28053r;

    /* renamed from: i.i$a */
    public static final class C10617a {
        private C10617a() {
        }

        public /* synthetic */ C10617a(C10452g gVar) {
            this();
        }

        /* renamed from: g */
        public static /* synthetic */ C10616i m36135g(C10617a aVar, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = bArr.length;
            }
            return aVar.mo26430f(bArr, i, i2);
        }

        /* renamed from: a */
        public final C10616i mo26425a(String str) {
            C10457l.m35320e(str, "$this$decodeBase64");
            byte[] a = C10587a.m35946a(str);
            if (a != null) {
                return new C10616i(a);
            }
            return null;
        }

        /* renamed from: b */
        public final C10616i mo26426b(String str) {
            C10457l.m35320e(str, "$this$decodeHex");
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    bArr[i] = (byte) ((C10610b.m36076g(str.charAt(i2)) << 4) + C10610b.m36076g(str.charAt(i2 + 1)));
                }
                return new C10616i(bArr);
            }
            throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
        }

        /* renamed from: c */
        public final C10616i mo26427c(String str, Charset charset) {
            C10457l.m35320e(str, "$this$encode");
            C10457l.m35320e(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            C10457l.m35319d(bytes, "(this as java.lang.String).getBytes(charset)");
            return new C10616i(bytes);
        }

        /* renamed from: d */
        public final C10616i mo26428d(String str) {
            C10457l.m35320e(str, "$this$encodeUtf8");
            C10616i iVar = new C10616i(C10589b.m35963a(str));
            iVar.mo26417V(str);
            return iVar;
        }

        /* renamed from: e */
        public final C10616i mo26429e(byte... bArr) {
            C10457l.m35320e(bArr, "data");
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            C10457l.m35319d(copyOf, "java.util.Arrays.copyOf(this, size)");
            return new C10616i(copyOf);
        }

        /* renamed from: f */
        public final C10616i mo26430f(byte[] bArr, int i, int i2) {
            C10457l.m35320e(bArr, "$this$toByteString");
            C10591c.m35966b((long) bArr.length, (long) i, (long) i2);
            return new C10616i(C10341g.m35071g(bArr, i, i2 + i));
        }
    }

    public C10616i(byte[] bArr) {
        C10457l.m35320e(bArr, "data");
        this.f28053r = bArr;
    }

    /* renamed from: R */
    public static final C10616i m36108R(byte... bArr) {
        return f28050o.mo26429e(bArr);
    }

    /* renamed from: h */
    public static final C10616i m36109h(String str) {
        return f28050o.mo26425a(str);
    }

    /* renamed from: z */
    public static final C10616i m36110z(String str) {
        return f28050o.mo26428d(str);
    }

    /* renamed from: A */
    public final byte mo26411A(int i) {
        return mo26264P(i);
    }

    /* renamed from: B */
    public final byte[] mo26412B() {
        return this.f28053r;
    }

    /* renamed from: D */
    public final int mo26413D() {
        return this.f28051p;
    }

    /* renamed from: F */
    public int mo26261F() {
        return mo26412B().length;
    }

    /* renamed from: K */
    public final String mo26414K() {
        return this.f28052q;
    }

    /* renamed from: N */
    public String mo26262N() {
        char[] cArr = new char[(mo26412B().length * 2)];
        int i = 0;
        for (byte b : mo26412B()) {
            int i2 = i + 1;
            cArr[i] = C10610b.m36077h()[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = C10610b.m36077h()[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: O */
    public byte[] mo26263O() {
        return mo26412B();
    }

    /* renamed from: P */
    public byte mo26264P(int i) {
        return mo26412B()[i];
    }

    /* renamed from: Q */
    public final C10616i mo26415Q() {
        return mo26276v("MD5");
    }

    /* renamed from: S */
    public boolean mo26265S(int i, C10616i iVar, int i2, int i3) {
        C10457l.m35320e(iVar, "other");
        return iVar.mo26266T(i2, mo26412B(), i, i3);
    }

    /* renamed from: T */
    public boolean mo26266T(int i, byte[] bArr, int i2, int i3) {
        C10457l.m35320e(bArr, "other");
        return i >= 0 && i <= mo26412B().length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C10591c.m35965a(mo26412B(), i, bArr, i2, i3);
    }

    /* renamed from: U */
    public final void mo26416U(int i) {
        this.f28051p = i;
    }

    /* renamed from: V */
    public final void mo26417V(String str) {
        this.f28052q = str;
    }

    /* renamed from: W */
    public final C10616i mo26418W() {
        return mo26276v("SHA-1");
    }

    /* renamed from: X */
    public final C10616i mo26419X() {
        return mo26276v("SHA-256");
    }

    /* renamed from: Y */
    public final int mo26420Y() {
        return mo26261F();
    }

    /* renamed from: Z */
    public final boolean mo26421Z(C10616i iVar) {
        C10457l.m35320e(iVar, "prefix");
        return mo26265S(0, iVar, 0, iVar.mo26420Y());
    }

    /* renamed from: a0 */
    public C10616i mo26267a0() {
        byte b;
        int i = 0;
        while (i < mo26412B().length) {
            byte b2 = mo26412B()[i];
            byte b3 = (byte) 65;
            if (b2 < b3 || b2 > (b = (byte) 90)) {
                i++;
            } else {
                byte[] B = mo26412B();
                byte[] copyOf = Arrays.copyOf(B, B.length);
                C10457l.m35319d(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 + 32);
                    }
                }
                return new C10616i(copyOf);
            }
        }
        return this;
    }

    /* renamed from: b0 */
    public byte[] mo26268b0() {
        byte[] B = mo26412B();
        byte[] copyOf = Arrays.copyOf(B, B.length);
        C10457l.m35319d(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    /* renamed from: c0 */
    public String mo26422c0() {
        String K = mo26414K();
        if (K != null) {
            return K;
        }
        String b = C10589b.m35964b(mo26263O());
        mo26417V(b);
        return b;
    }

    /* renamed from: d0 */
    public void mo26269d0(C10603f fVar, int i, int i2) {
        C10457l.m35320e(fVar, "buffer");
        C10610b.m36075f(this, fVar, i, i2);
    }

    /* renamed from: e */
    public String mo26270e() {
        return C10587a.m35948c(mo26412B(), (byte[]) null, 1, (Object) null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10616i) {
            C10616i iVar = (C10616i) obj;
            return iVar.mo26420Y() == mo26412B().length && iVar.mo26266T(0, mo26412B(), 0, mo26412B().length);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0032 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0030 A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(p493i.C10616i r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            p455g.p470y.p472d.C10457l.m35320e(r10, r0)
            int r0 = r9.mo26420Y()
            int r1 = r10.mo26420Y()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L_0x0013:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L_0x002b
            byte r7 = r9.mo26411A(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.mo26411A(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L_0x0028
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0028:
            if (r7 >= r8) goto L_0x0032
            goto L_0x0030
        L_0x002b:
            if (r0 != r1) goto L_0x002e
            goto L_0x0033
        L_0x002e:
            if (r0 >= r1) goto L_0x0032
        L_0x0030:
            r3 = -1
            goto L_0x0033
        L_0x0032:
            r3 = 1
        L_0x0033:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p493i.C10616i.compareTo(i.i):int");
    }

    public int hashCode() {
        int D = mo26413D();
        if (D != 0) {
            return D;
        }
        int hashCode = Arrays.hashCode(mo26412B());
        mo26416U(hashCode);
        return hashCode;
    }

    public String toString() {
        StringBuilder sb;
        StringBuilder sb2;
        boolean z = true;
        if (mo26412B().length == 0) {
            return "[size=0]";
        }
        int a = C10610b.m36072c(mo26412B(), 64);
        if (a != -1) {
            String c0 = mo26422c0();
            Objects.requireNonNull(c0, "null cannot be cast to non-null type java.lang.String");
            String substring = c0.substring(0, a);
            C10457l.m35319d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String x = C10299p.m34938x(C10299p.m34938x(C10299p.m34938x(substring, "\\", "\\\\", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
            if (a < c0.length()) {
                sb = new StringBuilder();
                sb.append("[size=");
                sb.append(mo26412B().length);
                sb.append(" text=");
                sb.append(x);
                sb.append("…]");
                return sb.toString();
            }
            sb2 = new StringBuilder();
            sb2.append("[text=");
            sb2.append(x);
        } else if (mo26412B().length <= 64) {
            sb2 = new StringBuilder();
            sb2.append("[hex=");
            sb2.append(mo26262N());
        } else {
            sb = new StringBuilder();
            sb.append("[size=");
            sb.append(mo26412B().length);
            sb.append(" hex=");
            if (64 > mo26412B().length) {
                z = false;
            }
            if (z) {
                sb.append((64 == mo26412B().length ? this : new C10616i(C10341g.m35071g(mo26412B(), 0, 64))).mo26262N());
                sb.append("…]");
                return sb.toString();
            }
            throw new IllegalArgumentException(("endIndex > length(" + mo26412B().length + ')').toString());
        }
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: v */
    public C10616i mo26276v(String str) {
        C10457l.m35320e(str, "algorithm");
        return C10610b.m36073d(this, str);
    }
}
