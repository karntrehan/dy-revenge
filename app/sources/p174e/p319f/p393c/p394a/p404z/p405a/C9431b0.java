package p174e.p319f.p393c.p394a.p404z.p405a;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

/* renamed from: e.f.c.a.z.a.b0 */
public final class C9431b0 {

    /* renamed from: a */
    static final Charset f25305a = Charset.forName("UTF-8");

    /* renamed from: b */
    static final Charset f25306b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final byte[] f25307c;

    /* renamed from: d */
    public static final ByteBuffer f25308d;

    /* renamed from: e */
    public static final C9485j f25309e;

    /* renamed from: e.f.c.a.z.a.b0$a */
    public interface C9432a extends C9440i<Boolean> {
    }

    /* renamed from: e.f.c.a.z.a.b0$b */
    public interface C9433b extends C9440i<Double> {
    }

    /* renamed from: e.f.c.a.z.a.b0$c */
    public interface C9434c {
        /* renamed from: d */
        int mo23423d();
    }

    /* renamed from: e.f.c.a.z.a.b0$d */
    public interface C9435d<T extends C9434c> {
        /* renamed from: a */
        T mo23424a(int i);
    }

    /* renamed from: e.f.c.a.z.a.b0$e */
    public interface C9436e {
        /* renamed from: a */
        boolean mo23510a(int i);
    }

    /* renamed from: e.f.c.a.z.a.b0$f */
    public interface C9437f extends C9440i<Float> {
    }

    /* renamed from: e.f.c.a.z.a.b0$g */
    public interface C9438g extends C9440i<Integer> {
    }

    /* renamed from: e.f.c.a.z.a.b0$h */
    public interface C9439h extends C9440i<Long> {
    }

    /* renamed from: e.f.c.a.z.a.b0$i */
    public interface C9440i<E> extends List<E>, RandomAccess {
        /* renamed from: l */
        void mo23511l();

        /* renamed from: n */
        C9440i<E> mo23497n(int i);

        /* renamed from: y */
        boolean mo23512y();
    }

    static {
        byte[] bArr = new byte[0];
        f25307c = bArr;
        f25308d = ByteBuffer.wrap(bArr);
        f25309e = C9485j.m31732f(bArr);
    }

    /* renamed from: a */
    static <T> T m31422a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: b */
    static <T> T m31423b(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: c */
    public static int m31424c(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: d */
    public static int m31425d(byte[] bArr) {
        return m31426e(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    static int m31426e(byte[] bArr, int i, int i2) {
        int i3 = m31430i(i2, bArr, i, i2);
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    /* renamed from: f */
    public static int m31427f(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: g */
    public static boolean m31428g(byte[] bArr) {
        return C9547t1.m32402m(bArr);
    }

    /* renamed from: h */
    static Object m31429h(Object obj, Object obj2) {
        return ((C9537s0) obj).mo23979d().mo23482E((C9537s0) obj2).mo23984X();
    }

    /* renamed from: i */
    static int m31430i(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: j */
    public static String m31431j(byte[] bArr) {
        return new String(bArr, f25305a);
    }
}
