package com.facebook.imagepipeline.producers;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import java.io.IOException;
import java.util.concurrent.Executor;
import p174e.p247e.p253d.p260g.C6084h;
import p174e.p247e.p294k.p307k.C6369d;
import p174e.p247e.p294k.p311o.C6384b;

/* renamed from: com.facebook.imagepipeline.producers.g0 */
public class C2483g0 extends C2473e0 {

    /* renamed from: c */
    private final Resources f7322c;

    public C2483g0(Executor executor, C6084h hVar, Resources resources) {
        super(executor, hVar);
        this.f7322c = resources;
    }

    /* renamed from: g */
    private int m10328g(C6384b bVar) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            AssetFileDescriptor openRawResourceFd = this.f7322c.openRawResourceFd(m10329h(bVar));
            int length = (int) openRawResourceFd.getLength();
            try {
                openRawResourceFd.close();
            } catch (IOException unused) {
            }
            return length;
        } catch (Resources.NotFoundException unused2) {
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

    /* renamed from: h */
    private static int m10329h(C6384b bVar) {
        return Integer.parseInt(bVar.mo18938r().getPath().substring(1));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C6369d mo8228d(C6384b bVar) {
        return mo8261e(this.f7322c.openRawResource(m10329h(bVar)), m10328g(bVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo8229f() {
        return "LocalResourceFetchProducer";
    }
}
