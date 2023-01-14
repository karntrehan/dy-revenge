package p027c.p043d.p044a.p046l1.p047m.p048f;

import android.media.MediaFormat;
import android.os.Build;
import androidx.camera.core.impl.C0817h2;

/* renamed from: c.d.a.l1.m.f.h */
public class C1601h implements C0817h2 {
    /* renamed from: a */
    private static boolean m7057a() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: b */
    private static boolean m7058b() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: c */
    private static boolean m7059c() {
        return "Nokia".equalsIgnoreCase(Build.BRAND) && "Nokia 1".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: d */
    private static boolean m7060d() {
        return "positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: f */
    private boolean m7061f(MediaFormat mediaFormat) {
        return mediaFormat.getString("mime").contains("video/");
    }

    /* renamed from: g */
    private static boolean m7062g() {
        return "LGE".equalsIgnoreCase(Build.BRAND) && "LG-X230".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: h */
    private static boolean m7063h() {
        return "infinix".equalsIgnoreCase(Build.BRAND) && "infinix x650".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: i */
    static boolean m7064i() {
        return m7059c() || m7058b() || m7063h() || m7062g() || m7057a() || m7060d();
    }

    /* renamed from: e */
    public boolean mo5768e(MediaFormat mediaFormat) {
        if (m7059c() || m7058b() || m7063h() || m7062g() || m7060d()) {
            return "video/mp4v-es".equals(mediaFormat.getString("mime"));
        }
        if (!m7057a() || !m7061f(mediaFormat)) {
            return false;
        }
        return mediaFormat.getInteger("width") == 3840 && mediaFormat.getInteger("height") == 2160;
    }
}
