package com.yalantis.ucrop;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: com.yalantis.ucrop.i */
public class C10146i {

    /* renamed from: a */
    private Intent f27106a = new Intent();

    /* renamed from: b */
    private Bundle f27107b;

    /* renamed from: com.yalantis.ucrop.i$a */
    public static class C10147a {

        /* renamed from: a */
        private final Bundle f27108a = new Bundle();

        /* renamed from: a */
        public Bundle mo25220a() {
            return this.f27108a;
        }

        /* renamed from: b */
        public void mo25221b(int i) {
            this.f27108a.putInt("com.yalantis.ucrop.UcropColorControlsWidgetActive", i);
        }

        /* renamed from: c */
        public void mo25222c(int i, int i2, int i3) {
            this.f27108a.putIntArray("com.yalantis.ucrop.AllowedGestures", new int[]{i, i2, i3});
        }

        /* renamed from: d */
        public void mo25223d(boolean z) {
            this.f27108a.putBoolean("com.yalantis.ucrop.CircleDimmedLayer", z);
        }

        /* renamed from: e */
        public void mo25224e(Bitmap.CompressFormat compressFormat) {
            this.f27108a.putString("com.yalantis.ucrop.CompressionFormatName", compressFormat.name());
        }

        /* renamed from: f */
        public void mo25225f(int i) {
            this.f27108a.putInt("com.yalantis.ucrop.CompressionQuality", i);
        }

        /* renamed from: g */
        public void mo25226g(boolean z) {
            this.f27108a.putBoolean("com.yalantis.ucrop.FreeStyleCrop", z);
        }

        /* renamed from: h */
        public void mo25227h(boolean z) {
            this.f27108a.putBoolean("com.yalantis.ucrop.HideBottomControls", z);
        }

        /* renamed from: i */
        public void mo25228i(boolean z) {
            this.f27108a.putBoolean("com.yalantis.ucrop.ShowCropFrame", z);
        }

        /* renamed from: j */
        public void mo25229j(boolean z) {
            this.f27108a.putBoolean("com.yalantis.ucrop.ShowCropGrid", z);
        }

        /* renamed from: k */
        public void mo25230k(int i) {
            this.f27108a.putInt("com.yalantis.ucrop.StatusBarColor", i);
        }

        /* renamed from: l */
        public void mo25231l(int i) {
            this.f27108a.putInt("com.yalantis.ucrop.ToolbarColor", i);
        }

        /* renamed from: m */
        public void mo25232m(String str) {
            this.f27108a.putString("com.yalantis.ucrop.UcropToolbarTitleText", str);
        }

        /* renamed from: n */
        public void mo25233n(int i) {
            this.f27108a.putInt("com.yalantis.ucrop.UcropToolbarWidgetColor", i);
        }
    }

    private C10146i(Uri uri, Uri uri2) {
        Bundle bundle = new Bundle();
        this.f27107b = bundle;
        bundle.putParcelable("com.yalantis.ucrop.InputUri", uri);
        this.f27107b.putParcelable("com.yalantis.ucrop.OutputUri", uri2);
    }

    /* renamed from: b */
    public static Uri m34329b(Intent intent) {
        return (Uri) intent.getParcelableExtra("com.yalantis.ucrop.OutputUri");
    }

    /* renamed from: c */
    public static C10146i m34330c(Uri uri, Uri uri2) {
        return new C10146i(uri, uri2);
    }

    /* renamed from: a */
    public Intent mo25215a(Context context) {
        this.f27106a.setClass(context, UCropActivity.class);
        this.f27106a.putExtras(this.f27107b);
        return this.f27106a;
    }

    /* renamed from: d */
    public void mo25216d(Activity activity) {
        mo25217e(activity, 69);
    }

    /* renamed from: e */
    public void mo25217e(Activity activity, int i) {
        activity.startActivityForResult(mo25215a(activity), i);
    }

    /* renamed from: f */
    public C10146i mo25218f(float f, float f2) {
        this.f27107b.putFloat("com.yalantis.ucrop.AspectRatioX", f);
        this.f27107b.putFloat("com.yalantis.ucrop.AspectRatioY", f2);
        return this;
    }

    /* renamed from: g */
    public C10146i mo25219g(C10147a aVar) {
        this.f27107b.putAll(aVar.mo25220a());
        return this;
    }
}
