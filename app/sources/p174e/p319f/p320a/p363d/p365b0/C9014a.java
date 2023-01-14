package p174e.p319f.p320a.p363d.p365b0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p027c.p060f.C1801g;
import p027c.p077k.p078a.C2019a;

/* renamed from: e.f.a.d.b0.a */
public class C9014a extends C2019a {
    public static final Parcelable.Creator<C9014a> CREATOR = new C9015a();

    /* renamed from: p */
    public final C1801g<String, Bundle> f24531p;

    /* renamed from: e.f.a.d.b0.a$a */
    static class C9015a implements Parcelable.ClassLoaderCreator<C9014a> {
        C9015a() {
        }

        /* renamed from: a */
        public C9014a createFromParcel(Parcel parcel) {
            return new C9014a(parcel, (ClassLoader) null, (C9015a) null);
        }

        /* renamed from: b */
        public C9014a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C9014a(parcel, classLoader, (C9015a) null);
        }

        /* renamed from: c */
        public C9014a[] newArray(int i) {
            return new C9014a[i];
        }
    }

    private C9014a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f24531p = new C1801g<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f24531p.put(strArr[i], bundleArr[i]);
        }
    }

    /* synthetic */ C9014a(Parcel parcel, ClassLoader classLoader, C9015a aVar) {
        this(parcel, classLoader);
    }

    public C9014a(Parcelable parcelable) {
        super(parcelable);
        this.f24531p = new C1801g<>();
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f24531p + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.f24531p.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = this.f24531p.mo6258i(i2);
            bundleArr[i2] = this.f24531p.mo6263m(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
