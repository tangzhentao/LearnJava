

import java.util.*;

class Processor {
    public String name () {
        return getClass().getSimpleName();
    }

    public Object process(Object input) {
        return input;
    }
}

class Upcase extends Processor {
    // 返回协变类型
    @Override
    public String process(Object input) {
        return ( (String)input ).toUpperCase();
    }
}

class Downcase extends Processor {
    // 返回协变类型
    @Override
    public String process(Object input) {
        return ( (String)input ).toLowerCase();
    }
}

class Splitter extends Processor {
    // 返回协变类型
    @Override
    public String process(Object input) {
        return Arrays.toString( ( (String)input ).split(" ") );
    }
}

public class Applicator {

    public static void apply(Processor p, Object s) {
        System.out.println("using processor " + p.name());
        System.out.println(p.process(s));
    }

    public static void main(String[] args) { 
        String s = "we are sunch stuff as dreams are made on";

        apply(new Upcase(), s);
        apply(new Downcase(), s);
        apply(new Splitter(), s);

    }
}