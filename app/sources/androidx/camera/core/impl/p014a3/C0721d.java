package androidx.camera.core.impl.p014a3;

import android.util.Size;
import java.util.Comparator;

/* renamed from: androidx.camera.core.impl.a3.d */
public final class C0721d implements Comparator<Size> {

    /* renamed from: f */
    private boolean f2228f;

    public C0721d() {
        this(false);
    }

    public C0721d(boolean z) {
        this.f2228f = false;
        this.f2228f = z;
    }

    /* renamed from: a */
    public int compare(Size size, Size size2) {
        int signum = Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
        return this.f2228f ? signum * -1 : signum;
    }
}
