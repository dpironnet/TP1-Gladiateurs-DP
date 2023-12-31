/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

import java.util.Random;

/**
 *
 * @author 202230142
 */
public class Mirmillon extends Personnage {

    public Mirmillon(String nom, int attaqueMax, int defense, int pvs, int ini){
        super(nom,attaqueMax,defense,pvs,ini);
    }
    
    @Override
    public void setNewInitiativeRandom() {
        Random random = new Random();
        int newInitiative = random.nextInt(31);
        this.setInitiative(newInitiative);
    }

    @Override
    public void frapperPersonnage(Personnage personnageCible) {
        super.frapperPersonnage(personnageCible);
        if (personnageCible.getPointsDeVie() == 0) {
            System.out.println(" ");
            System.out.println(personnageCible.getNom() + "a ete décapité !");
        } else {
                System.out.println("Bob lance une deuxieme attaque !");
                 super.frapperPersonnage(personnageCible);
        }
    }
}
