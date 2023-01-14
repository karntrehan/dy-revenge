package p174e.p319f.p406d.p407a.p408b;

import androidx.annotation.RecentlyNonNull;
import com.google.firebase.p162p.C4927b;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: e.f.d.a.b.c */
public class C9588c {

    /* renamed from: a */
    private final Map<Class<? extends C9587b>, C4927b<?>> f25670a = new HashMap();

    /* renamed from: e.f.d.a.b.c$a */
    public static class C9589a {

        /* renamed from: a */
        private final Class<? extends C9587b> f25671a;

        /* renamed from: b */
        private final C4927b<?> f25672b;

        public <RemoteT extends C9587b> C9589a(@RecentlyNonNull Class<RemoteT> cls, @RecentlyNonNull C4927b<?> bVar) {
            this.f25671a = cls;
            this.f25672b = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C4927b<?> mo24085a() {
            return this.f25672b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final Class<? extends C9587b> mo24086b() {
            return this.f25671a;
        }
    }

    public C9588c(@RecentlyNonNull Set<C9589a> set) {
        for (C9589a next : set) {
            this.f25670a.put(next.mo24086b(), next.mo24085a());
        }
    }
}
