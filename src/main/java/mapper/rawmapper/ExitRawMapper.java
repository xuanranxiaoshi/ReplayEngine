package mapper.rawmapper;

import model.exitTrans.ExitForeignETCTrans;
import model.exitTrans.ExitForeignOtherTrans;
import model.exitTrans.ExitLocalETCTrans;
import model.exitTrans.ExitLocalOtherTrans;
import model.rawTrans.ExitRawTransaction;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @Author: csc
 * @Description: 实现预处理出口数据到原始出口数据的映射
 * @DateTime: 2024/7/10 17:26
 **/

@Mapper
public interface ExitRawMapper {

    ExitRawMapper INSTANCE = Mappers.getMapper(ExitRawMapper.class);

    ExitRawTransaction exitForeignETCTrans2Raw(ExitForeignETCTrans exitForeignETCTrans);

    ExitRawTransaction exitForeignOtherTrans2Raw(ExitForeignOtherTrans exitForeignOtherTrans);

    ExitRawTransaction exitLocalETCTrans2Raw(ExitLocalETCTrans exitLocalETCTrans);

    ExitRawTransaction exitLocalOtherTrans2Raw(ExitLocalOtherTrans exitLocalOtherTrans);
}
