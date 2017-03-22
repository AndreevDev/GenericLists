import java.util.List;

/**
 * Created by Andrey on 01.09.2016.
 */
public interface Conf {
    <T> T configurate(List<T> a1, List<T> a2);
}
