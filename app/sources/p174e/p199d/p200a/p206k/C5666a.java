package p174e.p199d.p200a.p206k;

import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import p174e.p199d.p217b.C5715p;
import p174e.p199d.p218c.C5732e;
import p174e.p199d.p218c.p223e0.C5735c;
import p174e.p199d.p218c.p224j.C5742c;
import p174e.p199d.p218c.p228n.C5825i;
import p174e.p199d.p218c.p232q.C5860c;
import p174e.p199d.p218c.p234s.C5866c;
import p174e.p199d.p218c.p235t.C5870c;
import p174e.p199d.p218c.p236u.C5873c;
import p174e.p199d.p218c.p237v.C5880e;
import p174e.p199d.p218c.p237v.C5883h;
import p174e.p199d.p218c.p237v.C5885j;
import p174e.p199d.p218c.p237v.C5886k;
import p174e.p199d.p218c.p246z.C5982b;
import p174e.p199d.p218c.p246z.C5986f;

/* renamed from: e.d.a.k.a */
public class C5666a {

    /* renamed from: a */
    public static final Iterable<C5669d> f16031a = Arrays.asList(new C5669d[]{new C5886k(), new C5880e(), new C5870c(), new C5873c(), new C5825i(), new C5735c(), new C5860c(), new C5986f(), new C5982b(), new C5866c(), new C5742c(), new C5883h(), new C5885j()});

    /* renamed from: a */
    public static void m21097a(C5732e eVar, InputStream inputStream, Iterable<C5669d> iterable) {
        if (iterable == null) {
            iterable = f16031a;
        }
        HashSet hashSet = new HashSet();
        for (C5669d b : iterable) {
            for (C5671f add : b.mo16942b()) {
                hashSet.add(add);
            }
        }
        m21098b(eVar, iterable, C5670e.m21108a(new C5715p(inputStream), hashSet));
    }

    /* renamed from: b */
    public static void m21098b(C5732e eVar, Iterable<C5669d> iterable, C5668c cVar) {
        for (C5669d next : iterable) {
            for (C5671f next2 : next.mo16942b()) {
                next.mo16941a(cVar.mo16940e(next2), eVar, next2);
            }
        }
    }

    /* renamed from: c */
    public static C5732e m21099c(InputStream inputStream) {
        return m21100d(inputStream, (Iterable<C5669d>) null);
    }

    /* renamed from: d */
    public static C5732e m21100d(InputStream inputStream, Iterable<C5669d> iterable) {
        C5732e eVar = new C5732e();
        m21097a(eVar, inputStream, iterable);
        return eVar;
    }
}
