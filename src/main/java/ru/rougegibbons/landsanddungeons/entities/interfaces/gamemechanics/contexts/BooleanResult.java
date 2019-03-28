package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.contexts;

import org.jetbrains.annotations.NotNull;

/**
 * {@link ProcessingResult} interface extension representing results
 * that essentially are a logical value.
 *
 * @see ProcessingResult
 * @since 1.1.3
 */
public interface BooleanResult extends ProcessingResult {
    @NotNull Boolean getOutcome();
}
