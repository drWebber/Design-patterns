package com.company.executors;

import com.patterns.adapter.RoundHole;
import com.patterns.adapter.RoundPeg;
import com.patterns.adapter.SquarePeg;
import com.patterns.adapter.SquarePegAdapter;

public class Adapter implements Executable {
    @Override
    public void execute() {
        System.out.println("---Adapter---");
        RoundHole roundHole = new RoundHole(20);


        System.out.print("Does round peg fits the hole? It's ");
        System.out.println(roundHole.fits(new RoundPeg(10)));

        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(new SquarePeg(30));
        System.out.print("Does square peg fits the hole? It's ");
        System.out.println(roundHole.fits(squarePegAdapter));
    }
}
