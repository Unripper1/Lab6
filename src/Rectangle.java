interface Moveable{
    public void Move(int a,int b,int c);
}
abstract class Shape {
    int a;
    public abstract String toString();
}


class Rectangle extends Shape{
    int b;

    public String toString() {
        return "Rectangle{" +
                "b=" + b +
                '}';
    }
}


class  MoveablePoints implements Moveable{
    int x;
    public void Move(int a,int b,int c){
        x+=a*c;
        y+=b*c;
    };
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    int y;
    int speed;
    String getCord(){
        return x + " "+y;
    };

    public int getSpeed() {
        return speed;
    }
}

class  MoveableRectangle extends Rectangle implements Moveable{
    public void Move(int a,int b, int c){
        one.x+=a*c;
        one.y+=b*c;
        two.x+=a*c;
        two.x+=b*c;
    };
    MoveablePoints one= new MoveablePoints();
    void setOne(int a, int b,int c){
        one.setSpeed(c);
        one.setX(a);
        one.setY(b);
    }
    MoveablePoints two= new MoveablePoints();
    void setTwo(int a, int b,int c){
        two.setSpeed(c);
        two.setX(a);
        two.setY(b);
    }
    boolean isEqualSpeed(){
        if( one.getSpeed()==two.getSpeed()){
            return true;
        }
        else
            return false;
    };
}
class Main{
    public static void main(String[] args) {
        MoveableRectangle rect=new MoveableRectangle();
        rect.setOne(1,2,3);
        rect.setTwo(3,6,3);
        System.out.println( rect.isEqualSpeed());

    }
}

/*@startuml
interface Moveable{
    Move(int a,int b,int c): void
}



class Rectangle extends shape{
    b: int
    toString(): String
}
class  MoveableRectangle extends Rectangle implements Moveable{
    one: MoveablePonts
    two: MoveablePonts
    isEqual(): boolean
    Move(int a,int b,int c): void
}

class  MoveablePoints implements Moveable{
    x: int
    y: int
    speed: int
    getCord(): int
    Move(int a,int b,int c): void
}
 MoveablePoints --o MoveableRectangle
@enduml*/
