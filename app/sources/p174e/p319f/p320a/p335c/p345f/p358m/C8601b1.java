package p174e.p319f.p320a.p335c.p345f.p358m;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e.f.a.c.f.m.b1 */
public final class C8601b1 {

    /* renamed from: a */
    private static final ClassLoader f23525a = C8601b1.class.getClassLoader();

    private C8601b1() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m29383a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m29384b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: c */
    public static void m29385c(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }
}
