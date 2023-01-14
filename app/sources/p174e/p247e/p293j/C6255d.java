package p174e.p247e.p293j;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import p174e.p247e.p253d.p257d.C6049a;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p257d.C6070p;
import p174e.p247e.p293j.C6253c;

/* renamed from: e.e.j.d */
public class C6255d {

    /* renamed from: a */
    private static C6255d f17333a;

    /* renamed from: b */
    private int f17334b;

    /* renamed from: c */
    private List<C6253c.C6254a> f17335c;

    /* renamed from: d */
    private final C6251a f17336d = new C6251a();

    private C6255d() {
        m23717f();
    }

    /* renamed from: b */
    public static C6253c m23713b(InputStream inputStream) {
        return m23715d().mo18572a(inputStream);
    }

    /* renamed from: c */
    public static C6253c m23714c(InputStream inputStream) {
        try {
            return m23713b(inputStream);
        } catch (IOException e) {
            throw C6070p.m22850a(e);
        }
    }

    /* renamed from: d */
    public static synchronized C6255d m23715d() {
        C6255d dVar;
        synchronized (C6255d.class) {
            if (f17333a == null) {
                f17333a = new C6255d();
            }
            dVar = f17333a;
        }
        return dVar;
    }

    /* renamed from: e */
    private static int m23716e(int i, InputStream inputStream, byte[] bArr) {
        C6062k.m22839g(inputStream);
        C6062k.m22839g(bArr);
        C6062k.m22834b(Boolean.valueOf(bArr.length >= i));
        if (!inputStream.markSupported()) {
            return C6049a.m22815b(inputStream, bArr, 0, i);
        }
        try {
            inputStream.mark(i);
            return C6049a.m22815b(inputStream, bArr, 0, i);
        } finally {
            inputStream.reset();
        }
    }

    /* renamed from: f */
    private void m23717f() {
        this.f17334b = this.f17336d.mo18568a();
        List<C6253c.C6254a> list = this.f17335c;
        if (list != null) {
            for (C6253c.C6254a a : list) {
                this.f17334b = Math.max(this.f17334b, a.mo18568a());
            }
        }
    }

    /* renamed from: a */
    public C6253c mo18572a(InputStream inputStream) {
        C6062k.m22839g(inputStream);
        int i = this.f17334b;
        byte[] bArr = new byte[i];
        int e = m23716e(i, inputStream, bArr);
        C6253c b = this.f17336d.mo18569b(bArr, e);
        if (b != null && b != C6253c.f17330a) {
            return b;
        }
        List<C6253c.C6254a> list = this.f17335c;
        if (list != null) {
            for (C6253c.C6254a b2 : list) {
                C6253c b3 = b2.mo18569b(bArr, e);
                if (b3 != null && b3 != C6253c.f17330a) {
                    return b3;
                }
            }
        }
        return C6253c.f17330a;
    }
}
