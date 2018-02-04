package com.ljc555.hadoop.hdfsclientdemo.hdfs;

import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class HdfsClientDemo {

    public static void main(String[] args) throws IOException {

        Configuration conf = new Configuration();
        conf.set("fs.defaultFS","hdfs://hadoopmaster01:9000");

        // 拿到一个文件系统操作的客户端实例对象
        FileSystem fs = FileSystem.get(conf);
        fs.copyFromLocalFile(new Path("d:/hdfsclientdemo.txt"),new Path("/hdfsclientdemo.tst"));
        fs.close();
    }

}
