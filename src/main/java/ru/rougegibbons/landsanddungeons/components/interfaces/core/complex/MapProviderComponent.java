package ru.rougegibbons.landsanddungeons.components.interfaces.core.complex;

import ru.rougegibbons.landsanddungeons.components.interfaces.Component;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.affectors.generic.AffectorComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.mixins.PackableComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.PropertyComponent;

import java.util.Map;

/**
 * interface for components containing other components
 * and representing them as a {@link Map}.
 *
 * @param <T> - any implementation of {@link Component} interface and its extensions.
 * @param <K> - type of key objects.
 * @see Component
 * @see PackableComponent
 * @see Map
 * @since 0.4.6
 */
public interface MapProviderComponent<K, T extends Component>
        extends PackableComponent, Map<K, T> {
    /**
     * {@link MapProviderComponent} interface extension representing game entity properties container.
     *
     * @see ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity
     * @see PropertyComponent
     * @since 1.0.2
     */
    interface GameEntityPropertiesContainer extends MapProviderComponent<Long, PropertyComponent> {

    }

    /**
     * {@link MapProviderComponent} interface extension representing game entity affectors container.
     *
     * @see ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity
     * @see ListProviderComponent.AffectorsList
     * @see AffectorComponent
     * @since 1.0.2
     */
    interface GameEntityAffectorsContainer extends
            MapProviderComponent<Long, ListProviderComponent.AffectorsList> {
    }

    /**
     * {@link MapProviderComponent} interface extension representing poll's votes container.
     *
     * @see MapProviderComponent
     * @see ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.polls.Vote
     * @see ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.polls.Poll
     * @see GameEntityStorageComponent.VoteSlot
     * @since 1.1.3
     */
    interface VotesContainer extends
            MapProviderComponent<Long, GameEntityStorageComponent.VoteSlot> {

    }


}
