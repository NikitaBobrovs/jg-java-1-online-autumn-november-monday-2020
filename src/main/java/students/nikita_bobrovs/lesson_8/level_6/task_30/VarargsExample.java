package students.nikita_bobrovs.lesson_8.level_6.task_30;

import java.util.Arrays;

class VarargsExample {
    String shoppingChart(String ...products){
        return "Have to buy : "+ Arrays.deepToString(products);
    }

    public static void main(String[] args) {
        System.out.println(new VarargsExample().shoppingChart("bread","milk","soap","and water."));
        System.out.println(new VarargsExample().shoppingChart("oil","and chips"));
    }
}
