public class Tester {
    public static void testThat(boolean condition) {
        if (condition) {
            System.out.println("ok");
        } else {
            System.out.println("không ok");
        }
    }

    public static void main(String[] args) {
        NumbersStack numbersStack = new NumbersStack();
        testThat(numbersStack.getCount() == 0);

        numbersStack.push(10);
        testThat (numbersStack.getCount() == 1);

        numbersStack.push(20);
        testThat (numbersStack.getCount() == 2);

        testThat(numbersStack.pop() == 20);
        testThat(numbersStack.pop() == 10);


        numbersStack.push(100);
        numbersStack.push(200);
        testThat(numbersStack.peak() == 200);
        testThat(numbersStack.peak() == 200);
        testThat (numbersStack.getCount() == 2);

        numbersStack.empty();
        testThat(numbersStack.getCount() == 0);
    }
}
