package com.facebook.react.uimanager.p123m1;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import com.facebook.react.uimanager.C2981h;

/* renamed from: com.facebook.react.uimanager.m1.c */
abstract class C3004c extends C3002a {

    /* renamed from: com.facebook.react.uimanager.m1.c$a */
    static /* synthetic */ class C3005a {

        /* renamed from: a */
        static final /* synthetic */ int[] f8350a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.facebook.react.uimanager.m1.b[] r0 = com.facebook.react.uimanager.p123m1.C3003b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8350a = r0
                com.facebook.react.uimanager.m1.b r1 = com.facebook.react.uimanager.p123m1.C3003b.OPACITY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8350a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.react.uimanager.m1.b r1 = com.facebook.react.uimanager.p123m1.C3003b.SCALE_XY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8350a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.react.uimanager.m1.b r1 = com.facebook.react.uimanager.p123m1.C3003b.SCALE_X     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8350a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.react.uimanager.m1.b r1 = com.facebook.react.uimanager.p123m1.C3003b.SCALE_Y     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.p123m1.C3004c.C3005a.<clinit>():void");
        }
    }

    C3004c() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Animation mo9739b(View view, int i, int i2, int i3, int i4) {
        C3003b bVar = this.f8343d;
        if (bVar != null) {
            int i5 = C3005a.f8350a[bVar.ordinal()];
            float f = 0.0f;
            if (i5 == 1) {
                float alpha = mo9743g() ? view.getAlpha() : 0.0f;
                if (!mo9743g()) {
                    f = view.getAlpha();
                }
                return new C3018l(view, alpha, f);
            } else if (i5 == 2) {
                float f2 = mo9743g() ? 1.0f : 0.0f;
                float f3 = mo9743g() ? 0.0f : 1.0f;
                return new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
            } else if (i5 == 3) {
                return new ScaleAnimation(mo9743g() ? 1.0f : 0.0f, mo9743g() ? 0.0f : 1.0f, 1.0f, 1.0f, 1, 0.5f, 1, 0.0f);
            } else if (i5 == 4) {
                return new ScaleAnimation(1.0f, 1.0f, mo9743g() ? 1.0f : 0.0f, mo9743g() ? 0.0f : 1.0f, 1, 0.0f, 1, 0.5f);
            } else {
                throw new C2981h("Missing animation for property : " + this.f8343d);
            }
        } else {
            throw new C2981h("Missing animated property from animation config");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo9741e() {
        return this.f8344e > 0 && this.f8343d != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract boolean mo9743g();
}
