public class Maopaosort {
    public static void main(String[] args) {
       int[] a={32,43,23,13,5};
       sheelSort(a);
    }

    public void bubbleSort (int[] array){
        int n = array.length;
        if( n <= 1){
            return;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;){

            }

        }

    }

    public void insertSort(int[] a){
        int len=a.length;//数组长度
        int insertNum;//要插入得数
        for(int i=1;i<len;i++){//第一次不用，从1开始
            insertNum=a[i];//拿到要插入的数
            int j=i-1;//有序数字的个数
            while(j>=0&&insertNum<a[j]){//数组从后向前移动。将大于inertnum的数后移
                a[j+1]=a[j];//元素后移
                j--;
            }
            a[j+1]=insertNum;//找到位置 插入
        }
    }


     public static void sheelSort(int[] a){
        int len=a.length;//单独拿出数组长度
        while(len!=0){
            len=len/2;

            for(int i=0;i<len;i++){//分组
                for(int j=i+len;j<a.length;j+=len){//元素从二个开始
                    int k=j-len;//有序数字的最后一位
                    int temp=a[j];//要插入的元素

                    while(k>=0&&temp<a[k]){//从后向前遍历
                        a[k+len]=a[k];//元素后移
                        k-=len;//下标前移
                    }
                    a[k+len]=temp;//具体插入位置
                }
            }
        }
        int i=0;
        while(i<a.length){

             System.out.println(a[i]+"###");
            i++;
         }
     }

}
