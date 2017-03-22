import java.util.List;

/**
 * Created by Andrey on 03.09.2016.
 */
public class Equals implements Conf{
    @Override
    public <T> T configurate(List<T> a1, List<T> a2) {
        Boolean isEquals;
        if (a1.equals(a2)) isEquals = true;
        else isEquals = false;
        System.out.println(isEquals);
        return (T)isEquals;
    }
}
