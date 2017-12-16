package generics;

import java.util.HashMap;
import java.util.Map;

public class CountMapImpl<E> implements CountMap<E> {

    private final Map<E, Integer> map = new HashMap();

    @Override
    public int getCount(E element) {
        if (map.containsKey(element)) {
            return map.get(element);
        } else {
            return 0;
        }
    }

    @Override
    public int size() {
        return map.keySet().size();
    }

    @Override
    public void add(E element) {
        addSeveralElements(element, 1);
    }

    private void addSeveralElements(E element, int count) {
        int currentCount = this.getCount(element);
        map.put(element, currentCount + count);
    }

    @Override
    public void addAll(CountMap<E> source) {
        for (E key: source.toMap().keySet()){
            int count = source.getCount(key);
            this.addSeveralElements(key, count);
        }
    }

    @Override
    public int remove(E element) {
        int count = this.getCount(element);
        map.remove(element);
        return count;
    }

    @Override
    public Map toMap() {
        Map<E, Integer> newMap = new HashMap();
        newMap.putAll(map);
        return newMap;
    }

    @Override
    public void toMap(Map<E, Integer> destination) {
        destination.clear();
        destination.putAll(map);
    }
}
