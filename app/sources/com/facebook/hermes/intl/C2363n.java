package com.facebook.hermes.intl;

import android.os.Build;
import android.text.TextUtils;
import com.facebook.hermes.intl.C2368r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.facebook.hermes.intl.n */
public class C2363n implements C2320b<Locale> {

    /* renamed from: a */
    private Locale f7049a = null;

    /* renamed from: b */
    private C2368r f7050b = null;

    /* renamed from: c */
    private boolean f7051c = false;

    private C2363n(C2368r rVar) {
        this.f7050b = rVar;
        m9778o();
    }

    private C2363n(String str) {
        this.f7050b = C2359k.m9755f(str);
        m9778o();
    }

    private C2363n(Locale locale) {
        this.f7049a = locale;
    }

    /* renamed from: i */
    public static C2320b<Locale> m9774i() {
        return new C2363n(Locale.getDefault());
    }

    /* renamed from: j */
    public static C2320b<Locale> m9775j(String str) {
        return new C2363n(str);
    }

    /* renamed from: k */
    private void m9776k() {
        if (this.f7051c) {
            try {
                m9778o();
                this.f7051c = false;
            } catch (RuntimeException e) {
                throw new C2354h(e.getMessage());
            }
        }
    }

    /* renamed from: l */
    private void m9777l() {
        if (this.f7050b == null) {
            this.f7050b = C2359k.m9755f(Build.VERSION.SDK_INT < 21 ? "en" : this.f7049a.toLanguageTag());
        }
    }

    /* renamed from: o */
    private void m9778o() {
        if (Build.VERSION.SDK_INT < 21) {
            this.f7049a = Locale.ENGLISH;
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        StringBuffer stringBuffer3 = new StringBuffer();
        StringBuffer stringBuffer4 = new StringBuffer();
        String str = this.f7050b.f7058a.f7065a;
        if (str != null && !str.isEmpty()) {
            stringBuffer2.append(this.f7050b.f7058a.f7065a);
        }
        String str2 = this.f7050b.f7058a.f7066b;
        if (str2 != null && !str2.isEmpty()) {
            stringBuffer3.append(this.f7050b.f7058a.f7066b);
        }
        String str3 = this.f7050b.f7058a.f7067c;
        if (str3 != null && !str3.isEmpty()) {
            stringBuffer4.append(this.f7050b.f7058a.f7067c);
        }
        C2359k.m9762m(stringBuffer2, stringBuffer3, stringBuffer4);
        if (stringBuffer2.length() > 0) {
            stringBuffer.append(stringBuffer2.toString());
        }
        if (stringBuffer3.length() > 0) {
            stringBuffer.append("-");
            stringBuffer.append(stringBuffer3.toString());
        }
        if (stringBuffer4.length() > 0) {
            stringBuffer.append("-");
            stringBuffer.append(C2359k.m9763n(stringBuffer4));
        }
        ArrayList<String> arrayList = this.f7050b.f7058a.f7068d;
        if (arrayList != null && !arrayList.isEmpty()) {
            stringBuffer.append("-");
            stringBuffer.append(TextUtils.join("-", this.f7050b.f7058a.f7068d));
        }
        TreeMap<Character, ArrayList<String>> treeMap = this.f7050b.f7063f;
        if (treeMap != null) {
            for (Map.Entry next : treeMap.entrySet()) {
                stringBuffer.append("-");
                stringBuffer.append(next.getKey());
                stringBuffer.append("-");
                stringBuffer.append(TextUtils.join("-", (Iterable) next.getValue()));
            }
        }
        C2368r rVar = this.f7050b;
        if (!(rVar.f7061d == null && rVar.f7062e == null)) {
            stringBuffer.append("-");
            stringBuffer.append('t');
            stringBuffer.append("-");
            StringBuffer stringBuffer5 = new StringBuffer();
            C2368r.C2369a aVar = this.f7050b.f7061d;
            if (aVar != null) {
                stringBuffer5.append(aVar.f7065a);
                if (this.f7050b.f7061d.f7066b != null) {
                    stringBuffer5.append("-");
                    stringBuffer5.append(this.f7050b.f7061d.f7066b);
                }
                if (this.f7050b.f7061d.f7067c != null) {
                    stringBuffer5.append("-");
                    stringBuffer5.append(this.f7050b.f7061d.f7067c);
                }
                ArrayList<String> arrayList2 = this.f7050b.f7061d.f7068d;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    stringBuffer5.append("-");
                    stringBuffer5.append(TextUtils.join("-", this.f7050b.f7061d.f7068d));
                }
            }
            TreeMap<String, ArrayList<String>> treeMap2 = this.f7050b.f7062e;
            if (treeMap2 != null) {
                for (Map.Entry next2 : treeMap2.entrySet()) {
                    stringBuffer5.append("-" + ((String) next2.getKey()));
                    Iterator it = ((ArrayList) next2.getValue()).iterator();
                    while (it.hasNext()) {
                        stringBuffer5.append("-" + ((String) it.next()));
                    }
                }
                if (stringBuffer5.length() > 0 && stringBuffer5.charAt(0) == '-') {
                    stringBuffer5.deleteCharAt(0);
                }
            }
            stringBuffer.append(stringBuffer5.toString());
        }
        C2368r rVar2 = this.f7050b;
        if (!(rVar2.f7059b == null && rVar2.f7060c == null)) {
            stringBuffer.append("-");
            stringBuffer.append('u');
            stringBuffer.append("-");
            StringBuffer stringBuffer6 = new StringBuffer();
            ArrayList<CharSequence> arrayList3 = this.f7050b.f7059b;
            if (arrayList3 != null) {
                stringBuffer6.append(TextUtils.join("-", arrayList3));
            }
            TreeMap<String, ArrayList<String>> treeMap3 = this.f7050b.f7060c;
            if (treeMap3 != null) {
                for (Map.Entry next3 : treeMap3.entrySet()) {
                    stringBuffer6.append("-" + ((String) next3.getKey()));
                    Iterator it2 = ((ArrayList) next3.getValue()).iterator();
                    while (it2.hasNext()) {
                        stringBuffer6.append("-" + ((String) it2.next()));
                    }
                }
            }
            if (stringBuffer6.length() > 0 && stringBuffer6.charAt(0) == '-') {
                stringBuffer6.deleteCharAt(0);
            }
            stringBuffer.append(stringBuffer6.toString());
        }
        if (this.f7050b.f7064g != null) {
            stringBuffer.append("-");
            stringBuffer.append('x');
            stringBuffer.append("-");
            stringBuffer.append(TextUtils.join("-", this.f7050b.f7064g));
        }
        try {
            this.f7049a = Locale.forLanguageTag(stringBuffer.toString());
            this.f7051c = false;
        } catch (RuntimeException e) {
            throw new C2354h(e.getMessage());
        }
    }

