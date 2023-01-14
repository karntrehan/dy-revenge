package com.swmansion.gesturehandler.react;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.C2919a0;
import com.facebook.react.uimanager.C3040s;
import com.facebook.react.views.view.C3245g;
import p174e.p446g.p448b.C10221s;
import p174e.p446g.p448b.C10234z;
import p455g.C10313k;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.swmansion.gesturehandler.react.m */
public final class C9890m implements C10234z {

    /* renamed from: com.swmansion.gesturehandler.react.m$a */
    public /* synthetic */ class C9891a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26452a;

        static {
            int[] iArr = new int[C3040s.values().length];
            iArr[C3040s.BOX_ONLY.ordinal()] = 1;
            iArr[C3040s.BOX_NONE.ordinal()] = 2;
            iArr[C3040s.NONE.ordinal()] = 3;
            iArr[C3040s.AUTO.ordinal()] = 4;
            f26452a = iArr;
        }
    }

    /* renamed from: a */
    public C10221s mo24750a(View view) {
        C3040s sVar;
        C10457l.m35320e(view, "view");
        if (view instanceof C2919a0) {
            sVar = ((C2919a0) view).getPointerEvents();
            C10457l.m35319d(sVar, "{\n        (view as ReactPointerEventsView).pointerEvents\n      }");
        } else {
            sVar = C3040s.AUTO;
        }
        if (!view.isEnabled()) {
            if (sVar == C3040s.AUTO) {
                return C10221s.BOX_NONE;
            }
            if (sVar == C3040s.BOX_ONLY) {
                return C10221s.NONE;
            }
        }
        int i = C9891a.f26452a[sVar.ordinal()];
        if (i == 1) {
            return C10221s.BOX_ONLY;
        }
        if (i == 2) {
            return C10221s.BOX_NONE;
        }
        if (i == 3) {
            return C10221s.NONE;
        }
        if (i == 4) {
            return C10221s.AUTO;
        }
        throw new C10313k();
    }

    /* renamed from: b */
    public boolean mo24751b(ViewGroup viewGroup) {
        C10457l.m35320e(viewGroup, "view");
        if (viewGroup.getClipChildren()) {
            return true;
        }
        if (viewGroup instanceof C3245g) {
            return C10457l.m35316a("hidden", ((C3245g) viewGroup).getOverflow());
        }
        return false;
    }

    /* renamed from: c */
    public View mo24752c(ViewGroup viewGroup, int i) {
        String str;
        View view;
        C10457l.m35320e(viewGroup, "parent");
        if (viewGroup instanceof C3245g) {
            view = viewGroup.getChildAt(((C3245g) viewGroup).mo9685a(i));
            str = "{\n      parent.getChildAt(parent.getZIndexMappedChildIndex(index))\n    }";
        } else {
            view = viewGroup.getChildAt(i);
            str = "parent.getChildAt(index)";
        }
        C10457l.m35319d(view, str);
        return view;
    }
}
