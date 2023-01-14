package com.facebook.react.animated;

import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;
import p174e.p247e.p315l.p316a.C6409a;

/* renamed from: com.facebook.react.animated.b */
abstract class C2611b {

    /* renamed from: a */
    List<C2611b> f7657a;

    /* renamed from: b */
    int f7658b = 0;

    /* renamed from: c */
    int f7659c = 0;

    /* renamed from: d */
    int f7660d = -1;

    C2611b() {
    }

    /* renamed from: a */
    public final void mo8423a(C2611b bVar) {
        if (this.f7657a == null) {
            this.f7657a = new ArrayList(1);
        }
        ((List) C6409a.m24521c(this.f7657a)).add(bVar);
        bVar.mo8424b(this);
    }

    /* renamed from: b */
    public void mo8424b(C2611b bVar) {
    }

    /* renamed from: c */
    public void mo8425c(C2611b bVar) {
    }

    /* renamed from: d */
    public abstract String mo8421d();

    /* renamed from: e */
    public String mo8426e() {
        String str;
        List<C2611b> list = this.f7657a;
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (list == null || list.size() <= 0) {
            str = str2;
        } else {
            str = str2;
            for (C2611b bVar : this.f7657a) {
                str = str + " " + bVar.f7660d;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(mo8421d());
        if (str.length() > 0) {
            str2 = " children: " + str;
        }
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: f */
    public final void mo8427f(C2611b bVar) {
        if (this.f7657a != null) {
            bVar.mo8425c(this);
            this.f7657a.remove(bVar);
        }
    }

    /* renamed from: g */
    public void mo8422g() {
    }
}
