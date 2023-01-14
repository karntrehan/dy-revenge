package p027c.p075j.p076a;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p027c.p075j.p076a.C2016b;

/* renamed from: c.j.a.a */
public abstract class C2013a extends BaseAdapter implements Filterable, C2016b.C2017a {

    /* renamed from: f */
    protected boolean f5792f;

    /* renamed from: o */
    protected boolean f5793o;

    /* renamed from: p */
    protected Cursor f5794p;

    /* renamed from: q */
    protected Context f5795q;

    /* renamed from: r */
    protected int f5796r;

    /* renamed from: s */
    protected C2014a f5797s;

    /* renamed from: t */
    protected DataSetObserver f5798t;

    /* renamed from: u */
    protected C2016b f5799u;

    /* renamed from: c.j.a.a$a */
    private class C2014a extends ContentObserver {
        C2014a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            C2013a.this.mo6717i();
        }
    }

    /* renamed from: c.j.a.a$b */
    private class C2015b extends DataSetObserver {
        C2015b() {
        }

        public void onChanged() {
            C2013a aVar = C2013a.this;
            aVar.f5792f = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            C2013a aVar = C2013a.this;
            aVar.f5792f = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public C2013a(Context context, Cursor cursor, boolean z) {
        mo6711f(context, cursor, z ? 1 : 2);
    }

    /* renamed from: a */
    public void mo1625a(Cursor cursor) {
        Cursor j = mo6718j(cursor);
        if (j != null) {
            j.close();
        }
    }

    /* renamed from: b */
    public Cursor mo6710b() {
        return this.f5794p;
    }

    /* renamed from: c */
    public abstract CharSequence mo1626c(Cursor cursor);

    /* renamed from: e */
    public abstract void mo1628e(View view, Context context, Cursor cursor);

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo6711f(Context context, Cursor cursor, int i) {
        C2015b bVar;
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.f5793o = true;
        } else {
            this.f5793o = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f5794p = cursor;
        this.f5792f = z;
        this.f5795q = context;
        this.f5796r = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f5797s = new C2014a();
            bVar = new C2015b();
        } else {
            bVar = null;
            this.f5797s = null;
        }
        this.f5798t = bVar;
        if (z) {
            C2014a aVar = this.f5797s;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f5798t;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: g */
    public abstract View mo6712g(Context context, Cursor cursor, ViewGroup viewGroup);

    public int getCount() {
        Cursor cursor;
        if (!this.f5792f || (cursor = this.f5794p) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f5792f) {
            return null;
        }
        this.f5794p.moveToPosition(i);
        if (view == null) {
            view = mo6712g(this.f5795q, this.f5794p, viewGroup);
        }
        mo1628e(view, this.f5795q, this.f5794p);
        return view;
    }

    public Filter getFilter() {
        if (this.f5799u == null) {
            this.f5799u = new C2016b(this);
        }
        return this.f5799u;
    }

    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f5792f || (cursor = this.f5794p) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f5794p;
    }

    public long getItemId(int i) {
        Cursor cursor;
        if (!this.f5792f || (cursor = this.f5794p) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.f5794p.getLong(this.f5796r);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f5792f) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f5794p.moveToPosition(i)) {
            if (view == null) {
                view = mo1631h(this.f5795q, this.f5794p, viewGroup);
            }
            mo1628e(view, this.f5795q, this.f5794p);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
    }

    /* renamed from: h */
    public abstract View mo1631h(Context context, Cursor cursor, ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo6717i() {
        Cursor cursor;
        if (this.f5793o && (cursor = this.f5794p) != null && !cursor.isClosed()) {
            this.f5792f = this.f5794p.requery();
        }
    }

    /* renamed from: j */
    public Cursor mo6718j(Cursor cursor) {
        Cursor cursor2 = this.f5794p;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C2014a aVar = this.f5797s;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f5798t;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f5794p = cursor;
        if (cursor != null) {
            C2014a aVar2 = this.f5797s;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f5798t;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f5796r = cursor.getColumnIndexOrThrow("_id");
            this.f5792f = true;
            notifyDataSetChanged();
        } else {
            this.f5796r = -1;
            this.f5792f = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
