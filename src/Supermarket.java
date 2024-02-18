import entity.Apple;
import entity.Fruits;
import entity.Mango;
import entity.Strawberry;

import java.math.BigDecimal;
import java.util.Scanner;

public class Supermarket {

  public static void main(String[] args) {
        //SupermarketOne();
        //SupermarketTwo();
        //SupermarketThree();
        SupermarketFour();
    }
    //1、有一家超市，出售苹果和草莓。其中苹果 8 元/斤，草莓 13 元/斤。
    //现在顾客 A 在超市购买了若干斤苹果和草莓，需要计算一共多少钱？
    //请编写函数，对于 A 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
    public static void SupermarketOne(){
        Apple apple = new Apple(new BigDecimal("8.0"),new BigDecimal("0.0"));
        Strawberry strawberry = new Strawberry(new BigDecimal("13.0"),new BigDecimal("0.0"));
        BigDecimal sum = new BigDecimal("0.0");
        Scanner scanner = new Scanner(System.in);
        for (int i =0;i< 2 ; i++){
            if(i == 0){
                System.out.println("请输入购买苹果多少斤:");
                BigDecimal weight = scanner.nextBigDecimal();
                apple.setWeight(weight);
                sum = sum.add(calculate(apple));
            }else {
                System.out.println("请输入购买草莓多少斤:");
                BigDecimal weight = scanner.nextBigDecimal();
                strawberry.setWeight(weight);
                sum = sum.add(calculate(strawberry));
            }
        }
        System.out.println("你一共需要付款：" + sum);
    }

//    2、超市增加了一种水果芒果，其定价为 20 元/斤。
//    现在顾客 B 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
//    请编写函数，对于 B 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
    public static void SupermarketTwo(){
        Apple apple = new Apple(new BigDecimal("8.0"),new BigDecimal("0.0"));
        Strawberry strawberry = new Strawberry(new BigDecimal("13.0"),new BigDecimal("0.0"));
        Mango mango = new Mango(new BigDecimal("20.0"),new BigDecimal("0.0"));
        BigDecimal sum = new BigDecimal("0.0");
        Scanner scanner = new Scanner(System.in);
        for (int i =0;i< 3 ; i++){
            if(i == 0){
                System.out.println("请输入购买苹果多少斤:");
                BigDecimal weight = scanner.nextBigDecimal();
                apple.setWeight(weight);
                sum = sum.add(calculate(apple));
            }else if(i == 1){
                System.out.println("请输入购买草莓多少斤:");
                BigDecimal weight = scanner.nextBigDecimal();
                strawberry.setWeight(weight);
                sum = sum.add(calculate(strawberry));
            }else{
                System.out.println("请输入购买芒果多少斤:");
                BigDecimal weight = scanner.nextBigDecimal();
                mango.setWeight(weight);
                sum = sum.add(calculate(mango));
            }
        }
        System.out.println("你一共需要付款：" + sum);
    }
    //      3、超市做促销活动，草莓限时打 8 折。
    //    现在顾客 C 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
    //    请编写函数，对于 C 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
    public static void SupermarketThree(){
        Apple apple = new Apple(new BigDecimal("8.0"),new BigDecimal("0.0"));
        Strawberry strawberry = new Strawberry(new BigDecimal("13.0"),new BigDecimal("0.0"));
        Mango mango = new Mango(new BigDecimal("20.0"),new BigDecimal("0.0"));
        BigDecimal sum = new BigDecimal("0.0");
        Scanner scanner = new Scanner(System.in);
        for (int i =0;i< 3 ; i++){
            if(i == 0){
                System.out.println("请输入购买苹果多少斤:");
                BigDecimal weight = scanner.nextBigDecimal();
                apple.setWeight(weight);
                sum = sum.add(calculate(apple));
            }else if(i == 1){
                System.out.println("请输入购买草莓多少斤:");
                BigDecimal weight = scanner.nextBigDecimal();
                strawberry.setWeight(weight);
                sum = sum.add(calculate(strawberry).multiply(new BigDecimal("0.8")));
            }else{
                System.out.println("请输入购买芒果多少斤:");
                BigDecimal weight = scanner.nextBigDecimal();
                mango.setWeight(weight);
                sum = sum.add(calculate(mango));
            }
        }
        System.out.println("你一共需要付款：" + sum);
    }
//    4、促销活动效果明显，超市继续加大促销力度，购物满 100 减 10 块。
//    现在顾客 D 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
//    请编写函数，对于 D 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
    public static void SupermarketFour(){
        Apple apple = new Apple(new BigDecimal("8.0"),new BigDecimal("0.0"));
        Strawberry strawberry = new Strawberry(new BigDecimal("13.0"),new BigDecimal("0.0"));
        Mango mango = new Mango(new BigDecimal("20.0"),new BigDecimal("0.0"));
        BigDecimal sum = new BigDecimal("0.0");
        Scanner scanner = new Scanner(System.in);
        for (int i =0;i< 3 ; i++){
            if(i == 0){
                System.out.println("请输入购买苹果多少斤:");
                BigDecimal weight = scanner.nextBigDecimal();
                apple.setWeight(weight);
                sum = sum.add(calculate(apple));
            }else if(i == 1){
                System.out.println("请输入购买草莓多少斤:");
                BigDecimal weight = scanner.nextBigDecimal();
                strawberry.setWeight(weight);
                sum = sum.add(calculate(strawberry).multiply(new BigDecimal("0.8")));
            }else{
                System.out.println("请输入购买芒果多少斤:");
                BigDecimal weight = scanner.nextBigDecimal();
                mango.setWeight(weight);
                sum = sum.add(calculate(mango));
            }
        }
        int flag = sum.compareTo(new BigDecimal("100"));
        if(flag == 1){
            sum = sum.subtract(new BigDecimal("10"));
        }
        System.out.println("你一共需要付款：" + sum);
    }

    public static BigDecimal calculate(Fruits fruits){
        return fruits.getPrice().multiply(fruits.getWeight());
    }
}
