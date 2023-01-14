package p477h.p478a.p479a.p492i;

/* renamed from: h.a.a.i.b */
public class C10579b {
    /* renamed from: a */
    public static boolean m35876a(byte b, int i) {
        return ((1 << i) & ((long) b)) != 0;
    }

    /* renamed from: b */
    public static byte m35877b(byte b, int i) {
        return (byte) (b | (1 << i));
    }

    /* renamed from: c */
    public static byte m35878c(byte b, int i) {
        return (byte) (b & (~(1 << i)));
    }
}
