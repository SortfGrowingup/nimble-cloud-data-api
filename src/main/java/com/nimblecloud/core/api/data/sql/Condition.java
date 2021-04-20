package com.nimblecloud.core.api.data.sql;

/**
 * 会将各种where 条件放入此当中
 * @author SortfGrowingup
 * @version 1.0
 * @date 2021/4/17 16:44
 */
public enum Condition {
    /**等于*/
    EQ("1", " = "),
    /**不等于*/
    NEQ("2", " != "),
    /**大于*/
    GT("3", " > "),
    /**小于*/
    LT("4", " < "),
    /**大于等于*/
    GT_EQ("5", " >= "),
    /**小于等于*/
    LT_EQ("6", " <= "),
    /**where in*/
    IN("11", " IN ");
    private String key;
    private String val;
    Condition(String key, String val){
        setVal(val);
    }

    public String getVal() { return val; }
    private void setVal(String val) { this.val = val; }

    public static void fill_by_eq(StringBuilder sb, Condition condition, String val){
        switch (condition) {
            case EQ:
                sb.append(EQ.getVal()).append(val);break;
            case NEQ:
                sb.append(NEQ).append(val);break;
            case IN:
                sb.append(" IN ").append(val.replace("[", "(").replace("]", ")"));break;
        }
    }
}
