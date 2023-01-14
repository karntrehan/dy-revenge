package com.reactnativecommunity.toolbarandroid;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C3038r;
import java.util.Map;
import p174e.p247e.p274h.p275a.p276a.C6142c;
import p174e.p247e.p274h.p275a.p276a.C6144e;
import p174e.p247e.p274h.p281c.C6178c;
import p174e.p247e.p274h.p284e.C6205q;
import p174e.p247e.p274h.p285f.C6224a;
import p174e.p247e.p274h.p285f.C6225b;
import p174e.p247e.p274h.p288i.C6238b;
import p174e.p247e.p274h.p288i.C6241e;
import p174e.p247e.p294k.p307k.C6372g;

/* renamed from: com.reactnativecommunity.toolbarandroid.b */
public class C5287b extends Toolbar {

    /* renamed from: f0 */
    private final C6238b f14847f0;

    /* renamed from: g0 */
    private final C6238b f14848g0;

    /* renamed from: h0 */
    private final C6238b f14849h0;

    /* renamed from: i0 */
    private final C6241e<C6224a> f14850i0 = new C6241e<>();

    /* renamed from: j0 */
    private C5293f f14851j0;

    /* renamed from: k0 */
    private C5293f f14852k0;

    /* renamed from: l0 */
    private C5293f f14853l0;

    /* renamed from: m0 */
    private final Runnable f14854m0 = new C5291d();

