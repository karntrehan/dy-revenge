package p174e.p319f.p320a.p335c.p345f.p352g;

/* renamed from: e.f.a.c.f.g.hb */
final class C6822hb {
    /* renamed from: a */
    static String m25842a(C7106z7 z7Var) {
        String str;
        StringBuilder sb = new StringBuilder(z7Var.mo20156h());
        for (int i = 0; i < z7Var.mo20156h(); i++) {
            int b = z7Var.mo20154b(i);
            if (b == 34) {
                str = "\\\"";
            } else if (b == 39) {
                str = "\\'";
            } else if (b != 92) {
                switch (b) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (b < 32 || b > 126) {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            b = (b & 7) + 48;
                        }
                        sb.append((char) b);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
