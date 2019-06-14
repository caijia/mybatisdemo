package com.caijia.entity;

public class MakeBlog {

    private Blog blog;

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public void printBlog() {
        System.out.println("make blog : " + blog.toString());
    }
}
