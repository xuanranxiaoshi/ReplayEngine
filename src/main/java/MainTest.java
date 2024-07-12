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
public class MainTest {

    public static void main(String[] args) throws IOException {

        // 设置文件列表
        List<String> exCrossCPCFiles = new ArrayList<>(List.of(
                "/Users/csc/code/ReplayEngine/src/main/resources/sorted/tbl_ExCrossCPCWaste_20231121_sorted.csv",
                "/Users/csc/code/ReplayEngine/src/main/resources/sorted/tbl_ExCrossCPCWaste_20231122_sorted.csv"));
        List<String> exCrossETCFiles = new ArrayList<>(List.of(
                "/Users/csc/code/ReplayEngine/src/main/resources/sorted/tbl_exCrossETCWaste_20231121_sorted.csv",
                "/Users/csc/code/ReplayEngine/src/main/resources/sorted/tbl_exCrossETCWaste_20231122_sorted.csv"));
        List<String> exInCPCFiles = new ArrayList<>(List.of(
                "/Users/csc/code/ReplayEngine/src/main/resources/sorted/tbl_exInCPCWaste_20231121_sorted.csv",
                "/Users/csc/code/ReplayEngine/src/main/resources/sorted/tbl_exInCPCWaste_20231122_sorted.csv"));
        List<String> exInETCFiles = new ArrayList<>(List.of(
                "/Users/csc/code/ReplayEngine/src/main/resources/sorted/tbl_exInETCWaste_20231121_sorted.csv",
                "/Users/csc/code/ReplayEngine/src/main/resources/sorted/tbl_exInETCWaste_20231122_sorted.csv"));
        List<String> gantryCPCFiles= new ArrayList<>(List.of(
                "/Users/csc/code/ReplayEngine/src/main/resources/sorted/tbl_GantryCPCWaste_20231121_sorted.csv",
                "/Users/csc/code/ReplayEngine/src/main/resources/sorted/tbl_GantryCPCWaste_20231122_sorted.csv"));
        List<String> gantryETCFiles = new ArrayList<>(List.of(
                "/Users/csc/code/ReplayEngine/src/main/resources/sorted/tbl_GantryETCWaste_20231121_sorted.csv",
                "/Users/csc/code/ReplayEngine/src/main/resources/sorted/tbl_GantryETCWaste_20231122_sorted.csv"));


        // 初始化 dataSource
        DataSource exCrossCPCSource = new DataSource(exCrossCPCFiles, 13, ExitForeignOtherTrans.class);
        DataSource exCrossETCSource = new DataSource(exCrossETCFiles, 14, ExitForeignETCTrans.class);
        DataSource exInCPCSource = new DataSource(exInCPCFiles, 13, ExitLocalOtherTrans.class);
        DataSource exInETCSource = new DataSource(exInETCFiles, 14, ExitLocalETCTrans.class);
        DataSource gantryCPCSource = new DataSource(gantryCPCFiles, 8, GantryCpcTransaction.class);
        DataSource gantryETCSource = new DataSource(gantryETCFiles, 25, GantryEtcTransaction.class);

        // 装配 datasource
//        DefaultSender defaultSender = new DefaultSender();
        FileSender defaultSender = new FileSender("output.txt");
        DataManager dataManager = new DataManager(List.of(gantryCPCSource), defaultSender);
//        DataManager dataManager = new DataManager(List.of(exCrossCPCSource, exCrossETCSource), defaultSender);
//        DataManager dataManager = new DataManager(List.of(exCrossCPCSource, exCrossETCSource, exInCPCSource), defaultSender);
//        DataManager dataManager = new DataManager(List.of(exCrossCPCSource, exCrossETCSource, exInCPCSource, exInETCSource), defaultSender);
//        DataManager dataManager = new DataManager(List.of(exCrossCPCSource, exCrossETCSource, exInCPCSource, exInETCSource, gantryCPCSource), defaultSender);
//        DataManager dataManager = new DataManager(List.of(exCrossCPCSource, exCrossETCSource, exInCPCSource, exInETCSource, gantryCPCSource, gantryETCSource), defaultSender);


        dataManager.execute();

        System.out.println(dataManager.getNum());
    }
}
