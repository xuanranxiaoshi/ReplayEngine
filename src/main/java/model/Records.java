package model;

import dataSource.DataSource;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @description:
 * @author：jimi
 * @date: 2024/7/16
 * @Copyright：
 */
@AllArgsConstructor
@Data
public class Records implements Comparable<Records> {
    private String key;
    private String data;
    private long timeStamp;
    private DataSource dataSource;
    @Override
    public int compareTo(Records o) {
        return (int) (this.timeStamp - o.timeStamp);
    }

}