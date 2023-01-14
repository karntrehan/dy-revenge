package p174e.p319f.p416e.p428v.p429r.p430g.p431e;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.face.ModuleDescriptor;
import p174e.p319f.p416e.p420s.C9679a;

/* renamed from: e.f.e.v.r.g.e.b */
final class C9744b extends C9748f {
    C9744b(C9679a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo24394h(StringBuilder sb, int i) {
        sb.append(i < 10000 ? "(3202)" : "(3203)");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo24395i(int i) {
        return i < 10000 ? i : i - ModuleDescriptor.MODULE_VERSION;
    }
}
