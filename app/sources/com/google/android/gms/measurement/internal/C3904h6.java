package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C3705r;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.h6 */
final class C3904h6 {

    /* renamed from: A */
    private long f10726A;

    /* renamed from: B */
    private String f10727B;

    /* renamed from: C */
    private boolean f10728C;

    /* renamed from: D */
    private long f10729D;

    /* renamed from: E */
    private long f10730E;

    /* renamed from: a */
    private final C3955l5 f10731a;

    /* renamed from: b */
    private final String f10732b;

    /* renamed from: c */
    private String f10733c;

    /* renamed from: d */
    private String f10734d;

    /* renamed from: e */
    private String f10735e;

    /* renamed from: f */
    private String f10736f;

    /* renamed from: g */
    private long f10737g;

    /* renamed from: h */
    private long f10738h;

    /* renamed from: i */
    private long f10739i;

    /* renamed from: j */
    private String f10740j;

    /* renamed from: k */
    private long f10741k;

    /* renamed from: l */
    private String f10742l;

    /* renamed from: m */
    private long f10743m;

    /* renamed from: n */
    private long f10744n;

    /* renamed from: o */
    private boolean f10745o;

    /* renamed from: p */
    private boolean f10746p;

    /* renamed from: q */
    private String f10747q;

    /* renamed from: r */
    private Boolean f10748r;

    /* renamed from: s */
    private long f10749s;

    /* renamed from: t */
    private List f10750t;

    /* renamed from: u */
    private String f10751u;

    /* renamed from: v */
    private long f10752v;

    /* renamed from: w */
    private long f10753w;

    /* renamed from: x */
    private long f10754x;

    /* renamed from: y */
    private long f10755y;

    /* renamed from: z */
    private long f10756z;

    C3904h6(C3955l5 l5Var, String str) {
        C3705r.m14346k(l5Var);
        C3705r.m14342g(str);
        this.f10731a = l5Var;
        this.f10732b = str;
        l5Var.mo11934a().mo11931h();
    }

    /* renamed from: A */
    public final long mo12036A() {
        this.f10731a.mo11934a().mo11931h();
        return 0;
    }

    /* renamed from: B */
    public final void mo12037B(long j) {
        boolean z = true;
        C3705r.m14336a(j >= 0);
        this.f10731a.mo11934a().mo11931h();
        boolean z2 = this.f10728C;
        if (this.f10737g == j) {
            z = false;
        }
        this.f10728C = z | z2;
        this.f10737g = j;
    }

    /* renamed from: C */
    public final void mo12038C(long j) {
        this.f10731a.mo11934a().mo11931h();
        this.f10728C |= this.f10738h != j;
        this.f10738h = j;
    }

    /* renamed from: D */
    public final void mo12039D(boolean z) {
        this.f10731a.mo11934a().mo11931h();
        this.f10728C |= this.f10745o != z;
        this.f10745o = z;
    }

    /* renamed from: E */
    public final void mo12040E(Boolean bool) {
        this.f10731a.mo11934a().mo11931h();
        this.f10728C |= !C3890g5.m14750a(this.f10748r, bool);
        this.f10748r = bool;
    }

    /* renamed from: F */
    public final void mo12041F(String str) {
        this.f10731a.mo11934a().mo11931h();
        this.f10728C |= !C3890g5.m14750a(this.f10735e, str);
        this.f10735e = str;
    }

    /* renamed from: G */
    public final void mo12042G(List list) {
        this.f10731a.mo11934a().mo11931h();
        if (!C3890g5.m14750a(this.f10750t, list)) {
            this.f10728C = true;
            this.f10750t = list != null ? new ArrayList(list) : null;
        }
    }

    /* renamed from: H */
    public final void mo12043H(String str) {
        this.f10731a.mo11934a().mo11931h();
        this.f10728C |= !C3890g5.m14750a(this.f10751u, str);
        this.f10751u = str;
    }

    /* renamed from: I */
    public final boolean mo12044I() {
        this.f10731a.mo11934a().mo11931h();
        return this.f10746p;
    }

    /* renamed from: J */
    public final boolean mo12045J() {
        this.f10731a.mo11934a().mo11931h();
        return this.f10745o;
    }

    /* renamed from: K */
    public final boolean mo12046K() {
        this.f10731a.mo11934a().mo11931h();
        return this.f10728C;
    }

    /* renamed from: L */
    public final long mo12047L() {
        this.f10731a.mo11934a().mo11931h();
        return this.f10741k;
    }

