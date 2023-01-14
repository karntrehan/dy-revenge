package p174e.p319f.p393c.p394a.p404z.p405a;

import p174e.p319f.p393c.p394a.p404z.p405a.C9537s0;

/* renamed from: e.f.c.a.z.a.b */
public abstract class C9430b<MessageType extends C9537s0> implements C9429a1<MessageType> {

    /* renamed from: a */
    private static final C9526q f25304a = C9526q.m32218b();

    /* renamed from: c */
    private MessageType m31417c(MessageType messagetype) {
        if (messagetype == null || messagetype.mo24006l()) {
            return messagetype;
        }
        throw m31418d(messagetype).mo23897a().mo23518i(messagetype);
    }

    /* renamed from: d */
    private C9519n1 m31418d(MessageType messagetype) {
        return messagetype instanceof C9426a ? ((C9426a) messagetype).mo23480n() : new C9519n1(messagetype);
    }

    /* renamed from: e */
    public MessageType mo23506a(C9468i iVar, C9526q qVar) {
        return m31417c(mo23509f(iVar, qVar));
    }

    /* renamed from: f */
    public MessageType mo23509f(C9468i iVar, C9526q qVar) {
        MessageType messagetype;
        try {
            C9485j C = iVar.mo23640C();
            messagetype = (C9537s0) mo23507b(C, qVar);
            C.mo23677a(0);
            return messagetype;
        } catch (C9443c0 e) {
            throw e.mo23518i(messagetype);
        } catch (C9443c0 e2) {
            throw e2;
        }
    }
}
