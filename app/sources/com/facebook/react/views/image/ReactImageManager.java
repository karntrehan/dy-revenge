package com.facebook.react.views.image;

import android.graphics.PorterDuff;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.C2693e;
import com.facebook.react.p109b0.p110a.C2639a;
import com.facebook.react.uimanager.C3031o0;
import com.facebook.react.uimanager.C3038r;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.p120j1.C2991a;
import com.facebook.react.uimanager.p120j1.C2992b;
import com.facebook.yoga.C3307g;
import java.util.Map;
import p174e.p247e.p274h.p275a.p276a.C6142c;
import p174e.p247e.p274h.p281c.C6174b;

@C2639a(name = "RCTImageView")
public class ReactImageManager extends SimpleViewManager<C3106h> {
    public static final String REACT_CLASS = "RCTImageView";
    private final Object mCallerContext;
    private final C3102f mCallerContextFactory;
    private C6174b mDraweeControllerBuilder;
    private C3097a mGlobalImageLoadListener;

    public ReactImageManager() {
        this.mDraweeControllerBuilder = null;
        this.mCallerContext = null;
        this.mCallerContextFactory = null;
    }

    public ReactImageManager(C6174b bVar, C3097a aVar, C3102f fVar) {
        this.mDraweeControllerBuilder = bVar;
        this.mGlobalImageLoadListener = aVar;
        this.mCallerContextFactory = fVar;
        this.mCallerContext = null;
    }

    @Deprecated
    public ReactImageManager(C6174b bVar, C3097a aVar, Object obj) {
        this.mDraweeControllerBuilder = bVar;
        this.mGlobalImageLoadListener = aVar;
        this.mCallerContext = obj;
        this.mCallerContextFactory = null;
    }

    public ReactImageManager(C6174b bVar, C3102f fVar) {
        this(bVar, (C3097a) null, fVar);
    }

    @Deprecated
    public ReactImageManager(C6174b bVar, Object obj) {
        this(bVar, (C3097a) null, obj);
    }

    public C3106h createViewInstance(C3031o0 o0Var) {
        C3102f fVar = this.mCallerContextFactory;
        return new C3106h(o0Var, getDraweeControllerBuilder(), this.mGlobalImageLoadListener, fVar != null ? fVar.mo9955a(o0Var.mo9806a(), (String) null) : getCallerContext());
    }

    @Deprecated
    public Object getCallerContext() {
        return this.mCallerContext;
    }

    public C6174b getDraweeControllerBuilder() {
        if (this.mDraweeControllerBuilder == null) {
            this.mDraweeControllerBuilder = C6142c.m23132g();
        }
        return this.mDraweeControllerBuilder;
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        return C2693e.m10918h(C3098b.m12196A(4), C2693e.m10914d("registrationName", "onLoadStart"), C3098b.m12196A(5), C2693e.m10914d("registrationName", "onProgress"), C3098b.m12196A(2), C2693e.m10914d("registrationName", "onLoad"), C3098b.m12196A(1), C2693e.m10914d("registrationName", "onError"), C3098b.m12196A(3), C2693e.m10914d("registrationName", "onLoadEnd"));
    }

    public String getName() {
        return REACT_CLASS;
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(C3106h hVar) {
        super.onAfterUpdateTransaction(hVar);
        hVar.mo9967s();
    }

    @C2991a(name = "accessible")
    public void setAccessible(C3106h hVar, boolean z) {
        hVar.setFocusable(z);
    }

    @C2991a(name = "blurRadius")
    public void setBlurRadius(C3106h hVar, float f) {
        hVar.setBlurRadius(f);
    }

    @C2991a(customType = "Color", name = "borderColor")
    public void setBorderColor(C3106h hVar, Integer num) {
        hVar.setBorderColor(num == null ? 0 : num.intValue());
    }

    @C2992b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(C3106h hVar, int i, float f) {
        if (!C3307g.m12971a(f)) {
            f = C3038r.m12006c(f);
        }
        if (i == 0) {
            hVar.setBorderRadius(f);
        } else {
            hVar.mo9985t(f, i - 1);
        }
    }

    @C2991a(name = "borderWidth")
    public void setBorderWidth(C3106h hVar, float f) {
        hVar.setBorderWidth(f);
    }

    @C2991a(name = "defaultSrc")
    public void setDefaultSource(C3106h hVar, String str) {
        hVar.setDefaultSource(str);
    }

    @C2991a(name = "fadeDuration")
    public void setFadeDuration(C3106h hVar, int i) {
        hVar.setFadeDuration(i);
    }

    @C2991a(name = "headers")
    public void setHeaders(C3106h hVar, ReadableMap readableMap) {
        hVar.setHeaders(readableMap);
    }

    @C2991a(name = "internal_analyticTag")
    public void setInternal_AnalyticsTag(C3106h hVar, String str) {
        C3102f fVar = this.mCallerContextFactory;
        if (fVar != null) {
            hVar.mo9986w(fVar.mo9955a(((C3031o0) hVar.getContext()).mo9806a(), str));
        }
    }

    @C2991a(name = "shouldNotifyLoadEvents")
    public void setLoadHandlersRegistered(C3106h hVar, boolean z) {
        hVar.setShouldNotifyLoadEvents(z);
    }

    @C2991a(name = "loadingIndicatorSrc")
    public void setLoadingIndicatorSource(C3106h hVar, String str) {
        hVar.setLoadingIndicatorSource(str);
    }

    @C2991a(customType = "Color", name = "overlayColor")
    public void setOverlayColor(C3106h hVar, Integer num) {
        hVar.setOverlayColor(num == null ? 0 : num.intValue());
    }

    @C2991a(name = "progressiveRenderingEnabled")
    public void setProgressiveRenderingEnabled(C3106h hVar, boolean z) {
        hVar.setProgressiveRenderingEnabled(z);
    }

    @C2991a(name = "resizeMethod")
    public void setResizeMethod(C3106h hVar, String str) {
        C3099c cVar;
        if (str == null || "auto".equals(str)) {
            cVar = C3099c.AUTO;
        } else if ("resize".equals(str)) {
            cVar = C3099c.RESIZE;
        } else if ("scale".equals(str)) {
            cVar = C3099c.SCALE;
        } else {
            throw new JSApplicationIllegalArgumentException("Invalid resize method: '" + str + "'");
        }
        hVar.setResizeMethod(cVar);
    }

    @C2991a(name = "resizeMode")
    public void setResizeMode(C3106h hVar, String str) {
        hVar.setScaleType(C3100d.m12208c(str));
        hVar.setTileMode(C3100d.m12209d(str));
    }

    @C2991a(name = "src")
    public void setSource(C3106h hVar, ReadableArray readableArray) {
        hVar.setSource(readableArray);
    }

    @C2991a(customType = "Color", name = "tintColor")
    public void setTintColor(C3106h hVar, Integer num) {
        if (num == null) {
            hVar.clearColorFilter();
        } else {
            hVar.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }
}
