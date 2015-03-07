package net.openorbit.model.entities.armies.units;

import net.openorbit.model.entities.armies.weapons.Weapon;

import java.util.List;
import java.util.Map;

/**
 * UnitModel is the class describing atomic unit forming groups sections
 */
public class UnitModel {

    //Fields
    public String ID;
    public String modelName;
    public List<UnitType> unitTypes;
    public List<Weapon> weapons;
    public Map<MovementType, Short> moves;
    public short actionPoints;
    public short agility;
    public short intellect;
    public short strenght;
    public short defense;

    //Getters
    public boolean isUnitType(UnitType _unitType){
        return unitTypes.contains(_unitType);
    }

}
