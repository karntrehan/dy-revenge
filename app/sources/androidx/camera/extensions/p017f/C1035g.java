package androidx.camera.extensions.p017f;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Pair;
import android.util.Size;
import androidx.camera.camera2.p008f.C0597i;
import androidx.camera.core.C0949o2;
import androidx.camera.core.C0957q1;
import androidx.camera.core.impl.C0850n2;
import androidx.camera.extensions.impl.AutoImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.AutoPreviewExtenderImpl;
import androidx.camera.extensions.impl.BeautyImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.BeautyPreviewExtenderImpl;
import androidx.camera.extensions.impl.BokehImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.BokehPreviewExtenderImpl;
import androidx.camera.extensions.impl.HdrImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.HdrPreviewExtenderImpl;
import androidx.camera.extensions.impl.ImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.NightImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.NightPreviewExtenderImpl;
import androidx.camera.extensions.impl.PreviewExtenderImpl;
import androidx.core.util.C1177h;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.camera.extensions.f.g */
public class C1035g implements C1050n {

    /* renamed from: a */
    private final int f2904a;

    /* renamed from: b */
    private PreviewExtenderImpl f2905b;

    /* renamed from: c */
    private ImageCaptureExtenderImpl f2906c;

    /* renamed from: d */
    private C0957q1 f2907d;

    /* renamed from: androidx.camera.extensions.f.g$a */
    class C1036a implements PreviewExtenderImpl {
        C1036a() {
        }
    }

    /* renamed from: androidx.camera.extensions.f.g$b */
    class C1037b implements ImageCaptureExtenderImpl {
        C1037b() {
        }
    }

    public C1035g(int i) {
        AutoImageCaptureExtenderImpl bokehImageCaptureExtenderImpl;
        this.f2904a = i;
        if (i == 1) {
            this.f2905b = new BokehPreviewExtenderImpl();
            bokehImageCaptureExtenderImpl = new BokehImageCaptureExtenderImpl();
        } else if (i == 2) {
            this.f2905b = new HdrPreviewExtenderImpl();
            bokehImageCaptureExtenderImpl = new HdrImageCaptureExtenderImpl();
        } else if (i == 3) {
            this.f2905b = new NightPreviewExtenderImpl();
            bokehImageCaptureExtenderImpl = new NightImageCaptureExtenderImpl();
        } else if (i == 4) {
            this.f2905b = new BeautyPreviewExtenderImpl();
            bokehImageCaptureExtenderImpl = new BeautyImageCaptureExtenderImpl();
        } else if (i == 5) {
            try {
                this.f2905b = new AutoPreviewExtenderImpl();
                bokehImageCaptureExtenderImpl = new AutoImageCaptureExtenderImpl();
            } catch (NoClassDefFoundError unused) {
                this.f2905b = m4014g();
                this.f2906c = m4013f();
                C0949o2.m3690c("BasicVendorExtender", "OEM implementation for extension mode " + i + "does not exist!");
                return;
            }
        } else {
            throw new IllegalArgumentException("Should not activate ExtensionMode.NONE");
        }
        this.f2906c = bokehImageCaptureExtenderImpl;
    }

    /* renamed from: f */
    private ImageCaptureExtenderImpl m4013f() {
        return new C1037b();
    }

    /* renamed from: g */
    private PreviewExtenderImpl m4014g() {
        return new C1036a();
    }

    /* renamed from: h */
    private int m4015h() {
        return this.f2906c.getCaptureProcessor() != null ? 35 : 256;
    }

    /* renamed from: j */
    private Size[] m4016j(int i) {
        return ((StreamConfigurationMap) C0597i.m2471b(this.f2907d).mo2531c(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(i);
    }

    /* renamed from: l */
    private int m4017l() {
        return this.f2905b.getProcessorType() == PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_IMAGE_PROCESSOR ? 35 : 34;
    }

    /* renamed from: a */
    public List<Pair<Integer, Size[]>> mo3320a() {
        C1177h.m4584f(this.f2907d, "VendorExtender#init() must be called first");
        if (C1040j.m4029b().compareTo(C1051o.f2942o) >= 0) {
            try {
                List<Pair<Integer, Size[]>> supportedResolutions = this.f2906c.getSupportedResolutions();
                if (supportedResolutions != null) {
                    return supportedResolutions;
                }
            } catch (NoSuchMethodError unused) {
            }
        }
        int h = m4015h();
        return Arrays.asList(new Pair[]{new Pair(Integer.valueOf(h), m4016j(h))});
    }

    /* renamed from: b */
    public boolean mo3321b(String str, Map<String, CameraCharacteristics> map) {
        CameraCharacteristics cameraCharacteristics = map.get(str);
        return this.f2905b.isExtensionAvailable(str, cameraCharacteristics) && this.f2906c.isExtensionAvailable(str, cameraCharacteristics);
    }

    /* renamed from: c */
    public List<Pair<Integer, Size[]>> mo3322c() {
        C1177h.m4584f(this.f2907d, "VendorExtender#init() must be called first");
        if (C1040j.m4029b().compareTo(C1051o.f2942o) >= 0) {
            try {
                List<Pair<Integer, Size[]>> supportedResolutions = this.f2905b.getSupportedResolutions();
                if (supportedResolutions != null) {
                    return supportedResolutions;
                }
            } catch (NoSuchMethodError unused) {
            }
        }
        int l = m4017l();
        return Arrays.asList(new Pair[]{new Pair(Integer.valueOf(l), m4016j(l))});
    }

    /* renamed from: d */
    public C0850n2 mo3323d(Context context) {
        C1177h.m4584f(this.f2907d, "VendorExtender#init() must be called first");
        return null;
    }

    /* renamed from: e */
    public void mo3324e(C0957q1 q1Var) {
        this.f2907d = q1Var;
        String e = C0597i.m2471b(q1Var).mo2533e();
        CameraCharacteristics a = C0597i.m2470a(q1Var);
        this.f2905b.init(e, a);
        this.f2906c.init(e, a);
        C0949o2.m3688a("BasicVendorExtender", "Extension init Mode = " + this.f2904a);
        C0949o2.m3688a("BasicVendorExtender", "PreviewExtender processorType= " + this.f2905b.getProcessorType());
        C0949o2.m3688a("BasicVendorExtender", "ImageCaptureExtender processor= " + this.f2906c.getCaptureProcessor());
    }

    /* renamed from: i */
    public ImageCaptureExtenderImpl mo3330i() {
        return this.f2906c;
    }

    /* renamed from: k */
    public PreviewExtenderImpl mo3331k() {
        return this.f2905b;
    }
}
