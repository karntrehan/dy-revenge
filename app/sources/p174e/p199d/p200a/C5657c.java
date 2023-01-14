package p174e.p199d.p200a;

import java.io.BufferedInputStream;
import java.io.InputStream;
import p174e.p199d.p200a.p201f.C5661a;
import p174e.p199d.p200a.p202g.C5662a;
import p174e.p199d.p200a.p203h.C5663a;
import p174e.p199d.p200a.p204i.C5664a;
import p174e.p199d.p200a.p205j.C5665a;
import p174e.p199d.p200a.p206k.C5666a;
import p174e.p199d.p200a.p207l.C5673b;
import p174e.p199d.p200a.p208m.C5675a;
import p174e.p199d.p200a.p209n.C5682g;
import p174e.p199d.p200a.p210o.C5684a;
import p174e.p199d.p200a.p211p.C5686b;
import p174e.p199d.p200a.p212q.C5688a;
import p174e.p199d.p200a.p214s.C5694c;
import p174e.p199d.p200a.p215t.C5697a;
import p174e.p199d.p200a.p216u.C5698a;
import p174e.p199d.p217b.C5711l;
import p174e.p199d.p218c.C5732e;
import p174e.p199d.p218c.p230o.C5844b;

/* renamed from: e.d.a.c */
public class C5657c {

    /* renamed from: e.d.a.c$a */
    static /* synthetic */ class C5658a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16029a;

        /* JADX WARNING: Can't wrap try/catch for region: R(42:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|(3:41|42|44)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|44) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                e.d.a.a[] r0 = p174e.p199d.p200a.C5655a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16029a = r0
                e.d.a.a r1 = p174e.p199d.p200a.C5655a.Jpeg     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16029a     // Catch:{ NoSuchFieldError -> 0x001d }
                e.d.a.a r1 = p174e.p199d.p200a.C5655a.Tiff     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16029a     // Catch:{ NoSuchFieldError -> 0x0028 }
                e.d.a.a r1 = p174e.p199d.p200a.C5655a.Arw     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f16029a     // Catch:{ NoSuchFieldError -> 0x0033 }
                e.d.a.a r1 = p174e.p199d.p200a.C5655a.Cr2     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f16029a     // Catch:{ NoSuchFieldError -> 0x003e }
                e.d.a.a r1 = p174e.p199d.p200a.C5655a.Nef     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f16029a     // Catch:{ NoSuchFieldError -> 0x0049 }
                e.d.a.a r1 = p174e.p199d.p200a.C5655a.Orf     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f16029a     // Catch:{ NoSuchFieldError -> 0x0054 }
                e.d.a.a r1 = p174e.p199d.p200a.C5655a.Rw2     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f16029a     // Catch:{ NoSuchFieldError -> 0x0060 }
                e.d.a.a r1 = p174e.p199d.p200a.C5655a.Psd     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f16029a     // Catch:{ NoSuchFieldError -> 0x006c }
                e.d.a.a r1 = p174e.p199d.p200a.C5655a.Png     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f16029a     // Catch:{ NoSuchFieldError -> 0x0078 }
                e.d.a.a r1 = p174e.p199d.p200a.C5655a.Bmp     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f16029a     // Catch:{ NoSuchFieldError -> 0x0084 }
                e.d.a.a r1 = p174e.p199d.p200a.C5655a.Gif     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f16029a     // Catch:{ NoSuchFieldError -> 0x0090 }
                e.d.a.a r1 = p174e.p199d.p200a.C5655a.Ico     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f16029a     // Catch:{ NoSuchFieldError -> 0x009c }
                e.d.a.a r1 = p174e.p199d.p200a.C5655a.Pcx     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f16029a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                e.d.a.a r1 = p174e.p199d.p200a.C5655a.WebP     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f16029a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                e.d.a.a r1 = p174e.p199d.p200a.C5655a.Raf     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f16029a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                e.d.a.a r1 = p174e.p199d.p200a.C5655a.Avi     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f16029a     // Catch:{ NoSuchFieldError -> 0x00cc }
                e.d.a.a r1 = p174e.p199d.p200a.C5655a.Wav     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f16029a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                e.d.a.a r1 = p174e.p199d.p200a.C5655a.Mov     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r0 = f16029a     // Catch:{ NoSuchFieldError -> 0x00e4 }
                e.d.a.a r1 = p174e.p199d.p200a.C5655a.Mp4     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r0 = f16029a     // Catch:{ NoSuchFieldError -> 0x00f0 }
                e.d.a.a r1 = p174e.p199d.p200a.C5655a.Eps     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r0 = f16029a     // Catch:{ NoSuchFieldError -> 0x00fc }
                e.d.a.a r1 = p174e.p199d.p200a.C5655a.Unknown     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p174e.p199d.p200a.C5657c.C5658a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static C5732e m21089a(InputStream inputStream, long j) {
        BufferedInputStream bufferedInputStream = inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream);
        C5655a a = C5656b.m21088a(bufferedInputStream);
        C5732e b = m21090b(bufferedInputStream, j, a);
        b.mo17166a(new C5844b(a));
        return b;
    }

    /* renamed from: b */
    public static C5732e m21090b(InputStream inputStream, long j, C5655a aVar) {
        switch (C5658a.f16029a[aVar.ordinal()]) {
            case 1:
                return C5666a.m21099c(inputStream);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return C5694c.m21192a(new C5711l(inputStream, 2048, j));
            case 8:
                return C5684a.m21147a(inputStream);
            case 9:
                return C5682g.m21146b(inputStream);
            case 10:
                return C5662a.m21093a(inputStream);
            case 11:
                return C5664a.m21095a(inputStream);
            case 12:
                return C5665a.m21096a(inputStream);
            case 13:
                return C5675a.m21119a(inputStream);
            case 14:
                return C5698a.m21198a(inputStream);
            case 15:
                return C5688a.m21157a(inputStream);
            case 16:
                return C5661a.m21092a(inputStream);
            case 17:
                return C5697a.m21197a(inputStream);
            case 18:
                return C5686b.m21154a(inputStream);
            case 19:
                return C5673b.m21116a(inputStream);
            case 20:
                return C5663a.m21094a(inputStream);
            case 21:
                throw new C5659d("File format could not be determined");
            default:
                return new C5732e();
        }
    }
}
