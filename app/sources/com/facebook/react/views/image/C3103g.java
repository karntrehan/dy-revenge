package com.facebook.react.views.image;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.face.ModuleDescriptor;
import p174e.p247e.p274h.p281c.C6179d;
import p174e.p247e.p274h.p284e.C6193g;

/* renamed from: com.facebook.react.views.image.g */
public class C3103g<INFO> extends C6193g implements C6179d<INFO> {

    /* renamed from: com.facebook.react.views.image.g$b */
    private static final class C3105b extends Drawable {
        private C3105b() {
        }

        public void draw(Canvas canvas) {
        }

        public int getOpacity() {
            return -1;
        }

        public void setAlpha(int i) {
        }

        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public C3103g() {
        super(new C3105b());
    }

    /* renamed from: a */
    public void mo9956a(String str, INFO info) {
    }

    /* renamed from: j */
    public void mo9957j(String str) {
    }

    /* renamed from: o */
    public void mo9958o(String str, Throwable th) {
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        mo9960w(i, ModuleDescriptor.MODULE_VERSION);
        return super.onLevelChange(i);
    }

    /* renamed from: w */
    public void mo9960w(int i, int i2) {
        throw null;
    }
}
