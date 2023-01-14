package p027c.p043d.p044a.p046l1.p049n;

import android.util.Range;
import android.util.Rational;
import androidx.camera.core.C0949o2;
import okhttp3.HttpUrl;
import p027c.p043d.p044a.C1559j1;

/* renamed from: c.d.a.l1.n.i */
public final class C1614i {
    /* renamed from: a */
    static int m7093a(C1559j1 j1Var) {
        Range<Integer> d = j1Var.mo5711d();
        if (C1559j1.f4840a.equals(d) || d.contains(30)) {
            C0949o2.m3688a("VideoConfigUtil", "Using single supported VIDEO frame rate: " + 30);
        } else {
            C0949o2.m3698k("VideoConfigUtil", "Requested frame rate range does not include single supported frame rate. Ignoring range. [range: " + d + " supported frame rate: " + 30 + "]");
        }
        return 30;
    }

    /* renamed from: b */
    static int m7094b(int i, int i2, int i3, int i4, int i5, int i6, int i7, Range<Integer> range) {
        String str;
        int doubleValue = (int) (((double) i) * new Rational(i2, i3).doubleValue() * new Rational(i4, i5).doubleValue() * new Rational(i6, i7).doubleValue());
        if (C0949o2.m3693f("VideoConfigUtil")) {
            str = String.format("Base Bitrate(%dbps) * Frame Rate Ratio(%d / %d) * Width Ratio(%d / %d) * Height Ratio(%d / %d) = %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(doubleValue)});
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (!C1559j1.f4841b.equals(range)) {
            doubleValue = range.clamp(Integer.valueOf(doubleValue)).intValue();
            if (C0949o2.m3693f("VideoConfigUtil")) {
                str = str + String.format("\nClamped to range %s -> %dbps", new Object[]{range, Integer.valueOf(doubleValue)});
            }
        }
        C0949o2.m3688a("VideoConfigUtil", str);
        return doubleValue;
    }
}
