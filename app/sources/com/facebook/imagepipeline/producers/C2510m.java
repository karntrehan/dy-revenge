package com.facebook.imagepipeline.producers;

import android.net.Uri;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import p174e.p247e.p253d.p255b.C6036a;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p260g.C6084h;
import p174e.p247e.p294k.p307k.C6369d;
import p174e.p247e.p294k.p311o.C6384b;

/* renamed from: com.facebook.imagepipeline.producers.m */
public class C2510m extends C2473e0 {
    public C2510m(C6084h hVar) {
        super(C6036a.m22791a(), hVar);
    }

    /* renamed from: g */
    static byte[] m10455g(String str) {
        C6062k.m22834b(Boolean.valueOf(str.substring(0, 5).equals("data:")));
        int indexOf = str.indexOf(44);
        String substring = str.substring(indexOf + 1, str.length());
        if (m10456h(str.substring(0, indexOf))) {
            return Base64.decode(substring, 0);
        }
        String decode = Uri.decode(substring);
        C6062k.m22839g(decode);
        return decode.getBytes();
    }

    /* renamed from: h */
    static boolean m10456h(String str) {
        if (!str.contains(";")) {
            return false;
        }
        String[] split = str.split(";");
        return split[split.length - 1].equals("base64");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C6369d mo8228d(C6384b bVar) {
        byte[] g = m10455g(bVar.mo18938r().toString());
        return mo8260c(new ByteArrayInputStream(g), g.length);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo8229f() {
        return "DataFetchProducer";
    }
}
