package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.C9911d;
import com.swmansion.reanimated.C9920g;
import java.util.Stack;

/* renamed from: com.swmansion.reanimated.nodes.p */
public class C10003p extends C10013u {

    /* renamed from: b */
    private final Stack<Integer> f26704b = new Stack<>();

    /* renamed from: c */
    private String f26705c;

    public C10003p(int i, ReadableMap readableMap, C9911d dVar) {
        super(i, readableMap, dVar);
    }

    /* renamed from: b */
    public void mo24870b(Object obj) {
        C9965m r = this.mNodesManager.mo24809r(this.f26704b.peek().intValue(), C9965m.class);
        C9920g gVar = this.mUpdateContext;
        String str = gVar.f26542b;
        gVar.f26542b = this.f26705c;
        ((C10013u) r).mo24870b(obj);
        this.mUpdateContext.f26542b = str;
        forceUpdateMemoizedValue(obj);
    }

    /* renamed from: c */
    public void mo24875c(Integer num, String str) {
        this.f26705c = str;
        this.f26704b.push(num);
    }

    /* renamed from: d */
    public void mo24876d() {
        this.f26704b.pop();
    }

    /* renamed from: e */
    public boolean mo24877e() {
        C9965m r = this.mNodesManager.mo24809r(this.f26704b.peek().intValue(), C9965m.class);
        return r instanceof C10003p ? ((C10003p) r).mo24877e() : ((C9954e) r).f26659a;
    }

    /* access modifiers changed from: protected */
    public Object evaluate() {
        C9920g gVar = this.mUpdateContext;
        String str = gVar.f26542b;
        gVar.f26542b = this.f26705c;
        Object value = this.mNodesManager.mo24809r(this.f26704b.peek().intValue(), C9965m.class).value();
        this.mUpdateContext.f26542b = str;
        return value;
    }

    /* renamed from: f */
    public void mo24878f() {
        C9965m r = this.mNodesManager.mo24809r(this.f26704b.peek().intValue(), C9965m.class);
        if (r instanceof C10003p) {
            ((C10003p) r).mo24878f();
        } else {
            ((C9954e) r).mo24858b();
        }
    }

    /* renamed from: g */
    public void mo24879g() {
        C9965m r = this.mNodesManager.mo24809r(this.f26704b.peek().intValue(), C9965m.class);
        if (r instanceof C10003p) {
            ((C10003p) r).mo24879g();
        } else {
            ((C9954e) r).mo24859c();
        }
    }
}
