import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(2);
        a1.add(3);

        List<Integer> a2 = new ArrayList<>();
        a2.add(3);
        a2.add(4);
        a2.add(5);

        List<Integer> a11 = new LinkedList<>();
        a11.add(11);
        a11.add(22);
        a11.add(33);

        List<Integer> a12 = new LinkedList<>();
        a12.add(31);
        a12.add(22);
        a12.add(55);

        solve(a1, a2, new Intersect());
        System.out.println();
        solve(a11, a12, new Dismatch());
        System.out.println();
        solve(a1, a11, new Equals());
        solve(a1, a1, new Equals());
    }

    static <T> T solve(List<T> l1, List<T> l2, Conf conf)
    {
        return conf.configurate(l1, l2);
    }
}
