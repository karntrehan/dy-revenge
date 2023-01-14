package p027c.p043d.p044a.p046l1.p047m;

import android.media.MediaCodecInfo;
import android.util.Range;

/* renamed from: c.d.a.l1.m.e */
public final class C1593e {
    /* renamed from: a */
    public static Range<Integer>[] m7045a(MediaCodecInfo.AudioCapabilities audioCapabilities) {
        return audioCapabilities.getInputChannelCountRanges();
    }

    /* renamed from: b */
    public static int m7046b(MediaCodecInfo.AudioCapabilities audioCapabilities) {
        return audioCapabilities.getMinInputChannelCount();
    }
}
