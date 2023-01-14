package android.support.p001v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p001v4.media.C0007b;
import android.support.p001v4.media.C0009c;
import android.text.TextUtils;

/* renamed from: android.support.v4.media.MediaDescriptionCompat */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0002a();

    /* renamed from: f */
    private final String f4f;

    /* renamed from: o */
    private final CharSequence f5o;

    /* renamed from: p */
    private final CharSequence f6p;

    /* renamed from: q */
    private final CharSequence f7q;

    /* renamed from: r */
    private final Bitmap f8r;

    /* renamed from: s */
    private final Uri f9s;

    /* renamed from: t */
    private final Bundle f10t;

    /* renamed from: u */
    private final Uri f11u;

    /* renamed from: v */
    private Object f12v;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    static class C0002a implements Parcelable.Creator<MediaDescriptionCompat> {
        C0002a() {
        }

        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return Build.VERSION.SDK_INT < 21 ? new MediaDescriptionCompat(parcel) : MediaDescriptionCompat.m7a(C0007b.m25a(parcel));
        }

        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    public static final class C0003b {

        /* renamed from: a */
        private String f13a;

        /* renamed from: b */
        private CharSequence f14b;

        /* renamed from: c */
        private CharSequence f15c;

        /* renamed from: d */
        private CharSequence f16d;

        /* renamed from: e */
        private Bitmap f17e;

        /* renamed from: f */
        private Uri f18f;

        /* renamed from: g */
        private Bundle f19g;

        /* renamed from: h */
        private Uri f20h;

        /* renamed from: a */
        public MediaDescriptionCompat mo17a() {
            return new MediaDescriptionCompat(this.f13a, this.f14b, this.f15c, this.f16d, this.f17e, this.f18f, this.f19g, this.f20h);
        }

        /* renamed from: b */
        public C0003b mo18b(CharSequence charSequence) {
            this.f16d = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0003b mo19c(Bundle bundle) {
            this.f19g = bundle;
            return this;
        }

        /* renamed from: d */
        public C0003b mo20d(Bitmap bitmap) {
            this.f17e = bitmap;
            return this;
        }

        /* renamed from: e */
        public C0003b mo21e(Uri uri) {
            this.f18f = uri;
            return this;
        }

        /* renamed from: f */
        public C0003b mo22f(String str) {
            this.f13a = str;
            return this;
        }

        /* renamed from: g */
        public C0003b mo23g(Uri uri) {
            this.f20h = uri;
            return this;
        }

        /* renamed from: h */
        public C0003b mo24h(CharSequence charSequence) {
            this.f15c = charSequence;
            return this;
        }

        /* renamed from: i */
        public C0003b mo25i(CharSequence charSequence) {
            this.f14b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f4f = parcel.readString();
        this.f5o = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f6p = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f7q = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f8r = (Bitmap) parcel.readParcelable(classLoader);
        this.f9s = (Uri) parcel.readParcelable(classLoader);
        this.f10t = parcel.readBundle(classLoader);
        this.f11u = (Uri) parcel.readParcelable(classLoader);
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f4f = str;
        this.f5o = charSequence;
        this.f6p = charSequence2;
        this.f7q = charSequence3;
        this.f8r = bitmap;
        this.f9s = uri;
        this.f10t = bundle;
        this.f11u = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p001v4.media.MediaDescriptionCompat m7a(java.lang.Object r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L_0x007e
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x007e
            android.support.v4.media.MediaDescriptionCompat$b r2 = new android.support.v4.media.MediaDescriptionCompat$b
            r2.<init>()
            java.lang.String r3 = android.support.p001v4.media.C0007b.m30f(r9)
            r2.mo22f(r3)
            java.lang.CharSequence r3 = android.support.p001v4.media.C0007b.m32h(r9)
            r2.mo25i(r3)
            java.lang.CharSequence r3 = android.support.p001v4.media.C0007b.m31g(r9)
            r2.mo24h(r3)
            java.lang.CharSequence r3 = android.support.p001v4.media.C0007b.m26b(r9)
            r2.mo18b(r3)
            android.graphics.Bitmap r3 = android.support.p001v4.media.C0007b.m28d(r9)
            r2.mo20d(r3)
            android.net.Uri r3 = android.support.p001v4.media.C0007b.m29e(r9)
            r2.mo21e(r3)
            android.os.Bundle r3 = android.support.p001v4.media.C0007b.m27c(r9)
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r3 == 0) goto L_0x004a
            android.support.p001v4.media.session.MediaSessionCompat.m53a(r3)
            android.os.Parcelable r5 = r3.getParcelable(r4)
            android.net.Uri r5 = (android.net.Uri) r5
            goto L_0x004b
        L_0x004a:
            r5 = r0
        L_0x004b:
            if (r5 == 0) goto L_0x0063
            java.lang.String r6 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L_0x005d
            int r7 = r3.size()
            r8 = 2
            if (r7 != r8) goto L_0x005d
            goto L_0x0064
        L_0x005d:
            r3.remove(r4)
            r3.remove(r6)
        L_0x0063:
            r0 = r3
        L_0x0064:
            r2.mo19c(r0)
            if (r5 == 0) goto L_0x006d
            r2.mo23g(r5)
            goto L_0x0078
        L_0x006d:
            r0 = 23
            if (r1 < r0) goto L_0x0078
            android.net.Uri r0 = android.support.p001v4.media.C0009c.m43a(r9)
            r2.mo23g(r0)
        L_0x0078:
            android.support.v4.media.MediaDescriptionCompat r0 = r2.mo17a()
            r0.f12v = r9
        L_0x007e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.media.MediaDescriptionCompat.m7a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    /* renamed from: b */
    public Object mo9b() {
        int i;
        Object obj = this.f12v;
        if (obj != null || (i = Build.VERSION.SDK_INT) < 21) {
            return obj;
        }
        Object b = C0007b.C0008a.m35b();
        C0007b.C0008a.m40g(b, this.f4f);
        C0007b.C0008a.m42i(b, this.f5o);
        C0007b.C0008a.m41h(b, this.f6p);
        C0007b.C0008a.m36c(b, this.f7q);
        C0007b.C0008a.m38e(b, this.f8r);
        C0007b.C0008a.m39f(b, this.f9s);
        Bundle bundle = this.f10t;
        if (i < 23 && this.f11u != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f11u);
        }
        C0007b.C0008a.m37d(b, bundle);
        if (i >= 23) {
            C0009c.C0010a.m44a(b, this.f11u);
        }
        Object a = C0007b.C0008a.m34a(b);
        this.f12v = a;
        return a;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f5o + ", " + this.f6p + ", " + this.f7q;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (Build.VERSION.SDK_INT < 21) {
            parcel.writeString(this.f4f);
            TextUtils.writeToParcel(this.f5o, parcel, i);
            TextUtils.writeToParcel(this.f6p, parcel, i);
            TextUtils.writeToParcel(this.f7q, parcel, i);
            parcel.writeParcelable(this.f8r, i);
            parcel.writeParcelable(this.f9s, i);
            parcel.writeBundle(this.f10t);
            parcel.writeParcelable(this.f11u, i);
            return;
        }
        C0007b.m33i(mo9b(), parcel, i);
    }
}
