package com.sctbc.server_i;

import java.util.List;


public  interface IBaseServer<T> {

	public T getById(int id);

	public List<T> getList();

	public boolean delById(int id);

	public boolean upData(T t);

	public List<T> getListFoPage(String EntityName, Integer nowpage);

	public Integer getCount(String EntityName);
}
