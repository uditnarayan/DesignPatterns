package com.github.uditnarayan.designpatterns.behavioral.strategy.queue_strategy.impl;

import com.github.uditnarayan.designpatterns.behavioral.strategy.queue_strategy.IQueueStrategy;
import com.github.uditnarayan.designpatterns.behavioral.strategy.Item;

import java.util.Comparator;
import java.util.PriorityQueue;

public class NaturalDateOrderStrategy implements IQueueStrategy {

    private final PriorityQueue<Item> queue;

    public NaturalDateOrderStrategy() {
        queue = new PriorityQueue<>(new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return o1.getExpiryDate().compareTo(o2.getExpiryDate());
            }
        });
    }

    @Override
    public void queue(Item item) {
        queue.add(item);
    }

    @Override
    public Item dequeue() {
        return queue.poll();
    }
}
