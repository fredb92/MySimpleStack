package dcll.fbou.MySimpleStack;

/**
 * Created by 21403894 on 23/02/2015.
 */
public class Item {
    private Object value;


    public Item(Object value) {
        setValue(value);
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
