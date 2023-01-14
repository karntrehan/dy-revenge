package p027c.p064i.p071i;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.core.util.C1173d;

/* renamed from: c.i.i.c */
public class C1892c implements Spannable {

    /* renamed from: f */
    private static final Object f5571f = new Object();

    /* renamed from: o */
    private final Spannable f5572o;

    /* renamed from: p */
    private final C1893a f5573p;

    /* renamed from: q */
    private final PrecomputedText f5574q;

    /* renamed from: c.i.i.c$a */
    public static final class C1893a {

        /* renamed from: a */
        private final TextPaint f5575a;

        /* renamed from: b */
        private final TextDirectionHeuristic f5576b;

        /* renamed from: c */
        private final int f5577c;

        /* renamed from: d */
        private final int f5578d;

        /* renamed from: e */
        final PrecomputedText.Params f5579e;

        /* renamed from: c.i.i.c$a$a */
        public static class C1894a {

            /* renamed from: a */
            private final TextPaint f5580a;

            /* renamed from: b */
            private TextDirectionHeuristic f5581b;

            /* renamed from: c */
            private int f5582c;

            /* renamed from: d */
            private int f5583d;

            public C1894a(TextPaint textPaint) {
                this.f5580a = textPaint;
                int i = Build.VERSION.SDK_INT;
                if (i >= 23) {
                    this.f5582c = 1;
                    this.f5583d = 1;
                } else {
                    this.f5583d = 0;
                    this.f5582c = 0;
                }
                this.f5581b = i >= 18 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : null;
            }

            /* renamed from: a */
            public C1893a mo6431a() {
                return new C1893a(this.f5580a, this.f5581b, this.f5582c, this.f5583d);
            }

            /* renamed from: b */
            public C1894a mo6432b(int i) {
                this.f5582c = i;
                return this;
            }

            /* renamed from: c */
            public C1894a mo6433c(int i) {
                this.f5583d = i;
                return this;
            }

            /* renamed from: d */
            public C1894a mo6434d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f5581b = textDirectionHeuristic;
                return this;
            }
        }

        public C1893a(PrecomputedText.Params params) {
            this.f5575a = params.getTextPaint();
            this.f5576b = params.getTextDirection();
            this.f5577c = params.getBreakStrategy();
            this.f5578d = params.getHyphenationFrequency();
            this.f5579e = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        @SuppressLint({"NewApi"})
        C1893a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            this.f5579e = Build.VERSION.SDK_INT >= 29 ? new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build() : null;
            this.f5575a = textPaint;
            this.f5576b = textDirectionHeuristic;
            this.f5577c = i;
            this.f5578d = i2;
        }

        /* renamed from: a */
        public boolean mo6423a(C1893a aVar) {
            int i = Build.VERSION.SDK_INT;
            if ((i >= 23 && (this.f5577c != aVar.mo6424b() || this.f5578d != aVar.mo6425c())) || this.f5575a.getTextSize() != aVar.mo6427e().getTextSize() || this.f5575a.getTextScaleX() != aVar.mo6427e().getTextScaleX() || this.f5575a.getTextSkewX() != aVar.mo6427e().getTextSkewX()) {
                return false;
            }
            if ((i >= 21 && (this.f5575a.getLetterSpacing() != aVar.mo6427e().getLetterSpacing() || !TextUtils.equals(this.f5575a.getFontFeatureSettings(), aVar.mo6427e().getFontFeatureSettings()))) || this.f5575a.getFlags() != aVar.mo6427e().getFlags()) {
                return false;
            }
            if (i >= 24) {
                if (!this.f5575a.getTextLocales().equals(aVar.mo6427e().getTextLocales())) {
                    return false;
                }
            } else if (i >= 17 && !this.f5575a.getTextLocale().equals(aVar.mo6427e().getTextLocale())) {
                return false;
            }
            return this.f5575a.getTypeface() == null ? aVar.mo6427e().getTypeface() == null : this.f5575a.getTypeface().equals(aVar.mo6427e().getTypeface());
        }

        /* renamed from: b */
        public int mo6424b() {
            return this.f5577c;
        }

        /* renamed from: c */
        public int mo6425c() {
            return this.f5578d;
        }

        /* renamed from: d */
        public TextDirectionHeuristic mo6426d() {
            return this.f5576b;
        }

