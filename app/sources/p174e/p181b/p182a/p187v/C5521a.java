package p174e.p181b.p182a.p187v;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import p174e.p181b.p182a.C5416a;
import p174e.p181b.p182a.p188w.C5532i;
import p174e.p181b.p182a.p195z.C5643d;

/* renamed from: e.b.a.v.a */
public class C5521a {

    /* renamed from: a */
    private final C5532i<String> f15576a = new C5532i<>();

    /* renamed from: b */
    private final Map<C5532i<String>, Typeface> f15577b = new HashMap();

    /* renamed from: c */
    private final Map<String, Typeface> f15578c = new HashMap();

    /* renamed from: d */
    private final AssetManager f15579d;

    /* renamed from: e */
    private C5416a f15580e;

    /* renamed from: f */
    private String f15581f = ".ttf";

    public C5521a(Drawable.Callback callback, C5416a aVar) {
        AssetManager assets;
        if (!(callback instanceof View)) {
            C5643d.m21027c("LottieDrawable must be inside of a view for images to work.");
            assets = null;
        } else {
            assets = ((View) callback).getContext().getAssets();
        }
        this.f15579d = assets;
    }

    /* renamed from: a */
    private Typeface m20569a(String str) {
        Typeface typeface = this.f15578c.get(str);
        if (typeface != null) {
            return typeface;
        }
        C5416a aVar = this.f15580e;
        if (aVar != null) {
            throw null;
        } else if (aVar != null) {
            throw null;
        } else {
            Typeface createFromAsset = Typeface.createFromAsset(this.f15579d, "fonts/" + str + this.f15581f);
            this.f15578c.put(str, createFromAsset);
            return createFromAsset;
        }
    }

    /* renamed from: d */
    private Typeface m20570d(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i = (!contains || !contains2) ? contains ? 2 : contains2 ? 1 : 0 : 3;
        return typeface.getStyle() == i ? typeface : Typeface.create(typeface, i);
    }

    /* renamed from: b */
    public Typeface mo16659b(String str, String str2) {
        this.f15576a.mo16689b(str, str2);
        Typeface typeface = this.f15577b.get(this.f15576a);
        if (typeface != null) {
            return typeface;
        }
        Typeface d = m20570d(m20569a(str), str2);
        this.f15577b.put(this.f15576a, d);
        return d;
    }

    /* renamed from: c */
    public void mo16660c(C5416a aVar) {
    }
}
