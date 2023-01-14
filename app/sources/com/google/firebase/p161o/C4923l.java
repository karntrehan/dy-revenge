package com.google.firebase.p161o;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import okhttp3.HttpUrl;

/* renamed from: com.google.firebase.o.l */
class C4923l {

    /* renamed from: a */
    private final SharedPreferences f13780a;

    public C4923l(Context context, String str) {
        this.f13780a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    /* renamed from: a */
    private synchronized void m18774a() {
        long j = this.f13780a.getLong("fire-count", 0);
        String str = null;
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        for (Map.Entry next : this.f13780a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                for (String str3 : (Set) next.getValue()) {
                    if (str == null || str.compareTo(str3) > 0) {
                        str2 = (String) next.getKey();
                        str = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.f13780a.getStringSet(str2, new HashSet()));
        hashSet.remove(str);
        this.f13780a.edit().putStringSet(str2, hashSet).putLong("fire-count", j - 1).commit();
    }

    /* renamed from: d */
    private synchronized String m18775d(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo14924b() {
        SharedPreferences.Editor edit = this.f13780a.edit();
        for (Map.Entry next : this.f13780a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                edit.remove((String) next.getKey());
            }
        }
        edit.remove("fire-count");
        edit.commit();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized List<C4924m> mo14925c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry next : this.f13780a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                arrayList.add(C4924m.m18780a((String) next.getKey(), new ArrayList((Set) next.getValue())));
            }
        }
        mo14927f(System.currentTimeMillis());
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized void mo14926e(long j, String str) {
        String d = m18775d(j);
        if (!this.f13780a.getString("last-used-date", HttpUrl.FRAGMENT_ENCODE_SET).equals(d)) {
            long j2 = this.f13780a.getLong("fire-count", 0);
            if (j2 + 1 == 30) {
                m18774a();
                j2 = this.f13780a.getLong("fire-count", 0);
            }
            HashSet hashSet = new HashSet(this.f13780a.getStringSet(str, new HashSet()));
            hashSet.add(d);
            this.f13780a.edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", d).commit();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized void mo14927f(long j) {
        this.f13780a.edit().putLong("fire-global", j).commit();
    }
}
