package ru.rougegibbons.landsanddungeons.components.interfaces.core.numbers;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.mixins.PackableComponent;

import java.util.List;

/**
 * {@link PackableComponent} interface extension for pairs of numbers.
 *
 * @param <T> - any class derived from {@link Number} class.
 *
 * @since 0.3.5
 */
public interface PairNumberComponent<T extends Number> extends PackableComponent {
    /**
     * get first number in the pair.
     *
     * @return first stored number.
     */
    @NotNull T getFirstValue();

    /**
     * get second number in the pair.
     *
     * @return second stored number.
     */
    @NotNull T getSecondValue();

    /**
     * gets both numbers and represents them as a list.
     *
     * @return list where 0th element is first number and 1st - the second one.
     */
    @NotNull List<T> getBoth();

    /**
     * {@link PairNumberComponent} extension for {@link Integer} numbers.
     *
     * @since 0.3.5
     */
    interface PairIntComponent extends PairNumberComponent<Integer> {

    }

    /**
     * {@link PairNumberComponent} extension for {@link Long} numbers.
     *
     * @since 0.3.5
     */
    interface PairLongComponent extends PairNumberComponent<Long> {

    }

    /**
     * {@link PairNumberComponent} extension for {@link Float} numbers.
     *
     * @since 0.3.5
     */
    interface PairFloatComponent extends PairNumberComponent<Float> {

    }
}
