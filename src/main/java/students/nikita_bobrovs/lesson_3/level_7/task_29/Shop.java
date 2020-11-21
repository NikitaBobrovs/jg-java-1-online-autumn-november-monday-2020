package students.nikita_bobrovs.lesson_3.level_7.task_29;

public class Shop {
    String name;
    String productCategory;
    double area;

    Shop(String name,String productCategory,double area){
        this.name = name;
        this.productCategory = productCategory;
        this.area = area;
    }
    void changeName(String changeName){
        this.name = changeName;
    }
    void changeCategory(String changeCategory){
        this.productCategory = changeCategory;
    }
    void changeArea(double changeArea){
        this.area = changeArea;
    }
    void printInfo(){
        System.out.println(this.name+" is a "+this.productCategory+" shop with area of "+this.area+" square meters.");
    }
}


class ShopDemo{
    public static void main(String[] args) {
        Shop firstShop = new Shop("Maxima","product",4500.5);
        firstShop.printInfo();
        System.out.println();

        firstShop.changeName("Depo");
        firstShop.changeCategory("construction material");
        firstShop.changeArea(3000.80);
        firstShop.printInfo();
    }
}
