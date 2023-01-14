package p174e.p199d.p218c.p228n.p229a0;

import java.io.IOException;
import java.util.HashMap;
import p027c.p028a.C1444j;
import p174e.p199d.p217b.C5700b;
import p174e.p199d.p218c.C5718a;
import p174e.p199d.p218c.C5722b;
import p174e.p199d.p218c.C5728d;

/* renamed from: e.d.c.n.a0.n0 */
public class C5793n0 extends C5722b {

    /* renamed from: f */
    protected static final HashMap<Integer, String> f16293f;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f16293f = hashMap;
        hashMap.put(1, "Quality Mode");
        hashMap.put(2, "Version");
        hashMap.put(3, "White Balance");
        hashMap.put(7, "Focus Mode");
        hashMap.put(15, "AF Area Mode");
        hashMap.put(26, "Image Stabilization");
        hashMap.put(28, "Macro Mode");
        hashMap.put(31, "Record Mode");
        hashMap.put(32, "Audio");
        hashMap.put(37, "Internal Serial Number");
        hashMap.put(33, "Unknown Data Dump");
        hashMap.put(34, "Easy Mode");
        hashMap.put(35, "White Balance Bias");
        hashMap.put(36, "Flash Bias");
        hashMap.put(38, "Exif Version");
        hashMap.put(40, "Color Effect");
        hashMap.put(41, "Camera Uptime");
        hashMap.put(42, "Burst Mode");
        hashMap.put(43, "Sequence Number");
        hashMap.put(44, "Contrast Mode");
        hashMap.put(45, "Noise Reduction");
        hashMap.put(46, "Self Timer");
        hashMap.put(48, "Rotation");
        hashMap.put(49, "AF Assist Lamp");
        hashMap.put(50, "Color Mode");
        hashMap.put(51, "Baby Age");
        hashMap.put(52, "Optical Zoom Mode");
        hashMap.put(53, "Conversion Lens");
        hashMap.put(54, "Travel Day");
        hashMap.put(57, "Contrast");
        hashMap.put(58, "World Time Location");
        hashMap.put(59, "Text Stamp");
        hashMap.put(60, "Program ISO");
        hashMap.put(61, "Advanced Scene Mode");
        hashMap.put(3584, "Print Image Matching (PIM) Info");
        hashMap.put(63, "Number of Detected Faces");
        hashMap.put(64, "Saturation");
        hashMap.put(65, "Sharpness");
        hashMap.put(66, "Film Mode");
        hashMap.put(68, "Color Temp Kelvin");
        hashMap.put(69, "Bracket Settings");
        hashMap.put(70, "White Balance Adjust (AB)");
        hashMap.put(71, "White Balance Adjust (GM)");
        hashMap.put(72, "Flash Curtain");
        hashMap.put(73, "Long Exposure Noise Reduction");
        hashMap.put(75, "Panasonic Image Width");
        hashMap.put(76, "Panasonic Image Height");
        hashMap.put(77, "Af Point Position");
        hashMap.put(78, "Face Detection Info");
        hashMap.put(81, "Lens Type");
        hashMap.put(82, "Lens Serial Number");
        hashMap.put(83, "Accessory Type");
        hashMap.put(84, "Accessory Serial Number");
        hashMap.put(89, "Transform");
        hashMap.put(93, "Intelligent Exposure");
        hashMap.put(96, "Lens Firmware Version");
        hashMap.put(97, "Face Recognition Info");
        hashMap.put(98, "Flash Warning");
        hashMap.put(99, "Recognized Face Flags");
        hashMap.put(101, "Title");
        hashMap.put(102, "Baby Name");
        hashMap.put(103, "Location");
        hashMap.put(105, "Country");
        hashMap.put(107, "State");
        hashMap.put(109, "City");
        hashMap.put(111, "Landmark");
        hashMap.put(112, "Intelligent Resolution");
        hashMap.put(Integer.valueOf(C1444j.f4241I0), "Burst Speed");
        hashMap.put(Integer.valueOf(C1444j.f4251K0), "Intelligent D-Range");
        hashMap.put(Integer.valueOf(C1444j.f4266N0), "Clear Retouch");
        hashMap.put(128, "City 2");
        hashMap.put(137, "Photo Style");
        hashMap.put(138, "Shading Compensation");
        hashMap.put(140, "Accelerometer Z");
        hashMap.put(141, "Accelerometer X");
        hashMap.put(142, "Accelerometer Y");
        hashMap.put(143, "Camera Orientation");
        hashMap.put(144, "Roll Angle");
        hashMap.put(145, "Pitch Angle");
        hashMap.put(147, "Sweep Panorama Direction");
        hashMap.put(148, "Sweep Panorama Field Of View");
        hashMap.put(150, "Timer Recording");
        hashMap.put(157, "Internal ND Filter");
        hashMap.put(158, "HDR");
        hashMap.put(159, "Shutter Type");
        hashMap.put(163, "Clear Retouch Value");
        hashMap.put(171, "Touch AE");
        hashMap.put(32768, "Makernote Version");
        hashMap.put(32769, "Scene Mode");
        hashMap.put(32772, "White Balance (Red)");
        hashMap.put(32773, "White Balance (Green)");
        hashMap.put(32774, "White Balance (Blue)");
        hashMap.put(32775, "Flash Fired");
        hashMap.put(62, "Text Stamp 1");
        hashMap.put(32776, "Text Stamp 2");
        hashMap.put(32777, "Text Stamp 3");
        hashMap.put(32784, "Baby Age 1");
        hashMap.put(32786, "Transform 1");
    }

    public C5793n0() {
        mo17120E(new C5791m0(this));
    }

    /* renamed from: V */
    public C5718a mo17625V(int i) {
        String r = mo17153r(i);
        if (r == null) {
            return null;
        }
        return C5718a.m21303b(r);
    }

    /* renamed from: W */
    public C5728d[] mo17626W() {
        byte[] e = mo17141e(78);
        if (e == null) {
            return null;
        }
        C5700b bVar = new C5700b(e);
        bVar.mo17058w(false);
        try {
            int s = bVar.mo17054s(0);
            if (s == 0) {
                return null;
            }
            C5728d[] dVarArr = new C5728d[s];
            for (int i = 0; i < s; i++) {
                int i2 = (i * 8) + 2;
                dVarArr[i] = new C5728d(bVar.mo17054s(i2), bVar.mo17054s(i2 + 2), bVar.mo17054s(i2 + 4), bVar.mo17054s(i2 + 6), (String) null, (C5718a) null);
            }
            return dVarArr;
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: X */
    public C5728d[] mo17627X() {
        byte[] e = mo17141e(97);
        if (e == null) {
            return null;
        }
        C5700b bVar = new C5700b(e);
        bVar.mo17058w(false);
        try {
            int s = bVar.mo17054s(0);
            if (s == 0) {
                return null;
            }
            C5728d[] dVarArr = new C5728d[s];
            for (int i = 0; i < s; i++) {
                int i2 = (i * 44) + 4;
                dVarArr[i] = new C5728d(bVar.mo17054s(i2 + 20), bVar.mo17054s(i2 + 22), bVar.mo17054s(i2 + 24), bVar.mo17054s(i2 + 26), bVar.mo17051p(i2, 20, "ASCII").trim(), C5718a.m21303b(bVar.mo17051p(i2 + 28, 20, "ASCII").trim()));
            }
            return dVarArr;
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: n */
    public String mo17104n() {
        return "Panasonic Makernote";
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public HashMap<Integer, String> mo17105w() {
        return f16293f;
    }
}
