package p027c.p104x.p105c;

import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.chromium.support_lib_boundary.p511a.C10871a;

/* renamed from: c.x.c.g */
public class C2260g implements C2259f {

    /* renamed from: a */
    WebViewProviderFactoryBoundaryInterface f6649a;

    public C2260g(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f6649a = webViewProviderFactoryBoundaryInterface;
    }

    /* renamed from: a */
    public String[] mo7556a() {
        return this.f6649a.getSupportedFeatures();
    }

    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) C10871a.m36986a(WebkitToCompatConverterBoundaryInterface.class, this.f6649a.getWebkitToCompatConverter());
    }
}
