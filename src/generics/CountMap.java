package generics;

import java.util.Map;

/**
 * Created by Roman on 16.12.2017.
 */
public interface CountMap<T> {
    //Возвращает количество добавлений данного элемента
    int getCount(T o);

    //количество разных элементов
    int size();

    // добавляет элемент в этот контейнер.
    void add(T o);

    //Добавить все элементы из source в текущий контейнер, при совпадении ключей,     суммировать значения
    void addAll(CountMap<T> source);

    //Удаляет элемент из контейнера и возвращает количество его добавлений(до удаления)
    int remove(T o);

    //Вернуть java.util.Map. ключ - добавленный элемент, значение - количество его добавлений
    Map<T, Integer> toMap();

    //Тот же самый контракт как и toMap(), только всю информацию записать в destination
    void toMap(Map<T, Integer> destination);
}

