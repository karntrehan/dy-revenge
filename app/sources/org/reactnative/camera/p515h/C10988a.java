package org.reactnative.camera.p515h;

/* renamed from: org.reactnative.camera.h.a */
public class C10988a {

    /* renamed from: a */
    private int f28807a;

    /* renamed from: b */
    private int f28808b;

    /* renamed from: c */
    private int f28809c;

    /* renamed from: d */
    private int f28810d;

    public C10988a(int i, int i2) {
        this(i, i2, 0);
    }

    public C10988a(int i, int i2, int i3) {
        this(i, i2, i3, -1);
    }

    public C10988a(int i, int i2, int i3, int i4) {
        this.f28807a = i;
        this.f28808b = i2;
        this.f28809c = i4;
        this.f28810d = i3;
    }

    /* renamed from: a */
    public int mo28997a() {
        return this.f28809c;
    }

    /* renamed from: b */
    public int mo28998b() {
        return mo29001e() ? this.f28807a : this.f28808b;
    }

    /* renamed from: c */
    public int mo28999c() {
        return this.f28810d;
    }

    /* renamed from: d */
    public int mo29000d() {
        return mo29001e() ? this.f28808b : this.f28807a;
    }

    /* renamed from: e */
    public boolean mo29001e() {
        return this.f28810d % 180 == 90;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10988a)) {
            return super.equals(obj);
        }
        C10988a aVar = (C10988a) obj;
        return aVar.mo29000d() == mo29000d() && aVar.mo28998b() == mo28998b() && aVar.mo28997a() == mo28997a() && aVar.mo28999c() == mo28999c();
    }
}
