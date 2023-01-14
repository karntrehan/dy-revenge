package p174e.p319f.p320a.p321a;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.CamcorderProfile;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.SortedSet;
import p027c.p064i.p069g.C1861k;
import p027c.p064i.p069g.C1863l;
import p027c.p064i.p072j.C1988t;
import p174e.p319f.p320a.p321a.C6448f;

/* renamed from: e.f.a.a.e */
public class C6442e extends FrameLayout {

    /* renamed from: f */
    C6448f f17955f;

    /* renamed from: o */
    private final C6445c f17956o;

    /* renamed from: p */
    private boolean f17957p;

    /* renamed from: q */
    private Context f17958q;

    /* renamed from: r */
    private final C6451h f17959r;

    /* renamed from: s */
    protected HandlerThread f17960s;

    /* renamed from: t */
    protected Handler f17961t;

    /* renamed from: e.f.a.a.e$a */
    class C6443a extends C6451h {
        C6443a(Context context) {
            super(context);
        }

        /* renamed from: g */
        public void mo19163g(int i, int i2) {
            C6442e.this.f17955f.mo19008E(i);
            C6442e.this.f17955f.mo19007D(i2);
        }
    }

    /* renamed from: e.f.a.a.e$b */
    public static abstract class C6444b {
        /* renamed from: a */
        public void mo19164a(C6442e eVar) {
        }

        /* renamed from: b */
        public void mo19165b(C6442e eVar) {
        }

        /* renamed from: c */
        public void mo19166c(C6442e eVar, byte[] bArr, int i, int i2, int i3) {
        }

        /* renamed from: d */
        public void mo19167d(C6442e eVar) {
        }

        /* renamed from: e */
        public void mo19168e(C6442e eVar, byte[] bArr, int i, int i2) {
        }

        /* renamed from: f */
        public void mo19169f(C6442e eVar) {
        }

        /* renamed from: g */
        public void mo19170g(C6442e eVar, String str, int i, int i2) {
        }

        /* renamed from: h */
        public void mo19171h(C6442e eVar, String str, int i, int i2) {
        }
    }

    /* renamed from: e.f.a.a.e$c */
    private class C6445c implements C6448f.C6449a {

        /* renamed from: a */
        private final ArrayList<C6444b> f17963a = new ArrayList<>();

        /* renamed from: b */
        private boolean f17964b;

        C6445c() {
        }

        /* renamed from: a */
        public void mo19172a(byte[] bArr, int i, int i2) {
            Iterator<C6444b> it = this.f17963a.iterator();
            while (it.hasNext()) {
                it.next().mo19168e(C6442e.this, bArr, i, i2);
            }
        }

        /* renamed from: b */
        public void mo19173b() {
            Iterator<C6444b> it = this.f17963a.iterator();
            while (it.hasNext()) {
                it.next().mo19164a(C6442e.this);
            }
        }

        /* renamed from: c */
        public void mo19174c() {
            Iterator<C6444b> it = this.f17963a.iterator();
            while (it.hasNext()) {
                it.next().mo19169f(C6442e.this);
            }
        }

        /* renamed from: d */
        public void mo19175d(byte[] bArr, int i, int i2, int i3) {
            Iterator<C6444b> it = this.f17963a.iterator();
            while (it.hasNext()) {
                it.next().mo19166c(C6442e.this, bArr, i, i2, i3);
            }
        }

        /* renamed from: e */
        public void mo19176e() {
            if (this.f17964b) {
                this.f17964b = false;
                C6442e.this.requestLayout();
            }
            Iterator<C6444b> it = this.f17963a.iterator();
            while (it.hasNext()) {
                it.next().mo19165b(C6442e.this);
            }
        }

        /* renamed from: f */
        public void mo19177f() {
            Iterator<C6444b> it = this.f17963a.iterator();
            while (it.hasNext()) {
                it.next().mo19167d(C6442e.this);
            }
        }

        /* renamed from: g */
        public void mo19178g(String str, int i, int i2) {
            Iterator<C6444b> it = this.f17963a.iterator();
            while (it.hasNext()) {
                it.next().mo19170g(C6442e.this, str, i, i2);
            }
        }

        /* renamed from: h */
        public void mo19179h(String str, int i, int i2) {
            Iterator<C6444b> it = this.f17963a.iterator();
            while (it.hasNext()) {
                it.next().mo19171h(C6442e.this, str, i, i2);
            }
        }

        /* renamed from: i */
        public void mo19180i(C6444b bVar) {
            this.f17963a.add(bVar);
        }

