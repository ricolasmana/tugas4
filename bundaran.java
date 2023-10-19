import greenfoot.*;
import java.awt.Color;

public class bundaran extends Actor
{
    private int jeda=5;
    
    public void addedToWorld(World MyWorld)
    {
        GreenfootImage image = new GreenfootImage(100, 100);
        image.fillOval(0,0,image.getWidth()-1, image.getHeight()-1);
        image.fillOval(20,20,image.getWidth()-41, image.getHeight()-41);
        setImage(image);
        jeda=5;
    }
    public void act()
    {
        if(jeda>0)jeda--;
        else getWorld().removeObject(this);
    }
}
