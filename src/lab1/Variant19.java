package lab1;






public class Variant19 {

    public static void main(String... strings) {

        System.out.println("Start of zero lab");
        System.out.println("Done!!!");
    }


    public enum ANIMAL{
        RAT, COW, TIGER, RABBIT, DRAGON, SNAKE, HORSE, SHEEP, MONKEY, CHICKEN, DOG , PIG
    }

    public enum COLOR{
        GREEN, RED, YELLOW, WHITE, BLACK}

    public static class COLOR_ANIMAL {
        public COLOR color;
        public ANIMAL animal;

        public COLOR_ANIMAL(COLOR color, ANIMAL animal) {
            this.color = color;
            this.animal = animal;
        }
    }
    /**
     * @param x,x1,y,y1 is coordinates point in square
     * @return P and S
     */
    public DoublePair inputOutputTask(int x, int y, int x1, int y1) {
        /**
         *  Given coordinates of two opposite vertices of the rectangle: (x1, y1), (x2, y2).
         *  The sides of the rectangle are parallel to the coordinate axes.
         *  Find the perimeter and area of a rectangle.
         */




        DoublePair outData = new DoublePair(0.0,0.0);

        double sideA = Math.abs(x - x1);
        double sideB = Math.abs(y - y1);

        outData.P = 2 * sideA + 2 * sideB;
        outData.S = sideA * sideB;



        return outData;
    }

    /**
     * @param n is time in sec
     * @return time in hours
     */

    public int integerNumbersTask(int n) {
        /**
         * Since the beginning of the day passed N seconds (N - integer).
         * Find the number of complete minutes that have passed since the beginning of the day
         */
        assert n>=0:"error";
        assert n<86400:"new day";


        return n / 60;
    }

    /**
     * @param number1, number2, number3
     * @return true, if number is possitive
     */
    public boolean booleanTask(int number1, int number2, int number3) {
        /**
         * Check the truth of the saying:
         * "Of the three given integers there is at least one pair of mutually opposite".
         */

        if (number1 * (-1) == number2) {
            return true;
        }  if (number1 * (-1) == number3) {
            return true;
        }  if (number2 * (-1) == number3) {
            return true;
        }
        return false;
    }


    /**
     * @param p1,p2,p3,p4 is integer number where one of them != other's equal's
     * @return sequence number
     */
    public int ifTask(int p1, int p2, int p3, int p4) {
        /**
         * Given four integers, one of which is different from the other three,
         * equal to each other. Determine the number of serial numbers different from the others.
         */
        assert (p1-p2) + (p3-p4)!=0: "all equals";
        assert ((p1 == p2) && (p2 == p3)) || ((p1 == p2) && (p2 == p4)) || ((p1 == p3) && (p3 == p4)) || ((p2 == p3) && (p3 == p4)):
                "Set correct input data";

        int out = 0;
        if ((p1 == p2) && (p2 == p3)) out = 4;
        else if ((p1 == p2) && (p2 == p4)) out = 3;
        else if ((p1 == p3) && (p3 == p4)) out = 2;
        else out = 1;

        return out;
    }


    /**
     * @param number
     * @return name of year
     */
    public COLOR_ANIMAL switchTask(int number) {
        /**
         * In the eastern calendar adopted 60-year cycle, consisting of a 12-year-old sub-cycles,
         * denoted by color names: green, red, yellow, white and black. Each subframe years are named after animals:
         * rat, cow, tiger, rabbit, dragon, snake, horse, sheep, monkey, chicken, dog and pig. In the year to determine
         * the number of his name, if 1984 - the beginning of the cycle: "year of green rat."
         */

        assert (number > 1984) || (number < 2044): "not this decade";




        Integer color, animal;

        Integer differenceBY = number - 1984;
        color = (differenceBY) / 12;
        animal = differenceBY - (color * 12) + 1;
        COLOR_ANIMAL outInf = new COLOR_ANIMAL(COLOR.GREEN,ANIMAL.COW);
        switch (color) {

            case 0:
                outInf.color = COLOR.GREEN;
                break;
            case 1:
                outInf.color = COLOR.RED;
                break;
            case 2:
                outInf.color = COLOR.YELLOW;
                break;
            case 3:
                outInf.color = COLOR.WHITE;
                break;
            case 4:
                outInf.color = COLOR.BLACK;
                break;
            default:

                break;
        }

        switch (animal) {
            case 1:
                outInf.animal = ANIMAL.RAT;
                break;
            case 2:
                outInf.animal = ANIMAL.COW;
                break;
            case 3:
                outInf.animal = ANIMAL.TIGER;
                break;
            case 4:
                outInf.animal = ANIMAL.RABBIT;
                break;
            case 5:
                outInf.animal = ANIMAL.DRAGON;
                break;
            case 6:
                outInf.animal = ANIMAL.SNAKE;
                break;
            case 7:
                outInf.animal = ANIMAL.HORSE;
                break;
            case 8:
                outInf.animal = ANIMAL.SHEEP;
                break;
            case 9:
                outInf.animal = ANIMAL.MONKEY;
                break;
            case 10:
                outInf.animal = ANIMAL.CHICKEN;
                break;
            case 11:
                outInf.animal = ANIMAL.DOG;
                break;
            case 12:
                outInf.animal = ANIMAL.PIG;
                break;
            default:

                break;
        }

        return outInf;
    }


