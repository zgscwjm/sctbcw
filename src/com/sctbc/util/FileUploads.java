package com.sctbc.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
public class FileUploads {
	public long getFileSize(File f) throws Exception// 取得文件夹大小
	{
		long size = 0;
		File flist[] = f.listFiles();
		for (int i = 0; i < flist.length; i++) {
			if (flist[i].isDirectory()) {
				size = size + getFileSize(flist[i]);
			} else {
				size = size + flist[i].length();
			}
		}
		return size;
	}
	public String insert(HttpServletRequest request,
			HttpServletResponse response, String diskPath) throws Exception {
		DiskFileItemFactory disk = new DiskFileItemFactory();// 初始化上传文件磁盘对象
		int max = 1024 * 1024 * 7 * 1024;// 限制上环文件大小为5M
		int cache = 1024 * 100 * 5 * 1024;// 缓存的大小为500kb
		disk.setSizeThreshold(cache);// 设置加入文件缓存大小

		String saveName = null;
		String savepath = request.getSession().getServletContext()
				.getRealPath(diskPath)
				+ "/";// 上传文件的路径
		System.out.println("path:" + savepath);
		File f = new File(savepath);
		long fileSize = 1024 * 1024 * 2 * 1024 * 1024; // 2M
		//
		System.out.println("文件大小：" + getFileSize(f));
		//
		if (!f.exists()) {// 判断文件上传的路径是否不存在
			f.mkdirs();
		}
		disk.setRepository(f);
		ServletFileUpload sfu = new ServletFileUpload(disk);
		sfu.setSizeMax(max);// 设置上传文件文件大小
		List<FileItem> list = null;// 存储上文件信息的集合
		Map<String, Object> map = new HashMap<String, Object>();
		try {

			list = sfu.parseRequest(request);
		} catch (FileUploadException e) {
			e.printStackTrace();
		}
		for (FileItem fileItem : list) {
			if (fileItem.isFormField()) {// 判断如果现在获取参数是来自于普通from参数，除<input
											// type="file">以外
				String fieldname = fileItem.getFieldName();// 参数名
				String value = fileItem.getString("utf-8");// 获取用户填写的参数值；
				map.put(fieldname, value); // 页面中获取参数放入到map集合
			} else {
				String fileName = fileItem.getName();// 上传文件名字
				// String[] suffixs = new
				// String[]{".jpg","bmp","jpeg","png","SVG","numbers","xlsx","xls"};//图片后缀要啥子要啥子放啥子
				// SuffixFileFilter filter = new
				// SuffixFileFilter(suffixs);//创建文件后缀名过滤器

				System.out.print("fileName:" + fileName);
				File file = new File(savepath, fileName);
				// boolean res = filter.accept(file);
				if (!"".equals(fileName)) {
					/*
					 * 上传文件需要做两个步骤判断 1.如果上传的文件就在缓冲里面，则我们就可以直接将缓存文件写入到服务器上面
					 * 2.如果文件大于缓存大小，我们就需要利用IO流来完成写入服务器的操作
					 */

					Date date = new Date();
					saveName = new SimpleDateFormat("yyyyMMddHHmmss")
							.format(date)
							+ fileName.substring(fileName.indexOf("."))
									.toLowerCase();
					// FileOutputStream fos=new
					// FileOutputStream(savepath+""+fileName);
					FileOutputStream fos = new FileOutputStream(savepath + ""
							+ saveName);
					InputStream is = null;
					if (fileItem.isInMemory()) {
						fos.write(fileItem.get());// 直接将缓存中二进制写入到服务器上
					} else {
						is = fileItem.getInputStream();//
						int i = -1;
						byte[] b = new byte[1024 * 5];
						while ((i = is.read(b)) != -1) {

							fos.write(b, 0, i);
						}
						is.close();
						fos.flush();
						fos.close();
					}
				} else {
					return "error";
				}
			}
		}
		/*
		 * NewsDao newsDao = new NewsDao(); newsDao.addnews(map);
		 */
		return saveName;
	}

}
