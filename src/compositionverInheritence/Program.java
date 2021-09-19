/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositionverInheritence;

/**
 *
 * @author User
 */
public class Program {

    public static void main(String arg[]) {
        GameObject player = new GameObject(new visible(), new Movable(), new Solid());

        player.update();
        player.Collide();
        player.Draw();

        GameObject cloud = new GameObject(new visible(), new Movable(), new NotSolid());

        cloud.update();
        cloud.Collide();
        cloud.Draw();

        GameObject building = new GameObject(new visible(), new NotMovable(), new Solid());

        building.update();
        building.Collide();
        building.Draw();

        GameObject trap = new GameObject(new Invisible(), new NotMovable(), new Solid());

        trap.update();
        trap.Collide();
        trap.Draw();
    }

}
