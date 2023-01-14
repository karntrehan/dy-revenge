package androidx.camera.core.impl;

import android.media.CamcorderProfile;

/* renamed from: androidx.camera.core.impl.a0 */
public abstract class C0711a0 {

    /* renamed from: a */
    public static int f2222a = -1;

    /* renamed from: a */
    public static C0711a0 m2937a(CamcorderProfile camcorderProfile) {
        return new C0867r(camcorderProfile.duration, camcorderProfile.quality, camcorderProfile.fileFormat, camcorderProfile.videoCodec, camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, camcorderProfile.audioCodec, camcorderProfile.audioBitRate, camcorderProfile.audioSampleRate, camcorderProfile.audioChannels);
    }

    /* renamed from: b */
    public abstract int mo2797b();

    /* renamed from: c */
    public abstract int mo2798c();

    /* renamed from: d */
    public abstract int mo2799d();

    /* renamed from: e */
    public String mo2800e() {
        switch (mo2799d()) {
            case 1:
                return "audio/3gpp";
            case 2:
                return "audio/amr-wb";
            case 3:
            case 4:
            case 5:
                return "audio/mp4a-latm";
            case 6:
                return "audio/vorbis";
            case 7:
                return "audio/opus";
            default:
                return null;
        }
    }

    /* renamed from: f */
    public abstract int mo2801f();

    /* renamed from: g */
    public abstract int mo2802g();

    /* renamed from: h */
    public abstract int mo2803h();

    /* renamed from: i */
    public abstract int mo2804i();

    /* renamed from: j */
    public int mo2805j() {
        int d = mo2799d();
        if (d == 3) {
            return 2;
        }
        if (d == 4) {
            return 5;
        }
        if (d != 5) {
            return f2222a;
        }
        return 39;
    }

    /* renamed from: k */
    public abstract int mo2806k();

    /* renamed from: l */
    public abstract int mo2807l();

    /* renamed from: m */
    public String mo2808m() {
        int l = mo2807l();
        if (l == 1) {
            return "video/3gpp";
        }
        if (l == 2) {
            return "video/avc";
        }
        if (l == 3) {
            return "video/mp4v-es";
        }
        if (l == 4) {
            return "video/x-vnd.on2.vp8";
        }
        if (l != 5) {
            return null;
        }
        return "video/hevc";
    }

    /* renamed from: n */
    public abstract int mo2809n();

    /* renamed from: o */
    public abstract int mo2810o();

    /* renamed from: p */
    public abstract int mo2811p();
}
