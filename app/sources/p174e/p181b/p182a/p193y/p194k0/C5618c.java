package p174e.p181b.p182a.p193y.p194k0;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import p493i.C10603f;
import p493i.C10608g;
import p493i.C10615h;
import p493i.C10616i;
import p493i.C10628t;

/* renamed from: e.b.a.y.k0.c */
public abstract class C5618c implements Closeable {

    /* renamed from: f */
    private static final String[] f15904f = new String[128];

    /* renamed from: o */
    int f15905o;

    /* renamed from: p */
    int[] f15906p = new int[32];

    /* renamed from: q */
    String[] f15907q = new String[32];

    /* renamed from: r */
    int[] f15908r = new int[32];

    /* renamed from: s */
    boolean f15909s;

    /* renamed from: t */
    boolean f15910t;

    /* renamed from: e.b.a.y.k0.c$a */
    public static final class C5619a {

        /* renamed from: a */
        final String[] f15911a;

        /* renamed from: b */
        final C10628t f15912b;

        private C5619a(String[] strArr, C10628t tVar) {
            this.f15911a = strArr;
            this.f15912b = tVar;
        }

        /* renamed from: a */
        public static C5619a m20942a(String... strArr) {
            try {
                C10616i[] iVarArr = new C10616i[strArr.length];
                C10603f fVar = new C10603f();
                for (int i = 0; i < strArr.length; i++) {
                    C5618c.m20924x0(fVar, strArr[i]);
                    fVar.readByte();
                    iVarArr[i] = fVar.mo26335T();
                }
                return new C5619a((String[]) strArr.clone(), C10628t.m36178r(iVarArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: e.b.a.y.k0.c$b */
    public enum C5620b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i = 0; i <= 31; i++) {
            f15904f[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f15904f;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    C5618c() {
    }

    /* renamed from: i0 */
    public static C5618c m20923i0(C10615h hVar) {
        return new C5622e(hVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: x0 */
    public static void m20924x0(C10608g gVar, String str) {
        String str2;
        String[] strArr = f15904f;
        gVar.writeByte(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i2) {
                gVar.mo26328P(str, i, i2);
            }
            gVar.mo26320K(str2);
            i = i2 + 1;
        }
        if (i < length) {
            gVar.mo26328P(str, i, length);
        }
        gVar.writeByte(34);
    }

    /* renamed from: A */
    public final String mo16859A() {
        return C5621d.m20943a(this.f15905o, this.f15906p, this.f15907q, this.f15908r);
    }

    /* renamed from: E */
    public abstract boolean mo16860E();

    /* renamed from: I */
    public abstract boolean mo16861I();

    /* renamed from: L */
    public abstract double mo16862L();

    /* renamed from: W */
    public abstract int mo16863W();

    /* renamed from: X */
    public abstract String mo16864X();

    /* renamed from: b */
    public abstract void mo16865b();

    /* renamed from: e0 */
    public abstract String mo16866e0();

    /* renamed from: h */
    public abstract void mo16867h();

    /* renamed from: n0 */
    public abstract C5620b mo16868n0();

    /* renamed from: o */
    public abstract void mo16869o();

    /* renamed from: r */
    public abstract void mo16870r();

    /* access modifiers changed from: package-private */
    /* renamed from: s0 */
    public final void mo16871s0(int i) {
        int i2 = this.f15905o;
        int[] iArr = this.f15906p;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.f15906p = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f15907q;
                this.f15907q = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f15908r;
                this.f15908r = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new C5616a("Nesting too deep at " + mo16859A());
            }
        }
        int[] iArr3 = this.f15906p;
        int i3 = this.f15905o;
        this.f15905o = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: u0 */
    public abstract int mo16872u0(C5619a aVar);

    /* renamed from: v0 */
    public abstract void mo16873v0();

    /* renamed from: w0 */
    public abstract void mo16874w0();

    /* access modifiers changed from: package-private */
    /* renamed from: y0 */
    public final C5617b mo16875y0(String str) {
        throw new C5617b(str + " at path " + mo16859A());
    }
}
