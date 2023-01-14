package androidx.camera.camera2.p003e;

import android.util.Size;
import java.util.Comparator;

/* renamed from: androidx.camera.camera2.e.x0 */
public final /* synthetic */ class C0568x0 implements Comparator {

    /* renamed from: f */
    public static final /* synthetic */ C0568x0 f1873f = new C0568x0();

    private /* synthetic */ C0568x0() {
    }

    public final int compare(Object obj, Object obj2) {
        return Long.signum((((long) ((Size) obj).getWidth()) * ((long) ((Size) obj).getHeight())) - (((long) ((Size) obj2).getWidth()) * ((long) ((Size) obj2).getHeight())));
    }
}
