package ru.rougegibbons.landsanddungeons.components.interfaces.core.complex;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.mixins.PackableComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.AliveEntity;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.guild.matters.GuildMatter;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.polls.Vote;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.user.UserCharacter;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.log.BattleLog;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.map.MapNode;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.classes.Perk;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.classes.PerkBranch;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items.Item;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items.containers.ItemStorage;

/**
 * generified interface for components that may store some ingame entities
 * (e.g. backpack/bank slots, spellbook, talent trees, etc.).
 *
 * @param <T> - any class implementing {@link GameEntity} interface or its extensions.
 * @see GameEntity
 * @since 1.0.2
 */
public interface GameEntityStorageComponent<T extends GameEntity> extends PackableComponent {
    /**
     * get stored entity.
     *
     * @return stored entity or null if component is empty.
     */
    @Nullable T getStored();

    /**
     * checks if component stores some entity or not.
     *
     * @return true if stored value is null, false otherwise.
     */
    default @NotNull Boolean isEmpty() {
        return getStored() == null;
    }

    /**
     * {@link GameEntityStorageComponent} extension for storing {@link ItemStorage} entities.
     *
     * @see ItemStorage
     * @since 1.1.3
     */
    interface BagSlot extends GameEntityStorageComponent<ItemStorage> {

    }

    /**
     * {@link BagSlot} extension to be used for the character bank's additional storages.
     *
     * @see BagSlot
     * @since 1.1.3
     */
    interface BankBagSlot extends BagSlot {
        /**
         * check if the slot is unlocked and available to be used.
         *
         * @return true if the slot is unlocked, false otherwise.
         */
        @NotNull Boolean isUnlocked();

        /**
         * get the price that will be paid to unlock the slot.
         *
         * @return amount of cash needed to be paid to unlock the slot.
         */
        @NotNull Integer getUnlockingPrice();

        /**
         * unlocks the slot if it isn't unlocked already.
         */
        void unlock();
    }

    /**
     * {@link GameEntityStorageComponent} extension for storing {@link Item} entities.
     *
     * @see Item
     * @since 1.1.3
     */
    interface ItemSlot extends GameEntityStorageComponent<Item> {

    }

    /**
     * {@link GameEntityStorageComponent} extension for storing {@link AliveEntity} entities.
     *
     * @see AliveEntity
     * @since 1.1.3
     */
    interface AliveEntitySlot extends GameEntityStorageComponent<AliveEntity> {

    }

    /**
     * {@link GameEntityStorageComponent} extension for storing {@link UserCharacter} entities.
     *
     * @see UserCharacter
     * @since 1.1.3
     */
    interface UserCharacterSlot extends GameEntityStorageComponent<UserCharacter> {

    }

    /**
     * {@link GameEntityStorageComponent} extension for storing {@link Vote} entities.
     *
     * @see Vote
     * @since 1.1.3
     */
    interface VoteSlot extends GameEntityStorageComponent<Vote> {

    }

    /**
     * {@link GameEntityStorageComponent} extension for storing {@link GuildMatter} entities.
     *
     * @see GuildMatter
     * @since 1.1.3
     */
    interface GuildMatterSlot extends GameEntityStorageComponent<GuildMatter> {

    }

    /**
     * {@link GameEntityStorageComponent} extension for storing {@link Perk} entities.
     *
     * @see Perk
     * @since 1.1.3
     */
    interface PerkSlot extends GameEntityStorageComponent<Perk> {

    }

    /**
     * {@link GameEntityStorageComponent} extension for storing {@link PerkBranch} entities.
     */
    interface PerkBranchSlot extends GameEntityStorageComponent<PerkBranch> {

    }

    /**
     * {@link GameEntityStorageComponent} extension for storing {@link MapNode} entities.
     *
     * @see MapNode
     * @since 1.1.3
     */
    interface MapNodeSlot extends GameEntityStorageComponent<MapNode> {

    }

    /**
     * {@link GameEntityStorageComponent} interface extension for storing {@link BattleLog} entities.
     *
     * @see BattleLog
     * @since 1.1.3
     */
    interface BattleLogSlot extends GameEntityStorageComponent<BattleLog> {

    }
}
