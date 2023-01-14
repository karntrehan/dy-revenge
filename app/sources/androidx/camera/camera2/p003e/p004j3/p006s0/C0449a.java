package androidx.camera.camera2.p003e.p004j3.p006s0;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import androidx.camera.camera2.p003e.p004j3.C0402g0;
import androidx.camera.core.impl.C0817h2;
import com.reactnativecommunity.webview.RNCWebViewManager;

/* renamed from: androidx.camera.camera2.e.j3.s0.a */
public class C0449a implements C0817h2 {

    /* renamed from: a */
    private final Range<Integer> f1589a;

    public C0449a(C0402g0 g0Var) {
        this.f1589a = m1970d((Range[]) g0Var.mo2119a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
    }

    /* renamed from: a */
    private Range<Integer> m1968a(Range<Integer> range) {
        int intValue = range.getUpper().intValue();
        int intValue2 = range.getLower().intValue();
        if (range.getUpper().intValue() >= 1000) {
            intValue = range.getUpper().intValue() / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
        }
        if (range.getLower().intValue() >= 1000) {
            intValue2 = range.getLower().intValue() / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
        }
        return new Range<>(Integer.valueOf(intValue2), Integer.valueOf(intValue));
    }

    /* renamed from: c */
    static boolean m1969c(C0402g0 g0Var) {
        Integer num = (Integer) g0Var.mo2119a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    /* renamed from: d */
    private Range<Integer> m1970d(Range<Integer>[] rangeArr) {
        Range<Integer> range = null;
        if (!(rangeArr == null || rangeArr.length == 0)) {
            for (Range<Integer> a : rangeArr) {
                Range<Integer> a2 = m1968a(a);
                if (a2.getUpper().intValue() == 30 && (range == null || a2.getLower().intValue() < range.getLower().intValue())) {
                    range = a2;
                }
            }
        }
        return range;
    }

    /* renamed from: b */
    public Range<Integer> mo2208b() {
        return this.f1589a;
    }
}
