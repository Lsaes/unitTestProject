package Oper;

import java.util.ArrayList;
import java.util.List;

public class Operation implements IMethod {
    public int testGetNumber() {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(4);
        return numbers.get(0);
    }
}


