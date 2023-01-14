package p174e.p319f.p320a.p335c.p338b.p339a;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.C3447i;
import com.google.android.gms.common.api.C3469a;
import com.google.android.gms.common.api.C3486f;
import com.google.android.gms.common.internal.C3659d;
import java.util.Collections;
import java.util.List;

/* renamed from: e.f.a.c.b.a.g */
final class C6629g extends C3469a.C3470a {
    C6629g() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ List mo11184a(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        return googleSignInOptions == null ? Collections.emptyList() : googleSignInOptions.mo11089r();
    }

    /* renamed from: c */
    public final /* synthetic */ C3469a.C3478f mo11180c(Context context, Looper looper, C3659d dVar, Object obj, C3486f.C3488b bVar, C3486f.C3489c cVar) {
        return new C3447i(context, looper, dVar, (GoogleSignInOptions) obj, bVar, cVar);
    }
}
