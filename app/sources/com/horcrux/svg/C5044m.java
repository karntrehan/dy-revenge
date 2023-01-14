package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.p116f0.p118b.C2758a;
import com.facebook.react.p116f0.p118b.C2762c;
import com.facebook.react.uimanager.p120j1.C2991a;
import java.util.concurrent.atomic.AtomicBoolean;
import p174e.p247e.p253d.p255b.C6041f;
import p174e.p247e.p253d.p258e.C6071a;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p266e.C6122c;
import p174e.p247e.p274h.p275a.p276a.C6142c;
import p174e.p247e.p294k.p302f.C6327h;
import p174e.p247e.p294k.p303g.C6349b;
import p174e.p247e.p294k.p307k.C6366a;
import p174e.p247e.p294k.p307k.C6367b;
import p174e.p247e.p294k.p311o.C6384b;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.m */
class C5044m extends C5017b0 {

    /* renamed from: W0 */
    private C5020c0 f14183W0;

    /* renamed from: X0 */
    private C5020c0 f14184X0;

    /* renamed from: Y0 */
    private C5020c0 f14185Y0;

    /* renamed from: Z0 */
    private C5020c0 f14186Z0;

    /* renamed from: a1 */
    private String f14187a1;

    /* renamed from: b1 */
    private int f14188b1;

    /* renamed from: c1 */
    private int f14189c1;

    /* renamed from: d1 */
    private String f14190d1;

    /* renamed from: e1 */
    private int f14191e1;
    /* access modifiers changed from: private */

    /* renamed from: f1 */
    public final AtomicBoolean f14192f1 = new AtomicBoolean(false);

    /* renamed from: com.horcrux.svg.m$a */
    class C5045a extends C6349b {
        C5045a() {
        }

        /* renamed from: e */
        public void mo9194e(C6122c cVar) {
            C5044m.this.f14192f1.set(false);
            C6071a.m22862J("ReactNative", cVar.mo18119e(), "RNSVG: fetchDecodedImage failed!", new Object[0]);
        }

        /* renamed from: g */
        public void mo15309g(Bitmap bitmap) {
            C5044m.this.f14192f1.set(false);
            C5028f0 svgView = C5044m.this.getSvgView();
            if (svgView != null) {
                svgView.invalidate();
            }
        }
    }

    public C5044m(ReactContext reactContext) {
        super(reactContext);
    }

    /* renamed from: d0 */
    private void m19078d0(Canvas canvas, Paint paint, Bitmap bitmap, float f) {
        if (this.f14188b1 == 0 || this.f14189c1 == 0) {
            this.f14188b1 = bitmap.getWidth();
            this.f14189c1 = bitmap.getHeight();
        }
        RectF e0 = m19079e0();
        RectF rectF = new RectF(0.0f, 0.0f, (float) this.f14188b1, (float) this.f14189c1);
        C5067w0.m19150a(rectF, e0, this.f14190d1, this.f14191e1).mapRect(rectF);
        canvas.clipPath(mo15183I(canvas, paint));
        Path H = mo15380H(canvas, paint);
        if (H != null) {
            canvas.clipPath(H);
        }
        Paint paint2 = new Paint();
        paint2.setAlpha((int) (f * 255.0f));
        canvas.drawBitmap(bitmap, (Rect) null, rectF, paint2);
        this.f14338I.mapRect(rectF);
        setClientRect(rectF);
    }

    /* renamed from: e0 */
    private RectF m19079e0() {
        double N = mo15383N(this.f14183W0);
        double L = mo15381L(this.f14184X0);
        double N2 = mo15383N(this.f14185Y0);
        double L2 = mo15381L(this.f14186Z0);
        if (N2 == 0.0d) {
            N2 = (double) (((float) this.f14188b1) * this.f14354b0);
        }
        if (L2 == 0.0d) {
            L2 = (double) (((float) this.f14189c1) * this.f14354b0);
        }
        return new RectF((float) N, (float) L, (float) (N + N2), (float) (L + L2));
    }

