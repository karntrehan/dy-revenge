package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.C3439a;
import com.google.android.gms.auth.api.signin.internal.C3440b;
import com.google.android.gms.common.api.C3469a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInOptions extends C3730a implements C3469a.C3473d, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new C3438i();

    /* renamed from: f */
    public static final GoogleSignInOptions f9735f;

    /* renamed from: o */
    public static final GoogleSignInOptions f9736o;

    /* renamed from: p */
    public static final Scope f9737p = new Scope("profile");

    /* renamed from: q */
    public static final Scope f9738q = new Scope("email");

    /* renamed from: r */
    public static final Scope f9739r = new Scope("openid");

    /* renamed from: s */
    public static final Scope f9740s;

    /* renamed from: t */
    public static final Scope f9741t = new Scope("https://www.googleapis.com/auth/games");

    /* renamed from: u */
    private static Comparator<Scope> f9742u = new C3436g();
    /* access modifiers changed from: private */

    /* renamed from: A */
    public final boolean f9743A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public String f9744B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public String f9745C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public ArrayList<C3439a> f9746D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public String f9747E;

    /* renamed from: F */
    private Map<Integer, C3439a> f9748F;

    /* renamed from: v */
    final int f9749v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final ArrayList<Scope> f9750w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public Account f9751x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public boolean f9752y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final boolean f9753z;

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$a */
    public static final class C3429a {

        /* renamed from: a */
        private Set<Scope> f9754a = new HashSet();

        /* renamed from: b */
        private boolean f9755b;

        /* renamed from: c */
        private boolean f9756c;

        /* renamed from: d */
        private boolean f9757d;

        /* renamed from: e */
        private String f9758e;

        /* renamed from: f */
        private Account f9759f;

        /* renamed from: g */
        private String f9760g;

        /* renamed from: h */
        private Map<Integer, C3439a> f9761h = new HashMap();

        /* renamed from: i */
        private String f9762i;

        public C3429a() {
        }

        public C3429a(GoogleSignInOptions googleSignInOptions) {
            C3705r.m14346k(googleSignInOptions);
            this.f9754a = new HashSet(googleSignInOptions.f9750w);
            this.f9755b = googleSignInOptions.f9753z;
            this.f9756c = googleSignInOptions.f9743A;
            this.f9757d = googleSignInOptions.f9752y;
            this.f9758e = googleSignInOptions.f9744B;
            this.f9759f = googleSignInOptions.f9751x;
            this.f9760g = googleSignInOptions.f9745C;
            this.f9761h = GoogleSignInOptions.m13400V(googleSignInOptions.f9746D);
            this.f9762i = googleSignInOptions.f9747E;
        }

        /* renamed from: a */
        public GoogleSignInOptions mo11091a() {
            if (this.f9754a.contains(GoogleSignInOptions.f9741t)) {
                Set<Scope> set = this.f9754a;
                Scope scope = GoogleSignInOptions.f9740s;
                if (set.contains(scope)) {
                    this.f9754a.remove(scope);
                }
            }
            if (this.f9757d && (this.f9759f == null || !this.f9754a.isEmpty())) {
                mo11092b();
            }
            return new GoogleSignInOptions(3, new ArrayList(this.f9754a), this.f9759f, this.f9757d, this.f9755b, this.f9756c, this.f9758e, this.f9760g, this.f9761h, this.f9762i, (C3437h) null);
        }

        /* renamed from: b */
        public C3429a mo11092b() {
            this.f9754a.add(GoogleSignInOptions.f9739r);
            return this;
        }

        /* renamed from: c */
        public C3429a mo11093c() {
            this.f9754a.add(GoogleSignInOptions.f9737p);
            return this;
        }

        /* renamed from: d */
        public C3429a mo11094d(Scope scope, Scope... scopeArr) {
            this.f9754a.add(scope);
            this.f9754a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        /* renamed from: e */
        public C3429a mo11095e(String str) {
            this.f9762i = str;
            return this;
        }
    }

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f9740s = scope;
        C3429a aVar = new C3429a();
        aVar.mo11092b();
        aVar.mo11093c();
        f9735f = aVar.mo11091a();
        C3429a aVar2 = new C3429a();
        aVar2.mo11094d(scope, new Scope[0]);
        f9736o = aVar2.mo11091a();
    }

    GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList<C3439a> arrayList2, String str3) {
        this(i, arrayList, account, z, z2, z3, str, str2, m13400V(arrayList2), str3);
    }

    private GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, C3439a> map, String str3) {
        this.f9749v = i;
        this.f9750w = arrayList;
        this.f9751x = account;
        this.f9752y = z;
        this.f9753z = z2;
        this.f9743A = z3;
        this.f9744B = str;
        this.f9745C = str2;
        this.f9746D = new ArrayList<>(map.values());
        this.f9748F = map;
        this.f9747E = str3;
    }

    /* synthetic */ GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3, C3437h hVar) {
        this(3, (ArrayList<Scope>) arrayList, account, z, z2, z3, str, str2, (Map<Integer, C3439a>) map, str3);
    }

    /* renamed from: J */
    public static GoogleSignInOptions m13390J(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        Account account = !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null;
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z = jSONObject.getBoolean("idTokenRequested");
        boolean z2 = jSONObject.getBoolean("serverAuthRequested");
        boolean z3 = jSONObject.getBoolean("forceCodeForRefreshToken");
        String optString2 = jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null;
        if (jSONObject.has("hostedDomain")) {
            str2 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, (ArrayList<Scope>) arrayList, account, z, z2, z3, optString2, str2, (Map<Integer, C3439a>) new HashMap(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public static Map<Integer, C3439a> m13400V(List<C3439a> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (C3439a next : list) {
            hashMap.put(Integer.valueOf(next.mo11114o()), next);
        }
        return hashMap;
    }

    /* renamed from: C */
    public String mo11079C() {
        return this.f9744B;
    }

    /* renamed from: E */
    public boolean mo11080E() {
        return this.f9743A;
    }

    /* renamed from: G */
    public boolean mo11081G() {
        return this.f9752y;
    }

    /* renamed from: H */
    public boolean mo11082H() {
        return this.f9753z;
    }

    /* renamed from: O */
    public final String mo11083O() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f9750w, f9742u);
            Iterator<Scope> it = this.f9750w.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().mo11163o());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f9751x;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f9752y);
            jSONObject.put("forceCodeForRefreshToken", this.f9743A);
            jSONObject.put("serverAuthRequested", this.f9753z);
            if (!TextUtils.isEmpty(this.f9744B)) {
                jSONObject.put("serverClientId", this.f9744B);
            }
            if (!TextUtils.isEmpty(this.f9745C)) {
                jSONObject.put("hostedDomain", this.f9745C);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r1.equals(r4.mo11086j()) != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.a> r1 = r3.f9746D     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 > 0) goto L_0x0090
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.a> r1 = r4.f9746D     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 <= 0) goto L_0x0018
            goto L_0x0090
        L_0x0018:
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f9750w     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r2 = r4.mo11089r()     // Catch:{ ClassCastException -> 0x0090 }
            int r2 = r2.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f9750w     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r2 = r4.mo11089r()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.containsAll(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0035
            goto L_0x0090
        L_0x0035:
            android.accounts.Account r1 = r3.f9751x     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0040
            android.accounts.Account r1 = r4.mo11086j()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0090
            goto L_0x004a
        L_0x0040:
            android.accounts.Account r2 = r4.mo11086j()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x0090
        L_0x004a:
            java.lang.String r1 = r3.f9744B     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x005d
            java.lang.String r1 = r4.mo11079C()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x0090
            goto L_0x006a
        L_0x005d:
            java.lang.String r1 = r3.f9744B     // Catch:{ ClassCastException -> 0x0090 }
            java.lang.String r2 = r4.mo11079C()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x006a
            goto L_0x0090
        L_0x006a:
            boolean r1 = r3.f9743A     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.mo11080E()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            boolean r1 = r3.f9752y     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.mo11081G()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            boolean r1 = r3.f9753z     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.mo11082H()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            java.lang.String r1 = r3.f9747E     // Catch:{ ClassCastException -> 0x0090 }
            java.lang.String r4 = r4.mo11088p()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch:{ ClassCastException -> 0x0090 }
            if (r4 == 0) goto L_0x0090
            r4 = 1
            return r4
        L_0x0090:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.f9750w;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(arrayList2.get(i).mo11163o());
        }
        Collections.sort(arrayList);
        C3440b bVar = new C3440b();
        bVar.mo11116a(arrayList);
        bVar.mo11116a(this.f9751x);
        bVar.mo11116a(this.f9744B);
        bVar.mo11118c(this.f9743A);
        bVar.mo11118c(this.f9752y);
        bVar.mo11118c(this.f9753z);
        bVar.mo11116a(this.f9747E);
        return bVar.mo11117b();
    }

    /* renamed from: j */
    public Account mo11086j() {
        return this.f9751x;
    }

    /* renamed from: o */
    public ArrayList<C3439a> mo11087o() {
        return this.f9746D;
    }

    /* renamed from: p */
    public String mo11088p() {
        return this.f9747E;
    }

    /* renamed from: r */
    public ArrayList<Scope> mo11089r() {
        return new ArrayList<>(this.f9750w);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 1, this.f9749v);
        C3733c.m14452u(parcel, 2, mo11089r(), false);
        C3733c.m14447p(parcel, 3, mo11086j(), i, false);
        C3733c.m14434c(parcel, 4, mo11081G());
        C3733c.m14434c(parcel, 5, mo11082H());
        C3733c.m14434c(parcel, 6, mo11080E());
        C3733c.m14448q(parcel, 7, mo11079C(), false);
        C3733c.m14448q(parcel, 8, this.f9745C, false);
        C3733c.m14452u(parcel, 9, mo11087o(), false);
        C3733c.m14448q(parcel, 10, mo11088p(), false);
        C3733c.m14433b(parcel, a);
    }
}
