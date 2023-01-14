package p174e.p247e.p294k.p301e;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import p174e.p247e.p253d.p257d.C6058j;
import p174e.p247e.p294k.p305i.C6357c;
import p174e.p247e.p294k.p314r.C6407a;

/* renamed from: e.e.k.e.b */
public class C6313b {

    /* renamed from: a */
    private static final C6313b f17441a = m23911b().mo18674a();

    /* renamed from: b */
    public final int f17442b;

    /* renamed from: c */
    public final int f17443c;

    /* renamed from: d */
    public final boolean f17444d;

    /* renamed from: e */
    public final boolean f17445e;

    /* renamed from: f */
    public final boolean f17446f;

    /* renamed from: g */
    public final boolean f17447g;

    /* renamed from: h */
    public final Bitmap.Config f17448h;

    /* renamed from: i */
    public final Bitmap.Config f17449i;

    /* renamed from: j */
    public final C6357c f17450j;

    /* renamed from: k */
    public final C6407a f17451k;

    /* renamed from: l */
    public final ColorSpace f17452l;

    /* renamed from: m */
    private final boolean f17453m;

    public C6313b(C6314c cVar) {
        this.f17442b = cVar.mo18685l();
        this.f17443c = cVar.mo18684k();
        this.f17444d = cVar.mo18681h();
        this.f17445e = cVar.mo18686m();
        this.f17446f = cVar.mo18680g();
        this.f17447g = cVar.mo18683j();
        this.f17448h = cVar.mo18676c();
        this.f17449i = cVar.mo18675b();
        this.f17450j = cVar.mo18679f();
        this.f17451k = cVar.mo18677d();
        this.f17452l = cVar.mo18678e();
        this.f17453m = cVar.mo18682i();
    }

    /* renamed from: a */
    public static C6313b m23910a() {
        return f17441a;
    }

    /* renamed from: b */
    public static C6314c m23911b() {
        return new C6314c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C6058j.C6060b mo18670c() {
        return C6058j.m22827c(this).mo18043a("minDecodeIntervalMs", this.f17442b).mo18043a("maxDimensionPx", this.f17443c).mo18045c("decodePreviewFrame", this.f17444d).mo18045c("useLastFrameForPreview", this.f17445e).mo18045c("decodeAllFrames", this.f17446f).mo18045c("forceStaticImage", this.f17447g).mo18044b("bitmapConfigName", this.f17448h.name()).mo18044b("animatedBitmapConfigName", this.f17449i.name()).mo18044b("customImageDecoder", this.f17450j).mo18044b("bitmapTransformation", this.f17451k).mo18044b("colorSpace", this.f17452l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6313b.class != obj.getClass()) {
            return false;
        }
        C6313b bVar = (C6313b) obj;
        if (this.f17442b != bVar.f17442b || this.f17443c != bVar.f17443c || this.f17444d != bVar.f17444d || this.f17445e != bVar.f17445e || this.f17446f != bVar.f17446f || this.f17447g != bVar.f17447g) {
            return false;
        }
        boolean z = this.f17453m;
        if (z || this.f17448h == bVar.f17448h) {
            return (z || this.f17449i == bVar.f17449i) && this.f17450j == bVar.f17450j && this.f17451k == bVar.f17451k && this.f17452l == bVar.f17452l;
        }
        return false;
    }

    public int hashCode() {
        int i = (((((((((this.f17442b * 31) + this.f17443c) * 31) + (this.f17444d ? 1 : 0)) * 31) + (this.f17445e ? 1 : 0)) * 31) + (this.f17446f ? 1 : 0)) * 31) + (this.f17447g ? 1 : 0);
        if (!this.f17453m) {
            i = (i * 31) + this.f17448h.ordinal();
        }
        int i2 = 0;
        if (!this.f17453m) {
            int i3 = i * 31;
            Bitmap.Config config = this.f17449i;
            i = i3 + (config != null ? config.ordinal() : 0);
        }
        int i4 = i * 31;
        C6357c cVar = this.f17450j;
        int hashCode = (i4 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        C6407a aVar = this.f17451k;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        ColorSpace colorSpace = this.f17452l;
        if (colorSpace != null) {
            i2 = colorSpace.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return "ImageDecodeOptions{" + mo18670c().toString() + "}";
    }
}
