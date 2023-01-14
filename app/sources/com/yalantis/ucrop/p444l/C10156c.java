package com.yalantis.ucrop.p444l;

/* renamed from: com.yalantis.ucrop.l.c */
public class C10156c {

    /* renamed from: a */
    private int f27119a;

    /* renamed from: b */
    private int f27120b;

    /* renamed from: c */
    private int f27121c;

    public C10156c(int i, int i2, int i3) {
        this.f27119a = i;
        this.f27120b = i2;
        this.f27121c = i3;
    }

    /* renamed from: a */
    public int mo25256a() {
        return this.f27120b;
    }

    /* renamed from: b */
    public int mo25257b() {
        return this.f27121c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10156c.class != obj.getClass()) {
            return false;
        }
        C10156c cVar = (C10156c) obj;
        return this.f27119a == cVar.f27119a && this.f27120b == cVar.f27120b && this.f27121c == cVar.f27121c;
    }

    public int hashCode() {
        return (((this.f27119a * 31) + this.f27120b) * 31) + this.f27121c;
    }
}
