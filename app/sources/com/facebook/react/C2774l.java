package com.facebook.react;

import android.view.KeyEvent;
import android.view.View;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.C2693e;
import java.util.Map;

/* renamed from: com.facebook.react.l */
public class C2774l {

    /* renamed from: a */
    private static final Map<Integer, String> f7849a = C2693e.m10911a().mo8815b(23, "select").mo8815b(66, "select").mo8815b(62, "select").mo8815b(85, "playPause").mo8815b(89, "rewind").mo8815b(90, "fastForward").mo8815b(86, "stop").mo8815b(87, "next").mo8815b(88, "previous").mo8815b(19, "up").mo8815b(22, "right").mo8815b(20, "down").mo8815b(21, "left").mo8815b(165, "info").mo8815b(82, "menu").mo8814a();

    /* renamed from: b */
    private int f7850b = -1;

    /* renamed from: c */
    private final C3249w f7851c;

    C2774l(C3249w wVar) {
        this.f7851c = wVar;
    }

    /* renamed from: b */
    private void m11112b(String str, int i) {
        m11113c(str, i, -1);
    }

    /* renamed from: c */
    private void m11113c(String str, int i, int i2) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("eventType", str);
        writableNativeMap.putInt("eventKeyAction", i2);
        if (i != -1) {
            writableNativeMap.putInt("tag", i);
        }
        this.f7851c.mo10692n("onHWKeyEvent", writableNativeMap);
    }

    /* renamed from: a */
    public void mo9078a() {
        int i = this.f7850b;
        if (i != -1) {
            m11112b("blur", i);
        }
        this.f7850b = -1;
    }

    /* renamed from: d */
    public void mo9079d(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        int action = keyEvent.getAction();
        if (action == 1 || action == 0) {
            Map<Integer, String> map = f7849a;
            if (map.containsKey(Integer.valueOf(keyCode))) {
                m11113c(map.get(Integer.valueOf(keyCode)), this.f7850b, action);
            }
        }
    }

    /* renamed from: e */
    public void mo9080e(View view) {
        if (this.f7850b != view.getId()) {
            int i = this.f7850b;
            if (i != -1) {
                m11112b("blur", i);
            }
            this.f7850b = view.getId();
            m11112b("focus", view.getId());
        }
    }
}