    /* renamed from: M */
    public final long mo12048M() {
        this.f10731a.mo11934a().mo11931h();
        return this.f10729D;
    }

    /* renamed from: N */
    public final long mo12049N() {
        this.f10731a.mo11934a().mo11931h();
        return this.f10755y;
    }

    /* renamed from: O */
    public final long mo12050O() {
        this.f10731a.mo11934a().mo11931h();
        return this.f10756z;
    }

    /* renamed from: P */
    public final long mo12051P() {
        this.f10731a.mo11934a().mo11931h();
        return this.f10754x;
    }

    /* renamed from: Q */
    public final long mo12052Q() {
        this.f10731a.mo11934a().mo11931h();
        return this.f10753w;
    }

    /* renamed from: R */
    public final long mo12053R() {
        this.f10731a.mo11934a().mo11931h();
        return this.f10726A;
    }

    /* renamed from: S */
    public final long mo12054S() {
        this.f10731a.mo11934a().mo11931h();
        return this.f10752v;
    }

    /* renamed from: T */
    public final long mo12055T() {
        this.f10731a.mo11934a().mo11931h();
        return this.f10744n;
    }

    /* renamed from: U */
    public final long mo12056U() {
        this.f10731a.mo11934a().mo11931h();
        return this.f10749s;
    }

    /* renamed from: V */
    public final long mo12057V() {
        this.f10731a.mo11934a().mo11931h();
        return this.f10730E;
    }

    /* renamed from: W */
    public final long mo12058W() {
        this.f10731a.mo11934a().mo11931h();
        return this.f10743m;
    }

    /* renamed from: X */
    public final long mo12059X() {
        this.f10731a.mo11934a().mo11931h();
        return this.f10739i;
    }

    /* renamed from: Y */
    public final long mo12060Y() {
        this.f10731a.mo11934a().mo11931h();
        return this.f10737g;
    }

    /* renamed from: Z */
    public final long mo12061Z() {
        this.f10731a.mo11934a().mo11931h();
        return this.f10738h;
    }

    /* renamed from: a */
    public final String mo12062a() {
        this.f10731a.mo11934a().mo11931h();
        return this.f10735e;
    }

    /* renamed from: a0 */
    public final Boolean mo12063a0() {
        this.f10731a.mo11934a().mo11931h();
        return this.f10748r;
    }

    /* renamed from: b */
    public final String mo12064b() {
        this.f10731a.mo11934a().mo11931h();
        return this.f10751u;
    }

    /* renamed from: b0 */
    public final String mo12065b0() {
        this.f10731a.mo11934a().mo11931h();
        return this.f10747q;
    }

    /* renamed from: c */
    public final List mo12066c() {
        this.f10731a.mo11934a().mo11931h();
        return this.f10750t;
    }

    /* renamed from: c0 */
    public final String mo12067c0() {
        this.f10731a.mo11934a().mo11931h();
        String str = this.f10727B;
        mo12096y((String) null);
        return str;
    }

    /* renamed from: d */
    public final void mo12068d() {
        this.f10731a.mo11934a().mo11931h();
        this.f10728C = false;
    }

    /* renamed from: d0 */
    public final String mo12069d0() {
        this.f10731a.mo11934a().mo11931h();
        return this.f10732b;
    }

    /* renamed from: e */
    public final void mo12070e() {
        this.f10731a.mo11934a().mo11931h();
        long j = this.f10737g + 1;
        if (j > 2147483647L) {
            this.f10731a.mo11935b().mo12549w().mo12477b("Bundle index overflow. appId", C4122z3.m15469z(this.f10732b));
            j = 0;
        }
        this.f10728C = true;
        this.f10737g = j;
    }

    /* renamed from: e0 */
    public final String mo12071e0() {
        this.f10731a.mo11934a().mo11931h();
        return this.f10733c;
    }

    /* renamed from: f */
    public final void mo12072f(String str) {
        this.f10731a.mo11934a().mo11931h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f10728C |= true ^ C3890g5.m14750a(this.f10747q, str);
        this.f10747q = str;
    }

    /* renamed from: f0 */
    public final String mo12073f0() {
        this.f10731a.mo11934a().mo11931h();
        return this.f10742l;
    }

    /* renamed from: g */
    public final void mo12074g(boolean z) {
        this.f10731a.mo11934a().mo11931h();
        this.f10728C |= this.f10746p != z;
        this.f10746p = z;
    }

    /* renamed from: g0 */
    public final String mo12075g0() {
        this.f10731a.mo11934a().mo11931h();
        return this.f10740j;
    }

