package model.gantryTrans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.Data;
import mapper.MapperUtils;
import mapper.rawmapper.GantryRawMapper;
import model.ResultTransaction;
import model.rawTrans.GantryRawTransaction;

@Data
// 忽略未知字段
@JsonIgnoreProperties(ignoreUnknown = true)
public class GantryCpcTransaction implements ResultTransaction {
    @JsonProperty("TRADEID")
    private String TRADEID;
    @JsonProperty("GANTRYID")
    private String GANTRYID;
    @JsonProperty("ORIGINALFLAG")
    private String ORIGINALFLAG;
    @JsonProperty("COMPUTERORDER")
    private String COMPUTERORDER;
    @JsonProperty("HOURBATCHNO")
    private String HOURBATCHNO;
    @JsonProperty("GANTRYORDERNUM")
    private String GANTRYORDERNUM;
    @JsonProperty("GANTRYHEX")
    private String GANTRYHEX;
    @JsonProperty("GANTRYHEXOPPOSITE")
    private String GANTRYHEXOPPOSITE;
    @JsonProperty("TRANSTIME")
    private String TRANSTIME;
    @JsonProperty("PAYFEE")
    private String PAYFEE;
    @JsonProperty("FEE")
    private String FEE;
    @JsonProperty("DISCOUNTFEE")
    private String DISCOUNTFEE;
    @JsonProperty("TRANSFEE")
    private String TRANSFEE;
    @JsonProperty("MEDIATYPE")
    private String MEDIATYPE;
    @JsonProperty("OBUSIGN")
    private String OBUSIGN;
    @JsonProperty("TOLLINTERVALID")
    private String TOLLINTERVALID;
    @JsonProperty("PAYFEEGROUP")
    private String PAYFEEGROUP;
    @JsonProperty("FEEGROUP")
    private String FEEGROUP;
    @JsonProperty("DISCOUNTFEEGROUP")
    private String DISCOUNTFEEGROUP;
    @JsonProperty("ENWEIGHT")
    private String ENWEIGHT;
    @JsonProperty("ENAXLECOUNT")
    private String ENAXLECOUNT;
    @JsonProperty("VLP")
    private String VLP;
    @JsonProperty("VLPC")
    private String VLPC;
    @JsonProperty("VEHICLETYPE")
    private String VEHICLETYPE;
    @JsonProperty("IDENTIFYVEHICLETYPE")
    private String IDENTIFYVEHICLETYPE;
    @JsonProperty("VEHICLECLASS")
    private String VEHICLECLASS;
    @JsonProperty("TAC")
    private String TAC;
    @JsonProperty("TRANSTYPE")
    private String TRANSTYPE;
    @JsonProperty("TERMINALNO")
    private String TERMINALNO;
    @JsonProperty("TERMINALTRANSNO")
    private String TERMINALTRANSNO;
    @JsonProperty("TRANSNO")
    private String TRANSNO;
    @JsonProperty("SERVICETYPE")
    private String SERVICETYPE;
    @JsonProperty("ALGORITHMIDENTIFIER")
    private String ALGORITHMIDENTIFIER;
    @JsonProperty("KEYVERSION")
    private String KEYVERSION;
    @JsonProperty("ANTENNAID")
    private String ANTENNAID;
    @JsonProperty("TOLLMODEVER")
    private String TOLLMODEVER;
    @JsonProperty("TOLLPARAVER")
    private String TOLLPARAVER;
    @JsonProperty("CONSUMETIME")
    private String CONSUMETIME;
    @JsonProperty("PASSSTATE")
    private String PASSSTATE;
    @JsonProperty("ENTOLLLANEID")
    private String ENTOLLLANEID;
    @JsonProperty("ENTOLLSTATIONHEX")
    private String ENTOLLSTATIONHEX;
    @JsonProperty("ENTIME")
    private String ENTIME;
    @JsonProperty("ENLANETYPE")
    private String ENLANETYPE;
    @JsonProperty("PASSID")
    private String PASSID;
    @JsonProperty("LASTGANTRYHEX")
    private String LASTGANTRYHEX;
    @JsonProperty("LASTGANTRYTIME")
    private String LASTGANTRYTIME;
    @JsonProperty("OBUMAC")
    private String OBUMAC;
    @JsonProperty("OBUISSUEID")
    private String OBUISSUEID;
    @JsonProperty("OBUSN")
    private String OBUSN;
    @JsonProperty("OBUVERSION")
    private String OBUVERSION;
    @JsonProperty("OBUSTARTDATE")
    private String OBUSTARTDATE;
    @JsonProperty("OBUENDDATE")
    private String OBUENDDATE;
    @JsonProperty("OBUELECTRICAL")
    private String OBUELECTRICAL;
    @JsonProperty("OBUSTATE")
    private String OBUSTATE;
    @JsonProperty("OBUVLP")
    private String OBUVLP;
    @JsonProperty("OBUVLPC")
    private String OBUVLPC;
    @JsonProperty("OBUVEHICLETYPE")
    private String OBUVEHICLETYPE;
    @JsonProperty("VEHICLEUSERTYPE")
    private String VEHICLEUSERTYPE;
    @JsonProperty("VEHICLESEAT")
    private String VEHICLESEAT;
    @JsonProperty("AXLECOUNT")
    private String AXLECOUNT;
    @JsonProperty("TOTALWEIGHT")
    private String TOTALWEIGHT;
    @JsonProperty("VEHICLELENGTH")
    private String VEHICLELENGTH;
    @JsonProperty("VEHICLEWIDTH")
    private String VEHICLEWIDTH;
    @JsonProperty("VEHICLEHIGHT")
    private String VEHICLEHIGHT;
    @JsonProperty("CPUNETID")
    private String CPUNETID;
    @JsonProperty("CPUISSUEID")
    private String CPUISSUEID;
    @JsonProperty("CPUVLP")
    private String CPUVLP;
    @JsonProperty("CPUVLPC")
    private String CPUVLPC;
    @JsonProperty("CPUVEHICLETYPE")
    private String CPUVEHICLETYPE;
    @JsonProperty("CPUSTARTDATE")
    private String CPUSTARTDATE;
    @JsonProperty("CPUENDDATE")
    private String CPUENDDATE;
    @JsonProperty("CPUVERSION")
    private String CPUVERSION;
    @JsonProperty("CPUCARDTYPE")
    private String CPUCARDTYPE;
    @JsonProperty("CPUCARDID")
    private String CPUCARDID;
    @JsonProperty("BALANCEBEFORE")
    private String BALANCEBEFORE;
    @JsonProperty("BALANCEAFTER")
    private String BALANCEAFTER;
    @JsonProperty("GANTRYPASSCOUNT")
    private String GANTRYPASSCOUNT;
    @JsonProperty("GANTRYPASSINFO")
    private String GANTRYPASSINFO;
    @JsonProperty("FEEPROVINFO")
    private String FEEPROVINFO;
    @JsonProperty("FEESUMLOCALBEFORE")
    private String FEESUMLOCALBEFORE;
    @JsonProperty("FEESUMLOCALAFTER")
    private String FEESUMLOCALAFTER;
    @JsonProperty("FEECALCRESULT")
    private String FEECALCRESULT;
    @JsonProperty("FEEINFO1")
    private String FEEINFO1;
    @JsonProperty("FEEINFO2")
    private String FEEINFO2;
    @JsonProperty("FEEINFO3")
    private String FEEINFO3;
    @JsonProperty("HOLIDAYSTATE")
    private String HOLIDAYSTATE;
    @JsonProperty("TRADERESULT")
    private String TRADERESULT;
    @JsonProperty("SPECIALTYPE")
    private String SPECIALTYPE;
    @JsonProperty("VERIFYCODE")
    private String VERIFYCODE;
    @JsonProperty("INTERRUPTSIGNAL")
    private String INTERRUPTSIGNAL;
    @JsonProperty("VEHICLEPICID")
    private String VEHICLEPICID;
    @JsonProperty("VEHICLETAILPICID")
    private String VEHICLETAILPICID;
    @JsonProperty("MATCHSTATUS")
    private String MATCHSTATUS;
    @JsonProperty("VALIDSTATUS")
    private String VALIDSTATUS;
    @JsonProperty("DEALSTATUS")
    private String DEALSTATUS;
    @JsonProperty("RELATEDTRADEID")
    private String RELATEDTRADEID;
    @JsonProperty("ALLRELATEDTRADEID")
    private String ALLRELATEDTRADEID;
    @JsonProperty("STATIONDBTIME")
    private String STATIONDBTIME;
    @JsonProperty("STATIONDEALTIME")
    private String STATIONDEALTIME;
    @JsonProperty("STATIONVALIDTIME")
    private String STATIONVALIDTIME;
    @JsonProperty("STATIONMATCHTIME")
    private String STATIONMATCHTIME;
    @JsonProperty("DESCRIPTION")
    private String DESCRIPTION;
    @JsonProperty("RECEIVETIME")
    private String RECEIVETIME;
    @JsonProperty("POINTTYPE")
    private String POINTTYPE;
    @JsonProperty("VERIFYPASSTIME")
    private String VERIFYPASSTIME;
    @JsonProperty("GANTRYTYPE")
    private String GANTRYTYPE;
    @JsonProperty("RATECOMPUTE")
    private String RATECOMPUTE;
    @JsonProperty("RATEFITCOUNT")
    private String RATEFITCOUNT;
    @JsonProperty("OBUPAYFEESUMBEFORE")
    private String OBUPAYFEESUMBEFORE;
    @JsonProperty("OBUPAYFEESUMAFTER")
    private String OBUPAYFEESUMAFTER;
    @JsonProperty("OBUDISCOUNTFEESUMBEFORE")
    private String OBUDISCOUNTFEESUMBEFORE;
    @JsonProperty("OBUDISCOUNTFEESUMAFTER")
    private String OBUDISCOUNTFEESUMAFTER;
    @JsonProperty("OBUFEESUMBEFORE")
    private String OBUFEESUMBEFORE;
    @JsonProperty("OBUFEESUMAFTER")
    private String OBUFEESUMAFTER;
    @JsonProperty("OBUPROVFEESUMBEFORE")
    private String OBUPROVFEESUMBEFORE;
    @JsonProperty("OBUPROVFEESUMAFTER")
    private String OBUPROVFEESUMAFTER;
    @JsonProperty("CARDFEESUMBEFORE")
    private String CARDFEESUMBEFORE;
    @JsonProperty("CARDFEESUMAFTER")
    private String CARDFEESUMAFTER;
    @JsonProperty("NOCARDTIMESBEFORE")
    private String NOCARDTIMESBEFORE;
    @JsonProperty("NOCARDTIMESAFTER")
    private String NOCARDTIMESAFTER;
    @JsonProperty("PROVINCENUMBEFORE")
    private String PROVINCENUMBEFORE;
    @JsonProperty("PROVINCENUMAFTER")
    private String PROVINCENUMAFTER;
    @JsonProperty("OBUTOTALTRADESUCCNUMBEFORE")
    private String OBUTOTALTRADESUCCNUMBEFORE;
    @JsonProperty("OBUTOTALTRADESUCCNUMAFTER")
    private String OBUTOTALTRADESUCCNUMAFTER;
    @JsonProperty("OBUPROVTRADESUCCNUMBEFORE")
    private String OBUPROVTRADESUCCNUMBEFORE;
    @JsonProperty("OBUPROVTRADESUCCNUMAFTER")
    private String OBUPROVTRADESUCCNUMAFTER;
    @JsonProperty("OBUTRADERESULT")
    private String OBUTRADERESULT;
    @JsonProperty("TRADETYPE")
    private String TRADETYPE;
    @JsonProperty("OBUINFOTYPEREAD")
    private String OBUINFOTYPEREAD;
    @JsonProperty("OBUINFOTYPEWRITE")
    private String OBUINFOTYPEWRITE;
    @JsonProperty("OBUPASSSTATE")
    private String OBUPASSSTATE;
    @JsonProperty("FEEVEHICLETYPE")
    private String FEEVEHICLETYPE;
    @JsonProperty("OBULASTGANTRYHEX")
    private String OBULASTGANTRYHEX;
    @JsonProperty("OBULASTGANTRYTIME")
    private String OBULASTGANTRYTIME;
    @JsonProperty("FEEMILEAGE")
    private String FEEMILEAGE;
    @JsonProperty("OBUMILEAGEBEFORE")
    private String OBUMILEAGEBEFORE;
    @JsonProperty("OBUMILEAGEAFTER")
    private String OBUMILEAGEAFTER;
    @JsonProperty("PROVMINFEE")
    private String PROVMINFEE;
    @JsonProperty("FEESPARE1")
    private String FEESPARE1;
    @JsonProperty("FEESPARE2")
    private String FEESPARE2;
    @JsonProperty("FEESPARE3BAK")
    private String FEESPARE3BAK;
    @JsonProperty("FEEPROVBEGINHEX")
    private String FEEPROVBEGINHEX;
    @JsonProperty("PROVMINFEECALCMODE")
    private String PROVMINFEECALCMODE;
    @JsonProperty("FEEPROVBEGINTIME")
    private String FEEPROVBEGINTIME;
    @JsonProperty("FEESUMLOCALAFTEREF04")
    private String FEESUMLOCALAFTEREF04;
    @JsonProperty("LASTGANTRYFEEPASS")
    private String LASTGANTRYFEEPASS;
    @JsonProperty("LASTGANTRYMILEPASS")
    private String LASTGANTRYMILEPASS;
    @JsonProperty("INSPLITFLAG")
    private String INSPLITFLAG;
    @JsonProperty("RECORDGENTIME")
    private String RECORDGENTIME;
    @JsonProperty("VEHICLESIGN")
    private String VEHICLESIGN;
    @JsonProperty("LASTGANTRYHEXFEE")
    private String LASTGANTRYHEXFEE;
    @JsonProperty("FEECALCSPECIAL")
    private String FEECALCSPECIAL;
    @JsonProperty("CHARGESSPECIALTYPE")
    private String CHARGESSPECIALTYPE;
    @JsonProperty("ISFIXDATA")
    private String ISFIXDATA;
    @JsonProperty("MSGID")
    private String MSGID;
    @JsonProperty("TRADEREADCIPHERTEXT")
    private String TRADEREADCIPHERTEXT;
    @JsonProperty("READCIPHERTEXTVERIFY")
    private String READCIPHERTEXTVERIFY;
    @JsonProperty("TRADEWRITECIPHERTEXT")
    private String TRADEWRITECIPHERTEXT;
    @JsonProperty("OBUPROVPAYFEESUMBEFORE")
    private String OBUPROVPAYFEESUMBEFORE;
    @JsonProperty("OBUPROVPAYFEESUMAFTER")
    private String OBUPROVPAYFEESUMAFTER;
    @JsonProperty("PATHFITFLAG")
    private String PATHFITFLAG;
    @JsonProperty("FEECALCSPECIALS")
    private String FEECALCSPECIALS;
    @JsonProperty("PAYFEEPROVSUMLOCAL")
    private String PAYFEEPROVSUMLOCAL;
    @JsonProperty("PCRSUVERSION")
    private String PCRSUVERSION;
    @JsonProperty("GANTRYPASSINFOAFTER")
    private String GANTRYPASSINFOAFTER;
    @JsonProperty("UPDATERESULT")
    private String UPDATERESULT;
    @JsonProperty("CPCFEETRADERESULT")
    private String CPCFEETRADERESULT;
    @JsonProperty("FEEPROVEF04")
    private String FEEPROVEF04;
    @JsonProperty("FITPROVFLAG")
    private String FITPROVFLAG;
    @JsonProperty("GANTRYPASSCOUNTBEFORE")
    private String GANTRYPASSCOUNTBEFORE;
    @JsonProperty("FEEPROVBEGINHEXFIT")
    private String FEEPROVBEGINHEXFIT;
    @JsonProperty("FEEPROVBEGINTIMEFIT")
    private String FEEPROVBEGINTIMEFIT;
    @JsonProperty("TOLLINTERVALSIGN")
    private String TOLLINTERVALSIGN;
    @JsonProperty("RSUMANUID")
    private String RSUMANUID;
    @JsonProperty("FEEDATAVERSION")
    private String FEEDATAVERSION;
    @JsonProperty("GANTRYHEXOPPOTIME")
    private String GANTRYHEXOPPOTIME;
    @JsonProperty("OBUPAYFEESUMAFTERNOFIT")
    private String OBUPAYFEESUMAFTERNOFIT;
    @JsonProperty("OBUFEESUMAFTERNOFIT")
    private String OBUFEESUMAFTERNOFIT;
    @JsonProperty("OBUMILEAGEAFTERNOFIT")
    private String OBUMILEAGEAFTERNOFIT;
    @JsonProperty("OBUVEHICLEUSERTYPE")
    private String OBUVEHICLEUSERTYPE;
    @JsonProperty("FEEPROVBEGINHEXBEFORE")
    private String FEEPROVBEGINHEXBEFORE;
    @JsonProperty("GANTRYFITRESULT")
    private String GANTRYFITRESULT;
    @JsonProperty("GANTRYFITVERSION")
    private String GANTRYFITVERSION;
    @JsonProperty("GANTRYFITHEXS")
    private String GANTRYFITHEXS;
    @JsonProperty("GANTRYFITTOLLS")
    private String GANTRYFITTOLLS;
    @JsonProperty("GANTRYFITNPROVPAYFEE")
    private String GANTRYFITNPROVPAYFEE;
    @JsonProperty("GANTRYFITNPROVDISCONTFEE")
    private String GANTRYFITNPROVDISCONTFEE;
    @JsonProperty("GANTRYFITNPROVREALFEE")
    private String GANTRYFITNPROVREALFEE;
    @JsonProperty("GANTRYFITNPROVMILES")
    private String GANTRYFITNPROVMILES;
    @JsonProperty("GANTRYFITNPROVPAYFEEGROUP")
    private String GANTRYFITNPROVPAYFEEGROUP;
    @JsonProperty("GANTRYFITNPROVDISCONTFEEGROUP")
    private String GANTRYFITNPROVDISCONTFEEGROUP;
    @JsonProperty("GANTRYFITNPROVREALFEEGROUP")
    private String GANTRYFITNPROVREALFEEGROUP;
    @JsonProperty("GANTRYFITNPROVPAYFEESUM")
    private String GANTRYFITNPROVPAYFEESUM;
    @JsonProperty("GANTRYFITNPROVREALFEESUM")
    private String GANTRYFITNPROVREALFEESUM;
    @JsonProperty("GANTRYFITNPROVMILESUM")
    private String GANTRYFITNPROVMILESUM;
    @JsonProperty("GANTRYFITNPROVPREREALFEE")
    private String GANTRYFITNPROVPREREALFEE;
    @JsonProperty("PATHFITDESC")
    private String PATHFITDESC;
    @JsonProperty("GANTRYFITNEIGHBORPROVCODE")
    private String GANTRYFITNEIGHBORPROVCODE;
    @JsonProperty("FEESPARE3")
    private String FEESPARE3;
    @JsonProperty("LASTGANTRYHEXPASS")
    private String LASTGANTRYHEXPASS;

    @Override
    public String toRawTrans() throws JsonProcessingException {
        GantryRawTransaction gantryRawTransaction = GantryRawMapper.INSTANCE.cpcGantry2Raw(this);
        return MapperUtils.mapper.writeValueAsString(gantryRawTransaction);
    }
}
