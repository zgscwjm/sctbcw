package com.sctbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sctbc.entity.Resource;

@Repository
public class ResourceDao {
	@Autowired
	HibernateTemplate hibernateTemplate;

	boolean result = true;
	public List<Resource> getResourceAll() {
		String hql = "from Resource";
		return hibernateTemplate.find(hql);
	}
	public boolean insertResource(Resource resource) {
		try {
			hibernateTemplate.save(resource);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}
	public boolean updateResource(Resource resource) {
		try {
			hibernateTemplate.update(resource);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}
	public boolean delResource(int resourceId) {
		Resource resource = hibernateTemplate.get(Resource.class, resourceId);
		try {
			hibernateTemplate.delete(resource);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}

}