    /* renamed from: h */
    public final void mo12076h(String str) {
        this.f10731a.mo11934a().mo11931h();
        this.f10728C |= !C3890g5.m14750a(this.f10733c, str);
        this.f10733c = str;
    }

    /* renamed from: h0 */
    public final String mo12077h0() {
        this.f10731a.mo11934a().mo11931h();
        return this.f10736f;
    }

    /* renamed from: i */
    public final void mo12078i(String str) {
        this.f10731a.mo11934a().mo11931h();
        this.f10728C |= !C3890g5.m14750a(this.f10742l, str);
        this.f10742l = str;
    }

    /* renamed from: i0 */
    public final String mo12079i0() {
        this.f10731a.mo11934a().mo11931h();
        return this.f10734d;
    }

    /* renamed from: j */
    public final void mo12080j(String str) {
        this.f10731a.mo11934a().mo11931h();
        this.f10728C |= !C3890g5.m14750a(this.f10740j, str);
        this.f10740j = str;
    }

    /* renamed from: j0 */
    public final String mo12081j0() {
        this.f10731a.mo11934a().mo11931h();
        return this.f10727B;
    }

    /* renamed from: k */
    public final void mo12082k(long j) {
        this.f10731a.mo11934a().mo11931h();
        this.f10728C |= this.f10741k != j;
        this.f10741k = j;
    }

    /* renamed from: l */
    public final void mo12083l(long j) {
        this.f10731a.mo11934a().mo11931h();
        this.f10728C |= this.f10729D != j;
        this.f10729D = j;
    }

    /* renamed from: m */
    public final void mo12084m(long j) {
        this.f10731a.mo11934a().mo11931h();
        this.f10728C |= this.f10755y != j;
        this.f10755y = j;
    }

    /* renamed from: n */
    public final void mo12085n(long j) {
        this.f10731a.mo11934a().mo11931h();
        this.f10728C |= this.f10756z != j;
        this.f10756z = j;
    }

    /* renamed from: o */
    public final void mo12086o(long j) {
        this.f10731a.mo11934a().mo11931h();
        this.f10728C |= this.f10754x != j;
        this.f10754x = j;
    }

    /* renamed from: p */
    public final void mo12087p(long j) {
        this.f10731a.mo11934a().mo11931h();
        this.f10728C |= this.f10753w != j;
        this.f10753w = j;
    }

    /* renamed from: q */
    public final void mo12088q(long j) {
        this.f10731a.mo11934a().mo11931h();
        this.f10728C |= this.f10726A != j;
        this.f10726A = j;
    }

    /* renamed from: r */
    public final void mo12089r(long j) {
        this.f10731a.mo11934a().mo11931h();
        this.f10728C |= this.f10752v != j;
        this.f10752v = j;
    }

    /* renamed from: s */
    public final void mo12090s(long j) {
        this.f10731a.mo11934a().mo11931h();
        this.f10728C |= this.f10744n != j;
        this.f10744n = j;
    }

    /* renamed from: t */
    public final void mo12091t(long j) {
        this.f10731a.mo11934a().mo11931h();
        this.f10728C |= this.f10749s != j;
        this.f10749s = j;
    }

    /* renamed from: u */
    public final void mo12092u(long j) {
        this.f10731a.mo11934a().mo11931h();
        this.f10728C |= this.f10730E != j;
        this.f10730E = j;
    }

    /* renamed from: v */
    public final void mo12093v(String str) {
        this.f10731a.mo11934a().mo11931h();
        this.f10728C |= !C3890g5.m14750a(this.f10736f, str);
        this.f10736f = str;
    }

    /* renamed from: w */
    public final void mo12094w(String str) {
        this.f10731a.mo11934a().mo11931h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f10728C |= true ^ C3890g5.m14750a(this.f10734d, str);
        this.f10734d = str;
    }

    /* renamed from: x */
    public final void mo12095x(long j) {
        this.f10731a.mo11934a().mo11931h();
        this.f10728C |= this.f10743m != j;
        this.f10743m = j;
    }

    /* renamed from: y */
    public final void mo12096y(String str) {
        this.f10731a.mo11934a().mo11931h();
        this.f10728C |= !C3890g5.m14750a(this.f10727B, str);
        this.f10727B = str;
    }

    /* renamed from: z */
    public final void mo12097z(long j) {
        this.f10731a.mo11934a().mo11931h();
        this.f10728C |= this.f10739i != j;
        this.f10739i = j;
    }
}
