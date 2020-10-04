package com.github.uditnarayan.designpatterns.behavioral.strategy.queue_strategy;

import com.github.uditnarayan.designpatterns.behavioral.strategy.Item;

import java.util.Date;

public interface IQueueStrategy {
    void queue(Item item);
    Item dequeue();
}
