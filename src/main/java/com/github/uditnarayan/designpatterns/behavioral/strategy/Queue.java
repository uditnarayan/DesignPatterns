package com.github.uditnarayan.designpatterns.behavioral.strategy;

import com.github.uditnarayan.designpatterns.behavioral.strategy.queue_strategy.IQueueStrategy;

public class Queue {

    private final IQueueStrategy strategy;

    public Queue(IQueueStrategy strategy) {
        this.strategy = strategy;
    }

    public void enqueue(Item item) {
        this.strategy.queue(item);
    }

    public Item dequeue() {
        return this.strategy.dequeue();
    }
}
