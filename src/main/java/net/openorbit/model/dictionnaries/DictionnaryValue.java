package net.openorbit.model.dictionnaries;

/**
 * @author kheless
 * @date 08-02-15
 */
public class DictionnaryValue<T> extends DictionnaryEntry<T> {
    public T value;

    public DictionnaryValue(String _key, DictionnaryEntry<T> _parent, T _value) {
        super(_key, _parent);
        value = _value;
    }

    @Override
    public String toString() {
        return this.path +
                " = " + value +
                "\n";
    }
}
