package p497j.p502b.p504b;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import org.reactnative.camera.p515h.C10988a;
import p174e.p319f.p406d.p411b.p413b.C9631a;

/* renamed from: j.b.b.b */
public class C10679b {
    /* renamed from: a */
    public static C10678a m36350a(Bitmap bitmap) {
        return new C10678a(C9631a.m32746a(bitmap, 0), new C10988a(bitmap.getWidth(), bitmap.getHeight()));
    }

    /* renamed from: b */
    public static C10678a m36351b(byte[] bArr, int i, int i2, int i3) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        return new C10678a(C9631a.m32747b(wrap, i, i2, i3, 17), new C10988a(i, i2, i3));
    }
}
