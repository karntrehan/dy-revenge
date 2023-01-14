package p174e.p319f.p393c.p394a.p399v.p400a;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.CharConversionException;
import java.io.FileNotFoundException;
import p174e.p319f.p393c.p394a.C9232k;
import p174e.p319f.p393c.p394a.p395a0.C9204o;
import p174e.p319f.p393c.p394a.p403y.C9324c0;
import p174e.p319f.p393c.p394a.p403y.C9405t;
import p174e.p319f.p393c.p394a.p404z.p405a.C9526q;

/* renamed from: e.f.c.a.v.a.d */
public final class C9295d implements C9232k {

    /* renamed from: a */
    private final SharedPreferences f25217a;

    /* renamed from: b */
    private final String f25218b;

    public C9295d(Context context, String str, String str2) {
        if (str != null) {
            this.f25218b = str;
            Context applicationContext = context.getApplicationContext();
            this.f25217a = str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0);
            return;
        }
        throw new IllegalArgumentException("keysetName cannot be null");
    }

    /* renamed from: c */
    private byte[] m30959c() {
        try {
            String string = this.f25217a.getString(this.f25218b, (String) null);
            if (string != null) {
                return C9204o.m30580a(string);
            }
            throw new FileNotFoundException(String.format("can't read keyset; the pref value %s does not exist", new Object[]{this.f25218b}));
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", new Object[]{this.f25218b}));
        }
    }

    /* renamed from: a */
    public C9405t mo23222a() {
        return C9405t.m31328R(m30959c(), C9526q.m32218b());
    }

    /* renamed from: b */
    public C9324c0 mo23223b() {
        return C9324c0.m31064W(m30959c(), C9526q.m32218b());
    }
}
