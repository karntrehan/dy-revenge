package androidx.camera.camera2.p003e.p004j3.p006s0;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import androidx.camera.camera2.p003e.p004j3.C0402g0;
import androidx.camera.core.C0949o2;
import androidx.camera.core.impl.C0817h2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.camera.camera2.e.j3.s0.e */
public class C0453e implements C0817h2 {

    /* renamed from: a */
    private final List<Size> f1590a;

    public C0453e(C0402g0 g0Var) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) g0Var.mo2119a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            C0949o2.m3690c("CamcorderProfileResolutionQuirk", "StreamConfigurationMap is null");
        }
        Size[] sizeArr = null;
        if (Build.VERSION.SDK_INT < 23) {
            if (streamConfigurationMap != null) {
                sizeArr = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
            }
        } else if (streamConfigurationMap != null) {
            sizeArr = streamConfigurationMap.getOutputSizes(34);
        }
        List<Size> asList = sizeArr != null ? Arrays.asList((Size[]) sizeArr.clone()) : Collections.emptyList();
        this.f1590a = asList;
        C0949o2.m3688a("CamcorderProfileResolutionQuirk", "mSupportedResolutions = " + asList);
    }

    /* renamed from: b */
    static boolean m1975b(C0402g0 g0Var) {
        Integer num = (Integer) g0Var.mo2119a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    /* renamed from: a */
    public List<Size> mo2210a() {
        return new ArrayList(this.f1590a);
    }
}
