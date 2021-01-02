package students.jelena_kaverska.lesson_8.level_2.task_9;

class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }

}

class ComputerPlayer extends Player{

    ComputerPlayer(String name) {
        super(name);
    }
}