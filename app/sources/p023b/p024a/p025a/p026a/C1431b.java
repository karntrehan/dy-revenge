package p023b.p024a.p025a.p026a;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import p023b.p024a.p025a.p026a.C1428a;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: b.a.a.a.b */
public class C1431b implements Parcelable {
    public static final Parcelable.Creator<C1431b> CREATOR = new C1432a();

    /* renamed from: f */
    final boolean f4178f = false;

    /* renamed from: o */
    final Handler f4179o = null;

    /* renamed from: p */
    C1428a f4180p;

    /* renamed from: b.a.a.a.b$a */
    class C1432a implements Parcelable.Creator<C1431b> {
        C1432a() {
        }

        /* renamed from: a */
        public C1431b createFromParcel(Parcel parcel) {
            return new C1431b(parcel);
        }

        /* renamed from: b */
        public C1431b[] newArray(int i) {
            return new C1431b[i];
        }
    }

    /* renamed from: b.a.a.a.b$b */
    class C1433b extends C1428a.C1429a {
        C1433b() {
        }

        /* renamed from: N0 */
        public void mo5310N0(int i, Bundle bundle) {
            C1431b bVar = C1431b.this;
            Handler handler = bVar.f4179o;
            if (handler != null) {
                handler.post(new C1434c(i, bundle));
            } else {
                bVar.mo1a(i, bundle);
            }
        }
    }

    /* renamed from: b.a.a.a.b$c */
    class C1434c implements Runnable {

        /* renamed from: f */
        final int f4182f;

        /* renamed from: o */
        final Bundle f4183o;

        C1434c(int i, Bundle bundle) {
            this.f4182f = i;
            this.f4183o = bundle;
        }

        public void run() {
            C1431b.this.mo1a(this.f4182f, this.f4183o);
        }
    }

    C1431b(Parcel parcel) {
        this.f4180p = C1428a.C1429a.m6438j(parcel.readStrongBinder());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1a(int i, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f4180p == null) {
                this.f4180p = new C1433b();
            }
            parcel.writeStrongBinder(this.f4180p.asBinder());
        }
    }
}
