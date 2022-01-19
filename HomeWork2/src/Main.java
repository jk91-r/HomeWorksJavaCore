public class Main {

    public static void main(String[] args) {
        String[][] array = new String[][]{{"1", "1", "1", "1"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"}};
//        String[][] array = new String[][]{{"1", "1", "1", "1"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4"}};
//        String[][] array = new String[][]{{"1", "1", "1", "1"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}};
//        String[][] array = new String[][]{{"1", "1", "1", "1"}, {"a", "b", "c", "d"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"}};

        try {
            System.out.println(convertArray(array));
        } catch (MyArraySizeException exception) {
            exception.printStackTrace();
            System.out.println("Недопустимый размер массива");
        } catch (MyArrayDataException exception) {
            exception.printStackTrace();
            System.out.println("Значение элемента в массиве не является численным ");
        } finally {
                System.out.println("the end");
        }

    }

    static int convertArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum=0;
        if (array.length != 4) {
            throw new MyArraySizeException();
        }

                for (int i = 0; i < array.length; i++) {
                    if (array[i].length != 4) {
                        throw new MyArraySizeException();
                    }
                            for (int j = 0; j < array[i].length; j++){
                                try {
                                    sum += Integer.parseInt(array[i][j]);
                                } catch (NumberFormatException exception) {
                                    throw new MyArrayDataException();
                                }
                            }
                }
                return sum;
    }
}