        /* renamed from: e */
        public TextPaint mo6427e() {
            return this.f5575a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C1893a)) {
                return false;
            }
            C1893a aVar = (C1893a) obj;
            if (!mo6423a(aVar)) {
                return false;
            }
            return Build.VERSION.SDK_INT < 18 || this.f5576b == aVar.mo6426d();
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return C1173d.m4573b(Float.valueOf(this.f5575a.getTextSize()), Float.valueOf(this.f5575a.getTextScaleX()), Float.valueOf(this.f5575a.getTextSkewX()), Float.valueOf(this.f5575a.getLetterSpacing()), Integer.valueOf(this.f5575a.getFlags()), this.f5575a.getTextLocales(), this.f5575a.getTypeface(), Boolean.valueOf(this.f5575a.isElegantTextHeight()), this.f5576b, Integer.valueOf(this.f5577c), Integer.valueOf(this.f5578d));
            } else if (i >= 21) {
                return C1173d.m4573b(Float.valueOf(this.f5575a.getTextSize()), Float.valueOf(this.f5575a.getTextScaleX()), Float.valueOf(this.f5575a.getTextSkewX()), Float.valueOf(this.f5575a.getLetterSpacing()), Integer.valueOf(this.f5575a.getFlags()), this.f5575a.getTextLocale(), this.f5575a.getTypeface(), Boolean.valueOf(this.f5575a.isElegantTextHeight()), this.f5576b, Integer.valueOf(this.f5577c), Integer.valueOf(this.f5578d));
            } else if (i >= 18) {
                return C1173d.m4573b(Float.valueOf(this.f5575a.getTextSize()), Float.valueOf(this.f5575a.getTextScaleX()), Float.valueOf(this.f5575a.getTextSkewX()), Integer.valueOf(this.f5575a.getFlags()), this.f5575a.getTextLocale(), this.f5575a.getTypeface(), this.f5576b, Integer.valueOf(this.f5577c), Integer.valueOf(this.f5578d));
            } else if (i >= 17) {
                return C1173d.m4573b(Float.valueOf(this.f5575a.getTextSize()), Float.valueOf(this.f5575a.getTextScaleX()), Float.valueOf(this.f5575a.getTextSkewX()), Integer.valueOf(this.f5575a.getFlags()), this.f5575a.getTextLocale(), this.f5575a.getTypeface(), this.f5576b, Integer.valueOf(this.f5577c), Integer.valueOf(this.f5578d));
            } else {
                return C1173d.m4573b(Float.valueOf(this.f5575a.getTextSize()), Float.valueOf(this.f5575a.getTextScaleX()), Float.valueOf(this.f5575a.getTextSkewX()), Integer.valueOf(this.f5575a.getFlags()), this.f5575a.getTypeface(), this.f5576b, Integer.valueOf(this.f5577c), Integer.valueOf(this.f5578d));
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x00df  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "{"
                r0.<init>(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "textSize="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f5575a
                float r2 = r2.getTextSize()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textScaleX="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f5575a
                float r2 = r2.getTextScaleX()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textSkewX="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f5575a
                float r2 = r2.getTextSkewX()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 21
                if (r1 < r2) goto L_0x008f
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = ", letterSpacing="
                r2.append(r3)
                android.text.TextPaint r3 = r4.f5575a
                float r3 = r3.getLetterSpacing()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.append(r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = ", elegantTextHeight="
                r2.append(r3)
                android.text.TextPaint r3 = r4.f5575a
                boolean r3 = r3.isElegantTextHeight()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.append(r2)
            L_0x008f:
                r2 = 24
                java.lang.String r3 = ", textLocale="
                if (r1 < r2) goto L_0x00ae
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r3)
                android.text.TextPaint r3 = r4.f5575a
                android.os.LocaleList r3 = r3.getTextLocales()
            L_0x00a3:
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.append(r2)
                goto L_0x00c1
            L_0x00ae:
                r2 = 17
                if (r1 < r2) goto L_0x00c1
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r3)
                android.text.TextPaint r3 = r4.f5575a
                java.util.Locale r3 = r3.getTextLocale()
                goto L_0x00a3
            L_0x00c1:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = ", typeface="
                r2.append(r3)
                android.text.TextPaint r3 = r4.f5575a
                android.graphics.Typeface r3 = r3.getTypeface()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.append(r2)
                r2 = 26
                if (r1 < r2) goto L_0x00f9
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", variationSettings="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f5575a
                java.lang.String r2 = r2.getFontVariationSettings()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
            L_0x00f9:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textDir="
                r1.append(r2)
                android.text.TextDirectionHeuristic r2 = r4.f5576b
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", breakStrategy="
                r1.append(r2)
                int r2 = r4.f5577c
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", hyphenationFrequency="
                r1.append(r2)
                int r2 = r4.f5578d
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p027c.p064i.p071i.C1892c.C1893a.toString():java.lang.String");
        }
    }

    /* renamed from: a */
    public C1893a mo6410a() {
        return this.f5573p;
    }

    /* renamed from: b */
    public PrecomputedText mo6411b() {
        Spannable spannable = this.f5572o;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    public char charAt(int i) {
        return this.f5572o.charAt(i);
    }

    public int getSpanEnd(Object obj) {
        return this.f5572o.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f5572o.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f5572o.getSpanStart(obj);
    }

    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? this.f5574q.getSpans(i, i2, cls) : this.f5572o.getSpans(i, i2, cls);
    }

    public int length() {
        return this.f5572o.length();
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f5572o.nextSpanTransition(i, i2, cls);
    }

    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f5574q.removeSpan(obj);
        } else {
            this.f5572o.removeSpan(obj);
        }
    }

    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f5574q.setSpan(obj, i, i2, i3);
        } else {
            this.f5572o.setSpan(obj, i, i2, i3);
        }
    }

    public CharSequence subSequence(int i, int i2) {
        return this.f5572o.subSequence(i, i2);
    }

    public String toString() {
        return this.f5572o.toString();
    }
}
