package androidx.camera.core;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.media.Image;
import java.nio.ByteBuffer;

public interface ImageProxy extends AutoCloseable {

    /* renamed from: androidx.camera.core.ImageProxy$a */
    public interface C0602a {
        /* renamed from: d */
        ByteBuffer mo2544d();

        /* renamed from: e */
        int mo2545e();

        /* renamed from: f */
        int mo2546f();
    }

    /* renamed from: S */
    void mo2536S(Rect rect);

    /* renamed from: U */
    C0927j2 mo2537U();

    /* renamed from: b0 */
    Image mo2538b0();

    /* renamed from: c */
    int mo2539c();

    void close();

    /* renamed from: e */
    int mo2541e();

    @SuppressLint({"ArrayReturn"})
    /* renamed from: m */
    C0602a[] mo2542m();

    /* renamed from: q0 */
    int mo2543q0();
}
