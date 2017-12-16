package generics;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Roman on 16.12.2017.
 */
public class CountMapImplTest {
    CountMap<Integer> map;

    @Before
    public void setUp() throws Exception {
        map = new CountMapImpl<>();
        // 5: one time
        map.add(5);
        // 6: two times
        map.add(6);
        map.add(6);
        // 10: three times
        map.add(10);
        map.add(10);
        map.add(10);
    }

    @Test
    public void getCount() throws Exception {
        assertEquals(0, map.getCount(7));
        assertEquals(1, map.getCount(5));
        assertEquals(2, map.getCount(6));
        assertEquals(3, map.getCount(10));
    }

    @Test
    public void size() throws Exception {
        assertEquals(3, map.size());
    }

    @Test
    public void add() throws Exception {
        map.add(7);
        assertEquals(1, map.getCount(7));
        map.add(5);
        assertEquals(2, map.getCount(5));
    }

    @Test
    public void addAll() throws Exception {
        CountMap sourceMap = new CountMapImpl<>();
        // 7: one time
        sourceMap.add(7);
        // 5: one time
        sourceMap.add(5);
        // 6: four times
        sourceMap.add(6);
        sourceMap.add(6);
        sourceMap.add(6);
        sourceMap.add(6);

        map.addAll(sourceMap);
        assertEquals(0, map.getCount(20));
        assertEquals(1, map.getCount(7));
        assertEquals(2, map.getCount(5));
        assertEquals(6, map.getCount(6));
        assertEquals(3, map.getCount(10));
    }

    @Test
    public void remove() throws Exception {
        assertEquals(0, map.remove(7));
        assertEquals(0, map.getCount(7));

        assertEquals(1, map.remove(5));
        assertEquals(0, map.getCount(5));

        assertEquals(2, map.remove(6));
        assertEquals(0, map.getCount(6));

        assertEquals(3, map.remove(10));
        assertEquals(0, map.getCount(10));
    }

    @Test
    public void toMap() throws Exception {
        Map newMap = map.toMap();
        assertEquals(3, newMap.size());
        assertEquals(null, newMap.get(7));
        assertEquals(1, newMap.get(5));
        assertEquals(2, newMap.get(6));
        assertEquals(3, newMap.get(10));
    }

    @Test
    public void toMapDest() throws Exception {
        Map newMap = new HashMap();
        map.toMap(newMap);
        assertEquals(3, newMap.size());
        assertEquals(null, newMap.get(7));
        assertEquals(1, newMap.get(5));
        assertEquals(2, newMap.get(6));
        assertEquals(3, newMap.get(10));

        newMap = new HashMap();
        // 7: one time
        newMap.put(7, 1);
        // 5: one time
        newMap.put(5, 1);
        // 6: four times
        newMap.put(6, 4);
        map.toMap(newMap);
        assertEquals(3, newMap.size());
        assertEquals(null, newMap.get(7));
        assertEquals(1, newMap.get(5));
        assertEquals(2, newMap.get(6));
        assertEquals(3, newMap.get(10));
    }

}