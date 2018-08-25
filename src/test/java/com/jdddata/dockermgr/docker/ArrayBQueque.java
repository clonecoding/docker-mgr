package com.jdddata.dockermgr.docker;

import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBQueque extends ArrayBlockingQueue {
    public ArrayBQueque(int capacity) {
        super(capacity);
    }

    public ArrayBQueque(int capacity, boolean fair) {
        super(capacity, fair);
    }

    public ArrayBQueque(int capacity, boolean fair, Collection c) {
        super(capacity, fair, c);
    }
}
