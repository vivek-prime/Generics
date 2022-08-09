import java.util.ArrayList;
import java.util.List;

public class Launcher {
    public static void main(String[] args) {
        CustomList<String> list = new CustomList();
        list.addElement("vivek");
        list.addElement("ball");
        String val1 = list.get(0);
        System.out.println(val1);
        System.out.println(list);

        CustomList<Integer> list2 = new CustomList();
        list2.addElement(100);
        list2.addElement(200);
        Integer val2 = list2.get(0);
        System.out.println(val2);
        System.out.println(list2);

        List<Integer> l3 = new ArrayList<>(List.of(1,2,3,4));
        CustomList.duplicateList(l3);
        System.out.println(l3);

        List<String> l4 = new ArrayList<>(List.of("ball", "bat"));
        CustomList.duplicateList(l4);
        System.out.println(l4);

        List<Integer> l5 = new ArrayList<>(List.of(10,20));
        CustomList.duplicateListWithRestrictions(l5);
        System.out.println(l5);

//        restrictions on parameters
        System.out.println(CustomList.sumOfNumbersList(List.of(1,2,3,4,5)));
        System.out.println(CustomList.sumOfNumbersList(List.of(1.1,2.2,3.3)));
        System.out.println(CustomList.sumOfNumbersList(List.of(1L, 2L, 3L, 4L)));
    }
}
