package ru.rougegibbons.landsanddungeons.components.interfaces.core.behavioral;

import ru.rougegibbons.landsanddungeons.components.interfaces.Component;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.numbers.LabeledComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.contexts.Context;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.contexts.ContextProcessor;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.contexts.ProcessingResult;

/**
 * interface for component's describing various behaviors (AIs, skills action, etc.).
 *
 * @param <C> - context given behavior is based on.
 * @param <R> - result of given behavior implementation.
 *
 * @see Component
 * @see LabeledComponent
 * @see Context
 * @see ContextProcessor
 * @since 0.4.6
 */
public interface BehaviorComponent<C extends Context, R extends ProcessingResult>
        extends Component, LabeledComponent, ContextProcessor<C, R> {
}
