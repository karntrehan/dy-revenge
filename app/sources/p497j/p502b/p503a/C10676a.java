package p497j.p502b.p503a;

import android.util.SparseArray;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: j.b.a.a */
public class C10676a {

    /* renamed from: a */
    public static final SparseArray<String> f28153a;

    /* renamed from: b */
    public static final Map<String, Integer> f28154b;

    static {
        SparseArray<String> sparseArray = new SparseArray<>();
        sparseArray.put(1, "CODE_128");
        sparseArray.put(2, "CODE_39");
        sparseArray.put(4, "CODE_93");
        sparseArray.put(8, "CODABAR");
        sparseArray.put(16, "DATA_MATRIX");
        sparseArray.put(32, "EAN_13");
        sparseArray.put(64, "EAN_8");
        sparseArray.put(128, "ITF");
        sparseArray.put(256, "QR_CODE");
        sparseArray.put(512, "UPC_A");
        sparseArray.put(1024, "UPC_E");
        sparseArray.put(2048, "PDF417");
        sparseArray.put(4096, "AZTEC");
        sparseArray.put(0, "ALL");
        sparseArray.put(11, "CALENDAR_EVENT");
        sparseArray.put(1, "CONTACT_INFO");
        sparseArray.put(12, "DRIVER_LICENSE");
        sparseArray.put(2, "EMAIL");
        sparseArray.put(10, "GEO");
        sparseArray.put(3, "ISBN");
        sparseArray.put(4, "PHONE");
        sparseArray.put(5, "PRODUCT");
        sparseArray.put(6, "SMS");
        sparseArray.put(7, "TEXT");
        sparseArray.put(8, "URL");
        sparseArray.put(9, "WIFI");
        sparseArray.put(-1, "None");
        f28153a = sparseArray;
        HashMap hashMap = new HashMap();
        for (int i = 0; i < sparseArray.size(); i++) {
            hashMap.put(sparseArray.valueAt(i), Integer.valueOf(sparseArray.keyAt(i)));
        }
        f28154b = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public static String m36341a(int i) {
        return f28153a.get(i, "UNKNOWN_FORMAT");
    }
}
