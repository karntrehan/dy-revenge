package p174e.p181b.p182a.p188w;

import java.util.List;
import p174e.p181b.p182a.p188w.p190k.C5563n;

/* renamed from: e.b.a.w.d */
public class C5527d {

    /* renamed from: a */
    private final List<C5563n> f15610a;

    /* renamed from: b */
    private final char f15611b;

    /* renamed from: c */
    private final double f15612c;

    /* renamed from: d */
    private final double f15613d;

    /* renamed from: e */
    private final String f15614e;

    /* renamed from: f */
    private final String f15615f;

    public C5527d(List<C5563n> list, char c, double d, double d2, String str, String str2) {
        this.f15610a = list;
        this.f15611b = c;
        this.f15612c = d;
        this.f15613d = d2;
        this.f15614e = str;
        this.f15615f = str2;
    }

    /* renamed from: c */
    public static int m20587c(char c, String str, String str2) {
        return ((((0 + c) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    /* renamed from: a */
    public List<C5563n> mo16675a() {
        return this.f15610a;
    }

    /* renamed from: b */
    public double mo16676b() {
        return this.f15613d;
    }

    public int hashCode() {
        return m20587c(this.f15611b, this.f15615f, this.f15614e);
    }
}
