package p174e.p319f.p320a.p335c.p345f.p357l;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e.f.a.c.f.l.c1 */
public final class C8147c1 {

    /* renamed from: a */
    private static final ClassLoader f22141a = C8147c1.class.getClassLoader();

    private C8147c1() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m28378a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m28379b(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }
}
