package p174e.p319f.p320a.p321a;

import android.os.Parcel;
import android.os.Parcelable;
import p027c.p028a.C1444j;

/* renamed from: e.f.a.a.j */
public class C6455j implements Comparable<C6455j>, Parcelable {
    public static final Parcelable.Creator<C6455j> CREATOR = new C6456a();

    /* renamed from: f */
    private final int f17993f;

    /* renamed from: o */
    private final int f17994o;

    /* renamed from: e.f.a.a.j$a */
    class C6456a implements Parcelable.Creator<C6455j> {
        C6456a() {
        }

        /* renamed from: a */
        public C6455j createFromParcel(Parcel parcel) {
            return new C6455j(parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public C6455j[] newArray(int i) {
            return new C6455j[i];
        }
    }

    public C6455j(int i, int i2) {
        this.f17993f = i;
        this.f17994o = i2;
    }

    /* renamed from: P */
    public static C6455j m24833P(String str) {
        int indexOf = str.indexOf(C1444j.f4246J0);
        if (indexOf != -1) {
            try {
                return new C6455j(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Malformed size: " + str, e);
            }
        } else {
            throw new IllegalArgumentException("Malformed size: " + str);
        }
    }

    /* renamed from: N */
    public int mo19205N() {
        return this.f17994o;
    }

    /* renamed from: O */
    public int mo19206O() {
        return this.f17993f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public int compareTo(C6455j jVar) {
        return (this.f17993f * this.f17994o) - (jVar.f17993f * jVar.f17994o);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6455j)) {
            return false;
        }
        C6455j jVar = (C6455j) obj;
        return this.f17993f == jVar.f17993f && this.f17994o == jVar.f17994o;
    }

    public int hashCode() {
        int i = this.f17994o;
        int i2 = this.f17993f;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public String toString() {
        return this.f17993f + "x" + this.f17994o;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f17993f);
        parcel.writeInt(this.f17994o);
    }
}
