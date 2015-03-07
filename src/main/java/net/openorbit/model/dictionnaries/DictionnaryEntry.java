package net.openorbit.model.dictionnaries;

/**
 * @author kheless
 * @date 08-02-15
 */
public abstract class DictionnaryEntry<T>{
    public String key;
    public String path;

    public DictionnaryEntry(String _key, DictionnaryEntry<T> _parent){

        if(_parent != null){
            key = _key;
            path = _parent.path + "." + _key;
        }else{
            key = _key;
            path = _key;
        }
    }

    @Override
    public String toString() {
        return this.getClass().getName()+"{" +
                "path='" + path + '\'' +
                '}';
    }
}
