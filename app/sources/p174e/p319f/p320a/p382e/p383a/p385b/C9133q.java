package p174e.p319f.p320a.p382e.p383a.p385b;

import java.io.Closeable;
import java.io.InputStream;

/* renamed from: e.f.a.e.a.b.q */
public abstract class C9133q implements Closeable {
    /* renamed from: a */
    public abstract long mo13950a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract InputStream mo13951b(long j, long j2);

    /* renamed from: h */
    public final synchronized InputStream mo23110h() {
        return mo13951b(0, mo13950a());
    }
}
