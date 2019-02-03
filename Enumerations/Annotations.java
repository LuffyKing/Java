package Enumerations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import java.lang.reflect.Method;
import java.lang.annotation.*;
/**
 * Annotations
 */
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
    String str() default "Testing";
    int val() default 9000;
}
@Retention(RetentionPolicy.RUNTIME)
@interface What{
    String description();
}
@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker{
}
@Retention(RetentionPolicy.RUNTIME)
@interface MySingle{
    int value();
    int xyz() default 0;
}
@What(description="An annotation test class")
@MyAnno(str="Anno class example", val =99)
public class Annotations {
    @MyMarker
    public static void aMeth() {
        Annotations a = new Annotations();
        try{
            Method m = a.getClass().getMethod("aMeth");
            if(m.isAnnotationPresent(MyMarker.class)){
                System.out.println("MyMarker is present.");
            }
        } catch(NoSuchMethodException exc){
            System.out.println("Method Not Found.");
        }
    }

    @MySingle(100)
    public static void bMeth() {
        Annotations anno = new Annotations();
        try {
            Method m = anno.getClass().getMethod("bMeth");
            MySingle a  = m.getAnnotation(MySingle.class);
            System.out.println(a);
        } catch (NoSuchMethodException e) {
            //TODO: handle exception
            System.out.println("No such method found.");
        }
    }

    @What(description="An annotation test method")
    @MyAnno(str="Annotation Example", val =100)
    public static void myAnnFunct(String str, int i){ 
        
        Annotations ant = new Annotations();
        Annotation annos [] = ant.getClass().getAnnotations();
        for (Annotation anno : annos) {
            System.out.println(anno);
        }
        try {
            Method m = ant.getClass().getMethod("myAnnFunct", String.class, int.class);
            annos = m.getAnnotations();
            for (Annotation anno : annos) {
                System.out.println(anno);
            }
        } catch (NoSuchMethodException exc) {
            //TODO: handle exception
            System.out.println("Method Not Found");
        }
    }
    public static void main(String[] args) {
        myAnnFunct("test", 10);
        aMeth();  
        bMeth();
    }
}