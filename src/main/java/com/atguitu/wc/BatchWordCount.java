package com.atguitu.wc;

import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.operators.DataSource;

/**
 * @author acevenus
 * @create 2023-04-03  00:20
 * @describe
 */
public class BatchWordCount {
    public static void main(String[] args) {
        //1.创建执行环境
         ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();

         //2.从文件读取数据
        DataSource<String> lineDataSource = env.readTextFile("input/words.txt");
        System.out.println(lineDataSource);
        for (int i = 0; i <  ; i++) {

        }
        //3.将每行数据进行分词，转换成二元组类型
        lineDataSource.flatMap()



    }
}
