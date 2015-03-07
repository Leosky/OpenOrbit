package net.openorbit.model.entities.armies.weapons;

import net.openorbit.model.entities.armies.units.UnitType;

import java.util.List;

/**
 * @author kheless
 * @date 30-01-15
 */
public class Attack {
    public AttackType _attackType;
    public List<UnitType> targetTypes;
    public int strenght;
    public int area;
}
