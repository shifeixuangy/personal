package com.sfx.spring.theory.data;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: sfx
 * @date: 2024/8/22 10:57
 */
public class AreaHandle {

    public static void main(String[] args) {

         String source ="洼子村,\n" +
                 "小郭家村,\n" +
                 "布家村,\n" +
                 "冯家村,\n" +
                 "后刘村,\n" +
                 "后王村,\n" +
                 "颜家村,\n" +
                 "刘安然村,\n" +
                 "前王村,\n" +
                 "方家村,\n" +
                 "前刘村,\n" +
                 "小王家村,\n" +
                 "白家圈村,\n" +
                 "靳家道口村,\n" +
                 "大王村,\n" +
                 "唐庙北街村,\n" +
                 "李村,\n" +
                 "卢村,\n" +
                 "宋家村,\n" +
                 "南玉皇庙村,\n" +
                 "西屯村,\n" +
                 "金王家村,\n" +
                 "东屯村,\n" +
                 "仝家村,\n" +
                 "贺家铺村,\n" +
                 "小辛庄村,\n" +
                 "王家庵村,\n" +
                 "李洪亭村,\n" +
                 "闫家村,\n" +
                 "马庄村,\n" +
                 "董家村,\n" +
                 "米桥村,\n" +
                 "太平官庄村,\n" +
                 "商桥村";
        List<String> xx = Arrays.asList(source.split(","));
        List<String> areaList =xx.stream().map(e->{
            return e.trim();
        }).collect(Collectors.toList());
        String filePath = "/Users/shifeixuan/exception_rule.sql";
        Long initLft =282179510L;
        int initCode =14;
        // 使用 try-with-resources 语句，确保 BufferedWriter 能够自动关闭
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            StringBuilder sqlText = new StringBuilder();
            sqlText.append("INSERT INTO ty_authority_db.sys_area (lft,rgt,name,code,`type`,free_areas_number,longitudes,latitudes,creator_id,data_change_create_time,modifier_id,data_change_last_time,remarks,del_flag) VALUES");
            sqlText.append("\n");
            for (int i = 0; i < areaList.size(); i++) {

                sqlText.append("(");
                sqlText.append(initLft++);
                sqlText.append(",");
                sqlText.append(initLft++);
                sqlText.append(",");
                sqlText.append("'" +areaList.get(i)+"'");
                sqlText.append(",");
                sqlText.append("'A07B13C08D04E"+(14+i) +"'");
                sqlText.append(",");
                sqlText.append("6,0,NULL,NULL,1,'2024-08-22 12:00:00',1,'2024-08-22 12:00:00',NULL,0),");
                sqlText.append("\n");
            }


            writer.newLine();
            writer.write(sqlText.toString());

            System.out.println("文本已成功写入文件：" + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
