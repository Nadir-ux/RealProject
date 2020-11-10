import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int[] numbersArray = new int[] {4,11,13,12,45,35,15,7,19,3,16};
        int i = 0;
        int highMark = 0;
        while (i < 11){
            if (numbersArray[i] > highMark){
                highMark = numbersArray[i];
            }
            i++;

        }
        System.out.println(highMark);
    }
}
