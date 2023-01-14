package p027c.p075j.p076a;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: c.j.a.c */
public abstract class C2018c extends C2013a {

    /* renamed from: v */
    private int f5803v;

    /* renamed from: w */
    private int f5804w;

    /* renamed from: x */
    private LayoutInflater f5805x;

    @Deprecated
    public C2018c(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f5804w = i;
        this.f5803v = i;
        this.f5805x = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: g */
    public View mo6712g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f5805x.inflate(this.f5804w, viewGroup, false);
    }

    /* renamed from: h */
    public View mo1631h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f5805x.inflate(this.f5803v, viewGroup, false);
    }
}
