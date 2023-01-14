package androidx.camera.extensions.p017f;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.Size;
import androidx.camera.camera2.p008f.C0597i;
import androidx.camera.core.C0957q1;
import androidx.camera.core.impl.C0850n2;
import androidx.camera.extensions.impl.advanced.AdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.AutoAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.BeautyAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.BokehAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.HdrAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.NightAdvancedExtenderImpl;
import androidx.camera.extensions.p017f.p021r.C1058b;
import androidx.core.util.C1177h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.camera.extensions.f.e */
public class C1033e implements C1050n {

    /* renamed from: a */
    private final AdvancedExtenderImpl f2898a;

    /* renamed from: b */
    private String f2899b;

    public C1033e(int i) {
        AutoAdvancedExtenderImpl bokehAdvancedExtenderImpl;
        if (i == 1) {
            bokehAdvancedExtenderImpl = new BokehAdvancedExtenderImpl();
        } else if (i == 2) {
            bokehAdvancedExtenderImpl = new HdrAdvancedExtenderImpl();
        } else if (i == 3) {
            bokehAdvancedExtenderImpl = new NightAdvancedExtenderImpl();
        } else if (i == 4) {
            bokehAdvancedExtenderImpl = new BeautyAdvancedExtenderImpl();
        } else if (i == 5) {
            try {
                bokehAdvancedExtenderImpl = new AutoAdvancedExtenderImpl();
            } catch (NoClassDefFoundError unused) {
                throw new IllegalArgumentException("AdvancedExtenderImpl does not exist");
            }
        } else {
            throw new IllegalArgumentException("Should not active ExtensionMode.NONE");
        }
        this.f2898a = bokehAdvancedExtenderImpl;
    }

    /* renamed from: f */
    private List<Pair<Integer, Size[]>> m4003f(Map<Integer, List<Size>> map) {
        ArrayList arrayList = new ArrayList();
        for (Integer next : map.keySet()) {
            arrayList.add(new Pair(next, (Size[]) map.get(next).toArray(new Size[0])));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public List<Pair<Integer, Size[]>> mo3320a() {
        C1177h.m4584f(this.f2899b, "VendorExtender#init() must be called first");
        return m4003f(this.f2898a.getSupportedCaptureOutputResolutions(this.f2899b));
    }

    /* renamed from: b */
    public boolean mo3321b(String str, Map<String, CameraCharacteristics> map) {
        return this.f2898a.isExtensionAvailable(str, map);
    }

    /* renamed from: c */
    public List<Pair<Integer, Size[]>> mo3322c() {
        C1177h.m4584f(this.f2899b, "VendorExtender#init() must be called first");
        return m4003f(this.f2898a.getSupportedPreviewOutputResolutions(this.f2899b));
    }

    /* renamed from: d */
    public C0850n2 mo3323d(Context context) {
        C1177h.m4584f(this.f2899b, "VendorExtender#init() must be called first");
        return new C1058b(this.f2898a.createSessionProcessor(), context);
    }

    /* renamed from: e */
    public void mo3324e(C0957q1 q1Var) {
        this.f2899b = C0597i.m2471b(q1Var).mo2533e();
        this.f2898a.init(this.f2899b, C0597i.m2471b(q1Var).mo2532d());
    }
}
