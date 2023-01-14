package p174e.p319f.p320a.p335c.p345f.p352g;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

/* renamed from: e.f.a.c.f.g.q0 */
public final class C6955q0 {

    /* renamed from: a */
    private static final ClassLoader f18812a = C6955q0.class.getClassLoader();

    private C6955q0() {
    }

    /* renamed from: a */
    public static Parcelable m26381a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static HashMap m26382b(Parcel parcel) {
        return parcel.readHashMap(f18812a);
    }

    /* renamed from: c */
    public static void m26383c(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException("Parcel data not fully consumed, unread size: " + dataAvail);
        }
    }

    /* renamed from: d */
    public static void m26384d(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: e */
    public static void m26385e(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: f */
    public static void m26386f(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: g */
    public static boolean m26387g(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