        /* renamed from: j */
        public void mo19181j() {
            this.f17964b = true;
        }
    }

    /* renamed from: e.f.a.a.e$d */
    protected static class C6446d extends View.BaseSavedState {
        public static final Parcelable.Creator<C6446d> CREATOR = C1861k.m7880a(new C6447a());

        /* renamed from: f */
        int f17966f;

        /* renamed from: o */
        String f17967o;

        /* renamed from: p */
        C6412a f17968p;

        /* renamed from: q */
        boolean f17969q;

        /* renamed from: r */
        int f17970r;

        /* renamed from: s */
        float f17971s;

        /* renamed from: t */
        float f17972t;

        /* renamed from: u */
        float f17973u;

        /* renamed from: v */
        int f17974v;

        /* renamed from: w */
        boolean f17975w;

        /* renamed from: x */
        boolean f17976x;

        /* renamed from: y */
        boolean f17977y;

        /* renamed from: z */
        C6455j f17978z;

        /* renamed from: e.f.a.a.e$d$a */
        class C6447a implements C1863l<C6446d> {
            C6447a() {
            }

            /* renamed from: a */
            public C6446d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C6446d(parcel, classLoader);
            }

            /* renamed from: b */
            public C6446d[] newArray(int i) {
                return new C6446d[i];
            }
        }

        public C6446d(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            this.f17966f = parcel.readInt();
            this.f17967o = parcel.readString();
            this.f17968p = (C6412a) parcel.readParcelable(classLoader);
            boolean z = true;
            this.f17969q = parcel.readByte() != 0;
            this.f17970r = parcel.readInt();
            this.f17971s = parcel.readFloat();
            this.f17972t = parcel.readFloat();
            this.f17973u = parcel.readFloat();
            this.f17974v = parcel.readInt();
            this.f17975w = parcel.readByte() != 0;
            this.f17976x = parcel.readByte() != 0;
            this.f17977y = parcel.readByte() == 0 ? false : z;
            this.f17978z = (C6455j) parcel.readParcelable(classLoader);
        }

