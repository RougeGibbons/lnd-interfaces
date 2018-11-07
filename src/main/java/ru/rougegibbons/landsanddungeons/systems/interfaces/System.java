package ru.rougegibbons.landsanddungeons.systems.interfaces;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.components.interfaces.Component;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity;
import ru.rougegibbons.landsanddungeons.events.interfaces.core.Event;

public interface System<T> {
    void update();

    void attachElement(@NotNull T element);

    void detachElement(@NotNull Long elementId);

    void detachElement(@NotNull T element);

    void receiveEvent(@NotNull Event event);

    interface ComponentSystem<C extends Component> extends System<C> {

    }

    interface GameEntitySystem<E extends GameEntity> extends System<E> {

    }
}
