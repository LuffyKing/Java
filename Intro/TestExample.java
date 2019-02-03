class Test{
    int a,b;
    Test(int i, int j){
        a = i;
        b = j;
    }
    boolean equalTo(Test otherObj){
        return otherObj.a == a && otherObj.b == b;
    }
}

class TestExample{
    public static void main(String[] args){
        Test test1 = new Test(10, 10);
        Test test2 = new Test(1,1);
        Test test3 = new Test(10,10);
        System.out.println("Are test 1 and test 3 equal? " + test1.equalTo(test3));
        System.out.println("Are test 1 and test 2 equal? " + test1.equalTo(test2));
    }
}