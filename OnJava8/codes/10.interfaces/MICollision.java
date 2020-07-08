import java.util.*;

interface Bob1 {
    default void bob () {
        System.out.println("bob()");
    }
}

interface Bob2 {
    default void bob () {
        System.out.println("bob()");
    }
}

// class Bob implements Bob1, Bob2 {} // 报编译时错误：类 Bob从类型 Bob1 和 Bob2 中继承了bob() 的不相关默认值

interface Sam1 {
    default void sam () {
        System.out.println("sam()");
    }
}

interface Sam2 {
    default void sam (int i) {
        System.out.println("sam() " + i);
    }
}

class Sam implements Sam1, Sam2 {} 

interface Max1 {
    default void max () {
        System.out.println("max()");
    }
}

interface Max2 {
    default int max () {
        System.out.println("max()");
        return 1;
    }
}

// class Max implements Max1, Max2 {} // 报编译时错误