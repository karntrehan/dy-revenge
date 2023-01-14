package org.pgsqlite;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableArray;

/* renamed from: org.pgsqlite.a */
public class C10908a {

    /* renamed from: a */
    private Callback f28555a;

    /* renamed from: b */
    private Callback f28556b;

    public C10908a(Callback callback, Callback callback2) {
        this.f28555a = callback;
        this.f28556b = callback2;
    }

    /* renamed from: a */
    public void mo28872a(String str) {
        this.f28556b.invoke(str);
    }

    /* renamed from: b */
    public void mo28873b(WritableArray writableArray) {
        this.f28555a.invoke(writableArray);
    }

    /* renamed from: c */
    public void mo28874c(String str) {
        this.f28555a.invoke(str);
    }
}
