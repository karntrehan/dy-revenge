package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import com.facebook.imageutils.C2567a;
import com.facebook.imageutils.C2570c;
import com.facebook.soloader.C3264d;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import p174e.p247e.p253d.p257d.C6055g;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p258e.C6071a;
import p174e.p247e.p253d.p260g.C6082g;
import p174e.p247e.p253d.p260g.C6084h;
import p174e.p247e.p253d.p260g.C6085i;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p253d.p264k.C6111f;
import p174e.p247e.p293j.C6252b;
import p174e.p247e.p294k.p301e.C6316e;
import p174e.p247e.p294k.p307k.C6369d;
import p174e.p247e.p294k.p311o.C6384b;

public class LocalExifThumbnailProducer implements C2471d1<C6369d> {

    /* renamed from: a */
    private final Executor f7236a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C6084h f7237b;

    /* renamed from: c */
    private final ContentResolver f7238c;

    @C3264d
    private class Api24Utils {
        private Api24Utils() {
        }

        /* synthetic */ Api24Utils(LocalExifThumbnailProducer localExifThumbnailProducer, C2446a aVar) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public ExifInterface mo8201a(FileDescriptor fileDescriptor) {
            if (Build.VERSION.SDK_INT >= 24) {
                return new ExifInterface(fileDescriptor);
            }
            return null;
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.LocalExifThumbnailProducer$a */
    class C2446a extends C2554w0<C6369d> {

        /* renamed from: s */
        final /* synthetic */ C6384b f7240s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2446a(C2505l lVar, C2539r0 r0Var, C2531p0 p0Var, String str, C6384b bVar) {
            super(lVar, r0Var, p0Var, str);
            this.f7240s = bVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public void mo8202b(C6369d dVar) {
            C6369d.m24309h(dVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public Map<String, String> mo8204i(C6369d dVar) {
            return C6055g.m22821of("createdThumbnail", Boolean.toString(dVar != null));
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public C6369d mo8203c() {
            ExifInterface g = LocalExifThumbnailProducer.this.mo8200g(this.f7240s.mo18938r());
            if (g == null || !g.hasThumbnail()) {
                return null;
            }
            return LocalExifThumbnailProducer.this.m10178e(LocalExifThumbnailProducer.this.f7237b.mo8164b((byte[]) C6062k.m22839g(g.getThumbnail())), g);
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.LocalExifThumbnailProducer$b */
    class C2447b extends C2472e {

        /* renamed from: a */
        final /* synthetic */ C2554w0 f7242a;

        C2447b(C2554w0 w0Var) {
            this.f7242a = w0Var;
        }

        /* renamed from: a */
        public void mo8208a() {
            this.f7242a.mo18036a();
        }
    }

    public LocalExifThumbnailProducer(Executor executor, C6084h hVar, ContentResolver contentResolver) {
        this.f7236a = executor;
        this.f7237b = hVar;
        this.f7238c = contentResolver;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* renamed from: e */
    public C6369d m10178e(C6082g gVar, ExifInterface exifInterface) {
        Pair<Integer, Integer> a = C2567a.m10701a(new C6085i(gVar));
        int h = m10179h(exifInterface);
        int i = -1;
        int intValue = a != null ? ((Integer) a.first).intValue() : -1;
        if (a != null) {
            i = ((Integer) a.second).intValue();
        }
        C6088a A0 = C6088a.m22940A0(gVar);
        try {
            C6369d dVar = new C6369d((C6088a<C6082g>) A0);
            C6088a.m22949v0(A0);
            dVar.mo18885H0(C6252b.f17318a);
            dVar.mo18887I0(h);
            dVar.mo18889K0(intValue);
            dVar.mo18884G0(i);
            return dVar;
        } catch (Throwable th) {
            C6088a.m22949v0(A0);
            throw th;
        }
    }

    /* renamed from: h */
    private int m10179h(ExifInterface exifInterface) {
        return C2570c.m10708a(Integer.parseInt((String) C6062k.m22839g(exifInterface.getAttribute("Orientation"))));
    }

    /* renamed from: a */
    public boolean mo8197a(C6316e eVar) {
        return C2476e1.m10299b(512, 512, eVar);
    }

    /* renamed from: b */
    public void mo8198b(C2505l<C6369d> lVar, C2531p0 p0Var) {
        C2539r0 p = p0Var.mo8250p();
        C6384b f = p0Var.mo8240f();
        p0Var.mo8244j("local", "exif");
        C2446a aVar = new C2446a(lVar, p, p0Var, "LocalExifThumbnailProducer", f);
        p0Var.mo8241g(new C2447b(aVar));
        this.f7236a.execute(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo8199f(String str) {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.canRead();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public ExifInterface mo8200g(Uri uri) {
        String b = C6111f.m22998b(this.f7238c, uri);
        if (b == null) {
            return null;
        }
        try {
            if (mo8199f(b)) {
                return new ExifInterface(b);
            }
            AssetFileDescriptor a = C6111f.m22997a(this.f7238c, uri);
            if (a != null && Build.VERSION.SDK_INT >= 24) {
                ExifInterface a2 = new Api24Utils(this, (C2446a) null).mo8201a(a.getFileDescriptor());
                a.close();
                return a2;
            }
            return null;
        } catch (IOException unused) {
        } catch (StackOverflowError unused2) {
            C6071a.m22871e(LocalExifThumbnailProducer.class, "StackOverflowError in ExifInterface constructor");
        }
    }
}
