package net.openorbit;

import java.util.HashMap;
import java.util.Map;

public class EntitiesDictionnary<T> extends HashMap<String, T> {
    public EntitiesDictionnary() {
        super();
    }

    private EntitiesDictionnary(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    private EntitiesDictionnary(int initialCapacity) {
        super(initialCapacity);
    }

    private EntitiesDictionnary(Map<? extends String, ? extends T> m) {
        super(m);
    }
}
