package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.concurrent.Executor;
import p174e.p247e.p253d.p257d.C6055g;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p253d.p261h.C6098h;
import p174e.p247e.p253d.p264k.C6111f;
import p174e.p247e.p294k.p299c.C6272h;
import p174e.p247e.p294k.p307k.C6367b;
import p174e.p247e.p294k.p307k.C6368c;
import p174e.p247e.p294k.p307k.C6373h;
import p174e.p247e.p294k.p311o.C6384b;

/* renamed from: com.facebook.imagepipeline.producers.h0 */
public class C2486h0 implements C2529o0<C6088a<C6367b>> {

    /* renamed from: a */
    private final Executor f7329a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ContentResolver f7330b;

    /* renamed from: com.facebook.imagepipeline.producers.h0$a */
    class C2487a extends C2554w0<C6088a<C6367b>> {

        /* renamed from: s */
        final /* synthetic */ C2539r0 f7331s;

        /* renamed from: t */
        final /* synthetic */ C2531p0 f7332t;

        /* renamed from: u */
        final /* synthetic */ C6384b f7333u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2487a(C2505l lVar, C2539r0 r0Var, C2531p0 p0Var, String str, C2539r0 r0Var2, C2531p0 p0Var2, C6384b bVar) {
            super(lVar, r0Var, p0Var, str);
            this.f7331s = r0Var2;
            this.f7332t = p0Var2;
            this.f7333u = bVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo8268e(Exception exc) {
            super.mo8268e(exc);
            this.f7331s.mo8324c(this.f7332t, "VideoThumbnailProducer", false);
            this.f7332t.mo8249o("local");
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public void mo8202b(C6088a<C6367b> aVar) {
            C6088a.m22949v0(aVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public Map<String, String> mo8204i(C6088a<C6367b> aVar) {
            return C6055g.m22821of("createdThumbnail", String.valueOf(aVar != null));
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public C6088a<C6367b> mo8203c() {
            String str;
            try {
                str = C2486h0.this.m10346i(this.f7333u);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            Bitmap createVideoThumbnail = str != null ? ThumbnailUtils.createVideoThumbnail(str, C2486h0.m10344g(this.f7333u)) : C2486h0.m10345h(C2486h0.this.f7330b, this.f7333u.mo18938r());
            if (createVideoThumbnail == null) {
                return null;
            }
            C6368c cVar = new C6368c(createVideoThumbnail, (C6098h<Bitmap>) C6272h.m23750b(), C6373h.f17773a, 0);
            this.f7332t.mo8239e("image_format", "thumbnail");
            cVar.mo18869A(this.f7332t.mo8236b());
            return C6088a.m22940A0(cVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public void mo8269f(C6088a<C6367b> aVar) {
            super.mo8269f(aVar);
            this.f7331s.mo8324c(this.f7332t, "VideoThumbnailProducer", aVar != null);
            this.f7332t.mo8249o("local");
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.h0$b */
    class C2488b extends C2472e {

        /* renamed from: a */
        final /* synthetic */ C2554w0 f7335a;

        C2488b(C2554w0 w0Var) {
            this.f7335a = w0Var;
        }

        /* renamed from: a */
        public void mo8208a() {
            this.f7335a.mo18036a();
        }
    }

    public C2486h0(Executor executor, ContentResolver contentResolver) {
        this.f7329a = executor;
        this.f7330b = contentResolver;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static int m10344g(C6384b bVar) {
        return (bVar.mo18930j() > 96 || bVar.mo18929i() > 96) ? 1 : 3;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static Bitmap m10345h(ContentResolver contentResolver, Uri uri) {
        if (Build.VERSION.SDK_INT >= 10) {
            try {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(openFileDescriptor.getFileDescriptor());
                return mediaMetadataRetriever.getFrameAtTime(-1);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public String m10346i(C6384b bVar) {
        String[] strArr;
        String str;
        Uri uri;
        Uri r = bVar.mo18938r();
        if (C6111f.m23006j(r)) {
            return bVar.mo18937q().getPath();
        }
        if (C6111f.m23005i(r)) {
            if (Build.VERSION.SDK_INT < 19 || !"com.android.providers.media.documents".equals(r.getAuthority())) {
                uri = r;
                str = null;
                strArr = null;
            } else {
                String documentId = DocumentsContract.getDocumentId(r);
                str = "_id=?";
                uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                strArr = new String[]{documentId.split(":")[1]};
            }
            Cursor query = this.f7330b.query(uri, new String[]{"_data"}, str, strArr, (String) null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        return query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (query != null) {
                query.close();
            }
        }
        return null;
    }

    /* renamed from: b */
    public void mo8198b(C2505l<C6088a<C6367b>> lVar, C2531p0 p0Var) {
        C2539r0 p = p0Var.mo8250p();
        C6384b f = p0Var.mo8240f();
        p0Var.mo8244j("local", "video");
        C2487a aVar = new C2487a(lVar, p, p0Var, "VideoThumbnailProducer", p, p0Var, f);
        p0Var.mo8241g(new C2488b(aVar));
        this.f7329a.execute(aVar);
    }
}
