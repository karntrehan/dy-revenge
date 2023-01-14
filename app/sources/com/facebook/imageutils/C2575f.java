package com.facebook.imageutils;

import android.util.Pair;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.imageutils.f */
public class C2575f {
    /* renamed from: a */
    private static boolean m10719a(byte[] bArr, String str) {
        if (bArr.length != str.length()) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (str.charAt(i) != bArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static int m10720b(InputStream inputStream) {
        return ((((byte) inputStream.read()) << 8) & 65280) | (((byte) inputStream.read()) & 255);
    }

    /* renamed from: c */
    private static byte m10721c(InputStream inputStream) {
        return (byte) (inputStream.read() & 255);
    }

    /* renamed from: d */
    private static String m10722d(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append((char) b);
        }
        return sb.toString();
    }

    /* renamed from: e */
    private static int m10723e(InputStream inputStream) {
        return ((((byte) inputStream.read()) << 24) & -16777216) | ((((byte) inputStream.read()) << 16) & 16711680) | ((((byte) inputStream.read()) << 8) & 65280) | (((byte) inputStream.read()) & 255);
    }

    /* renamed from: f */
    private static short m10724f(InputStream inputStream) {
        return (short) (inputStream.read() & 255);
    }

    /* renamed from: g */
    public static Pair<Integer, Integer> m10725g(InputStream inputStream) {
        byte[] bArr = new byte[4];
        try {
            inputStream.read(bArr);
            if (!m10719a(bArr, "RIFF")) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return null;
            }
            m10723e(inputStream);
            inputStream.read(bArr);
            if (!m10719a(bArr, "WEBP")) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                return null;
            }
            inputStream.read(bArr);
            String d = m10722d(bArr);
            if ("VP8 ".equals(d)) {
                Pair<Integer, Integer> h = m10726h(inputStream);
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
                return h;
            } else if ("VP8L".equals(d)) {
                Pair<Integer, Integer> i = m10727i(inputStream);
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                return i;
            } else if ("VP8X".equals(d)) {
                Pair<Integer, Integer> j = m10728j(inputStream);
                try {
                    inputStream.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
                return j;
            } else {
                try {
                    inputStream.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
                return null;
            }
        } catch (IOException e7) {
            e7.printStackTrace();
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
            }
            throw th;
        }
    }

    /* renamed from: h */
    private static Pair<Integer, Integer> m10726h(InputStream inputStream) {
        inputStream.skip(7);
        short f = m10724f(inputStream);
        short f2 = m10724f(inputStream);
        short f3 = m10724f(inputStream);
        if (f == 157 && f2 == 1 && f3 == 42) {
            return new Pair<>(Integer.valueOf(m10720b(inputStream)), Integer.valueOf(m10720b(inputStream)));
        }
        return null;
    }

    /* renamed from: i */
    private static Pair<Integer, Integer> m10727i(InputStream inputStream) {
        m10723e(inputStream);
        if (m10721c(inputStream) != 47) {
            return null;
        }
        byte read = ((byte) inputStream.read()) & 255;
        return new Pair<>(Integer.valueOf(((((byte) inputStream.read()) & 255) | ((read & 63) << 8)) + 1), Integer.valueOf(((((((byte) inputStream.read()) & 255) & 15) << 10) | ((((byte) inputStream.read()) & 255) << 2) | ((read & 192) >> 6)) + 1));
    }

    /* renamed from: j */
    private static Pair<Integer, Integer> m10728j(InputStream inputStream) {
        inputStream.skip(8);
        return new Pair<>(Integer.valueOf(m10729k(inputStream) + 1), Integer.valueOf(m10729k(inputStream) + 1));
    }

    /* renamed from: k */
    private static int m10729k(InputStream inputStream) {
        byte c = m10721c(inputStream);
        return ((m10721c(inputStream) << 16) & 16711680) | ((m10721c(inputStream) << 8) & 65280) | (c & 255);
    }
}
