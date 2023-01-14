package okhttp3;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.concurrent.TimeUnit;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

public final class CacheControl {
    public static final Companion Companion = new Companion((C10452g) null);
    public static final CacheControl FORCE_CACHE = new Builder().onlyIfCached().maxStale(RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO, TimeUnit.SECONDS).build();
    public static final CacheControl FORCE_NETWORK = new Builder().noCache().build();
    private String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;

    public static final class Builder {
        private boolean immutable;
        private int maxAgeSeconds = -1;
        private int maxStaleSeconds = -1;
        private int minFreshSeconds = -1;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        private final int clampToInt(long j) {
            return j > ((long) RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO) ? RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO : (int) j;
        }

        public final CacheControl build() {
            return new CacheControl(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, (String) null, (C10452g) null);
        }

        public final Builder immutable() {
            this.immutable = true;
            return this;
        }

        public final Builder maxAge(int i, TimeUnit timeUnit) {
            C10457l.m35320e(timeUnit, "timeUnit");
            if (i >= 0) {
                this.maxAgeSeconds = clampToInt(timeUnit.toSeconds((long) i));
                return this;
            }
            throw new IllegalArgumentException(("maxAge < 0: " + i).toString());
        }

        public final Builder maxStale(int i, TimeUnit timeUnit) {
            C10457l.m35320e(timeUnit, "timeUnit");
            if (i >= 0) {
                this.maxStaleSeconds = clampToInt(timeUnit.toSeconds((long) i));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i).toString());
        }

        public final Builder minFresh(int i, TimeUnit timeUnit) {
            C10457l.m35320e(timeUnit, "timeUnit");
            if (i >= 0) {
                this.minFreshSeconds = clampToInt(timeUnit.toSeconds((long) i));
                return this;
            }
            throw new IllegalArgumentException(("minFresh < 0: " + i).toString());
        }

        public final Builder noCache() {
            this.noCache = true;
            return this;
        }

        public final Builder noStore() {
            this.noStore = true;
            return this;
        }

        public final Builder noTransform() {
            this.noTransform = true;
            return this;
        }

        public final Builder onlyIfCached() {
            this.onlyIfCached = true;
            return this;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10452g gVar) {
            this();
        }

        private final int indexOfElement(String str, String str2, int i) {
            int length = str.length();
            while (i < length) {
                if (C10300q.m34949F(str2, str.charAt(i), false, 2, (Object) null)) {
                    return i;
                }
                i++;
            }
            return str.length();
        }

