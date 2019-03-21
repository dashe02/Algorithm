package com.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/3/20.
 */
public class LineCount {

    public static void main(String[] args) {
        List<Pointer> pointerList = new ArrayList<>();
        pointerList.add(new Pointer(0, 0, 0));
        pointerList.add(new Pointer(1, 1, 1));
        pointerList.add(new Pointer(-1, -1, -1));
        pointerList.add(new Pointer(0, 1, 0));
        LineCount l = new LineCount();
        int count = l.lineCount(pointerList);
        System.out.print(count);
    }

    private int lineCount(List<Pointer> pointerList) {
        int sum = 0;
        for (int i = 0; i < pointerList.size(); i++) {
            for (int j = 0; j < pointerList.size(); j++) {
                if (i != j) {
                    for (int z = 0; z < pointerList.size(); z++) {
                        if (j != z && i != z) {
                            Pointer p1 = pointerList.get(i);
                            Pointer p2 = pointerList.get(j);
                            Pointer p3 = pointerList.get(z);
                            boolean b1 = false;
                            boolean b2 = false;
                            if (p2.x - p3.x != 0 && p2.z - p3.z != 0) {
                                b1 = (p1.x - p2.x) / (p2.x - p3.x) == (p1.z - p2.z) / (p2.z - p3.z);
                            }
                            if (p2.y - p3.y != 0 && p2.z - p3.z != 0) {
                                b2 = (p1.y - p2.y) / (p2.y - p3.y) == (p1.z - p2.z) / (p2.z - p3.z);
                            }
                            if (b1 && b2) {
                                System.out.print(p1 + "===" + p2 + "===" + p3);
                                sum++;
                            }
                            System.out.println();
                        }
                    }
                }
            }
        }
        return sum;
    }
}

class Pointer {

    public int x;

    public int y;

    public int z;

    public Pointer(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Pointer{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
