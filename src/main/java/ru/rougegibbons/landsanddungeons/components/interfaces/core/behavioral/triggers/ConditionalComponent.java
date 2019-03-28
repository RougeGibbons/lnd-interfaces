package ru.rougegibbons.landsanddungeons.components.interfaces.core.behavioral.triggers;

import ru.rougegibbons.landsanddungeons.components.interfaces.core.behavioral.BehaviorComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.contexts.BooleanResult;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.contexts.Context;

/**
 * {@link BehaviorComponent} interface extesion representing
 * various conditional components (perk requirements, triggers, etc.).
 *
 * @param <C> - given context to process.
 * @see BehaviorComponent
 * @see Context
 * @see BooleanResult
 * @since 1.1.3
 */
public interface ConditionalComponent<C extends Context>
        extends BehaviorComponent<C, BooleanResult> {
}
