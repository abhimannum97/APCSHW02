public class MyCoordinate{
    int x, y;

    public MyCoordinate{
	x = 0;
	y = 0;
    }
    
    public String toString(){
	String str;
	str = "(" + x + " , " + y + ")"; 
	return str;
    }
    
    public int getX(){
	return x;
    }

    public int getY(){
	return y;
    }

    public void setX(int u){
	x = u;
    }

    public void setY(int u){
	y = u;
    }

}