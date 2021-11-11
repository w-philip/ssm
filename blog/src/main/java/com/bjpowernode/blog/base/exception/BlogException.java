package com.bjpowernode.blog.base.exception;

/**
 * Company :  北京动力节点
 * Author :   Andy
 * Date : 2021/7/19
 * Description :
 */
public class BlogException extends RuntimeException {

    private BlogEnum blogEnum;

    public BlogException(BlogEnum blogEnum) {
        //想从异常堆栈中获取异常信息的话
        super(blogEnum.getMessage());
        this.blogEnum = blogEnum;
    }
}
