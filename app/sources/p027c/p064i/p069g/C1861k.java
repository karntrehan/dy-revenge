package p027c.p064i.p069g;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* renamed from: c.i.g.k */
public final class C1861k {

    /* renamed from: c.i.g.k$a */
    static class C1862a<T> implements Parcelable.ClassLoaderCreator<T> {

        /* renamed from: a */
        private final C1863l<T> f5499a;

        C1862a(C1863l<T> lVar) {
            this.f5499a = lVar;
        }

        public T createFromParcel(Parcel parcel) {
            return this.f5499a.createFromParcel(parcel, (ClassLoader) null);
        }

        public T createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return this.f5499a.createFromParcel(parcel, classLoader);
        }

        public T[] newArray(int i) {
            return this.f5499a.newArray(i);
        }
    }

    @Deprecated
    /* renamed from: a */
    public static <T> Parcelable.Creator<T> m7880a(C1863l<T> lVar) {
        return new C1862a(lVar);
    }
}
