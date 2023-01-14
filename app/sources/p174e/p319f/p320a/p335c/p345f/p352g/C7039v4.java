package p174e.p319f.p320a.p335c.p345f.p352g;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.List;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* renamed from: e.f.a.c.f.g.v4 */
public final class C7039v4 extends C6702a9 implements C6821ha {
    public static final /* synthetic */ int zza = 0;
    /* access modifiers changed from: private */
    public static final C7039v4 zze;
    private boolean zzA;
    private String zzB = HttpUrl.FRAGMENT_ENCODE_SET;
    private long zzC;
    private int zzD;
    private String zzE = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzF = HttpUrl.FRAGMENT_ENCODE_SET;
    private boolean zzG;
    /* access modifiers changed from: private */
    public C6804g9 zzH = C6702a9.m25414o();
    private String zzI = HttpUrl.FRAGMENT_ENCODE_SET;
    private int zzJ;
    private int zzK;
    private int zzL;
    private String zzM = HttpUrl.FRAGMENT_ENCODE_SET;
    private long zzN;
    private long zzO;
    private String zzP = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzQ = HttpUrl.FRAGMENT_ENCODE_SET;
    private int zzR;
    private String zzS = HttpUrl.FRAGMENT_ENCODE_SET;
    private C7087y4 zzT;
    private C6770e9 zzU = C6702a9.m25411l();
    private long zzV;
    private long zzW;
    private String zzX = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzY = HttpUrl.FRAGMENT_ENCODE_SET;
    private int zzZ;
    private boolean zzaa;
    private String zzab = HttpUrl.FRAGMENT_ENCODE_SET;
    private boolean zzac;
    private C6959q4 zzad;
    private String zzae = HttpUrl.FRAGMENT_ENCODE_SET;
    private C6804g9 zzaf = C6702a9.m25414o();
    private String zzag = HttpUrl.FRAGMENT_ENCODE_SET;
    private int zzf;
    private int zzg;
    private int zzh;
    /* access modifiers changed from: private */
    public C6804g9 zzi = C6702a9.m25414o();
    private C6804g9 zzj = C6702a9.m25414o();
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private String zzp = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzq = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzr = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzs = HttpUrl.FRAGMENT_ENCODE_SET;
    private int zzt;
    private String zzu = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzv = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzw = HttpUrl.FRAGMENT_ENCODE_SET;
    private long zzx;
    private long zzy;
    private String zzz = HttpUrl.FRAGMENT_ENCODE_SET;

    static {
        C7039v4 v4Var = new C7039v4();
        zze = v4Var;
        C6702a9.m25418s(C7039v4.class, v4Var);
    }

    private C7039v4() {
    }

    /* renamed from: B0 */
    static /* synthetic */ void m26799B0(C7039v4 v4Var, String str) {
        str.getClass();
        v4Var.zzg |= 8192;
        v4Var.zzae = str;
    }

    /* renamed from: C0 */
    static /* synthetic */ void m26800C0(C7039v4 v4Var) {
        v4Var.zzg &= -8193;
        v4Var.zzae = zze.zzae;
    }

    /* renamed from: D0 */
    static /* synthetic */ void m26801D0(C7039v4 v4Var, Iterable iterable) {
        C6804g9 g9Var = v4Var.zzaf;
        if (!g9Var.mo19801a()) {
            v4Var.zzaf = C6702a9.m25415p(g9Var);
        }
        C6834i7.m25867b(iterable, v4Var.zzaf);
    }

    /* renamed from: F0 */
    static /* synthetic */ void m26803F0(C7039v4 v4Var, String str) {
        str.getClass();
        v4Var.zzg |= Http2.INITIAL_MAX_FRAME_SIZE;
        v4Var.zzag = str;
    }

    /* renamed from: G0 */
    static /* synthetic */ void m26804G0(C7039v4 v4Var, int i) {
        v4Var.m26842c1();
        v4Var.zzi.remove(i);
    }

    /* renamed from: H0 */
    static /* synthetic */ void m26805H0(C7039v4 v4Var, int i, C6766e5 e5Var) {
        e5Var.getClass();
        v4Var.m26844d1();
        v4Var.zzj.set(i, e5Var);
    }

    /* renamed from: I0 */
    static /* synthetic */ void m26806I0(C7039v4 v4Var, C6766e5 e5Var) {
        e5Var.getClass();
        v4Var.m26844d1();
        v4Var.zzj.add(e5Var);
    }

