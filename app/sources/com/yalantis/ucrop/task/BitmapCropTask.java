package com.yalantis.ucrop.task;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import com.yalantis.ucrop.p443k.C10149a;
import com.yalantis.ucrop.p444l.C10155b;
import com.yalantis.ucrop.p444l.C10156c;
import com.yalantis.ucrop.p444l.C10157d;
import com.yalantis.ucrop.p445m.C10162e;
import com.yalantis.ucrop.p445m.C10163f;
import java.io.File;
import p027c.p084n.p085a.C2049a;

public class BitmapCropTask extends AsyncTask<Void, Void, Throwable> {

    /* renamed from: a */
    private Bitmap f27146a;

    /* renamed from: b */
    private final RectF f27147b;

    /* renamed from: c */
    private final RectF f27148c;

    /* renamed from: d */
    private float f27149d;

    /* renamed from: e */
    private float f27150e;

    /* renamed from: f */
    private final int f27151f;

    /* renamed from: g */
    private final int f27152g;

    /* renamed from: h */
    private final Bitmap.CompressFormat f27153h;

    /* renamed from: i */
    private final int f27154i;

    /* renamed from: j */
    private final String f27155j;

    /* renamed from: k */
    private final String f27156k;

    /* renamed from: l */
    private final C10156c f27157l;

    /* renamed from: m */
    private final C10149a f27158m;

    /* renamed from: n */
    private int f27159n;

    /* renamed from: o */
    private int f27160o;

    /* renamed from: p */
    private int f27161p;

    /* renamed from: q */
    private int f27162q;

    static {
        System.loadLibrary("ucrop");
    }

    public BitmapCropTask(Bitmap bitmap, C10157d dVar, C10155b bVar, C10149a aVar) {
        this.f27146a = bitmap;
        this.f27147b = dVar.mo25260a();
        this.f27148c = dVar.mo25262c();
        this.f27149d = dVar.mo25263d();
        this.f27150e = dVar.mo25261b();
        this.f27151f = bVar.mo25254f();
        this.f27152g = bVar.mo25255g();
        this.f27153h = bVar.mo25249a();
        this.f27154i = bVar.mo25250b();
        this.f27155j = bVar.mo25252d();
        this.f27156k = bVar.mo25253e();
        this.f27157l = bVar.mo25251c();
        this.f27158m = aVar;
    }

    /* renamed from: a */
    private boolean m34421a(float f) {
        C2049a aVar = new C2049a(this.f27155j);
        this.f27161p = Math.round((this.f27147b.left - this.f27148c.left) / this.f27149d);
        this.f27162q = Math.round((this.f27147b.top - this.f27148c.top) / this.f27149d);
        this.f27159n = Math.round(this.f27147b.width() / this.f27149d);
        int round = Math.round(this.f27147b.height() / this.f27149d);
        this.f27160o = round;
        boolean e = m34423e(this.f27159n, round);
        Log.i("BitmapCropTask", "Should crop: " + e);
        if (e) {
            boolean cropCImg = cropCImg(this.f27155j, this.f27156k, this.f27161p, this.f27162q, this.f27159n, this.f27160o, this.f27150e, f, this.f27153h.ordinal(), this.f27154i, this.f27157l.mo25256a(), this.f27157l.mo25257b());
            if (cropCImg && this.f27153h.equals(Bitmap.CompressFormat.JPEG)) {
                C10163f.m34393b(aVar, this.f27159n, this.f27160o, this.f27156k);
            }
            return cropCImg;
        }
        C10162e.m34391a(this.f27155j, this.f27156k);
        return false;
    }

    public static native boolean cropCImg(String str, String str2, int i, int i2, int i3, int i4, float f, float f2, int i5, int i6, int i7, int i8);

    /* renamed from: d */
    private float m34422d() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        boolean z = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(this.f27155j, options);
        if (!(this.f27157l.mo25256a() == 90 || this.f27157l.mo25256a() == 270)) {
            z = false;
        }
        this.f27149d /= Math.min(((float) (z ? options.outHeight : options.outWidth)) / ((float) this.f27146a.getWidth()), ((float) (z ? options.outWidth : options.outHeight)) / ((float) this.f27146a.getHeight()));
        if (this.f27151f <= 0 || this.f27152g <= 0) {
            return 1.0f;
        }
        float width = this.f27147b.width() / this.f27149d;
        float height = this.f27147b.height() / this.f27149d;
        int i = this.f27151f;
        if (width <= ((float) i) && height <= ((float) this.f27152g)) {
            return 1.0f;
        }
        float min = Math.min(((float) i) / width, ((float) this.f27152g) / height);
        this.f27149d /= min;
        return min;
    }

    /* renamed from: e */
    private boolean m34423e(int i, int i2) {
        int round = Math.round(((float) Math.max(i, i2)) / 1000.0f) + 1;
        if (this.f27151f > 0 && this.f27152g > 0) {
            return true;
        }
        float f = (float) round;
        return Math.abs(this.f27147b.left - this.f27148c.left) > f || Math.abs(this.f27147b.top - this.f27148c.top) > f || Math.abs(this.f27147b.bottom - this.f27148c.bottom) > f || Math.abs(this.f27147b.right - this.f27148c.right) > f || this.f27150e != 0.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Throwable doInBackground(Void... voidArr) {
        Bitmap bitmap = this.f27146a;
        if (bitmap == null) {
            return new NullPointerException("ViewBitmap is null");
        }
        if (bitmap.isRecycled()) {
            return new NullPointerException("ViewBitmap is recycled");
        }
        if (this.f27148c.isEmpty()) {
            return new NullPointerException("CurrentImageRect is empty");
        }
        try {
            m34421a(m34422d());
            this.f27146a = null;
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void onPostExecute(Throwable th) {
        C10149a aVar = this.f27158m;
        if (aVar == null) {
            return;
        }
        if (th == null) {
            this.f27158m.mo25207a(Uri.fromFile(new File(this.f27156k)), this.f27161p, this.f27162q, this.f27159n, this.f27160o);
            return;
        }
        aVar.mo25208b(th);
    }
}
