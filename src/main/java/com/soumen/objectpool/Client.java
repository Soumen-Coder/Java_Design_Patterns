package com.soumen.objectpool;

import javafx.geometry.Point2D;

public class Client {

    private static final ObjectPool<BitMap> bitMapPool = new ObjectPool<>(()->new BitMap("logo.bmp"), 5);

    public static void main(String[] args) {

        BitMap b1 = bitMapPool.get();
        b1.setLocation(new Point2D(10,10));

        BitMap b2 = bitMapPool.get();
        b2.setLocation(new Point2D(-10,10));

        b1.draw();
        b2.draw();

        bitMapPool.release(b1);
        bitMapPool.release(b2);

    }
}