    /* renamed from: J0 */
    static /* synthetic */ void m26807J0(C7039v4 v4Var, Iterable iterable) {
        v4Var.m26844d1();
        C6834i7.m25867b(iterable, v4Var.zzj);
    }

    /* renamed from: K0 */
    static /* synthetic */ void m26808K0(C7039v4 v4Var, int i) {
        v4Var.m26844d1();
        v4Var.zzj.remove(i);
    }

    /* renamed from: L0 */
    static /* synthetic */ void m26809L0(C7039v4 v4Var, long j) {
        v4Var.zzf |= 2;
        v4Var.zzk = j;
    }

    /* renamed from: L1 */
    public static C7023u4 m26810L1() {
        return (C7023u4) zze.mo19524t();
    }

    /* renamed from: M */
    static /* synthetic */ void m26811M(C7039v4 v4Var) {
        v4Var.zzf &= RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
        v4Var.zzP = zze.zzP;
    }

    /* renamed from: M0 */
    static /* synthetic */ void m26812M0(C7039v4 v4Var, long j) {
        v4Var.zzf |= 4;
        v4Var.zzl = j;
    }

    /* renamed from: N */
    static /* synthetic */ void m26814N(C7039v4 v4Var, int i) {
        v4Var.zzg |= 2;
        v4Var.zzR = i;
    }

    /* renamed from: N0 */
    static /* synthetic */ void m26815N0(C7039v4 v4Var, long j) {
        v4Var.zzf |= 8;
        v4Var.zzm = j;
    }

    /* renamed from: O */
    static /* synthetic */ void m26816O(C7039v4 v4Var, int i, C6863k4 k4Var) {
        k4Var.getClass();
        v4Var.m26842c1();
        v4Var.zzi.set(i, k4Var);
    }

    /* renamed from: O0 */
    static /* synthetic */ void m26817O0(C7039v4 v4Var, long j) {
        v4Var.zzf |= 16;
        v4Var.zzn = j;
    }

    /* renamed from: P */
    static /* synthetic */ void m26818P(C7039v4 v4Var, String str) {
        str.getClass();
        v4Var.zzg |= 4;
        v4Var.zzS = str;
    }

    /* renamed from: P0 */
    static /* synthetic */ void m26819P0(C7039v4 v4Var) {
        v4Var.zzf &= -17;
        v4Var.zzn = 0;
    }

    /* renamed from: Q */
    static /* synthetic */ void m26820Q(C7039v4 v4Var, C7087y4 y4Var) {
        y4Var.getClass();
        v4Var.zzT = y4Var;
        v4Var.zzg |= 8;
    }

    /* renamed from: Q0 */
    static /* synthetic */ void m26821Q0(C7039v4 v4Var, long j) {
        v4Var.zzf |= 32;
        v4Var.zzo = j;
    }

    /* renamed from: R */
    static /* synthetic */ void m26822R(C7039v4 v4Var, Iterable iterable) {
        C6770e9 e9Var = v4Var.zzU;
        if (!e9Var.mo19801a()) {
            int size = e9Var.size();
            v4Var.zzU = e9Var.mo19580w(size == 0 ? 10 : size + size);
        }
        C6834i7.m25867b(iterable, v4Var.zzU);
    }

    /* renamed from: R0 */
    static /* synthetic */ void m26823R0(C7039v4 v4Var) {
        v4Var.zzf &= -33;
        v4Var.zzo = 0;
    }

    /* renamed from: S */
    static /* synthetic */ void m26824S(C7039v4 v4Var, C6863k4 k4Var) {
        k4Var.getClass();
        v4Var.m26842c1();
        v4Var.zzi.add(k4Var);
    }

    /* renamed from: S0 */
    static /* synthetic */ void m26825S0(C7039v4 v4Var, String str) {
        v4Var.zzf |= 64;
        v4Var.zzp = "android";
    }

    /* renamed from: T */
    static /* synthetic */ void m26826T(C7039v4 v4Var, long j) {
        v4Var.zzg |= 16;
        v4Var.zzV = j;
    }

    /* renamed from: T0 */
    static /* synthetic */ void m26827T0(C7039v4 v4Var, String str) {
        str.getClass();
        v4Var.zzf |= 128;
        v4Var.zzq = str;
    }

    /* renamed from: U */
    static /* synthetic */ void m26828U(C7039v4 v4Var, long j) {
        v4Var.zzg |= 32;
        v4Var.zzW = j;
    }

    /* renamed from: U0 */
    static /* synthetic */ void m26829U0(C7039v4 v4Var) {
        v4Var.zzf &= -129;
        v4Var.zzq = zze.zzq;
    }

