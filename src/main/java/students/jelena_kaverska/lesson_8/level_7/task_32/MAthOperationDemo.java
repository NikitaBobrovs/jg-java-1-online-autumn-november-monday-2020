package students.jelena_kaverska.lesson_8.level_7.task_32;

class MAthOperationDemo {

	public static void main(String[] args) {
		// build and calculate: 10 + 20
		Argument arg1 = new Argument(10);
		Argument arg2 = new Argument(20);
		MathOperation addition = new Addition(arg1, arg2);
		System.out.println("Left side Addition result = " + addition.calculate());

		// build and calculate: 50 - 20
		Argument arg3 = new Argument(50);
		Argument arg4 = new Argument(20);
		MathOperation subtraction = new Subtraction(arg3, arg4);
		System.out.println("Right side Subtraction result = " + addition.calculate());

		// build and calculate: (10 + 20) + (50 - 20)
		MathOperation addition1 = new Addition(addition, subtraction);
		System.out.println("Final Addition result = " + addition1.calculate());

		//(10 - 5) * (20 / 5)
		Argument left1 = new Argument(10);
		Argument right1 = new Argument(5);
		MathOperation subtraction1 = new Subtraction(left1,right1);
		System.out.println("Left result: " + subtraction1.calculate());

		Argument left2 = new Argument(20);
		Argument right2 = new Argument(5);
		MathOperation division = new Division(left2, right2);
		System.out.println("Right result: " + division.calculate());
		MathOperation multiplication = new Multiplication(subtraction1, division);
		System.out.println("Final result: " + multiplication.calculate());

	}

}
