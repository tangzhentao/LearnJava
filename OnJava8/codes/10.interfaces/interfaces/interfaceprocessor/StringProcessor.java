
package interfaces.interfaceprocessor;
import java.util.*;


interface StringProcessor extends Processor {

    @Override
    String process(Object input);

    String S = "if she weghts the same as a duck, she's made of wood";

    public static void main(String[] args) { 
        Applicator.apply(new Upcase(), S);
        Applicator.apply(new Downcase(), S);
        Applicator.apply(new Splitter(), S);
    }
}

class Upcase implements StringProcessor {
    @Override
    public String process(Object input) {
        return ( (String)input ).toUpperCase();
    }
}

class Downcase implements StringProcessor {
    @Override
    public String process(Object input) {
        return ( (String)input ).toLowerCase();
    }
}

class Splitter implements StringProcessor {
    @Override
    public String process(Object input) {
        return Arrays.toString( ( (String)input ).split(" ") );
    }
}