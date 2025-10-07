package net.ouahid.presentation;

import net.ouahid.dao.Daoimp;
import net.ouahid.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        Daoimp d = new Daoimp();
        MetierImpl metier = new MetierImpl(d);
        //metier.setDao(d);
        System.out.println("Res= "+metier.calcul());
    }
}
