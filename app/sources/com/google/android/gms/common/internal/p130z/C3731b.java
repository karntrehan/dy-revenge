package com.google.android.gms.common.internal.p130z;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.internal.z.b */
public class C3731b {

    /* renamed from: com.google.android.gms.common.internal.z.b$a */
    public static class C3732a extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C3732a(java.lang.String r4, android.os.Parcel r5) {
            /*
                r3 = this;
                int r0 = r5.dataPosition()
                int r5 = r5.dataSize()
                java.lang.String r1 = java.lang.String.valueOf(r4)
                int r1 = r1.length()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                int r1 = r1 + 41
                r2.<init>(r1)
                r2.append(r4)
                java.lang.String r4 = " Parcel: pos="
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = " size="
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.p130z.C3731b.C3732a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    /* renamed from: A */
    private static void m14405A(Parcel parcel, int i, int i2) {
        int w = m14428w(parcel, i);
        if (w != i2) {
            String hexString = Integer.toHexString(w);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(w);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new C3732a(sb.toString(), parcel);
        }
    }

    /* renamed from: a */
    public static Bundle m14406a(Parcel parcel, int i) {
        int w = m14428w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + w);
        return readBundle;
    }

    /* renamed from: b */
    public static byte[] m14407b(Parcel parcel, int i) {
        int w = m14428w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + w);
        return createByteArray;
    }

    /* renamed from: c */
    public static int[] m14408c(Parcel parcel, int i) {
        int w = m14428w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + w);
        return createIntArray;
    }

    /* renamed from: d */
    public static <T extends Parcelable> T m14409d(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int w = m14428w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w == 0) {
            return null;
        }
        T t = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + w);
        return t;
    }

    /* renamed from: e */
    public static String m14410e(Parcel parcel, int i) {
        int w = m14428w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + w);
        return readString;
    }

    /* renamed from: f */
    public static String[] m14411f(Parcel parcel, int i) {
        int w = m14428w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + w);
        return createStringArray;
    }

    /* renamed from: g */
    public static ArrayList<String> m14412g(Parcel parcel, int i) {
        int w = m14428w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + w);
        return createStringArrayList;
    }

    /* renamed from: h */
    public static <T> T[] m14413h(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int w = m14428w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + w);
        return createTypedArray;
    }

    /* renamed from: i */
    public static <T> ArrayList<T> m14414i(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int w = m14428w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + w);
        return createTypedArrayList;
    }

    /* renamed from: j */
    public static void m14415j(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Overread allowed size end=");
            sb.append(i);
            throw new C3732a(sb.toString(), parcel);
        }
    }

    /* renamed from: k */
    public static int m14416k(int i) {
        return (char) i;
    }

    /* renamed from: l */
    public static boolean m14417l(Parcel parcel, int i) {
        m14405A(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: m */
    public static Boolean m14418m(Parcel parcel, int i) {
        int w = m14428w(parcel, i);
        if (w == 0) {
            return null;
        }
        m14431z(parcel, i, w, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    /* renamed from: n */
    public static double m14419n(Parcel parcel, int i) {
        m14405A(parcel, i, 8);
        return parcel.readDouble();
    }

    /* renamed from: o */
    public static Double m14420o(Parcel parcel, int i) {
        int w = m14428w(parcel, i);
        if (w == 0) {
            return null;
        }
        m14431z(parcel, i, w, 8);
        return Double.valueOf(parcel.readDouble());
    }

    /* renamed from: p */
    public static float m14421p(Parcel parcel, int i) {
        m14405A(parcel, i, 4);
        return parcel.readFloat();
    }

    /* renamed from: q */
    public static Float m14422q(Parcel parcel, int i) {
        int w = m14428w(parcel, i);
        if (w == 0) {
            return null;
        }
        m14431z(parcel, i, w, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* renamed from: r */
    public static int m14423r(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: s */
    public static IBinder m14424s(Parcel parcel, int i) {
        int w = m14428w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + w);
        return readStrongBinder;
    }

    /* renamed from: t */
    public static int m14425t(Parcel parcel, int i) {
        m14405A(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: u */
    public static long m14426u(Parcel parcel, int i) {
        m14405A(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: v */
    public static Long m14427v(Parcel parcel, int i) {
        int w = m14428w(parcel, i);
        if (w == 0) {
            return null;
        }
        m14431z(parcel, i, w, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: w */
    public static int m14428w(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    /* renamed from: x */
    public static void m14429x(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m14428w(parcel, i));
    }

    /* renamed from: y */
    public static int m14430y(Parcel parcel) {
        int r = m14423r(parcel);
        int w = m14428w(parcel, r);
        int dataPosition = parcel.dataPosition();
        if (m14416k(r) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(r));
            throw new C3732a(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i = w + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new C3732a(sb.toString(), parcel);
    }

    /* renamed from: z */
    private static void m14431z(Parcel parcel, int i, int i2, int i3) {
        if (i2 != i3) {
            String hexString = Integer.toHexString(i2);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i3);
            sb.append(" got ");
            sb.append(i2);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new C3732a(sb.toString(), parcel);
        }
    }
}
