package com.sctbc.server_i;

import java.util.List;

import com.sctbc.entity.Traininfo;

public interface ITrainInfo  {

	/***
	 * 得到培训信息实例
	 * 
	 * @param id
	 * @return
	 */
	public Traininfo getTraininfoById(int id);

	/**
	 * 得到所以培训信息
	 * 
	 * @return
	 */
	public List<Traininfo> getTraininfoList();


	/**
	 * 添加培训信息
	 * 
	 * @param traininfo
	 * @return
	 */
	public boolean addTraininfo(Traininfo trainInfo);

	/**
	 * 删除
	 * 
	 * @param traininfo
	 * @return
	 */
	public boolean delTraininfo(Traininfo traininfo);
}
