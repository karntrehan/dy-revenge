package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import p174e.p319f.p320a.p382e.p383a.p385b.C9101a;

/* renamed from: com.google.android.play.core.assetpacks.n1 */
final class C4409n1 {

    /* renamed from: a */
    private static final C9101a f12588a = new C9101a("MergeSliceTaskHandler");

    /* renamed from: b */
    private final C4439v f12589b;

    C4409n1(C4439v vVar) {
        this.f12589b = vVar;
    }

    /* renamed from: b */
    private static void m16890b(File file, File file2) {
        if (file.isDirectory()) {
            file2.mkdirs();
            for (File file3 : file.listFiles()) {
                m16890b(file3, new File(file2, file3.getName()));
            }
            if (!file.delete()) {
                String valueOf = String.valueOf(file);
                StringBuilder sb = new StringBuilder(valueOf.length() + 28);
                sb.append("Unable to delete directory: ");
                sb.append(valueOf);
                throw new C4396k0(sb.toString());
            }
        } else if (file2.exists()) {
            String valueOf2 = String.valueOf(file2);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 51);
            sb2.append("File clashing with existing file from other slice: ");
            sb2.append(valueOf2);
            throw new C4396k0(sb2.toString());
        } else if (!file.renameTo(file2)) {
            String valueOf3 = String.valueOf(file);
            StringBuilder sb3 = new StringBuilder(valueOf3.length() + 21);
            sb3.append("Unable to move file: ");
            sb3.append(valueOf3);
            throw new C4396k0(sb3.toString());
        }
    }

    /* renamed from: a */
    public final void mo13900a(C4405m1 m1Var) {
        File w = this.f12589b.mo13942w(m1Var.f12403b, m1Var.f12572c, m1Var.f12573d, m1Var.f12574e);
        if (w.exists()) {
            File x = this.f12589b.mo13943x(m1Var.f12403b, m1Var.f12572c, m1Var.f12573d);
            if (!x.exists()) {
                x.mkdirs();
            }
            m16890b(w, x);
            try {
                this.f12589b.mo13945z(m1Var.f12403b, m1Var.f12572c, m1Var.f12573d, this.f12589b.mo13944y(m1Var.f12403b, m1Var.f12572c, m1Var.f12573d) + 1);
            } catch (IOException e) {
                f12588a.mo23081b("Writing merge checkpoint failed with %s.", e.getMessage());
                throw new C4396k0("Writing merge checkpoint failed.", e, m1Var.f12402a);
            }
        } else {
            throw new C4396k0(String.format("Cannot find verified files for slice %s.", new Object[]{m1Var.f12574e}), m1Var.f12402a);
        }
    }
}