    /* renamed from: f0 */
    private void m19080f0(C6327h hVar, C6384b bVar) {
        this.f14192f1.set(true);
        hVar.mo18711d(bVar, this.f14336G).mo18123i(new C5045a(), C6041f.m22805g());
    }

    /* renamed from: g0 */
    private void m19081g0(C6327h hVar, C6384b bVar, Canvas canvas, Paint paint, float f) {
        C6088a h;
        C6122c<C6088a<C6367b>> h2 = hVar.mo18715h(bVar, this.f14336G);
        try {
            h = h2.mo18122h();
            if (h == null) {
                h2.close();
                return;
            }
            C6367b bVar2 = (C6367b) h.mo18082w0();
            if (!(bVar2 instanceof C6366a)) {
                C6088a.m22949v0(h);
                h2.close();
                return;
            }
            Bitmap E = ((C6366a) bVar2).mo18868E();
            if (E == null) {
                C6088a.m22949v0(h);
                h2.close();
                return;
            }
            m19078d0(canvas, paint, E, f);
            C6088a.m22949v0(h);
            h2.close();
        } catch (Exception e) {
            throw new IllegalStateException(e);
        } catch (Exception e2) {
            try {
                throw new IllegalStateException(e2);
            } catch (Throwable th) {
                h2.close();
                throw th;
            }
        } catch (Throwable th2) {
            C6088a.m22949v0(h);
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo15193F(Canvas canvas, Paint paint, float f) {
        if (!this.f14192f1.get()) {
            C6327h a = C6142c.m23126a();
            C6384b a2 = C6384b.m24411a(new C2758a(this.f14336G, this.f14187a1).mo9021e());
            if (a.mo18721n(a2)) {
                m19081g0(a, a2, canvas, paint, f * this.f14337H);
                return;
            }
            m19080f0(a, a2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public Path mo15183I(Canvas canvas, Paint paint) {
        Path path = new Path();
        this.f14367o0 = path;
        path.addRect(m19079e0(), Path.Direction.CW);
        return this.f14367o0;
    }

    @C2991a(name = "align")
    public void setAlign(String str) {
        this.f14190d1 = str;
        invalidate();
    }

    @C2991a(name = "height")
    public void setHeight(Dynamic dynamic) {
        this.f14186Z0 = C5020c0.m18971b(dynamic);
        invalidate();
    }

    @C2991a(name = "meetOrSlice")
    public void setMeetOrSlice(int i) {
        this.f14191e1 = i;
        invalidate();
    }

    @C2991a(name = "src")
    public void setSrc(ReadableMap readableMap) {
        int i;
        if (readableMap != null) {
            String string = readableMap.getString("uri");
            this.f14187a1 = string;
            if (string != null && !string.isEmpty()) {
                if (!readableMap.hasKey("width") || !readableMap.hasKey("height")) {
                    i = 0;
                    this.f14188b1 = 0;
                } else {
                    this.f14188b1 = readableMap.getInt("width");
                    i = readableMap.getInt("height");
                }
                this.f14189c1 = i;
                if (Uri.parse(this.f14187a1).getScheme() == null) {
                    C2762c.m11073a().mo9029d(this.f14336G, this.f14187a1);
                }
            }
        }
    }

    @C2991a(name = "width")
    public void setWidth(Dynamic dynamic) {
        this.f14185Y0 = C5020c0.m18971b(dynamic);
        invalidate();
    }

    @C2991a(name = "x")
    public void setX(Dynamic dynamic) {
        this.f14183W0 = C5020c0.m18971b(dynamic);
        invalidate();
    }

    @C2991a(name = "y")
    public void setY(Dynamic dynamic) {
        this.f14184X0 = C5020c0.m18971b(dynamic);
        invalidate();
    }
}
