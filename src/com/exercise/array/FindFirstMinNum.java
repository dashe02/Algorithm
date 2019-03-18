package com.exercise.array;

/**
 * Created by wecash on 19/3/18.
 */
public class FindFirstMinNum {

    public static void main(String[] args) {
        //8355 7761  83551677  83561577
        //123 4
        int num = 1234;
        FindFirstMinNum f = new FindFirstMinNum();
        int result = f.findFirstMinNum(num);
        System.out.print(result);
    }

    //从右向左,遇到前一位比后一位小的,断开,然后将后面的串逆序,再由左向右遍历,找到第一个比刚才记录的数大的数,交换彼此
    private int findFirstMinNum(int num) {
        String sNum = String.valueOf(num);
        Character temp = '0';
        int j = 0;
        for (int i = sNum.length() - 1; i >= 0; i--) {
            if (sNum.charAt(i - 1) < sNum.charAt(i)) {
                j = i - 1;
                temp = sNum.charAt(i - 1);
                break;
            }
        }
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i <= j; i++) {
            newString.append(sNum.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        for (int i = j + 1; i < sNum.length(); i++) {
            sb.append(sNum.charAt(i));
        }
        sb = sb.reverse();
        //83551677
        newString.append(sb.toString());
        char[] newChar = newString.toString().toCharArray();
        for (int i = j; i < newChar.length; i++) {
            if (newChar[i] > temp) {
                swap(i, j, newChar);
                break;
            }
        }
        return Integer.parseInt(new String(newChar));
    }

    private void swap(int i, int j, char[] afterChar) {
        char t = afterChar[i];
        afterChar[i] = afterChar[j];
        afterChar[j] = t;
    }
}
