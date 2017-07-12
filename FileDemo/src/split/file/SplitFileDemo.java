package split.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/**
 * RandomAccessFile
 * 文件的分割。
 * 1.分割的块数
 * 2.分割的大小
 * 3.每块的名称
 * @author user
 *
 *1.第几块，起点，实际大小。
 *2.文件分割。
 *
 */
public class SplitFileDemo {

	private long blockSize;// 每块的大小

	private int size; // 块数

	private String pathFile; // 原文件路径

	private String name;   //原文件名

	private List<String> blockName; // 每块的名字,用于路径

	private long length;

	public SplitFileDemo() {
		blockName = new ArrayList<String>();
	}

	public SplitFileDemo(long blocakSize, String pathFile) {
		this.pathFile = pathFile;
		this.blockSize = 1024;
		init();
	}

	// 计算原文件快数
	public void init() {
		File src = null;
		if (this.pathFile == null || !((src = new File(this.pathFile)).exists())) {
			return;
		}

		if (src.isDirectory()) {
			return;
		}

		this.name = src.getName();

		this.length = src.length();

		if (this.blockSize > this.length) {
			this.blockSize = this.length;
		}

		size = (int) (Math.ceil(length * 1/this.blockSize));

	}

	// 每一块的名字,目标路径
	private void initName(String destPath) {

		for (int i = 0; i < size; i++) {
			this.blockName.add(destPath+"/"+this.name+".part"+i);
		}

	}

	// 第几块，起点，实际大小
	public void split(String destPath) throws IOException { // 分割原文件

        initName(destPath);
		long bengin = 0;
		long actualblockSize = this.blockSize;

		for (int i = 0; i < size; i++) {
           
			if (i == size - 1) {
				actualblockSize = this.length - bengin;
			}

			splitDetail(i, bengin, actualblockSize);

			bengin = bengin + actualblockSize;

		}

	}

	// 分割即文件的拷贝

	public void splitDetail(int index, long bengin, long actualBlockSize) throws IOException {

		File src = new File(this.pathFile);

		File dest = new File(this.blockName.get(index)); // 目标路径

		RandomAccessFile raf = new RandomAccessFile(src, "r");

		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dest));

		raf.seek(bengin);// 读取长度

		int len = 0;

		byte[] flush = new byte[1024];

		while (-1 != (len = raf.read(flush))) {

			if (actualBlockSize - len >= 0) {
				out.write(flush, 0, len);
				actualBlockSize = actualBlockSize - len; // 每次读取就减掉前面的
			}else{

			out.write(flush, 0, (int) actualBlockSize); // 最后一次读取
			break;
			}
		}
		out.flush();
		out.close();
		raf.close();

	}
	/**
	 * 文件的合并
	 * @param args
	 * @throws IOException
	 */
	
	public void maid(String path) throws IOException{
		
		File src = new File(path); //合并路径
		
		OutputStream out = new BufferedOutputStream(new FileOutputStream(src,true)); //要写上true否者会覆盖
		
		for(int i=0;i<blockName.size();i++){
			
		File dest = new File(blockName.get(i));
			
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(dest));
		
		int len=0;
		
		byte[] flush = new byte[1024];
		
		while(-1!=(len = in.read(flush))){
			
			out.write(flush, 0, len);
		}
		
		out.flush();
		in.close();
		}
		out.close();
		
	}
	
	

	public static void main(String[] args) throws IOException {
		
		SplitFileDemo split = new SplitFileDemo(100,"/Users/user/Desktop/PHP");// 要分割文件的路径

		split.split("/Users/user/Desktop/PHP/1.txt"); // 分割完文件的路径
		
		split.maid("/Users/user/Desktop/PHP"); //合并
	}

}
