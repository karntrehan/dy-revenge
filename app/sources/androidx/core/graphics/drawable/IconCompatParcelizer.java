package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.C1425a;

public class IconCompatParcelizer {
    public static IconCompat read(C1425a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f3232b = aVar.mo5299p(iconCompat.f3232b, 1);
        iconCompat.f3234d = aVar.mo5293j(iconCompat.f3234d, 2);
        iconCompat.f3235e = aVar.mo5301r(iconCompat.f3235e, 3);
        iconCompat.f3236f = aVar.mo5299p(iconCompat.f3236f, 4);
        iconCompat.f3237g = aVar.mo5299p(iconCompat.f3237g, 5);
        iconCompat.f3238h = (ColorStateList) aVar.mo5301r(iconCompat.f3238h, 6);
        iconCompat.f3240j = aVar.mo5303t(iconCompat.f3240j, 7);
        iconCompat.f3241k = aVar.mo5303t(iconCompat.f3241k, 8);
        iconCompat.mo3650l();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, C1425a aVar) {
        aVar.mo5307x(true, true);
        iconCompat.mo3651m(aVar.mo5289f());
        int i = iconCompat.f3232b;
        if (-1 != i) {
            aVar.mo5279F(i, 1);
        }
        byte[] bArr = iconCompat.f3234d;
        if (bArr != null) {
            aVar.mo5275B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f3235e;
        if (parcelable != null) {
            aVar.mo5281H(parcelable, 3);
        }
        int i2 = iconCompat.f3236f;
        if (i2 != 0) {
            aVar.mo5279F(i2, 4);
        }
        int i3 = iconCompat.f3237g;
        if (i3 != 0) {
            aVar.mo5279F(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f3238h;
        if (colorStateList != null) {
            aVar.mo5281H(colorStateList, 6);
        }
        String str = iconCompat.f3240j;
        if (str != null) {
            aVar.mo5283J(str, 7);
        }
        String str2 = iconCompat.f3241k;
        if (str2 != null) {
            aVar.mo5283J(str2, 8);
        }
    }
}
