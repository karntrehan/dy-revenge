package p174e.p319f.p320a.p335c.p345f.p352g;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p174e.p319f.p320a.p335c.p345f.p352g.C6818h7;
import p174e.p319f.p320a.p335c.p345f.p352g.C6834i7;

/* renamed from: e.f.a.c.f.g.i7 */
public abstract class C6834i7<MessageType extends C6834i7<MessageType, BuilderType>, BuilderType extends C6818h7<MessageType, BuilderType>> implements C6805ga {
    protected int zzb = 0;

    /* renamed from: b */
    protected static void m25867b(Iterable iterable, List list) {
        C6820h9.m25836e(iterable);
        if (iterable instanceof C6916n9) {
            List d = ((C6916n9) iterable).mo19954d();
            C6916n9 n9Var = (C6916n9) list;
            int size = list.size();
            for (Object next : d) {
                if (next == null) {
                    int size2 = n9Var.size();
                    String str = "Element at index " + (size2 - size) + " is null.";
                    int size3 = n9Var.size();
                    while (true) {
                        size3--;
                        if (size3 >= size) {
                            n9Var.remove(size3);
                        } else {
                            throw new NullPointerException(str);
                        }
                    }
                } else if (next instanceof C7106z7) {
                    n9Var.mo19960t((C7106z7) next);
                } else {
                    n9Var.add((String) next);
                }
            }
        } else if (!(iterable instanceof C6917na)) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size4 = list.size();
            for (Object next2 : iterable) {
                if (next2 == null) {
                    int size5 = list.size();
                    String str2 = "Element at index " + (size5 - size4) + " is null.";
                    int size6 = list.size();
                    while (true) {
                        size6--;
                        if (size6 >= size4) {
                            list.remove(size6);
                        } else {
                            throw new NullPointerException(str2);
                        }
                    }
                } else {
                    list.add(next2);
                }
            }
        } else {
            list.addAll((Collection) iterable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo19515a() {
        throw null;
    }

    /* renamed from: c */
    public final C7106z7 mo19803c() {
        try {
            int g = mo19520g();
            C7106z7 z7Var = C7106z7.f19078f;
            byte[] bArr = new byte[g];
            C6819h8 c = C6819h8.m25808c(bArr);
            mo19522i(c);
            c.mo19828d();
            return new C7058w7(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo19523j(int i) {
        throw null;
    }

    /* renamed from: k */
    public final byte[] mo19840k() {
        try {
            byte[] bArr = new byte[mo19520g()];
            C6819h8 c = C6819h8.m25808c(bArr);
            mo19522i(c);
            c.mo19828d();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
