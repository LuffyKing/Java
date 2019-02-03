class BoxClass{
    double width;
    double length;
    double depth;
    BoxClass(double w, double l, double d){
        width = w;
        length = l;
        depth = d;
    }
    BoxClass(BoxClass Abox){
        width = Abox.width;
        length = Abox.length;
        depth = Abox.depth;
    }
    BoxClass(){
        width = -1;
        length = -1;
        depth = -1;
    }
    BoxClass(double leng){
        width = leng;
        length = leng;
        depth = leng;
        System.out.println(width + " " +length + " " +depth);
    }
    double volume() {
        System.out.println(width + " " +length + " " +depth);
        return width * length * depth;   
    }
}
class BoxWeight extends BoxClass{
    double weight;
    BoxWeight(double w, double h, double d, double m){
        super(w, h, d);
        weight = m;
    }

    BoxWeight(BoxWeight obj){
        super(obj);
        weight = ob.weight;
    }
    BoxWeight(double len, double m){
        super(len);
        weight = m;
    }
    BoxWeight(){
        super();
        weight = -1;
    }
}

class Shipment extends BoxWeight{
    double cost;
    Shipment(double w, double h, double d, double m, double c){
        super(w, h, d, m);
        cost = c;
    }
    Shipment( Shipment obj){
        super(obj);
        cost  = obj.cost;
    }
    Shipment(){
        super();
        cost = -1;
    }
    Shipment(double len, double m, double c){
        super(len, m);
        cost = c;
    }
}
/**
 * Box
 */
public class Box {
    public static void main(String[] args) {
        BoxClass mybox = new BoxClass(5, 10, 25);
        BoxClass mybox2 = new BoxClass();
        BoxClass Box3 = new BoxClass(32.00);
        System.out.println(Box3.volume());
        BoxClass mybox4 = new BoxClass(Box3);
        System.out.println("Volume is for mybox2 " + mybox2.volume());
        System.out.println("Volume is for mybox " + mybox.volume());
        System.out.println(Box3.volume());
        System.out.println("Volume is for mybox3 " +  Box3.volume());
        System.out.println("Volume is for mybox4 " + mybox4.volume());
    }
}