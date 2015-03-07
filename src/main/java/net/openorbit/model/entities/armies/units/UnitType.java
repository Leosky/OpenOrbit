package net.openorbit.model.entities.armies.units;


import net.openorbit.json.IJsonDeserializable;
import net.openorbit.json.JsonException;

import java.util.HashMap;

/**
 * @author kheless
 * @date 30-01-15
 */
public class UnitType implements IJsonDeserializable{
    //Globals
    public static String UNKNOWN_NAME = "Inconnu";  //TODO: localize field;

    //Global dictionnary logic
    private static HashMap<String, UnitType> dictionnary;

    public static UnitType get(String _ID){
        return dictionnary.getOrDefault(_ID, new UnitType(_ID));
    }

    //Fields
    public String ID;
    public String typeName = UnitType.UNKNOWN_NAME;

    //Constructors
    static{
        dictionnary = new HashMap<>();
    }

    protected UnitType(String _ID) {
        ID = _ID;

        dictionnary.put(_ID, this);
    }

    @Override
    public String toString() {
        return "TargetType{" +
                "ID='" + ID + '\'' +
                '}';
    }

    @Override
    public UnitType fromJson(String _json) throws JsonException {

        return this;
    }
}