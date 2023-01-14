package p174e.p247e.p294k.p299c;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.facebook.imagepipeline.memory.C2405e;
import com.facebook.imageutils.C2567a;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p294k.p302f.C6319a;

@TargetApi(21)
/* renamed from: e.e.k.c.a */
public class C6265a extends C6270f {

    /* renamed from: a */
    private final C2405e f17351a;

    /* renamed from: b */
    private final C6319a f17352b;

    public C6265a(C2405e eVar, C6319a aVar) {
        this.f17351a = eVar;
        this.f17352b = aVar;
    }

    /* renamed from: d */
    public C6088a<Bitmap> mo18581d(int i, int i2, Bitmap.Config config) {
        Bitmap bitmap = (Bitmap) this.f17351a.get(C2567a.m10704d(i, i2, config));
        C6062k.m22834b(Boolean.valueOf(bitmap.getAllocationByteCount() >= (i * i2) * C2567a.m10703c(config)));
        bitmap.reconfigure(i, i2, config);
        return this.f17352b.mo18698c(bitmap, this.f17351a);
    }
}
