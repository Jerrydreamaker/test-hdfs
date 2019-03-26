import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class HdfsTest {
	Configuration conf = new Configuration();
	FileSystem fs=null;
	public void upload() throws IllegalArgumentException, IOException {
		//conf.set("fs.defaultFS", "hdfs://192.168.1.231:8020");
		//conf.addDefaultResource("core-site.xml");
		conf.addResource("core-site.xml");
		fs= FileSystem.get(conf);
		//fs.copyFromLocalFile(new Path("C:\\Users\\y500\\Desktop\\hdfs.png"), new Path("/demo"));
		System.out.println(fs.getConf().getResource("fs.defaultFS"));
		System.out.println(fs.exists(new Path("/demo")));
		System.out.println("ppjpo");
	}
	public static void main(String[] args) throws IllegalArgumentException, IOException {
		new HdfsTest().upload();
	}
}
