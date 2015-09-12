package com.sctbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sctbc.constant.Common_Base;
import com.sctbc.constant.Common_News;
import com.sctbc.entity.News;
import com.sctbc.entity.Newstype;
import com.sctbc.server_i.INews;
import com.sctbc.server_i.INewsType;

@Controller
@RequestMapping(Common_Base.COMMON_NEWS_MODULE)
public class NewsController {
	public static final String LISTPATH = "/sctbc/Page/news/list";
	public static final String ADDPATH = "/sctbc/Page/news/add";
	public static final String EDITPATH = "/sctbc/Page/news/edit";

	private static final String ENTITYNAME = "News";

	public boolean result = true;

	@Autowired
	INews iNews;

	@Autowired
	INewsType iNewsType;

	@RequestMapping(value = Common_News.NEWS_GETNEWSALL)
	public String getNewsAll(Model model, Integer page) {
		int count = iNews.getCount(ENTITYNAME);
		if (page == null || page.SIZE < 1) {
			page = 1;
		} else if (page > count / 6) {
			page = count / 6 + 1;
		}
		List<News> newsList = iNews.getListFoPage(ENTITYNAME, page);
		model.addAttribute("nowpage", page);
		model.addAttribute("count", count);
		model.addAttribute("newsList", newsList);
		return LISTPATH;
	}

	@ResponseBody
	@RequestMapping(value = Common_News.NEWS_ADDNEWS)
	public String addNews(Model model, News news, int newsTypeId) {
		Newstype newsType = iNewsType.getById(newsTypeId);
		news.setNewstype(newsType);
		result = iNews.addNews(news);
		return result + "";
	}

	@ResponseBody
	@RequestMapping(value = Common_News.NEWS_EDITNEWS)
	public String editNews(Model model, News news, int newsTypeId) {
		Newstype newsType = iNewsType.getById(newsTypeId);
		news.setNewstype(newsType);
		result = iNews.addNews(news);
		return result + "";
	}

	@ResponseBody
	@RequestMapping(value = Common_News.NEWS_DELNEWS)
	public String delNews(Model model, int id) {
		result = iNews.delById(id);
		return result + "";
	}

	@RequestMapping(value = Common_News.NEWS_ADDNEWSINDEX)
	public String addNewsIndex(Model model) {
		List<Newstype> newsTypeList = iNewsType.getList();
		model.addAttribute("newsTypeList", newsTypeList);
		return ADDPATH;
	}

	@RequestMapping(value = Common_News.NEWS_EDITNEWSINDEX)
	public String editNewsIndex(Model model, int id) {
		List<Newstype> newsTypeList = iNewsType.getList();
		News news = iNews.getById(id);
		model.addAttribute("news", news);
		model.addAttribute("newsTypeList", newsTypeList);
		return EDITPATH;
	}
}
