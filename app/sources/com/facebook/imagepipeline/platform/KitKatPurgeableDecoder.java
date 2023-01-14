package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.imagepipeline.memory.C2422q;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import p174e.p247e.p253d.p257d.C6052d;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p260g.C6082g;
import p174e.p247e.p253d.p261h.C6088a;

@TargetApi(19)
@C6052d
public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {

    /* renamed from: c */
    private final C2422q f7230c;

    @C6052d
    public KitKatPurgeableDecoder(C2422q qVar) {
        this.f7230c = qVar;
    }

    /* renamed from: i */
    private static void m10160i(byte[] bArr, int i) {
        bArr[i] = -1;
        bArr[i + 1] = -39;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Bitmap mo8184d(C6088a<C6082g> aVar, BitmapFactory.Options options) {
        C6082g w0 = aVar.mo18082w0();
        int size = w0.size();
        C6088a<byte[]> a = this.f7230c.mo8145a(size);
        try {
            byte[] w02 = a.mo18082w0();
            w0.mo8161k(0, w02, 0, size);
            return (Bitmap) C6062k.m22840h(BitmapFactory.decodeByteArray(w02, 0, size, options), "BitmapFactory returned null");
        } finally {
            C6088a.m22949v0(a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Bitmap mo8185e(C6088a<C6082g> aVar, int i, BitmapFactory.Options options) {
        byte[] bArr = DalvikPurgeableDecoder.m10130f(aVar, i) ? null : DalvikPurgeableDecoder.f7216a;
        C6082g w0 = aVar.mo18082w0();
        C6062k.m22834b(Boolean.valueOf(i <= w0.size()));
        int i2 = i + 2;
        C6088a<byte[]> a = this.f7230c.mo8145a(i2);
        try {
            byte[] w02 = a.mo18082w0();
            w0.mo8161k(0, w02, 0, i);
            if (bArr != null) {
                m10160i(w02, i);
                i = i2;
            }
            return (Bitmap) C6062k.m22840h(BitmapFactory.decodeByteArray(w02, 0, i, options), "BitmapFactory returned null");
        } finally {
            C6088a.m22949v0(a);
        }
    }
}
