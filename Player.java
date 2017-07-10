/**
 * Player class represent the object which the player will control.
 * The class renders the object and provides necessary methods for
 * the game.
 */

package com.main;

import java.awt.*;

public class Player extends GameObject
{
    public Player(int x, int y, ID id)
    {
        super(x, y, id);
    }

    public void tick()
    {
        x += velX;
        y += velY;

        x = Game.clamp(x, 0, Game.WIDTH - 37);
        y = Game.clamp(y, 0, Game.HEIGHT - 60);
    }

    public void render(Graphics g)
    {
        g.setColor(Color.white); //for testing
        g.fillRect(x, y, 32,32); //for testing
    }

}