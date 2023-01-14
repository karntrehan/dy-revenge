package p477h.p478a.p479a.p488f;

import p477h.p478a.p479a.p488f.p489r.C10552a;
import p477h.p478a.p479a.p488f.p489r.C10553b;
import p477h.p478a.p479a.p488f.p489r.C10554c;
import p477h.p478a.p479a.p488f.p489r.C10555d;
import p477h.p478a.p479a.p488f.p489r.C10556e;

/* renamed from: h.a.a.f.q */
public class C10550q {

    /* renamed from: a */
    private C10555d f27903a = C10555d.DEFLATE;

    /* renamed from: b */
    private C10554c f27904b = C10554c.NORMAL;

    /* renamed from: c */
    private boolean f27905c = false;

    /* renamed from: d */
    private C10556e f27906d = C10556e.NONE;

    /* renamed from: e */
    private boolean f27907e = true;

    /* renamed from: f */
    private boolean f27908f = true;

    /* renamed from: g */
    private C10552a f27909g = C10552a.KEY_STRENGTH_256;

    /* renamed from: h */
    private C10553b f27910h = C10553b.TWO;

    /* renamed from: i */
    private boolean f27911i = true;

    /* renamed from: j */
    private long f27912j;

    /* renamed from: k */
    private String f27913k;

    /* renamed from: l */
    private String f27914l;

    /* renamed from: m */
    private long f27915m = System.currentTimeMillis();

    /* renamed from: n */
    private long f27916n = -1;

    /* renamed from: o */
    private boolean f27917o = true;

    /* renamed from: p */
    private boolean f27918p = true;

    /* renamed from: q */
    private String f27919q;

    /* renamed from: r */
    private String f27920r;

    /* renamed from: s */
    private C10551a f27921s = C10551a.INCLUDE_LINKED_FILE_ONLY;

    /* renamed from: t */
    private C10541h f27922t;

    /* renamed from: u */
    private boolean f27923u;

    /* renamed from: h.a.a.f.q$a */
    public enum C10551a {
        INCLUDE_LINK_ONLY,
        INCLUDE_LINKED_FILE_ONLY,
        INCLUDE_LINK_AND_LINKED_FILE
    }

    public C10550q() {
    }

    public C10550q(C10550q qVar) {
        this.f27903a = qVar.mo26169d();
        this.f27904b = qVar.mo26167c();
        this.f27905c = qVar.mo26180o();
        this.f27906d = qVar.mo26171f();
        this.f27907e = qVar.mo26183r();
        this.f27908f = qVar.mo26184s();
        this.f27909g = qVar.mo26165a();
        this.f27910h = qVar.mo26166b();
        this.f27911i = qVar.mo26181p();
        this.f27912j = qVar.mo26172g();
        this.f27913k = qVar.mo26170e();
        this.f27914l = qVar.mo26176k();
        this.f27915m = qVar.mo26177l();
        this.f27916n = qVar.mo26173h();
        this.f27917o = qVar.mo26186u();
        this.f27918p = qVar.mo26182q();
        this.f27919q = qVar.mo26178m();
        this.f27920r = qVar.mo26175j();
        this.f27921s = qVar.mo26179n();
        this.f27922t = qVar.mo26174i();
        this.f27923u = qVar.mo26185t();
    }

    /* renamed from: A */
    public void mo26159A(C10556e eVar) {
        this.f27906d = eVar;
    }

    /* renamed from: B */
    public void mo26160B(long j) {
        this.f27912j = j;
    }

    /* renamed from: C */
    public void mo26161C(long j) {
        this.f27916n = j;
    }

    /* renamed from: D */
    public void mo26162D(String str) {
        this.f27914l = str;
    }

    /* renamed from: E */
    public void mo26163E(long j) {
        if (j > 0) {
            this.f27915m = j;
        }
    }

    /* renamed from: F */
    public void mo26164F(boolean z) {
        this.f27917o = z;
    }

    /* renamed from: a */
    public C10552a mo26165a() {
        return this.f27909g;
    }

    /* renamed from: b */
    public C10553b mo26166b() {
        return this.f27910h;
    }

    /* renamed from: c */
    public C10554c mo26167c() {
        return this.f27904b;
    }

    public Object clone() {
        return super.clone();
    }

    /* renamed from: d */
    public C10555d mo26169d() {
        return this.f27903a;
    }

    /* renamed from: e */
    public String mo26170e() {
        return this.f27913k;
    }

    /* renamed from: f */
    public C10556e mo26171f() {
        return this.f27906d;
    }

    /* renamed from: g */
    public long mo26172g() {
        return this.f27912j;
    }

    /* renamed from: h */
    public long mo26173h() {
        return this.f27916n;
    }

    /* renamed from: i */
    public C10541h mo26174i() {
        return this.f27922t;
    }

    /* renamed from: j */
    public String mo26175j() {
        return this.f27920r;
    }

    /* renamed from: k */
    public String mo26176k() {
        return this.f27914l;
    }

    /* renamed from: l */
    public long mo26177l() {
        return this.f27915m;
    }

    /* renamed from: m */
    public String mo26178m() {
        return this.f27919q;
    }

    /* renamed from: n */
    public C10551a mo26179n() {
        return this.f27921s;
    }

    /* renamed from: o */
    public boolean mo26180o() {
        return this.f27905c;
    }

    /* renamed from: p */
    public boolean mo26181p() {
        return this.f27911i;
    }

    /* renamed from: q */
    public boolean mo26182q() {
        return this.f27918p;
    }

    /* renamed from: r */
    public boolean mo26183r() {
        return this.f27907e;
    }

    /* renamed from: s */
    public boolean mo26184s() {
        return this.f27908f;
    }

    /* renamed from: t */
    public boolean mo26185t() {
        return this.f27923u;
    }

    /* renamed from: u */
    public boolean mo26186u() {
        return this.f27917o;
    }

    /* renamed from: v */
    public void mo26187v(C10552a aVar) {
        this.f27909g = aVar;
    }

    /* renamed from: w */
    public void mo26188w(C10554c cVar) {
        this.f27904b = cVar;
    }

    /* renamed from: x */
    public void mo26189x(C10555d dVar) {
        this.f27903a = dVar;
    }

    /* renamed from: y */
    public void mo26190y(String str) {
        this.f27913k = str;
    }

    /* renamed from: z */
    public void mo26191z(boolean z) {
        this.f27905c = z;
    }
}
