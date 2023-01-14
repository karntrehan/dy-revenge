package p027c.p092r.p093a;

import android.os.Bundle;
import androidx.lifecycle.C1291g;
import androidx.lifecycle.C1312t;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p027c.p092r.p094b.C2077b;

/* renamed from: c.r.a.a */
public abstract class C2068a {

    /* renamed from: c.r.a.a$a */
    public interface C2069a<D> {
        /* renamed from: a */
        void mo6951a(C2077b<D> bVar, D d);

        /* renamed from: b */
        C2077b<D> mo6952b(int i, Bundle bundle);

        /* renamed from: c */
        void mo6953c(C2077b<D> bVar);
    }

    /* renamed from: b */
    public static <T extends C1291g & C1312t> C2068a m8878b(T t) {
        return new C2070b(t, ((C1312t) t).mo129g());
    }

    @Deprecated
    /* renamed from: a */
    public abstract void mo6948a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: c */
    public abstract <D> C2077b<D> mo6949c(int i, Bundle bundle, C2069a<D> aVar);

    /* renamed from: d */
    public abstract void mo6950d();
}
