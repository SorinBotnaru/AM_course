package com.example.rest;

import java.util.concurrent.CopyOnWriteArrayList;

public class App 
{
    public static void main( String[] args )
    {
        CopyOnWriteArrayList copy=MockPlayerList.getInstance();
        for (Object c:copy
             ) {
            System.out.println(c);

        }
    }
}
