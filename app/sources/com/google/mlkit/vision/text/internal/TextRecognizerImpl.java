package com.google.mlkit.vision.text.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.util.concurrent.Executor;
import p174e.p319f.p320a.p335c.p345f.p358m.C8595a8;
import p174e.p319f.p320a.p335c.p345f.p358m.C8621c8;
import p174e.p319f.p320a.p335c.p345f.p358m.C8675ga;
import p174e.p319f.p320a.p335c.p345f.p358m.C8714ja;
import p174e.p319f.p320a.p335c.p345f.p358m.C8726k9;
import p174e.p319f.p320a.p335c.p362h.C8963l;
import p174e.p319f.p406d.p411b.p413b.C9631a;
import p174e.p319f.p406d.p411b.p415d.C9641a;
import p174e.p319f.p406d.p411b.p415d.C9647c;

public class TextRecognizerImpl extends MobileVisionBase<C9641a> implements C9647c {
    TextRecognizerImpl(C5000o oVar, Executor executor, C8675ga gaVar, boolean z) {
        super(oVar, executor);
        C8621c8 c8Var = new C8621c8();
        c8Var.mo22332e(Boolean.valueOf(z));
        c8Var.mo22333f(new C8726k9().mo22507e());
        gaVar.mo22423c(C8714ja.m29533e(c8Var, 1), C8595a8.ON_DEVICE_TEXT_CREATE);
    }

    /* renamed from: f */
    public final C8963l<C9641a> mo15000f(@RecentlyNonNull C9631a aVar) {
        return super.mo14971a(aVar);
    }
}
