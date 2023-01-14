package p174e.p181b.p182a.p188w.p191l;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p027c.p060f.C1793d;
import p174e.p181b.p182a.C5433e;
import p174e.p181b.p182a.C5442g;
import p174e.p181b.p182a.C5462l;
import p174e.p181b.p182a.p183a0.C5419c;
import p174e.p181b.p182a.p184u.p185b.C5481d;
import p174e.p181b.p182a.p184u.p186c.C5499a;
import p174e.p181b.p182a.p184u.p186c.C5518n;
import p174e.p181b.p182a.p184u.p186c.C5520p;
import p174e.p181b.p182a.p188w.C5524b;
import p174e.p181b.p182a.p188w.C5526c;
import p174e.p181b.p182a.p188w.C5527d;
import p174e.p181b.p182a.p188w.p189j.C5533a;
import p174e.p181b.p182a.p188w.p189j.C5534b;
import p174e.p181b.p182a.p188w.p189j.C5543k;
import p174e.p181b.p182a.p188w.p190k.C5563n;
import p174e.p181b.p182a.p195z.C5647h;

/* renamed from: e.b.a.w.l.h */
public class C5583h extends C5571a {

    /* renamed from: A */
    private final RectF f15847A = new RectF();

    /* renamed from: B */
    private final Matrix f15848B = new Matrix();

    /* renamed from: C */
    private final Paint f15849C = new C5584a(1);

    /* renamed from: D */
    private final Paint f15850D = new C5585b(1);

    /* renamed from: E */
    private final Map<C5527d, List<C5481d>> f15851E = new HashMap();

    /* renamed from: F */
    private final C1793d<String> f15852F = new C1793d<>();

    /* renamed from: G */
    private final C5518n f15853G;

    /* renamed from: H */
    private final C5442g f15854H;

    /* renamed from: I */
    private final C5433e f15855I;

    /* renamed from: J */
    private C5499a<Integer, Integer> f15856J;

    /* renamed from: K */
    private C5499a<Integer, Integer> f15857K;

    /* renamed from: L */
    private C5499a<Integer, Integer> f15858L;

    /* renamed from: M */
    private C5499a<Integer, Integer> f15859M;

    /* renamed from: N */
    private C5499a<Float, Float> f15860N;

    /* renamed from: O */
    private C5499a<Float, Float> f15861O;

    /* renamed from: P */
    private C5499a<Float, Float> f15862P;

    /* renamed from: Q */
    private C5499a<Float, Float> f15863Q;

    /* renamed from: R */
    private C5499a<Float, Float> f15864R;

    /* renamed from: S */
    private C5499a<Float, Float> f15865S;

    /* renamed from: T */
    private C5499a<Typeface, Typeface> f15866T;

    /* renamed from: z */
    private final StringBuilder f15867z = new StringBuilder(2);

    /* renamed from: e.b.a.w.l.h$a */
    class C5584a extends Paint {
        C5584a(int i) {
            super(i);
            setStyle(Paint.Style.FILL);
        }
    }

    /* renamed from: e.b.a.w.l.h$b */
    class C5585b extends Paint {
        C5585b(int i) {
            super(i);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* renamed from: e.b.a.w.l.h$c */
    static /* synthetic */ class C5586c {

        /* renamed from: a */
        static final /* synthetic */ int[] f15870a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                e.b.a.w.b$a[] r0 = p174e.p181b.p182a.p188w.C5524b.C5525a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15870a = r0
                e.b.a.w.b$a r1 = p174e.p181b.p182a.p188w.C5524b.C5525a.LEFT_ALIGN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15870a     // Catch:{ NoSuchFieldError -> 0x001d }
                e.b.a.w.b$a r1 = p174e.p181b.p182a.p188w.C5524b.C5525a.RIGHT_ALIGN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15870a     // Catch:{ NoSuchFieldError -> 0x0028 }
                e.b.a.w.b$a r1 = p174e.p181b.p182a.p188w.C5524b.C5525a.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p174e.p181b.p182a.p188w.p191l.C5583h.C5586c.<clinit>():void");
        }
    }

