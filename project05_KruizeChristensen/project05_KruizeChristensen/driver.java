package project05_KruizeChristensen;

public class driver {
	public static void main(String[] args) {
		
		
		System.out.println("test array stack");
		ArrayStack<String> arrayTestStack = new ArrayStack<>();

		arrayTestStack.push("one");
		arrayTestStack.push("two");
		arrayTestStack.push("three");
		arrayTestStack.push("four");
		arrayTestStack.push("five");

		System.out.println(arrayTestStack.top());
		System.out.println(arrayTestStack.peek());

		System.out.println();
		
		
		// test doubly linked list queue
		System.out.println("test doubly linked list queue");
		DLLQueue<Integer> dllTestQueue = new DLLQueue<>();
		
		dllTestQueue.enqueue(1);
		dllTestQueue.enqueue(2);
		dllTestQueue.enqueue(3);
		dllTestQueue.enqueue(4);
		dllTestQueue.enqueue(5);
		
		System.out.println(dllTestQueue.toString());

		dllTestQueue.dequeue();
		dllTestQueue.dequeue();
		System.out.println(dllTestQueue.toString());
		System.out.println();
		
		
		
		
		// test doubly linked list stack
		System.out.println("test doubly linked list stack");
		DLLStack<String> dllTestStack = new DLLStack<>();

		dllTestStack.push("one");
		dllTestStack.push("two");
		dllTestStack.push("three");
		dllTestStack.push("four");
		dllTestStack.push("five");

		System.out.println(dllTestStack.toString());

		dllTestStack.pop();
		dllTestStack.pop();
		System.out.println(dllTestStack.toString());
		System.out.println();


		System.out.println("Validator");
		CallStackValidator tester = new CallStackValidator();

		// should validate

		
		String callStack = "A calls B B calls C C halts B halts A halts";
		System.out.println(tester.isValid(callStack));

		callStack = "A calls B B calls C C calls D D halts C calls E E halts C halts B halts A halts";
		System.out.println(tester.isValid(callStack));

		callStack = "A calls A A halts A halts";
		System.out.println(tester.isValid(callStack));

		callStack = "main calls functionA functionA calls testMe testMe halts functionA calls runRun runRun halts functionA halts main halts";
		System.out.println(tester.isValid(callStack));

		// Should fail

		callStack = "main calls A A calls B A calls C B halts C halts A halts main halts";
		System.out.println(tester.isValid(callStack));

		callStack = "A calls B B halts";
		System.out.println(tester.isValid(callStack));

	}
}
