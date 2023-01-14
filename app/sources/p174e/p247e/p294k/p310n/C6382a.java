package p174e.p247e.p294k.p310n;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import java.util.Locale;
import p174e.p247e.p249b.p250a.C5999d;
import p174e.p247e.p249b.p250a.C6004i;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p294k.p311o.C6383a;

/* renamed from: e.e.k.n.a */
public class C6382a extends C6383a {

    /* renamed from: c */
    private final int f17780c;

    /* renamed from: d */
    private final int f17781d;

    /* renamed from: e */
    private C5999d f17782e;

    public C6382a(int i, int i2) {
        boolean z = true;
        C6062k.m22834b(Boolean.valueOf(i > 0));
        C6062k.m22834b(Boolean.valueOf(i2 <= 0 ? false : z));
        this.f17780c = i;
        this.f17781d = i2;
    }

    /* renamed from: c */
    public C5999d mo9953c() {
        if (this.f17782e == null) {
            this.f17782e = new C6004i(String.format((Locale) null, "i%dr%d", new Object[]{Integer.valueOf(this.f17780c), Integer.valueOf(this.f17781d)}));
        }
        return this.f17782e;
    }

    /* renamed from: e */
    public void mo18919e(Bitmap bitmap) {
        NativeBlurFilter.m10139a(bitmap, this.f17780c, this.f17781d);
    }
}
