package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.HashMap;
import java.util.Map;

/* renamed from: e.f.a.c.f.g.n0 */
public enum C6907n0 {
    ADD(0),
    AND(1),
    APPLY(2),
    ASSIGN(3),
    BITWISE_AND(56),
    BITWISE_LEFT_SHIFT(57),
    BITWISE_NOT(58),
    BITWISE_OR(59),
    BITWISE_RIGHT_SHIFT(60),
    BITWISE_UNSIGNED_RIGHT_SHIFT(61),
    BITWISE_XOR(62),
    BLOCK(53),
    BREAK(4),
    CASE(5),
    CONST(52),
    CONTINUE(6),
    CONTROL(49),
    CREATE_ARRAY(7),
    CREATE_OBJECT(8),
    DEFAULT(9),
    DEFINE_FUNCTION(50),
    DIVIDE(10),
    DO(11),
    EQUALS(12),
    EXPRESSION_LIST(13),
    FN(51),
    FOR_IN(47),
    FOR_IN_CONST(54),
    FOR_IN_LET(55),
    FOR_LET(63),
    FOR_OF(64),
    FOR_OF_CONST(65),
    FOR_OF_LET(66),
    GET(15),
    GET_CONTAINER_VARIABLE(48),
    GET_INDEX(16),
    GET_PROPERTY(17),
    GREATER_THAN(18),
    GREATER_THAN_EQUALS(19),
    IDENTITY_EQUALS(20),
    IDENTITY_NOT_EQUALS(21),
    IF(22),
    LESS_THAN(23),
    LESS_THAN_EQUALS(24),
    MODULUS(25),
    MULTIPLY(26),
    NEGATE(27),
    NOT(28),
    NOT_EQUALS(29),
    NULL(45),
    OR(30),
    PLUS_EQUALS(31),
    POST_DECREMENT(32),
    POST_INCREMENT(33),
    QUOTE(46),
    PRE_DECREMENT(34),
    PRE_INCREMENT(35),
    RETURN(36),
    SET_PROPERTY(43),
    SUBTRACT(37),
    SWITCH(38),
    TERNARY(39),
    TYPEOF(40),
    UNDEFINED(44),
    VAR(41),
    WHILE(42);
    

    /* renamed from: B0 */
    private static final Map f18648B0 = null;

    /* renamed from: D0 */
    private final int f18713D0;

    static {
        f18648B0 = new HashMap();
        for (C6907n0 n0Var : values()) {
            f18648B0.put(Integer.valueOf(n0Var.f18713D0), n0Var);
        }
    }

    private C6907n0(int i) {
        this.f18713D0 = i;
    }

    /* renamed from: e */
    public static C6907n0 m26199e(int i) {
        return (C6907n0) f18648B0.get(Integer.valueOf(i));
    }

    /* renamed from: g */
    public final Integer mo19976g() {
        return Integer.valueOf(this.f18713D0);
    }

    public final String toString() {
        return Integer.valueOf(this.f18713D0).toString();
    }
}
