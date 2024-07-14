# 数据重放器

## 一、项目目标
实现给定预处理输出数据的重放。将数据转换为的 HighLink 系统的预处理输入数据，按照时间顺序，还原实际数据的产生过程，并发送至 Kafka 与 HighLink 系统进行重放实验。

## 二、使用说明

**1. 数据输入**

系统的输入为**已经按照时间顺序排好序**的各类预处理输出数据； 数据清洗、排序工作使用单独的 Python 程序进行处理。目前使用到的输入文件为：
* tbl_EXINCPCWaste_20240712_sort.csv： 出口单省其他交易流水
* tbl_EXINETCWaste_20240712_sort.csv:  出口单省ETC交易流水
* tbl_GantryCPCWaste_20240712_sort.csv： CPC 门架计费流水
* tbl_GantryETCWaste_20240712_sort.csv：ETC 门架计费流水


只有单省数据，且只有门架和出口数据。对 HighLink 系统需要进行调整以进行数据重放，包括：
* 对聚合路径的检验（没有入口数据也视为合法）
* 单省拆分之前的数据检验工作


**2. 使用方式**

（1）Kafka 连接配置，`src\main\resources\kafkaBasic.properties` 中配置 kafka 连接信息

（2）`Main.java` 中指定输入文件。每类数据定义一个文件列表，并据此初始化相应的 datasource, 指定数据中表示时间的属性索引，这也是决定数据发送顺序的依据。最后将所有的 datasource，传入 dataManager 即可。

```java
// 1. 设置文件列表
        List<String> exInCPCFiles = new ArrayList<>(List.of(
                "/Users/csc/code/ReplayEngine/src/main/resources/0712/tbl_EXINCPCWaste_20240712_sort.csv"));

// 2. 初始化 dataSource
        DataSource exInCPCSource = new DataSource(exInCPCFiles, 13, ExitLocalOtherTrans.class);

// 3. 装配 dataManager
DataManager dataManager = new DataManager(List.of(exInCPCSource, exInETCSource, gantryCPCSource, gantryETCSource), defaultSender);
```

