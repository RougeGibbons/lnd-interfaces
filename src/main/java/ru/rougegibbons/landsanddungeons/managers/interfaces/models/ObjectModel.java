package ru.rougegibbons.landsanddungeons.managers.interfaces.models;

import org.jetbrains.annotations.NotNull;

/**
 * main interface for all objects' data models.
 *
 * @see ru.rougegibbons.landsanddungeons.events.interfaces.models.EventModel
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.models.EntityModel
 * @see ru.rougegibbons.landsanddungeons.components.interfaces.models.ComponentModel
 * @since 1.1.3
 */
public interface ObjectModel {
    /**
     * get object id.
     *
     * @return object id stored in model.
     */
    @NotNull Long getId();
}
