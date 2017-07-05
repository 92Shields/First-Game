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
    }

    public void render(Graphics g)
    {
        g.setColor(Color.white); //for testing
        g.fillRect(x, y, 32,32); //for testing
    }
}