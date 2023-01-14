package p174e.p319f.p416e.p436x.p437b;

import com.lwansbrough.RCTCamera.RCTCameraModule;

/* renamed from: e.f.e.x.b.g */
final class C9799g {

    /* renamed from: a */
    private static final int[][] f26242a = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* renamed from: b */
    private final C9798f f26243b;

    /* renamed from: c */
    private final byte f26244c;

    private C9799g(int i) {
        this.f26243b = C9798f.m33464e((i >> 3) & 3);
        this.f26244c = (byte) (i & 7);
    }

    /* renamed from: a */
    static C9799g m33465a(int i, int i2) {
        C9799g b = m33466b(i, i2);
        return b != null ? b : m33466b(i ^ 21522, i2 ^ 21522);
    }

    /* renamed from: b */
    private static C9799g m33466b(int i, int i2) {
        int e;
        int i3 = RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
        int i4 = 0;
        for (int[] iArr : f26242a) {
            int i5 = iArr[0];
            if (i5 == i || i5 == i2) {
                return new C9799g(iArr[1]);
            }
            int e2 = m33467e(i, i5);
            if (e2 < i3) {
                i4 = iArr[1];
                i3 = e2;
            }
            if (i != i2 && (e = m33467e(i2, i5)) < i3) {
                i4 = iArr[1];
                i3 = e;
            }
        }
        if (i3 <= 3) {
            return new C9799g(i4);
        }
        return null;
    }

    /* renamed from: e */
    static int m33467e(int i, int i2) {
        return Integer.bitCount(i ^ i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public byte mo24519c() {
        return this.f26244c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C9798f mo24520d() {
        return this.f26243b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9799g)) {
            return false;
        }
        C9799g gVar = (C9799g) obj;
        return this.f26243b == gVar.f26243b && this.f26244c == gVar.f26244c;
    }

    public int hashCode() {
        return (this.f26243b.ordinal() << 3) | this.f26244c;
    }
}
