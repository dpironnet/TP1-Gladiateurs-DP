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
public class Retiaire extends Personnage {
    
    public Retiaire(String nom, int attaqueMax, int defense, int pvs, int ini){
        super(nom,attaqueMax,defense,pvs,ini);
    }
        boolean filet = true;

    @Override
    public void frapperPersonnage(Personnage personnageCible) {
        if (filet == true) {
            System.out.println(this.nom + " lance son filet");
            Random random = new Random();
            if (random.nextInt(10) == 0) {
                System.out.println(" Son filet attrape "  + personnageCible.getNom() + " et il l’empale sauvagement avec sa lance");
            } else {
                System.out.println("Le filet n'atteint pas sa cible");
                filet = false;
            }
        } else {
            System.out.println(this.getNom() + " ramasse son filet et en profite pour attaquer");
            super.frapperPersonnage(personnageCible);
            filet = true;
        }

        

    }

}
