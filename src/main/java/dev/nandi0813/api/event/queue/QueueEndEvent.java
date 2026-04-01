package dev.nandi0813.api.event.queue;

import dev.nandi0813.api.abstraction.Queue;
import lombok.Getter;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

@Getter
public class QueueEndEvent extends Event {

    private static final HandlerList handlers = new HandlerList();
    private final Queue queue;

    public QueueEndEvent(Queue queue) {
        this.queue = queue;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

}
