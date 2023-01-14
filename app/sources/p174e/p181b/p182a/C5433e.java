package p174e.p181b.p182a;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p027c.p060f.C1793d;
import p027c.p060f.C1802h;
import p174e.p181b.p182a.p188w.C5526c;
import p174e.p181b.p182a.p188w.C5527d;
import p174e.p181b.p182a.p188w.C5531h;
import p174e.p181b.p182a.p188w.p191l.C5577d;
import p174e.p181b.p182a.p195z.C5643d;
import p174e.p181b.p182a.p195z.C5646g;

/* renamed from: e.b.a.e */
public class C5433e {

    /* renamed from: a */
    private final C5467o f15187a = new C5467o();

    /* renamed from: b */
    private final HashSet<String> f15188b = new HashSet<>();

    /* renamed from: c */
    private Map<String, List<C5577d>> f15189c;

    /* renamed from: d */
    private Map<String, C5458h> f15190d;

    /* renamed from: e */
    private Map<String, C5526c> f15191e;

    /* renamed from: f */
    private List<C5531h> f15192f;

    /* renamed from: g */
    private C1802h<C5527d> f15193g;

    /* renamed from: h */
    private C1793d<C5577d> f15194h;

    /* renamed from: i */
    private List<C5577d> f15195i;

    /* renamed from: j */
    private Rect f15196j;

    /* renamed from: k */
    private float f15197k;

    /* renamed from: l */
    private float f15198l;

    /* renamed from: m */
    private float f15199m;

    /* renamed from: n */
    private boolean f15200n;

    /* renamed from: o */
    private int f15201o = 0;

    /* renamed from: a */
    public void mo16455a(String str) {
        C5643d.m21027c(str);
        this.f15188b.add(str);
    }

    /* renamed from: b */
    public Rect mo16456b() {
        return this.f15196j;
    }

    /* renamed from: c */
    public C1802h<C5527d> mo16457c() {
        return this.f15193g;
    }

    /* renamed from: d */
    public float mo16458d() {
        return (float) ((long) ((mo16459e() / this.f15199m) * 1000.0f));
    }

    /* renamed from: e */
    public float mo16459e() {
        return this.f15198l - this.f15197k;
    }

    /* renamed from: f */
    public float mo16460f() {
        return this.f15198l;
    }

    /* renamed from: g */
    public Map<String, C5526c> mo16461g() {
        return this.f15191e;
    }

    /* renamed from: h */
    public float mo16462h(float f) {
        return C5646g.m21063k(this.f15197k, this.f15198l, f);
    }

    /* renamed from: i */
    public float mo16463i() {
        return this.f15199m;
    }

    /* renamed from: j */
    public Map<String, C5458h> mo16464j() {
        return this.f15190d;
    }

    /* renamed from: k */
    public List<C5577d> mo16465k() {
        return this.f15195i;
    }

    /* renamed from: l */
    public C5531h mo16466l(String str) {
        int size = this.f15192f.size();
        for (int i = 0; i < size; i++) {
            C5531h hVar = this.f15192f.get(i);
            if (hVar.mo16688a(str)) {
                return hVar;
            }
        }
        return null;
    }

    /* renamed from: m */
    public int mo16467m() {
        return this.f15201o;
    }

    /* renamed from: n */
    public C5467o mo16468n() {
        return this.f15187a;
    }

    /* renamed from: o */
    public List<C5577d> mo16469o(String str) {
        return this.f15189c.get(str);
    }

    /* renamed from: p */
    public float mo16470p() {
        return this.f15197k;
    }

    /* renamed from: q */
    public boolean mo16471q() {
        return this.f15200n;
    }

    /* renamed from: r */
    public void mo16472r(int i) {
        this.f15201o += i;
    }

    /* renamed from: s */
    public void mo16473s(Rect rect, float f, float f2, float f3, List<C5577d> list, C1793d<C5577d> dVar, Map<String, List<C5577d>> map, Map<String, C5458h> map2, C1802h<C5527d> hVar, Map<String, C5526c> map3, List<C5531h> list2) {
        this.f15196j = rect;
        this.f15197k = f;
        this.f15198l = f2;
        this.f15199m = f3;
        this.f15195i = list;
        this.f15194h = dVar;
        this.f15189c = map;
        this.f15190d = map2;
        this.f15193g = hVar;
        this.f15191e = map3;
        this.f15192f = list2;
    }

    /* renamed from: t */
    public C5577d mo16474t(long j) {
        return this.f15194h.mo6165i(j);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (C5577d w : this.f15195i) {
            sb.append(w.mo16840w("\t"));
        }
        return sb.toString();
    }

    /* renamed from: u */
    public void mo16476u(boolean z) {
        this.f15200n = z;
    }

    /* renamed from: v */
    public void mo16477v(boolean z) {
        this.f15187a.mo16582b(z);
    }
}
