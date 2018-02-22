package com.sjt.caching;


import org.springframework.cache.annotation.Cacheable;

public class GeneralDao {

   @Cacheable("item")
    public String findItem(String key){
       String result = "ProcessResult : " + key + " result@";
       try {
           Thread.sleep(2200);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
      return result;
   }
  @Cacheable("item")
   public String allItems(){
       String result = "All ITems return...";
       try {
           Thread.sleep(2200);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
      return result;

   }
}
