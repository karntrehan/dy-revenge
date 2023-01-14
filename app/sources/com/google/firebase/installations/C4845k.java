package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.firebase.installations.p152m.C4853d;
import com.google.firebase.installations.p154o.C4869a;
import com.google.firebase.installations.p154o.C4870b;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: com.google.firebase.installations.k */
public final class C4845k {

    /* renamed from: a */
    public static final long f13630a = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: b */
    private static final Pattern f13631b = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: c */
    private static C4845k f13632c;

    /* renamed from: d */
    private final C4869a f13633d;

    private C4845k(C4869a aVar) {
        this.f13633d = aVar;
    }

    /* renamed from: c */
    public static C4845k m18504c() {
        return m18505d(C4870b.m18634b());
    }

    /* renamed from: d */
    public static C4845k m18505d(C4869a aVar) {
        if (f13632c == null) {
            f13632c = new C4845k(aVar);
        }
        return f13632c;
    }

    /* renamed from: g */
    static boolean m18506g(String str) {
        return f13631b.matcher(str).matches();
    }

    /* renamed from: h */
    static boolean m18507h(String str) {
        return str.contains(":");
    }

    /* renamed from: a */
    public long mo14759a() {
        return this.f13633d.mo14826a();
    }

    /* renamed from: b */
    public long mo14760b() {
        return TimeUnit.MILLISECONDS.toSeconds(mo14759a());
    }

    /* renamed from: e */
    public long mo14761e() {
        return (long) (Math.random() * 1000.0d);
    }

    /* renamed from: f */
    public boolean mo14762f(C4853d dVar) {
        return TextUtils.isEmpty(dVar.mo14764b()) || dVar.mo14771h() + dVar.mo14765c() < mo14760b() + f13630a;
    }
}
