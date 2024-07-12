package model.rawTrans;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import model.HighwayTransaction;

/**
 * @description: 对应预处理输入中门架接收的 “ETC门架计费扣费交易数据接收表（tbl_GantryWasteRec）”
 * @author：jimi
 * @date: 2024/1/21
 * @Copyright：
 */

@Data
public class GantryRawTransaction implements HighwayTransaction {
    @JsonProperty(value = "TRADEID" )
    private String TRADEID;
    @JsonProperty(value = "GANTRYID" )
    private String GANTRYID;
    @JsonProperty(value = "ORIGINALFLAG" )
    private String ORIGINALFLAG;
    @JsonProperty(value = "COMPUTERORDER" )
    private String COMPUTERORDER;
    @JsonProperty(value = "HOURBATCHNO" )
    private String HOURBATCHNO;
    @JsonProperty(value = "GANTRYORDERNUM" )
    private String GANTRYORDERNUM;
    @JsonProperty(value = "GANTRYHEX" )
    private String GANTRYHEX;
    @JsonProperty(value = "GANTRYHEXOPPOSITE" )
    private String GANTRYHEXOPPOSITE;
    @JsonProperty(value = "TRANSTIME" )
    private String TRANSTIME;
    @JsonProperty(value = "PAYFEE" )
    private String PAYFEE;
    @JsonProperty(value = "FEE" )
    private String FEE;
    @JsonProperty(value = "DISCOUNTFEE" )
    private String DISCOUNTFEE;
    @JsonProperty(value = "TRANSFEE" )
    private String TRANSFEE;
    @JsonProperty(value = "MEDIATYPE" )
    private String MEDIATYPE;
    @JsonProperty(value = "OBUSIGN" )
    private String OBUSIGN;
    @JsonProperty(value = "TOLLINTERVALID" )
    private String TOLLINTERVALID;
    @JsonProperty(value = "PAYFEEGROUP" )
    private String PAYFEEGROUP;
    @JsonProperty(value = "FEEGROUP" )
    private String FEEGROUP;
    @JsonProperty(value = "DISCOUNTFEEGROUP" )
    private String DISCOUNTFEEGROUP;
    @JsonProperty(value = "ENWEIGHT" )
    private String ENWEIGHT;
    @JsonProperty(value = "ENAXLECOUNT" )
    private String ENAXLECOUNT;
    @JsonProperty(value = "VLP" )
    private String VLP;
    @JsonProperty(value = "VLPC" )
    private String VLPC;
    @JsonProperty(value = "VEHICLETYPE" )
    private String VEHICLETYPE;
    @JsonProperty(value = "IDENTIFYVEHICLETYPE" )
    private String IDENTIFYVEHICLETYPE;
    @JsonProperty(value = "VEHICLECLASS" )
    private String VEHICLECLASS;
    @JsonProperty(value = "TAC" )
    private String TAC;
    @JsonProperty(value = "TRANSTYPE" )
    private String TRANSTYPE;
    @JsonProperty(value = "TERMINALNO" )
    private String TERMINALNO;
    @JsonProperty(value = "TERMINALTRANSNO" )
    private String TERMINALTRANSNO;
    @JsonProperty(value = "TRANSNO" )
    private String TRANSNO;
    @JsonProperty(value = "SERVICETYPE" )
    private String SERVICETYPE;
    @JsonProperty(value = "ALGORITHMIDENTIFIER" )
    private String ALGORITHMIDENTIFIER;
    @JsonProperty(value = "KEYVERSION" )
    private String KEYVERSION;
    @JsonProperty(value = "ANTENNAID" )
    private String ANTENNAID;
    @JsonProperty(value = "TOLLMODEVER" )
    private String TOLLMODEVER;
    @JsonProperty(value = "TOLLPARAVER" )
    private String TOLLPARAVER;
    @JsonProperty(value = "CONSUMETIME" )
    private String CONSUMETIME;
    @JsonProperty(value = "PASSSTATE" )
    private String PASSSTATE;
    @JsonProperty(value = "ENTOLLLANEID" )
    private String ENTOLLLANEID;
    @JsonProperty(value = "ENTOLLSTATIONHEX" )
    private String ENTOLLSTATIONHEX;
    @JsonProperty(value = "ENTIME" )
    private String ENTIME;
    @JsonProperty(value = "ENLANETYPE" )
    private String ENLANETYPE;
    @JsonProperty(value = "PASSID" )
    private String PASSID;
    @JsonProperty(value = "LASTGANTRYHEX" )
    private String LASTGANTRYHEX;
    @JsonProperty(value = "LASTGANTRYTIME" )
    private String LASTGANTRYTIME;
    @JsonProperty(value = "OBUMAC" )
    private String OBUMAC;
    @JsonProperty(value = "OBUISSUEID" )
    private String OBUISSUEID;
    @JsonProperty(value = "OBUSN" )
    private String OBUSN;
    @JsonProperty(value = "OBUVERSION" )
    private String OBUVERSION;
    @JsonProperty(value = "OBUSTARTDATE" )
    private String OBUSTARTDATE;
    @JsonProperty(value = "OBUENDDATE" )
    private String OBUENDDATE;
    @JsonProperty(value = "OBUELECTRICAL" )
    private String OBUELECTRICAL;
    @JsonProperty(value = "OBUSTATE" )
    private String OBUSTATE;
    @JsonProperty(value = "OBUVLP" )
    private String OBUVLP;
    @JsonProperty(value = "OBUVLPC" )
    private String OBUVLPC;
    @JsonProperty(value = "OBUVEHICLETYPE" )
    private String OBUVEHICLETYPE;
    @JsonProperty(value = "VEHICLEUSERTYPE" )
    private String VEHICLEUSERTYPE;
    @JsonProperty(value = "VEHICLESEAT" )
    private String VEHICLESEAT;
    @JsonProperty(value = "AXLECOUNT" )
    private String AXLECOUNT;
    @JsonProperty(value = "TOTALWEIGHT" )
    private String TOTALWEIGHT;
    @JsonProperty(value = "VEHICLELENGTH" )
    private String VEHICLELENGTH;
    @JsonProperty(value = "VEHICLEWIDTH" )
    private String VEHICLEWIDTH;
    @JsonProperty(value = "VEHICLEHIGHT" )
    private String VEHICLEHIGHT;
    @JsonProperty(value = "CPUNETID" )
    private String CPUNETID;
    @JsonProperty(value = "CPUISSUEID" )
    private String CPUISSUEID;
    @JsonProperty(value = "CPUVLP" )
    private String CPUVLP;
    @JsonProperty(value = "CPUVLPC" )
    private String CPUVLPC;
    @JsonProperty(value = "CPUVEHICLETYPE" )
    private String CPUVEHICLETYPE;
    @JsonProperty(value = "CPUSTARTDATE" )
    private String CPUSTARTDATE;
    @JsonProperty(value = "CPUENDDATE" )
    private String CPUENDDATE;
    @JsonProperty(value = "CPUVERSION" )
    private String CPUVERSION;
    @JsonProperty(value = "CPUCARDTYPE" )
    private String CPUCARDTYPE;
    @JsonProperty(value = "CPUCARDID" )
    private String CPUCARDID;
    @JsonProperty(value = "BALANCEBEFORE" )
    private String BALANCEBEFORE;
    @JsonProperty(value = "BALANCEAFTER" )
    private String BALANCEAFTER;
    @JsonProperty(value = "GANTRYPASSCOUNT" )
    private String GANTRYPASSCOUNT;
    @JsonProperty(value = "GANTRYPASSINFO" )
    private String GANTRYPASSINFO;
    @JsonProperty(value = "FEEPROVINFO" )
    private String FEEPROVINFO;
    @JsonProperty(value = "FEESUMLOCALBEFORE" )
    private String FEESUMLOCALBEFORE;
    @JsonProperty(value = "FEESUMLOCALAFTER" )
    private String FEESUMLOCALAFTER;
    @JsonProperty(value = "FEECALCRESULT" )
    private String FEECALCRESULT;
    @JsonProperty(value = "FEEINFO1" )
    private String FEEINFO1;
    @JsonProperty(value = "FEEINFO2" )
    private String FEEINFO2;
    @JsonProperty(value = "FEEINFO3" )
    private String FEEINFO3;
    @JsonProperty(value = "HOLIDAYSTATE" )
    private String HOLIDAYSTATE;
    @JsonProperty(value = "TRADERESULT" )
    private String TRADERESULT;
    @JsonProperty(value = "SPECIALTYPE" )
    private String SPECIALTYPE;
    @JsonProperty(value = "VERIFYCODE" )
    private String VERIFYCODE;
    @JsonProperty(value = "INTERRUPTSIGNAL" )
    private String INTERRUPTSIGNAL;
    @JsonProperty(value = "VEHICLEPICID" )
    private String VEHICLEPICID;
    @JsonProperty(value = "VEHICLETAILPICID" )
    private String VEHICLETAILPICID;
    @JsonProperty(value = "MATCHSTATUS" )
    private String MATCHSTATUS;
    @JsonProperty(value = "VALIDSTATUS" )
    private String VALIDSTATUS;
    @JsonProperty(value = "DEALSTATUS" )
    private String DEALSTATUS;
    @JsonProperty(value = "RELATEDTRADEID" )
    private String RELATEDTRADEID;
    @JsonProperty(value = "ALLRELATEDTRADEID" )
    private String ALLRELATEDTRADEID;
    @JsonProperty(value = "STATIONDBTIME" )
    private String STATIONDBTIME;
    @JsonProperty(value = "STATIONDEALTIME" )
    private String STATIONDEALTIME;
    @JsonProperty(value = "STATIONVALIDTIME" )
    private String STATIONVALIDTIME;
    @JsonProperty(value = "STATIONMATCHTIME" )
    private String STATIONMATCHTIME;
    @JsonProperty(value = "DESCRIPTION" )
    private String DESCRIPTION;
    @JsonProperty(value = "REQUESTNAME" )
    private String REQUESTNAME;
    @JsonProperty(value = "RESPONSENAME" )
    private String RESPONSENAME;
    @JsonProperty(value = "RECEIVETIME" )
    private String RECEIVETIME;
    @JsonProperty(value = "MSGID" )
    private String MSGID;
    @JsonProperty(value = "SPARE1" )
    private String SPARE1;
    @JsonProperty(value = "SPARE2" )
    private String SPARE2;
    @JsonProperty(value = "SPARE3" )
    private String SPARE3;
    @JsonProperty(value = "SPARE4" )
    private String SPARE4;
    @JsonProperty(value = "RECORDGENTIME" )
    private String RECORDGENTIME;
    @JsonProperty(value = "VERIFYPASSTIME" )
    private String VERIFYPASSTIME;
    @JsonProperty(value = "REMARKS" )
    private String REMARKS;
    @JsonProperty(value = "VEHICLESIGN" )
    private String VEHICLESIGN;
    @JsonProperty(value = "LASTGANTRYHEXFEE" )
    private String LASTGANTRYHEXFEE;
    @JsonProperty(value = "LASTGANTRYHEXPASS" )
    private String LASTGANTRYHEXPASS;
    @JsonProperty(value = "FEECALCSPECIAL" )
    private String FEECALCSPECIAL;
    @JsonProperty(value = "CHARGESSPECIALTYPE" )
    private String CHARGESSPECIALTYPE;
    @JsonProperty(value = "ISFIXDATA" )
    private String ISFIXDATA;
    @JsonProperty(value = "GANTRYTYPE" )
    private String GANTRYTYPE;
    @JsonProperty(value = "OBUPROVFEESUMBEFORE" )
    private String OBUPROVFEESUMBEFORE;
    @JsonProperty(value = "OBUPROVFEESUMAFTER" )
    private String OBUPROVFEESUMAFTER;
    @JsonProperty(value = "CARDFEESUMBEFORE" )
    private String CARDFEESUMBEFORE;
    @JsonProperty(value = "CARDFEESUMAFTER" )
    private String CARDFEESUMAFTER;
    @JsonProperty(value = "NOCARDTIMESBEFORE" )
    private String NOCARDTIMESBEFORE;
    @JsonProperty(value = "NOCARDTIMESAFTER" )
    private String NOCARDTIMESAFTER;
    @JsonProperty(value = "PROVINCENUMBEFORE" )
    private String PROVINCENUMBEFORE;
    @JsonProperty(value = "PROVINCENUMAFTER" )
    private String PROVINCENUMAFTER;
    @JsonProperty(value = "OBUTOTALTRADESUCCNUMBEFORE" )
    private String OBUTOTALTRADESUCCNUMBEFORE;
    @JsonProperty(value = "OBUTOTALTRADESUCCNUMAFTER" )
    private String OBUTOTALTRADESUCCNUMAFTER;
    @JsonProperty(value = "OBUPROVTRADESUCCNUMBEFORE" )
    private String OBUPROVTRADESUCCNUMBEFORE;
    @JsonProperty(value = "OBUPROVTRADESUCCNUMAFTER" )
    private String OBUPROVTRADESUCCNUMAFTER;
    @JsonProperty(value = "OBUTRADERESULT" )
    private String OBUTRADERESULT;
    @JsonProperty(value = "TRADETYPE" )
    private String TRADETYPE;
    @JsonProperty(value = "OBUINFOTYPEREAD" )
    private String OBUINFOTYPEREAD;
    @JsonProperty(value = "OBUINFOTYPEWRITE" )
    private String OBUINFOTYPEWRITE;
    @JsonProperty(value = "OBUPASSSTATE" )
    private String OBUPASSSTATE;
    @JsonProperty(value = "FEEVEHICLETYPE" )
    private String FEEVEHICLETYPE;
    @JsonProperty(value = "OBULASTGANTRYHEX" )
    private String OBULASTGANTRYHEX;
    @JsonProperty(value = "OBULASTGANTRYTIME" )
    private String OBULASTGANTRYTIME;
    @JsonProperty(value = "RATECOMPUTE" )
    private String RATECOMPUTE;
    @JsonProperty(value = "RATEFITCOUNT" )
    private String RATEFITCOUNT;
    @JsonProperty(value = "OBUPAYFEESUMBEFORE" )
    private String OBUPAYFEESUMBEFORE;
    @JsonProperty(value = "OBUPAYFEESUMAFTER" )
    private String OBUPAYFEESUMAFTER;
    @JsonProperty(value = "OBUDISCOUNTFEESUMBEFORE" )
    private String OBUDISCOUNTFEESUMBEFORE;
    @JsonProperty(value = "OBUDISCOUNTFEESUMAFTER" )
    private String OBUDISCOUNTFEESUMAFTER;
    @JsonProperty(value = "FEEMILEAGE" )
    private String FEEMILEAGE;
    @JsonProperty(value = "OBUMILEAGEBEFORE" )
    private String OBUMILEAGEBEFORE;
    @JsonProperty(value = "OBUMILEAGEAFTER" )
    private String OBUMILEAGEAFTER;
    @JsonProperty(value = "PROVMINFEE" )
    private String PROVMINFEE;
    @JsonProperty(value = "FEESPARE1" )
    private String FEESPARE1;
    @JsonProperty(value = "FEESPARE2" )
    private String FEESPARE2;
    @JsonProperty(value = "FEESPARE3BAK" )
    private String FEESPARE3BAK;
    @JsonProperty(value = "FEEPROVBEGINHEX" )
    private String FEEPROVBEGINHEX;
    @JsonProperty(value = "TRADEREADCIPHERTEXT" )
    private String TRADEREADCIPHERTEXT;
    @JsonProperty(value = "READCIPHERTEXTVERIFY" )
    private String READCIPHERTEXTVERIFY;
    @JsonProperty(value = "TRADEWRITECIPHERTEXT" )
    private String TRADEWRITECIPHERTEXT;
    @JsonProperty(value = "OBUFEESUMBEFORE" )
    private String OBUFEESUMBEFORE;
    @JsonProperty(value = "OBUFEESUMAFTER" )
    private String OBUFEESUMAFTER;
    @JsonProperty(value = "OBUPROVPAYFEESUMBEFORE" )
    private String OBUPROVPAYFEESUMBEFORE;
    @JsonProperty(value = "OBUPROVPAYFEESUMAFTER" )
    private String OBUPROVPAYFEESUMAFTER;
    @JsonProperty(value = "PATHFITFLAG" )
    private String PATHFITFLAG;
    @JsonProperty(value = "FEECALCSPECIALS" )
    private String FEECALCSPECIALS;
    @JsonProperty(value = "PAYFEEPROVSUMLOCAL" )
    private String PAYFEEPROVSUMLOCAL;
    @JsonProperty(value = "PCRSUVERSION" )
    private String PCRSUVERSION;
    @JsonProperty(value = "GANTRYPASSINFOAFTER" )
    private String GANTRYPASSINFOAFTER;
    @JsonProperty(value = "UPDATERESULT" )
    private String UPDATERESULT;
    @JsonProperty(value = "CPCFEETRADERESULT" )
    private String CPCFEETRADERESULT;
    @JsonProperty(value = "FEEPROVEF04" )
    private String FEEPROVEF04;
    @JsonProperty(value = "FITPROVFLAG" )
    private String FITPROVFLAG;
    @JsonProperty(value = "GANTRYPASSCOUNTBEFORE" )
    private String GANTRYPASSCOUNTBEFORE;
    @JsonProperty(value = "FEEPROVBEGINHEXFIT" )
    private String FEEPROVBEGINHEXFIT;
    @JsonProperty(value = "FEEPROVBEGINTIMEFIT" )
    private String FEEPROVBEGINTIMEFIT;
    @JsonProperty(value = "TOLLINTERVALSIGN" )
    private String TOLLINTERVALSIGN;
    @JsonProperty(value = "PROVMINFEECALCMODE" )
    private String PROVMINFEECALCMODE;
    @JsonProperty(value = "FEEPROVBEGINTIME" )
    private String FEEPROVBEGINTIME;
    @JsonProperty(value = "FEESUMLOCALAFTEREF04" )
    private String FEESUMLOCALAFTEREF04;
    @JsonProperty(value = "LASTGANTRYFEEPASS" )
    private String LASTGANTRYFEEPASS;
    @JsonProperty(value = "LASTGANTRYMILEPASS" )
    private String LASTGANTRYMILEPASS;
    @JsonProperty(value = "RSUMANUID" )
    private String RSUMANUID;
    @JsonProperty(value = "FEEDATAVERSION" )
    private String FEEDATAVERSION;
    @JsonProperty(value = "GANTRYHEXOPPOTIME" )
    private String GANTRYHEXOPPOTIME;
    @JsonProperty(value = "OBUPAYFEESUMAFTERNOFIT" )
    private String OBUPAYFEESUMAFTERNOFIT;
    @JsonProperty(value = "OBUFEESUMAFTERNOFIT" )
    private String OBUFEESUMAFTERNOFIT;
    @JsonProperty(value = "OBUMILEAGEAFTERNOFIT" )
    private String OBUMILEAGEAFTERNOFIT;
    @JsonProperty(value = "OBUVEHICLEUSERTYPE" )
    private String OBUVEHICLEUSERTYPE;
    @JsonProperty(value = "FEEPROVBEGINHEXBEFORE" )
    private String FEEPROVBEGINHEXBEFORE;
    @JsonProperty(value = "GANTRYFITRESULT" )
    private String GANTRYFITRESULT;
    @JsonProperty(value = "GANTRYFITVERSION" )
    private String GANTRYFITVERSION;
    @JsonProperty(value = "GANTRYFITHEXS" )
    private String GANTRYFITHEXS;
    @JsonProperty(value = "GANTRYFITTOLLS" )
    private String GANTRYFITTOLLS;
    @JsonProperty(value = "GANTRYFITNPROVPAYFEE" )
    private String GANTRYFITNPROVPAYFEE;
    @JsonProperty(value = "GANTRYFITNPROVDISCONTFEE" )
    private String GANTRYFITNPROVDISCONTFEE;
    @JsonProperty(value = "GANTRYFITNPROVREALFEE" )
    private String GANTRYFITNPROVREALFEE;
    @JsonProperty(value = "GANTRYFITNPROVMILES" )
    private String GANTRYFITNPROVMILES;
    @JsonProperty(value = "GANTRYFITNPROVPAYFEEGROUP" )
    private String GANTRYFITNPROVPAYFEEGROUP;
    @JsonProperty(value = "GANTRYFITNPROVDISCONTFEEGROUP" )
    private String GANTRYFITNPROVDISCONTFEEGROUP;
    @JsonProperty(value = "GANTRYFITNPROVREALFEEGROUP" )
    private String GANTRYFITNPROVREALFEEGROUP;
    @JsonProperty(value = "GANTRYFITNPROVPAYFEESUM" )
    private String GANTRYFITNPROVPAYFEESUM;
    @JsonProperty(value = "GANTRYFITNPROVREALFEESUM" )
    private String GANTRYFITNPROVREALFEESUM;
    @JsonProperty(value = "GANTRYFITNPROVMILESUM" )
    private String GANTRYFITNPROVMILESUM;
    @JsonProperty(value = "GANTRYFITNPROVPREREALFEE" )
    private String GANTRYFITNPROVPREREALFEE;
    @JsonProperty(value = "PATHFITDESC" )
    private String PATHFITDESC;
    @JsonProperty(value = "GANTRYFITNEIGHBORPROVCODE" )
    private String GANTRYFITNEIGHBORPROVCODE;
    @JsonProperty(value = "FEESPARE3" )
    private String FEESPARE3;

}
