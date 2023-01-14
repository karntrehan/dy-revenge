package com.facebook.imagepipeline.memory;

import p174e.p247e.p253d.p257d.C6052d;
import p174e.p247e.p253d.p260g.C6078c;

@C6052d
public class NativeMemoryChunkPool extends C2429v {
    @C6052d
    public NativeMemoryChunkPool(C6078c cVar, C2408f0 f0Var, C2410g0 g0Var) {
        super(cVar, f0Var, g0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public NativeMemoryChunk mo8047z(int i) {
        return new NativeMemoryChunk(i);
    }
}
