package com.facebook.react.uimanager;

import java.util.Comparator;

/* renamed from: com.facebook.react.uimanager.a1 */
public class C2920a1 {

    /* renamed from: a */
    public static Comparator<C2920a1> f8198a = new C2921a();

    /* renamed from: b */
    public final int f8199b;

    /* renamed from: c */
    public final int f8200c;

    /* renamed from: com.facebook.react.uimanager.a1$a */
    static class C2921a implements Comparator<C2920a1> {
        C2921a() {
        }

        /* renamed from: a */
        public int compare(C2920a1 a1Var, C2920a1 a1Var2) {
            return a1Var.f8200c - a1Var2.f8200c;
        }
    }

    public C2920a1(int i, int i2) {
        this.f8199b = i;
        this.f8200c = i2;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != C2920a1.class) {
            return false;
        }
        C2920a1 a1Var = (C2920a1) obj;
        return this.f8200c == a1Var.f8200c && this.f8199b == a1Var.f8199b;
    }

    public String toString() {
        return "[" + this.f8199b + ", " + this.f8200c + "]";
    }
}
