package net.openorbit.model.dictionnaries;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * @author kheless
 * @date 08-02-15
 */
public class DictionnaryFolder<T> extends DictionnaryEntry<T>{
    protected HashMap<String, DictionnaryEntry<T>> folder;

    public DictionnaryFolder(String _key, DictionnaryEntry<T> _parent) {
        super(_key, _parent);
        folder = new HashMap<>();
    }

    public DictionnaryEntry<T>  get(String _path){
        return folder.get(_path);
    }

    public DictionnaryEntry<T> put(String _path, DictionnaryEntry<T> _value){
        return folder.put(_path, _value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(String key : folder.keySet()){
            sb.append(folder.get(key).toString());
        }
        return sb.toString();
    }
}
