package p174e.p319f.p320a.p335c.p345f.p356k;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e.f.a.c.f.k.b1 */
public final class C7784b1 {

    /* renamed from: a */
    private static final ClassLoader f21102a = C7784b1.class.getClassLoader();

    private C7784b1() {
    }

    /* renamed from: a */
    public static void m27859a(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: b */
    public static void m27860b(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }
}