    /* renamed from: V */
    static /* synthetic */ void m26830V(C7039v4 v4Var, String str) {
        v4Var.zzg |= 128;
        v4Var.zzY = str;
    }

    /* renamed from: V0 */
    static /* synthetic */ void m26831V0(C7039v4 v4Var, String str) {
        str.getClass();
        v4Var.zzf |= 256;
        v4Var.zzr = str;
    }

    /* renamed from: W0 */
    static /* synthetic */ void m26832W0(C7039v4 v4Var) {
        v4Var.zzf &= -257;
        v4Var.zzr = zze.zzr;
    }

    /* renamed from: X */
    static /* synthetic */ void m26833X(C7039v4 v4Var, Iterable iterable) {
        v4Var.m26842c1();
        C6834i7.m25867b(iterable, v4Var.zzi);
    }

    /* renamed from: X0 */
    static /* synthetic */ void m26834X0(C7039v4 v4Var, String str) {
        str.getClass();
        v4Var.zzf |= 512;
        v4Var.zzs = str;
    }

    /* renamed from: Y0 */
    static /* synthetic */ void m26835Y0(C7039v4 v4Var, int i) {
        v4Var.zzf |= 1024;
        v4Var.zzt = i;
    }

    /* renamed from: Z */
    static /* synthetic */ void m26836Z(C7039v4 v4Var, String str) {
        str.getClass();
        v4Var.zzf |= 8192;
        v4Var.zzw = str;
    }

    /* renamed from: Z0 */
    static /* synthetic */ void m26837Z0(C7039v4 v4Var, String str) {
        str.getClass();
        v4Var.zzf |= 2048;
        v4Var.zzu = str;
    }

    /* renamed from: a0 */
    static /* synthetic */ void m26838a0(C7039v4 v4Var, long j) {
        v4Var.zzf |= Http2.INITIAL_MAX_FRAME_SIZE;
        v4Var.zzx = j;
    }

    /* renamed from: a1 */
    static /* synthetic */ void m26839a1(C7039v4 v4Var, String str) {
        str.getClass();
        v4Var.zzf |= 4096;
        v4Var.zzv = str;
    }

    /* renamed from: b0 */
    static /* synthetic */ void m26840b0(C7039v4 v4Var, long j) {
        v4Var.zzf |= 32768;
        v4Var.zzy = 68000;
    }

    /* renamed from: c0 */
    static /* synthetic */ void m26841c0(C7039v4 v4Var, String str) {
        str.getClass();
        v4Var.zzf |= 65536;
        v4Var.zzz = str;
    }

    /* renamed from: c1 */
    private final void m26842c1() {
        C6804g9 g9Var = this.zzi;
        if (!g9Var.mo19801a()) {
            this.zzi = C6702a9.m25415p(g9Var);
        }
    }

    /* renamed from: d0 */
    static /* synthetic */ void m26843d0(C7039v4 v4Var) {
        v4Var.zzf &= -65537;
        v4Var.zzz = zze.zzz;
    }

    /* renamed from: d1 */
    private final void m26844d1() {
        C6804g9 g9Var = this.zzj;
        if (!g9Var.mo19801a()) {
            this.zzj = C6702a9.m25415p(g9Var);
        }
    }

    /* renamed from: f0 */
    static /* synthetic */ void m26845f0(C7039v4 v4Var, boolean z) {
        v4Var.zzf |= 131072;
        v4Var.zzA = z;
    }

    /* renamed from: g0 */
    static /* synthetic */ void m26846g0(C7039v4 v4Var) {
        v4Var.zzf &= -131073;
        v4Var.zzA = false;
    }

    /* renamed from: h0 */
    static /* synthetic */ void m26847h0(C7039v4 v4Var, String str) {
        str.getClass();
        v4Var.zzf |= 262144;
        v4Var.zzB = str;
    }

    /* renamed from: j0 */
    static /* synthetic */ void m26848j0(C7039v4 v4Var) {
        v4Var.zzf &= -262145;
        v4Var.zzB = zze.zzB;
    }

    /* renamed from: k0 */
    static /* synthetic */ void m26849k0(C7039v4 v4Var, long j) {
        v4Var.zzf |= 524288;
        v4Var.zzC = j;
    }

    /* renamed from: l0 */
    static /* synthetic */ void m26850l0(C7039v4 v4Var, int i) {
        v4Var.zzf |= 1048576;
        v4Var.zzD = i;
    }

