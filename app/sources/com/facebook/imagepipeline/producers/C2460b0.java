package com.facebook.imagepipeline.producers;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;
import java.util.concurrent.Executor;
import p174e.p247e.p253d.p260g.C6084h;
import p174e.p247e.p294k.p307k.C6369d;
import p174e.p247e.p294k.p311o.C6384b;

/* renamed from: com.facebook.imagepipeline.producers.b0 */
public class C2460b0 extends C2473e0 {

    /* renamed from: c */
    private final AssetManager f7268c;

    public C2460b0(Executor executor, C6084h hVar, AssetManager assetManager) {
        super(executor, hVar);
        this.f7268c = assetManager;
    }

    /* renamed from: g */
    private static String m10225g(C6384b bVar) {
        return bVar.mo18938r().getPath().substring(1);
    }

    /* renamed from: h */
    private int m10226h(C6384b bVar) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            AssetFileDescriptor openFd = this.f7268c.openFd(m10225g(bVar));
            int length = (int) openFd.getLength();
            try {
                openFd.close();
            } catch (IOException unused) {
            }
            return length;
        } catch (IOException unused2) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused3) {
                }
            }
            return -1;
        } catch (Throwable th) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C6369d mo8228d(C6384b bVar) {
        return mo8261e(this.f7268c.open(m10225g(bVar), 2), m10226h(bVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo8229f() {
        return "LocalAssetFetchProducer";
    }
}
