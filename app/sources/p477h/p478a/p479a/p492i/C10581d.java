package p477h.p478a.p479a.p492i;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFilePermission;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import okhttp3.HttpUrl;
import p477h.p478a.p479a.p483c.C10497a;
import p477h.p478a.p479a.p488f.C10541h;
import p477h.p478a.p479a.p488f.C10550q;
import p477h.p478a.p479a.p490g.C10558a;

/* renamed from: h.a.a.i.d */
public class C10581d {

    /* renamed from: a */
    public static final byte[] f28018a = {0, 0, Byte.MIN_VALUE, -127};

    /* renamed from: b */
    public static final byte[] f28019b = {0, 0, Byte.MIN_VALUE, 65};

    /* renamed from: B */
    public static String m35881B(File file) {
        try {
            return Files.readSymbolicLink(file.toPath()).toString();
        } catch (Error | Exception unused) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    /* renamed from: C */
    private static byte m35882C(boolean z, byte b, int i) {
        return z ? C10579b.m35877b(b, i) : b;
    }

    /* renamed from: D */
    public static void m35883D(Path path, byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            if (m35910y()) {
                m35888c(path, bArr);
            } else if (m35906u() || m35909x()) {
                m35887b(path, bArr);
            }
        }
    }

    /* renamed from: E */
    public static void m35884E(Path path, long j) {
        if (j > 0 && Files.exists(path, new LinkOption[0])) {
            try {
                Files.setLastModifiedTime(path, FileTime.fromMillis(C10585h.m35936c(j)));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: F */
    public static void m35885F(File file, long j) {
        file.setLastModified(C10585h.m35936c(j));
    }

    /* renamed from: a */
    private static void m35886a(byte b, int i, Set<PosixFilePermission> set, PosixFilePermission posixFilePermission) {
        if (C10579b.m35876a(b, i)) {
            set.add(posixFilePermission);
        }
    }

    /* renamed from: b */
    private static void m35887b(Path path, byte[] bArr) {
        if (bArr[2] != 0 || bArr[3] != 0) {
            try {
                HashSet hashSet = new HashSet();
                m35886a(bArr[3], 0, hashSet, PosixFilePermission.OWNER_READ);
                m35886a(bArr[2], 7, hashSet, PosixFilePermission.OWNER_WRITE);
                m35886a(bArr[2], 6, hashSet, PosixFilePermission.OWNER_EXECUTE);
                m35886a(bArr[2], 5, hashSet, PosixFilePermission.GROUP_READ);
                m35886a(bArr[2], 4, hashSet, PosixFilePermission.GROUP_WRITE);
                m35886a(bArr[2], 3, hashSet, PosixFilePermission.GROUP_EXECUTE);
                m35886a(bArr[2], 2, hashSet, PosixFilePermission.OTHERS_READ);
                m35886a(bArr[2], 1, hashSet, PosixFilePermission.OTHERS_WRITE);
                m35886a(bArr[2], 0, hashSet, PosixFilePermission.OTHERS_EXECUTE);
                Files.setPosixFilePermissions(path, hashSet);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    private static void m35888c(Path path, byte[] bArr) {
        if (bArr[0] != 0) {
            DosFileAttributeView dosFileAttributeView = (DosFileAttributeView) Files.getFileAttributeView(path, DosFileAttributeView.class, new LinkOption[]{LinkOption.NOFOLLOW_LINKS});
            try {
                dosFileAttributeView.setReadOnly(C10579b.m35876a(bArr[0], 0));
                dosFileAttributeView.setHidden(C10579b.m35876a(bArr[0], 1));
                dosFileAttributeView.setSystem(C10579b.m35876a(bArr[0], 2));
                dosFileAttributeView.setArchive(C10579b.m35876a(bArr[0], 5));
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: d */
    private static void m35889d(File file) {
        if (!file.exists()) {
            throw new C10497a("File does not exist: " + file);
        }
    }

    /* renamed from: e */
    public static void m35890e(List<File> list, C10550q.C10551a aVar) {
        for (File next : list) {
            if (!m35908w(next)) {
                m35889d(next);
            } else if (aVar.equals(C10550q.C10551a.INCLUDE_LINK_AND_LINKED_FILE) || aVar.equals(C10550q.C10551a.INCLUDE_LINKED_FILE_ONLY)) {
                m35891f(next);
            }
        }
    }

    /* renamed from: f */
    private static void m35891f(File file) {
        if (!file.exists()) {
            throw new C10497a("Symlink target '" + m35881B(file) + "' does not exist for link '" + file + "'");
        }
    }

    /* renamed from: g */
    public static void m35892g(RandomAccessFile randomAccessFile, OutputStream outputStream, long j, long j2, C10558a aVar) {
        int i;
        long j3 = 0;
        if (j < 0 || j2 < 0 || j > j2) {
            throw new C10497a("invalid offsets");
        } else if (i != 0) {
            try {
                randomAccessFile.seek(j);
                long j4 = j2 - j;
                byte[] bArr = j4 < 4096 ? new byte[((int) j4)] : new byte[4096];
                while (true) {
                    int read = randomAccessFile.read(bArr);
                    if (read != -1) {
                        outputStream.write(bArr, 0, read);
                        long j5 = (long) read;
                        aVar.mo26210l(j5);
                        if (aVar.mo26204e()) {
                            aVar.mo26207i(C10558a.C10559a.CANCELLED);
                            return;
                        }
                        j3 += j5;
                        if (j3 != j4) {
                            if (((long) bArr.length) + j3 > j4) {
                                bArr = new byte[((int) (j4 - j3))];
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } catch (IOException e) {
                throw new C10497a((Exception) e);
            }
        }
    }

    /* renamed from: h */
    public static File[] m35893h(File file) {
        File[] listFiles = file.getParentFile().listFiles(new C10578a(m35898m(file.getName())));
        if (listFiles == null) {
            return new File[0];
        }
        Arrays.sort(listFiles);
        return listFiles;
    }

    /* renamed from: i */
    public static byte[] m35894i(boolean z) {
        byte[] bArr = new byte[4];
        if (m35909x() || m35906u()) {
            if (z) {
                System.arraycopy(f28019b, 0, bArr, 0, 4);
            } else {
                System.arraycopy(f28018a, 0, bArr, 0, 4);
            }
        }
        return bArr;
    }

    /* renamed from: j */
    private static String m35895j(int i) {
        return i < 9 ? "00" : i < 99 ? "0" : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* renamed from: k */
    public static byte[] m35896k(File file) {
        if (file != null) {
            try {
                if (Files.isSymbolicLink(file.toPath()) || file.exists()) {
                    Path path = file.toPath();
                    if (m35910y()) {
                        return m35904s(path);
                    }
                    if (!m35906u()) {
                        if (!m35909x()) {
                            return new byte[4];
                        }
                    }
                    return m35902q(path);
                }
            } catch (NoSuchMethodError unused) {
                return new byte[4];
            }
        }
        return new byte[4];
    }

    /* renamed from: l */
    public static String m35897l(File file) {
        String name = file.getName();
        return !name.contains(".") ? HttpUrl.FRAGMENT_ENCODE_SET : name.substring(name.lastIndexOf(".") + 1);
    }

    /* renamed from: m */
    public static String m35898m(String str) {
        int lastIndexOf = str.lastIndexOf(".");
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    /* renamed from: n */
    public static List<File> m35899n(File file, boolean z, boolean z2, C10541h hVar) {
        if (file != null) {
            ArrayList arrayList = new ArrayList();
            File[] listFiles = file.listFiles();
            if (file.isDirectory() && file.canRead() && listFiles != null) {
                for (File file2 : listFiles) {
                    if (hVar == null || !hVar.mo26084a(file2)) {
                        if (file2.isHidden()) {
                            if (file2.isDirectory()) {
                                if (!z2) {
                                }
                            } else if (!z) {
                            }
                        }
                        arrayList.add(file2);
                        if (file2.isDirectory()) {
                            arrayList.addAll(m35899n(file2, z, z2, hVar));
                        }
                    }
                }
            }
            return arrayList;
        }
        throw new C10497a("input path is null, cannot read files in the directory");
    }

    /* renamed from: o */
    private static String m35900o(File file, String str) {
        if (C10585h.m35940g(str)) {
            return str;
        }
        if (!m35908w(file)) {
            return file.getName();
        }
        return file.toPath().toRealPath(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}).getFileName().toString();
    }

    /* renamed from: p */
    public static String m35901p(int i) {
        return "." + m35895j(i) + (i + 1);
    }

    /* renamed from: q */
    private static byte[] m35902q(Path path) {
        byte[] bArr = new byte[4];
        Class<PosixFileAttributeView> cls = PosixFileAttributeView.class;
        try {
            Set<PosixFilePermission> permissions = ((PosixFileAttributeView) Files.getFileAttributeView(path, cls, new LinkOption[]{LinkOption.NOFOLLOW_LINKS})).readAttributes().permissions();
            bArr[3] = m35882C(Files.isRegularFile(path, new LinkOption[0]), bArr[3], 7);
            bArr[3] = m35882C(Files.isDirectory(path, new LinkOption[0]), bArr[3], 6);
            bArr[3] = m35882C(Files.isSymbolicLink(path), bArr[3], 5);
            bArr[3] = m35882C(permissions.contains(PosixFilePermission.OWNER_READ), bArr[3], 0);
            bArr[2] = m35882C(permissions.contains(PosixFilePermission.OWNER_WRITE), bArr[2], 7);
            bArr[2] = m35882C(permissions.contains(PosixFilePermission.OWNER_EXECUTE), bArr[2], 6);
            bArr[2] = m35882C(permissions.contains(PosixFilePermission.GROUP_READ), bArr[2], 5);
            bArr[2] = m35882C(permissions.contains(PosixFilePermission.GROUP_WRITE), bArr[2], 4);
            bArr[2] = m35882C(permissions.contains(PosixFilePermission.GROUP_EXECUTE), bArr[2], 3);
            bArr[2] = m35882C(permissions.contains(PosixFilePermission.OTHERS_READ), bArr[2], 2);
            bArr[2] = m35882C(permissions.contains(PosixFilePermission.OTHERS_WRITE), bArr[2], 1);
            bArr[2] = m35882C(permissions.contains(PosixFilePermission.OTHERS_EXECUTE), bArr[2], 0);
        } catch (IOException unused) {
        }
        return bArr;
    }

    /* renamed from: r */
    public static String m35903r(File file, C10550q qVar) {
        String str;
        String str2;
        StringBuilder sb;
        try {
            String canonicalPath = file.getCanonicalPath();
            if (C10585h.m35940g(qVar.mo26170e())) {
                String canonicalPath2 = new File(qVar.mo26170e()).getCanonicalPath();
                String str3 = C10582e.f28020a;
                if (!canonicalPath2.endsWith(str3)) {
                    canonicalPath2 = canonicalPath2 + str3;
                }
                if (m35908w(file)) {
                    str2 = new File(file.getParentFile().getCanonicalFile().getPath() + File.separator + file.getCanonicalFile().getName()).getPath().substring(canonicalPath2.length());
                } else {
                    str2 = canonicalPath.substring(canonicalPath2.length());
                }
                if (str2.startsWith(System.getProperty("file.separator"))) {
                    str2 = str2.substring(1);
                }
                File file2 = new File(canonicalPath);
                if (file2.isDirectory()) {
                    String replaceAll = str2.replaceAll("\\\\", "/");
                    sb = new StringBuilder();
                    sb.append(replaceAll);
                    sb.append("/");
                } else {
                    String replaceAll2 = str2.substring(0, str2.lastIndexOf(file2.getName())).replaceAll("\\\\", "/");
                    sb = new StringBuilder();
                    sb.append(replaceAll2);
                    sb.append(m35900o(file2, qVar.mo26176k()));
                }
                str = sb.toString();
            } else {
                File file3 = new File(canonicalPath);
                String o = m35900o(file3, qVar.mo26176k());
                if (file3.isDirectory()) {
                    str = o + "/";
                } else {
                    str = o;
                }
            }
            String m = qVar.mo26178m();
            if (!C10585h.m35940g(m)) {
                return str;
            }
            if (!m.endsWith("\\") && !m.endsWith("/")) {
                m = m + C10582e.f28020a;
            }
            return m.replaceAll("\\\\", "/") + str;
        } catch (IOException e) {
            throw new C10497a((Exception) e);
        }
    }

    /* renamed from: s */
    private static byte[] m35904s(Path path) {
        byte[] bArr = new byte[4];
        Class<DosFileAttributeView> cls = DosFileAttributeView.class;
        try {
            DosFileAttributes readAttributes = ((DosFileAttributeView) Files.getFileAttributeView(path, cls, new LinkOption[]{LinkOption.NOFOLLOW_LINKS})).readAttributes();
            bArr[0] = m35882C(readAttributes.isArchive(), m35882C(readAttributes.isSystem(), m35882C(readAttributes.isHidden(), m35882C(readAttributes.isReadOnly(), (byte) 0, 0), 1), 2), 5);
        } catch (IOException unused) {
        }
        return bArr;
    }

    /* renamed from: t */
    public static String m35905t(String str) {
        if (C10585h.m35940g(str)) {
            if (str.contains(System.getProperty("file.separator"))) {
                str = str.substring(str.lastIndexOf(System.getProperty("file.separator")) + 1);
            }
            return str.endsWith(".zip") ? str.substring(0, str.lastIndexOf(".")) : str;
        }
        throw new C10497a("zip file name is empty or null, cannot determine zip file name");
    }

    /* renamed from: u */
    public static boolean m35906u() {
        return System.getProperty("os.name").toLowerCase().contains("mac");
    }

    /* renamed from: v */
    public static boolean m35907v(File file) {
        return file.getName().endsWith(".zip.001");
    }

    /* renamed from: w */
    public static boolean m35908w(File file) {
        try {
            return Files.isSymbolicLink(file.toPath());
        } catch (Error | Exception unused) {
            return false;
        }
    }

    /* renamed from: x */
    public static boolean m35909x() {
        return System.getProperty("os.name").toLowerCase().contains("nux");
    }

    /* renamed from: y */
    public static boolean m35910y() {
        return System.getProperty("os.name").toLowerCase().contains("win");
    }

    /* renamed from: z */
    public static boolean m35911z(String str) {
        return str.endsWith("/") || str.endsWith("\\");
    }
}
