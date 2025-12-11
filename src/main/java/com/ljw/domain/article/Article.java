package com.ljw.domain.article;

public class Article {
   public int id;
   public String title;
   public String content;

   @Override
   public String toString() {
      return  "{id:%d,title:%s,contents:%s }".formatted(id,title,content);
   }
}
