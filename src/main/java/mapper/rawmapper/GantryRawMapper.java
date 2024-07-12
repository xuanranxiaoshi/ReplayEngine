package mapper.rawmapper;

import model.gantryTrans.GantryCpcTransaction;
import model.gantryTrans.GantryEtcTransaction;
import model.rawTrans.GantryRawTransaction;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @Author: csc
 * @Description: 实现 CPC 门架和 ETC 门架向 GantryRawTrans 的转换
 * @DateTime: 2024/7/10 17:14
 **/

@Mapper
public interface GantryRawMapper {

    GantryRawMapper INSTANCE = Mappers.getMapper(GantryRawMapper.class);

    @Mapping(source = "ID", target = "TRADEID")
    @Mapping(source = "TOLLINTERVALFEE", target = "FEEGROUP")
    @Mapping(source = "TOLLINTERVALPAYFEE", target = "PAYFEEGROUP")
    @Mapping(source = "TOLLINTERVALDISCOUNTFEE", target = "DISCOUNTFEEGROUP")
    GantryRawTransaction etcGantry2Raw(GantryEtcTransaction etcTransaction);

    GantryRawTransaction cpcGantry2Raw(GantryCpcTransaction cpcTransaction);


}
