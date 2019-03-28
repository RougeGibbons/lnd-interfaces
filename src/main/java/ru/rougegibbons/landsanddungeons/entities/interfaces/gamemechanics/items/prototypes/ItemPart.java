package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items.prototypes;

import ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.mixins.WithLevel;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.mixins.Named;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.mixins.WithDescription;

public interface ItemPart extends GameEntity, Named, WithDescription {
    interface LeveledItemPart extends ItemPart, WithLevel {

    }
}
