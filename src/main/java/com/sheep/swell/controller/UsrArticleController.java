package com.sheep.swell.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sheep.swell.dto.Article;

@Controller
public class UsrArticleController {
	private List<Article> articles;
	
	public UsrArticleController() {
		articles = new ArrayList<>();
		
		articles.add(new Article(1,"2020-1212 12:12:12","제목1", "내용111111111111"));
		articles.add(new Article(2,"2020-1212 12:12:12","제목2", "내용222222222222"));
	}
	@RequestMapping("/usr/article/list")
	@ResponseBody
	public List<Article> showList() {
		return articles;
	}
	@RequestMapping("/usr/article/detail")
	@ResponseBody
	public Article showDetail(int id) {
		return articles.get(id-1);
	}
}