    /* renamed from: m0 */
    static /* synthetic */ void m26851m0(C7039v4 v4Var, String str) {
        v4Var.zzf |= 2097152;
        v4Var.zzE = str;
    }

    /* renamed from: n0 */
    static /* synthetic */ void m26852n0(C7039v4 v4Var) {
        v4Var.zzf &= -2097153;
        v4Var.zzE = zze.zzE;
    }

    /* renamed from: o0 */
    static /* synthetic */ void m26853o0(C7039v4 v4Var, String str) {
        str.getClass();
        v4Var.zzf |= 4194304;
        v4Var.zzF = str;
    }

    /* renamed from: p0 */
    static /* synthetic */ void m26854p0(C7039v4 v4Var, boolean z) {
        v4Var.zzf |= 8388608;
        v4Var.zzG = z;
    }

    /* renamed from: q0 */
    static /* synthetic */ void m26855q0(C7039v4 v4Var, Iterable iterable) {
        C6804g9 g9Var = v4Var.zzH;
        if (!g9Var.mo19801a()) {
            v4Var.zzH = C6702a9.m25415p(g9Var);
        }
        C6834i7.m25867b(iterable, v4Var.zzH);
    }

    /* renamed from: s0 */
    static /* synthetic */ void m26857s0(C7039v4 v4Var, String str) {
        str.getClass();
        v4Var.zzf |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        v4Var.zzI = str;
    }

    /* renamed from: t0 */
    static /* synthetic */ void m26858t0(C7039v4 v4Var, int i) {
        v4Var.zzf |= 33554432;
        v4Var.zzJ = i;
    }

    /* renamed from: u0 */
    static /* synthetic */ void m26859u0(C7039v4 v4Var, int i) {
        v4Var.zzf |= 1;
        v4Var.zzh = 1;
    }

    /* renamed from: v0 */
    static /* synthetic */ void m26860v0(C7039v4 v4Var) {
        v4Var.zzf &= -268435457;
        v4Var.zzM = zze.zzM;
    }

    /* renamed from: w0 */
    static /* synthetic */ void m26861w0(C7039v4 v4Var, long j) {
        v4Var.zzf |= 536870912;
        v4Var.zzN = j;
    }

    /* renamed from: A */
    public final String mo20320A() {
        return this.zzP;
    }

    /* renamed from: A0 */
    public final boolean mo20321A0() {
        return (this.zzf & 1048576) != 0;
    }

    /* renamed from: A1 */
    public final long mo20322A1() {
        return this.zzN;
    }

    /* renamed from: B */
    public final String mo20323B() {
        return this.zzI;
    }

    /* renamed from: B1 */
    public final long mo20324B1() {
        return this.zzC;
    }

    /* renamed from: C */
    public final String mo20325C() {
        return this.zzF;
    }

    /* renamed from: C1 */
    public final long mo20326C1() {
        return this.zzV;
    }

    /* renamed from: D */
    public final String mo20327D() {
        return this.zzE;
    }

    /* renamed from: D1 */
    public final long mo20328D1() {
        return this.zzm;
    }

    /* renamed from: E */
    public final String mo20329E() {
        return this.zzq;
    }

    /* renamed from: E1 */
    public final long mo20330E1() {
        return this.zzx;
    }

    /* renamed from: F */
    public final String mo20331F() {
        return this.zzp;
    }

    /* renamed from: F1 */
    public final long mo20332F1() {
        return this.zzo;
    }

    /* renamed from: G */
    public final String mo20333G() {
        return this.zzz;
    }

    /* renamed from: G1 */
    public final long mo20334G1() {
        return this.zzn;
    }

    /* renamed from: H */
    public final String mo20335H() {
        return this.zzae;
    }

    /* renamed from: H1 */
    public final long mo20336H1() {
        return this.zzl;
    }

    /* renamed from: I */
    public final String mo20337I() {
        return this.zzs;
    }

    /* renamed from: I1 */
    public final long mo20338I1() {
        return this.zzk;
    }

    /* renamed from: J */
    public final List mo20339J() {
        return this.zzH;
    }

    /* renamed from: J1 */
    public final long mo20340J1() {
        return this.zzy;
    }

    /* renamed from: K */
    public final List mo20341K() {
        return this.zzi;
    }

    /* renamed from: K1 */
    public final C6863k4 mo20342K1(int i) {
        return (C6863k4) this.zzi.get(i);
    }

    /* renamed from: L */
    public final List mo20343L() {
        return this.zzj;
    }

