package kotlinx.coroutines.internal;

import com.lwansbrough.RCTCamera.RCTCameraModule;

/* renamed from: kotlinx.coroutines.internal.y */
final /* synthetic */ class C10766y {
    /* renamed from: a */
    public static final int m36605a(String str, int i, int i2, int i3) {
        return (int) C10764w.m36598c(str, (long) i, (long) i2, (long) i3);
    }

    /* renamed from: b */
    public static final long m36606b(String str, long j, long j2, long j3) {
        String d = C10764w.m36599d(str);
        if (d == null) {
            return j;
        }
        Long k = C10298o.m34923k(d);
        if (k != null) {
            long longValue = k.longValue();
            boolean z = false;
            if (j2 <= longValue && longValue <= j3) {
                z = true;
            }
            if (z) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + d + '\'').toString());
    }

    /* renamed from: c */
    public static final boolean m36607c(String str, boolean z) {
        String d = C10764w.m36599d(str);
        return d == null ? z : Boolean.parseBoolean(d);
    }

    /* renamed from: d */
    public static /* synthetic */ int m36608d(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
        }
        return C10764w.m36597b(str, i, i2, i3);
    }

    /* renamed from: e */
    public static /* synthetic */ long m36609e(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return C10764w.m36598c(str, j, j4, j3);
    }
}
