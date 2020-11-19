package students.jelena_kaverska.lesson_3.level_7.task_30;

class Circle {
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    double calculateArea() {
        return radius * radius * Math.PI;
    }
}