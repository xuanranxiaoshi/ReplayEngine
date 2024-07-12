package model;

import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * @Author: csc
 * @Description: TODO
 * @DateTime: 2024/7/12 14:04
 **/
public interface ResultTransaction {

    String toRawTrans() throws JsonProcessingException;
}
