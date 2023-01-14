package com.facebook.imagepipeline.nativecode;

import p174e.p247e.p253d.p257d.C6052d;
import p174e.p247e.p293j.C6252b;
import p174e.p247e.p293j.C6253c;
import p174e.p247e.p294k.p313q.C6401c;
import p174e.p247e.p294k.p313q.C6402d;

@C6052d
public class NativeJpegTranscoderFactory implements C6402d {

    /* renamed from: a */
    private final int f7221a;

    /* renamed from: b */
    private final boolean f7222b;

    /* renamed from: c */
    private final boolean f7223c;

    @C6052d
    public NativeJpegTranscoderFactory(int i, boolean z, boolean z2) {
        this.f7221a = i;
        this.f7222b = z;
        this.f7223c = z2;
    }

    @C6052d
    public C6401c createImageTranscoder(C6253c cVar, boolean z) {
        if (cVar != C6252b.f17318a) {
            return null;
        }
        return new NativeJpegTranscoder(z, this.f7221a, this.f7222b, this.f7223c);
    }
}
