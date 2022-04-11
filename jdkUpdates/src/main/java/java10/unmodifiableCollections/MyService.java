package java10.unmodifiableCollections;

import java.util.List;

public class MyService {
    Some3rdService some3rdService = new Some3rdService();

    public List<Integer> getUnmodifiableListByCollector() {
        // implement here
        // copy list by stream and Collectors.toUnmodifiableList

        return some3rdService.getList();
    }

    public List<Integer> getUnmodifiableListByCopy() {
        // implement here
        // copy list by static copyOf method

        return some3rdService.getList();
    }
}
