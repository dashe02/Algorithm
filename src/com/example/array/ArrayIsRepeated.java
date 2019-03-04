package com.example.array;

/**
 * Created by wecash on 19/3/4.
 */
public class ArrayIsRepeated {

    public boolean isRepeated(String[] strings) {
        String[] repeated = new String[strings.length];
        for (String s : strings) {
            int index = s.hashCode() % (strings.length - 1);
            if (s.equals(repeated[index])) {
                return true;
            }
            repeated[index] = s;

        }
        return false;
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"a", "b", "c", "a", "d"};
        ArrayIsRepeated a = new ArrayIsRepeated();
        System.out.println(a.isRepeated(strings));
    }
}
