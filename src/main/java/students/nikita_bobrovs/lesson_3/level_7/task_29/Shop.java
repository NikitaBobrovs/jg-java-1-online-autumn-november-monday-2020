package students.nikita_bobrovs.lesson_3.level_7.task_29;

public class Shop {
    String name;
    String productCategory;
    double area;

    Shop(String getShopName,String getProductCategory,double getShopArea){
        this.name = getShopName;
        this.productCategory = getProductCategory;
        this.area = getShopArea;
    }
    void changeName(String getNewName){
        this.name = getNewName;
    }
    void changeCategory(String getNewCategory){
        this.productCategory = getNewCategory;
    }
    void changeArea(double getNewArea){
        this.area =getNewArea;
    }
    void getInfo(){
        System.out.println(this.name+" is a "+this.productCategory+" shop with area of "+this.area+" square meters.");
    }
}


class ShopDemo{
    public static void main(String[] args) {
        Shop firstShop = new Shop("Maxima","product",4500.5);
        firstShop.getInfo();
        System.out.println();

        firstShop.changeName("Depo");
        firstShop.changeCategory("construction material");
        firstShop.changeArea(3000.80);
        firstShop.getInfo();
    }
}
