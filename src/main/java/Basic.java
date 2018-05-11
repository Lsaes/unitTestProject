import Oper.IMethod;

import java.util.ArrayList;
import java.util.List;

public class Basic implements IMethod {
    public int testGetNumber() {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(4);
        return numbers.get(0);
    }
}
