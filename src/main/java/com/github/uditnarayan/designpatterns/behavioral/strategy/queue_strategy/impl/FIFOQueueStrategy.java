package com.github.uditnarayan.designpatterns.behavioral.strategy.queue_strategy.impl;

import com.github.uditnarayan.designpatterns.behavioral.strategy.queue_strategy.IQueueStrategy;
import com.github.uditnarayan.designpatterns.behavioral.strategy.Item;

import java.util.LinkedList;
import java.util.Queue;

public class FIFOQueueStrategy implements IQueueStrategy {

    private final Queue<Item> queue;

    public FIFOQueueStrategy() {
        this.queue = new LinkedList<>();
    }

    public void queue(Item item) {
        this.queue.add(item);
    }

    public Item dequeue() {
        return queue.poll();
    }
}
