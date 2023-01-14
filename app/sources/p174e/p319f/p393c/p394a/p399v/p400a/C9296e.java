package p174e.p319f.p393c.p394a.p399v.p400a;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;
import p174e.p319f.p393c.p394a.C9233l;
import p174e.p319f.p393c.p394a.p395a0.C9204o;
import p174e.p319f.p393c.p394a.p403y.C9324c0;
import p174e.p319f.p393c.p394a.p403y.C9405t;

/* renamed from: e.f.c.a.v.a.e */
public final class C9296e implements C9233l {

    /* renamed from: a */
    private final SharedPreferences.Editor f25219a;

    /* renamed from: b */
    private final String f25220b;

    public C9296e(Context context, String str, String str2) {
        if (str != null) {
            this.f25220b = str;
            Context applicationContext = context.getApplicationContext();
            this.f25219a = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).edit();
            return;
        }
        throw new IllegalArgumentException("keysetName cannot be null");
    }

    /* renamed from: a */
    public void mo23224a(C9324c0 c0Var) {
        if (!this.f25219a.putString(this.f25220b, C9204o.m30581b(c0Var.mo23479i())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    /* renamed from: b */
    public void mo23225b(C9405t tVar) {
        if (!this.f25219a.putString(this.f25220b, C9204o.m30581b(tVar.mo23479i())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
