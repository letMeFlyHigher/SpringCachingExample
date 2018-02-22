package com.sjt.caching;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestGeneralDao {
    public static void main(String[] args){
        ApplicationContext ctx = new
                AnnotationConfigApplicationContext(AppConfig.class);
        GeneralDao gDao = ctx.getBean(GeneralDao.class);
        long start = System.currentTimeMillis();
        String rs1 = gDao.findItem(
                "nihaoa"
        );
        long end = System.currentTimeMillis();
        System.out.println("rs1: " + rs1 + " runtime : " + (end-start) + "ms");
        start = System.currentTimeMillis();
        String rs2 = gDao.findItem("nihaob");
        end = System.currentTimeMillis();
        System.out.println("rs2: " + rs2 + " runtime : " + (end-start) + "ms");

        start = System.currentTimeMillis();
        String rs3 = gDao.findItem("nihaob");
        end = System.currentTimeMillis();
        System.out.println("rs3: " + rs3 + " runtime : " + (end-start) + "ms");


        start = System.currentTimeMillis();
        String rs5 = gDao.allItems();
        end = System.currentTimeMillis();
        System.out.println("rs5: " + rs5 + " runtime : " + (end-start) + "ms");

        start = System.currentTimeMillis();
        String rs6 = gDao.allItems();
        end = System.currentTimeMillis();
        System.out.println("rs6: " + rs6 + " runtime : " + (end-start) + "ms");

        start = System.currentTimeMillis();
        String rs4 = gDao.findItem("nihaoa");
        end = System.currentTimeMillis();
        System.out.println("rs4: " + rs4 + " runtime : " + (end-start) + "ms");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        start = System.currentTimeMillis();
        String rs7 = gDao.findItem("nihaoa");
        end = System.currentTimeMillis();
        System.out.println("rs7: " + rs7 + " runtime : " + (end-start) + "ms");

    }
}
