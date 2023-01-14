package p174e.p199d.p200a;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.HashMap;
import p174e.p199d.p217b.C5702d;

/* renamed from: e.d.a.b */
public class C5656b {

    /* renamed from: a */
    private static final C5702d<C5655a> f16027a;

    /* renamed from: b */
    private static final HashMap<String, C5655a> f16028b;

    static {
        C5702d<C5655a> dVar = new C5702d<>();
        f16027a = dVar;
        dVar.mo17026d(C5655a.Unknown);
        dVar.mo17023a(C5655a.Jpeg, new byte[]{-1, -40});
        C5655a aVar = C5655a.Tiff;
        dVar.mo17023a(aVar, "II".getBytes(), new byte[]{42, 0});
        dVar.mo17023a(aVar, "MM".getBytes(), new byte[]{0, 42});
        dVar.mo17023a(C5655a.Psd, "8BPS".getBytes());
        dVar.mo17023a(C5655a.Png, new byte[]{-119, 80, 78, 71, 13, 10, 26, 10, 0, 0, 0, 13, 73, 72, 68, 82});
        C5655a aVar2 = C5655a.Bmp;
        dVar.mo17023a(aVar2, "BM".getBytes());
        dVar.mo17023a(aVar2, "BA".getBytes());
        dVar.mo17023a(aVar2, "CI".getBytes());
        dVar.mo17023a(aVar2, "CP".getBytes());
        dVar.mo17023a(aVar2, "IC".getBytes());
        dVar.mo17023a(aVar2, "PT".getBytes());
        C5655a aVar3 = C5655a.Gif;
        dVar.mo17023a(aVar3, "GIF87a".getBytes());
        dVar.mo17023a(aVar3, "GIF89a".getBytes());
        dVar.mo17023a(C5655a.Ico, new byte[]{0, 0, 1, 0});
        C5655a aVar4 = C5655a.Pcx;
        dVar.mo17023a(aVar4, new byte[]{10, 0, 1});
        dVar.mo17023a(aVar4, new byte[]{10, 2, 1});
        dVar.mo17023a(aVar4, new byte[]{10, 3, 1});
        dVar.mo17023a(aVar4, new byte[]{10, 5, 1});
        dVar.mo17023a(C5655a.Riff, "RIFF".getBytes());
        dVar.mo17023a(C5655a.Arw, "II".getBytes(), new byte[]{42, 0, 8, 0});
        dVar.mo17023a(C5655a.Crw, "II".getBytes(), new byte[]{26, 0, 0, 0}, "HEAPCCDR".getBytes());
        dVar.mo17023a(C5655a.Cr2, "II".getBytes(), new byte[]{42, 0, 16, 0, 0, 0, 67, 82});
        C5655a aVar5 = C5655a.Orf;
        dVar.mo17023a(aVar5, "IIRO".getBytes(), new byte[]{8, 0});
        dVar.mo17023a(aVar5, "MMOR".getBytes(), new byte[]{0, 0});
        dVar.mo17023a(aVar5, "IIRS".getBytes(), new byte[]{8, 0});
        dVar.mo17023a(C5655a.Raf, "FUJIFILMCCD-RAW".getBytes());
        dVar.mo17023a(C5655a.Rw2, "II".getBytes(), new byte[]{85, 0});
        C5655a aVar6 = C5655a.Eps;
        dVar.mo17023a(aVar6, "%!PS".getBytes());
        dVar.mo17023a(aVar6, new byte[]{-59, -48, -45, -58});
        HashMap<String, C5655a> hashMap = new HashMap<>();
        f16028b = hashMap;
        C5655a aVar7 = C5655a.Mov;
        hashMap.put("ftypmoov", aVar7);
        hashMap.put("ftypwide", aVar7);
        hashMap.put("ftypmdat", aVar7);
        hashMap.put("ftypfree", aVar7);
        hashMap.put("ftypqt  ", aVar7);
        C5655a aVar8 = C5655a.Mp4;
        hashMap.put("ftypavc1", aVar8);
        hashMap.put("ftypiso2", aVar8);
        hashMap.put("ftypisom", aVar8);
        hashMap.put("ftypM4A ", aVar8);
        hashMap.put("ftypM4B ", aVar8);
        hashMap.put("ftypM4P ", aVar8);
        hashMap.put("ftypM4V ", aVar8);
        hashMap.put("ftypM4VH", aVar8);
        hashMap.put("ftypM4VP", aVar8);
        hashMap.put("ftypmmp4", aVar8);
        hashMap.put("ftypmp41", aVar8);
        hashMap.put("ftypmp42", aVar8);
        hashMap.put("ftypmp71", aVar8);
        hashMap.put("ftypMSNV", aVar8);
        hashMap.put("ftypNDAS", aVar8);
        hashMap.put("ftypNDSC", aVar8);
        hashMap.put("ftypNDSH", aVar8);
        hashMap.put("ftypNDSM", aVar8);
        hashMap.put("ftypNDSP", aVar8);
        hashMap.put("ftypNDSS", aVar8);
        hashMap.put("ftypNDXC", aVar8);
        hashMap.put("ftypNDXH", aVar8);
        hashMap.put("ftypNDXM", aVar8);
        hashMap.put("ftypNDXP", aVar8);
        hashMap.put("ftypNDXS", aVar8);
        C5655a aVar9 = C5655a.Heif;
        hashMap.put("ftypmif1", aVar9);
        hashMap.put("ftypmsf1", aVar9);
        hashMap.put("ftypheic", aVar9);
        hashMap.put("ftypheix", aVar9);
        hashMap.put("ftyphevc", aVar9);
        hashMap.put("ftyphevx", aVar9);
        C5655a aVar10 = C5655a.Aac;
        dVar.mo17023a(aVar10, new byte[]{-1, -15});
        dVar.mo17023a(aVar10, new byte[]{-1, -7});
        dVar.mo17023a(C5655a.Asf, new byte[]{48, 38, -78, 117, -114, 102, -49, 17, -90, -39, 0, -86, 0, 98, -50, 108});
        dVar.mo17023a(C5655a.Cfbf, new byte[]{-48, -49, 17, -32, -95, -79, 26, -31, 0});
        dVar.mo17023a(C5655a.Flv, new byte[]{70, 76, 86});
        dVar.mo17023a(C5655a.Indd, new byte[]{6, 6, -19, -11, -40, 29, 70, -27, -67, 49, -17, -25, -2, 116, -73, 29});
        dVar.mo17023a(C5655a.Mxf, new byte[]{6, 14, 43, 52, 2, 5, 1, 1, 13, 1, 2, 1, 1, 2});
        C5655a aVar11 = C5655a.Qxp;
        dVar.mo17023a(aVar11, new byte[]{0, 0, 73, 73, 88, 80, 82, 51});
        dVar.mo17023a(aVar11, new byte[]{0, 0, 77, 77, 88, 80, 82, 51});
        dVar.mo17023a(C5655a.Ram, new byte[]{114, 116, 115, 112, 58, 47, 47});
        dVar.mo17023a(C5655a.Rtf, new byte[]{123, 92, 114, 116, 102, 49});
        C5655a aVar12 = C5655a.Sit;
        dVar.mo17023a(aVar12, new byte[]{83, 73, 84, 33, 0});
        dVar.mo17023a(aVar12, new byte[]{83, 116, 117, 102, 102, 73, 116, 32, 40, 99, 41, 49, 57, 57, 55, 45});
        dVar.mo17023a(C5655a.Sitx, new byte[]{83, 116, 117, 102, 102, 73, 116, 33});
        C5655a aVar13 = C5655a.Swf;
        dVar.mo17023a(aVar13, "CWS".getBytes());
        dVar.mo17023a(aVar13, "FWS".getBytes());
        dVar.mo17023a(aVar13, "ZWS".getBytes());
        dVar.mo17023a(C5655a.Vob, new byte[]{0, 0, 1, -70});
        dVar.mo17023a(C5655a.Zip, "PK".getBytes());
    }

    /* renamed from: a */
    public static C5655a m21088a(BufferedInputStream bufferedInputStream) {
        if (bufferedInputStream.markSupported()) {
            C5702d<C5655a> dVar = f16027a;
            int max = Math.max(16, dVar.mo17025c());
            bufferedInputStream.mark(max);
            byte[] bArr = new byte[max];
            if (bufferedInputStream.read(bArr) != -1) {
                bufferedInputStream.reset();
                C5655a b = dVar.mo17024b(bArr);
                if (b == C5655a.Unknown) {
                    C5655a aVar = f16028b.get(new String(bArr, 4, 8));
                    return aVar != null ? aVar : b;
                } else if (b != C5655a.Riff) {
                    return b;
                } else {
                    String str = new String(bArr, 8, 4);
                    return str.equals("WAVE") ? C5655a.Wav : str.equals("AVI ") ? C5655a.Avi : str.equals("WEBP") ? C5655a.WebP : b;
                }
            } else {
                throw new IOException("Stream ended before file's magic number could be determined.");
            }
        } else {
            throw new IOException("Stream must support mark/reset");
        }
    }
}
