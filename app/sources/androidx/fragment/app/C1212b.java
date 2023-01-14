package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.C1252s;
import androidx.lifecycle.C1286d;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.b */
final class C1212b implements Parcelable {
    public static final Parcelable.Creator<C1212b> CREATOR = new C1213a();

    /* renamed from: A */
    final boolean f3443A;

    /* renamed from: f */
    final int[] f3444f;

    /* renamed from: o */
    final ArrayList<String> f3445o;

    /* renamed from: p */
    final int[] f3446p;

    /* renamed from: q */
    final int[] f3447q;

    /* renamed from: r */
    final int f3448r;

    /* renamed from: s */
    final String f3449s;

    /* renamed from: t */
    final int f3450t;

    /* renamed from: u */
    final int f3451u;

    /* renamed from: v */
    final CharSequence f3452v;

    /* renamed from: w */
    final int f3453w;

    /* renamed from: x */
    final CharSequence f3454x;

    /* renamed from: y */
    final ArrayList<String> f3455y;

    /* renamed from: z */
    final ArrayList<String> f3456z;

    /* renamed from: androidx.fragment.app.b$a */
    static class C1213a implements Parcelable.Creator<C1212b> {
        C1213a() {
        }

        /* renamed from: a */
        public C1212b createFromParcel(Parcel parcel) {
            return new C1212b(parcel);
        }

        /* renamed from: b */
        public C1212b[] newArray(int i) {
            return new C1212b[i];
        }
    }

    public C1212b(Parcel parcel) {
        this.f3444f = parcel.createIntArray();
        this.f3445o = parcel.createStringArrayList();
        this.f3446p = parcel.createIntArray();
        this.f3447q = parcel.createIntArray();
        this.f3448r = parcel.readInt();
        this.f3449s = parcel.readString();
        this.f3450t = parcel.readInt();
        this.f3451u = parcel.readInt();
        this.f3452v = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3453w = parcel.readInt();
        this.f3454x = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3455y = parcel.createStringArrayList();
        this.f3456z = parcel.createStringArrayList();
        this.f3443A = parcel.readInt() != 0;
    }

    public C1212b(C1211a aVar) {
        int size = aVar.f3581c.size();
        this.f3444f = new int[(size * 5)];
        if (aVar.f3587i) {
            this.f3445o = new ArrayList<>(size);
            this.f3446p = new int[size];
            this.f3447q = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                C1252s.C1253a aVar2 = aVar.f3581c.get(i);
                int i3 = i2 + 1;
                this.f3444f[i2] = aVar2.f3598a;
                ArrayList<String> arrayList = this.f3445o;
                Fragment fragment = aVar2.f3599b;
                arrayList.add(fragment != null ? fragment.f3397s : null);
                int[] iArr = this.f3444f;
                int i4 = i3 + 1;
                iArr[i3] = aVar2.f3600c;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.f3601d;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f3602e;
                iArr[i6] = aVar2.f3603f;
                this.f3446p[i] = aVar2.f3604g.ordinal();
                this.f3447q[i] = aVar2.f3605h.ordinal();
                i++;
                i2 = i6 + 1;
            }
            this.f3448r = aVar.f3586h;
            this.f3449s = aVar.f3589k;
            this.f3450t = aVar.f3442v;
            this.f3451u = aVar.f3590l;
            this.f3452v = aVar.f3591m;
            this.f3453w = aVar.f3592n;
            this.f3454x = aVar.f3593o;
            this.f3455y = aVar.f3594p;
            this.f3456z = aVar.f3595q;
            this.f3443A = aVar.f3596r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* renamed from: a */
    public C1211a mo3985a(C1231l lVar) {
        C1211a aVar = new C1211a(lVar);
        int i = 0;
        int i2 = 0;
        while (i < this.f3444f.length) {
            C1252s.C1253a aVar2 = new C1252s.C1253a();
            int i3 = i + 1;
            aVar2.f3598a = this.f3444f[i];
            if (C1231l.m5013s0(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i2 + " base fragment #" + this.f3444f[i3]);
            }
            String str = this.f3445o.get(i2);
            aVar2.f3599b = str != null ? lVar.mo4127W(str) : null;
            aVar2.f3604g = C1286d.C1288b.values()[this.f3446p[i2]];
            aVar2.f3605h = C1286d.C1288b.values()[this.f3447q[i2]];
            int[] iArr = this.f3444f;
            int i4 = i3 + 1;
            int i5 = iArr[i3];
            aVar2.f3600c = i5;
            int i6 = i4 + 1;
            int i7 = iArr[i4];
            aVar2.f3601d = i7;
            int i8 = i6 + 1;
            int i9 = iArr[i6];
            aVar2.f3602e = i9;
            int i10 = iArr[i8];
            aVar2.f3603f = i10;
            aVar.f3582d = i5;
            aVar.f3583e = i7;
            aVar.f3584f = i9;
            aVar.f3585g = i10;
            aVar.mo4246f(aVar2);
            i2++;
            i = i8 + 1;
        }
        aVar.f3586h = this.f3448r;
        aVar.f3589k = this.f3449s;
        aVar.f3442v = this.f3450t;
        aVar.f3587i = true;
        aVar.f3590l = this.f3451u;
        aVar.f3591m = this.f3452v;
        aVar.f3592n = this.f3453w;
        aVar.f3593o = this.f3454x;
        aVar.f3594p = this.f3455y;
        aVar.f3595q = this.f3456z;
        aVar.f3596r = this.f3443A;
        aVar.mo3977t(1);
        return aVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f3444f);
        parcel.writeStringList(this.f3445o);
        parcel.writeIntArray(this.f3446p);
        parcel.writeIntArray(this.f3447q);
        parcel.writeInt(this.f3448r);
        parcel.writeString(this.f3449s);
        parcel.writeInt(this.f3450t);
        parcel.writeInt(this.f3451u);
        TextUtils.writeToParcel(this.f3452v, parcel, 0);
        parcel.writeInt(this.f3453w);
        TextUtils.writeToParcel(this.f3454x, parcel, 0);
        parcel.writeStringList(this.f3455y);
        parcel.writeStringList(this.f3456z);
        parcel.writeInt(this.f3443A ? 1 : 0);
    }
}
