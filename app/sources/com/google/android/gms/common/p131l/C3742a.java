package com.google.android.gms.common.p131l;

import android.util.Log;
import com.google.android.gms.common.internal.C3675i;
import java.util.Locale;
import okhttp3.HttpUrl;

/* renamed from: com.google.android.gms.common.l.a */
public class C3742a {

    /* renamed from: a */
    private final String f10426a;

    /* renamed from: b */
    private final String f10427b;

    /* renamed from: c */
    private final C3675i f10428c;

    /* renamed from: d */
    private final int f10429d;

    public C3742a(String str, String... strArr) {
        String str2;
        if (r0 == 0) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str3 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str3);
            }
            sb.append("] ");
            str2 = sb.toString();
        }
        this.f10427b = str2;
        this.f10426a = str;
        this.f10428c = new C3675i(str);
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.f10426a, i)) {
            i++;
        }
        this.f10429d = i;
    }

    /* renamed from: a */
    public void mo11709a(String str, Object... objArr) {
        if (mo11712d(3)) {
            Log.d(this.f10426a, mo11711c(str, objArr));
        }
    }

    /* renamed from: b */
    public void mo11710b(String str, Object... objArr) {
        Log.e(this.f10426a, mo11711c(str, objArr));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo11711c(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f10427b.concat(str);
    }

    /* renamed from: d */
    public boolean mo11712d(int i) {
        return this.f10429d <= i;
    }
}