    /* renamed from: a */
    public String mo7932a() {
        return Build.VERSION.SDK_INT < 21 ? "en" : mo7939h().toLanguageTag();
    }

    /* renamed from: b */
    public HashMap<String, String> mo7933b() {
        HashMap<String, String> hashMap = new HashMap<>();
        TreeMap<String, ArrayList<String>> treeMap = this.f7050b.f7060c;
        if (treeMap != null) {
            for (String next : treeMap.keySet()) {
                hashMap.put(next, TextUtils.join("-", this.f7050b.f7060c.get(next)));
            }
        }
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r2 = r0.get(r2);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<java.lang.String> mo7934c(java.lang.String r2) {
        /*
            r1 = this;
            r1.m9776k()
            r1.m9777l()
            com.facebook.hermes.intl.r r0 = r1.f7050b
            java.util.TreeMap<java.lang.String, java.util.ArrayList<java.lang.String>> r0 = r0.f7060c
            if (r0 == 0) goto L_0x0015
            java.lang.Object r2 = r0.get(r2)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            if (r2 == 0) goto L_0x0015
            return r2
        L_0x0015:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.hermes.intl.C2363n.mo7934c(java.lang.String):java.util.ArrayList");
    }

    /* renamed from: e */
    public C2320b<Locale> mo7936e() {
        m9776k();
        return new C2363n(this.f7049a);
    }

    /* renamed from: f */
    public String mo7937f() {
        return Build.VERSION.SDK_INT < 21 ? "en" : mo7935d().toLanguageTag();
    }

    /* renamed from: g */
    public void mo7938g(String str, ArrayList<String> arrayList) {
        m9776k();
        m9777l();
        C2368r rVar = this.f7050b;
        if (rVar.f7060c == null) {
            rVar.f7060c = new TreeMap<>();
        }
        if (!this.f7050b.f7060c.containsKey(str)) {
            this.f7050b.f7060c.put(str, new ArrayList());
        }
        this.f7050b.f7060c.get(str).clear();
        this.f7050b.f7060c.get(str).addAll(arrayList);
        this.f7051c = true;
    }

    /* renamed from: m */
    public Locale mo7939h() {
        m9776k();
        return this.f7049a;
    }

    /* renamed from: n */
    public Locale mo7935d() {
        m9776k();
        m9777l();
        C2368r rVar = new C2368r();
        rVar.f7058a = this.f7050b.f7058a;
        return new C2363n(rVar).mo7939h();
    }
}
