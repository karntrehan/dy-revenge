package p027c.p075j.p076a;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: c.j.a.b */
class C2016b extends Filter {

    /* renamed from: a */
    C2017a f5802a;

    /* renamed from: c.j.a.b$a */
    interface C2017a {
        /* renamed from: a */
        void mo1625a(Cursor cursor);

        /* renamed from: b */
        Cursor mo6710b();

        /* renamed from: c */
        CharSequence mo1626c(Cursor cursor);

        /* renamed from: d */
        Cursor mo1627d(CharSequence charSequence);
    }

    C2016b(C2017a aVar) {
        this.f5802a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f5802a.mo1626c((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor d = this.f5802a.mo1627d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (d != null) {
            filterResults.count = d.getCount();
        } else {
            filterResults.count = 0;
            d = null;
        }
        filterResults.values = d;
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor b = this.f5802a.mo6710b();
        Object obj = filterResults.values;
        if (obj != null && obj != b) {
            this.f5802a.mo1625a((Cursor) obj);
        }
    }
}
