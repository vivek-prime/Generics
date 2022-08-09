import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
//Generic Class
public class CustomList<T> {
    List<T> list = new ArrayList<>();

    public void addElement(T elem) {
        list.add(elem);
    }

    public void removeElement(T elem) {
        list.remove(elem);
    }

    public <T> T get(int i) {
        return (T) list.get(0);
    }

    static <T> void duplicateList(List<T> l) {
        l.addAll(l);
    }

//    Restrictions on the method
    static <T extends Number> void duplicateListWithRestrictions(List<T> l) {
        l.addAll(l);
    }

//    Restriction on the generic data type
    static double sumOfNumbersList(List<? extends Number> l) {
        double sum = 0.0;
        for(Number number : l){
            sum += number.doubleValue();
        }
        return sum;
    }
}
