package p174e.p319f.p406d.p407a.p409c;

import androidx.annotation.RecentlyNonNull;
import com.google.firebase.p162p.C4927b;
import java.util.concurrent.Executor;

/* renamed from: e.f.d.a.c.d */
public class C9597d {

    /* renamed from: a */
    private final C4927b<? extends Executor> f25687a;

    public C9597d(@RecentlyNonNull C4927b<? extends Executor> bVar) {
        this.f25687a = bVar;
    }

    @RecentlyNonNull
    /* renamed from: a */
    public Executor mo24091a(Executor executor) {
        return executor != null ? executor : (Executor) this.f25687a.get();
    }
}
