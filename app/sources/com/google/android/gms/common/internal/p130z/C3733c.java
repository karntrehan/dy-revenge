package com.google.android.gms.common.internal.p130z;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.z.c */
public class C3733c {
    /* renamed from: a */
    public static int m14432a(Parcel parcel) {
        return m14453v(parcel, 20293);
    }

    /* renamed from: b */
    public static void m14433b(Parcel parcel, int i) {
        m14454w(parcel, i);
    }

    /* renamed from: c */
    public static void m14434c(Parcel parcel, int i, boolean z) {
        m14455x(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: d */
    public static void m14435d(Parcel parcel, int i, Boolean bool, boolean z) {
        if (bool != null) {
            m14455x(parcel, i, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            m14455x(parcel, i, 0);
        }
    }

    /* renamed from: e */
    public static void m14436e(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle != null) {
            int v = m14453v(parcel, i);
            parcel.writeBundle(bundle);
            m14454w(parcel, v);
        } else if (z) {
            m14455x(parcel, i, 0);
        }
    }

    /* renamed from: f */
    public static void m14437f(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr != null) {
            int v = m14453v(parcel, i);
            parcel.writeByteArray(bArr);
            m14454w(parcel, v);
        } else if (z) {
            m14455x(parcel, i, 0);
        }
    }

    /* renamed from: g */
    public static void m14438g(Parcel parcel, int i, double d) {
        m14455x(parcel, i, 8);
        parcel.writeDouble(d);
    }

    /* renamed from: h */
    public static void m14439h(Parcel parcel, int i, Double d, boolean z) {
        if (d != null) {
            m14455x(parcel, i, 8);
            parcel.writeDouble(d.doubleValue());
        } else if (z) {
            m14455x(parcel, i, 0);
        }
    }

    /* renamed from: i */
    public static void m14440i(Parcel parcel, int i, float f) {
        m14455x(parcel, i, 4);
        parcel.writeFloat(f);
    }

    /* renamed from: j */
    public static void m14441j(Parcel parcel, int i, Float f, boolean z) {
        if (f != null) {
            m14455x(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        } else if (z) {
            m14455x(parcel, i, 0);
        }
    }

    /* renamed from: k */
    public static void m14442k(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int v = m14453v(parcel, i);
            parcel.writeStrongBinder(iBinder);
            m14454w(parcel, v);
        } else if (z) {
            m14455x(parcel, i, 0);
        }
    }

    /* renamed from: l */
    public static void m14443l(Parcel parcel, int i, int i2) {
        m14455x(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: m */
    public static void m14444m(Parcel parcel, int i, int[] iArr, boolean z) {
        if (iArr != null) {
            int v = m14453v(parcel, i);
            parcel.writeIntArray(iArr);
            m14454w(parcel, v);
        } else if (z) {
            m14455x(parcel, i, 0);
        }
    }

    /* renamed from: n */
    public static void m14445n(Parcel parcel, int i, long j) {
        m14455x(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: o */
    public static void m14446o(Parcel parcel, int i, Long l, boolean z) {
        if (l != null) {
            m14455x(parcel, i, 8);
            parcel.writeLong(l.longValue());
        } else if (z) {
            m14455x(parcel, i, 0);
        }
    }

    /* renamed from: p */
    public static void m14447p(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int v = m14453v(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            m14454w(parcel, v);
        } else if (z) {
            m14455x(parcel, i, 0);
        }
    }

    /* renamed from: q */
    public static void m14448q(Parcel parcel, int i, String str, boolean z) {
        if (str != null) {
            int v = m14453v(parcel, i);
            parcel.writeString(str);
            m14454w(parcel, v);
        } else if (z) {
            m14455x(parcel, i, 0);
        }
    }

    /* renamed from: r */
    public static void m14449r(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr != null) {
            int v = m14453v(parcel, i);
            parcel.writeStringArray(strArr);
            m14454w(parcel, v);
        } else if (z) {
            m14455x(parcel, i, 0);
        }
    }

    /* renamed from: s */
    public static void m14450s(Parcel parcel, int i, List<String> list, boolean z) {
        if (list != null) {
            int v = m14453v(parcel, i);
            parcel.writeStringList(list);
            m14454w(parcel, v);
        } else if (z) {
            m14455x(parcel, i, 0);
        }
    }

    /* renamed from: t */
    public static <T extends Parcelable> void m14451t(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr != null) {
            int v = m14453v(parcel, i);
            parcel.writeInt(r7);
            for (T t : tArr) {
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    m14456y(parcel, t, i2);
                }
            }
            m14454w(parcel, v);
        } else if (z) {
            m14455x(parcel, i, 0);
        }
    }

    /* renamed from: u */
    public static <T extends Parcelable> void m14452u(Parcel parcel, int i, List<T> list, boolean z) {
        if (list != null) {
            int v = m14453v(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    m14456y(parcel, parcelable, 0);
                }
            }
            m14454w(parcel, v);
        } else if (z) {
            m14455x(parcel, i, 0);
        }
    }

    /* renamed from: v */
    private static int m14453v(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: w */
    private static void m14454w(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: x */
    private static void m14455x(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    /* renamed from: y */
    private static <T extends Parcelable> void m14456y(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
