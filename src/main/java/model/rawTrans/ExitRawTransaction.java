package model.rawTrans;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import model.HighwayTransaction;

import java.util.List;


@Data
public class ExitRawTransaction implements HighwayTransaction {

    @JsonProperty(value = "ID"  )
    private String ID;
    @JsonProperty(value = "MODIFYFLAG"  )
    private String MODIFYFLAG;
    @JsonProperty(value = "SOURCEID"  )
    private String SOURCEID;
    @JsonProperty(value = "PAYFEE"  )
    private String PAYFEE;
    @JsonProperty(value = "TRANSCODE"  )
    private String TRANSCODE;
    @JsonProperty(value = "LDATE"  )
    private String LDATE;
    @JsonProperty(value = "SHIFT"  )
    private String SHIFT;
    @JsonProperty(value = "BATCHNUM"  )
    private String BATCHNUM;
    @JsonProperty(value = "LOGINTIME"  )
    private String LOGINTIME;
    @JsonProperty(value = "TRIGGERTIME"  )
    private String TRIGGERTIME;
    @JsonProperty(value = "OPERID"  )
    private String OPERID;
    @JsonProperty(value = "OPERNAME"  )
    private String OPERNAME;
    @JsonProperty(value = "MONITOR"  )
    private String MONITOR;
    @JsonProperty(value = "MONITORNAME"  )
    private String MONITORNAME;
    @JsonProperty(value = "MONITORTIME"  )
    private String MONITORTIME;
    @JsonProperty(value = "LANEAPPVER"  )
    private String LANEAPPVER;
    @JsonProperty(value = "ENWEIGHT"  )
    private String ENWEIGHT;
    @JsonProperty(value = "ENAXLECOUNT"  )
    private String ENAXLECOUNT;
    @JsonProperty(value = "ENTOLLSTATION"  )
    private String ENTOLLSTATION;
    @JsonProperty(value = "ENTOLLLANE"  )
    private String ENTOLLLANE;
    @JsonProperty(value = "ENTOLLSTATIONHEX"  )
    private String ENTOLLSTATIONHEX;
    @JsonProperty(value = "ENTOLLLANEHEX"  )
    private String ENTOLLLANEHEX;
    @JsonProperty(value = "ENTOLLSTATIONID"  )
    private String ENTOLLSTATIONID;
    @JsonProperty(value = "ENTOLLLANEID"  )
    private String ENTOLLLANEID;
    @JsonProperty(value = "ENTIME"  )
    private String ENTIME;
    @JsonProperty(value = "ENTRYOPERATORID"  )
    private String ENTRYOPERATORID;
    @JsonProperty(value = "LANETYPE"  )
    private String LANETYPE;
    @JsonProperty(value = "EXTOLLSTATION"  )
    private String EXTOLLSTATION;
    @JsonProperty(value = "EXTOLLLANE"  )
    private String EXTOLLLANE;
    @JsonProperty(value = "EXTOLLSTATIONHEX"  )
    private String EXTOLLSTATIONHEX;
    @JsonProperty(value = "EXTOLLLANEHEX"  )
    private String EXTOLLLANEHEX;
    @JsonProperty(value = "EXTOLLSTATIONID"  )
    private String EXTOLLSTATIONID;
    @JsonProperty(value = "EXTOLLLANEID"  )
    private String EXTOLLLANEID;
    @JsonProperty(value = "EXTIME"  )
    private String EXTIME;
    @JsonProperty(value = "BL_SUBCENTER"  )
    private String BL_SUBCENTER;
    @JsonProperty(value = "BL_CENTER"  )
    private String BL_CENTER;
    @JsonProperty(value = "MEDIATYPE"  )
    private String MEDIATYPE;
    @JsonProperty(value = "MEDIANO"  )
    private String MEDIANO;
    @JsonProperty(value = "OBUSIGN" )
    private String OBUSIGN;
    @JsonProperty(value = "OBUISSUEFLAG"  )
    private String OBUISSUEFLAG;
    @JsonProperty(value = "OBUID"  )
    private String OBUID;
    @JsonProperty(value = "CARDCNT"  )
    private String CARDCNT;
    @JsonProperty(value = "VCOUNT"  )
    private String VCOUNT;
    @JsonProperty(value = "INDUCTCNT"  )
    private String INDUCTCNT;
    @JsonProperty(value = "ENVLP"  )
    private String ENVLP;
    @JsonProperty(value = "ENVLPC"  )
    private String ENVLPC;
    @JsonProperty(value = "EXVLP"  )
    private String EXVLP;
    @JsonProperty(value = "EXVLPC"  )
    private String EXVLPC;
    @JsonProperty(value = "IDENTIFYVLP"  )
    private String IDENTIFYVLP;
    @JsonProperty(value = "IDENTIFYVLPC"  )
    private String IDENTIFYVLPC;
    @JsonProperty(value = "ENVEHICLETYPE"  )
    private String ENVEHICLETYPE;
    @JsonProperty(value = "EXVEHICLETYPE"  )
    private String EXVEHICLETYPE;
    @JsonProperty(value = "ENVEHICLECLASS"  )
    private String ENVEHICLECLASS;
    @JsonProperty(value = "EXVEHICLECLASS"  )
    private String EXVEHICLECLASS;
    @JsonProperty(value = "EXWEIGHT"  )
    private String EXWEIGHT;
    @JsonProperty(value = "AXISINFO"  )
    private String AXISINFO;
    @JsonProperty(value = "LIMITWEIGHT"  )
    private String LIMITWEIGHT;
    @JsonProperty(value = "OVERWEIGHTRATE"  )
    private String OVERWEIGHTRATE;
    @JsonProperty(value = "AXLECOUNT"  )
    private String AXLECOUNT;
    @JsonProperty(value = "ELECTRICALPERCENTAGE"  )
    private String ELECTRICALPERCENTAGE;
    @JsonProperty(value = "TAC"  )
    private String TAC;
    @JsonProperty(value = "TRANSTYPE"  )
    private String TRANSTYPE;
    @JsonProperty(value = "TERMINALTRANSNO"  )
    private String TERMINALTRANSNO;
    @JsonProperty(value = "TERMINALNO"  )
    private String TERMINALNO;
    @JsonProperty(value = "SERVICETYPE"  )
    private String SERVICETYPE;
    @JsonProperty(value = "ALGORITHMIDENTIFIER"  )
    private String ALGORITHMIDENTIFIER;
    @JsonProperty(value = "TOLLDISTANCE"  )
    private String TOLLDISTANCE;
    @JsonProperty(value = "REALDISTANCE"  )
    private String REALDISTANCE;
    @JsonProperty(value = "VSPEED"  )
    private String VSPEED;
    @JsonProperty(value = "OVERTIME"  )
    private String OVERTIME;
    @JsonProperty(value = "FREETYPE"  )
    private String FREETYPE;
    @JsonProperty(value = "FREEMODE"  )
    private String FREEMODE;
    @JsonProperty(value = "FREEINFO"  )
    private String FREEINFO;
    @JsonProperty(value = "BALANCEBEFORE"  )
    private String BALANCEBEFORE;
    @JsonProperty(value = "BALANCEAFTER"  )
    private String BALANCEAFTER;
    @JsonProperty(value = "FEE"  )
    private String FEE;
    @JsonProperty(value = "COLLECTFEE"  )
    private String COLLECTFEE;
    @JsonProperty(value = "DISCOUNTFEE"  )
    private String DISCOUNTFEE;
    @JsonProperty(value = "REBATEMONEY"  )
    private String REBATEMONEY;
    @JsonProperty(value = "CARDCOSTFEE"  )
    private String CARDCOSTFEE;
    @JsonProperty(value = "UNPAYFEE"  )
    private String UNPAYFEE;
    @JsonProperty(value = "UNPAYFLAG"  )
    private String UNPAYFLAG;
    @JsonProperty(value = "UNPAYCARDCOST"  )
    private String UNPAYCARDCOST;
    @JsonProperty(value = "TICKETFEE"  )
    private String TICKETFEE;
    @JsonProperty(value = "UNIFIEDFEE"  )
    private String UNIFIEDFEE;
    @JsonProperty(value = "ENTOLLMONEY"  )
    private String ENTOLLMONEY;
    @JsonProperty(value = "ENFREEMONEY"  )
    private String ENFREEMONEY;
    @JsonProperty(value = "ENLASTMONEY"  )
    private String ENLASTMONEY;
    @JsonProperty(value = "RETURNMONEYSN"  )
    private String RETURNMONEYSN;
    @JsonProperty(value = "PAYCARDTYPE"  )
    private String PAYCARDTYPE;
    @JsonProperty(value = "PAYCARDNET"  )
    private String PAYCARDNET;
    @JsonProperty(value = "PAYCARDID"  )
    private String PAYCARDID;
    @JsonProperty(value = "PAYCARDTRANSN"  )
    private String PAYCARDTRANSN;
    @JsonProperty(value = "PAYTYPE"  )
    private String PAYTYPE;
    @JsonProperty(value = "PAYORDERNUM"  )
    private String PAYORDERNUM;
    @JsonProperty(value = "PAYREBATE"  )
    private String PAYREBATE;
    @JsonProperty(value = "IDENTIFICATION"  )
    private String IDENTIFICATION;
    @JsonProperty(value = "INVOICETYPE"  )
    private String INVOICETYPE;
    @JsonProperty(value = "INVOICECODE"  )
    private String INVOICECODE;
    @JsonProperty(value = "INVOICEID"  )
    private String INVOICEID;
    @JsonProperty(value = "INVOICECNT"  )
    private String INVOICECNT;
    @JsonProperty(value = "SIGNSTATUS"  )
    private String SIGNSTATUS;
    @JsonProperty(value = "SPECIALTYPE"  )
    private String SPECIALTYPE;
    @JsonProperty(value = "LANESPINFO"  )
    private String LANESPINFO;
    @JsonProperty(value = "SPINFO"  )
    private String SPINFO;
    @JsonProperty(value = "VEHICLESIGNID"  )
    private String VEHICLESIGNID;
    @JsonProperty(value = "MULTIPROVINCE"  )
    private String MULTIPROVINCE;
    @JsonProperty(value = "KEYNUM"  )
    private String KEYNUM;
    @JsonProperty(value = "KEYPRESSINFO"  )
    private String KEYPRESSINFO;
    @JsonProperty(value = "PARAVER"  )
    private String PARAVER;
    @JsonProperty(value = "PROVINCEGROUP"  )
    private String PROVINCEGROUP;
    @JsonProperty(value = "GANTRYIDGROUP"  )
    private String GANTRYIDGROUP;
    @JsonProperty(value = "TOLLINTERVALSCOUNT"  )
    private String TOLLINTERVALSCOUNT;
    @JsonProperty(value = "TOLLINTERVALSGROUP"  )
    private String TOLLINTERVALSGROUP;
    @JsonProperty(value = "TRANSTIMEGROUP"  )
    private String TRANSTIMEGROUP;
    @JsonProperty(value = "CHARGEFEEGROUP"  )
    private String CHARGEFEEGROUP;
    @JsonProperty(value = "CHARGEDISCOUNTGROUP"  )
    private String CHARGEDISCOUNTGROUP;
    @JsonProperty(value = "RATEMODEVERSIONGROUP"  )
    private String RATEMODEVERSIONGROUP;
    @JsonProperty(value = "RATEPARAVERSIONGROUP"  )
    private String RATEPARAVERSIONGROUP;
    @JsonProperty(value = "TOLLFEEGROUP"  )
    private String TOLLFEEGROUP;
    @JsonProperty(value = "PASSID"  )
    private String PASSID;
    @JsonProperty(value = "STATIONRECEIVETIME"  )
    private String STATIONRECEIVETIME;
    @JsonProperty(value = "RECEIVETIME"  )
    private String RECEIVETIME;
    @JsonProperty(value = "VERIFYCODE"  )
    private String VERIFYCODE;
    @JsonProperty(value = "VERIFYFLAG"  )
    private String VERIFYFLAG;
    @JsonProperty(value = "TRANSFLAG"  )
    private String TRANSFLAG;
    @JsonProperty(value = "REMARKS"  )
    private String REMARKS;
    @JsonProperty(value = "SPARE1"  )
    private String SPARE1;
    @JsonProperty(value = "SPARE2"  )
    private String SPARE2;
    @JsonProperty(value = "SPARE3"  )
    private String SPARE3;
    @JsonProperty(value = "SPARE4"  )
    private String SPARE4;
    @JsonProperty(value = "SPARE5"  )
    private String SPARE5;
    @JsonProperty(value = "SUPPLIERID"  )
    private String SUPPLIERID;
    @JsonProperty(value = "ROADTYPE"  )
    private String ROADTYPE;
    @JsonProperty(value = "ENTOLLSTATIONNAME"  )
    private String ENTOLLSTATIONNAME;
    @JsonProperty(value = "EXTOLLSTATIONNAME"  )
    private String EXTOLLSTATIONNAME;
    @JsonProperty(value = "SECTIONGROUP"  )
    private String SECTIONGROUP;
    @JsonProperty(value = "GANTRYPASSCOUNT"  )
    private String GANTRYPASSCOUNT;
    @JsonProperty(value = "GANTRYPASSINFO"  )
    private String GANTRYPASSINFO;
    @JsonProperty(value = "FEEPROVINFO"  )
    private String FEEPROVINFO;
    @JsonProperty(value = "PAYCODE"  )
    private String PAYCODE;
    @JsonProperty(value = "DESCRIPTION"  )
    private String DESCRIPTION;
    @JsonProperty(value = "VERIFYPASSTIME"  )
    private String VERIFYPASSTIME;
    @JsonProperty(value = "VEHICLESIGN"  )
    private String VEHICLESIGN;
    @JsonProperty(value = "CHECKSIGN"  )
    private String CHECKSIGN;
    @JsonProperty(value = "OBUVERSION"  )
    private String OBUVERSION;
    @JsonProperty(value = "CARDVERSION"  )
    private String CARDVERSION;
    @JsonProperty(value = "SHORTFEE"  )
    private String SHORTFEE;
    @JsonProperty(value = "ACTUALFEECLASS"  )
    private String ACTUALFEECLASS;
    @JsonProperty(value = "OBUTOTALCOUNT"  )
    private String OBUTOTALCOUNT;
    @JsonProperty(value = "NOCARDCOUNT"  )
    private String NOCARDCOUNT;
    @JsonProperty(value = "ETCTOTALAMOUNT"  )
    private String ETCTOTALAMOUNT;
    @JsonProperty(value = "FEEBOARDPLAY"  )
    private String FEEBOARDPLAY;
    @JsonProperty(value = "SPCRATEVERSION"  )
    private String SPCRATEVERSION;
    @JsonProperty(value = "CHARGEMODE"  )
    private String CHARGEMODE;
    @JsonProperty(value = "TRANSPAYTYPE"  )
    private String TRANSPAYTYPE;
    @JsonProperty(value = "FEEMILEAGE"  )
    private String FEEMILEAGE;
    @JsonProperty(value = "PROVFEE"  )
    private String PROVFEE;
    @JsonProperty(value = "PROVTRANSCOUNT"  )
    private String PROVTRANSCOUNT;
    @JsonProperty(value = "PROVINCECOUNT"  )
    private String PROVINCECOUNT;
    @JsonProperty(value = "PROVINCETRANSGROUP"  )
    private String PROVINCETRANSGROUP;
    @JsonProperty(value = "TRANSFEE"  )
    private String TRANSFEE;
    @JsonProperty(value = "OBUPAYFEE"  )
    private String OBUPAYFEE;
    @JsonProperty(value = "OBUDISCOUNTFEE"  )
    private String OBUDISCOUNTFEE;
    @JsonProperty(value = "SHORTFEEMILEAGE"  )
    private String SHORTFEEMILEAGE;
    @JsonProperty(value = "OBUTOTALAMOUNT"  )
    private String OBUTOTALAMOUNT;
    @JsonProperty(value = "OBUTOTALDISCOUNTAMOUNT"  )
    private String OBUTOTALDISCOUNTAMOUNT;
    @JsonProperty(value = "TOLLPROVINCEID"  )
    private String TOLLPROVINCEID;
    @JsonProperty(value = "OPENTYPE"  )
    private String OPENTYPE;
    @JsonProperty(value = "DISCOUNTTYPE"  )
    private String DISCOUNTTYPE;
    @JsonProperty(value = "PROVINCEDISCOUNTFEE"  )
    private String PROVINCEDISCOUNTFEE;
    @JsonProperty(value = "ORIGINFEE"  )
    private String ORIGINFEE;
    @JsonProperty(value = "FEERATE"  )
    private String FEERATE;
    @JsonProperty(value = "DISPUTEDSTATUS"  )
    private String DISPUTEDSTATUS;
    @JsonProperty(value = "DISPUTETIME"  )
    private String DISPUTETIME;
    @JsonProperty(value = "LETGOFLAG"  )
    private String LETGOFLAG;
    @JsonProperty(value = "VACCINEFLAG"  )
    private String VACCINEFLAG;
    @JsonProperty(value = "WASTESPARE1"  )
    private String WASTESPARE1;
    @JsonProperty(value = "WASTESPARE2"  )
    private String WASTESPARE2;
    @JsonProperty(value = "WASTESPARE3"  )
    private String WASTESPARE3;
    @JsonProperty(value = "WASTESPARE4"  )
    private String WASTESPARE4;
    @JsonProperty(value = "WASTESPARE5"  )
    private String WASTESPARE5;
    @JsonProperty(value = "APPOINTID"  )
    private String APPOINTID;
    @JsonProperty(value = "ORIGINALFLAG"  )
    private String ORIGINALFLAG;
    @JsonProperty(value = "EXINDISPUTEDTYPE"  )
    private String EXINDISPUTEDTYPE;

    // 出口流水附属信息
    @JsonProperty(value = "EXITEXTLIST")
    private List<ExitWaste> eXITEXTLIST;

    public boolean peekPrimaryTrans() {
        return "09".equals(this.getTRANSTYPE());
    }
}
