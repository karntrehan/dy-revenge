package p174e.p319f.p320a.p321a;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Handler;
import android.util.Size;
import p174e.p319f.p320a.p321a.C6448f;

@TargetApi(23)
/* renamed from: e.f.a.a.d */
class C6441d extends C6430c {
    C6441d(C6448f.C6449a aVar, C6453i iVar, Context context, Handler handler) {
        super(aVar, iVar, context, handler);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public void mo19076d0(C6457k kVar, StreamConfigurationMap streamConfigurationMap) {
        if (streamConfigurationMap.getHighResolutionOutputSizes(256) != null) {
            for (Size size : streamConfigurationMap.getHighResolutionOutputSizes(256)) {
                kVar.mo19218a(new C6455j(size.getWidth(), size.getHeight()));
            }
        }
        if (kVar.mo19220c()) {
            super.mo19076d0(kVar, streamConfigurationMap);
        }
    }
}
