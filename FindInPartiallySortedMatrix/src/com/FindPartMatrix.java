package com;

public class FindPartMatrix {
    public static void main(String[] args) {
        int[][] array=new int[][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        boolean boolean1=find1(7,array);
        System.out.println(boolean1);
    }


    /**从右上角开始寻找
     *
     *  寻找值等于元素值 返回true
     *
     *  寻找值大于元素值 行++
     *
     *  寻找值小于元素值 列--
     * */
    static boolean find(int number,int[][] array){
        if(array==null){
            return false;
        }

        int rows=array.length;
        int columns=array[0].length;

        int i=0;
        int j=columns-1;

        while(i<rows && j>0){
            if(array[i][j]==number){
                return true;
            }else if (array[i][j]>number){
                j--;
            }else{
                i++;
            }

        }

        return false;
    }


    /**从左下角开始寻找
     *
     *  寻找值等于元素值 返回true
     *
     *  寻找值大于元素值 列++
     *
     *  寻找值小于元素值 行--
     * */
    static boolean find1(int number,int[][] array){
        if(array==null){
            return false;
        }

        int rows=array.length;
        int columns=array[0].length;

        int i=array.length-1;
        int j=0;

        while(i>0 && j<columns){
            if(array[i][j]==number){
                return true;
            }else if (array[i][j]>number){
                i--;
            }else{
                j++;
            }

        }

        return false;
    }
}
