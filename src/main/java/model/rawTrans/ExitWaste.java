package model.rawTrans;

import lombok.Data;

/**
 * @description: 对应出口站交易数据流水附属表（tbl_ExitWaste_Ext）
 * @author：jimi
 * @date: 2024/4/13
 * @Copyright：
 */

@Data
public class ExitWaste {
    public String SPLITID;
    public String ID;
    public String SERPROVINCEID;
    public String TOLLFEE;
    public String ENPOINTID;
    public String EXPOINTID;
    public String ENTOLLSTATIONNAME;
    public String EXTOLLSTATIONNAME;
    public String ENTIME;
    public String EXTIME;
    public String TOLLINTERVALS;
    public String TOLLINTERVALCHARGEFEE;
    public String TOLLINTERVALPAYFEE;
    public String TOLLINTERVALDISCOUNTFEE;
    public String TOLLINTERVALRATEVERSION;
    // 省内拆分字段
    public String SPLITFLAG;
    public String PROSPLITTIME;
    public String PROSPLITTYPE;
    public String SPLITOWNERCOUNT;
    public String SPLITOWNERGROUP;
    public String SPLITOWNERFEEGROUP;
    public String SPLITOWNERPAYFEEGROUP;
    public String SPLITOWNERDISFEEGROUP;
    public String SPLITREMARK;
}
