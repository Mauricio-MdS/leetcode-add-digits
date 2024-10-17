class Solution {
    public int addDigits(int num) {
        while (num / 10 != 0) {
            int copy = num;
            int accumulator = 0;
            while (copy != 0) {
                accumulator += copy % 10;
                copy /= 10;
            }
            num = accumulator;
        }
        return num;
    }
}