package p477h.p478a.p479a.p490g;

/* renamed from: h.a.a.g.a */
public class C10558a {

    /* renamed from: a */
    private C10560b f27961a;

    /* renamed from: b */
    private long f27962b;

    /* renamed from: c */
    private long f27963c;

    /* renamed from: d */
    private int f27964d;

    /* renamed from: e */
    private C10561c f27965e;

    /* renamed from: f */
    private String f27966f;

    /* renamed from: g */
    private C10559a f27967g;

    /* renamed from: h */
    private Exception f27968h;

    /* renamed from: i */
    private boolean f27969i;

    /* renamed from: j */
    private boolean f27970j;

    /* renamed from: h.a.a.g.a$a */
    public enum C10559a {
        SUCCESS,
        WORK_IN_PROGRESS,
        ERROR,
        CANCELLED
    }

    /* renamed from: h.a.a.g.a$b */
    public enum C10560b {
        READY,
        BUSY
    }

    /* renamed from: h.a.a.g.a$c */
    public enum C10561c {
        NONE,
        ADD_ENTRY,
        REMOVE_ENTRY,
        CALCULATE_CRC,
        EXTRACT_ENTRY,
        MERGE_ZIP_FILES,
        SET_COMMENT,
        RENAME_FILE
    }

    public C10558a() {
        m35783f();
    }

    /* renamed from: f */
    private void m35783f() {
        this.f27965e = C10561c.NONE;
        this.f27961a = C10560b.READY;
    }

    /* renamed from: a */
    public void mo26200a() {
        this.f27967g = C10559a.SUCCESS;
        this.f27964d = 100;
        m35783f();
    }

    /* renamed from: b */
    public void mo26201b(Exception exc) {
        this.f27967g = C10559a.ERROR;
        this.f27968h = exc;
        m35783f();
    }

    /* renamed from: c */
    public void mo26202c() {
        m35783f();
        this.f27966f = null;
        this.f27962b = 0;
        this.f27963c = 0;
        this.f27964d = 0;
    }

    /* renamed from: d */
    public C10560b mo26203d() {
        return this.f27961a;
    }

    /* renamed from: e */
    public boolean mo26204e() {
        return this.f27969i;
    }

    /* renamed from: g */
    public void mo26205g(C10561c cVar) {
        this.f27965e = cVar;
    }

    /* renamed from: h */
    public void mo26206h(String str) {
        this.f27966f = str;
    }

    /* renamed from: i */
    public void mo26207i(C10559a aVar) {
        this.f27967g = aVar;
    }

    /* renamed from: j */
    public void mo26208j(C10560b bVar) {
        this.f27961a = bVar;
    }

    /* renamed from: k */
    public void mo26209k(long j) {
        this.f27962b = j;
    }

    /* renamed from: l */
    public void mo26210l(long j) {
        long j2 = this.f27963c + j;
        this.f27963c = j2;
        long j3 = this.f27962b;
        if (j3 > 0) {
            int i = (int) ((j2 * 100) / j3);
            this.f27964d = i;
            if (i > 100) {
                this.f27964d = 100;
            }
        }
        while (this.f27970j) {
            try {
                Thread.sleep(150);
            } catch (InterruptedException unused) {
            }
        }
    }
}
