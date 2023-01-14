package p174e.p199d.p200a.p214s;

/* renamed from: e.d.a.s.a */
public class C5692a {

    /* renamed from: a */
    public static final C5692a f16130a = new C5692a("BYTE", 1, 1);

    /* renamed from: b */
    public static final C5692a f16131b = new C5692a("STRING", 2, 1);

    /* renamed from: c */
    public static final C5692a f16132c = new C5692a("USHORT", 3, 2);

    /* renamed from: d */
    public static final C5692a f16133d = new C5692a("ULONG", 4, 4);

    /* renamed from: e */
    public static final C5692a f16134e = new C5692a("URATIONAL", 5, 8);

    /* renamed from: f */
    public static final C5692a f16135f = new C5692a("SBYTE", 6, 1);

    /* renamed from: g */
    public static final C5692a f16136g = new C5692a("UNDEFINED", 7, 1);

    /* renamed from: h */
    public static final C5692a f16137h = new C5692a("SSHORT", 8, 2);

    /* renamed from: i */
    public static final C5692a f16138i = new C5692a("SLONG", 9, 4);

    /* renamed from: j */
    public static final C5692a f16139j = new C5692a("SRATIONAL", 10, 8);

    /* renamed from: k */
    public static final C5692a f16140k = new C5692a("SINGLE", 11, 4);

    /* renamed from: l */
    public static final C5692a f16141l = new C5692a("DOUBLE", 12, 8);

    /* renamed from: m */
    private final String f16142m;

    /* renamed from: n */
    private final int f16143n;

    /* renamed from: o */
    private final int f16144o;

    private C5692a(String str, int i, int i2) {
        this.f16142m = str;
        this.f16143n = i;
        this.f16144o = i2;
    }

    /* renamed from: a */
    public static C5692a m21164a(int i) {
        switch (i) {
            case 1:
                return f16130a;
            case 2:
                return f16131b;
            case 3:
                return f16132c;
            case 4:
                return f16133d;
            case 5:
                return f16134e;
            case 6:
                return f16135f;
            case 7:
                return f16136g;
            case 8:
                return f16137h;
            case 9:
                return f16138i;
            case 10:
                return f16139j;
            case 11:
                return f16140k;
            case 12:
                return f16141l;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public int mo16986b() {
        return this.f16144o;
    }

    public String toString() {
        return this.f16142m;
    }
}
