package com.damola_INC.Java_WORLD.generics;
import java.io.PrintWriter;

class TwoD{
    int x;
    int y;
    TwoD(int aVar, int bVar){
        x = aVar;
        y = bVar;
    }
}

class ThreeD extends TwoD{
    int z;
    ThreeD(int aVar, int bVar, int cVar){
        super(aVar, bVar);
        z = cVar;
    }
}

class FourD extends ThreeD{
    int t;
    FourD(int aVar, int bVar, int cVar, int dVar){
        super(aVar, bVar, cVar);
        t = dVar;
    }
}

class Coords<T extends TwoD>{
    T[] coordsList;
    Coords( T[] coordsListInput){
        coordsList = coordsListInput;
    }
    static void showXY(Coords<?> coordsObj){
        PrintWriter pw = new PrintWriter(System.out, true);
        for (int i = 0; i < coordsObj.coordsList.length; i++) {
            pw.println("X coordinate: "+coordsObj.coordsList[i].x +" Y coordinate: "+coordsObj.coordsList[i].y);
            
        }
        
    }
    static void showXYZ(Coords<? extends ThreeD> coordsObj){
        PrintWriter pw = new PrintWriter(System.out, true);
        for (int i = 0; i < coordsObj.coordsList.length; i++) {
            pw.println("X coordinate: "+coordsObj.coordsList[i].x +" Y coordinate: "+coordsObj.coordsList[i].y+ " Z coordinate: "+coordsObj.coordsList[i].z);
            
        }

    }

    static void showXYZT(Coords<? extends FourD> coordsObj){
        PrintWriter pw = new PrintWriter(System.out, true);
        for (int i = 0; i < coordsObj.coordsList.length; i++) {
            pw.println("X coordinate: "+coordsObj.coordsList[i].x +" Y coordinate: "+coordsObj.coordsList[i].y+ " Z coordinate: "+coordsObj.coordsList[i].z+" T coordinate: "+coordsObj.coordsList[i].t);
            
        }

    }
}
/**
 * DimsDemo
 */
public class DimsDemo {

    public static void main(String[] args) {
        TwoD[] td = {
            new TwoD(7,9),
            new TwoD(18,4),
            new TwoD(-1,-23),
            new TwoD(0,0)
        };
        ThreeD[] td3 = {
            new ThreeD(7,9,3),
            new ThreeD(18,4,5),
            new ThreeD(-1,-23,-9),
            new ThreeD(0,0,0)
        };
        FourD[] td4 = {
            new FourD(7,9,3,0),
            new FourD(18,4,5,7),
            new FourD(-1,-23,-9,6),
            new FourD(0,0,0,0)
        };
        Coords<TwoD> c = new Coords<TwoD>(td);
        Coords.showXY(c);
        Coords<ThreeD> c3 = new Coords<ThreeD>(td3);
        Coords.showXYZ(c3);
        Coords<FourD> c4 = new Coords<FourD>(td4);
        Coords.showXYZT(c4);
    }
}