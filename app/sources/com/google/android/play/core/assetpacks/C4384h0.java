package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.common.C4458d;
import com.google.android.play.core.common.C4460f;
import java.util.concurrent.Executor;
import p174e.p319f.p320a.p382e.p383a.p384a.C9084j;
import p174e.p319f.p320a.p382e.p383a.p385b.C9102a0;
import p174e.p319f.p320a.p382e.p383a.p385b.C9104b0;
import p174e.p319f.p320a.p382e.p383a.p385b.C9106c0;
import p174e.p319f.p320a.p382e.p383a.p388e.C9152a;

/* renamed from: com.google.android.play.core.assetpacks.h0 */
public final class C4384h0 implements C4367d {

    /* renamed from: A */
    private C9106c0<C4360b0> f12456A;

    /* renamed from: a */
    private final C4398k2 f12457a;

    /* renamed from: b */
    private C9106c0<Context> f12458b;

    /* renamed from: c */
    private C9106c0<C4437u1> f12459c;

    /* renamed from: d */
    private C9106c0<C4439v> f12460d;

    /* renamed from: e */
    private C9106c0<C4412o0> f12461e;

    /* renamed from: f */
    private C9106c0<C4411o> f12462f;

    /* renamed from: g */
    private C9106c0<String> f12463g = C9104b0.m30331b(new C4418p2(this.f12458b));

    /* renamed from: h */
    private C9106c0<C4430s2> f12464h = new C9102a0();

    /* renamed from: i */
    private C9106c0<Executor> f12465i;

    /* renamed from: j */
    private C9106c0<C4357a1> f12466j;

    /* renamed from: k */
    private C9106c0<C4427s> f12467k;

    /* renamed from: l */
    private C9106c0<C4392j0> f12468l;

    /* renamed from: m */
    private C9106c0<C4366c2> f12469m;

    /* renamed from: n */
    private C9106c0<C4409n1> f12470n;

    /* renamed from: o */
    private C9106c0<C4458d> f12471o;

    /* renamed from: p */
    private C9106c0<C4429s1> f12472p;

    /* renamed from: q */
    private C9106c0<C4445w1> f12473q;

    /* renamed from: r */
    private C9106c0<C4364c0> f12474r;

    /* renamed from: s */
    private C9106c0<C4369d1> f12475s;

    /* renamed from: t */
    private C9106c0<C4400l0> f12476t;

    /* renamed from: u */
    private C9106c0<C4372e0> f12477u;

    /* renamed from: v */
    private C9106c0<Executor> f12478v;

    /* renamed from: w */
    private C9106c0<C4389i1> f12479w;

    /* renamed from: x */
    private C9106c0<C9152a> f12480x;

    /* renamed from: y */
    private C9106c0<C4386h2> f12481y;

    /* renamed from: z */
    private C9106c0<?> f12482z;

    /* synthetic */ C4384h0(C4398k2 k2Var) {
        this.f12457a = k2Var;
        C4414o2 o2Var = new C4414o2(k2Var);
        this.f12458b = o2Var;
        C9106c0<C4437u1> b = C9104b0.m30331b(new C4413o1((C9106c0<Context>) o2Var, (char[]) null));
        this.f12459c = b;
        this.f12460d = C9104b0.m30331b(new C4410n2(this.f12458b, b, (short[]) null));
        C9106c0<C4412o0> b2 = C9104b0.m30331b(C4416p0.f12606a);
        this.f12461e = b2;
        this.f12462f = C9104b0.m30331b(new C4410n2(this.f12458b, b2, (char[]) null));
        C9106c0<Executor> b3 = C9104b0.m30331b(C4402l2.f12561a);
        this.f12465i = b3;
        this.f12466j = C9104b0.m30331b(new C4361b1(this.f12460d, this.f12464h, this.f12461e, b3));
        C9102a0 a0Var = new C9102a0();
        this.f12467k = a0Var;
        this.f12468l = C9104b0.m30331b(new C4361b1(this.f12460d, this.f12464h, a0Var, this.f12461e, (byte[]) null));
        this.f12469m = C9104b0.m30331b(new C4413o1(this.f12460d, (short[]) null));
        this.f12470n = C9104b0.m30331b(new C4413o1(this.f12460d));
        C9106c0<C4458d> b4 = C9104b0.m30331b(C4460f.m17037b());
        this.f12471o = b4;
        this.f12472p = C9104b0.m30331b(new C4433t1(this.f12460d, this.f12464h, this.f12466j, this.f12465i, this.f12461e, b4));
        this.f12473q = C9104b0.m30331b(new C4410n2(this.f12460d, this.f12464h, (int[]) null));
        C9106c0<C4364c0> b5 = C9104b0.m30331b(new C4413o1(this.f12464h, (byte[]) null));
        this.f12474r = b5;
        C9106c0<C4369d1> b6 = C9104b0.m30331b(new C4373e1(this.f12466j, this.f12460d, b5));
        this.f12475s = b6;
        this.f12476t = C9104b0.m30331b(new C4404m0(this.f12466j, this.f12464h, this.f12468l, this.f12469m, this.f12470n, this.f12472p, this.f12473q, b6));
        this.f12477u = C9104b0.m30331b(C4376f0.f12439a);
        C9106c0<Executor> b7 = C9104b0.m30331b(C4422q2.f12618a);
        this.f12478v = b7;
        C9102a0.m30327b(this.f12467k, C9104b0.m30331b(new C4404m0(this.f12458b, this.f12466j, this.f12476t, this.f12464h, this.f12461e, this.f12477u, this.f12465i, b7, (byte[]) null)));
        C9106c0<C4389i1> b8 = C9104b0.m30331b(new C4433t1(this.f12463g, this.f12467k, this.f12461e, this.f12458b, this.f12459c, this.f12465i, (byte[]) null));
        this.f12479w = b8;
        C9102a0.m30327b(this.f12464h, C9104b0.m30331b(new C4373e1(this.f12458b, this.f12462f, b8, (byte[]) null)));
        C9106c0<C9152a> b9 = C9104b0.m30331b(C9084j.m30273b(this.f12458b));
        this.f12480x = b9;
        C9106c0<C4386h2> b10 = C9104b0.m30331b(new C4390i2(this.f12460d, this.f12464h, this.f12467k, b9, this.f12466j, this.f12461e, this.f12477u, this.f12465i, this.f12471o));
        this.f12481y = b10;
        this.f12482z = C9104b0.m30331b(new C4410n2(b10, this.f12458b));
        this.f12456A = C9104b0.m30331b(new C4410n2(this.f12458b, this.f12460d, (byte[]) null));
    }

    /* renamed from: a */
    public final void mo13829a(ExtractionForegroundService extractionForegroundService) {
        extractionForegroundService.f12374o = C4414o2.m16922c(this.f12457a);
        extractionForegroundService.f12375p = this.f12481y.mo13826a();
    }

    /* renamed from: b */
    public final void mo13830b(AssetPackExtractionService assetPackExtractionService) {
        assetPackExtractionService.f12372f = this.f12456A.mo13826a();
    }
}
