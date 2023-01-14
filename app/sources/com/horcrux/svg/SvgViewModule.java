package com.horcrux.svg;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;

class SvgViewModule extends ReactContextBaseJavaModule {

    /* renamed from: com.horcrux.svg.SvgViewModule$a */
    class C5008a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ int f13965f;

        /* renamed from: o */
        final /* synthetic */ ReadableMap f13966o;

        /* renamed from: p */
        final /* synthetic */ Callback f13967p;

        /* renamed from: q */
        final /* synthetic */ int f13968q;

        /* renamed from: com.horcrux.svg.SvgViewModule$a$a */
        class C5009a implements Runnable {

            /* renamed from: com.horcrux.svg.SvgViewModule$a$a$a */
            class C5010a implements Runnable {
                C5010a() {
                }

                public void run() {
                    C5008a aVar = C5008a.this;
                    SvgViewModule.toDataURL(aVar.f13965f, aVar.f13966o, aVar.f13967p, aVar.f13968q + 1);
                }
            }

            C5009a() {
            }

            public void run() {
                C5028f0 svgViewByTag = SvgViewManager.getSvgViewByTag(C5008a.this.f13965f);
                if (svgViewByTag != null) {
                    svgViewByTag.setToDataUrlTask(new C5010a());
                }
            }
        }

        /* renamed from: com.horcrux.svg.SvgViewModule$a$b */
        class C5011b implements Runnable {
            C5011b() {
            }

            public void run() {
                C5008a aVar = C5008a.this;
                SvgViewModule.toDataURL(aVar.f13965f, aVar.f13966o, aVar.f13967p, aVar.f13968q + 1);
            }
        }

        C5008a(int i, ReadableMap readableMap, Callback callback, int i2) {
            this.f13965f = i;
            this.f13966o = readableMap;
            this.f13967p = callback;
            this.f13968q = i2;
        }

        public void run() {
            C5028f0 svgViewByTag = SvgViewManager.getSvgViewByTag(this.f13965f);
            if (svgViewByTag == null) {
                SvgViewManager.runWhenViewIsAvailable(this.f13965f, new C5009a());
            } else if (svgViewByTag.mo15232R()) {
                svgViewByTag.setToDataUrlTask(new C5011b());
            } else {
                ReadableMap readableMap = this.f13966o;
                if (readableMap != null) {
                    this.f13967p.invoke(svgViewByTag.mo15234T(readableMap.getInt("width"), this.f13966o.getInt("height")));
                    return;
                }
                this.f13967p.invoke(svgViewByTag.mo15233S());
            }
        }
    }

    SvgViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* access modifiers changed from: private */
    public static void toDataURL(int i, ReadableMap readableMap, Callback callback, int i2) {
        UiThreadUtil.runOnUiThread(new C5008a(i, readableMap, callback, i2));
    }

    public String getName() {
        return "RNSVGSvgViewManager";
    }

    @ReactMethod
    public void toDataURL(int i, ReadableMap readableMap, Callback callback) {
        toDataURL(i, readableMap, callback, 0);
    }
}
