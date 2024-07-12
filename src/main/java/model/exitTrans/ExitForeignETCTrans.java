package model.exitTrans;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.Data;
import mapper.MapperUtils;
import mapper.rawmapper.ExitRawMapper;
import model.ResultTransaction;
import model.rawTrans.ExitRawTransaction;

@Data
public class ExitForeignETCTrans implements ResultTransaction {
    public String ID;
    public String MODIFYFLAG;
    public String MULTIPROVINCE;
    public String MEDIATYPE;
    public String MEDIANO;
    public String TRANSPAYTYPE;
    public String TOLLPROVINCEID;
    public String ISSUERID;
    public String OBUSIGN;
    public String IDENTIFICATION;
    public String OBUID;
    public String ETCCARDTYPE;
    public String ETCCARDNET;
    public String ETCCARDID;
    public String EXTIME;
    public String VLP;
    public String VLPC;
    public String IDENTIFYVLP;
    public String IDENTIFYVLPC;
    public String VEHICLESIGNID;
    public String VEHICLETYPE;
    public String VEHICLECLASS;
    public String TAC;
    public String TRANSFEE;
    public String TRANSTYPE;
    public String PAYCARDTRANSN;
    public String TERMINALTRANSNO;
    public String TERMINALNO;
    public String PREBALANCE;
    public String POSTBALANCE;
    public String DESCRIPTION;
    public String LANESPINFO;
    public String SPINFO;
    public String SPECIALTYPE;
    public String ENTOLLSTATIONNAME;
    public String ENTOLLSTATION;
    public String ENTOLLLANE;
    public String ENTOLLSTATIONID;
    public String ENTOLLLANEID;
    public String ENTOLLSTATIONHEX;
    public String ENTOLLLANEHEX;
    public String ENVLP;
    public String ENVLPC;
    public String ENTIME;
    public String ENWEIGHT;
    public String ENAXLECOUNT;
    public String EXTOLLSTATIONNAME;
    public String EXTOLLSTATION;
    public String EXTOLLLANE;
    public String EXTOLLSTATIONID;
    public String EXTOLLLANEID;
    public String EXTOLLSTATIONHEX;
    public String EXTOLLLANEHEX;
    public String EXWEIGHT;
    public String AXLECOUNT;
    public String CARDCOSTFEE;
    public String UNPAYFEE;
    public String UNPAYFLAG;
    public String UNPAYCARDCOST;
    public String TICKETFEE;
    public String UNIFIEDFEE;
    public String TRANSCODE;
    public String SHIFT;
    public String OPERID;
    public String OPERNAME;
    public String LANEAPPVER;
    public String ELECTRICALPERCENTAGE;
    public String PARAVER;
    public String CHECKSIGN;
    public String OPEN;
    public String LANETYPE;
    public String BL_SUBCENTER;
    public String BL_CENTER;
    public String LDATE;
    public String BATCHNUM;
    public String PASSID;
    public String VEHICLESIGN;
    public String PAYFEE;
    public String FEE;
    public String DISCOUNTFEE;
    public String NOCARDCOUNT;
    public String FEEMILEAGE;
    public String SHORTFEE;
    public String SHORTFEEMILEAGE;
    public String EXITFEETYPE;
    public String SPCRATEVERSION;
    public String CARDTOTALAMOUNT;
    public String OBUTOTALAMOUNT;
    public String OBUTOTALDISCOUNTAMOUNT;
    public String OBUPROVINCEFEE;
    public String TOTALCOUNT;
    public String PROVTRANSCOUNT;
    public String PROVINCECOUNT;
    public String DISCOUNTTYPE;
    public String PROVINCEDISCOUNTFEE;
    public String ORIGINFEE;
    public String SIGNSTATUS;
    public String ROADTYPE;
    public String VERIFYPASSTIME;
    public String STATIONRECEIVETIME;
    public String RECEIVETIME;
    public String GENTIME;
    public String MESSAGEID;
    public String REMARKS;
    public String STATUS;
    public String RESPONSECODE;
    public String RESPONSEINFO;
    public String NATIONRECEIVETIME;
    public String PROTIME;
    public String BATCHFILENAME;
    public String CHARGESTATUS;
    public String ISSUECHARGETIME;
    public String CHARGERECEIVETIME;
    public String CHARGETIME;
    public String DISPUTEDTYPE;
    public String DISPUTEDDESC;
    public String DISPUTEDPROTIME;
    public String DISPUTEDVERSION;
    public String NATIONCLEARDATE;
    public String NATIONCLEARFLAG;
    public String NATIONCLEARTIME;
    public String SPLITINFEE;
    public String SPLITCROSSFEE;
    public String NATIONSPLITTIME;
    public String NATIONSPLITTYPE;
    public String SPLITFLAG;
    public String PROSPLITTIME;
    public String PROSPLITTYPE;
    public String SPLITOWNERCOUNT;
    public String SPLITOWNERGROUP;
    public String SPLITOWNERFEEGROUP;
    public String SPLITOWNERPAYFEEGROUP;
    public String SPLITOWNERDISFEEGROUP;
    public String SPLITCHECKFLAG;
    public String SPLITCNT;
    public String SPLITFEE;
    public String REALSPLITCNT;
    public String SPLITREMARK;
    public String CLEARDATE;
    public String CLEARFLAG;
    public String CLEARREMARK;
    public String SPARE1;
    public String SPARE2;
    public String SPARE3;
    public String CHARGEFEE;
    public String CHARGEDISCOUNTTYPE;
    public String CHARGEPROVINCEDISCOUNTFEE;
    public String CHARGERORIGINFEE;
    public String FEERATE;
    public String SPLITOWNERGROUP1;
    public String SPLITOWNERGROUP2;
    public String SECFREETYPE;
    public String SECPRORESULT;
    public String SECPROTIME;
    public String SECBEFFEE;
    public String SECFREEFEE;
    public String ORIGINALFLAG;
    public String PACKTIME;
    public String SPLITCHECKDATE;
    public String SPLITCHECKSTATUS;
    public String SPLITCHECKTIME;
    public String VACCINEFLAG;
    public String APPOINTID;
    public String CHARGEAPPOINTID;

    @Override
    public String toRawTrans() throws JsonProcessingException {
        ExitRawTransaction exitRawTransaction = ExitRawMapper.INSTANCE.exitForeignETCTrans2Raw(this);
        return MapperUtils.mapper.writeValueAsString(exitRawTransaction);
    }
}