package androidx.core.content.p022d;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.core.content.d.g */
public class C1163g {
    /* renamed from: a */
    public static boolean m4509a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        return !m4518j(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    /* renamed from: b */
    public static int m4510b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m4518j(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    /* renamed from: c */
    public static ColorStateList m4511c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        if (!m4518j(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        int i2 = typedValue.type;
        if (i2 != 2) {
            return (i2 < 28 || i2 > 31) ? C1144a.m4445d(typedArray.getResources(), typedArray.getResourceId(i, 0), theme) : m4512d(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
    }

    /* renamed from: d */
    private static ColorStateList m4512d(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* renamed from: e */
    public static C1145b m4513e(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        if (m4518j(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return C1145b.m4451b(typedValue.data);
            }
            C1145b g = C1145b.m4454g(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (g != null) {
                return g;
            }
        }
        return C1145b.m4451b(i2);
    }

    /* renamed from: f */
    public static float m4514f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !m4518j(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* renamed from: g */
    public static int m4515g(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m4518j(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* renamed from: h */
    public static int m4516h(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m4518j(xmlPullParser, str) ? i2 : typedArray.getResourceId(i, i2);
    }

    /* renamed from: i */
    public static String m4517i(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m4518j(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    /* renamed from: j */
    public static boolean m4518j(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: k */
    public static TypedArray m4519k(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: l */
    public static TypedValue m4520l(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m4518j(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(i);
    }
}
