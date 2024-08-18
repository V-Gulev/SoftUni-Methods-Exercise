import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numberString = scanner.nextLine().split(" ");

        String command = scanner.nextLine();
        while (!"end".equals(command)) {
            String[] input = command.split(" ");

            if (input[0].equals("exchange")) {
                numberString = ReturnArrayOfString(numberString, input[1]);
            } else if (input[0].equals("first")) {
                if (input[2].equals("even")) {
                    FindFirstEven(numberString, input[1]);
                } else {
                    FindFirstOdd(numberString, input[1]);
                }
            } else if (input[0].equals("last")) {
                if (input[2].equals("even")) {
                    FindLastEven(numberString, input[1]);
                } else {
                    FindLastOdd(numberString, input[1]);
                }
            } else if (input[0].equals("max")) {
                if (input[1].equals("even")) {
                    FindMaxEven(numberString);
                } else {
                    FindMaxOdd(numberString);
                }
            } else if (input[0].equals("min")) {
                if (input[1].equals("even")) {
                    FindMinEven(numberString);
                } else {
                    FindMinOdd(numberString);
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(Arrays.toString(numberString));
    }


    public static String[] ReturnArrayOfString(String[] numberString, String command) {
        int index = Integer.parseInt(command);
        String[] newArray = new String[numberString.length];
        if (index < 0 || index >= numberString.length) {
            System.out.println("Invalid index");
            return numberString;
        } else {
            int counter = 0;
            for (int i = index + 1; i < numberString.length; i++) {
                newArray[counter] = numberString[i];
                counter++;
            }
            for (int i = 0; i <= index; i++) {
                newArray[counter] = numberString[i];
                counter++;
            }
            return newArray;
        }

    }

    public static void FindFirstOdd(String[] numberString, String command) {
        int neededCount = Integer.parseInt(command);
        if (neededCount > numberString.length) {
            System.out.println("Invalid count");
        } else {
            int countOdd = 0;
            for (String j : numberString) {
                if (Integer.parseInt(j) % 2 != 0) {
                    countOdd++;
                }
            }
            int[] array = new int[Math.min(countOdd, neededCount)];
            if (array.length > 0) {
                int index = 0;
                for (int i = 0; i < numberString.length; i++) {
                    if (Integer.parseInt(numberString[i]) % 2 != 0) {
                        array[index] = Integer.parseInt(numberString[i]);
                        index++;
                        if (index > array.length - 1) {
                            break;
                        }
                    }
                }
                System.out.println(Arrays.toString(array));

            } else {
                System.out.println(Arrays.toString(array));
            }
        }
    }

    public static void FindFirstEven(String[] numberString, String command) {
        int neededCount = Integer.parseInt(command);

        if (neededCount > numberString.length) {
            System.out.println("Invalid count");
        } else {
            int countEven = 0;
            for (String j : numberString) {
                if (Integer.parseInt(j) % 2 == 0) {
                    countEven++;
                }
            }
            int[] array = new int[Math.min(countEven, neededCount)];
            if (array.length > 0) {
                int index = 0;
                for (int i = 0; i < numberString.length; i++) {
                    if (Integer.parseInt(numberString[i]) % 2 == 0) {
                        array[index] = Integer.parseInt(numberString[i]);
                        index++;
                        if (index > array.length - 1) {
                            break;
                        }
                    }
                }
                System.out.println(Arrays.toString(array));
            } else {
                System.out.println(Arrays.toString(array));
            }
        }


    }

    public static void FindLastOdd(String[] numberString, String command) {
        int neededCount = Integer.parseInt(command);
        if (neededCount > numberString.length) {
            System.out.println("Invalid count");
        } else {
            int countOdd = 0;
            for (String j : numberString) {
                if (Integer.parseInt(j) % 2 != 0) {
                    countOdd++;
                }
            }

            int[] array = new int[Math.min(countOdd, neededCount)];
            int[] reversedArray = new int[array.length];
            if (array.length > 0) {
                int index = 0;
                for (int i = numberString.length - 1; i >= 0; i--) {
                    if (Integer.parseInt(numberString[i]) % 2 != 0) {
                        array[index] = Integer.parseInt(numberString[i]);
                        index++;
                        if (index > array.length - 1) {
                            break;
                        }
                    }
                }

                for (int i = 0; i <= array.length - 1; i++) {
                    reversedArray[i] = array[array.length - (i + 1)];
                }
                System.out.println(Arrays.toString(reversedArray));
            } else System.out.println(Arrays.toString(reversedArray));
        }
    }

    public static void FindLastEven(String[] numberString, String command) {
        int neededCount = Integer.parseInt(command);
        if (neededCount > numberString.length) {
            System.out.println("Invalid count");
        } else {
            int countEven = 0;
            for (String j : numberString) {
                if (Integer.parseInt(j) % 2 == 0) {
                    countEven++;
                }
            }
            int[] array = new int[Math.min(countEven, neededCount)];
            int[] reversedArray = new int[array.length];
            if (array.length > 0) {
                int index = 0;
                for (int i = numberString.length - 1; i >= 0; i--) {
                    if (Integer.parseInt(numberString[i]) % 2 == 0) {
                        array[index] = Integer.parseInt(numberString[i]);
                        index++;
                        if (index > array.length - 1) {
                            break;
                        }
                    }
                }

                for (int i = 0; i <= array.length - 1; i++) {
                    reversedArray[i] = array[array.length - (i + 1)];
                }
                System.out.println(Arrays.toString(reversedArray));
            } else System.out.println(Arrays.toString(reversedArray));
        }
    }

    public static void FindMaxOdd(String[] numberString) {
        int maxOddNumber = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < numberString.length; i++) {
            if (Integer.parseInt(numberString[i]) % 2 != 0) {
                if (Integer.parseInt(numberString[i]) >= maxOddNumber) {
                    maxOddNumber = Integer.parseInt(numberString[i]);
                    index = i;
                }
            }
        }
        if (index > -1) {
            System.out.println(index);
        } else System.out.println("No matches");
    }

    public static void FindMaxEven(String[] numberString) {
        int maxEvenNumber = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < numberString.length; i++) {
            if (Integer.parseInt(numberString[i]) % 2 == 0) {
                if (Integer.parseInt(numberString[i]) >= maxEvenNumber) {
                    maxEvenNumber = Integer.parseInt(numberString[i]);
                    index = i;
                }
            }
        }
        if (index > -1) {
            System.out.println(index);
        } else System.out.println("No matches");
    }

    public static void FindMinOdd(String[] numberString) {
        int minOddNumber = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < numberString.length; i++) {
            if (Integer.parseInt(numberString[i]) % 2 != 0) {
                if (Integer.parseInt(numberString[i]) <= minOddNumber) {
                    minOddNumber = Integer.parseInt(numberString[i]);
                    index = i;
                }
            }
        }
        if (index > -1) {
            System.out.println(index);
        } else System.out.println("No matches");
    }

    public static void FindMinEven(String[] numberString) {
        int minEvenNumber = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < numberString.length; i++) {
            if (Integer.parseInt(numberString[i]) % 2 == 0) {
                if (Integer.parseInt(numberString[i]) <= minEvenNumber) {
                    minEvenNumber = Integer.parseInt(numberString[i]);
                    index = i;
                }
            }
        }
        if (index > -1) {
            System.out.println(index);
        } else System.out.println("No matches");
    }
}
