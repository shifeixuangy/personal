package com.sfx.spring.theory.data;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class OmsExceptionRule {

    public static void main(String[] args) {
      String  source ="402,\n" +
              "403,\n" +
              "404,\n" +
              "405,\n" +
              "406,\n" +
              "407,\n" +
              "408,\n" +
              "409,\n" +
              "410,\n" +
              "411,\n" +
              "412,\n" +
              "413,\n" +
              "414,\n" +
              "415,\n" +
              "416,\n" +
              "417,\n" +
              "418,\n" +
              "419,\n" +
              "420,\n" +
              "421,\n" +
              "422,\n" +
              "423,\n" +
              "424,\n" +
              "425,\n" +
              "426,\n" +
              "427,\n" +
              "428,\n" +
              "429,\n" +
              "430,\n" +
              "431,\n" +
              "432,\n" +
              "433,\n" +
              "434,\n" +
              "435,\n" +
              "436,\n" +
              "437,\n" +
              "438,\n" +
              "439,\n" +
              "440,\n" +
              "441,\n" +
              "442,\n" +
              "443,\n" +
              "444,\n" +
              "445,\n" +
              "446,\n" +
              "447,\n" +
              "448,\n" +
              "449,\n" +
              "450,\n" +
              "451,\n" +
              "452,\n" +
              "453,\n" +
              "454,\n" +
              "455,\n" +
              "456,\n" +
              "457,\n" +
              "458,\n" +
              "459,\n" +
              "460,\n" +
              "461,\n" +
              "462,\n" +
              "463,\n" +
              "464,\n" +
              "465,\n" +
              "466,\n" +
              "467,\n" +
              "468,\n" +
              "469,\n" +
              "470,\n" +
              "471,\n" +
              "472,\n" +
              "473,\n" +
              "474,\n" +
              "475,\n" +
              "476,\n" +
              "477,\n" +
              "478,\n" +
              "479,\n" +
              "480,\n" +
              "481,\n" +
              "482,\n" +
              "483,\n" +
              "484,\n" +
              "485,\n" +
              "486,\n" +
              "487,\n" +
              "488,\n" +
              "489,\n" +
              "490,\n" +
              "491,\n" +
              "492,\n" +
              "493,\n" +
              "494,\n" +
              "495,\n" +
              "496,\n" +
              "497,\n" +
              "498,\n" +
              "499,\n" +
              "500,\n" +
              "501,\n" +
              "502,\n" +
              "503,\n" +
              "504,\n" +
              "505,\n" +
              "506,\n" +
              "507,\n" +
              "508,\n" +
              "509,\n" +
              "510,\n" +
              "511,\n" +
              "512,\n" +
              "513,\n" +
              "514,\n" +
              "515,\n" +
              "516,\n" +
              "517,\n" +
              "518,\n" +
              "519,\n" +
              "520,\n" +
              "521,\n" +
              "522,\n" +
              "523,\n" +
              "524,\n" +
              "525,\n" +
              "526,\n" +
              "527,\n" +
              "528,\n" +
              "529,\n" +
              "530,\n" +
              "531,\n" +
              "532,\n" +
              "533,\n" +
              "534,\n" +
              "535,\n" +
              "536,\n" +
              "537,\n" +
              "538,\n" +
              "539,\n" +
              "540,\n" +
              "541,\n" +
              "542,\n" +
              "543,\n" +
              "544,\n" +
              "545,\n" +
              "546,\n" +
              "547,\n" +
              "548,\n" +
              "549,\n" +
              "550,\n" +
              "551,\n" +
              "552,\n" +
              "553,\n" +
              "554,\n" +
              "555,\n" +
              "556,\n" +
              "557,\n" +
              "558,\n" +
              "559,\n" +
              "560,\n" +
              "561,\n" +
              "562,\n" +
              "563,\n" +
              "564,\n" +
              "565,\n" +
              "566,\n" +
              "567,\n" +
              "568,\n" +
              "569,\n" +
              "570,\n" +
              "571,\n" +
              "572,\n" +
              "573,\n" +
              "574,\n" +
              "575,\n" +
              "576,\n" +
              "577,\n" +
              "578,\n" +
              "579,\n" +
              "580,\n" +
              "581,\n" +
              "582,\n" +
              "583,\n" +
              "584,\n" +
              "585,\n" +
              "586,\n" +
              "587,\n" +
              "588,\n" +
              "589,\n" +
              "590,\n" +
              "591,\n" +
              "592,\n" +
              "593,\n" +
              "594,\n" +
              "595,\n" +
              "596,\n" +
              "597,\n" +
              "598,\n" +
              "599,\n" +
              "600,\n" +
              "601,\n" +
              "602,\n" +
              "603,\n" +
              "604,\n" +
              "605,\n" +
              "606,\n" +
              "607,\n" +
              "608,\n" +
              "609,\n" +
              "610,\n" +
              "611,\n" +
              "612,\n" +
              "613,\n" +
              "614,\n" +
              "615,\n" +
              "616,\n" +
              "617,\n" +
              "618,\n" +
              "619,\n" +
              "620,\n" +
              "621,\n" +
              "622,\n" +
              "623,\n" +
              "624,\n" +
              "625,\n" +
              "626,\n" +
              "627,\n" +
              "628,\n" +
              "629,\n" +
              "630,\n" +
              "631,\n" +
              "632,\n" +
              "633,\n" +
              "634,\n" +
              "635,\n" +
              "636,\n" +
              "637,\n" +
              "638,\n" +
              "639,\n" +
              "640,\n" +
              "641,\n" +
              "642,\n" +
              "643,\n" +
              "644,\n" +
              "645,\n" +
              "646,\n" +
              "647,\n" +
              "648,\n" +
              "649,\n" +
              "650,\n" +
              "651,\n" +
              "652,\n" +
              "653,\n" +
              "654,\n" +
              "655,\n" +
              "656,\n" +
              "657,\n" +
              "658,\n" +
              "659,\n" +
              "660,\n" +
              "661,\n" +
              "662,\n" +
              "663,\n" +
              "664,\n" +
              "665,\n" +
              "666,\n" +
              "667,\n" +
              "668,\n" +
              "669,\n" +
              "670,\n" +
              "671,\n" +
              "672,\n" +
              "673,\n" +
              "674,\n" +
              "675,\n" +
              "676,\n" +
              "677,\n" +
              "678,\n" +
              "679,\n" +
              "680,\n" +
              "681,\n" +
              "682,\n" +
              "683,\n" +
              "684";

     List<String> xx = Arrays.asList(source.split(","));
     List<String> set =xx.stream().map(e->{

         return e.trim();
     }).collect(Collectors.toList());
        String filePath = "/Users/shifeixuan/exception_rule.sql";

        // 使用 try-with-resources 语句，确保 BufferedWriter 能够自动关闭
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            StringBuilder sqlText = new StringBuilder();
            sqlText.append("INSERT INTO ty_oms_db.t_tenant_project_exception_rule_sub (rule_id,is_open,config_type,exception_type_name,whitelist_str,distance_not_exceeding,earlier_than_plan_start_time,late_than_plan_start_time,check_in_clock_start,check_in_clock_end,two_work_order_interval,single_work_order_duration,photo_num_min,service_person_hours_max,service_object_hours_max,service_content_min,service_exception_position,service_interval_json,long_time_no_track,del_flag) VALUES");
            sqlText.append("\n");
            set.stream().forEach(value->{
//                sqlText.append("(");
//                sqlText.append(value);
//                sqlText.append(",0,25,'服务对象定位异常',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,500,NULL,NULL,0),");
//                sqlText.append("\n");
//
//                sqlText.append("(");
//                sqlText.append(value);
//                sqlText.append(",0,27,'疑似服务中异常',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,500,NULL,NULL,0),");
//                sqlText.append("\n");


                sqlText.append("(");
                sqlText.append(value);
                sqlText.append(",0,23,'语音评价时间过短',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0),");
                sqlText.append("\n");

                sqlText.append("(");
                sqlText.append(value);
                sqlText.append(",0,24,'服务中修改定位',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0),");
                sqlText.append("\n");

                sqlText.append("(");
                sqlText.append(value);
                sqlText.append(",0,28,'长时间无轨迹异常',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,30,0),");
                sqlText.append("\n");


            });
            writer.newLine();
            writer.write(sqlText.toString());

            System.out.println("文本已成功写入文件：" + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(set);





    }
}



