package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.p */
final class C1247p implements Parcelable {
    public static final Parcelable.Creator<C1247p> CREATOR = new C1248a();

    /* renamed from: f */
    final String f3560f;

    /* renamed from: o */
    final String f3561o;

    /* renamed from: p */
    final boolean f3562p;

    /* renamed from: q */
    final int f3563q;

    /* renamed from: r */
    final int f3564r;

    /* renamed from: s */
    final String f3565s;

    /* renamed from: t */
    final boolean f3566t;

    /* renamed from: u */
    final boolean f3567u;

    /* renamed from: v */
    final boolean f3568v;

    /* renamed from: w */
    final Bundle f3569w;

    /* renamed from: x */
    final boolean f3570x;

    /* renamed from: y */
    final int f3571y;

    /* renamed from: z */
    Bundle f3572z;

    /* renamed from: androidx.fragment.app.p$a */
    static class C1248a implements Parcelable.Creator<C1247p> {
        C1248a() {
        }

        /* renamed from: a */
        public C1247p createFromParcel(Parcel parcel) {
            return new C1247p(parcel);
        }

        /* renamed from: b */
        public C1247p[] newArray(int i) {
            return new C1247p[i];
        }
    }

    C1247p(Parcel parcel) {
        this.f3560f = parcel.readString();
        this.f3561o = parcel.readString();
        boolean z = true;
        this.f3562p = parcel.readInt() != 0;
        this.f3563q = parcel.readInt();
        this.f3564r = parcel.readInt();
        this.f3565s = parcel.readString();
        this.f3566t = parcel.readInt() != 0;
        this.f3567u = parcel.readInt() != 0;
        this.f3568v = parcel.readInt() != 0;
        this.f3569w = parcel.readBundle();
        this.f3570x = parcel.readInt() == 0 ? false : z;
        this.f3572z = parcel.readBundle();
        this.f3571y = parcel.readInt();
    }

    C1247p(Fragment fragment) {
        this.f3560f = fragment.getClass().getName();
        this.f3561o = fragment.f3397s;
        this.f3562p = fragment.f3357A;
        this.f3563q = fragment.f3366J;
        this.f3564r = fragment.f3367K;
        this.f3565s = fragment.f3368L;
        this.f3566t = fragment.f3371O;
        this.f3567u = fragment.f3404z;
        this.f3568v = fragment.f3370N;
        this.f3569w = fragment.f3398t;
        this.f3570x = fragment.f3369M;
        this.f3571y = fragment.f3387e0.ordinal();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f3560f);
        sb.append(" (");
        sb.append(this.f3561o);
        sb.append(")}:");
        if (this.f3562p) {
            sb.append(" fromLayout");
        }
        if (this.f3564r != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f3564r));
        }
        String str = this.f3565s;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f3565s);
        }
        if (this.f3566t) {
            sb.append(" retainInstance");
        }
        if (this.f3567u) {
            sb.append(" removing");
        }
        if (this.f3568v) {
            sb.append(" detached");
        }
        if (this.f3570x) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3560f);
        parcel.writeString(this.f3561o);
        parcel.writeInt(this.f3562p ? 1 : 0);
        parcel.writeInt(this.f3563q);
        parcel.writeInt(this.f3564r);
        parcel.writeString(this.f3565s);
        parcel.writeInt(this.f3566t ? 1 : 0);
        parcel.writeInt(this.f3567u ? 1 : 0);
        parcel.writeInt(this.f3568v ? 1 : 0);
        parcel.writeBundle(this.f3569w);
        parcel.writeInt(this.f3570x ? 1 : 0);
        parcel.writeBundle(this.f3572z);
        parcel.writeInt(this.f3571y);
    }
}
