package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.C3486f;
import com.google.android.gms.common.api.C3490g;
import com.google.android.gms.common.api.C3492h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3570q;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.common.p131l.C3742a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.google.android.gms.auth.api.signin.internal.f */
public final class C3444f implements Runnable {

    /* renamed from: f */
    private static final C3742a f9788f = new C3742a("RevokeAccessOperation", new String[0]);

    /* renamed from: o */
    private final String f9789o;

    /* renamed from: p */
    private final C3570q f9790p = new C3570q((C3486f) null);

    public C3444f(String str) {
        this.f9789o = C3705r.m14342g(str);
    }

    /* renamed from: a */
    public static C3490g m13444a(String str) {
        if (str == null) {
            return C3492h.m13574a(new Status(4), (C3486f) null);
        }
        C3444f fVar = new C3444f(str);
        new Thread(fVar).start();
        return fVar.f9790p;
    }

    public final void run() {
        Status status = Status.f9821p;
        try {
            String str = this.f9789o;
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + str).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f9819f;
            } else {
                f9788f.mo11710b("Unable to revoke access!", new Object[0]);
            }
            C3742a aVar = f9788f;
            aVar.mo11709a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e) {
            f9788f.mo11710b("IOException when revoking access: ".concat(String.valueOf(e.toString())), new Object[0]);
        } catch (Exception e2) {
            f9788f.mo11710b("Exception when revoking access: ".concat(String.valueOf(e2.toString())), new Object[0]);
        }
        this.f9790p.mo11242h(status);
    }
}
