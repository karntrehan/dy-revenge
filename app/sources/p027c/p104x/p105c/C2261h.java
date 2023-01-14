package p027c.p104x.p105c;

import android.webkit.WebSettings;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.chromium.support_lib_boundary.p511a.C10871a;

/* renamed from: c.x.c.h */
public class C2261h {

    /* renamed from: a */
    private final WebkitToCompatConverterBoundaryInterface f6650a;

    public C2261h(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f6650a = webkitToCompatConverterBoundaryInterface;
    }

    /* renamed from: a */
    public C2253c mo7562a(WebSettings webSettings) {
        return new C2253c((WebSettingsBoundaryInterface) C10871a.m36986a(WebSettingsBoundaryInterface.class, this.f6650a.convertSettings(webSettings)));
    }
}
