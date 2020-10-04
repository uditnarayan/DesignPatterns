package com.github.uditnarayan.designpatterns.bahavioral.strategy;

import com.github.uditnarayan.designpatterns.behavioral.strategy.Item;
import com.github.uditnarayan.designpatterns.behavioral.strategy.Queue;
import com.github.uditnarayan.designpatterns.behavioral.strategy.queue_strategy.impl.FIFOQueueStrategy;
import com.github.uditnarayan.designpatterns.behavioral.strategy.queue_strategy.impl.NaturalDateOrderStrategy;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class NaturalDateOrderedQueueTest {

    private Queue queue;

    private List<Item> getItems() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        List<Item> items = new ArrayList<>();
        for (int i = 1; i <=3; i++) {
            String dateString = String.format("%02d/10/2020", 4-i);
            Date date = simpleDateFormat.parse(dateString);
            items.add(new Item(i, "Name"+i, date ));
        }
        return items;
    }

    public NaturalDateOrderedQueueTest() {
        queue = new Queue(new NaturalDateOrderStrategy());
    }

    @Test
    public void test() throws ParseException {
        List<Item> items = getItems();
        for (Item item : items) {
            queue.enqueue(item);
        }

        for (int i = 1; i <= items.size(); i++) {
            Item item = queue.dequeue();
            assert items.contains(item);
            assert item.getId() == 4-i;
        }
    }
}
