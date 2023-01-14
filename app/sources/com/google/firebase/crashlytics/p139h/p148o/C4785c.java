package com.google.firebase.crashlytics.p139h.p148o;

import android.content.Context;
import com.google.android.datatransport.cct.C3328c;
import com.google.firebase.crashlytics.p139h.p142j.C4564f0;
import com.google.firebase.crashlytics.p139h.p142j.C4603t;
import com.google.firebase.crashlytics.p139h.p144l.C4655a0;
import com.google.firebase.crashlytics.p139h.p144l.p145d0.C4716g;
import com.google.firebase.crashlytics.p139h.p149p.C4800i;
import p174e.p319f.p320a.p322b.C6463b;
import p174e.p319f.p320a.p322b.C6466e;
import p174e.p319f.p320a.p322b.p323i.C6588t;
import p174e.p319f.p320a.p335c.p362h.C8963l;

/* renamed from: com.google.firebase.crashlytics.h.o.c */
public class C4785c {

    /* renamed from: a */
    private static final C4716g f13476a = new C4716g();

    /* renamed from: b */
    private static final String f13477b = m18304d("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: c */
    private static final String f13478c = m18304d("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: d */
    private static final C6466e<C4655a0, byte[]> f13479d = C4783a.f13473a;

    /* renamed from: e */
    private final C4786d f13480e;

    /* renamed from: f */
    private final C6466e<C4655a0, byte[]> f13481f;

    C4785c(C4786d dVar, C6466e<C4655a0, byte[]> eVar) {
        this.f13480e = dVar;
        this.f13481f = eVar;
    }

    /* renamed from: a */
    public static C4785c m18302a(Context context, C4800i iVar, C4564f0 f0Var) {
        C6588t.m25183f(context);
        C6463b b = C6463b.m24863b("json");
        C6466e<C4655a0, byte[]> eVar = f13479d;
        return new C4785c(new C4786d(C6588t.m25181c().mo19393g(new C3328c(f13477b, f13478c)).mo19245a("FIREBASE_CRASHLYTICS_REPORT", C4655a0.class, b, eVar), iVar.mo14699b(), f0Var), eVar);
    }

    /* renamed from: d */
    private static String m18304d(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public C8963l<C4603t> mo14687b(C4603t tVar, boolean z) {
        return this.f13480e.mo14688g(tVar, z).mo22782a();
    }
}