        static /* synthetic */ int indexOfElement$default(Companion companion, String str, String str2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return companion.indexOfElement(str, str2, i);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00d9  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00dd  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final okhttp3.CacheControl parse(okhttp3.Headers r32) {
            /*
                r31 = this;
                r0 = r31
                r1 = r32
                java.lang.String r2 = "headers"
                p455g.p470y.p472d.C10457l.m35320e(r1, r2)
                int r2 = r32.size()
                r6 = 1
                r7 = 0
                r8 = 1
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = -1
                r13 = -1
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = -1
                r18 = -1
                r19 = 0
                r20 = 0
                r21 = 0
            L_0x0023:
                if (r7 >= r2) goto L_0x0181
                java.lang.String r3 = r1.name(r7)
                java.lang.String r5 = r1.value(r7)
                java.lang.String r4 = "Cache-Control"
                boolean r4 = p455g.p459d0.C10299p.m34929o(r3, r4, r6)
                if (r4 == 0) goto L_0x003a
                if (r9 == 0) goto L_0x0038
                goto L_0x0042
            L_0x0038:
                r9 = r5
                goto L_0x0043
            L_0x003a:
                java.lang.String r4 = "Pragma"
                boolean r3 = p455g.p459d0.C10299p.m34929o(r3, r4, r6)
                if (r3 == 0) goto L_0x0176
            L_0x0042:
                r8 = 0
            L_0x0043:
                r3 = 0
            L_0x0044:
                int r4 = r5.length()
                if (r3 >= r4) goto L_0x0171
                java.lang.String r4 = "=,;"
                int r4 = r0.indexOfElement(r5, r4, r3)
                java.lang.String r3 = r5.substring(r3, r4)
                java.lang.String r6 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                p455g.p470y.p472d.C10457l.m35319d(r3, r6)
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.CharSequence"
                java.util.Objects.requireNonNull(r3, r1)
                java.lang.CharSequence r3 = p455g.p459d0.C10300q.m34948E0(r3)
                java.lang.String r3 = r3.toString()
                r29 = r2
                int r2 = r5.length()
                if (r4 == r2) goto L_0x00cb
                char r2 = r5.charAt(r4)
                r30 = r8
                r8 = 44
                if (r2 == r8) goto L_0x00cd
                char r2 = r5.charAt(r4)
                r8 = 59
                if (r2 != r8) goto L_0x0081
                goto L_0x00cd
            L_0x0081:
                int r4 = r4 + 1
                int r2 = okhttp3.internal.Util.indexOfNonWhitespace(r5, r4)
                int r4 = r5.length()
                if (r2 >= r4) goto L_0x00b2
                char r4 = r5.charAt(r2)
                r8 = 34
                if (r4 != r8) goto L_0x00b2
                int r2 = r2 + 1
                r24 = 34
                r26 = 0
                r27 = 4
                r28 = 0
                r23 = r5
                r25 = r2
                int r1 = p455g.p459d0.C10300q.m34960Q(r23, r24, r25, r26, r27, r28)
                java.lang.String r2 = r5.substring(r2, r1)
                p455g.p470y.p472d.C10457l.m35319d(r2, r6)
                r4 = 1
                int r1 = r1 + r4
                r4 = r1
                goto L_0x00d0
            L_0x00b2:
                java.lang.String r4 = ",;"
                int r4 = r0.indexOfElement(r5, r4, r2)
                java.lang.String r2 = r5.substring(r2, r4)
                p455g.p470y.p472d.C10457l.m35319d(r2, r6)
                java.util.Objects.requireNonNull(r2, r1)
                java.lang.CharSequence r1 = p455g.p459d0.C10300q.m34948E0(r2)
                java.lang.String r2 = r1.toString()
                goto L_0x00d0
            L_0x00cb:
                r30 = r8
            L_0x00cd:
                int r4 = r4 + 1
                r2 = 0
            L_0x00d0:
                java.lang.String r1 = "no-cache"
                r6 = 1
                boolean r1 = p455g.p459d0.C10299p.m34929o(r1, r3, r6)
                if (r1 == 0) goto L_0x00dd
                r1 = -1
                r10 = 1
                goto L_0x0168
            L_0x00dd:
                java.lang.String r1 = "no-store"
                boolean r1 = p455g.p459d0.C10299p.m34929o(r1, r3, r6)
                if (r1 == 0) goto L_0x00e9
                r1 = -1
                r11 = 1
                goto L_0x0168
            L_0x00e9:
                java.lang.String r1 = "max-age"
                boolean r1 = p455g.p459d0.C10299p.m34929o(r1, r3, r6)
                if (r1 == 0) goto L_0x00f8
                r1 = -1
                int r12 = okhttp3.internal.Util.toNonNegativeInt(r2, r1)
                goto L_0x0168
            L_0x00f8:
                r1 = -1
                java.lang.String r8 = "s-maxage"
                boolean r8 = p455g.p459d0.C10299p.m34929o(r8, r3, r6)
                if (r8 == 0) goto L_0x0106
                int r13 = okhttp3.internal.Util.toNonNegativeInt(r2, r1)
                goto L_0x0168
            L_0x0106:
                java.lang.String r1 = "private"
                boolean r1 = p455g.p459d0.C10299p.m34929o(r1, r3, r6)
                if (r1 == 0) goto L_0x0111
                r1 = -1
                r14 = 1
                goto L_0x0168
            L_0x0111:
                java.lang.String r1 = "public"
                boolean r1 = p455g.p459d0.C10299p.m34929o(r1, r3, r6)
                if (r1 == 0) goto L_0x011c
                r1 = -1
                r15 = 1
                goto L_0x0168
            L_0x011c:
                java.lang.String r1 = "must-revalidate"
                boolean r1 = p455g.p459d0.C10299p.m34929o(r1, r3, r6)
                if (r1 == 0) goto L_0x0128
                r1 = -1
                r16 = 1
                goto L_0x0168
            L_0x0128:
                java.lang.String r1 = "max-stale"
                boolean r1 = p455g.p459d0.C10299p.m34929o(r1, r3, r6)
                if (r1 == 0) goto L_0x0139
                r1 = 2147483647(0x7fffffff, float:NaN)
                int r17 = okhttp3.internal.Util.toNonNegativeInt(r2, r1)
                r1 = -1
                goto L_0x0168
            L_0x0139:
                java.lang.String r1 = "min-fresh"
                boolean r1 = p455g.p459d0.C10299p.m34929o(r1, r3, r6)
                if (r1 == 0) goto L_0x0147
                r1 = -1
                int r18 = okhttp3.internal.Util.toNonNegativeInt(r2, r1)
                goto L_0x0168
            L_0x0147:
                r1 = -1
                java.lang.String r2 = "only-if-cached"
                boolean r2 = p455g.p459d0.C10299p.m34929o(r2, r3, r6)
                if (r2 == 0) goto L_0x0153
                r19 = 1
                goto L_0x0168
            L_0x0153:
                java.lang.String r2 = "no-transform"
                boolean r2 = p455g.p459d0.C10299p.m34929o(r2, r3, r6)
                if (r2 == 0) goto L_0x015e
                r20 = 1
                goto L_0x0168
            L_0x015e:
                java.lang.String r2 = "immutable"
                boolean r2 = p455g.p459d0.C10299p.m34929o(r2, r3, r6)
                if (r2 == 0) goto L_0x0168
                r21 = 1
            L_0x0168:
                r1 = r32
                r3 = r4
                r2 = r29
                r8 = r30
                goto L_0x0044
            L_0x0171:
                r29 = r2
                r30 = r8
                goto L_0x0178
            L_0x0176:
                r29 = r2
            L_0x0178:
                r1 = -1
                int r7 = r7 + 1
                r1 = r32
                r2 = r29
                goto L_0x0023
            L_0x0181:
                if (r8 != 0) goto L_0x0186
                r22 = 0
                goto L_0x0188
            L_0x0186:
                r22 = r9
            L_0x0188:
                okhttp3.CacheControl r1 = new okhttp3.CacheControl
                r23 = 0
                r9 = r1
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CacheControl.Companion.parse(okhttp3.Headers):okhttp3.CacheControl");
        }
    }

    private CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.noCache = z;
        this.noStore = z2;
        this.maxAgeSeconds = i;
        this.sMaxAgeSeconds = i2;
        this.isPrivate = z3;
        this.isPublic = z4;
        this.mustRevalidate = z5;
        this.maxStaleSeconds = i3;
        this.minFreshSeconds = i4;
        this.onlyIfCached = z6;
        this.noTransform = z7;
        this.immutable = z8;
        this.headerValue = str;
    }

    public /* synthetic */ CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str, C10452g gVar) {
        this(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, z8, str);
    }

    public static final CacheControl parse(Headers headers) {
        return Companion.parse(headers);
    }

    /* renamed from: -deprecated_immutable  reason: not valid java name */
    public final boolean m37341deprecated_immutable() {
        return this.immutable;
    }

    /* renamed from: -deprecated_maxAgeSeconds  reason: not valid java name */
    public final int m37342deprecated_maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    /* renamed from: -deprecated_maxStaleSeconds  reason: not valid java name */
    public final int m37343deprecated_maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    /* renamed from: -deprecated_minFreshSeconds  reason: not valid java name */
    public final int m37344deprecated_minFreshSeconds() {
        return this.minFreshSeconds;
    }

    /* renamed from: -deprecated_mustRevalidate  reason: not valid java name */
    public final boolean m37345deprecated_mustRevalidate() {
        return this.mustRevalidate;
    }

    /* renamed from: -deprecated_noCache  reason: not valid java name */
    public final boolean m37346deprecated_noCache() {
        return this.noCache;
    }

    /* renamed from: -deprecated_noStore  reason: not valid java name */
    public final boolean m37347deprecated_noStore() {
        return this.noStore;
    }

    /* renamed from: -deprecated_noTransform  reason: not valid java name */
    public final boolean m37348deprecated_noTransform() {
        return this.noTransform;
    }

    /* renamed from: -deprecated_onlyIfCached  reason: not valid java name */
    public final boolean m37349deprecated_onlyIfCached() {
        return this.onlyIfCached;
    }

    /* renamed from: -deprecated_sMaxAgeSeconds  reason: not valid java name */
    public final int m37350deprecated_sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public final boolean immutable() {
        return this.immutable;
    }

    public final boolean isPrivate() {
        return this.isPrivate;
    }

    public final boolean isPublic() {
        return this.isPublic;
    }

    public final int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    public final int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    public final int minFreshSeconds() {
        return this.minFreshSeconds;
    }

    public final boolean mustRevalidate() {
        return this.mustRevalidate;
    }

    public final boolean noCache() {
        return this.noCache;
    }

    public final boolean noStore() {
        return this.noStore;
    }

    public final boolean noTransform() {
        return this.noTransform;
    }

    public final boolean onlyIfCached() {
        return this.onlyIfCached;
    }

    public final int sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public String toString() {
        String str = this.headerValue;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.noCache) {
            sb.append("no-cache, ");
        }
        if (this.noStore) {
            sb.append("no-store, ");
        }
        if (this.maxAgeSeconds != -1) {
            sb.append("max-age=");
            sb.append(this.maxAgeSeconds);
            sb.append(", ");
        }
        if (this.sMaxAgeSeconds != -1) {
            sb.append("s-maxage=");
            sb.append(this.sMaxAgeSeconds);
            sb.append(", ");
        }
        if (this.isPrivate) {
            sb.append("private, ");
        }
        if (this.isPublic) {
            sb.append("public, ");
        }
        if (this.mustRevalidate) {
            sb.append("must-revalidate, ");
        }
        if (this.maxStaleSeconds != -1) {
            sb.append("max-stale=");
            sb.append(this.maxStaleSeconds);
            sb.append(", ");
        }
        if (this.minFreshSeconds != -1) {
            sb.append("min-fresh=");
            sb.append(this.minFreshSeconds);
            sb.append(", ");
        }
        if (this.onlyIfCached) {
            sb.append("only-if-cached, ");
        }
        if (this.noTransform) {
            sb.append("no-transform, ");
        }
        if (this.immutable) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        C10457l.m35319d(sb2, "StringBuilder().apply(builderAction).toString()");
        this.headerValue = sb2;
        return sb2;
    }
}
