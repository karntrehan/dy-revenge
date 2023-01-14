package p174e.p319f.p320a.p335c.p345f.p347b;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e.f.a.c.f.b.e */
public final class C6657e {

    /* renamed from: a */
    private static final ClassLoader f18321a = C6657e.class.getClassLoader();

    private C6657e() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m25296a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m25297b(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }
}
