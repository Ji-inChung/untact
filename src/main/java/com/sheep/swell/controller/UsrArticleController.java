package com.sheep.swell.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sheep.swell.dto.Article;

@Controller
public class UsrArticleController {

	@RequestMapping("/usr/article/list")
	@ResponseBody
	public String showList() {
		return "안녕하세요";
	}
	@RequestMapping("/usr/article/detail")
	@ResponseBody
	public Article showDetail(int id) {
		Article article = new Article(1,"2020-1212 12:12:12","제목1", "내용1");
		return article;
	}
}
