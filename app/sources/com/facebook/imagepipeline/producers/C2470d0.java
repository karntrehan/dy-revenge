package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import com.facebook.imageutils.C2570c;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p258e.C6071a;
import p174e.p247e.p253d.p260g.C6084h;
import p174e.p247e.p253d.p264k.C6111f;
import p174e.p247e.p294k.p301e.C6316e;
import p174e.p247e.p294k.p307k.C6369d;
import p174e.p247e.p294k.p311o.C6384b;

/* renamed from: com.facebook.imagepipeline.producers.d0 */
public class C2470d0 extends C2473e0 implements C2471d1<C6369d> {

    /* renamed from: c */
    private static final Class<?> f7299c = C2470d0.class;

    /* renamed from: d */
    private static final String[] f7300d = {"_id", "_data"};

    /* renamed from: e */
    private static final String[] f7301e = {"_data"};

    /* renamed from: f */
    private static final Rect f7302f = new Rect(0, 0, 512, 384);

    /* renamed from: g */
    private static final Rect f7303g = new Rect(0, 0, 96, 96);

    /* renamed from: h */
    private final ContentResolver f7304h;

    public C2470d0(Executor executor, C6084h hVar, ContentResolver contentResolver) {
        super(executor, hVar);
        this.f7304h = contentResolver;
    }

    /* renamed from: g */
    private C6369d m10276g(Uri uri, C6316e eVar) {
        Cursor query;
        C6369d j;
        if (eVar == null || (query = this.f7304h.query(uri, f7300d, (String) null, (String[]) null, (String) null)) == null) {
            return null;
        }
        try {
            if (!query.moveToFirst() || (j = m10279j(eVar, query.getLong(query.getColumnIndex("_id")))) == null) {
                query.close();
                return null;
            }
            j.mo18887I0(m10278i(query.getString(query.getColumnIndex("_data"))));
            return j;
        } finally {
            query.close();
        }
    }

    /* renamed from: h */
    private static int m10277h(String str) {
        if (str == null) {
            return -1;
        }
        return (int) new File(str).length();
    }

    /* renamed from: i */
    private static int m10278i(String str) {
        if (str != null) {
            try {
                return C2570c.m10708a(new ExifInterface(str).getAttributeInt("Orientation", 1));
            } catch (IOException e) {
                C6071a.m22874h(f7299c, e, "Unable to retrieve thumbnail rotation for %s", str);
            }
        }
        return 0;
    }

    /* renamed from: j */
    private C6369d m10279j(C6316e eVar, long j) {
        Cursor queryMiniThumbnail;
        int k = m10280k(eVar);
        if (k == 0 || (queryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.f7304h, j, k, f7301e)) == null) {
            return null;
        }
        try {
            if (queryMiniThumbnail.moveToFirst()) {
                String str = (String) C6062k.m22839g(queryMiniThumbnail.getString(queryMiniThumbnail.getColumnIndex("_data")));
                if (new File(str).exists()) {
                    return mo8261e(new FileInputStream(str), m10277h(str));
                }
            }
            queryMiniThumbnail.close();
            return null;
        } finally {
            queryMiniThumbnail.close();
        }
    }

    /* renamed from: k */
    private static int m10280k(C6316e eVar) {
        Rect rect = f7303g;
        if (C2476e1.m10299b(rect.width(), rect.height(), eVar)) {
            return 3;
        }
        Rect rect2 = f7302f;
        return C2476e1.m10299b(rect2.width(), rect2.height(), eVar) ? 1 : 0;
    }

    /* renamed from: a */
    public boolean mo8197a(C6316e eVar) {
        Rect rect = f7302f;
        return C2476e1.m10299b(rect.width(), rect.height(), eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C6369d mo8228d(C6384b bVar) {
        Uri r = bVar.mo18938r();
        if (C6111f.m23003g(r)) {
            return m10276g(r, bVar.mo18934n());
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo8229f() {
        return "LocalContentUriThumbnailFetchProducer";
    }
}
