package ru.job4j.array;

import java.util.Arrays;

public class Exercises {
    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void printCrossEl(int[] left, int[] right) {
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    System.out.println(left[i]);
                }
            }
        }
    }

    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        for (int i = 0; i < rsl.length; i++) {
            if (rsl[i] > left[i]) {
                rsl[i] = -1;
            }
        }
        return rsl;
    }

    public static int combineSize(int[] a, int[] b) {
        return a.length + b.length;
    }

    public static int getFirstElement(int[] array) {
        int rsl = array[0];
        return rsl;
    }

    public static int getLastElement(int[] array) {
        int rsl = array[array.length - 1];
        return rsl;
    }

    public static int getSum(int[] array) {
        return array[0] + array[array.length - 1];
    }

    public static int getMaxValue(int[] array) {
        return array[0] > array[array.length - 1] ? array[0] : array[array.length - 1];
    }

    public static int getIndexMax(int[] array) {
        int rsl = array[0] > array[array.length - 1] ? 0 : array.length - 1;
        return rsl;
    }

    public static int getCountRow(int[][] array) {
        return array.length;
    }

    public static int getCountCellInRow(int[][] array, int row) {
        return array[row].length;
    }

    public static void main1(String[] args) {
        int[][] array = new int[][]{{1, 2}, {3, 4}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }

    public static void main2(String[] args) {
        int[][] array = new int[][]{{1}, {2, 3}, {4, 5, 6}};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].length);
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }

    public static boolean checkArray(int[][] array) {
        boolean rsl = true;
        int standard = array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != standard) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static void main3(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        for (int i = 1; i < array.length - 1; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main4(String[] args) {
        int[][] array = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array[i].length - 1; j++) {
                System.out.println(array[i][j]);
            }
        }
    }

    public static void main5(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }

    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        int num = 1;
        for (int i = 0; i < count; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                triangle[i][j] = num;
                num++;
            }
        }
        return triangle;
    }

    public static int[][] convert(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] result = new int[m][n];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = matrix[j][i];
            }
        }
        return result;
    }

    public static int[] calculate(int a, int b, int n) {
        int[] numbers = new int[n];
        numbers[0] = a;
        numbers[1] = b;
        int sum = a + b;
        for (int i = 2; i < numbers.length; i++) {
            numbers[i] += sum;
            sum += numbers[i];
        }
        return numbers;
    }

    public static void print1(int[] array) {
        for (int num : array) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
        }
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[array.length - 1 - i] % 2 == 0) {
                System.out.println(array[array.length - 1 - i]);
            }
        }
    }

    public static int indexOf(char[] string, char c, int number) {
        int count = 0;
        for (int i = 0; i < string.length; i++) {
            if (string[i] == c) {
                count++;
                if (count == number) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static int find(int[] array) {
        int count = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                count++;
            } else {
                count = 1;
            }
        }
        return count;
    }

    public static void swap(int[][] data, int src, int dst) {
        int[] tmp = data[src];
        data[src] = data[dst];
        data[dst] = tmp;
    }

    public static void swapCell(int[][] data, int src, int dst) {
        for (int i = 0; i < data.length; i++) {
            int tmp = data[i][src];
            data[i][src] = data[i][dst];
            data[i][dst] = tmp;
        }
    }

    public static int[] merge(int[][] data) {
        int[] res = new int[data.length * data.length];
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                res[count] = data[i][j];
                count++;
            }
        }
        return res;
    }

    public static int[] diagonal(int[][] data) {
        int[] res = new int[data.length];
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            res[count] = data[i][data[i].length - 1 - i];
            count++;
        }
        return res;
    }

    public static int count(int[] data, int el) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                break;
            }
            sum += data[i];
        }
        return sum % 2 == 0 ? sum : 0;
    }

    public static int[] changeData(int[] data) {
        int countOddNum = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 1) {
                countOddNum++;
            }
        }
        int[] result = new int[countOddNum];
        int count = 0;
        for (int num : data) {
            if (num % 2 == 1) {
                result[countOddNum] = num;
                count++;
            }
        }
        return result;
    }

    public static boolean checkArray(int[] data) {
        boolean rsl = true;
        for (int i = 2; i < data.length; i++) {
            if (data[i] != data[i - 1] + data[i - 2]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static String convert(String[] fio) {
        return fio[0] + " " + fio[1].charAt(0) + "." + fio[2].charAt(0) + ".";
    }

    public static int[] resolve(int number) {
        int size = String.valueOf(number).length();
        int[] res = new int[size];
        for (int i = 0; i < res.length; i++) {
            res[i] = number % 10;
            number /= 10;
        }
        return res;
    }

    public static char[] toUpperCase(char[] string) {
        for (int i = 0; i < string.length; i++) {
            if (Character.isLowerCase(string[i])) {
                string[i] = Character.toUpperCase(string[i]);
            }
        }
        return string;
    }

    public static int[] union(int[] left, int[] middle, int[] right) {
        int[] res = new int[left.length + middle.length + right.length];
        for (int i = 0; i < res.length - 1; i++) {
            if (i == 0) {
                res[i] = left[0];
            } else if (i == res.length - 1) {
                res[i] = left[left.length - 1];
            } else if (i % 2 == 0 && i != 0 && i != res[res.length - 1]) {
                res[i] = middle[i - 1];
            } else if (i % 2 == 1 && i != 0 && i != res[res.length - 1]) {
                res[i] = right[i - 1];
            }
        }
        return res;
    }

    public static int[] collectArray(int[][] left, int[][] right) {
        int[] result = new int[left.length * left.length];
        int count = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < left[i].length; j++) {
                result[count] = left[i][j] > right[i][j] ? left[i][j] : right[i][j];
                count++;
            }
        }
        return result;
    }

    public static int[][] convertArray(int[] array) {
        double sizeDouble = Math.sqrt(array.length);
        int size = (int) Math.ceil(sizeDouble);
        int[][] res = new int[size][size];
        int count = 0;
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                if (count < array.length) {
                    res[i][j] = array[count];
                }
                count++;
            }
        }
        return res;
    }

    public static int[][] convertInSquareArray(int[][] array) {
        int size = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                size++;
            }
        }
        int[] arr = new int[size];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arr[count] = array[i][j];
                count++;
            }
        }
        double koren = Math.sqrt(size);
        int size2 = (int) Math.ceil(size);
        int[][] res = new int[size2][size2];
        count = 0;

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                if (count < arr.length) {
                    res[i][j] = arr[count];
                    count++;
                }
            }
        }
        return res;
    }

    public static boolean checkArray2(int[] data) {
        int sum = 0;
        for (int num : data) {
            sum += num;
        }
        return sum % 2 == 0;
    }

    public static boolean checkArray(int[] data, int value) {
        int count = 0;
        for (int num : data) {
            if (num == value) {
                count++;
            }
        }
        return count < data.length / 2;
    }

    public static int[][] changeData(int[][] array, int el) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > el) {
                    array[i][j] = array[i][j] - el;
                } else {
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }

    public static int[] collectNewArray(int[][] data, int sum) {
        int length = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i + j == sum) {
                    data[i][j] = 0;
                    length--;
                }
                length++;
            }
        }
        int[] res = new int[length];
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != 0) {
                    res[count] = data[i][j];
                    count++;
                }
            }
        }
        int[] rslt = Arrays.copyOf(res, res.length);
        return rslt;
    }

    public static String convert2(String[] words) {
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word + " ");
        }
        sb.deleteCharAt(sb.length() - 1);
        String result = sb.toString();
        return result;
    }

    public static int sum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            sum += nums[i] - nums[i + 1];
        }
        return sum;
    }

    public static String random(String[] prizes, int num) {
        if (num > prizes.length) {
            num = num % prizes.length;
            if (num == 0) {
                return prizes[prizes.length - 1];
            }
        }
        return prizes[num - 1];
    }

    public static char[] destroy(char[] seq) {
        for (int i = 0; i < seq.length; i++) {
            if (i < 5) {
                seq[i] = '0';
            } else if (i > seq.length - 6) {
                seq[i] = '1';
            }
        }
        return seq;
    }

    public static int[] and(int[] left, int[] right) {
        int count = 0;
        for (int leftNum : left) {
            for (int rightNum : right) {
                if (leftNum == rightNum) {
                    count++;
                }
            }
        }
        int[] res = new int[count];
        count = 0;
        for (int leftNum : left) {
            for (int rightNum : right) {
                if (leftNum == rightNum) {
                    res[count++] = leftNum;
                }
            }
        }
        return res;
    }

    public static int[] or(int[] left, int[] right) {
        int count = 0;
        for (int lNum : left) {
            for (int rNum : right) {
                if (lNum == rNum) {
                    count++;
                }
            }
        }
        int[] res = new int[left.length + right.length - count];
        int i = 0;
        for (int l : left) {
            for (int r : right) {
                if (l != r) {
                    if (!hasInside(res, l)) {
                        res[i++] = l;
                    }
                    if (!hasInside(res, r)) {
                        res[i++] = r;
                    } else if (!hasInside(res, l)) {
                        res[i++] = l;
                    }
                }
            }
        }
        return res;
    }

    public static boolean hasInside(int[] array, int num) {
        for (int x : array) {
            if (x == num) {
                return true;
            }
        }
        return false;
    }

    public static int[] diff(int[] left, int[] right) {
        int count = 0;
        for (int l : left) {
            for (int r : right) {
                if (l != r) {
                    count++;
                }
            }
        }
        System.out.println(count);
        int[] res = new int[count];
        count = 0;
        for (int l : left) {
            for (int r : right) {
                if (l != r) {
                    res[count++] = l;
                }
            }
        }
        System.out.println(Arrays.toString(res));
        return res;
    }

    public static void main(String[] args) {
        int[] left = {1, 3};
        int[] righ = {2};
        int[] res = diff(left, righ);
    }
}