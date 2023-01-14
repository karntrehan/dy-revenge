package p493i;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import p455g.p460t.C10327b;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

/* renamed from: i.t */
public final class C10628t extends C10327b<C10616i> implements RandomAccess {

    /* renamed from: o */
    public static final C10629a f28070o = new C10629a((C10452g) null);

    /* renamed from: p */
    private final C10616i[] f28071p;

    /* renamed from: q */
    private final int[] f28072q;

    /* renamed from: i.t$a */
    public static final class C10629a {
        private C10629a() {
        }

        public /* synthetic */ C10629a(C10452g gVar) {
            this();
        }

        /* renamed from: a */
        private final void m36186a(long j, C10603f fVar, int i, List<? extends C10616i> list, int i2, int i3, List<Integer> list2) {
            int i4;
            int i5;
            int i6;
            int i7;
            C10603f fVar2;
            C10603f fVar3 = fVar;
            int i8 = i;
            List<? extends C10616i> list3 = list;
            int i9 = i2;
            int i10 = i3;
            List<Integer> list4 = list2;
            if (i9 < i10) {
                int i11 = i9;
                while (i11 < i10) {
                    if (((C10616i) list3.get(i11)).mo26420Y() >= i8) {
                        i11++;
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                C10616i iVar = (C10616i) list.get(i2);
                C10616i iVar2 = (C10616i) list3.get(i10 - 1);
                if (i8 == iVar.mo26420Y()) {
                    int intValue = list4.get(i9).intValue();
                    int i12 = i9 + 1;
                    i4 = i12;
                    i5 = intValue;
                    iVar = (C10616i) list3.get(i12);
                } else {
                    i4 = i9;
                    i5 = -1;
                }
                if (iVar.mo26411A(i8) != iVar2.mo26411A(i8)) {
                    int i13 = 1;
                    for (int i14 = i4 + 1; i14 < i10; i14++) {
                        if (((C10616i) list3.get(i14 - 1)).mo26411A(i8) != ((C10616i) list3.get(i14)).mo26411A(i8)) {
                            i13++;
                        }
                    }
                    long c = j + m36188c(fVar3) + ((long) 2) + ((long) (i13 * 2));
                    fVar3.writeInt(i13);
                    fVar3.writeInt(i5);
                    for (int i15 = i4; i15 < i10; i15++) {
                        byte A = ((C10616i) list3.get(i15)).mo26411A(i8);
                        if (i15 == i4 || A != ((C10616i) list3.get(i15 - 1)).mo26411A(i8)) {
                            fVar3.writeInt(A & 255);
                        }
                    }
                    C10603f fVar4 = new C10603f();
                    while (i4 < i10) {
                        byte A2 = ((C10616i) list3.get(i4)).mo26411A(i8);
                        int i16 = i4 + 1;
                        int i17 = i16;
                        while (true) {
                            if (i17 >= i10) {
                                i6 = i10;
                                break;
                            } else if (A2 != ((C10616i) list3.get(i17)).mo26411A(i8)) {
                                i6 = i17;
                                break;
                            } else {
                                i17++;
                            }
                        }
                        if (i16 == i6 && i8 + 1 == ((C10616i) list3.get(i4)).mo26420Y()) {
                            fVar3.writeInt(list4.get(i4).intValue());
                            i7 = i6;
                            fVar2 = fVar4;
                        } else {
                            fVar3.writeInt(((int) (c + m36188c(fVar4))) * -1);
                            i7 = i6;
                            fVar2 = fVar4;
                            m36186a(c, fVar4, i8 + 1, list, i4, i6, list2);
                        }
                        fVar4 = fVar2;
                        i4 = i7;
                    }
                    fVar3.mo26330Q(fVar4);
                    return;
                }
                int min = Math.min(iVar.mo26420Y(), iVar2.mo26420Y());
                int i18 = i8;
                int i19 = 0;
                while (i18 < min && iVar.mo26411A(i18) == iVar2.mo26411A(i18)) {
                    i19++;
                    i18++;
                }
                long c2 = j + m36188c(fVar3) + ((long) 2) + ((long) i19) + 1;
                fVar3.writeInt(-i19);
                fVar3.writeInt(i5);
                int i20 = i8 + i19;
                while (i8 < i20) {
                    fVar3.writeInt(iVar.mo26411A(i8) & 255);
                    i8++;
                }
                if (i4 + 1 == i10) {
                    if (i20 == ((C10616i) list3.get(i4)).mo26420Y()) {
                        fVar3.writeInt(list4.get(i4).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                C10603f fVar5 = new C10603f();
                fVar3.writeInt(((int) (m36188c(fVar5) + c2)) * -1);
                m36186a(c2, fVar5, i20, list, i4, i3, list2);
                fVar3.mo26330Q(fVar5);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: b */
        static /* synthetic */ void m36187b(C10629a aVar, long j, C10603f fVar, int i, List list, int i2, int i3, List list2, int i4, Object obj) {
            aVar.m36186a((i4 & 1) != 0 ? 0 : j, fVar, (i4 & 4) != 0 ? 0 : i, list, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? list.size() : i3, list2);
        }

        /* renamed from: c */
        private final long m36188c(C10603f fVar) {
            return fVar.size() / ((long) 4);
        }

        /* renamed from: d */
        public final C10628t mo26450d(C10616i... iVarArr) {
            C10616i[] iVarArr2 = iVarArr;
            C10457l.m35320e(iVarArr2, "byteStrings");
            int i = 0;
            if (iVarArr2.length == 0) {
                return new C10628t(new C10616i[0], new int[]{0, -1}, (C10452g) null);
            }
            List D = C10343h.m35082D(iVarArr);
            C10354p.m35148q(D);
            ArrayList arrayList = new ArrayList(iVarArr2.length);
            for (C10616i iVar : iVarArr2) {
                arrayList.add(-1);
            }
            Object[] array = arrayList.toArray(new Integer[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Integer[] numArr = (Integer[]) array;
            List k = C10350l.m35142k((Integer[]) Arrays.copyOf(numArr, numArr.length));
            int length = iVarArr2.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                k.set(C10350l.m35137f(D, iVarArr2[i2], 0, 0, 6, (Object) null), Integer.valueOf(i3));
                i2++;
                i3++;
            }
            if (((C10616i) D.get(0)).mo26420Y() > 0) {
                int i4 = 0;
                while (i4 < D.size()) {
                    C10616i iVar2 = (C10616i) D.get(i4);
                    int i5 = i4 + 1;
                    int i6 = i5;
                    while (i6 < D.size()) {
                        C10616i iVar3 = (C10616i) D.get(i6);
                        if (!iVar3.mo26421Z(iVar2)) {
                            continue;
                            break;
                        }
                        if (!(iVar3.mo26420Y() != iVar2.mo26420Y())) {
                            throw new IllegalArgumentException(("duplicate option: " + iVar3).toString());
                        } else if (((Number) k.get(i6)).intValue() > ((Number) k.get(i4)).intValue()) {
                            D.remove(i6);
                            k.remove(i6);
                        } else {
                            i6++;
                        }
                    }
                    i4 = i5;
                }
                C10603f fVar = new C10603f();
                m36187b(this, 0, fVar, 0, D, 0, 0, k, 53, (Object) null);
                int[] iArr = new int[((int) m36188c(fVar))];
                while (!fVar.mo26390x()) {
                    iArr[i] = fVar.readInt();
                    i++;
                }
                Object[] copyOf = Arrays.copyOf(iVarArr2, iVarArr2.length);
                C10457l.m35319d(copyOf, "java.util.Arrays.copyOf(this, size)");
                return new C10628t((C10616i[]) copyOf, iArr, (C10452g) null);
            }
            throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
        }
    }

    private C10628t(C10616i[] iVarArr, int[] iArr) {
        this.f28071p = iVarArr;
        this.f28072q = iArr;
    }

    public /* synthetic */ C10628t(C10616i[] iVarArr, int[] iArr, C10452g gVar) {
        this(iVarArr, iArr);
    }

    /* renamed from: r */
    public static final C10628t m36178r(C10616i... iVarArr) {
        return f28070o.mo26450d(iVarArr);
    }

    /* renamed from: b */
    public int mo25624b() {
        return this.f28071p.length;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C10616i) {
            return mo26444g((C10616i) obj);
        }
        return false;
    }

    /* renamed from: g */
    public /* bridge */ boolean mo26444g(C10616i iVar) {
        return super.contains(iVar);
    }

    /* renamed from: h */
    public C10616i get(int i) {
        return this.f28071p[i];
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C10616i) {
            return mo26448o((C10616i) obj);
        }
        return -1;
    }

    /* renamed from: j */
    public final C10616i[] mo26446j() {
        return this.f28071p;
    }

    /* renamed from: k */
    public final int[] mo26447k() {
        return this.f28072q;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C10616i) {
            return mo26449p((C10616i) obj);
        }
        return -1;
    }

    /* renamed from: o */
    public /* bridge */ int mo26448o(C10616i iVar) {
        return super.indexOf(iVar);
    }

    /* renamed from: p */
    public /* bridge */ int mo26449p(C10616i iVar) {
        return super.lastIndexOf(iVar);
    }
}
