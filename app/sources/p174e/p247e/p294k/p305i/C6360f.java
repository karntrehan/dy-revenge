package p174e.p247e.p294k.p305i;

import java.io.IOException;
import java.io.InputStream;
import okhttp3.internal.http2.Http2;
import p174e.p247e.p253d.p257d.C6050b;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p257d.C6070p;
import p174e.p247e.p253d.p260g.C6076a;
import p174e.p247e.p253d.p260g.C6081f;
import p174e.p247e.p253d.p264k.C6108d;
import p174e.p247e.p294k.p307k.C6369d;

/* renamed from: e.e.k.i.f */
public class C6360f {

    /* renamed from: a */
    private int f17738a = 0;

    /* renamed from: b */
    private int f17739b = 0;

    /* renamed from: c */
    private int f17740c = 0;

    /* renamed from: d */
    private int f17741d = 0;

    /* renamed from: e */
    private int f17742e = 0;

    /* renamed from: f */
    private int f17743f = 0;

    /* renamed from: g */
    private boolean f17744g;

    /* renamed from: h */
    private final C6076a f17745h;

    public C6360f(C6076a aVar) {
        this.f17745h = (C6076a) C6062k.m22839g(aVar);
    }

    /* renamed from: a */
    private boolean m24273a(InputStream inputStream) {
        int read;
        int i = this.f17742e;
        while (this.f17738a != 6 && (read = inputStream.read()) != -1) {
            try {
                int i2 = this.f17740c + 1;
                this.f17740c = i2;
                if (this.f17744g) {
                    this.f17738a = 6;
                    this.f17744g = false;
                    return false;
                }
                int i3 = this.f17738a;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 == 4) {
                                    this.f17738a = 5;
                                } else if (i3 != 5) {
                                    C6062k.m22841i(false);
                                } else {
                                    int i4 = ((this.f17739b << 8) + read) - 2;
                                    C6108d.m22993a(inputStream, (long) i4);
                                    this.f17740c += i4;
                                }
                                this.f17739b = read;
                            } else if (read != 255) {
                                if (read != 0) {
                                    if (read == 217) {
                                        this.f17744g = true;
                                        m24275f(i2 - 2);
                                    } else {
                                        if (read == 218) {
                                            m24275f(i2 - 2);
                                        }
                                        if (m24274b(read)) {
                                            this.f17738a = 4;
                                            this.f17739b = read;
                                        }
                                    }
                                }
                            }
                        } else if (read != 255) {
                            this.f17739b = read;
                        }
                        this.f17738a = 3;
                        this.f17739b = read;
                    } else if (read == 216) {
                    }
                    this.f17738a = 2;
                    this.f17739b = read;
                } else if (read == 255) {
                    this.f17738a = 1;
                    this.f17739b = read;
                }
                this.f17738a = 6;
                this.f17739b = read;
            } catch (IOException e) {
                C6070p.m22850a(e);
            }
        }
        return (this.f17738a == 6 || this.f17742e == i) ? false : true;
    }

    /* renamed from: b */
    private static boolean m24274b(int i) {
        if (i == 1) {
            return false;
        }
        return ((i >= 208 && i <= 215) || i == 217 || i == 216) ? false : true;
    }

    /* renamed from: f */
    private void m24275f(int i) {
        int i2 = this.f17741d;
        if (i2 > 0) {
            this.f17743f = i;
        }
        this.f17741d = i2 + 1;
        this.f17742e = i2;
    }

    /* renamed from: c */
    public int mo18862c() {
        return this.f17743f;
    }

    /* renamed from: d */
    public int mo18863d() {
        return this.f17742e;
    }

    /* renamed from: e */
    public boolean mo18864e() {
        return this.f17744g;
    }

    /* renamed from: g */
    public boolean mo18865g(C6369d dVar) {
        if (this.f17738a == 6 || dVar.mo18902s0() <= this.f17740c) {
            return false;
        }
        C6081f fVar = new C6081f(dVar.mo18897e0(), (byte[]) this.f17745h.get(Http2.INITIAL_MAX_FRAME_SIZE), this.f17745h);
        try {
            C6108d.m22993a(fVar, (long) this.f17740c);
            return m24273a(fVar);
        } catch (IOException e) {
            C6070p.m22850a(e);
            return false;
        } finally {
            C6050b.m22817b(fVar);
        }
    }
}
