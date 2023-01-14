package com.facebook.imagepipeline.nativecode;

import java.io.InputStream;
import java.io.OutputStream;
import p174e.p247e.p253d.p257d.C6050b;
import p174e.p247e.p253d.p257d.C6052d;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p293j.C6252b;
import p174e.p247e.p293j.C6253c;
import p174e.p247e.p294k.p301e.C6316e;
import p174e.p247e.p294k.p301e.C6317f;
import p174e.p247e.p294k.p307k.C6369d;
import p174e.p247e.p294k.p313q.C6399a;
import p174e.p247e.p294k.p313q.C6400b;
import p174e.p247e.p294k.p313q.C6401c;
import p174e.p247e.p294k.p313q.C6403e;

@C6052d
public class NativeJpegTranscoder implements C6401c {

    /* renamed from: a */
    private boolean f7218a;

    /* renamed from: b */
    private int f7219b;

    /* renamed from: c */
    private boolean f7220c;

    public NativeJpegTranscoder(boolean z, int i, boolean z2, boolean z3) {
        this.f7218a = z;
        this.f7219b = i;
        this.f7220c = z2;
        if (z3) {
            C2438d.m10149a();
        }
    }

    /* renamed from: e */
    public static void m10140e(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) {
        C2438d.m10149a();
        boolean z = false;
        C6062k.m22834b(Boolean.valueOf(i2 >= 1));
        C6062k.m22834b(Boolean.valueOf(i2 <= 16));
        C6062k.m22834b(Boolean.valueOf(i3 >= 0));
        C6062k.m22834b(Boolean.valueOf(i3 <= 100));
        C6062k.m22834b(Boolean.valueOf(C6403e.m24504j(i)));
        if (!(i2 == 8 && i == 0)) {
            z = true;
        }
        C6062k.m22835c(z, "no transformation requested");
        nativeTranscodeJpeg((InputStream) C6062k.m22839g(inputStream), (OutputStream) C6062k.m22839g(outputStream), i, i2, i3);
    }

    /* renamed from: f */
    public static void m10141f(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) {
        C2438d.m10149a();
        boolean z = false;
        C6062k.m22834b(Boolean.valueOf(i2 >= 1));
        C6062k.m22834b(Boolean.valueOf(i2 <= 16));
        C6062k.m22834b(Boolean.valueOf(i3 >= 0));
        C6062k.m22834b(Boolean.valueOf(i3 <= 100));
        C6062k.m22834b(Boolean.valueOf(C6403e.m24503i(i)));
        if (!(i2 == 8 && i == 1)) {
            z = true;
        }
        C6062k.m22835c(z, "no transformation requested");
        nativeTranscodeJpegWithExifOrientation((InputStream) C6062k.m22839g(inputStream), (OutputStream) C6062k.m22839g(outputStream), i, i2, i3);
    }

    @C6052d
    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3);

    @C6052d
    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3);

    /* renamed from: a */
    public String mo8187a() {
        return "NativeJpegTranscoder";
    }

    /* renamed from: b */
    public boolean mo8188b(C6369d dVar, C6317f fVar, C6316e eVar) {
        if (fVar == null) {
            fVar = C6317f.m23927a();
        }
        return C6403e.m24500f(fVar, eVar, dVar, this.f7218a) < 8;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public C6400b mo8189c(C6369d dVar, OutputStream outputStream, C6317f fVar, C6316e eVar, C6253c cVar, Integer num) {
        if (num == null) {
            num = 85;
        }
        if (fVar == null) {
            fVar = C6317f.m23927a();
        }
        int b = C6399a.m24485b(fVar, eVar, dVar, this.f7219b);
        InputStream inputStream = null;
        try {
            int f = C6403e.m24500f(fVar, eVar, dVar, this.f7218a);
            int a = C6403e.m24495a(b);
            if (this.f7220c) {
                f = a;
            }
            inputStream = dVar.mo18892X();
            if (C6403e.f17837a.contains(Integer.valueOf(dVar.mo18886I()))) {
                m10141f((InputStream) C6062k.m22840h(inputStream, "Cannot transcode from null input stream!"), outputStream, C6403e.m24498d(fVar, dVar), f, num.intValue());
            } else {
                m10140e((InputStream) C6062k.m22840h(inputStream, "Cannot transcode from null input stream!"), outputStream, C6403e.m24499e(fVar, dVar), f, num.intValue());
            }
            C6050b.m22817b(inputStream);
            int i = 1;
            if (b != 1) {
                i = 0;
            }
            return new C6400b(i);
        } catch (Throwable th) {
            C6050b.m22817b(inputStream);
            throw th;
        }
    }

    /* renamed from: d */
    public boolean mo8190d(C6253c cVar) {
        return cVar == C6252b.f17318a;
    }
}
