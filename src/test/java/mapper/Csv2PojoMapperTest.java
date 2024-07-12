package mapper;

import com.opencsv.bean.*;
import model.exitTrans.ExitForeignOtherTrans;

import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

/**
 * @Author: csc
 * @Description: TODO
 * @DateTime: 2024/7/10 17:53
 **/

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Csv2PojoMapperTest {

    private static long num = 0;

    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.out.println("Usage: java CsvToPojoExample <csv-file-path>");
            return;
        }

        String csvFilePath = args[0];
        Path filePath = Paths.get(csvFilePath);

        try (Reader reader = Files.newBufferedReader(filePath)){
            HeaderColumnNameMappingStrategy<ExitForeignOtherTrans> strategy = new HeaderColumnNameMappingStrategy<>();
            strategy.setType(ExitForeignOtherTrans.class);

            CsvToBean<ExitForeignOtherTrans> csvToBean = new CsvToBeanBuilder<ExitForeignOtherTrans>(reader)
                    .withMappingStrategy(strategy)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            Iterator<ExitForeignOtherTrans> iterator = csvToBean.iterator();

            while (iterator.hasNext()) {
                num ++;
                ExitForeignOtherTrans record = iterator.next();
                System.out.println(num + ": " + record.toString());
                // 在这里处理每个记录
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}