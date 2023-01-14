package com.facebook.soloader;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedByInterruptException;
import java.nio.channels.FileChannel;
import okhttp3.internal.p510ws.WebSocketProtocol;

/* renamed from: com.facebook.soloader.i */
public final class C3277i {

    /* renamed from: com.facebook.soloader.i$a */
    private static class C3278a extends RuntimeException {
        C3278a(String str) {
            super(str);
        }
    }

    /* renamed from: com.facebook.soloader.i$b */
    public enum C3279b {
        NOT_SO("not_so"),
        X86("x86"),
        ARM("armeabi-v7a"),
        X86_64("x86_64"),
        AARCH64("arm64-v8a"),
        OTHERS("others");
        

        /* renamed from: u */
        private final String f9285u;

        private C3279b(String str) {
            this.f9285u = str;
        }

        public String toString() {
            return this.f9285u;
        }
    }

    /* renamed from: a */
    public static String[] m12837a(File file) {
        int i = 0;
        while (true) {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                return m12838b(fileInputStream.getChannel());
            } catch (ClosedByInterruptException e) {
                i++;
                if (i <= 3) {
                    Thread.interrupted();
                    Log.e("MinElf", "retrying extract_DT_NEEDED due to ClosedByInterruptException", e);
                } else {
                    throw e;
                }
            } finally {
                fileInputStream.close();
            }
        }
    }

    /* renamed from: b */
    public static String[] m12838b(FileChannel fileChannel) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        FileChannel fileChannel2 = fileChannel;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long f = m12842f(fileChannel2, allocate, 0);
        if (f == 1179403647) {
            boolean z = true;
            if (m12843g(fileChannel2, allocate, 4) != 1) {
                z = false;
            }
            if (m12843g(fileChannel2, allocate, 5) == 2) {
                allocate.order(ByteOrder.BIG_ENDIAN);
            }
            long f2 = z ? m12842f(fileChannel2, allocate, 28) : m12839c(fileChannel2, allocate, 32);
            long e = z ? (long) m12841e(fileChannel2, allocate, 44) : (long) m12841e(fileChannel2, allocate, 56);
            int e2 = m12841e(fileChannel2, allocate, z ? 42 : 54);
            if (e == WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                long f3 = z ? m12842f(fileChannel2, allocate, 32) : m12839c(fileChannel2, allocate, 40);
                e = m12842f(fileChannel2, allocate, z ? f3 + 28 : f3 + 44);
            }
            long j6 = f2;
            long j7 = 0;
            while (true) {
                if (j7 >= e) {
                    j = 0;
                    break;
                } else if (m12842f(fileChannel2, allocate, j6 + 0) == 2) {
                    j = z ? m12842f(fileChannel2, allocate, j6 + 4) : m12839c(fileChannel2, allocate, j6 + 8);
                } else {
                    j6 += (long) e2;
                    j7++;
                }
            }
            long j8 = 0;
            if (j != 0) {
                long j9 = j;
                long j10 = 0;
                int i = 0;
                while (true) {
                    boolean z2 = z;
                    long f4 = z ? m12842f(fileChannel2, allocate, j9 + j8) : m12839c(fileChannel2, allocate, j9 + j8);
                    if (f4 == 1) {
                        j2 = j;
                        if (i != Integer.MAX_VALUE) {
                            i++;
                        } else {
                            throw new C3278a("malformed DT_NEEDED section");
                        }
                    } else {
                        j2 = j;
                        if (f4 == 5) {
                            j10 = z2 ? m12842f(fileChannel2, allocate, j9 + 4) : m12839c(fileChannel2, allocate, j9 + 8);
                        }
                    }
                    long j11 = 16;
                    j9 += z2 ? 8 : 16;
                    j8 = 0;
                    if (f4 != 0) {
                        z = z2;
                        j = j2;
                    } else if (j10 != 0) {
                        int i2 = 0;
                        while (true) {
                            if (((long) i2) >= e) {
                                j3 = 0;
                                break;
                            }
                            if (m12842f(fileChannel2, allocate, f2 + j8) == 1) {
                                long f5 = z2 ? m12842f(fileChannel2, allocate, f2 + 8) : m12839c(fileChannel2, allocate, f2 + j11);
                                if (z2) {
                                    j4 = e;
                                    j5 = m12842f(fileChannel2, allocate, f2 + 20);
                                } else {
                                    j4 = e;
                                    j5 = m12839c(fileChannel2, allocate, f2 + 40);
                                }
                                if (f5 <= j10 && j10 < j5 + f5) {
                                    j3 = (z2 ? m12842f(fileChannel2, allocate, f2 + 4) : m12839c(fileChannel2, allocate, f2 + 8)) + (j10 - f5);
                                }
                            } else {
                                j4 = e;
                            }
                            f2 += (long) e2;
                            i2++;
                            e = j4;
                            j11 = 16;
                            j8 = 0;
                        }
                        long j12 = 0;
                        if (j3 != 0) {
                            String[] strArr = new String[i];
                            int i3 = 0;
                            while (true) {
                                long j13 = j2 + j12;
                                long f6 = z2 ? m12842f(fileChannel2, allocate, j13) : m12839c(fileChannel2, allocate, j13);
                                if (f6 == 1) {
                                    strArr[i3] = m12840d(fileChannel2, allocate, (z2 ? m12842f(fileChannel2, allocate, j2 + 4) : m12839c(fileChannel2, allocate, j2 + 8)) + j3);
                                    if (i3 != Integer.MAX_VALUE) {
                                        i3++;
                                    } else {
                                        throw new C3278a("malformed DT_NEEDED section");
                                    }
                                }
                                j2 += z2 ? 8 : 16;
                                if (f6 != 0) {
                                    j12 = 0;
                                } else if (i3 == i) {
                                    return strArr;
                                } else {
                                    throw new C3278a("malformed DT_NEEDED section");
                                }
                            }
                        } else {
                            throw new C3278a("did not find file offset of DT_STRTAB table");
                        }
                    } else {
                        throw new C3278a("Dynamic section string-table not found");
                    }
                }
            } else {
                throw new C3278a("ELF file does not contain dynamic linking information");
            }
        } else {
            throw new C3278a("file is not ELF: 0x" + Long.toHexString(f));
        }
    }

    /* renamed from: c */
    private static long m12839c(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        m12844h(fileChannel, byteBuffer, 8, j);
        return byteBuffer.getLong();
    }

    /* renamed from: d */
    private static String m12840d(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j2 = 1 + j;
            short g = m12843g(fileChannel, byteBuffer, j);
            if (g == 0) {
                return sb.toString();
            }
            sb.append((char) g);
            j = j2;
        }
    }

    /* renamed from: e */
    private static int m12841e(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        m12844h(fileChannel, byteBuffer, 2, j);
        return byteBuffer.getShort() & 65535;
    }

    /* renamed from: f */
    private static long m12842f(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        m12844h(fileChannel, byteBuffer, 4, j);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    /* renamed from: g */
    private static short m12843g(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        m12844h(fileChannel, byteBuffer, 1, j);
        return (short) (byteBuffer.get() & 255);
    }

    /* renamed from: h */
    private static void m12844h(FileChannel fileChannel, ByteBuffer byteBuffer, int i, long j) {
        int read;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (read = fileChannel.read(byteBuffer, j)) != -1) {
            j += (long) read;
        }
        if (byteBuffer.remaining() <= 0) {
            byteBuffer.position(0);
            return;
        }
        throw new C3278a("ELF file truncated");
    }
}
