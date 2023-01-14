package com.facebook.react.uimanager.p124n1;

import android.view.View;
import com.facebook.react.C2766g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.react.uimanager.n1.a */
public class C3026a {

    /* renamed from: a */
    private static final List<C3028b> f8412a = new ArrayList();

    /* renamed from: b */
    private static final Map<C3027a, Set<String>> f8413b = new HashMap();

    /* renamed from: com.facebook.react.uimanager.n1.a$a */
    public interface C3027a {
        /* renamed from: a */
        void mo9795a(View view, String str);
    }

    /* renamed from: com.facebook.react.uimanager.n1.a$b */
    public interface C3028b {
        /* renamed from: a */
        String mo9796a();

        /* renamed from: b */
        void mo9797b(View view);
    }

    /* renamed from: a */
    private static String m11960a(View view) {
        Object tag = view.getTag(C2766g.view_tag_native_id);
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }

    /* renamed from: b */
    public static void m11961b(View view) {
        String a = m11960a(view);
        if (a != null) {
            Iterator<C3028b> it = f8412a.iterator();
            while (it.hasNext()) {
                C3028b next = it.next();
                if (a.equals(next.mo9796a())) {
                    next.mo9797b(view);
                    it.remove();
                }
            }
            for (Map.Entry next2 : f8413b.entrySet()) {
                Set set = (Set) next2.getValue();
                if (set != null && set.contains(a)) {
                    ((C3027a) next2.getKey()).mo9795a(view, a);
                }
            }
        }
    }
}