    /* renamed from: com.reactnativecommunity.toolbarandroid.b$a */
    class C5288a extends C5293f {
        C5288a(C6238b bVar) {
            super(bVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo15976d(Drawable drawable) {
            C5287b.this.setLogo(drawable);
        }
    }

    /* renamed from: com.reactnativecommunity.toolbarandroid.b$b */
    class C5289b extends C5293f {
        C5289b(C6238b bVar) {
            super(bVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo15976d(Drawable drawable) {
            C5287b.this.setNavigationIcon(drawable);
        }
    }

    /* renamed from: com.reactnativecommunity.toolbarandroid.b$c */
    class C5290c extends C5293f {
        C5290c(C6238b bVar) {
            super(bVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo15976d(Drawable drawable) {
            C5287b.this.setOverflowIcon(drawable);
        }
    }

    /* renamed from: com.reactnativecommunity.toolbarandroid.b$d */
    class C5291d implements Runnable {
        C5291d() {
        }

        public void run() {
            C5287b bVar = C5287b.this;
            bVar.measure(View.MeasureSpec.makeMeasureSpec(bVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(C5287b.this.getHeight(), 1073741824));
            C5287b bVar2 = C5287b.this;
            bVar2.layout(bVar2.getLeft(), C5287b.this.getTop(), C5287b.this.getRight(), C5287b.this.getBottom());
        }
    }

    /* renamed from: com.reactnativecommunity.toolbarandroid.b$e */
    private class C5292e extends C5293f {

        /* renamed from: r */
        private final MenuItem f14859r;

        C5292e(MenuItem menuItem, C6238b bVar) {
            super(bVar);
            this.f14859r = menuItem;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo15976d(Drawable drawable) {
            this.f14859r.setIcon(drawable);
            C5287b.this.requestLayout();
        }
    }

    /* renamed from: com.reactnativecommunity.toolbarandroid.b$f */
    private abstract class C5293f extends C6178c<C6372g> {

        /* renamed from: o */
        private final C6238b f14861o;

        /* renamed from: p */
        private C5294g f14862p;

        public C5293f(C6238b bVar) {
            this.f14861o = bVar;
        }

        /* renamed from: c */
        public void mo9987e(String str, C6372g gVar, Animatable animatable) {
            super.mo9987e(str, gVar, animatable);
            C5294g gVar2 = this.f14862p;
            if (gVar2 != null) {
                gVar = gVar2;
            }
            mo15976d(new C5286a(this.f14861o.mo18518i(), gVar));
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public abstract void mo15976d(Drawable drawable);

        /* renamed from: f */
        public void mo15979f(C5294g gVar) {
            this.f14862p = gVar;
        }
    }

    /* renamed from: com.reactnativecommunity.toolbarandroid.b$g */
    private static class C5294g implements C6372g {

        /* renamed from: f */
        private int f14864f;

        /* renamed from: o */
        private int f14865o;

        public C5294g(int i, int i2) {
            this.f14864f = i;
            this.f14865o = i2;
        }

        /* renamed from: b */
        public Map<String, Object> mo15980b() {
            return null;
        }

        /* renamed from: c */
        public int mo15981c() {
            return this.f14865o;
        }

        /* renamed from: e */
        public int mo15982e() {
            return this.f14864f;
        }
    }

    public C5287b(Context context) {
        super(context);
        C6238b e = C6238b.m23645e(m19673Q(), context);
        this.f14847f0 = e;
        C6238b e2 = C6238b.m23645e(m19673Q(), context);
        this.f14848g0 = e2;
        C6238b e3 = C6238b.m23645e(m19673Q(), context);
        this.f14849h0 = e3;
        this.f14851j0 = new C5288a(e);
        this.f14852k0 = new C5289b(e2);
        this.f14853l0 = new C5290c(e3);
    }

    /* renamed from: P */
    private void m19672P() {
        this.f14847f0.mo18520k();
        this.f14848g0.mo18520k();
        this.f14849h0.mo18520k();
        this.f14850i0.mo18554d();
    }

    /* renamed from: Q */
    private C6224a m19673Q() {
        return new C6225b(getResources()).mo18491u(C6205q.C6207b.f17203e).mo18492v(0).mo18473a();
    }

    /* renamed from: R */
    private void m19674R() {
        this.f14847f0.mo18521l();
        this.f14848g0.mo18521l();
        this.f14849h0.mo18521l();
        this.f14850i0.mo18555e();
    }

    /* renamed from: S */
    private Drawable m19675S(String str) {
        if (m19676T(str) != 0) {
            return getResources().getDrawable(m19676T(str));
        }
        return null;
    }

    /* renamed from: T */
    private int m19676T(String str) {
        return getResources().getIdentifier(str, "drawable", getContext().getPackageName());
    }

    /* renamed from: U */
    private C5294g m19677U(ReadableMap readableMap) {
        if (!readableMap.hasKey("width") || !readableMap.hasKey("height")) {
            return null;
        }
        return new C5294g(Math.round(C3038r.m12006c((float) readableMap.getInt("width"))), Math.round(C3038r.m12006c((float) readableMap.getInt("height"))));
    }

    /* renamed from: V */
    private void m19678V(ReadableMap readableMap, C5293f fVar, C6238b bVar) {
        String string = readableMap != null ? readableMap.getString("uri") : null;
        if (string == null) {
            fVar.mo15979f((C5294g) null);
            fVar.mo15976d((Drawable) null);
        } else if (string.startsWith("http://") || string.startsWith("https://") || string.startsWith("file://")) {
            fVar.mo15979f(m19677U(readableMap));
            bVar.mo18524o(((C6144e) ((C6144e) C6142c.m23132g().mo18190c(Uri.parse(string)).mo18293C(fVar)).mo18300d(bVar.mo18516g())).mo18299b());
            bVar.mo18518i().setVisible(true, true);
        } else {
            fVar.mo15976d(m19675S(string));
        }
    }

    /* renamed from: W */
    private void m19679W(MenuItem menuItem, ReadableMap readableMap) {
        C6238b e = C6238b.m23645e(m19673Q(), getContext());
        C5292e eVar = new C5292e(menuItem, e);
        eVar.mo15979f(m19677U(readableMap));
        m19678V(readableMap, eVar, e);
        this.f14850i0.mo18552b(e);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m19672P();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m19674R();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        m19672P();
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        m19674R();
    }

    public void requestLayout() {
        super.requestLayout();
        post(this.f14854m0);
    }

    /* access modifiers changed from: package-private */
    public void setActions(ReadableArray readableArray) {
        Menu menu = getMenu();
        menu.clear();
        this.f14850i0.mo18553c();
        if (readableArray != null) {
            for (int i = 0; i < readableArray.size(); i++) {
                ReadableMap map = readableArray.getMap(i);
                MenuItem add = menu.add(0, 0, i, map.getString("title"));
                if (map.hasKey("icon")) {
                    m19679W(add, map.getMap("icon"));
                }
                int i2 = map.hasKey("show") ? map.getInt("show") : 0;
                if (map.hasKey("showWithText") && map.getBoolean("showWithText")) {
                    i2 |= 4;
                }
                add.setShowAsAction(i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setLogoSource(ReadableMap readableMap) {
        m19678V(readableMap, this.f14851j0, this.f14847f0);
    }

    /* access modifiers changed from: package-private */
    public void setNavIconSource(ReadableMap readableMap) {
        m19678V(readableMap, this.f14852k0, this.f14848g0);
    }

    /* access modifiers changed from: package-private */
    public void setOverflowIconSource(ReadableMap readableMap) {
        m19678V(readableMap, this.f14853l0, this.f14849h0);
    }
}
