package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.contexts;


import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.contexts.mixins.BoundContext;

/**
 * interface representing objects converting {@link Context}
 * data into various {@link ProcessingResult}.
 *
 * @param <R> - {@link ProcessingResult} derivatives, representing processing results.
 * @see ContextProcessor
 * @see Context
 * @see ProcessingResult
 * @since 1.1.3
 */
public interface BoundContextProcessor<R extends ProcessingResult>
        extends BoundContext {
    /**
     * process bound context and get a result.
     *
     * @return some {@link ProcessingResult} implementation instance containing processing result data.
     */
    @NotNull R process();
}
