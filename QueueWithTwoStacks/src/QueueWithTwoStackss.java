import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueWithTwoStackss {

    /**两个栈实现队列
     *  push操作，每次放入stack1
     *  pop操作，每次弹出stack2
     *
     *  stack2不为空时 不能将stack1放入stack2
     *  stack2为空时 需将stack1全部放入stack2
     * */

    Stack<Integer> stack1=new Stack<Integer>();
    Stack<Integer> stack2=new Stack<Integer>();

    public  void push(int node){
        stack1.push(node);
    }
    public int  pop(){
        if(stack2.isEmpty()){
            if(stack1.isEmpty()){
                return -1;
            }
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return  stack2.pop();
    }

}

class StackWithTwoQueues{
    /**
     *  两个队列实现一个栈
     *
     *  push操作 放入queue1；
     *  pop操作 从queue1中取
     *
     *  弹出时 依次将queue1放入queue2，留下最后一个元素，弹出
     *  将queue1与queue2交换 保证存取数据都在queue1中，不用再考虑queue2的问题 queue2只起到暂存数据的作用
     * */
        Queue<Integer> queue1=new LinkedList<>();
        Queue<Integer> queue2=new LinkedList<>();

        public void push(int node){
            queue1.offer(node);
        }

        public int pop (){
            if(queue1.isEmpty()){
                throw new RuntimeException();
            }
            while(queue1.size()>1){
                queue2.offer(queue1.poll());
            }
            int val=queue1.poll();

            //交换queue1和queue2 当queue1弹出最后一个元素时 已经为空 这里是否可以直接将queue2移到queue1；
//            Queue<Integer> t= queue1;
//            queue1 = queue2;
//            queue2 = t;
            queue1 = queue2;
            return  val;
        }
}

