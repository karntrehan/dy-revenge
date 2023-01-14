package p174e.p319f.p320a.p335c.p345f.p351f;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e.f.a.c.f.f.c */
public final class C6689c {

    /* renamed from: a */
    private static final ClassLoader f18343a = C6689c.class.getClassLoader();

    private C6689c() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m25349a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m25350b(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: c */
    public static void m25351c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: d */
    public static void m25352d(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: e */
    public static boolean m25353e(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
