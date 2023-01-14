package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;
import com.google.android.gms.common.util.C3758e;
import com.google.android.gms.common.util.C3761h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInAccount extends C3730a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C3435f();

    /* renamed from: f */
    public static C3758e f9721f = C3761h.m14511c();

    /* renamed from: A */
    private Set<Scope> f9722A = new HashSet();

    /* renamed from: o */
    final int f9723o;

    /* renamed from: p */
    private String f9724p;

    /* renamed from: q */
    private String f9725q;

    /* renamed from: r */
    private String f9726r;

    /* renamed from: s */
    private String f9727s;

    /* renamed from: t */
    private Uri f9728t;

    /* renamed from: u */
    private String f9729u;

    /* renamed from: v */
    private long f9730v;

    /* renamed from: w */
    private String f9731w;

    /* renamed from: x */
    List<Scope> f9732x;

    /* renamed from: y */
    private String f9733y;

    /* renamed from: z */
    private String f9734z;

    GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.f9723o = i;
        this.f9724p = str;
        this.f9725q = str2;
        this.f9726r = str3;
        this.f9727s = str4;
        this.f9728t = uri;
        this.f9729u = str5;
        this.f9730v = j;
        this.f9731w = str6;
        this.f9732x = list;
        this.f9733y = str7;
        this.f9734z = str8;
    }

    /* renamed from: L */
    public static GoogleSignInAccount m13375L(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set<Scope> set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, (String) null, l.longValue(), C3705r.m14342g(str7), new ArrayList((Collection) C3705r.m14346k(set)), str5, str6);
    }

    /* renamed from: M */
    public static GoogleSignInAccount m13376M(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount L = m13375L(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        if (jSONObject.has("serverAuthCode")) {
            str2 = jSONObject.optString("serverAuthCode");
        }
        L.f9729u = str2;
        return L;
    }

    /* renamed from: C */
    public String mo11064C() {
        return this.f9733y;
    }

    /* renamed from: E */
    public String mo11065E() {
        return this.f9724p;
    }

    /* renamed from: G */
    public String mo11066G() {
        return this.f9725q;
    }

    /* renamed from: H */
    public Uri mo11067H() {
        return this.f9728t;
    }

    /* renamed from: I */
    public Set<Scope> mo11068I() {
        HashSet hashSet = new HashSet(this.f9732x);
        hashSet.addAll(this.f9722A);
        return hashSet;
    }

    /* renamed from: J */
    public String mo11069J() {
        return this.f9729u;
    }

    /* renamed from: N */
    public final String mo11070N() {
        return this.f9731w;
    }

    /* renamed from: O */
    public final String mo11071O() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (mo11065E() != null) {
                jSONObject.put("id", mo11065E());
            }
            if (mo11066G() != null) {
                jSONObject.put("tokenId", mo11066G());
            }
            if (mo11076p() != null) {
                jSONObject.put("email", mo11076p());
            }
            if (mo11075o() != null) {
                jSONObject.put("displayName", mo11075o());
            }
            if (mo11064C() != null) {
                jSONObject.put("givenName", mo11064C());
            }
            if (mo11077r() != null) {
                jSONObject.put("familyName", mo11077r());
            }
            Uri H = mo11067H();
            if (H != null) {
                jSONObject.put("photoUrl", H.toString());
            }
            if (mo11069J() != null) {
                jSONObject.put("serverAuthCode", mo11069J());
            }
            jSONObject.put("expirationTime", this.f9730v);
            jSONObject.put("obfuscatedIdentifier", this.f9731w);
            JSONArray jSONArray = new JSONArray();
            List<Scope> list = this.f9732x;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, C3434e.f9770f);
            for (Scope o : scopeArr) {
                jSONArray.put(o.mo11163o());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f9731w.equals(this.f9731w) && googleSignInAccount.mo11068I().equals(mo11068I());
    }

    public int hashCode() {
        return ((this.f9731w.hashCode() + 527) * 31) + mo11068I().hashCode();
    }

    /* renamed from: j */
    public Account mo11074j() {
        String str = this.f9726r;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    /* renamed from: o */
    public String mo11075o() {
        return this.f9727s;
    }

    /* renamed from: p */
    public String mo11076p() {
        return this.f9726r;
    }

    /* renamed from: r */
    public String mo11077r() {
        return this.f9734z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 1, this.f9723o);
        C3733c.m14448q(parcel, 2, mo11065E(), false);
        C3733c.m14448q(parcel, 3, mo11066G(), false);
        C3733c.m14448q(parcel, 4, mo11076p(), false);
        C3733c.m14448q(parcel, 5, mo11075o(), false);
        C3733c.m14447p(parcel, 6, mo11067H(), i, false);
        C3733c.m14448q(parcel, 7, mo11069J(), false);
        C3733c.m14445n(parcel, 8, this.f9730v);
        C3733c.m14448q(parcel, 9, this.f9731w, false);
        C3733c.m14452u(parcel, 10, this.f9732x, false);
        C3733c.m14448q(parcel, 11, mo11064C(), false);
        C3733c.m14448q(parcel, 12, mo11077r(), false);
        C3733c.m14433b(parcel, a);
    }
}
