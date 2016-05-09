/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.enemy.ship;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class EnemyShipTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EnemyShip enemy=null;
        EnemyShipFactory shipfactory=new EnemyShipFactory();
        String ship=" ";
        Scanner scn=new Scanner(System.in);
        System.out.println("What type of ship?? U/R/B ");
        if(scn.hasNextLine())
        {
            String shiptype=scn.nextLine();
            enemy=shipfactory.makeEnemyShip(shiptype);
            doStuffEnemy(enemy);
            
        }
//        System.out.println("What type of ship?? U/R ");
//        if(scn.hasNextLine())
//        {
//            ship=scn.nextLine();
//        }
//        if(ship.equals("U"))
//        {
//            enemy=new UFOEnemyShip();
//        }
//        else if(ship.equals("R"))
//        {
//            enemy=new RocketEnemyShip();
//            
//        }
//        else {
//            System.out.println("please enter U or R ");
//        }
        
        //EnemyShip ufoShip=new UFOEnemyShip();
        
        //doStuffEnemy(enemy);
    }
    public static void doStuffEnemy(EnemyShip anEnemyShip)
    {
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
    
}
