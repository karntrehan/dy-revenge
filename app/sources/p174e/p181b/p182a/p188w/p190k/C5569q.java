package p174e.p181b.p182a.p188w.p190k;

import p174e.p181b.p182a.C5442g;
import p174e.p181b.p182a.p184u.p185b.C5480c;
import p174e.p181b.p182a.p184u.p185b.C5498s;
import p174e.p181b.p182a.p188w.p189j.C5534b;
import p174e.p181b.p182a.p188w.p191l.C5571a;

/* renamed from: e.b.a.w.k.q */
public class C5569q implements C5548b {

    /* renamed from: a */
    private final String f15755a;

    /* renamed from: b */
    private final C5570a f15756b;

    /* renamed from: c */
    private final C5534b f15757c;

    /* renamed from: d */
    private final C5534b f15758d;

    /* renamed from: e */
    private final C5534b f15759e;

    /* renamed from: f */
    private final boolean f15760f;

    /* renamed from: e.b.a.w.k.q$a */
    public enum C5570a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        /* renamed from: e */
        public static C5570a m20760e(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i);
        }
    }

    public C5569q(String str, C5570a aVar, C5534b bVar, C5534b bVar2, C5534b bVar3, boolean z) {
        this.f15755a = str;
        this.f15756b = aVar;
        this.f15757c = bVar;
        this.f15758d = bVar2;
        this.f15759e = bVar3;
        this.f15760f = z;
    }

    /* renamed from: a */
    public C5480c mo16698a(C5442g gVar, C5571a aVar) {
        return new C5498s(aVar, this);
    }

    /* renamed from: b */
    public C5534b mo16799b() {
        return this.f15758d;
    }

    /* renamed from: c */
    public String mo16800c() {
        return this.f15755a;
    }

    /* renamed from: d */
    public C5534b mo16801d() {
        return this.f15759e;
    }

    /* renamed from: e */
    public C5534b mo16802e() {
        return this.f15757c;
    }

    /* renamed from: f */
    public C5570a mo16803f() {
        return this.f15756b;
    }

    /* renamed from: g */
    public boolean mo16804g() {
        return this.f15760f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f15757c + ", end: " + this.f15758d + ", offset: " + this.f15759e + "}";
    }
}
