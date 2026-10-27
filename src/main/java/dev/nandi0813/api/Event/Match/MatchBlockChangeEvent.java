package dev.nandi0813.api.Event.Match;

import dev.nandi0813.api.Interface.Match;
import lombok.Getter;
import org.bukkit.block.Block;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Called on the main thread after core records a block change in a match (place, break, fluid, fire, explosion,
 * temporary build removal). The block may still hold its old state; read it later in the tick.
 * Not called for the rollback after the match.
 * @since 2.11.0
 */
@Getter
public class MatchBlockChangeEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    private final Match match;
    private final Block block;

    public MatchBlockChangeEvent(Match match, Block block) {
        this.match = match;
        this.block = block;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

}
