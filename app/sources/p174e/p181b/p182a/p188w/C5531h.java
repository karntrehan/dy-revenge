package p174e.p181b.p182a.p188w;

/* renamed from: e.b.a.w.h */
public class C5531h {

    /* renamed from: a */
    private static String f15621a = "\r";

    /* renamed from: b */
    private final String f15622b;

    /* renamed from: c */
    public final float f15623c;

    /* renamed from: d */
    public final float f15624d;

    public C5531h(String str, float f, float f2) {
        this.f15622b = str;
        this.f15624d = f2;
        this.f15623c = f;
    }

    /* renamed from: a */
    public boolean mo16688a(String str) {
        if (this.f15622b.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f15622b.endsWith(f15621a)) {
            String str2 = this.f15622b;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
