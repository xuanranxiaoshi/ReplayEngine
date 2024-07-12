package mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.ResultTransaction;
import model.exitTrans.ExitForeignETCTrans;
import model.exitTrans.ExitForeignOtherTrans;
import model.exitTrans.ExitLocalETCTrans;
import model.exitTrans.ExitLocalOtherTrans;
import model.gantryTrans.GantryCpcTransaction;
import model.gantryTrans.GantryEtcTransaction;

/**
 * @Author: csc
 * @Description: 将 json 转换为相应的预处理输出实体类
 * @DateTime: 2024/7/12 13:13
 **/
public class ResultMapperFactory {


    public static ObjectMapper mapper;

    static {
        mapper = new ObjectMapper();
        mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);// 忽略字段大小写
    }

    // 根据 json，将不同的数据转化为相应的对象
    public static ResultTransaction fromJson(JsonNode json, Class<?> clazz) throws JsonProcessingException {

        String simpleName = clazz.getSimpleName();

        switch (simpleName) {
            case "ExitForeignETCTrans" -> {
//                System.out.println("ExitForeignETCTrans.java");
                return mapper.treeToValue(json, ExitForeignETCTrans.class);
            }
            case "ExitForeignOtherTrans" -> {
//                System.out.println("ExitForeignOtherTrans.java");
                return mapper.treeToValue(json, ExitForeignOtherTrans.class);
            }
            case "ExitLocalETCTrans" -> {
//                System.out.println("ExitLocalETCTrans.java");
                return mapper.treeToValue(json, ExitLocalETCTrans.class);
            }
            case "ExitLocalOtherTrans" -> {
//                System.out.println("ExitLocalOtherTrans.java");
                return mapper.treeToValue(json, ExitLocalOtherTrans.class);
            }
            case "GantryCpcTransaction" -> {
//                System.out.println("GantryCpcTransaction.java");
                return mapper.treeToValue(json, GantryCpcTransaction.class);
            }
            case "GantryEtcTransaction" -> {
//                System.out.println("GantryEtcTransaction.java");
                return mapper.treeToValue(json, GantryEtcTransaction.class);
            }
        }

        return null;
    }

}
