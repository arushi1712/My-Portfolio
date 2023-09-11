package Type2;

    public class Pattern10 {
        public static void main(String[] args) {
                int rows = 5;
                int number = 1;

                for (int i = 1; i <= rows; i++) {
                    if (i % 2 != 0) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(number + " ");
                            number++;
                        }
                    } else {
                        int temp = number + i - 1;
                        for (int j = 1; j <= i; j++) {
                            System.out.print(temp + " ");
                            temp--;
                            number++;
                        }
                    }

                    System.out.println();
                }
            }
        }


