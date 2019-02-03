package javalangDemo;
/**
 * ModuleNameDemo
 */
public class ModuleNameDemo {

    public static void main(String[] args) {
        Module myMod = ModuleNameDemo.class.getModule();
        System.out.println("Module is "+ myMod.getName());
        System.out.print("Packages: ");
        for (String pkg : myMod.getPackages()) {
            System.out.println(pkg+ " ");
        }
    }
}