    /* renamed from: N1 */
    public final C6766e5 mo20344N1(int i) {
        return (C6766e5) this.zzj.get(i);
    }

    /* renamed from: O1 */
    public final String mo20345O1() {
        return this.zzS;
    }

    /* renamed from: P1 */
    public final String mo20346P1() {
        return this.zzv;
    }

    /* renamed from: Q1 */
    public final String mo20347Q1() {
        return this.zzB;
    }

    /* renamed from: R1 */
    public final String mo20348R1() {
        return this.zzu;
    }

    /* renamed from: Y */
    public final int mo20349Y() {
        return this.zzJ;
    }

    /* renamed from: b1 */
    public final int mo20350b1() {
        return this.zzD;
    }

    /* renamed from: e1 */
    public final boolean mo20351e1() {
        return (this.zzf & 536870912) != 0;
    }

    /* renamed from: f1 */
    public final boolean mo20352f1() {
        return (this.zzg & 128) != 0;
    }

    /* renamed from: g1 */
    public final boolean mo20353g1() {
        return (this.zzf & 524288) != 0;
    }

    /* renamed from: h1 */
    public final boolean mo20354h1() {
        return (this.zzg & 16) != 0;
    }

    /* renamed from: i1 */
    public final boolean mo20355i1() {
        return (this.zzf & 8) != 0;
    }

    /* renamed from: j1 */
    public final boolean mo20356j1() {
        return (this.zzf & Http2.INITIAL_MAX_FRAME_SIZE) != 0;
    }

    /* renamed from: k1 */
    public final boolean mo20357k1() {
        return (this.zzf & 131072) != 0;
    }

    /* renamed from: l1 */
    public final boolean mo20358l1() {
        return (this.zzf & 32) != 0;
    }

    /* renamed from: m1 */
    public final boolean mo20359m1() {
        return (this.zzf & 16) != 0;
    }

    /* renamed from: n1 */
    public final boolean mo20360n1() {
        return (this.zzf & 1) != 0;
    }

    /* renamed from: o1 */
    public final boolean mo20361o1() {
        return (this.zzg & 2) != 0;
    }

    /* renamed from: p1 */
    public final boolean mo20362p1() {
        return (this.zzf & 8388608) != 0;
    }

    /* renamed from: q1 */
    public final boolean mo20363q1() {
        return (this.zzg & 8192) != 0;
    }

    /* renamed from: r1 */
    public final boolean mo20364r1() {
        return (this.zzf & 4) != 0;
    }

    /* renamed from: s1 */
    public final boolean mo20365s1() {
        return (this.zzf & 1024) != 0;
    }

    /* renamed from: t1 */
    public final boolean mo20366t1() {
        return (this.zzf & 2) != 0;
    }

    /* renamed from: u1 */
    public final boolean mo20367u1() {
        return (this.zzf & 32768) != 0;
    }

    /* renamed from: v1 */
    public final int mo20368v1() {
        return this.zzi.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo19497w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6702a9.m25417r(zze, "\u00014\u0000\u0002\u0001A4\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.", new Object[]{"zzf", "zzg", "zzh", "zzi", C6863k4.class, "zzj", C6766e5.class, "zzk", "zzl", "zzm", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzn", "zzG", "zzH", C6799g4.class, "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", "zzZ", C6731c4.f18419a, "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag"});
        } else if (i2 == 3) {
            return new C7039v4();
        } else {
            if (i2 == 4) {
                return new C7023u4((C6714b4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zze;
        }
    }

    /* renamed from: w1 */
    public final int mo20369w1() {
        return this.zzh;
    }

    /* renamed from: x */
    public final String mo20370x() {
        return this.zzw;
    }

    /* renamed from: x0 */
    public final boolean mo20371x0() {
        return this.zzA;
    }

    /* renamed from: x1 */
    public final int mo20372x1() {
        return this.zzR;
    }

    /* renamed from: y */
    public final String mo20373y() {
        return this.zzY;
    }

    /* renamed from: y0 */
    public final boolean mo20374y0() {
        return this.zzG;
    }

    /* renamed from: y1 */
    public final int mo20375y1() {
        return this.zzt;
    }

    /* renamed from: z */
    public final String mo20376z() {
        return this.zzr;
    }

    /* renamed from: z0 */
    public final boolean mo20377z0() {
        return (this.zzf & 33554432) != 0;
    }

    /* renamed from: z1 */
    public final int mo20378z1() {
        return this.zzj.size();
    }
}
