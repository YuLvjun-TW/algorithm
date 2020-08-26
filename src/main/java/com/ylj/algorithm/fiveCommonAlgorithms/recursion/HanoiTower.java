package com.ylj.algorithm.fiveCommonAlgorithms.recursion;

/**
 * 汉诺塔：将盘子从A柱子借助B、C柱子移动到C柱子。
 *     1.A柱子把”共n-1”个盘借助C盘移动到B盘,完成一个大过程
 *     2.A柱子把剩下的”第n”个盘直接移动到C盘,完成一个大过程
 *     3.B柱子上的”共n-1”个盘借助A移动到C盘,又完成一个大过程
 */

public class HanoiTower {
    public static void main(String[] args){
        move(5,'a','b','c');
        System.out.println("moveCount: "+moveCount);

    }
    private static int moveCount;
    private static void move(int moveNum, char a, char b, char c) {//原->辅助->目标
        moveCount++;
        //只有一个时,原柱子->目标柱子
        if (moveNum == 1) {
            System.out.println("from # " + a + " move " + moveNum + " to " + c);
        } else {
            //.A借C把("共"n-1个)移动到B
            move(moveNum - 1, a, c, b);
            System.out.println("from - " + a + " move " + moveNum + " to " + c);
            // .B借A把("共"n-1)个移动到C
            move(moveNum - 1, b, a, c);
        }
    }
}
