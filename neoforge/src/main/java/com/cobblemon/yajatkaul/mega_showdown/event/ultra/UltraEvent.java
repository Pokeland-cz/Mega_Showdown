package com.cobblemon.yajatkaul.mega_showdown.event.ultra;

import com.cobblemon.mod.common.api.battles.model.PokemonBattle;
import com.cobblemon.mod.common.battles.pokemon.BattlePokemon;
import net.neoforged.bus.api.Event;

public class UltraEvent extends Event {
    private final PokemonBattle battle;
    private final BattlePokemon pokemon;

    public UltraEvent(PokemonBattle battle, BattlePokemon pokemon) {
        this.battle = battle;
        this.pokemon = pokemon;
    }

    public PokemonBattle getBattle() {
        return battle;
    }

    public BattlePokemon getPokemon() {
        return pokemon;
    }
}