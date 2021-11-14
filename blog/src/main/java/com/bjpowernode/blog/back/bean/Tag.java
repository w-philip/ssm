package com.bjpowernode.blog.back.bean;

import lombok.Data;
import lombok.ToString;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;


@Data
@ToString
@Table(name = "t_tag")
@NameStyle(Style.normal)
public class Tag {

    @Id
    private String tid;
    private String tname;
    private String cid;
}
