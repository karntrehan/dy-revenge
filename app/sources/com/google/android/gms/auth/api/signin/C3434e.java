package com.google.android.gms.auth.api.signin;

import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* renamed from: com.google.android.gms.auth.api.signin.e */
public final /* synthetic */ class C3434e implements Comparator {

    /* renamed from: f */
    public static final /* synthetic */ C3434e f9770f = new C3434e();

    private /* synthetic */ C3434e() {
    }

    public final int compare(Object obj, Object obj2) {
        Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
        return ((Scope) obj).mo11163o().compareTo(((Scope) obj2).mo11163o());
    }
}
