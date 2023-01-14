package p174e.p319f.p320a.p363d.p379x;

import android.graphics.Typeface;

/* renamed from: e.f.a.d.x.a */
public final class C9059a extends C9067f {

    /* renamed from: a */
    private final Typeface f24878a;

    /* renamed from: b */
    private final C9060a f24879b;

    /* renamed from: c */
    private boolean f24880c;

    /* renamed from: e.f.a.d.x.a$a */
    public interface C9060a {
        /* renamed from: a */
        void mo13484a(Typeface typeface);
    }

    public C9059a(C9060a aVar, Typeface typeface) {
        this.f24878a = typeface;
        this.f24879b = aVar;
    }

    /* renamed from: d */
    private void m30188d(Typeface typeface) {
        if (!this.f24880c) {
            this.f24879b.mo13484a(typeface);
        }
    }

    /* renamed from: a */
    public void mo12978a(int i) {
        m30188d(this.f24878a);
    }

    /* renamed from: b */
    public void mo12979b(Typeface typeface, boolean z) {
        m30188d(typeface);
    }

    /* renamed from: c */
    public void mo23011c() {
        this.f24880c = true;
    }
}
