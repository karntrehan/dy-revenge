package p027c.p043d.p044a.p046l1;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Build;
import android.text.TextUtils;
import androidx.camera.core.C0949o2;
import androidx.core.util.C1177h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p027c.p043d.p044a.p046l1.p047m.C1591c;
import p027c.p043d.p044a.p046l1.p047m.C1593e;

/* renamed from: c.d.a.l1.k */
public final class C1587k {
    /* renamed from: a */
    private static void m7029a(MediaCodecInfo.AudioCapabilities audioCapabilities, MediaFormat mediaFormat) {
        C0949o2.m3688a("DebugUtils", "[AudioCaps] getBitrateRange = " + audioCapabilities.getBitrateRange());
        C0949o2.m3688a("DebugUtils", "[AudioCaps] getMaxInputChannelCount = " + audioCapabilities.getMaxInputChannelCount());
        if (Build.VERSION.SDK_INT >= 31) {
            C0949o2.m3688a("DebugUtils", "[AudioCaps] getMinInputChannelCount = " + C1593e.m7046b(audioCapabilities));
            C0949o2.m3688a("DebugUtils", "[AudioCaps] getInputChannelCountRanges = " + Arrays.toString(C1593e.m7045a(audioCapabilities)));
        }
        C0949o2.m3688a("DebugUtils", "[AudioCaps] getSupportedSampleRateRanges = " + Arrays.toString(audioCapabilities.getSupportedSampleRateRanges()));
        C0949o2.m3688a("DebugUtils", "[AudioCaps] getSupportedSampleRates = " + Arrays.toString(audioCapabilities.getSupportedSampleRates()));
        try {
            int integer = mediaFormat.getInteger("sample-rate");
            C0949o2.m3688a("DebugUtils", "[AudioCaps] isSampleRateSupported for " + integer + " = " + audioCapabilities.isSampleRateSupported(integer));
        } catch (IllegalArgumentException | NullPointerException unused) {
            C0949o2.m3698k("DebugUtils", "[AudioCaps] mediaFormat does not contain sample rate");
        }
    }

    /* renamed from: b */
    private static void m7030b(MediaCodecInfo.CodecCapabilities codecCapabilities, MediaFormat mediaFormat) {
        C0949o2.m3688a("DebugUtils", "[CodecCaps] isFormatSupported = " + codecCapabilities.isFormatSupported(mediaFormat));
        C0949o2.m3688a("DebugUtils", "[CodecCaps] getDefaultFormat = " + codecCapabilities.getDefaultFormat());
        if (codecCapabilities.profileLevels != null) {
            StringBuilder sb = new StringBuilder("[");
            ArrayList arrayList = new ArrayList();
            for (MediaCodecInfo.CodecProfileLevel i : codecCapabilities.profileLevels) {
                arrayList.add(m7037i(i));
            }
            sb.append(TextUtils.join(", ", arrayList));
            sb.append("]");
            C0949o2.m3688a("DebugUtils", "[CodecCaps] profileLevels = " + sb);
        }
        if (codecCapabilities.colorFormats != null) {
            C0949o2.m3688a("DebugUtils", "[CodecCaps] colorFormats = " + Arrays.toString(codecCapabilities.colorFormats));
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities != null) {
            m7033e(videoCapabilities, mediaFormat);
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities != null) {
            m7029a(audioCapabilities, mediaFormat);
        }
        MediaCodecInfo.EncoderCapabilities encoderCapabilities = codecCapabilities.getEncoderCapabilities();
        if (encoderCapabilities != null) {
            m7031c(encoderCapabilities, mediaFormat);
        }
    }

    /* renamed from: c */
    private static void m7031c(MediaCodecInfo.EncoderCapabilities encoderCapabilities, MediaFormat mediaFormat) {
        C0949o2.m3688a("DebugUtils", "[EncoderCaps] getComplexityRange = " + encoderCapabilities.getComplexityRange());
        if (Build.VERSION.SDK_INT >= 28) {
            C0949o2.m3688a("DebugUtils", "[EncoderCaps] getQualityRange = " + C1591c.m7041a(encoderCapabilities));
        }
        try {
            int integer = mediaFormat.getInteger("bitrate-mode");
            C0949o2.m3688a("DebugUtils", "[EncoderCaps] isBitrateModeSupported = " + encoderCapabilities.isBitrateModeSupported(integer));
        } catch (IllegalArgumentException | NullPointerException unused) {
            C0949o2.m3698k("DebugUtils", "[EncoderCaps] mediaFormat does not contain bitrate mode");
        }
    }

