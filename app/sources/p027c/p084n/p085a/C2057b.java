package p027c.p084n.p085a;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.util.Log;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: c.n.a.b */
class C2057b {

    /* renamed from: c.n.a.b$a */
    static class C2058a {
        /* renamed from: a */
        static void m8872a(FileDescriptor fileDescriptor) {
            Os.close(fileDescriptor);
        }

        /* renamed from: b */
        static FileDescriptor m8873b(FileDescriptor fileDescriptor) {
            return Os.dup(fileDescriptor);
        }

        /* renamed from: c */
        static long m8874c(FileDescriptor fileDescriptor, long j, int i) {
            return Os.lseek(fileDescriptor, j, i);
        }
    }

    /* renamed from: c.n.a.b$b */
    static class C2059b {
        /* renamed from: a */
        static void m8875a(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) {
            mediaMetadataRetriever.setDataSource(mediaDataSource);
        }
    }

    /* renamed from: a */
    static String m8865a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i])}));
        }
        return sb.toString();
    }

    /* renamed from: b */
    static void m8866b(FileDescriptor fileDescriptor) {
        String str;
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                C2058a.m8872a(fileDescriptor);
            } catch (Exception unused) {
                str = "Error closing fd.";
            }
        } else {
            str = "closeFileDescriptor is called in API < 21, which must be wrong.";
            Log.e("ExifInterfaceUtils", str);
        }
    }

    /* renamed from: c */
    static void m8867c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    static long[] m8868d(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = (long) iArr[i];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    /* renamed from: e */
    static int m8869e(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        int i = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return i;
            }
            i += read;
            outputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: f */
    static void m8870f(InputStream inputStream, OutputStream outputStream, int i) {
        byte[] bArr = new byte[8192];
        while (i > 0) {
            int min = Math.min(i, 8192);
            int read = inputStream.read(bArr, 0, min);
            if (read == min) {
                i -= read;
                outputStream.write(bArr, 0, read);
            } else {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
        }
    }

    /* renamed from: g */
    static boolean m8871g(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
