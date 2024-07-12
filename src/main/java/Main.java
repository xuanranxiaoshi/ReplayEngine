import dataSource.DataManager;
import dataSource.DataSource;
import model.exitTrans.ExitForeignETCTrans;
import model.exitTrans.ExitForeignOtherTrans;
import model.exitTrans.ExitLocalETCTrans;
import model.exitTrans.ExitLocalOtherTrans;
import model.gantryTrans.GantryCpcTransaction;
import model.gantryTrans.GantryEtcTransaction;
import sender.DefaultSender;
import sender.FileSender;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: csc
 * @DateTime: 2024/7/11 18:44
 **/
public class Main {

    public static void main(String[] args) throws IOException {

        // 设置文件列表
        List<String> exInCPCFiles = new ArrayList<>(List.of(
                "/Users/csc/code/ReplayEngine/src/main/resources/0712/tbl_EXINCPCWaste_20240712_sort.csv"));
        List<String> exInETCFiles = new ArrayList<>(List.of(
                "/Users/csc/code/ReplayEngine/src/main/resources/0712/tbl_EXINETCWaste_20240712_sort.csv"));
        List<String> gantryCPCFiles= new ArrayList<>(List.of(
                "/Users/csc/code/ReplayEngine/src/main/resources/0712/tbl_GantryCPCWaste_20240712_sort.csv"));
        List<String> gantryETCFiles = new ArrayList<>(List.of(
                "/Users/csc/code/ReplayEngine/src/main/resources/0712/tbl_GantryETCWaste_20240712_sort.csv"));


        // 初始化 dataSource
        DataSource exInCPCSource = new DataSource(exInCPCFiles, 13, ExitLocalOtherTrans.class);
        DataSource exInETCSource = new DataSource(exInETCFiles, 14, ExitLocalETCTrans.class);
        DataSource gantryCPCSource = new DataSource(gantryCPCFiles, 8, GantryCpcTransaction.class);
        DataSource gantryETCSource = new DataSource(gantryETCFiles, 25, GantryEtcTransaction.class);

        // 装配 datasource
        FileSender defaultSender = new FileSender("output.txt");
//        DataManager dataManager = new DataManager(List.of(exInCPCSource, exInETCSource, gantryCPCSource, gantryETCSource), defaultSender);
        DataManager dataManager = new DataManager(List.of(exInCPCSource, exInETCSource), defaultSender);

        dataManager.execute();

        System.out.println(dataManager.getNum());
    }
}
