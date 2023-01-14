package p174e.p319f.p320a.p382e.p383a.p385b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e.f.a.e.a.b.p0 */
public abstract class C9132p0 extends C9112f0 implements C9134q0 {
    public C9132p0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo23093j(int i, Parcel parcel) {
        switch (i) {
            case 2:
                mo13881k0(parcel.readInt(), (Bundle) C9114g0.m30344a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) C9114g0.m30344a(parcel, Bundle.CREATOR);
                mo13877M(readInt);
                return true;
            case 4:
                int readInt2 = parcel.readInt();
                Bundle bundle2 = (Bundle) C9114g0.m30344a(parcel, Bundle.CREATOR);
                mo13879f0(readInt2);
                return true;
            case 5:
                mo13874H0(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 6:
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle3 = (Bundle) C9114g0.m30344a(parcel, creator);
                mo13876L((Bundle) C9114g0.m30344a(parcel, creator));
                return true;
            case 7:
                mo13872D0((Bundle) C9114g0.m30344a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle4 = (Bundle) C9114g0.m30344a(parcel, creator2);
                mo13883t0((Bundle) C9114g0.m30344a(parcel, creator2));
                return true;
            case 10:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                Bundle bundle5 = (Bundle) C9114g0.m30344a(parcel, creator3);
                mo13880h0((Bundle) C9114g0.m30344a(parcel, creator3));
                return true;
            case 11:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                mo13884w0((Bundle) C9114g0.m30344a(parcel, creator4), (Bundle) C9114g0.m30344a(parcel, creator4));
                return true;
            case 12:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                mo13873E0((Bundle) C9114g0.m30344a(parcel, creator5), (Bundle) C9114g0.m30344a(parcel, creator5));
                return true;
            case 13:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                mo13875J0((Bundle) C9114g0.m30344a(parcel, creator6), (Bundle) C9114g0.m30344a(parcel, creator6));
                return true;
            case 14:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                Bundle bundle6 = (Bundle) C9114g0.m30344a(parcel, creator7);
                Bundle bundle7 = (Bundle) C9114g0.m30344a(parcel, creator7);
                mo13882p0();
                return true;
            case 15:
                Bundle bundle8 = (Bundle) C9114g0.m30344a(parcel, Bundle.CREATOR);
                mo13878M0();
                return true;
            default:
                return false;
        }
    }
}
