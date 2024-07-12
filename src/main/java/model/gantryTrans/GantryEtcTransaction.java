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
public class GantryEtcTransaction implements ResultTransaction {
    public String ALGORITHMIDENTIFIER;
    public String CARDTOTALAMOUNT;
    public String DESCRIPTION;
    public String DIRECTION;
    public String DISCOUNTFEE;
    public String DISCOUNTTYPE;
    public String ELECTRICALPERCENTAGE;
    public String ENAXLECOUNT;
    public String ENTIME;
    public String ENTOLLLANEID;
    public String ENWEIGHT;
    public String ETCCARDID;
    public String ETCCARDNET;
    public String ETCCARDTYPE;
    public String FEE;
    public String FEECALCSPECIALS;
    public String GANTRYHEX;
    public String GANTRYKEY;
    public String GANTRYTYPE;
    public String GANTRYVERIFY;
    public String GENTIME;
    public String ID;
    public String IDENTIFYVEHICLETYPE;
    public String IDENTIFYVLP;
    public String IDENTIFYVLPC;
    public String INSPLITFLAG;
    public String KEYVERSION;
    public String NOCARDCOUNT;
    public String OBUID;
    public String OBUMAC;
    public String OBUPROVINCEFEE;
    public String OBUSIGN;
    public String OBUSN;
    public String OBUTOTALAMOUNT;
    public String ORIGINALFLAG;
    public String ORIGINFEE;
    public String PASSID;
    public String PAYFEE;
    public String PROVINCECOUNT;
    public String PROVINCEDISCOUNTFEE;
    public String PROVTRANSCOUNT;
    public String RATEVERSION;
    public String REMARKS;
    public String SECTIONID;
    public String SECTIONNAME;
    public String SPARE1;
    public String SPARE2;
    public String SPARE3;
    public String STATUS;
    public String SUMTIME;
    public String TAC;
    public String TERMINALNO;
    public String TERMINALTRANSNO;
    public String TOLLGANTRYID;
    public String TOLLINTERVALDISCOUNTFEE;
    public String TOLLINTERVALFEE;
    public String TOLLINTERVALID;
    public String TOLLINTERVALNAME;
    public String TOLLINTERVALPAYFEE;
    public String TOLLINTERVALSIGN;
    public String TOTALCOUNT;
    public String TRANSFEE;
    public String TRANSNUM;
    public String TRANSTIME;
    public String TRANSTYPE;
    public String TYPE;
    public String UNIONPAYFLAG;
    public String UNIONPAYTYPEGROUP;
    public String VEHICLECLASS;
    public String VEHICLESEAT;
    public String VEHICLESIGN;
    public String VEHICLESIGNID;
    public String VEHICLETYPE;
    public String VLP;
    public String VLPC;

    @Override
    public String toRawTrans() throws JsonProcessingException {
        GantryRawTransaction gantryRawTransaction = GantryRawMapper.INSTANCE.etcGantry2Raw(this);
        return MapperUtils.mapper.writeValueAsString(gantryRawTransaction);
    }
}
