package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.C2553w;
import java.io.InputStream;
import java.util.Map;
import p174e.p247e.p294k.p307k.C6369d;

/* renamed from: com.facebook.imagepipeline.producers.k0 */
public interface C2503k0<FETCH_STATE extends C2553w> {

    /* renamed from: com.facebook.imagepipeline.producers.k0$a */
    public interface C2504a {
        /* renamed from: a */
        void mo8298a();

        /* renamed from: b */
        void mo8299b(Throwable th);

        /* renamed from: c */
        void mo8300c(InputStream inputStream, int i);
    }

    /* renamed from: a */
    void mo8302a(FETCH_STATE fetch_state, int i);

    /* renamed from: b */
    boolean mo8232b(FETCH_STATE fetch_state);

    /* renamed from: c */
    Map<String, String> mo8303c(FETCH_STATE fetch_state, int i);

    /* renamed from: d */
    void mo8304d(FETCH_STATE fetch_state, C2504a aVar);

    /* renamed from: e */
    FETCH_STATE mo8305e(C2505l<C6369d> lVar, C2531p0 p0Var);
}
