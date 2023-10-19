import greenfoot.*;

public class musuh extends Actor
{
    private int vx = 0;
    private boolean toRemove = false;
    
    public musuh()
    {

    }
    
    public musuh(int v)
    {
        vx=v;
    }
    
    public void addedToWorld(World MyWorld)
    {
        GreenfootImage image = getImage();
        image.scale(100, 100);
        setRotation(-90);
    }
    
    public void move()
    {
       setLocation(getX()+vx, getY());
       Actor actor=getOneIntersectingObject(roket.class);
       if(actor!=null){
           ((roket)actor).hancur();
           hancur();
       }
       if(getX()<-200)toRemove = true;
    }
    
    public void hancur()
    {
        for(int i=0;i<10;i++){
            int px=-20+Greenfoot.getRandomNumber(40);
            int py=-20+Greenfoot.getRandomNumber(40);
            getWorld().addObject(new pecahan(getImage()),getX()+px, getY()+py);
        }
        getWorld().addObject(new bundaran(), getX(), getY());
        toRemove = true;
    }
    public void act()
    {
        if(!toRemove)move();
        else getWorld().removeObject(this);
    }
}
