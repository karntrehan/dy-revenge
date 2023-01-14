package com.facebook.react.p116f0.p118b;

import android.content.Context;
import android.net.Uri;
import java.util.Objects;
import p174e.p247e.p315l.p316a.C6409a;

/* renamed from: com.facebook.react.f0.b.a */
public class C2758a {

    /* renamed from: a */
    private Uri f7820a;

    /* renamed from: b */
    private String f7821b;

    /* renamed from: c */
    private double f7822c;

    /* renamed from: d */
    private boolean f7823d;

    public C2758a(Context context, String str) {
        this(context, str, 0.0d, 0.0d);
    }

    public C2758a(Context context, String str, double d, double d2) {
        this.f7821b = str;
        this.f7822c = d * d2;
        this.f7820a = m11064b(context);
    }

    /* renamed from: a */
    private Uri m11063a(Context context) {
        this.f7823d = true;
        return C2762c.m11073a().mo9029d(context, this.f7821b);
    }

    /* renamed from: b */
    private Uri m11064b(Context context) {
        try {
            Uri parse = Uri.parse(this.f7821b);
            return parse.getScheme() == null ? m11063a(context) : parse;
        } catch (Exception unused) {
            return m11063a(context);
        }
    }

    /* renamed from: c */
    public double mo9019c() {
        return this.f7822c;
    }

    /* renamed from: d */
    public String mo9020d() {
        return this.f7821b;
    }

    /* renamed from: e */
    public Uri mo9021e() {
        return (Uri) C6409a.m24521c(this.f7820a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2758a.class != obj.getClass()) {
            return false;
        }
        C2758a aVar = (C2758a) obj;
        return Double.compare(aVar.f7822c, this.f7822c) == 0 && this.f7823d == aVar.f7823d && Objects.equals(this.f7820a, aVar.f7820a) && Objects.equals(this.f7821b, aVar.f7821b);
    }

    /* renamed from: f */
    public boolean mo9023f() {
        return this.f7823d;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f7820a, this.f7821b, Double.valueOf(this.f7822c), Boolean.valueOf(this.f7823d)});
    }
}
