package students.nikita_bobrovs.lesson_8.level_6.task_30;

class VarargsExample2 {
    int multiplyAll(int ...numbers){
        int sum = 1;
        for(int num : numbers){
            sum *= num ;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Multiplication of 2, 3 and 5 = "+ new VarargsExample2().multiplyAll(2,3,5));
        System.out.println("Multiplication of 4 and 5 = "+ new VarargsExample2().multiplyAll(4,5));
    }
}
