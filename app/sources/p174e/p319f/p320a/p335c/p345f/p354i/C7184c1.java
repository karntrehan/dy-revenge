package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e.f.a.c.f.i.c1 */
public final class C7184c1 {

    /* renamed from: a */
    private static final ClassLoader f19196a = C7184c1.class.getClassLoader();

    private C7184c1() {
    }

    /* renamed from: a */
    public static void m27178a(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: b */
    public static void m27179b(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }
}
