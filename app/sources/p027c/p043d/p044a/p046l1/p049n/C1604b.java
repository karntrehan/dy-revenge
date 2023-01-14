package p027c.p043d.p044a.p046l1.p049n;

import android.util.Range;
import android.util.Rational;
import androidx.camera.core.C0949o2;
import java.util.ArrayList;
import java.util.Collections;
import okhttp3.HttpUrl;
import p027c.p043d.p044a.C1521d0;
import p027c.p043d.p044a.p046l1.C1572g;

/* renamed from: c.d.a.l1.n.b */
public final class C1604b {
    /* renamed from: a */
    static /* synthetic */ int m7070a(int i, Integer num, Integer num2) {
        int abs = Math.abs(num.intValue() - i) - Math.abs(num2.intValue() - i);
        return (int) Math.signum(abs == 0 ? (float) (num.intValue() - num2.intValue()) : (float) abs);
    }

    /* renamed from: b */
    static int m7071b(C1521d0 d0Var) {
        String str;
        StringBuilder sb;
        int e = d0Var.mo5637e();
        if (e == -1) {
            e = 5;
            sb = new StringBuilder();
            str = "Using default AUDIO source: ";
        } else {
            sb = new StringBuilder();
            str = "Using provided AUDIO source: ";
        }
        sb.append(str);
        sb.append(e);
        C0949o2.m3688a("AudioConfigUtil", sb.toString());
        return e;
    }

    /* renamed from: c */
    static int m7072c(C1521d0 d0Var) {
        String str;
        StringBuilder sb;
        int f = d0Var.mo5638f();
        if (f == -1) {
            f = 2;
            sb = new StringBuilder();
            str = "Using default AUDIO source format: ";
        } else {
            sb = new StringBuilder();
            str = "Using provided AUDIO source format: ";
        }
        sb.append(str);
        sb.append(f);
        C0949o2.m3688a("AudioConfigUtil", sb.toString());
        return f;
    }

    /* renamed from: d */
    static int m7073d(int i, int i2, int i3, int i4, int i5, Range<Integer> range) {
        String str;
        int doubleValue = (int) (((double) i) * new Rational(i2, i3).doubleValue() * new Rational(i4, i5).doubleValue());
        if (C0949o2.m3693f("AudioConfigUtil")) {
            str = String.format("Base Bitrate(%dbps) * Channel Count Ratio(%d / %d) * Sample Rate Ratio(%d / %d) = %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(doubleValue)});
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (!C1521d0.f4767a.equals(range)) {
            doubleValue = range.clamp(Integer.valueOf(doubleValue)).intValue();
            if (C0949o2.m3693f("AudioConfigUtil")) {
                str = str + String.format("\nClamped to range %s -> %dbps", new Object[]{range, Integer.valueOf(doubleValue)});
            }
        }
        C0949o2.m3688a("AudioConfigUtil", str);
        return doubleValue;
    }

    /* renamed from: e */
    static int m7074e(Range<Integer> range, int i, int i2, int i3) {
        StringBuilder sb;
        ArrayList arrayList = null;
        int i4 = 0;
        int i5 = i3;
        while (true) {
            if (!range.contains(Integer.valueOf(i5))) {
                sb = new StringBuilder();
                sb.append("Sample rate ");
                sb.append(i5);
                sb.append("Hz is not in target range ");
                sb.append(range);
            } else if (C1572g.m6975d(i5, i, i2)) {
                return i5;
            } else {
                sb = new StringBuilder();
                sb.append("Sample rate ");
                sb.append(i5);
                sb.append("Hz is not supported by audio source with channel count ");
                sb.append(i);
                sb.append(" and source format ");
                sb.append(i2);
            }
            C0949o2.m3688a("AudioConfigUtil", sb.toString());
            if (arrayList == null) {
                C0949o2.m3688a("AudioConfigUtil", "Trying common sample rates in proximity order to target " + i3 + "Hz");
                arrayList = new ArrayList(C1572g.f4862a);
                Collections.sort(arrayList, new C1603a(i3));
            }
            if (i4 < arrayList.size()) {
                int i6 = i4 + 1;
                i5 = ((Integer) arrayList.get(i4)).intValue();
                i4 = i6;
            } else {
                C0949o2.m3688a("AudioConfigUtil", "No sample rate found in target range or supported by audio source. Falling back to default sample rate of 44100Hz");
                return 44100;
            }
        }
    }
}