    /* renamed from: d */
    public static void m7032d(MediaCodecList mediaCodecList, MediaFormat mediaFormat) {
        C0949o2.m3688a("DebugUtils", "[Start] Dump MediaCodecList for mediaFormat " + mediaFormat);
        String string = mediaFormat.getString("mime");
        for (MediaCodecInfo mediaCodecInfo : mediaCodecList.getCodecInfos()) {
            if (mediaCodecInfo.isEncoder()) {
                boolean z = true;
                try {
                    C1177h.m4579a(string != null);
                    MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(string);
                    if (capabilitiesForType == null) {
                        z = false;
                    }
                    C1177h.m4579a(z);
                    C0949o2.m3688a("DebugUtils", "[Start] [" + mediaCodecInfo.getName() + "]");
                    m7030b(capabilitiesForType, mediaFormat);
                    C0949o2.m3688a("DebugUtils", "[End] [" + mediaCodecInfo.getName() + "]");
                } catch (IllegalArgumentException unused) {
                    C0949o2.m3698k("DebugUtils", "[" + mediaCodecInfo.getName() + "] does not support mime " + string);
                }
            }
        }
        C0949o2.m3688a("DebugUtils", "[End] Dump MediaCodecList");
    }

    /* renamed from: e */
    private static void m7033e(MediaCodecInfo.VideoCapabilities videoCapabilities, MediaFormat mediaFormat) {
        boolean z;
        int i;
        int i2;
        C0949o2.m3688a("DebugUtils", "[VideoCaps] getBitrateRange = " + videoCapabilities.getBitrateRange());
        C0949o2.m3688a("DebugUtils", "[VideoCaps] getSupportedWidths = " + videoCapabilities.getSupportedWidths() + ", getWidthAlignment = " + videoCapabilities.getWidthAlignment());
        C0949o2.m3688a("DebugUtils", "[VideoCaps] getSupportedHeights = " + videoCapabilities.getSupportedHeights() + ", getHeightAlignment = " + videoCapabilities.getHeightAlignment());
        boolean z2 = true;
        int i3 = 0;
        try {
            i2 = mediaFormat.getInteger("width");
            i = mediaFormat.getInteger("height");
            C1177h.m4579a(i2 > 0 && i > 0);
            z = true;
        } catch (IllegalArgumentException | NullPointerException unused) {
            C0949o2.m3698k("DebugUtils", "[VideoCaps] mediaFormat does not contain valid width and height");
            i2 = 0;
            i = 0;
            z = false;
        }
        if (z) {
            try {
                C0949o2.m3688a("DebugUtils", "[VideoCaps] getSupportedHeightsFor " + i2 + " = " + videoCapabilities.getSupportedHeightsFor(i2));
            } catch (IllegalArgumentException e) {
                C0949o2.m3699l("DebugUtils", "[VideoCaps] could not getSupportedHeightsFor " + i2, e);
            }
            try {
                C0949o2.m3688a("DebugUtils", "[VideoCaps] getSupportedWidthsFor " + i + " = " + videoCapabilities.getSupportedWidthsFor(i));
            } catch (IllegalArgumentException e2) {
                C0949o2.m3699l("DebugUtils", "[VideoCaps] could not getSupportedWidthsFor " + i, e2);
            }
            C0949o2.m3688a("DebugUtils", "[VideoCaps] isSizeSupported for " + i2 + "x" + i + " = " + videoCapabilities.isSizeSupported(i2, i));
        }
        C0949o2.m3688a("DebugUtils", "[VideoCaps] getSupportedFrameRates = " + videoCapabilities.getSupportedFrameRates());
        try {
            int integer = mediaFormat.getInteger("frame-rate");
            if (integer <= 0) {
                z2 = false;
            }
            C1177h.m4579a(z2);
            i3 = integer;
        } catch (IllegalArgumentException | NullPointerException unused2) {
            C0949o2.m3698k("DebugUtils", "[VideoCaps] mediaFormat does not contain frame rate");
        }
        if (z) {
            C0949o2.m3688a("DebugUtils", "[VideoCaps] getSupportedFrameRatesFor " + i2 + "x" + i + " = " + videoCapabilities.getSupportedFrameRatesFor(i2, i));
        }
        if (z && i3 > 0) {
            C0949o2.m3688a("DebugUtils", "[VideoCaps] areSizeAndRateSupported for " + i2 + "x" + i + ", " + i3 + " = " + videoCapabilities.areSizeAndRateSupported(i2, i, (double) i3));
        }
    }

    /* renamed from: f */
    private static String m7034f(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(j);
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        long minutes = timeUnit.toMinutes(j - timeUnit2.toMillis(hours));
        TimeUnit timeUnit3 = TimeUnit.MINUTES;
        long seconds = timeUnit.toSeconds((j - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes));
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", new Object[]{Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(((j - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds))});
    }

    /* renamed from: g */
    public static String m7035g(long j) {
        return m7034f(j);
    }

    /* renamed from: h */
    public static String m7036h(long j) {
        return m7035g(TimeUnit.MICROSECONDS.toMillis(j));
    }

    /* renamed from: i */
    private static String m7037i(MediaCodecInfo.CodecProfileLevel codecProfileLevel) {
        if (codecProfileLevel == null) {
            return "null";
        }
        return String.format("{level=%d, profile=%d}", new Object[]{Integer.valueOf(codecProfileLevel.level), Integer.valueOf(codecProfileLevel.profile)});
    }
}
