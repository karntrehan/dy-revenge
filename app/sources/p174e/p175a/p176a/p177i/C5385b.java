package p174e.p175a.p176a.p177i;

import java.io.PushbackReader;
import java.io.Reader;

/* renamed from: e.a.a.i.b */
public class C5385b extends PushbackReader {

    /* renamed from: f */
    private int f15035f = 0;

    /* renamed from: o */
    private int f15036o = 0;

    /* renamed from: p */
    private int f15037p = 0;

    public C5385b(Reader reader) {
        super(reader, 8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        if (p174e.p175a.p176a.p177i.C5391h.m19954c((char) r10.f15036o) != false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0084, code lost:
        if (p174e.p175a.p176a.p177i.C5391h.m19954c((char) r10.f15036o) != false) goto L_0x0044;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private char m19912a(char r11) {
        /*
            r10 = this;
            int r0 = r10.f15035f
            r1 = 1
            if (r0 == 0) goto L_0x00af
            r2 = 2
            r3 = 5
            if (r0 == r1) goto L_0x00a5
            r4 = 10
            r5 = 57
            r6 = 48
            r7 = 3
            r8 = 4
            r9 = 0
            if (r0 == r2) goto L_0x0088
            r2 = 59
            if (r0 == r7) goto L_0x004d
            if (r0 == r8) goto L_0x0020
            if (r0 == r3) goto L_0x001d
            return r11
        L_0x001d:
            r10.f15035f = r9
            return r11
        L_0x0020:
            if (r6 > r11) goto L_0x0039
            if (r11 > r5) goto L_0x0039
            int r0 = r10.f15036o
            int r0 = r0 * 10
            int r2 = java.lang.Character.digit(r11, r4)
            int r0 = r0 + r2
            r10.f15036o = r0
            int r0 = r10.f15037p
            int r0 = r0 + r1
            r10.f15037p = r0
            if (r0 > r3) goto L_0x004a
            r10.f15035f = r8
            goto L_0x004c
        L_0x0039:
            if (r11 != r2) goto L_0x004a
            int r0 = r10.f15036o
            char r0 = (char) r0
            boolean r0 = p174e.p175a.p176a.p177i.C5391h.m19954c(r0)
            if (r0 == 0) goto L_0x004a
        L_0x0044:
            r10.f15035f = r9
            int r11 = r10.f15036o
            char r11 = (char) r11
            return r11
        L_0x004a:
            r10.f15035f = r3
        L_0x004c:
            return r11
        L_0x004d:
            if (r6 > r11) goto L_0x0051
            if (r11 <= r5) goto L_0x0061
        L_0x0051:
            r0 = 97
            if (r0 > r11) goto L_0x0059
            r0 = 102(0x66, float:1.43E-43)
            if (r11 <= r0) goto L_0x0061
        L_0x0059:
            r0 = 65
            if (r0 > r11) goto L_0x007b
            r0 = 70
            if (r11 > r0) goto L_0x007b
        L_0x0061:
            int r0 = r10.f15036o
            r2 = 16
            int r0 = r0 * 16
            int r2 = java.lang.Character.digit(r11, r2)
            int r0 = r0 + r2
            r10.f15036o = r0
            int r0 = r10.f15037p
            int r0 = r0 + r1
            r10.f15037p = r0
            if (r0 > r8) goto L_0x0078
            r10.f15035f = r7
            goto L_0x0087
        L_0x0078:
            r10.f15035f = r3
            goto L_0x0087
        L_0x007b:
            if (r11 != r2) goto L_0x0078
            int r0 = r10.f15036o
            char r0 = (char) r0
            boolean r0 = p174e.p175a.p176a.p177i.C5391h.m19954c(r0)
            if (r0 == 0) goto L_0x0078
            goto L_0x0044
        L_0x0087:
            return r11
        L_0x0088:
            r0 = 120(0x78, float:1.68E-43)
            if (r11 != r0) goto L_0x0093
            r10.f15036o = r9
            r10.f15037p = r9
            r10.f15035f = r7
            goto L_0x00a4
        L_0x0093:
            if (r6 > r11) goto L_0x00a2
            if (r11 > r5) goto L_0x00a2
            int r0 = java.lang.Character.digit(r11, r4)
            r10.f15036o = r0
            r10.f15037p = r1
            r10.f15035f = r8
            goto L_0x00a4
        L_0x00a2:
            r10.f15035f = r3
        L_0x00a4:
            return r11
        L_0x00a5:
            r0 = 35
            if (r11 != r0) goto L_0x00ac
            r10.f15035f = r2
            goto L_0x00ae
        L_0x00ac:
            r10.f15035f = r3
        L_0x00ae:
            return r11
        L_0x00af:
            r0 = 38
            if (r11 != r0) goto L_0x00b5
            r10.f15035f = r1
        L_0x00b5:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p175a.p176a.p177i.C5385b.m19912a(char):char");
    }

    public int read(char[] cArr, int i, int i2) {
        char[] cArr2 = new char[8];
        boolean z = true;
        int i3 = 0;
        loop0:
        while (true) {
            int i4 = 0;
            while (z && i3 < i2) {
                z = super.read(cArr2, i4, 1) == 1;
                if (z) {
                    char a = m19912a(cArr2[i4]);
                    int i5 = this.f15035f;
                    if (i5 == 0) {
                        if (C5391h.m19954c(a)) {
                            a = ' ';
                        }
                        cArr[i] = a;
                        i3++;
                        i++;
                    } else {
                        i4++;
                        if (i5 == 5) {
                            unread(cArr2, 0, i4);
                        }
                    }
                } else if (i4 > 0) {
                    unread(cArr2, 0, i4);
                    this.f15035f = 5;
                    z = true;
                }
            }
        }
        if (i3 > 0 || z) {
            return i3;
        }
        return -1;
    }
}
