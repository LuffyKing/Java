package p1;
class Protection{
    int n;
    private int n_pri;
    protected int n_pro;
    public int n_pub;
    public Protection(){
        System.out.println("base constructor");
        System.out.println("n = " + n);
        System.out.println("n_pri = "+ n_pri);
        System.out.println("n_pub = "+ n_pub);
    }
}