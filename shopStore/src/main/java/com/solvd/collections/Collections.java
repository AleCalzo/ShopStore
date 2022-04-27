package com.solvd.collections;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.*;
import java.util.stream.IntStream;

public class Collections<listOfAuthors> {

    private static final Logger LOG = LogManager.getLogger("");


    public void bookSales (){

        List<String> e = new ArrayList <String>();

        e.add("Stephen King");
        e.add("Mary Shelley");
        e.add("Isabel Allende");
        e.add("Pablo Neruda");
        e.add("Jorge Luis Borges");


        IntStream myStream = IntStream.of(e.indexOf(3));
        LOG.debug(3);
        LOG.debug(e.size());
        }
    public void sizeOfTshirt (){

        Set size = new HashSet<>();

        size.add('S');
        size.add('M');
        size.add('L');
        size.add('G');

        IntStream myStream = IntStream.range(0,5);

        size.remove('M');

        LOG.debug("The tipe availables of size in the store are: " + myStream);
    }

    public void payments (){

        Set<String> ts1 = new TreeSet<>();

        ts1.add("Cash");
        ts1.add("Credit Card");
        ts1.add("Online Transaction");

    }

    NavigableSet<String> ts1 = new TreeSet<>();

        String check="Cash";


    }

