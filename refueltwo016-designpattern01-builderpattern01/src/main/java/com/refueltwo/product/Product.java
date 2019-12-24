package com.refueltwo.product;

/**
 * @ClassName Product
 * @See
 * @Author tanji
 * @Date 2019/12/24 16:30
 * @Version V1.0
 **/
//房子
public class Product {
      private String partA;//房子中的楼梯
      private String partB;//房子中的厨房
      private String partC;//房子中的过道

    public String getPartA() {
        return partA;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public String getPartC() {
        return partC;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }
    public void show(){
     String reture="partA->楼梯:"+partA+",partB->厨房:"+partB+",partC->过道"+ partC;
        System.out.println(reture);
    }

}
