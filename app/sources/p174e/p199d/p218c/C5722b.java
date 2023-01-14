package p174e.p199d.p218c;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p174e.p199d.p217b.C5712m;

/* renamed from: e.d.c.b */
public abstract class C5722b {

    /* renamed from: a */
    protected final Map<Integer, Object> f16186a = new HashMap();

    /* renamed from: b */
    protected final Collection<C5738h> f16187b = new ArrayList();

    /* renamed from: c */
    private final Collection<String> f16188c = new ArrayList(4);

    /* renamed from: d */
    protected C5739i f16189d;

    /* renamed from: e */
    private C5722b f16190e;

    protected C5722b() {
    }

    /* renamed from: A */
    public boolean mo17116A() {
        return this.f16188c.isEmpty() && this.f16187b.isEmpty();
    }

    /* renamed from: B */
    public void mo17117B(int i, boolean z) {
        mo17128M(i, Boolean.valueOf(z));
    }

    /* renamed from: C */
    public void mo17118C(int i, byte[] bArr) {
        mo17129N(i, bArr);
    }

    /* renamed from: D */
    public void mo17119D(int i, Date date) {
        mo17128M(i, date);
    }

    /* renamed from: E */
    public void mo17120E(C5739i iVar) {
        Objects.requireNonNull(iVar, "cannot set a null descriptor");
        this.f16189d = iVar;
    }

    /* renamed from: F */
    public void mo17121F(int i, double d) {
        mo17128M(i, Double.valueOf(d));
    }

    /* renamed from: G */
    public void mo17122G(int i, double[] dArr) {
        mo17129N(i, dArr);
    }

    /* renamed from: H */
    public void mo17123H(int i, float f) {
        mo17128M(i, Float.valueOf(f));
    }

    /* renamed from: I */
    public void mo17124I(int i, float[] fArr) {
        mo17129N(i, fArr);
    }

    /* renamed from: J */
    public void mo17125J(int i, int i2) {
        mo17128M(i, Integer.valueOf(i2));
    }

    /* renamed from: K */
    public void mo17126K(int i, int[] iArr) {
        mo17129N(i, iArr);
    }

    /* renamed from: L */
    public void mo17127L(int i, long j) {
        mo17128M(i, Long.valueOf(j));
    }

    /* renamed from: M */
    public void mo17128M(int i, Object obj) {
        Objects.requireNonNull(obj, "cannot set a null object");
        if (!this.f16186a.containsKey(Integer.valueOf(i))) {
            this.f16187b.add(new C5738h(i, this));
        }
        this.f16186a.put(Integer.valueOf(i), obj);
    }

    /* renamed from: N */
    public void mo17129N(int i, Object obj) {
        mo17128M(i, obj);
    }

    /* renamed from: O */
    public void mo17130O(C5722b bVar) {
        this.f16190e = bVar;
    }

    /* renamed from: P */
    public void mo17131P(int i, C5712m mVar) {
        mo17128M(i, mVar);
    }

    /* renamed from: Q */
    public void mo17132Q(int i, C5712m[] mVarArr) {
        mo17129N(i, mVarArr);
    }

    /* renamed from: R */
    public void mo17133R(int i, String str) {
        Objects.requireNonNull(str, "cannot set a null String");
        mo17128M(i, str);
    }

    /* renamed from: S */
    public void mo17134S(int i, String[] strArr) {
        mo17129N(i, strArr);
    }

    /* renamed from: T */
    public void mo17135T(int i, C5737g gVar) {
        Objects.requireNonNull(gVar, "cannot set a null StringValue");
        mo17128M(i, gVar);
    }

    /* renamed from: U */
    public void mo17136U(int i, C5737g[] gVarArr) {
        mo17129N(i, gVarArr);
    }

    /* renamed from: a */
    public void mo17137a(String str) {
        this.f16188c.add(str);
    }

    /* renamed from: b */
    public boolean mo17138b(int i) {
        return this.f16186a.containsKey(Integer.valueOf(i));
    }

    /* renamed from: c */
    public boolean mo17139c(int i) {
        Boolean d = mo17140d(i);
        if (d != null) {
            return d.booleanValue();
        }
        Object o = mo17150o(i);
        if (o == null) {
            throw new C5736f("Tag '" + mo17158v(i) + "' has not been set -- check using containsTag() first");
        }
        throw new C5736f("Tag '" + i + "' cannot be converted to a boolean.  It is of type '" + o.getClass() + "'.");
    }

