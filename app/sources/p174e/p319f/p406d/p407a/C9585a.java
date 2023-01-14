package p174e.p319f.p406d.p407a;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C3705r;

/* renamed from: e.f.d.a.a */
public class C9585a extends Exception {

    /* renamed from: f */
    private final int f25664f;

    public C9585a(@RecentlyNonNull String str, int i) {
        super(C3705r.m14343h(str, "Provided message must not be empty."));
        this.f25664f = i;
    }

    public C9585a(@RecentlyNonNull String str, int i, Throwable th) {
        super(C3705r.m14343h(str, "Provided message must not be empty."), th);
        this.f25664f = i;
    }

    /* renamed from: a */
    public int mo24081a() {
        return this.f25664f;
    }
}
