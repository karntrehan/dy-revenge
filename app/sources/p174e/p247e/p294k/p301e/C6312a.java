package p174e.p247e.p294k.p301e;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.Locale;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p264k.C6106b;

/* renamed from: e.e.k.e.a */
public class C6312a {

    /* renamed from: a */
    private static Pattern f17438a;

    /* renamed from: b */
    public final int f17439b;

    /* renamed from: c */
    public final int f17440c;

    public C6312a(int i, int i2) {
        this.f17439b = i;
        this.f17440c = i2;
    }

    /* renamed from: b */
    public static C6312a m23904b(int i) {
        C6062k.m22834b(Boolean.valueOf(i >= 0));
        return new C6312a(i, RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO);
    }

    /* renamed from: c */
    public static C6312a m23905c(String str) {
        if (str == null) {
            return null;
        }
        if (f17438a == null) {
            f17438a = Pattern.compile("[-/ ]");
        }
        try {
            String[] split = f17438a.split(str);
            C6062k.m22834b(Boolean.valueOf(split.length == 4));
            C6062k.m22834b(Boolean.valueOf(split[0].equals("bytes")));
            int parseInt = Integer.parseInt(split[1]);
            int parseInt2 = Integer.parseInt(split[2]);
            int parseInt3 = Integer.parseInt(split[3]);
            C6062k.m22834b(Boolean.valueOf(parseInt2 > parseInt));
            C6062k.m22834b(Boolean.valueOf(parseInt3 > parseInt2));
            return parseInt2 < parseInt3 - 1 ? new C6312a(parseInt, parseInt2) : new C6312a(parseInt, RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(String.format((Locale) null, "Invalid Content-Range header value: \"%s\"", new Object[]{str}), e);
        }
    }

    /* renamed from: e */
    public static C6312a m23906e(int i) {
        C6062k.m22834b(Boolean.valueOf(i > 0));
        return new C6312a(0, i);
    }

    /* renamed from: f */
    private static String m23907f(int i) {
        return i == Integer.MAX_VALUE ? HttpUrl.FRAGMENT_ENCODE_SET : Integer.toString(i);
    }

    /* renamed from: a */
    public boolean mo18665a(C6312a aVar) {
        return aVar != null && this.f17439b <= aVar.f17439b && this.f17440c >= aVar.f17440c;
    }

    /* renamed from: d */
    public String mo18666d() {
        return String.format((Locale) null, "bytes=%s-%s", new Object[]{m23907f(this.f17439b), m23907f(this.f17440c)});
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6312a)) {
            return false;
        }
        C6312a aVar = (C6312a) obj;
        return this.f17439b == aVar.f17439b && this.f17440c == aVar.f17440c;
    }

    public int hashCode() {
        return C6106b.m22988a(this.f17439b, this.f17440c);
    }

    public String toString() {
        return String.format((Locale) null, "%s-%s", new Object[]{m23907f(this.f17439b), m23907f(this.f17440c)});
    }
}
