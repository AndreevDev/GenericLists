import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrey on 03.09.2016.
 */
public class Dismatch implements Conf{
    @Override
    public <T> T configurate(List<T> a1, List<T> a2) {
        List<T> res = new ArrayList<T>();

        for (T elem : a1)
        {
            if (!a2.contains(elem)) res.add(elem);
        }

        for (T obj : res)
            System.out.println(obj);
        return (T)res;
    }
}
