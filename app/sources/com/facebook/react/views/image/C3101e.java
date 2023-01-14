package com.facebook.react.views.image;

import android.graphics.Bitmap;
import java.util.LinkedList;
import java.util.List;
import p174e.p247e.p249b.p250a.C5999d;
import p174e.p247e.p249b.p250a.C6001f;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p294k.p299c.C6270f;
import p174e.p247e.p294k.p311o.C6390d;

/* renamed from: com.facebook.react.views.image.e */
public class C3101e implements C6390d {

    /* renamed from: a */
    private final List<C6390d> f8611a;

    private C3101e(List<C6390d> list) {
        this.f8611a = new LinkedList(list);
    }

    /* renamed from: d */
    public static C6390d m12210d(List<C6390d> list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? new C3101e(list) : list.get(0);
        }
        return null;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public C6088a<Bitmap> mo9952b(Bitmap bitmap, C6270f fVar) {
        C6088a<Bitmap> aVar = null;
        try {
            C6088a<Bitmap> aVar2 = null;
            for (C6390d b : this.f8611a) {
                aVar = b.mo9952b(aVar2 != null ? aVar2.mo18082w0() : bitmap, fVar);
                C6088a.m22949v0(aVar2);
                aVar2 = aVar.clone();
            }
            C6088a<Bitmap> n0 = aVar.clone();
            C6088a.m22949v0(aVar);
            return n0;
        } catch (Throwable th) {
            C6088a.m22949v0((C6088a<?>) null);
            throw th;
        }
    }

    /* renamed from: c */
    public C5999d mo9953c() {
        LinkedList linkedList = new LinkedList();
        for (C6390d c : this.f8611a) {
            linkedList.push(c.mo9953c());
        }
        return new C6001f(linkedList);
    }

    public String getName() {
        StringBuilder sb = new StringBuilder();
        for (C6390d next : this.f8611a) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(next.getName());
        }
        sb.insert(0, "MultiPostProcessor (");
        sb.append(")");
        return sb.toString();
    }
}
