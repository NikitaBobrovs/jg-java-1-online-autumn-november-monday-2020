package students.jana_sergejenko.lesson_7.level_7.task_16;

public class UserRepository {

    private final UserEntity[] entities = new UserEntity[10];
    //poisk po id
    public UserEntity findById(int id) {
        for (UserEntity entity : entities) {
            if (entity.getId() == id) {
                return entity;
            }
        }
        return null;
    }

    //poisk po name
    public UserEntity findByName(String name) {
        for (UserEntity entity : entities) {
            if (entity.getName().equals(name)) {
                return entity;
            }
        }
        return null;
    }

    //vivod vseh poljzovatelej
    public void printAll() {
        //for (UserEntity entity : entities) {
        for (int i = 0; i < entities.length; i++) {
            System.out.println(entities[i]);
        }
    }

    //dobavlenie poljzovatelja
    public void addUserEntity(int id, String name) {
        int i = 0;
        for (i = 0; i < entities.length; i++) {
            if (entities[i] == null) {
                entities[i] = new UserEntity(id, name);
                break;
            }
        }
    }

    //udalenie poljzovatelja po id
    public boolean deleteUserEntityById(int id) {
        int i = 0;
        for (i = 0; i < entities.length; i++) {
            if (entities[i].id == id) {
                entities[i] = null;
            }
            break;
        }
        return true;
    }

    //redaktirovanie poljzovanie po id
    public void editUserEntity(int id, String newName) {
        int i = 0;
        for (i = 0; i < entities.length; i++) {
            if (entities[i].getId() == id) {
                entities[i].setName(newName);
                break;
                //System.out.println(entities[i].getId());
                // System.out.println(entities[i].getName());
            }
        }
    }

    public static void main(String[] args) {

        UserRepository test = new UserRepository();
        test.addUserEntity(1, "LALALALALA");
        test.addUserEntity(2, "JJJJJJ");
        test.printAll();
        //System.out.println(test.findById(1));
        //System.out.println(test.findByName("LALALALALA"));
        //System.out.println(test.deleteUserEntityById(1));
        //test.printAll();
        test.editUserEntity(2, "BBBBBBBBB");
        test.printAll();
    }
}

