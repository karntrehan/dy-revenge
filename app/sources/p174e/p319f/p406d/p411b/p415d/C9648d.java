package p174e.p319f.p406d.p411b.p415d;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C3697p;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p174e.p319f.p406d.p407a.p409c.C9606i;

/* renamed from: e.f.d.b.d.d */
public class C9648d implements C9650e {
    @RecentlyNonNull

    /* renamed from: a */
    public static final C9648d f25789a = new C9649a().mo24194a();

    /* renamed from: b */
    final AtomicReference<Boolean> f25790b = new AtomicReference<>();

    /* renamed from: c */
    private final Executor f25791c;

    /* renamed from: e.f.d.b.d.d$a */
    public static class C9649a {

        /* renamed from: a */
        private Executor f25792a;

        /* renamed from: a */
        public C9648d mo24194a() {
            return new C9648d(this.f25792a, (C9654i) null);
        }
    }

    /* synthetic */ C9648d(Executor executor, C9654i iVar) {
        this.f25791c = executor;
    }

    @RecentlyNullable
    /* renamed from: a */
    public final Executor mo24186a() {
        return this.f25791c;
    }

    @RecentlyNonNull
    /* renamed from: b */
    public final String mo24187b() {
        return true != mo24189d() ? "play-services-mlkit-text-recognition" : "text-recognition-latin";
    }

    @RecentlyNonNull
    /* renamed from: c */
    public final String mo24188c() {
        return true != mo24189d() ? "com.google.android.gms.vision.text.mlkit.TextRecognizerCreator" : "com.google.mlkit.vision.text.bundled.latin.BundledLatinTextRecognizerCreator";
    }

    /* renamed from: d */
    public final boolean mo24189d() {
        if (this.f25790b.get() != null) {
            return this.f25790b.get().booleanValue();
        }
        boolean z = DynamiteModule.m14548a(C9606i.m32708c().mo24098b(), "com.google.mlkit.dynamite.text.latin") > 0;
        this.f25790b.set(Boolean.valueOf(z));
        return z;
    }

    /* renamed from: e */
    public final int mo24190e() {
        return mo24189d() ? 24317 : 24306;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9648d)) {
            return false;
        }
        return C3697p.m14323b(this.f25791c, ((C9648d) obj).f25791c);
    }

    @RecentlyNonNull
    /* renamed from: f */
    public final String mo24192f() {
        return true != mo24189d() ? "com.google.android.gms.vision.ocr" : "com.google.mlkit.dynamite.text.latin";
    }

    public int hashCode() {
        return C3697p.m14324c(this.f25791c);
    }
}
