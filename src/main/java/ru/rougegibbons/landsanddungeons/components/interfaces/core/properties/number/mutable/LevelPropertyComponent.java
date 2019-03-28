package ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.number.mutable;

import org.jetbrains.annotations.NotNull;

/**
 * {@link MutableSingleNumberPropertyComponent} interface extension
 * for components representing some {@link ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity}
 * level (e.g. user character, monster, NPC, quest, dungeon, item, etc.).
 *
 * @see MutableSingleNumberPropertyComponent
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity
 * @since 1.1.3
 */
public interface LevelPropertyComponent extends MutableSingleNumberPropertyComponent {
    /**
     * checks if entity level is maximal.
     *
     * @return true if entity level is maximal, false otherwise.
     */
    @NotNull Boolean isMax();
}