    C5583h(C5442g gVar, C5577d dVar) {
        super(gVar, dVar);
        C5534b bVar;
        C5534b bVar2;
        C5533a aVar;
        C5533a aVar2;
        this.f15854H = gVar;
        this.f15855I = dVar.mo16817a();
        C5518n d = dVar.mo16833q().mo16693a();
        this.f15853G = d;
        d.mo16606a(this);
        mo16812j(d);
        C5543k r = dVar.mo16834r();
        if (!(r == null || (aVar2 = r.f15630a) == null)) {
            C5499a<Integer, Integer> a = aVar2.mo16693a();
            this.f15856J = a;
            a.mo16606a(this);
            mo16812j(this.f15856J);
        }
        if (!(r == null || (aVar = r.f15631b) == null)) {
            C5499a<Integer, Integer> a2 = aVar.mo16693a();
            this.f15858L = a2;
            a2.mo16606a(this);
            mo16812j(this.f15858L);
        }
        if (!(r == null || (bVar2 = r.f15632c) == null)) {
            C5499a<Float, Float> a3 = bVar2.mo16693a();
            this.f15860N = a3;
            a3.mo16606a(this);
            mo16812j(this.f15860N);
        }
        if (r != null && (bVar = r.f15633d) != null) {
            C5499a<Float, Float> a4 = bVar.mo16693a();
            this.f15862P = a4;
            a4.mo16606a(this);
            mo16812j(this.f15862P);
        }
    }

    /* renamed from: L */
    private void m20839L(C5524b.C5525a aVar, Canvas canvas, float f) {
        float f2;
        int i = C5586c.f15870a[aVar.ordinal()];
        if (i == 2) {
            f2 = -f;
        } else if (i == 3) {
            f2 = (-f) / 2.0f;
        } else {
            return;
        }
        canvas.translate(f2, 0.0f);
    }

    /* renamed from: M */
    private String m20840M(String str, int i) {
        int codePointAt = str.codePointAt(i);
        int charCount = Character.charCount(codePointAt) + i;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!m20853Z(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j = (long) codePointAt;
        if (this.f15852F.mo6164f(j)) {
            return this.f15852F.mo6165i(j);
        }
        this.f15867z.setLength(0);
        while (i < charCount) {
            int codePointAt3 = str.codePointAt(i);
            this.f15867z.appendCodePoint(codePointAt3);
            i += Character.charCount(codePointAt3);
        }
        String sb = this.f15867z.toString();
        this.f15852F.mo6169m(j, sb);
        return sb;
    }

    /* renamed from: N */
    private void m20841N(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
            }
        }
    }

    /* renamed from: O */
    private void m20842O(C5527d dVar, Matrix matrix, float f, C5524b bVar, Canvas canvas) {
        Paint paint;
        List<C5481d> V = m20849V(dVar);
        for (int i = 0; i < V.size(); i++) {
            Path a = V.get(i).mo16596a();
            a.computeBounds(this.f15847A, false);
            this.f15848B.set(matrix);
            this.f15848B.preTranslate(0.0f, (-bVar.f15596g) * C5647h.m21070e());
            this.f15848B.preScale(f, f);
            a.transform(this.f15848B);
            if (bVar.f15600k) {
                m20845R(a, this.f15849C, canvas);
                paint = this.f15850D;
            } else {
                m20845R(a, this.f15850D, canvas);
                paint = this.f15849C;
            }
            m20845R(a, paint, canvas);
        }
    }

    /* renamed from: P */
    private void m20843P(String str, C5524b bVar, Canvas canvas) {
        Paint paint;
        if (bVar.f15600k) {
            m20841N(str, this.f15849C, canvas);
            paint = this.f15850D;
        } else {
            m20841N(str, this.f15850D, canvas);
            paint = this.f15849C;
        }
        m20841N(str, paint, canvas);
    }

    /* renamed from: Q */
    private void m20844Q(String str, C5524b bVar, Canvas canvas, float f) {
        int i = 0;
        while (i < str.length()) {
            String M = m20840M(str, i);
            i += M.length();
            m20843P(M, bVar, canvas);
            canvas.translate(this.f15849C.measureText(M) + f, 0.0f);
        }
    }

