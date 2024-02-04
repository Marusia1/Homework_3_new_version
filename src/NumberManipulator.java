public class NumberManipulator {
    int number;

    public int incrementByOne(int number) {

        return ++number; // not clear why not working with number++

    }

    public int decrementByOne(int number) {

        return --number; // only works for me if -- indicated before title
    }
}
