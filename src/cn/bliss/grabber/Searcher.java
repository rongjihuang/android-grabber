package cn.bliss.grabber;

import java.io.IOException;
import java.util.List;

/**
 * 抓取项搜索器接口
 * 
 * @author dragon|rongjihuang@gmail.com
 * 
 */
public interface Searcher {
	/**
	 * 搜索抓取项
	 * 
	 * @return 搜索到的抓取项列表
	 * @throws IOException
	 */
	List<Item> list() throws IOException;

	/**
	 * 获取名称
	 * 
	 * @return
	 */
	String getName();

	/**
	 * 获取保存路径
	 * 
	 * @return
	 */
	String getPath();

	/**
	 * 获取标识符
	 * 
	 * @return
	 */
	String getUid();
}
