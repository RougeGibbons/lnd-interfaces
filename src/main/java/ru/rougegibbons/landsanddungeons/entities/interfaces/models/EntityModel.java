package ru.rougegibbons.landsanddungeons.entities.interfaces.models;

import ru.rougegibbons.landsanddungeons.entities.interfaces.core.mixins.PropertyOwner;
import ru.rougegibbons.landsanddungeons.managers.interfaces.models.ObjectModel;

/**
 * interface for {@link ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity}
 * implementations data models. Extends {@link ObjectModel} interface (since 1.1.3).
 *
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity
 * @see ObjectModel
 * @since 1.0.2
 */
public interface EntityModel extends ObjectModel, PropertyOwner {

}