    /**
     * @param n is integer number
     * @return factorial this number
     */
    public double forTask(int n) {
        /**
         * Given an integer N (> 0). Find product
         * N! = 1 · 2 · ... · N
         * (N-factorial). To avoid the integer overflow, compute this work with the help of a real
         * variable and output it as a real number.
         */
        assert n > 0 : "Argument should be more than zero";
        double f = 1;
        for (int i = 1; i < n + 1; ++i) {
            f *= i;
        }
        return f;
    }


    public int whileTask(int a) {
        /**
         * Given an integer N (> 0). Using integer division operation and taking the remainder of the division,
         * to find the number obtained when the number N of read from right to left.
         */

        assert a > 0 : "error";

        int  whole = (a % 10);
        while (a > 9) {
            a /= 10;
            whole *= 10;
            whole += a % 10;

        }
        return whole;
    }

    public double arrayTask(double[] array) {
        /**
         * Given an array of N. Find the maximum of its elements,
         * which are neither a local minimum or a local maximum
         * (the definition of a local minimum and a local maximum in the given tasks and Array32 Array33).
         * If there are no elements in the array, the output 0.
         */
        double max = 0;
        boolean flag = false;

        int length = array.length;
        if (length == 1) return array[0];

        if (array[0] == array[1]) {
            max = array[0];
        }

        if ((array[length - 1] == array[length - 2]) && array[length - 1] > max) {
            max = array[length - 1];
        }

        for (int i = 1; i < length - 1; ++i) {
            if ((array[i] < array[i - 1] && array[i] < array[i + 1]) || (array[i] > array[i - 1] && array[i] > array[i + 1])) {
                flag = true;
            }

            if (!flag) {
                if (max < array[i]) {
                    max = array[i];
                }
            }

            flag = false;
        }


        return max;
    }

    /**
     * @param array
     * @param k1
     * @param k2
     * @return transformed array where row with indexes k1 and k2 was changed
     */
    public int[][] twoDimensionArrayTask(int[][] array) {
        /**
         * Dana matrix of size M × N.
         * Remove her first column that contains only positive elements.
         * If the column is not required, the display matrix unchanged.
         */
        boolean flag = true,isColumnFound = false;

        int width = array.length;
        int high = array[0].length;
        int outArray[][], columnWhichDelete = -1;

        for (int i = 0; (i < high) && (isColumnFound == false); ++i) {
            if (array[0][i] > 0) {

                for (int j = 0; ((j < width) && (array[j][i] > 0)); ++j) {
                    int z = array[j][i];
                    if (array[j][i] < 0) {
                        flag = false;
                    }
                    if ((j == width - 1) && flag == true) {
                        columnWhichDelete = i;
                        isColumnFound = true;
                    }
                }
                flag = true;
            }
        }


        if (columnWhichDelete != -1) {
            outArray = new int[width][high - 1];
            for (int i = 0, k = 0; i < high; ++i, ++k) {
                if (i == columnWhichDelete) {
                    --k;
                }
                else {
                    for (int j = 0; j < width; ++j) {
                        outArray[j][k] = array[j][i];
                    }
                }
            }
        } else {

            outArray = array;

        }


        return outArray;
    }




}