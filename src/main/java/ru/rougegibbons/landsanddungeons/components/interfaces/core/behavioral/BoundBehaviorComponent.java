package ru.rougegibbons.landsanddungeons.components.interfaces.core.behavioral;

import ru.rougegibbons.landsanddungeons.components.interfaces.Component;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.numbers.LabeledComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.contexts.BoundContextProcessor;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.contexts.ProcessingResult;

/**
 * {@link Component} interface extension representing
 * {@link BoundContextProcessor} components.
 *
 * @param <R> - {@link ProcessingResult} derivative implementation, representing type of contexts this behavior processes.
 * @see Component
 * @see LabeledComponent
 * @see BoundContextProcessor
 * @see ProcessingResult
 * @since 1.1.3
 */
public interface BoundBehaviorComponent<R extends ProcessingResult>
        extends Component, LabeledComponent, BoundContextProcessor<R> {

}
