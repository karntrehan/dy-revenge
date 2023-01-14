package p174e.p319f.p320a.p363d.p364a0;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.C4274h;

/* renamed from: e.f.a.d.a0.h */
public class C8994h {
    /* renamed from: a */
    static C8987d m29986a(int i) {
        return i != 0 ? i != 1 ? m29987b() : new C8988e() : new C8996j();
    }

    /* renamed from: b */
    static C8987d m29987b() {
        return new C8996j();
    }

    /* renamed from: c */
    static C8989f m29988c() {
        return new C8989f();
    }

    /* renamed from: d */
    public static void m29989d(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof C8990g) {
            ((C8990g) background).mo22818S(f);
        }
    }

    /* renamed from: e */
    public static void m29990e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C8990g) {
            m29991f(view, (C8990g) background);
        }
    }

    /* renamed from: f */
    public static void m29991f(View view, C8990g gVar) {
        if (gVar.mo22816N()) {
            gVar.mo22822W(C4274h.m16432b(view));
        }
    }
}
