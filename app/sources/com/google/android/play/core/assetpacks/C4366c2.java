package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import p174e.p319f.p320a.p382e.p383a.p385b.C9101a;

/* renamed from: com.google.android.play.core.assetpacks.c2 */
final class C4366c2 {

    /* renamed from: a */
    private static final C9101a f12404a = new C9101a("VerifySliceTaskHandler");

    /* renamed from: b */
    private final C4439v f12405b;

    C4366c2(C4439v vVar) {
        this.f12405b = vVar;
    }

    /* renamed from: b */
    private final void m16793b(C4362b2 b2Var, File file) {
        try {
            File C = this.f12405b.mo13923C(b2Var.f12403b, b2Var.f12397c, b2Var.f12398d, b2Var.f12399e);
            if (C.exists()) {
                try {
                    if (C4393j1.m16865a(C4358a2.m16776a(file, C)).equals(b2Var.f12400f)) {
                        f12404a.mo23083d("Verification of slice %s of pack %s successful.", b2Var.f12399e, b2Var.f12403b);
                        return;
                    }
                    throw new C4396k0(String.format("Verification failed for slice %s.", new Object[]{b2Var.f12399e}), b2Var.f12402a);
                } catch (NoSuchAlgorithmException e) {
                    throw new C4396k0("SHA256 algorithm not supported.", e, b2Var.f12402a);
                } catch (IOException e2) {
                    throw new C4396k0(String.format("Could not digest file during verification for slice %s.", new Object[]{b2Var.f12399e}), e2, b2Var.f12402a);
                }
            } else {
                throw new C4396k0(String.format("Cannot find metadata files for slice %s.", new Object[]{b2Var.f12399e}), b2Var.f12402a);
            }
        } catch (IOException e3) {
            throw new C4396k0(String.format("Could not reconstruct slice archive during verification for slice %s.", new Object[]{b2Var.f12399e}), e3, b2Var.f12402a);
        }
    }

    /* renamed from: a */
    public final void mo13828a(C4362b2 b2Var) {
        File v = this.f12405b.mo13941v(b2Var.f12403b, b2Var.f12397c, b2Var.f12398d, b2Var.f12399e);
        if (v.exists()) {
            m16793b(b2Var, v);
            File w = this.f12405b.mo13942w(b2Var.f12403b, b2Var.f12397c, b2Var.f12398d, b2Var.f12399e);
            if (!w.exists()) {
                w.mkdirs();
            }
            if (!v.renameTo(w)) {
                throw new C4396k0(String.format("Failed to move slice %s after verification.", new Object[]{b2Var.f12399e}), b2Var.f12402a);
            }
            return;
        }
        throw new C4396k0(String.format("Cannot find unverified files for slice %s.", new Object[]{b2Var.f12399e}), b2Var.f12402a);
    }
}
