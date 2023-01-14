package com.google.android.play.core.assetpacks;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p174e.p319f.p320a.p382e.p383a.p385b.C9106c0;
import p174e.p319f.p320a.p382e.p383a.p385b.C9127n;

/* renamed from: com.google.android.play.core.assetpacks.r2 */
public final class C4426r2 implements C9106c0<Executor> {

    /* renamed from: a */
    private final /* synthetic */ int f12626a = 0;

    public C4426r2() {
    }

    public C4426r2(byte[] bArr) {
    }

    public C4426r2(char[] cArr) {
    }

    public C4426r2(short[] sArr) {
    }

    /* renamed from: b */
    public static Executor m16931b() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(C4394j2.f12534a);
        C9127n.m30388d(newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    /* renamed from: c */
    public static Executor m16932c() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(C4394j2.f12535b);
        C9127n.m30388d(newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    /* renamed from: d */
    public static C4372e0 m16933d() {
        return new C4372e0();
    }

    /* renamed from: e */
    public static C4412o0 m16934e() {
        return new C4412o0();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo13826a() {
        int i = this.f12626a;
        return i != 0 ? i != 1 ? i != 2 ? m16934e() : m16933d() : m16932c() : m16931b();
    }
}