    /* renamed from: d */
    public Boolean mo17140d(int i) {
        Object o = mo17150o(i);
        if (o == null) {
            return null;
        }
        if (o instanceof Boolean) {
            return (Boolean) o;
        }
        if ((o instanceof String) || (o instanceof C5737g)) {
            try {
                return Boolean.valueOf(Boolean.getBoolean(o.toString()));
            } catch (NumberFormatException unused) {
                return null;
            }
        } else if (!(o instanceof Number)) {
            return null;
        } else {
            return Boolean.valueOf(((Number) o).doubleValue() != 0.0d);
        }
    }

    /* renamed from: e */
    public byte[] mo17141e(int i) {
        Object o = mo17150o(i);
        if (o == null) {
            return null;
        }
        if (o instanceof C5737g) {
            return ((C5737g) o).mo17179a();
        }
        int i2 = 0;
        if (o instanceof C5712m[]) {
            C5712m[] mVarArr = (C5712m[]) o;
            int length = mVarArr.length;
            byte[] bArr = new byte[length];
            while (i2 < length) {
                bArr[i2] = mVarArr[i2].byteValue();
                i2++;
            }
            return bArr;
        } else if (o instanceof byte[]) {
            return (byte[]) o;
        } else {
            if (o instanceof int[]) {
                int[] iArr = (int[]) o;
                byte[] bArr2 = new byte[iArr.length];
                while (i2 < iArr.length) {
                    bArr2[i2] = (byte) iArr[i2];
                    i2++;
                }
                return bArr2;
            } else if (o instanceof short[]) {
                short[] sArr = (short[]) o;
                byte[] bArr3 = new byte[sArr.length];
                while (i2 < sArr.length) {
                    bArr3[i2] = (byte) sArr[i2];
                    i2++;
                }
                return bArr3;
            } else if (o instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) o;
                byte[] bArr4 = new byte[charSequence.length()];
                while (i2 < charSequence.length()) {
                    bArr4[i2] = (byte) charSequence.charAt(i2);
                    i2++;
                }
                return bArr4;
            } else if (!(o instanceof Integer)) {
                return null;
            } else {
                return new byte[]{((Integer) o).byteValue()};
            }
        }
    }

    /* renamed from: f */
    public String mo17142f(int i) {
        return this.f16189d.mo17110f(i);
    }

    /* renamed from: g */
    public double mo17143g(int i) {
        Double h = mo17144h(i);
        if (h != null) {
            return h.doubleValue();
        }
        Object o = mo17150o(i);
        if (o == null) {
            throw new C5736f("Tag '" + mo17158v(i) + "' has not been set -- check using containsTag() first");
        }
        throw new C5736f("Tag '" + i + "' cannot be converted to a double.  It is of type '" + o.getClass() + "'.");
    }

    /* renamed from: h */
    public Double mo17144h(int i) {
        Object o = mo17150o(i);
        if (o == null) {
            return null;
        }
        if ((o instanceof String) || (o instanceof C5737g)) {
            try {
                return Double.valueOf(Double.parseDouble(o.toString()));
            } catch (NumberFormatException unused) {
                return null;
            }
        } else if (o instanceof Number) {
            return Double.valueOf(((Number) o).doubleValue());
        } else {
            return null;
        }
    }

    /* renamed from: i */
    public Float mo17145i(int i) {
        Object o = mo17150o(i);
        if (o == null) {
            return null;
        }
        if ((o instanceof String) || (o instanceof C5737g)) {
            try {
                return Float.valueOf(Float.parseFloat(o.toString()));
            } catch (NumberFormatException unused) {
                return null;
            }
        } else if (o instanceof Number) {
            return Float.valueOf(((Number) o).floatValue());
        } else {
            return null;
        }
    }

    /* renamed from: j */
    public int mo17146j(int i) {
        Integer l = mo17148l(i);
        if (l != null) {
            return l.intValue();
        }
        Object o = mo17150o(i);
        if (o == null) {
            throw new C5736f("Tag '" + mo17158v(i) + "' has not been set -- check using containsTag() first");
        }
        throw new C5736f("Tag '" + i + "' cannot be converted to int.  It is of type '" + o.getClass() + "'.");
    }

    /* renamed from: k */
    public int[] mo17147k(int i) {
        Object o = mo17150o(i);
        if (o == null) {
            return null;
        }
        if (o instanceof int[]) {
            return (int[]) o;
        }
        int i2 = 0;
        if (o instanceof C5712m[]) {
            C5712m[] mVarArr = (C5712m[]) o;
            int length = mVarArr.length;
            int[] iArr = new int[length];
            while (i2 < length) {
                iArr[i2] = mVarArr[i2].intValue();
                i2++;
            }
            return iArr;
        } else if (o instanceof short[]) {
            short[] sArr = (short[]) o;
            int[] iArr2 = new int[sArr.length];
            while (i2 < sArr.length) {
                iArr2[i2] = sArr[i2];
                i2++;
            }
            return iArr2;
        } else if (o instanceof byte[]) {
            byte[] bArr = (byte[]) o;
            int[] iArr3 = new int[bArr.length];
            while (i2 < bArr.length) {
                iArr3[i2] = bArr[i2];
                i2++;
            }
            return iArr3;
        } else if (o instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) o;
            int[] iArr4 = new int[charSequence.length()];
            while (i2 < charSequence.length()) {
                iArr4[i2] = charSequence.charAt(i2);
                i2++;
            }
            return iArr4;
        } else if (!(o instanceof Integer)) {
            return null;
        } else {
            return new int[]{((Integer) o).intValue()};
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [short, byte], vars: [r7v4 ?, r7v15 ?, r7v7 ?, r7v9 ?, r7v11 ?, r7v14 ?, r7v18 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    /* renamed from: l */
    public java.lang.Integer mo17148l(int r7) {
        /*
            r6 = this;
            java.lang.Object r7 = r6.mo17150o(r7)
            r0 = 0
            if (r7 != 0) goto L_0x0008
            return r0
        L_0x0008:
            boolean r1 = r7 instanceof java.lang.Number
            if (r1 == 0) goto L_0x0017
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
        L_0x0012:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            return r7
        L_0x0017:
            boolean r1 = r7 instanceof java.lang.String
            r2 = 0
            if (r1 != 0) goto L_0x0057
            boolean r1 = r7 instanceof p174e.p199d.p218c.C5737g
            if (r1 == 0) goto L_0x0021
            goto L_0x0057
        L_0x0021:
            boolean r1 = r7 instanceof p174e.p199d.p217b.C5712m[]
            r3 = 1
            if (r1 == 0) goto L_0x0032
            e.d.b.m[] r7 = (p174e.p199d.p217b.C5712m[]) r7
            int r1 = r7.length
            if (r1 != r3) goto L_0x0056
            r7 = r7[r2]
            int r7 = r7.intValue()
            goto L_0x0012
        L_0x0032:
            boolean r1 = r7 instanceof byte[]
            if (r1 == 0) goto L_0x003e
            byte[] r7 = (byte[]) r7
            int r1 = r7.length
            if (r1 != r3) goto L_0x0056
            byte r7 = r7[r2]
            goto L_0x0012
        L_0x003e:
            boolean r1 = r7 instanceof int[]
            if (r1 == 0) goto L_0x004a
            int[] r7 = (int[]) r7
            int r1 = r7.length
            if (r1 != r3) goto L_0x0056
            r7 = r7[r2]
            goto L_0x0012
        L_0x004a:
            boolean r1 = r7 instanceof short[]
            if (r1 == 0) goto L_0x0056
            short[] r7 = (short[]) r7
            int r1 = r7.length
            if (r1 != r3) goto L_0x0056
            short r7 = r7[r2]
            goto L_0x0012
        L_0x0056:
            return r0
        L_0x0057:
            java.lang.String r0 = r7.toString()     // Catch:{ NumberFormatException -> 0x0064 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0064 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0064 }
            return r7
        L_0x0064:
            java.lang.String r7 = r7.toString()
            byte[] r7 = r7.getBytes()
            r0 = 0
            int r3 = r7.length
        L_0x006f:
            if (r2 >= r3) goto L_0x007d
            byte r4 = r7[r2]
            r5 = 8
            long r0 = r0 << r5
            r4 = r4 & 255(0xff, float:3.57E-43)
            long r4 = (long) r4
            long r0 = r0 + r4
            int r2 = r2 + 1
            goto L_0x006f
        L_0x007d:
            int r7 = (int) r0
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p199d.p218c.C5722b.mo17148l(int):java.lang.Integer");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [short, byte], vars: [r5v5 ?, r5v8 ?, r5v7 ?, r5v10 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    /* renamed from: m */
    public java.lang.Long mo17149m(int r5) {
        /*
            r4 = this;
            java.lang.Object r5 = r4.mo17150o(r5)
            r0 = 0
            if (r5 != 0) goto L_0x0008
            return r0
        L_0x0008:
            boolean r1 = r5 instanceof java.lang.Number
            if (r1 == 0) goto L_0x0017
            java.lang.Number r5 = (java.lang.Number) r5
            long r0 = r5.longValue()
        L_0x0012:
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            return r5
        L_0x0017:
            boolean r1 = r5 instanceof java.lang.String
            if (r1 != 0) goto L_0x0058
            boolean r1 = r5 instanceof p174e.p199d.p218c.C5737g
            if (r1 == 0) goto L_0x0020
            goto L_0x0058
        L_0x0020:
            boolean r1 = r5 instanceof p174e.p199d.p217b.C5712m[]
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0032
            e.d.b.m[] r5 = (p174e.p199d.p217b.C5712m[]) r5
            int r1 = r5.length
            if (r1 != r3) goto L_0x0057
            r5 = r5[r2]
            long r0 = r5.longValue()
            goto L_0x0012
        L_0x0032:
            boolean r1 = r5 instanceof byte[]
            if (r1 == 0) goto L_0x003f
            byte[] r5 = (byte[]) r5
            int r1 = r5.length
            if (r1 != r3) goto L_0x0057
            byte r5 = r5[r2]
        L_0x003d:
            long r0 = (long) r5
            goto L_0x0012
        L_0x003f:
            boolean r1 = r5 instanceof int[]
            if (r1 == 0) goto L_0x004b
            int[] r5 = (int[]) r5
            int r1 = r5.length
            if (r1 != r3) goto L_0x0057
            r5 = r5[r2]
            goto L_0x003d
        L_0x004b:
            boolean r1 = r5 instanceof short[]
            if (r1 == 0) goto L_0x0057
            short[] r5 = (short[]) r5
            int r1 = r5.length
            if (r1 != r3) goto L_0x0057
            short r5 = r5[r2]
            goto L_0x003d
        L_0x0057:
            return r0
        L_0x0058:
            java.lang.String r5 = r5.toString()     // Catch:{ NumberFormatException -> 0x0065 }
            long r1 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x0065 }
            java.lang.Long r5 = java.lang.Long.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0065 }
            return r5
        L_0x0065:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p199d.p218c.C5722b.mo17149m(int):java.lang.Long");
    }

    /* renamed from: n */
    public abstract String mo17104n();

    /* renamed from: o */
    public Object mo17150o(int i) {
        return this.f16186a.get(Integer.valueOf(i));
    }

    /* renamed from: p */
    public C5712m mo17151p(int i) {
        Object o = mo17150o(i);
        if (o == null) {
            return null;
        }
        if (o instanceof C5712m) {
            return (C5712m) o;
        }
        if (o instanceof Integer) {
            return new C5712m((long) ((Integer) o).intValue(), 1);
        }
        if (o instanceof Long) {
            return new C5712m(((Long) o).longValue(), 1);
        }
        return null;
    }

    /* renamed from: q */
    public C5712m[] mo17152q(int i) {
        Object o = mo17150o(i);
        if (o != null && (o instanceof C5712m[])) {
            return (C5712m[]) o;
        }
        return null;
    }

    /* renamed from: r */
    public String mo17153r(int i) {
        Object o = mo17150o(i);
        if (o == null) {
            return null;
        }
        if (o instanceof C5712m) {
            return ((C5712m) o).mo17064K(true);
        }
        if (!o.getClass().isArray()) {
            return o instanceof Double ? new DecimalFormat("0.###").format(((Double) o).doubleValue()) : o instanceof Float ? new DecimalFormat("0.###").format((double) ((Float) o).floatValue()) : o.toString();
        }
        int length = Array.getLength(o);
        Class<?> componentType = o.getClass().getComponentType();
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        if (Object.class.isAssignableFrom(componentType)) {
            while (i2 < length) {
                if (i2 != 0) {
                    sb.append(' ');
                }
                sb.append(Array.get(o, i2).toString());
                i2++;
            }
        } else if (componentType.getName().equals("int")) {
            while (i2 < length) {
                if (i2 != 0) {
                    sb.append(' ');
                }
                sb.append(Array.getInt(o, i2));
                i2++;
            }
        } else if (componentType.getName().equals("short")) {
            while (i2 < length) {
                if (i2 != 0) {
                    sb.append(' ');
                }
                sb.append(Array.getShort(o, i2));
                i2++;
            }
        } else if (componentType.getName().equals("long")) {
            while (i2 < length) {
                if (i2 != 0) {
                    sb.append(' ');
                }
                sb.append(Array.getLong(o, i2));
                i2++;
            }
        } else if (componentType.getName().equals("float")) {
            DecimalFormat decimalFormat = new DecimalFormat("0.###");
            while (i2 < length) {
                if (i2 != 0) {
                    sb.append(' ');
                }
                String format = decimalFormat.format((double) Array.getFloat(o, i2));
                if (format.equals("-0")) {
                    format = "0";
                }
                sb.append(format);
                i2++;
            }
        } else if (componentType.getName().equals("double")) {
            DecimalFormat decimalFormat2 = new DecimalFormat("0.###");
            while (i2 < length) {
                if (i2 != 0) {
                    sb.append(' ');
                }
                String format2 = decimalFormat2.format(Array.getDouble(o, i2));
                if (format2.equals("-0")) {
                    format2 = "0";
                }
                sb.append(format2);
                i2++;
            }
        } else if (componentType.getName().equals("byte")) {
            while (i2 < length) {
                if (i2 != 0) {
                    sb.append(' ');
                }
                sb.append(Array.getByte(o, i2) & 255);
                i2++;
            }
        } else {
            mo17137a("Unexpected array component type: " + componentType.getName());
        }
        return sb.toString();
    }

    /* renamed from: s */
    public String[] mo17154s(int i) {
        Object o = mo17150o(i);
        if (o == null) {
            return null;
        }
        if (o instanceof String[]) {
            return (String[]) o;
        }
        int i2 = 0;
        if (o instanceof String) {
            return new String[]{(String) o};
        } else if (o instanceof C5737g) {
            return new String[]{o.toString()};
        } else if (o instanceof C5737g[]) {
            C5737g[] gVarArr = (C5737g[]) o;
            int length = gVarArr.length;
            String[] strArr = new String[length];
            while (i2 < length) {
                strArr[i2] = gVarArr[i2].toString();
                i2++;
            }
            return strArr;
        } else if (o instanceof int[]) {
            int[] iArr = (int[]) o;
            int length2 = iArr.length;
            String[] strArr2 = new String[length2];
            while (i2 < length2) {
                strArr2[i2] = Integer.toString(iArr[i2]);
                i2++;
            }
            return strArr2;
        } else if (o instanceof byte[]) {
            byte[] bArr = (byte[]) o;
            int length3 = bArr.length;
            String[] strArr3 = new String[length3];
            while (i2 < length3) {
                strArr3[i2] = Byte.toString(bArr[i2]);
                i2++;
            }
            return strArr3;
        } else if (!(o instanceof C5712m[])) {
            return null;
        } else {
            C5712m[] mVarArr = (C5712m[]) o;
            int length4 = mVarArr.length;
            String[] strArr4 = new String[length4];
            for (int i3 = 0; i3 < length4; i3++) {
                strArr4[i3] = mVarArr[i3].mo17064K(false);
            }
            return strArr4;
        }
    }

    /* renamed from: t */
    public C5737g mo17155t(int i) {
        Object o = mo17150o(i);
        if (o instanceof C5737g) {
            return (C5737g) o;
        }
        return null;
    }

    public String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = mo17104n();
        objArr[1] = Integer.valueOf(this.f16186a.size());
        objArr[2] = this.f16186a.size() == 1 ? "tag" : "tags";
        return String.format("%s Directory (%d %s)", objArr);
    }

    /* renamed from: u */
    public C5737g[] mo17157u(int i) {
        Object o = mo17150o(i);
        if (o == null) {
            return null;
        }
        if (o instanceof C5737g[]) {
            return (C5737g[]) o;
        }
        if (!(o instanceof C5737g)) {
            return null;
        }
        return new C5737g[]{(C5737g) o};
    }

    /* renamed from: v */
    public String mo17158v(int i) {
        HashMap<Integer, String> w = mo17105w();
        if (w.containsKey(Integer.valueOf(i))) {
            return w.get(Integer.valueOf(i));
        }
        String hexString = Integer.toHexString(i);
        while (hexString.length() < 4) {
            hexString = "0" + hexString;
        }
        return "Unknown tag (0x" + hexString + ")";
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract HashMap<Integer, String> mo17105w();

    /* renamed from: x */
    public Collection<C5738h> mo17159x() {
        return Collections.unmodifiableCollection(this.f16187b);
    }

    /* renamed from: y */
    public boolean mo17160y() {
        return this.f16188c.size() > 0;
    }

    /* renamed from: z */
    public boolean mo17161z(int i) {
        return mo17105w().containsKey(Integer.valueOf(i));
    }
}
