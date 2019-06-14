package com.caijia;

import com.caijia.entity.Blog;

public interface BlogMapper {
//  @Select("SELECT * FROM blog WHERE id = #{id}")
  Blog selectBlog(int id);
}