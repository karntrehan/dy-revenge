package org.pgsqlite;

import com.facebook.react.C2906s;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: org.pgsqlite.c */
public class C10911c implements C2906s {
    /* renamed from: a */
    public List<ViewManager> mo7573a(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    /* renamed from: d */
    public List<NativeModule> mo7574d(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SQLitePlugin(reactApplicationContext));
        return arrayList;
    }
}