        public C6446d(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f17966f);
            parcel.writeString(this.f17967o);
            parcel.writeParcelable(this.f17968p, 0);
            parcel.writeByte(this.f17969q ? (byte) 1 : 0);
            parcel.writeInt(this.f17970r);
            parcel.writeFloat(this.f17971s);
            parcel.writeFloat(this.f17972t);
            parcel.writeFloat(this.f17973u);
            parcel.writeInt(this.f17974v);
            parcel.writeByte(this.f17975w ? (byte) 1 : 0);
            parcel.writeByte(this.f17976x ? (byte) 1 : 0);
            parcel.writeByte(this.f17977y ? (byte) 1 : 0);
            parcel.writeParcelable(this.f17978z, i);
        }
    }

    static {
        Class<C6442e> cls = C6442e.class;
    }

    public C6442e(Context context, AttributeSet attributeSet, int i, boolean z) {
        super(context, attributeSet, i);
        int i2;
        HandlerThread handlerThread = new HandlerThread("RNCamera-Handler-Thread");
        this.f17960s = handlerThread;
        handlerThread.start();
        this.f17961t = new Handler(this.f17960s.getLooper());
        if (isInEditMode()) {
            this.f17956o = null;
            this.f17959r = null;
            return;
        }
        this.f17957p = true;
        this.f17958q = context;
        C6453i n = m24719n(context);
        C6445c cVar = new C6445c();
        this.f17956o = cVar;
        this.f17955f = (z || (i2 = Build.VERSION.SDK_INT) < 21 || C6430c.m24641h0(context)) ? new C6414b(cVar, n, this.f17961t) : i2 < 23 ? new C6430c(cVar, n, context, this.f17961t) : new C6441d(cVar, n, context, this.f17961t);
        this.f17959r = new C6443a(context);
    }

    public C6442e(Context context, AttributeSet attributeSet, boolean z) {
        this(context, attributeSet, 0, z);
    }

    public C6442e(Context context, boolean z) {
        this(context, (AttributeSet) null, z);
    }

    /* renamed from: n */
    private C6453i m24719n(Context context) {
        return Build.VERSION.SDK_INT < 14 ? new C6458l(context, this) : new C6460m(context, this);
    }

    public boolean getAdjustViewBounds() {
        return this.f17957p;
    }

    public C6412a getAspectRatio() {
        return this.f17955f.mo19027a();
    }

    public boolean getAutoFocus() {
        return this.f17955f.mo19028b();
    }

    public String getCameraId() {
        return this.f17955f.mo19030d();
    }

    public List<Properties> getCameraIds() {
        return this.f17955f.mo19031e();
    }

    public int getCameraOrientation() {
        return this.f17955f.mo19032f();
    }

    public float getExposureCompensation() {
        return this.f17955f.mo19033g();
    }

    public int getFacing() {
        return this.f17955f.mo19034h();
    }

    public int getFlash() {
        return this.f17955f.mo19035i();
    }

    public float getFocusDepth() {
        return this.f17955f.mo19036j();
    }

    public C6455j getPictureSize() {
        return this.f17955f.mo19037k();
    }

    public boolean getPlaySoundOnCapture() {
        return this.f17955f.mo19038l();
    }

    public boolean getPlaySoundOnRecord() {
        return this.f17955f.mo19039m();
    }

    public C6455j getPreviewSize() {
        return this.f17955f.mo19041n();
    }

    public boolean getScanning() {
        return this.f17955f.mo19042o();
    }

    public Set<C6412a> getSupportedAspectRatios() {
        return this.f17955f.mo19046p();
    }

    public ArrayList<int[]> getSupportedPreviewFpsRange() {
        return this.f17955f.mo19047q();
    }

    public View getView() {
        C6448f fVar = this.f17955f;
        if (fVar != null) {
            return fVar.mo19185r();
        }
        return null;
    }

    public int getWhiteBalance() {
        return this.f17955f.mo19048s();
    }

    public float getZoom() {
        return this.f17955f.mo19049t();
    }

    /* renamed from: l */
    public void mo19128l(C6444b bVar) {
        this.f17956o.mo19180i(bVar);
    }

    /* renamed from: m */
    public void mo19129m() {
        HandlerThread handlerThread = this.f17960s;
        if (handlerThread != null) {
            if (Build.VERSION.SDK_INT < 18) {
                handlerThread.quit();
            } else {
                handlerThread.quitSafely();
            }
            this.f17960s = null;
        }
    }

    /* renamed from: o */
    public SortedSet<C6455j> mo19130o(C6412a aVar) {
        return this.f17955f.mo19029c(aVar);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            this.f17959r.mo19188e(C1988t.m8405s(this));
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.f17959r.mo19186c();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (isInEditMode()) {
            super.onMeasure(i, i2);
            return;
        }
        if (this.f17957p) {
            if (!mo19136p()) {
                this.f17956o.mo19181j();
                super.onMeasure(i, i2);
                return;
            }
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode == 1073741824 && mode2 != 1073741824) {
                int size = (int) (((float) View.MeasureSpec.getSize(i)) * getAspectRatio().mo18992U());
                if (mode2 == Integer.MIN_VALUE) {
                    size = Math.min(size, View.MeasureSpec.getSize(i2));
                }
                i2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            } else if (mode != 1073741824 && mode2 == 1073741824) {
                int size2 = (int) (((float) View.MeasureSpec.getSize(i2)) * getAspectRatio().mo18992U());
                if (mode == Integer.MIN_VALUE) {
                    size2 = Math.min(size2, View.MeasureSpec.getSize(i));
                }
                i = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            }
        }
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        C6412a aspectRatio = getAspectRatio();
        if (this.f17959r.mo19189f() % 180 == 0) {
            aspectRatio = aspectRatio.mo18990Q();
        }
        if (measuredHeight < (aspectRatio.mo18989P() * measuredWidth) / aspectRatio.mo18988O()) {
            this.f17955f.mo19185r().measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec((measuredWidth * aspectRatio.mo18989P()) / aspectRatio.mo18988O(), 1073741824));
        } else {
            this.f17955f.mo19185r().measure(View.MeasureSpec.makeMeasureSpec((aspectRatio.mo18988O() * measuredHeight) / aspectRatio.mo18989P(), 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C6446d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C6446d dVar = (C6446d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        setFacing(dVar.f17966f);
        setCameraId(dVar.f17967o);
        setAspectRatio(dVar.f17968p);
        setAutoFocus(dVar.f17969q);
        setFlash(dVar.f17970r);
        setExposureCompensation(dVar.f17971s);
        setFocusDepth(dVar.f17972t);
        setZoom(dVar.f17973u);
        setWhiteBalance(dVar.f17974v);
        setPlaySoundOnCapture(dVar.f17975w);
        setPlaySoundOnRecord(dVar.f17976x);
        setScanning(dVar.f17977y);
        setPictureSize(dVar.f17978z);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C6446d dVar = new C6446d(super.onSaveInstanceState());
        dVar.f17966f = getFacing();
        dVar.f17967o = getCameraId();
        dVar.f17968p = getAspectRatio();
        dVar.f17969q = getAutoFocus();
        dVar.f17970r = getFlash();
        dVar.f17971s = getExposureCompensation();
        dVar.f17972t = getFocusDepth();
        dVar.f17973u = getZoom();
        dVar.f17974v = getWhiteBalance();
        dVar.f17975w = getPlaySoundOnCapture();
        dVar.f17976x = getPlaySoundOnRecord();
        dVar.f17977y = getScanning();
        dVar.f17978z = getPictureSize();
        return dVar;
    }

    /* renamed from: p */
    public boolean mo19136p() {
        return this.f17955f.mo19051u();
    }

    /* renamed from: q */
    public void mo19137q() {
        this.f17955f.mo19053v();
    }

    /* renamed from: r */
    public void mo19138r() {
        this.f17955f.mo19054w();
    }

    /* renamed from: s */
    public boolean mo19139s(String str, int i, int i2, boolean z, CamcorderProfile camcorderProfile, int i3, int i4) {
        return this.f17955f.mo19055x(str, i, i2, z, camcorderProfile, i3, i4);
    }

    public void setAdjustViewBounds(boolean z) {
        if (this.f17957p != z) {
            this.f17957p = z;
            requestLayout();
        }
    }

    public void setAspectRatio(C6412a aVar) {
        if (this.f17955f.mo19004A(aVar)) {
            requestLayout();
        }
    }

    public void setAutoFocus(boolean z) {
        this.f17955f.mo19005B(z);
    }

    public void setCameraId(String str) {
        this.f17955f.mo19006C(str);
    }

    public void setExposureCompensation(float f) {
        this.f17955f.mo19009F(f);
    }

    public void setFacing(int i) {
        this.f17955f.mo19010G(i);
    }

    public void setFlash(int i) {
        this.f17955f.mo19011H(i);
    }

    public void setFocusDepth(float f) {
        this.f17955f.mo19013J(f);
    }

    public void setPictureSize(C6455j jVar) {
        this.f17955f.mo19014K(jVar);
    }

    public void setPlaySoundOnCapture(boolean z) {
        this.f17955f.mo19016L(z);
    }

    public void setPlaySoundOnRecord(boolean z) {
        this.f17955f.mo19017M(z);
    }

    public void setPreviewTexture(SurfaceTexture surfaceTexture) {
        this.f17955f.mo19018N(surfaceTexture);
    }

    public void setScanning(boolean z) {
        this.f17955f.mo19019O(z);
    }

    public void setUsingCamera2Api(boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            boolean p = mo19136p();
            Parcelable onSaveInstanceState = onSaveInstanceState();
            if (z && !C6430c.m24641h0(this.f17958q)) {
                if (p) {
                    mo19160x();
                }
                this.f17955f = i < 23 ? new C6430c(this.f17956o, this.f17955f.f17980o, this.f17958q, this.f17961t) : new C6441d(this.f17956o, this.f17955f.f17980o, this.f17958q, this.f17961t);
                onRestoreInstanceState(onSaveInstanceState);
            } else if (!(this.f17955f instanceof C6414b)) {
                if (p) {
                    mo19160x();
                }
                this.f17955f = new C6414b(this.f17956o, this.f17955f.f17980o, this.f17961t);
            } else {
                return;
            }
            if (p) {
                mo19159w();
            }
        }
    }

    public void setWhiteBalance(int i) {
        this.f17955f.mo19020P(i);
    }

    public void setZoom(float f) {
        this.f17955f.mo19022Q(f);
    }

    /* renamed from: t */
    public void mo19156t() {
        this.f17955f.mo19056y();
    }

    /* renamed from: u */
    public void mo19157u() {
        this.f17955f.mo19057z();
    }

    /* renamed from: v */
    public void mo19158v(float f, float f2) {
        this.f17955f.mo19012I(f, f2);
    }

    /* renamed from: w */
    public void mo19159w() {
        this.f17955f.mo19023R();
    }

    /* renamed from: x */
    public void mo19160x() {
        this.f17955f.mo19024S();
    }

    /* renamed from: y */
    public void mo19161y() {
        this.f17955f.mo19025T();
    }

    /* renamed from: z */
    public void mo19162z(ReadableMap readableMap) {
        this.f17955f.mo19026U(readableMap);
    }
}
