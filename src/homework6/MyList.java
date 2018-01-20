package homework6;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public abstract class MyList<T> implements ListInterface<T> {

    int size = 0;
    @Override
    public int size() {
        return size;
    }

}
