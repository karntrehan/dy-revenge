package p174e.p247e.p289i.p290a;

import android.graphics.PointF;
import android.graphics.Rect;
import android.net.Uri;
import java.util.Map;
import p174e.p247e.p289i.p291b.p292a.C6245b;

/* renamed from: e.e.i.a.a */
public class C6243a {
    /* renamed from: a */
    public static C6245b.C6246a m23675a(Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3, Rect rect, String str, PointF pointF, Map<String, Object> map4, Object obj, Uri uri) {
        C6245b.C6246a aVar = new C6245b.C6246a();
        if (rect != null) {
            aVar.f17295g = rect.width();
            aVar.f17296h = rect.height();
        }
        aVar.f17297i = str;
        if (pointF != null) {
            aVar.f17298j = pointF.x;
            aVar.f17299k = pointF.y;
        }
        aVar.f17293e = obj;
        aVar.f17294f = uri;
        aVar.f17291c = map3;
        aVar.f17292d = map4;
        aVar.f17290b = map2;
        aVar.f17289a = map;
        return aVar;
    }
}
