package p174e.p181b.p182a.p187v;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p174e.p181b.p182a.C5421b;
import p174e.p181b.p182a.C5458h;
import p174e.p181b.p182a.p195z.C5643d;
import p174e.p181b.p182a.p195z.C5647h;

/* renamed from: e.b.a.v.b */
public class C5522b {

    /* renamed from: a */
    private static final Object f15582a = new Object();

    /* renamed from: b */
    private final Context f15583b;

    /* renamed from: c */
    private final String f15584c;

    /* renamed from: d */
    private C5421b f15585d;

    /* renamed from: e */
    private final Map<String, C5458h> f15586e;

    public C5522b(Drawable.Callback callback, String str, C5421b bVar, Map<String, C5458h> map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            str = str + '/';
        }
        this.f15584c = str;
        if (!(callback instanceof View)) {
            C5643d.m21027c("LottieDrawable must be inside of a view for images to work.");
            this.f15586e = new HashMap();
            this.f15583b = null;
            return;
        }
        this.f15583b = ((View) callback).getContext();
        this.f15586e = map;
        mo16663d(bVar);
    }

    /* renamed from: c */
    private Bitmap m20573c(String str, Bitmap bitmap) {
        synchronized (f15582a) {
            this.f15586e.get(str).mo16565f(bitmap);
        }
        return bitmap;
    }

    /* renamed from: a */
    public Bitmap mo16661a(String str) {
        String str2;
        Bitmap l;
        C5458h hVar = this.f15586e.get(str);
        if (hVar == null) {
            return null;
        }
        Bitmap a = hVar.mo16560a();
        if (a != null) {
            return a;
        }
        C5421b bVar = this.f15585d;
        if (bVar != null) {
            Bitmap a2 = bVar.mo16377a(hVar);
            if (a2 != null) {
                m20573c(str, a2);
            }
            return a2;
        }
        String b = hVar.mo16561b();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (!b.startsWith("data:") || b.indexOf("base64,") <= 0) {
            try {
                if (!TextUtils.isEmpty(this.f15584c)) {
                    AssetManager assets = this.f15583b.getAssets();
                    try {
                        l = C5647h.m21077l(BitmapFactory.decodeStream(assets.open(this.f15584c + b), (Rect) null, options), hVar.mo16564e(), hVar.mo16562c());
                    } catch (IllegalArgumentException e) {
                        e = e;
                        str2 = "Unable to decode image.";
                        C5643d.m21028d(str2, e);
                        return null;
                    }
                } else {
                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                }
            } catch (IOException e2) {
                e = e2;
                str2 = "Unable to open asset.";
                C5643d.m21028d(str2, e);
                return null;
            }
        } else {
            try {
                byte[] decode = Base64.decode(b.substring(b.indexOf(44) + 1), 0);
                l = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
            } catch (IllegalArgumentException e3) {
                e = e3;
                str2 = "data URL did not have correct base64 format.";
                C5643d.m21028d(str2, e);
                return null;
            }
        }
        return m20573c(str, l);
    }

    /* renamed from: b */
    public boolean mo16662b(Context context) {
        return (context == null && this.f15583b == null) || this.f15583b.equals(context);
    }

    /* renamed from: d */
    public void mo16663d(C5421b bVar) {
        this.f15585d = bVar;
    }
}
