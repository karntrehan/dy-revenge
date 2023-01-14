package p174e.p319f.p320a.p335c.p345f.p357l;

import java.io.IOException;
import p174e.p319f.p320a.p335c.p345f.p357l.C8309kb;
import p174e.p319f.p320a.p335c.p345f.p357l.C8346mb;

/* renamed from: e.f.a.c.f.l.mb */
public abstract class C8346mb<MessageType extends C8346mb<MessageType, BuilderType>, BuilderType extends C8309kb<MessageType, BuilderType>> implements C8274ie {
    protected int zza = 0;

    /* renamed from: b */
    public final byte[] mo22003b() {
        try {
            byte[] bArr = new byte[mo21771u()];
            C8310kc f = C8310kc.m28676f(bArr);
            mo21760c(f);
            f.mo21926g();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo21761d() {
        throw null;
    }

    /* renamed from: e */
    public final C8177dc mo21878e() {
        try {
            int u = mo21771u();
            C8177dc dcVar = C8177dc.f22199f;
            byte[] bArr = new byte[u];
            C8310kc f = C8310kc.m28676f(bArr);
            mo21760c(f);
            f.mo21926g();
            return new C8139bc(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo21763f(int i) {
        throw null;
    }
}
