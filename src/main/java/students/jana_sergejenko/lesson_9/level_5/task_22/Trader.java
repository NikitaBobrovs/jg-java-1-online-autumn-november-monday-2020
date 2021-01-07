package students.jana_sergejenko.lesson_9.level_5.task_22;

class Trader {

    private String fullName;
    private String city;
    private String country;

    public Trader(String fullName, String city, String country){
        this.fullName=fullName;
        this.city=city;
        this.country=country;
    }
    public String getfullName(){
        return fullName;
    }
    public String getcity(){
        return city;
    }
    public String getcountry(){
        return country;
    }
    @Override
    public String toString() {
        return "fullName:" + this.fullName + ", "
                + "city:" + this.city + ", " + "country:"
                + this.country;
    }
}
