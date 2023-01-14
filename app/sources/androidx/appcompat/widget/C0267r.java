package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.core.graphics.drawable.C1166c;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.face.ModuleDescriptor;

/* renamed from: androidx.appcompat.widget.r */
class C0267r {

    /* renamed from: a */
    private static final int[] f1139a = {16843067, 16843068};

    /* renamed from: b */
    private final ProgressBar f1140b;

    /* renamed from: c */
    private Bitmap f1141c;

    C0267r(ProgressBar progressBar) {
        this.f1140b = progressBar;
    }

    /* renamed from: a */
    private Shape m1330a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null);
    }

    /* renamed from: d */
    private Drawable m1331d(Drawable drawable, boolean z) {
        if (drawable instanceof C1166c) {
            C1166c cVar = (C1166c) drawable;
            Drawable b = cVar.mo3659b();
            if (b != null) {
                cVar.mo3658a(m1331d(b, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = m1331d(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f1141c == null) {
                this.f1141c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(m1330a());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    /* renamed from: e */
    private Drawable m1332e(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable d = m1331d(animationDrawable.getFrame(i), true);
            d.setLevel(ModuleDescriptor.MODULE_VERSION);
            animationDrawable2.addFrame(d, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(ModuleDescriptor.MODULE_VERSION);
        return animationDrawable2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Bitmap mo1639b() {
        return this.f1141c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1640c(AttributeSet attributeSet, int i) {
        C0292x0 v = C0292x0.m1407v(this.f1140b.getContext(), attributeSet, f1139a, i, 0);
        Drawable h = v.mo1791h(0);
        if (h != null) {
            this.f1140b.setIndeterminateDrawable(m1332e(h));
        }
        Drawable h2 = v.mo1791h(1);
        if (h2 != null) {
            this.f1140b.setProgressDrawable(m1331d(h2, false));
        }
        v.mo1803w();
    }
}
