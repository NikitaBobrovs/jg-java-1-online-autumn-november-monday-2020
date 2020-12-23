package students.jelena_kaverska.lesson_7.level_7.task_16;

import students.jelena_kaverska.lesson_7.level_7.task_15.UserEntity;

import java.util.Arrays;

class UserRepository {
    private UserEntity[] users = new UserEntity[50];
    private int position = 0;

    //сохранение пользователя
    public boolean saveUser1(UserEntity userEntity) {
        for (UserEntity user : users) {
            if (user != null
                    && (user.getId().equalsIgnoreCase(userEntity.getId())
                    || user.getCode().equalsIgnoreCase(userEntity.getCode()))) {
                return false;
            }
        }
        users[position] = userEntity;
        position++;
        return true;
    }

    //сохранение пользователя
    public boolean saveUser(UserEntity userEntity) {
        for (UserEntity user : users) {
            if (user == null) {
                continue;
            }
            if (user.getId().equalsIgnoreCase(userEntity.getId())
                    || user.getCode().equalsIgnoreCase(userEntity.getCode())) {
                return false;
            }
        }
        users[position] = userEntity;
        position++;
        return true;
    }

    //получение пользователя по id
    public UserEntity getUserById(String id) {
        for (UserEntity user : users) {
            if (user == null) {
                continue;
            }
            if (user.getId().equalsIgnoreCase(id)) {
                return user;
            }
        }
        return null;
    }

    //получение пользователей по имени
    public UserEntity[] getUsersByName(String name) {
        UserEntity[] userEntities = new UserEntity[50];
        int index = 0;
        for (UserEntity user : users) {
            if (user == null) {
                continue;
            }
            if (user.getName().equalsIgnoreCase(name)) {
                userEntities[index] = user;
                index++;
            }
        }
        return userEntities;
    }

    //получение всех пользователей
    public UserEntity[] getAllUsers() {
        return users;
    }

    public void printAllUsers() {
        System.out.println(Arrays.toString(users));
    }

    //редактирование пользователя TBD
    //удаление пользователя TBD
}

class MyUserDemo {

    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        UserEntity u1 = new UserEntity("123", "BBB", "CCC", "030303");
        UserEntity u2 = new UserEntity("124", "AAA", "DDD", "030306");
        UserEntity u3 = new UserEntity("124", "BBB", "EEE", "030308");
        UserEntity u4 = new UserEntity("121", "AAA", "FFF", "130303");
        UserEntity u5 = new UserEntity("129", "bbb", "FFF", "130309");

        userRepository.saveUser(u1);
        userRepository.saveUser(u2);
        userRepository.saveUser(u3);
        userRepository.saveUser(u4);
        userRepository.saveUser(u5);
        userRepository.printAllUsers();

        System.out.println("120 user id: " + userRepository.getUserById("120"));
        System.out.println("127 user id: " + userRepository.getUserById("127"));
        System.out.println(Arrays.toString(userRepository.getUsersByName("aaa")));
        System.out.println(Arrays.toString(userRepository.getUsersByName("bbb")));
        System.out.println(Arrays.toString(userRepository.getUsersByName("ddd")));
    }
}