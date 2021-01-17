package students.jelena_kaverska.lesson_10.level_3.task_8;

import java.util.Arrays;
import java.util.Optional;

class InMemoryDatabase implements ProductDatabase {
    //хранить продукты в памяти используя для этого массив
    private Product[] products = new Product[]{};

    public Product[] getProducts() {
        return products;
    }

    //должен добавлять новый продукт в массив
    @Override
    public void save(Product product) {
        //создаём новый массив длиннее предыдущего на 1
        //копируем все содержимое сторого массива в новый
        Product[] productsNew = Arrays.copyOf(products, products.length + 1);
        //в последнюю ячейку нового массива сохраняем новый продукт
        productsNew[productsNew.length - 1] = product;
        products = Arrays.copyOf(productsNew, products.length + 1);
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product : products) {
            if (product == null) {
                continue;
            }
            if (product.getTitle().equals(productTitle)) {
                return product;
            }
        }
        return null;
    }

    public Optional<Product> findByTitle2(String productTitle) {
        for (Product product : products) {
            if (product.getTitle().equals(productTitle)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }

    void printProducts2() {
        System.out.println(Arrays.toString(products));
    }

    void printProducts() {
        for (Product product : products) {
            if (product == null) {
                continue;
            }
            System.out.println(product);
        }
    }
}

class My {
    public static void main(String[] args) {
        InMemoryDatabase db = new InMemoryDatabase();
        System.out.println("products before adding aaa: ");
        db.printProducts2();
        db.save(new Product("aaa"));
        System.out.println("products after adding aaa: ");
        db.printProducts2();
        db.save(new Product("bbb"));
        System.out.println("products after adding bbb: ");
        db.printProducts2();
        db.save(new Product("ccc"));
        System.out.println("products after adding ccc: ");
        db.printProducts2();
        db.save(new Product("aaa"));
        System.out.println("products after adding aaa 2: ");
        db.printProducts2();

        System.out.println("Find bbbb: " + db.findByTitle("bbbb"));
        System.out.println("Find bbb: " + db.findByTitle("bbb"));
        System.out.println("Find ccc: " + db.findByTitle("ccc"));
        db.save(new Product("qqqqq"));
        db.printProducts2();

        System.out.println(db.findByTitle2("ссс"));
    }
}