public class DongVat extends SinhVat implements TraiDat{
    //attr
    public String name;
    //method
    public void eat(String food){
        System.out.println("Eat " + food);
    }

    public void eat(){
        System.out.println("Overloading");
    }

    public void eat(String food, int amount){
        System.out.println("Eat " + food);
    }

    public void eat(String food, double amount){
        System.out.println("Eat " + food);
    }

    @Override
    public void tho() {

    }

    @Override
    public void live() {

    }
}
