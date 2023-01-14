package p174e.p319f.p320a.p382e.p383a.p385b;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e.f.a.e.a.b.g0 */
public final class C9114g0 {
    static {
        C9114g0.class.getClassLoader();
    }

    private C9114g0() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m30344a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m30345b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.os.IInterface, android.os.IBinder] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m30346c(android.os.Parcel r0, android.os.IInterface r1) {
        /*
            r0.writeStrongBinder(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p382e.p383a.p385b.C9114g0.m30346c(android.os.Parcel, android.os.IInterface):void");
    }
}
