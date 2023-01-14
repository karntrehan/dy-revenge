package p174e.p247e.p294k.p305i;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.Collections;
import java.util.List;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p294k.p307k.C6373h;
import p174e.p247e.p294k.p307k.C6374i;

/* renamed from: e.e.k.i.g */
public class C6361g implements C6359e {

    /* renamed from: a */
    private final C6364c f17746a;

    /* renamed from: e.e.k.i.g$b */
    private static class C6363b implements C6364c {
        private C6363b() {
        }

        /* renamed from: a */
        public List<Integer> mo18866a() {
            return Collections.EMPTY_LIST;
        }

        /* renamed from: b */
        public int mo18867b() {
            return 0;
        }
    }

    /* renamed from: e.e.k.i.g$c */
    public interface C6364c {
        /* renamed from: a */
        List<Integer> mo18866a();

        /* renamed from: b */
        int mo18867b();
    }

    public C6361g() {
        this(new C6363b());
    }

    public C6361g(C6364c cVar) {
        this.f17746a = (C6364c) C6062k.m22839g(cVar);
    }

    /* renamed from: a */
    public C6374i mo18860a(int i) {
        return C6373h.m24342d(i, i >= this.f17746a.mo18867b(), false);
    }

    /* renamed from: b */
    public int mo18861b(int i) {
        List<Integer> a = this.f17746a.mo18866a();
        if (a == null || a.isEmpty()) {
            return i + 1;
        }
        for (int i2 = 0; i2 < a.size(); i2++) {
            if (a.get(i2).intValue() > i) {
                return a.get(i2).intValue();
            }
        }
        return RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
    }
}
