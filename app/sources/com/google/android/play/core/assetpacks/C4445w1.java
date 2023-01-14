package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import p174e.p319f.p320a.p382e.p383a.p385b.C9101a;
import p174e.p319f.p320a.p382e.p383a.p385b.C9127n;
import p174e.p319f.p320a.p382e.p383a.p385b.C9146y;
import p174e.p319f.p320a.p382e.p383a.p385b.C9147z;

/* renamed from: com.google.android.play.core.assetpacks.w1 */
final class C4445w1 {

    /* renamed from: a */
    private static final C9101a f12692a = new C9101a("PatchSliceTaskHandler");

    /* renamed from: b */
    private final C4439v f12693b;

    /* renamed from: c */
    private final C9147z<C4430s2> f12694c;

    C4445w1(C4439v vVar, C9147z<C4430s2> zVar) {
        this.f12693b = vVar;
        this.f12694c = zVar;
    }

    /* renamed from: a */
    public final void mo13949a(C4441v1 v1Var) {
        InputStream inputStream;
        File t = this.f12693b.mo13939t(v1Var.f12403b, v1Var.f12674c, v1Var.f12675d);
        C4439v vVar = this.f12693b;
        String str = v1Var.f12403b;
        int i = v1Var.f12674c;
        long j = v1Var.f12675d;
        File file = new File(vVar.mo13940u(str, i, j), v1Var.f12679h);
        try {
            inputStream = v1Var.f12681j;
            if (v1Var.f12678g == 2) {
                inputStream = new GZIPInputStream(inputStream, 8192);
            }
            C4446x xVar = new C4446x(t, file);
            File v = this.f12693b.mo13941v(v1Var.f12403b, v1Var.f12676e, v1Var.f12677f, v1Var.f12679h);
            if (!v.exists()) {
                v.mkdirs();
            }
            C4451y1 y1Var = new C4451y1(this.f12693b, v1Var.f12403b, v1Var.f12676e, v1Var.f12677f, v1Var.f12679h);
            C9127n.m30389e(xVar, inputStream, new C4408n0(v, y1Var), v1Var.f12680i);
            y1Var.mo13967d(0);
            inputStream.close();
            f12692a.mo23083d("Patching and extraction finished for slice %s of pack %s.", v1Var.f12679h, v1Var.f12403b);
            this.f12694c.mo13826a().mo13865c(v1Var.f12402a, v1Var.f12403b, v1Var.f12679h, 0);
            try {
                v1Var.f12681j.close();
                return;
            } catch (IOException unused) {
                f12692a.mo23084e("Could not close file for slice %s of pack %s.", v1Var.f12679h, v1Var.f12403b);
                return;
            }
        } catch (IOException e) {
            f12692a.mo23081b("IOException during patching %s.", e.getMessage());
            throw new C4396k0(String.format("Error patching slice %s of pack %s.", new Object[]{v1Var.f12679h, v1Var.f12403b}), e, v1Var.f12402a);
        } catch (Throwable th) {
            C9146y.m30436a(th, th);
        }
        throw th;
    }
}
