package net.openorbit.model.dictionnaries;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.StringTokenizer;

/**
 * @author kheless
 * @date 08-02-15
 */
public class Dictionnary<T> {
    public final static String KEY_DELIMITER = ".";
    private DictionnaryFolder<T> mainFolder;

    public Dictionnary(){
        mainFolder = new DictionnaryFolder<T>("root", null);
    }

    public T get(String _path){
        StringTokenizer tokenizer = new StringTokenizer(_path,Dictionnary.KEY_DELIMITER);
        DictionnaryEntry<T> current = mainFolder;

        while (tokenizer.hasMoreTokens()) {
            if(current instanceof DictionnaryFolder){
                //child is a sub folder so it's normal to have more keys.
                current = ((DictionnaryFolder<T>) current).get(tokenizer.nextToken());
            }else{
                //should be a value so it isn't normal to have more keys.
                //The error handeling is contextual so null is a good return value as the target value isn't found.
                return null;
            }
        }

        //finaly key from the keyChain accessed and should be a value.
        if(current instanceof DictionnaryValue){
            return ((DictionnaryValue<T>) current).value;
        }

        return null;
    }

    public DictionnaryEntry<T> getDirectChild(String _path){
        return mainFolder.get(_path);
    }

    public T put(String _keysChain, T _value){
        StringTokenizer tokenizer = new StringTokenizer(_keysChain,Dictionnary.KEY_DELIMITER);
        DictionnaryEntry<T> current = mainFolder;
        DictionnaryEntry<T> next = null;
        String key;
        while (tokenizer.hasMoreTokens()) {
            if(current instanceof DictionnaryFolder){

                key = tokenizer.nextToken();
                //child is a sub folder so it's normal to have more keys.
                next = ((DictionnaryFolder<T>) current).get(key);
                if(next == null){
                    if(tokenizer.hasMoreTokens()) { //if there is more key tokens, we have to create a new folder
                        next = new DictionnaryFolder<T>(key, current);
                        ((DictionnaryFolder<T>) current).put(key, next);
                    }else{ //otherwise its the final content
                        ((DictionnaryFolder<T>) current).put(key, new DictionnaryValue<T>(key, current, _value));
                        return null;
                    }
                }

                current = next;
            }else{
                //should be a value so it isn't normal to have more keys.
                //The error handeling is contextual so null is a good return value as the target value isn't found.
                return null;
            }
        }

        return null;
    }

    @Override
    public String toString() {

        return "Dictionnary{\n" +
                mainFolder.toString() +
                '}';
    }

    public static void main(String[] args) {
        Dictionnary<String> dico = new Dictionnary<>();
        dico.put("dico1.dico1-1","dico1-1");
        dico.put("dico1.dico1-2","dico1-2");
        dico.put("dico1.value","dico1");
        System.out.println(dico.get("dico1.value"));
    }
}
