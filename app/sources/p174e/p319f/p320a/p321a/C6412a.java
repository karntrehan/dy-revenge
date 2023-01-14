package p174e.p319f.p320a.p321a;

import android.os.Parcel;
import android.os.Parcelable;
import p027c.p060f.C1802h;

/* renamed from: e.f.a.a.a */
public class C6412a implements Comparable<C6412a>, Parcelable {
    public static final Parcelable.Creator<C6412a> CREATOR = new C6413a();

    /* renamed from: f */
    private static final C1802h<C1802h<C6412a>> f17846f = new C1802h<>(16);

    /* renamed from: o */
    private final int f17847o;

    /* renamed from: p */
    private final int f17848p;

    /* renamed from: e.f.a.a.a$a */
    class C6413a implements Parcelable.Creator<C6412a> {
        C6413a() {
        }

        /* renamed from: a */
        public C6412a createFromParcel(Parcel parcel) {
            return C6412a.m24526S(parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public C6412a[] newArray(int i) {
            return new C6412a[i];
        }
    }

    private C6412a(int i, int i2) {
        this.f17847o = i;
        this.f17848p = i2;
    }

    /* renamed from: N */
    private static int m24525N(int i, int i2) {
        while (true) {
            int i3 = i2;
            int i4 = i;
            i = i3;
            if (i == 0) {
                return i4;
            }
            i2 = i4 % i;
        }
    }

    /* renamed from: S */
    public static C6412a m24526S(int i, int i2) {
        int N = m24525N(i, i2);
        int i3 = i / N;
        int i4 = i2 / N;
        C1802h<C1802h<C6412a>> hVar = f17846f;
        C1802h g = hVar.mo6276g(i3);
        if (g == null) {
            C6412a aVar = new C6412a(i3, i4);
            C1802h hVar2 = new C1802h();
            hVar2.mo6281m(i4, aVar);
            hVar.mo6281m(i3, hVar2);
            return aVar;
        }
        C6412a aVar2 = (C6412a) g.mo6276g(i4);
        if (aVar2 != null) {
            return aVar2;
        }
        C6412a aVar3 = new C6412a(i3, i4);
        g.mo6281m(i4, aVar3);
        return aVar3;
    }

    /* renamed from: T */
    public static C6412a m24527T(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            try {
                return m24526S(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Malformed aspect ratio: " + str, e);
            }
        } else {
            throw new IllegalArgumentException("Malformed aspect ratio: " + str);
        }
    }

    /* renamed from: O */
    public int mo18988O() {
        return this.f17847o;
    }

    /* renamed from: P */
    public int mo18989P() {
        return this.f17848p;
    }

    /* renamed from: Q */
    public C6412a mo18990Q() {
        return m24526S(this.f17848p, this.f17847o);
    }

    /* renamed from: R */
    public boolean mo18991R(C6455j jVar) {
        int N = m24525N(jVar.mo19206O(), jVar.mo19205N());
        return this.f17847o == jVar.mo19206O() / N && this.f17848p == jVar.mo19205N() / N;
    }

    /* renamed from: U */
    public float mo18992U() {
        return ((float) this.f17847o) / ((float) this.f17848p);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public int compareTo(C6412a aVar) {
        if (equals(aVar)) {
            return 0;
        }
        return mo18992U() - aVar.mo18992U() > 0.0f ? 1 : -1;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6412a)) {
            return false;
        }
        C6412a aVar = (C6412a) obj;
        return this.f17847o == aVar.f17847o && this.f17848p == aVar.f17848p;
    }

    public int hashCode() {
        int i = this.f17848p;
        int i2 = this.f17847o;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public String toString() {
        return this.f17847o + ":" + this.f17848p;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f17847o);
        parcel.writeInt(this.f17848p);
    }
}
