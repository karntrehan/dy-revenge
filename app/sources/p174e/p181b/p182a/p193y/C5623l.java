package p174e.p181b.p182a.p193y;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;
import p174e.p181b.p182a.p188w.p190k.C5549c;
import p174e.p181b.p182a.p193y.p194k0.C5618c;
import p174e.p181b.p182a.p195z.C5646g;

/* renamed from: e.b.a.y.l */
public class C5623l implements C5614j0<C5549c> {

    /* renamed from: a */
    private int f15935a;

    public C5623l(int i) {
        this.f15935a = i;
    }

    /* renamed from: b */
    private void m20972b(C5549c cVar, List<Float> list) {
        int i = this.f15935a * 4;
        if (list.size() > i) {
            int size = (list.size() - i) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i2 = 0;
            while (i < list.size()) {
                if (i % 2 == 0) {
                    dArr[i2] = (double) list.get(i).floatValue();
                } else {
                    dArr2[i2] = (double) list.get(i).floatValue();
                    i2++;
                }
                i++;
            }
            for (int i3 = 0; i3 < cVar.mo16716c(); i3++) {
                int i4 = cVar.mo16714a()[i3];
                cVar.mo16714a()[i3] = Color.argb(m20973c((double) cVar.mo16715b()[i3], dArr, dArr2), Color.red(i4), Color.green(i4), Color.blue(i4));
            }
        }
    }

    /* renamed from: c */
    private int m20973c(double d, double[] dArr, double[] dArr2) {
        double d2;
        double[] dArr3 = dArr;
        double[] dArr4 = dArr2;
        int i = 1;
        while (true) {
            if (i >= dArr3.length) {
                d2 = dArr4[dArr4.length - 1];
                break;
            }
            int i2 = i - 1;
            double d3 = dArr3[i2];
            double d4 = dArr3[i];
            if (dArr3[i] >= d) {
                d2 = C5646g.m21062j(dArr4[i2], dArr4[i], C5646g.m21054b((d - d3) / (d4 - d3), 0.0d, 1.0d));
                break;
            }
            i++;
        }
        return (int) (d2 * 255.0d);
    }

    /* renamed from: d */
    public C5549c mo16853a(C5618c cVar, float f) {
        ArrayList arrayList = new ArrayList();
        boolean z = cVar.mo16868n0() == C5618c.C5620b.BEGIN_ARRAY;
        if (z) {
            cVar.mo16865b();
        }
        while (cVar.mo16860E()) {
            arrayList.add(Float.valueOf((float) cVar.mo16862L()));
        }
        if (z) {
            cVar.mo16869o();
        }
        if (this.f15935a == -1) {
            this.f15935a = arrayList.size() / 4;
        }
        int i = this.f15935a;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f15935a * 4; i4++) {
            int i5 = i4 / 4;
            double floatValue = (double) ((Float) arrayList.get(i4)).floatValue();
            int i6 = i4 % 4;
            if (i6 == 0) {
                if (i5 > 0) {
                    float f2 = (float) floatValue;
                    if (fArr[i5 - 1] >= f2) {
                        fArr[i5] = f2 + 0.01f;
                    }
                }
                fArr[i5] = (float) floatValue;
            } else if (i6 == 1) {
                i2 = (int) (floatValue * 255.0d);
            } else if (i6 == 2) {
                i3 = (int) (floatValue * 255.0d);
            } else if (i6 == 3) {
                iArr[i5] = Color.argb(255, i2, i3, (int) (floatValue * 255.0d));
            }
        }
        C5549c cVar2 = new C5549c(fArr, iArr);
        m20972b(cVar2, arrayList);
        return cVar2;
    }
}
