package com.horcrux.svg;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;

/* renamed from: com.horcrux.svg.k */
class C5040k {

    /* renamed from: a */
    private final ArrayList<Path> f14171a;

    /* renamed from: b */
    private final int[][] f14172b = new int[256][];

    /* renamed from: c */
    private final Paint f14173c;

    C5040k(Paint paint) {
        ArrayList<Path> arrayList = new ArrayList<>();
        this.f14171a = arrayList;
        this.f14173c = paint;
        arrayList.add(new Path());
    }

    /* renamed from: a */
    private int m19059a(char c) {
        int[] iArr = this.f14172b[c >> 8];
        if (iArr == null) {
            return 0;
        }
        return iArr[c & 255];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Path mo15295b(char c, String str) {
        Path path;
        int a = m19059a(c);
        if (a != 0) {
            path = this.f14171a.get(a);
        } else {
            Path path2 = new Path();
            this.f14173c.getTextPath(str, 0, 1, 0.0f, 0.0f, path2);
            int[][] iArr = this.f14172b;
            int i = c >> 8;
            int[] iArr2 = iArr[i];
            if (iArr2 == null) {
                iArr2 = new int[256];
                iArr[i] = iArr2;
            }
            iArr2[c & 255] = this.f14171a.size();
            this.f14171a.add(path2);
            path = path2;
        }
        Path path3 = new Path();
        path3.addPath(path);
        return path3;
    }
}
