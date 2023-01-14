package com.airbnb.android.react.lottie;

import android.widget.ImageView;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.lang.ref.WeakReference;
import java.util.regex.Pattern;
import p174e.p181b.p182a.C5424d;
import p174e.p181b.p182a.C5462l;
import p174e.p181b.p182a.C5472r;
import p174e.p181b.p182a.C5473s;
import p174e.p181b.p182a.p183a0.C5419c;
import p174e.p181b.p182a.p188w.C5528e;

/* renamed from: com.airbnb.android.react.lottie.a */
public class C2312a {

    /* renamed from: a */
    private final WeakReference<C5424d> f6831a;

    /* renamed from: b */
    private String f6832b;

    /* renamed from: c */
    private Float f6833c;

    /* renamed from: d */
    private Boolean f6834d;

    /* renamed from: e */
    private Float f6835e;

    /* renamed from: f */
    private boolean f6836f;

    /* renamed from: g */
    private String f6837g;

    /* renamed from: h */
    private ImageView.ScaleType f6838h;

    /* renamed from: i */
    private String f6839i;

    /* renamed from: j */
    private Boolean f6840j;

    /* renamed from: k */
    private ReadableArray f6841k;

    /* renamed from: l */
    private C5472r f6842l;

    public C2312a(C5424d dVar) {
        this.f6831a = new WeakReference<>(dVar);
    }

    /* renamed from: a */
    public void mo7696a() {
        C5424d dVar = (C5424d) this.f6831a.get();
        if (dVar != null) {
            String str = this.f6832b;
            if (str != null) {
                dVar.mo16440w(str, Integer.toString(str.hashCode()));
                this.f6832b = null;
            }
            if (this.f6836f) {
                dVar.setAnimation(this.f6837g);
                this.f6836f = false;
            }
            Float f = this.f6833c;
            if (f != null) {
                dVar.setProgress(f.floatValue());
                this.f6833c = null;
            }
            Boolean bool = this.f6834d;
            if (bool != null) {
                dVar.setRepeatCount(bool.booleanValue() ? -1 : 0);
                this.f6834d = null;
            }
            Float f2 = this.f6835e;
            if (f2 != null) {
                dVar.setSpeed(f2.floatValue());
                this.f6835e = null;
            }
            ImageView.ScaleType scaleType = this.f6838h;
            if (scaleType != null) {
                dVar.setScaleType(scaleType);
                this.f6838h = null;
            }
            C5472r rVar = this.f6842l;
            if (rVar != null) {
                dVar.setRenderMode(rVar);
                this.f6842l = null;
            }
            String str2 = this.f6839i;
            if (str2 != null) {
                dVar.setImageAssetsFolder(str2);
                this.f6839i = null;
            }
            Boolean bool2 = this.f6840j;
            if (bool2 != null) {
                dVar.mo16396l(bool2.booleanValue());
                this.f6840j = null;
            }
            ReadableArray readableArray = this.f6841k;
            if (readableArray != null && readableArray.size() > 0) {
                for (int i = 0; i < this.f6841k.size(); i++) {
                    ReadableMap map = this.f6841k.getMap(i);
                    int intValue = map.getType("color") == ReadableType.Map ? ColorPropConverter.getColor(map.getMap("color"), dVar.getContext()).intValue() : map.getInt("color");
                    String string = map.getString("keypath");
                    C5473s sVar = new C5473s(intValue);
                    dVar.mo16393h(new C5528e((string + ".**").split(Pattern.quote("."))), C5462l.f15280E, new C5419c(sVar));
                }
            }
        }
    }

    /* renamed from: b */
    public void mo7697b(String str) {
        this.f6832b = str;
    }

    /* renamed from: c */
    public void mo7698c(String str) {
        this.f6837g = str;
        this.f6836f = true;
    }

    /* renamed from: d */
    public void mo7699d(ReadableArray readableArray) {
        this.f6841k = readableArray;
    }

    /* renamed from: e */
    public void mo7700e(boolean z) {
        this.f6840j = Boolean.valueOf(z);
    }

    /* renamed from: f */
    public void mo7701f(String str) {
        this.f6839i = str;
    }

    /* renamed from: g */
    public void mo7702g(boolean z) {
        this.f6834d = Boolean.valueOf(z);
    }

    /* renamed from: h */
    public void mo7703h(Float f) {
        this.f6833c = f;
    }

    /* renamed from: i */
    public void mo7704i(C5472r rVar) {
        this.f6842l = rVar;
    }

    /* renamed from: j */
    public void mo7705j(ImageView.ScaleType scaleType) {
        this.f6838h = scaleType;
    }

    /* renamed from: k */
    public void mo7706k(float f) {
        this.f6835e = Float.valueOf(f);
    }
}
