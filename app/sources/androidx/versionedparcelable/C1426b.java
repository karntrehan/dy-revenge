package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import okhttp3.HttpUrl;
import p027c.p060f.C1788a;

/* renamed from: androidx.versionedparcelable.b */
class C1426b extends C1425a {

    /* renamed from: d */
    private final SparseIntArray f4167d;

    /* renamed from: e */
    private final Parcel f4168e;

    /* renamed from: f */
    private final int f4169f;

    /* renamed from: g */
    private final int f4170g;

    /* renamed from: h */
    private final String f4171h;

    /* renamed from: i */
    private int f4172i;

    /* renamed from: j */
    private int f4173j;

    /* renamed from: k */
    private int f4174k;

    C1426b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), HttpUrl.FRAGMENT_ENCODE_SET, new C1788a(), new C1788a(), new C1788a());
    }

    private C1426b(Parcel parcel, int i, int i2, String str, C1788a<String, Method> aVar, C1788a<String, Method> aVar2, C1788a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f4167d = new SparseIntArray();
        this.f4172i = -1;
        this.f4173j = 0;
        this.f4174k = -1;
        this.f4168e = parcel;
        this.f4169f = i;
        this.f4170g = i2;
        this.f4173j = i;
        this.f4171h = str;
    }

    /* renamed from: A */
    public void mo5274A(byte[] bArr) {
        if (bArr != null) {
            this.f4168e.writeInt(bArr.length);
            this.f4168e.writeByteArray(bArr);
            return;
        }
        this.f4168e.writeInt(-1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo5276C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f4168e, 0);
    }

    /* renamed from: E */
    public void mo5278E(int i) {
        this.f4168e.writeInt(i);
    }

    /* renamed from: G */
    public void mo5280G(Parcelable parcelable) {
        this.f4168e.writeParcelable(parcelable, 0);
    }

    /* renamed from: I */
    public void mo5282I(String str) {
        this.f4168e.writeString(str);
    }

    /* renamed from: a */
    public void mo5287a() {
        int i = this.f4172i;
        if (i >= 0) {
            int i2 = this.f4167d.get(i);
            int dataPosition = this.f4168e.dataPosition();
            this.f4168e.setDataPosition(i2);
            this.f4168e.writeInt(dataPosition - i2);
            this.f4168e.setDataPosition(dataPosition);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1425a mo5288b() {
        Parcel parcel = this.f4168e;
        int dataPosition = parcel.dataPosition();
        int i = this.f4173j;
        if (i == this.f4169f) {
            i = this.f4170g;
        }
        int i2 = i;
        return new C1426b(parcel, dataPosition, i2, this.f4171h + "  ", this.f4164a, this.f4165b, this.f4166c);
    }

    /* renamed from: g */
    public boolean mo5290g() {
        return this.f4168e.readInt() != 0;
    }

    /* renamed from: i */
    public byte[] mo5292i() {
        int readInt = this.f4168e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f4168e.readByteArray(bArr);
        return bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public CharSequence mo5294k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f4168e);
    }

    /* renamed from: m */
    public boolean mo5296m(int i) {
        while (this.f4173j < this.f4170g) {
            int i2 = this.f4174k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f4168e.setDataPosition(this.f4173j);
            int readInt = this.f4168e.readInt();
            this.f4174k = this.f4168e.readInt();
            this.f4173j += readInt;
        }
        return this.f4174k == i;
    }

    /* renamed from: o */
    public int mo5298o() {
        return this.f4168e.readInt();
    }

    /* renamed from: q */
    public <T extends Parcelable> T mo5300q() {
        return this.f4168e.readParcelable(C1426b.class.getClassLoader());
    }

    /* renamed from: s */
    public String mo5302s() {
        return this.f4168e.readString();
    }

    /* renamed from: w */
    public void mo5306w(int i) {
        mo5287a();
        this.f4172i = i;
        this.f4167d.put(i, this.f4168e.dataPosition());
        mo5278E(0);
        mo5278E(i);
    }

    /* renamed from: y */
    public void mo5308y(boolean z) {
        this.f4168e.writeInt(z ? 1 : 0);
    }
}
