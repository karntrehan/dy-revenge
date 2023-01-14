package androidx.camera.core;

import android.media.MediaCodec;

/* renamed from: androidx.camera.core.y0 */
public final /* synthetic */ class C1005y0 implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ boolean f2838f;

    /* renamed from: o */
    public final /* synthetic */ MediaCodec f2839o;

    public /* synthetic */ C1005y0(boolean z, MediaCodec mediaCodec) {
        this.f2838f = z;
        this.f2839o = mediaCodec;
    }

    public final void run() {
        C0617b3.m2566P(this.f2838f, this.f2839o);
    }
}
