package com.bjpowernode.blog.back.service;

import com.bjpowernode.blog.back.bean.Article;

import java.util.List;

public interface ArticleService {
    List<Article> list(String uid,String title);

    void isOpen(Article article);

}
