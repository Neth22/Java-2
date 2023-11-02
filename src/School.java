public class School {
    void oldLearning(){
        System.out.println("Using Galpuwaruwa");
    }
}
class newSchool extends School{
    void newLearning(){
        System.out.println("Using Books");
    }
}
class modernSchool extends newSchool{
    void modernLearning(){
        System.out.println("Using Tab");
    }
}
class Test{
    public static void main(String[] args) {
        modernSchool ms=new modernSchool();
        ms.oldLearning();
        ms.newLearning();
        ms.modernLearning();
    }
}