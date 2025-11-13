import java.util.LinkedList;

class MyStack<T> extends LinkedList<T> {

    public MyStack() {
        super();
    }

    // push：加入到 stack 頂端（LinkedList 尾端）
    public void push(T item) {
        this.addLast(item);
    }

    // pop：從頂端移出並回傳
    public T pop() {
        return this.removeLast();
    }

    // 是否為空
    public boolean isEmpty() {
        return super.isEmpty();
    }

    // 大小
    public int size() {
        return super.size();
    }
}

public class StackExample {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        //do some test if needed
    }
}

// 我的Junit測試會測這個Object，這邊以下請不要修改
//---------------------------------------------------------------------------------
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
//---------------------------------------------------------------------------------
