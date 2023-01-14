package com.google.firebase.components;

import com.google.firebase.p160n.C4907a;
import com.google.firebase.p160n.C4908b;
import java.util.Map;

/* renamed from: com.google.firebase.components.h */
public final /* synthetic */ class C4495h implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ Map.Entry f12802f;

    /* renamed from: o */
    public final /* synthetic */ C4907a f12803o;

    public /* synthetic */ C4495h(Map.Entry entry, C4907a aVar) {
        this.f12802f = entry;
        this.f12803o = aVar;
    }

    public final void run() {
        ((C4908b) this.f12802f.getKey()).mo14004a(this.f12803o);
    }
}
