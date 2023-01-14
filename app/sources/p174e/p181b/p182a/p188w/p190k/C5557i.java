package p174e.p181b.p182a.p188w.p190k;

import android.graphics.PointF;
import p174e.p181b.p182a.C5442g;
import p174e.p181b.p182a.p184u.p185b.C5480c;
import p174e.p181b.p182a.p184u.p185b.C5492n;
import p174e.p181b.p182a.p188w.p189j.C5534b;
import p174e.p181b.p182a.p188w.p189j.C5545m;
import p174e.p181b.p182a.p188w.p191l.C5571a;

/* renamed from: e.b.a.w.k.i */
public class C5557i implements C5548b {

    /* renamed from: a */
    private final String f15695a;

    /* renamed from: b */
    private final C5558a f15696b;

    /* renamed from: c */
    private final C5534b f15697c;

    /* renamed from: d */
    private final C5545m<PointF, PointF> f15698d;

    /* renamed from: e */
    private final C5534b f15699e;

    /* renamed from: f */
    private final C5534b f15700f;

    /* renamed from: g */
    private final C5534b f15701g;

    /* renamed from: h */
    private final C5534b f15702h;

    /* renamed from: i */
    private final C5534b f15703i;

    /* renamed from: j */
    private final boolean f15704j;

    /* renamed from: e.b.a.w.k.i$a */
    public enum C5558a {
        STAR(1),
        POLYGON(2);
        

        /* renamed from: q */
        private final int f15708q;

        private C5558a(int i) {
            this.f15708q = i;
        }

        /* renamed from: e */
        public static C5558a m20708e(int i) {
            for (C5558a aVar : values()) {
                if (aVar.f15708q == i) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public C5557i(String str, C5558a aVar, C5534b bVar, C5545m<PointF, PointF> mVar, C5534b bVar2, C5534b bVar3, C5534b bVar4, C5534b bVar5, C5534b bVar6, boolean z) {
        this.f15695a = str;
        this.f15696b = aVar;
        this.f15697c = bVar;
        this.f15698d = mVar;
        this.f15699e = bVar2;
        this.f15700f = bVar3;
        this.f15701g = bVar4;
        this.f15702h = bVar5;
        this.f15703i = bVar6;
        this.f15704j = z;
    }

    /* renamed from: a */
    public C5480c mo16698a(C5442g gVar, C5571a aVar) {
        return new C5492n(gVar, aVar, this);
    }

    /* renamed from: b */
    public C5534b mo16747b() {
        return this.f15700f;
    }

    /* renamed from: c */
    public C5534b mo16748c() {
        return this.f15702h;
    }

    /* renamed from: d */
    public String mo16749d() {
        return this.f15695a;
    }

    /* renamed from: e */
    public C5534b mo16750e() {
        return this.f15701g;
    }

    /* renamed from: f */
    public C5534b mo16751f() {
        return this.f15703i;
    }

    /* renamed from: g */
    public C5534b mo16752g() {
        return this.f15697c;
    }

    /* renamed from: h */
    public C5545m<PointF, PointF> mo16753h() {
        return this.f15698d;
    }

    /* renamed from: i */
    public C5534b mo16754i() {
        return this.f15699e;
    }

    /* renamed from: j */
    public C5558a mo16755j() {
        return this.f15696b;
    }

    /* renamed from: k */
    public boolean mo16756k() {
        return this.f15704j;
    }
}
