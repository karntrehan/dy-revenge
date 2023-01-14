package com.facebook.react.views.text.frescosupport;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.TextView;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.fresco.C2819a;
import com.facebook.react.uimanager.C3038r;
import com.facebook.react.views.image.C3100d;
import com.facebook.react.views.text.C3164a0;
import p174e.p247e.p274h.p281c.C6174b;
import p174e.p247e.p274h.p284e.C6205q;
import p174e.p247e.p274h.p285f.C6224a;
import p174e.p247e.p274h.p285f.C6225b;
import p174e.p247e.p274h.p288i.C6238b;
import p174e.p247e.p294k.p311o.C6388c;

/* renamed from: com.facebook.react.views.text.frescosupport.b */
public class C3179b extends C3164a0 {

    /* renamed from: f */
    private Drawable f8895f;

    /* renamed from: o */
    private final C6174b f8896o;

    /* renamed from: p */
    private final C6238b<C6224a> f8897p;

    /* renamed from: q */
    private final Object f8898q;

    /* renamed from: r */
    private int f8899r;

    /* renamed from: s */
    private int f8900s;

    /* renamed from: t */
    private Uri f8901t;

    /* renamed from: u */
    private int f8902u;

    /* renamed from: v */
    private ReadableMap f8903v;

    /* renamed from: w */
    private String f8904w;

    /* renamed from: x */
    private TextView f8905x;

    public C3179b(Resources resources, int i, int i2, int i3, Uri uri, ReadableMap readableMap, C6174b bVar, Object obj, String str) {
        this.f8897p = new C6238b<>(C6225b.m23566t(resources).mo18473a());
        this.f8896o = bVar;
        this.f8898q = obj;
        this.f8900s = i3;
        this.f8901t = uri == null ? Uri.EMPTY : uri;
        this.f8903v = readableMap;
        this.f8902u = (int) C3038r.m12006c((float) i2);
        this.f8899r = (int) C3038r.m12006c((float) i);
        this.f8904w = str;
    }

    /* renamed from: i */
    private C6205q.C6207b m12464i(String str) {
        return C3100d.m12208c(str);
    }

    /* renamed from: a */
    public Drawable mo10311a() {
        return this.f8895f;
    }

    /* renamed from: b */
    public int mo10312b() {
        return this.f8899r;
    }

    /* renamed from: c */
    public void mo10313c() {
        this.f8897p.mo18520k();
    }

    /* renamed from: d */
    public void mo10314d() {
        this.f8897p.mo18521l();
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.f8895f == null) {
            C2819a x = C2819a.m11231x(C6388c.m24438s(this.f8901t), this.f8903v);
            this.f8897p.mo18517h().mo18469v(m12464i(this.f8904w));
            this.f8897p.mo18524o(this.f8896o.mo18318z().mo18300d(this.f8897p.mo18516g()).mo18292B(this.f8898q).mo18294D(x).mo18299b());
            this.f8896o.mo18318z();
            Drawable i6 = this.f8897p.mo18518i();
            this.f8895f = i6;
            i6.setBounds(0, 0, this.f8902u, this.f8899r);
            int i7 = this.f8900s;
            if (i7 != 0) {
                this.f8895f.setColorFilter(i7, PorterDuff.Mode.SRC_IN);
            }
            this.f8895f.setCallback(this.f8905x);
        }
        canvas.save();
        canvas.translate(f, (float) (((i4 + ((int) paint.descent())) - (((int) (paint.descent() - paint.ascent())) / 2)) - ((this.f8895f.getBounds().bottom - this.f8895f.getBounds().top) / 2)));
        this.f8895f.draw(canvas);
        canvas.restore();
    }

    /* renamed from: e */
    public void mo10315e() {
        this.f8897p.mo18520k();
    }

    /* renamed from: f */
    public void mo10316f() {
        this.f8897p.mo18521l();
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            int i3 = -this.f8899r;
            fontMetricsInt.ascent = i3;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i3;
            fontMetricsInt.bottom = 0;
        }
        return this.f8902u;
    }

    /* renamed from: h */
    public void mo10317h(TextView textView) {
        this.f8905x = textView;
    }
}
