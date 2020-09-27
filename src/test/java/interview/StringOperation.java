package interview;

import java.util.Scanner;

/***
 * 题目：给你一个字符串，你怎么判断是不是ip地址？手写这段代码，并写出测试用例
 *
 * IP的格式：(1~255).(0~255).(0~255).(0~255)
 */
public class StringOperation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String ipStr = scanner.next();
        boolean isIpLegal = isIpLegal(ipStr);
        if(isIpLegal){
            System.out.println(ipStr + "合法");

        }else{
            System.out.println(ipStr + "不合法");
        }


    }

    public static boolean isIpLegal(String str){
        //检查ip 是否为空
        if (str == null){
            return false;
        }
        //检查ip 长度，最小为7位x.x.x.x，最长为15位 xxx.xxx.xxx.xxx
        else if (str.length()<7 || str.length()>15){
            return false;
        }
        //对输入的字符串首末字符进行判断，如果是"."，则是非法ip
        else if (str.charAt(0)=='.' ||str.charAt(str.length()-1)=='.'){
            return false;

        }


        //按"."进行分割字符串，并判断分割出来的字符串个数，如果不是4个，则是非法ip。或者，如果不是三个"." ，则是非法ip
       String[] arr = str.split("\\.");
        if (arr.length != 4){
            return false;

        }


        //对每个分割出来的字符串进行判断
        for (int i = 0;i < arr.length; i++){
            //如果每个字符串不是1位的，并且首位是0，则为非法ip。如01.002.003.004
            if (arr[i].length() !=1 && arr[i].charAt(0) == '0'){
                return false;

            }
            //对每个字符串的每个字符进行判断，如果不是0~9的数字，则为非法ip
            for (int j = 0;j< arr[i].length();j++){
                if (arr[i].charAt(j)< '0' || arr[i].charAt(j) > '9'){
                    return false;

                }

            }

        }
        //对拆分的每个字符串转换成数字，并判断是否在0~255，小于0或大于255，为非法ip

        for (int i = 0;i < arr.length;i++){
            int temStr = Integer.parseInt(arr[i]);
            if (i == 0){
                if (temStr <=0 || temStr > 255){
                    return false;

                }
            }

        }







        return true;


    }
}