    /* renamed from: R */
    private void m20845R(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawPath(path, paint);
            }
        }
    }

    /* renamed from: S */
    private void m20846S(String str, C5524b bVar, Matrix matrix, C5526c cVar, Canvas canvas, float f, float f2) {
        for (int i = 0; i < str.length(); i++) {
            C5527d g = this.f15855I.mo16457c().mo6276g(C5527d.m20587c(str.charAt(i), cVar.mo16671a(), cVar.mo16673c()));
            if (g != null) {
                m20842O(g, matrix, f2, bVar, canvas);
                float b = ((float) g.mo16676b()) * f2 * C5647h.m21070e() * f;
                float f3 = ((float) bVar.f15594e) / 10.0f;
                C5499a<Float, Float> aVar = this.f15863Q;
                if (!(aVar == null && (aVar = this.f15862P) == null)) {
                    f3 += aVar.mo16612h().floatValue();
                }
                canvas.translate(b + (f3 * f), 0.0f);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        r0 = r8.f15864R;
     */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m20847T(p174e.p181b.p182a.p188w.C5524b r18, android.graphics.Matrix r19, p174e.p181b.p182a.p188w.C5526c r20, android.graphics.Canvas r21) {
        /*
            r17 = this;
            r8 = r17
            r9 = r18
            r10 = r21
            e.b.a.u.c.a<java.lang.Float, java.lang.Float> r0 = r8.f15865S
            if (r0 == 0) goto L_0x0015
        L_0x000a:
            java.lang.Object r0 = r0.mo16612h()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L_0x001c
        L_0x0015:
            e.b.a.u.c.a<java.lang.Float, java.lang.Float> r0 = r8.f15864R
            if (r0 == 0) goto L_0x001a
            goto L_0x000a
        L_0x001a:
            float r0 = r9.f15592c
        L_0x001c:
            r1 = 1120403456(0x42c80000, float:100.0)
            float r11 = r0 / r1
            float r12 = p174e.p181b.p182a.p195z.C5647h.m21072g(r19)
            java.lang.String r0 = r9.f15590a
            float r1 = r9.f15595f
            float r2 = p174e.p181b.p182a.p195z.C5647h.m21070e()
            float r13 = r1 * r2
            java.util.List r14 = r8.m20851X(r0)
            int r15 = r14.size()
            r0 = 0
            r7 = 0
        L_0x0038:
            if (r7 >= r15) goto L_0x0076
            java.lang.Object r0 = r14.get(r7)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            r6 = r20
            float r0 = r8.m20850W(r1, r6, r11, r12)
            r21.save()
            e.b.a.w.b$a r2 = r9.f15593d
            r8.m20839L(r2, r10, r0)
            int r0 = r15 + -1
            float r0 = (float) r0
            float r0 = r0 * r13
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r2
            float r2 = (float) r7
            float r2 = r2 * r13
            float r2 = r2 - r0
            r0 = 0
            r10.translate(r0, r2)
            r0 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r12
            r16 = r7
            r7 = r11
            r0.m20846S(r1, r2, r3, r4, r5, r6, r7)
            r21.restore()
            int r7 = r16 + 1
            goto L_0x0038
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p181b.p182a.p188w.p191l.C5583h.m20847T(e.b.a.w.b, android.graphics.Matrix, e.b.a.w.c, android.graphics.Canvas):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r8 = r6.f15864R;
     */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m20848U(p174e.p181b.p182a.p188w.C5524b r7, p174e.p181b.p182a.p188w.C5526c r8, android.graphics.Matrix r9, android.graphics.Canvas r10) {
        /*
            r6 = this;
            android.graphics.Typeface r8 = r6.m20852Y(r8)
            if (r8 != 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.String r9 = r7.f15590a
            e.b.a.g r0 = r6.f15854H
            e.b.a.t r0 = r0.mo16496G()
            if (r0 != 0) goto L_0x00be
            android.graphics.Paint r0 = r6.f15849C
            r0.setTypeface(r8)
            e.b.a.u.c.a<java.lang.Float, java.lang.Float> r8 = r6.f15865S
            if (r8 == 0) goto L_0x0025
        L_0x001a:
            java.lang.Object r8 = r8.mo16612h()
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
            goto L_0x002c
        L_0x0025:
            e.b.a.u.c.a<java.lang.Float, java.lang.Float> r8 = r6.f15864R
            if (r8 == 0) goto L_0x002a
            goto L_0x001a
        L_0x002a:
            float r8 = r7.f15592c
        L_0x002c:
            android.graphics.Paint r0 = r6.f15849C
            float r1 = p174e.p181b.p182a.p195z.C5647h.m21070e()
            float r1 = r1 * r8
            r0.setTextSize(r1)
            android.graphics.Paint r0 = r6.f15850D
            android.graphics.Paint r1 = r6.f15849C
            android.graphics.Typeface r1 = r1.getTypeface()
            r0.setTypeface(r1)
            android.graphics.Paint r0 = r6.f15850D
            android.graphics.Paint r1 = r6.f15849C
            float r1 = r1.getTextSize()
            r0.setTextSize(r1)
            float r0 = r7.f15595f
            float r1 = p174e.p181b.p182a.p195z.C5647h.m21070e()
            float r0 = r0 * r1
            int r1 = r7.f15594e
            float r1 = (float) r1
            r2 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 / r2
            e.b.a.u.c.a<java.lang.Float, java.lang.Float> r2 = r6.f15863Q
            if (r2 == 0) goto L_0x006b
        L_0x005f:
            java.lang.Object r2 = r2.mo16612h()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            float r1 = r1 + r2
            goto L_0x0070
        L_0x006b:
            e.b.a.u.c.a<java.lang.Float, java.lang.Float> r2 = r6.f15862P
            if (r2 == 0) goto L_0x0070
            goto L_0x005f
        L_0x0070:
            float r2 = p174e.p181b.p182a.p195z.C5647h.m21070e()
            float r1 = r1 * r2
            float r1 = r1 * r8
            r8 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r8
            java.util.List r8 = r6.m20851X(r9)
            int r9 = r8.size()
            r2 = 0
        L_0x0084:
            if (r2 >= r9) goto L_0x00bd
            java.lang.Object r3 = r8.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            android.graphics.Paint r4 = r6.f15850D
            float r4 = r4.measureText(r3)
            int r5 = r3.length()
            int r5 = r5 + -1
            float r5 = (float) r5
            float r5 = r5 * r1
            float r4 = r4 + r5
            r10.save()
            e.b.a.w.b$a r5 = r7.f15593d
            r6.m20839L(r5, r10, r4)
            int r4 = r9 + -1
            float r4 = (float) r4
            float r4 = r4 * r0
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
            float r5 = (float) r2
            float r5 = r5 * r0
            float r5 = r5 - r4
            r4 = 0
            r10.translate(r4, r5)
            r6.m20844Q(r3, r7, r10, r1)
            r10.restore()
            int r2 = r2 + 1
            goto L_0x0084
        L_0x00bd:
            return
        L_0x00be:
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p181b.p182a.p188w.p191l.C5583h.m20848U(e.b.a.w.b, e.b.a.w.c, android.graphics.Matrix, android.graphics.Canvas):void");
    }

    /* renamed from: V */
    private List<C5481d> m20849V(C5527d dVar) {
        if (this.f15851E.containsKey(dVar)) {
            return this.f15851E.get(dVar);
        }
        List<C5563n> a = dVar.mo16675a();
        int size = a.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new C5481d(this.f15854H, this, a.get(i)));
        }
        this.f15851E.put(dVar, arrayList);
        return arrayList;
    }

    /* renamed from: W */
    private float m20850W(String str, C5526c cVar, float f, float f2) {
        float f3 = 0.0f;
        for (int i = 0; i < str.length(); i++) {
            C5527d g = this.f15855I.mo16457c().mo6276g(C5527d.m20587c(str.charAt(i), cVar.mo16671a(), cVar.mo16673c()));
            if (g != null) {
                f3 = (float) (((double) f3) + (g.mo16676b() * ((double) f) * ((double) C5647h.m21070e()) * ((double) f2)));
            }
        }
        return f3;
    }

    /* renamed from: X */
    private List<String> m20851X(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }

    /* renamed from: Y */
    private Typeface m20852Y(C5526c cVar) {
        Typeface h;
        C5499a<Typeface, Typeface> aVar = this.f15866T;
        if (aVar != null && (h = aVar.mo16612h()) != null) {
            return h;
        }
        Typeface H = this.f15854H.mo16497H(cVar.mo16671a(), cVar.mo16673c());
        return H != null ? H : cVar.mo16674d();
    }

    /* renamed from: Z */
    private boolean m20853Z(int i) {
        return Character.getType(i) == 16 || Character.getType(i) == 27 || Character.getType(i) == 6 || Character.getType(i) == 28 || Character.getType(i) == 19;
    }

    /* renamed from: e */
    public void mo16590e(RectF rectF, Matrix matrix, boolean z) {
        super.mo16590e(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, (float) this.f15855I.mo16456b().width(), (float) this.f15855I.mo16456b().height());
    }

    /* renamed from: h */
    public <T> void mo16592h(T t, C5419c<T> cVar) {
        C5499a aVar;
        super.mo16592h(t, cVar);
        if (t == C5462l.f15284a) {
            C5499a<Integer, Integer> aVar2 = this.f15857K;
            if (aVar2 != null) {
                mo16806D(aVar2);
            }
            if (cVar == null) {
                this.f15857K = null;
                return;
            }
            C5520p pVar = new C5520p(cVar);
            this.f15857K = pVar;
            pVar.mo16606a(this);
            aVar = this.f15857K;
        } else if (t == C5462l.f15285b) {
            C5499a<Integer, Integer> aVar3 = this.f15859M;
            if (aVar3 != null) {
                mo16806D(aVar3);
            }
            if (cVar == null) {
                this.f15859M = null;
                return;
            }
            C5520p pVar2 = new C5520p(cVar);
            this.f15859M = pVar2;
            pVar2.mo16606a(this);
            aVar = this.f15859M;
        } else if (t == C5462l.f15300q) {
            C5499a<Float, Float> aVar4 = this.f15861O;
            if (aVar4 != null) {
                mo16806D(aVar4);
            }
            if (cVar == null) {
                this.f15861O = null;
                return;
            }
            C5520p pVar3 = new C5520p(cVar);
            this.f15861O = pVar3;
            pVar3.mo16606a(this);
            aVar = this.f15861O;
        } else if (t == C5462l.f15301r) {
            C5499a<Float, Float> aVar5 = this.f15863Q;
            if (aVar5 != null) {
                mo16806D(aVar5);
            }
            if (cVar == null) {
                this.f15863Q = null;
                return;
            }
            C5520p pVar4 = new C5520p(cVar);
            this.f15863Q = pVar4;
            pVar4.mo16606a(this);
            aVar = this.f15863Q;
        } else if (t == C5462l.f15279D) {
            C5499a<Float, Float> aVar6 = this.f15865S;
            if (aVar6 != null) {
                mo16806D(aVar6);
            }
            if (cVar == null) {
                this.f15865S = null;
                return;
            }
            C5520p pVar5 = new C5520p(cVar);
            this.f15865S = pVar5;
            pVar5.mo16606a(this);
            aVar = this.f15865S;
        } else if (t == C5462l.f15282G) {
            C5499a<Typeface, Typeface> aVar7 = this.f15866T;
            if (aVar7 != null) {
                mo16806D(aVar7);
            }
            if (cVar == null) {
                this.f15866T = null;
                return;
            }
            C5520p pVar6 = new C5520p(cVar);
            this.f15866T = pVar6;
            pVar6.mo16606a(this);
            aVar = this.f15866T;
        } else {
            return;
        }
        mo16812j(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo16813u(Canvas canvas, Matrix matrix, int i) {
        canvas.save();
        if (!this.f15854H.mo16544o0()) {
            canvas.concat(matrix);
        }
        C5524b bVar = (C5524b) this.f15853G.mo16612h();
        C5526c cVar = this.f15855I.mo16461g().get(bVar.f15591b);
        if (cVar == null) {
            canvas.restore();
            return;
        }
        C5499a<Integer, Integer> aVar = this.f15857K;
        if (aVar == null && (aVar = this.f15856J) == null) {
            this.f15849C.setColor(bVar.f15597h);
        } else {
            this.f15849C.setColor(aVar.mo16612h().intValue());
        }
        C5499a<Integer, Integer> aVar2 = this.f15859M;
        if (aVar2 == null && (aVar2 = this.f15858L) == null) {
            this.f15850D.setColor(bVar.f15598i);
        } else {
            this.f15850D.setColor(aVar2.mo16612h().intValue());
        }
        int intValue = ((this.f15785v.mo16656h() == null ? 100 : this.f15785v.mo16656h().mo16612h().intValue()) * 255) / 100;
        this.f15849C.setAlpha(intValue);
        this.f15850D.setAlpha(intValue);
        C5499a<Float, Float> aVar3 = this.f15861O;
        if (aVar3 == null && (aVar3 = this.f15860N) == null) {
            this.f15850D.setStrokeWidth(bVar.f15599j * C5647h.m21070e() * C5647h.m21072g(matrix));
        } else {
            this.f15850D.setStrokeWidth(aVar3.mo16612h().floatValue());
        }
        if (this.f15854H.mo16544o0()) {
            m20847T(bVar, matrix, cVar, canvas);
        } else {
            m20848U(bVar, cVar, matrix, canvas);
        }
        canvas.restore();
    }
}
