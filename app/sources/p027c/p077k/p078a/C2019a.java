package p027c.p077k.p078a;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c.k.a.a */
public abstract class C2019a implements Parcelable {
    public static final Parcelable.Creator<C2019a> CREATOR = new C2021b();

    /* renamed from: f */
    public static final C2019a f5806f = new C2020a();

    /* renamed from: o */
    private final Parcelable f5807o;

    /* renamed from: c.k.a.a$a */
    static class C2020a extends C2019a {
        C2020a() {
            super((C2020a) null);
        }
    }

    /* renamed from: c.k.a.a$b */
    static class C2021b implements Parcelable.ClassLoaderCreator<C2019a> {
        C2021b() {
        }

        /* renamed from: a */
        public C2019a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }

        /* renamed from: b */
        public C2019a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return C2019a.f5806f;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: c */
        public C2019a[] newArray(int i) {
            return new C2019a[i];
        }
    }

    private C2019a() {
        this.f5807o = null;
    }

    protected C2019a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f5807o = readParcelable == null ? f5806f : readParcelable;
    }

    protected C2019a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f5807o = parcelable == f5806f ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    /* synthetic */ C2019a(C2020a aVar) {
        this();
    }

    /* renamed from: a */
    public final Parcelable mo6726a() {
        return this.f5807o;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f5807o, i);
    }
}
