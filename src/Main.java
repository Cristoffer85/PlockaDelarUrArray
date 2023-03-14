import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        int[] heltal1 = { 5, 2, 7, 1, 9, 3, 8, 4, 6, 10 };
        System.out.print("Originalarray: ");
        printArray1(heltal1);  //Skriver ut första arrayen + metod kallad ifrån private metod 1 nedan

        int[] heltal2 = Arrays.copyOfRange(heltal1, 0, 5);
        System.out.print("5 första tal i Array: ");
        printArray2(heltal2);  //Skriver ut första arrayen + metod kallad ifrån private metod 2 nedan
    }
    private static void printArray1(int[] array) { //metod för att sortera arrayen mer specifikt
        for (int i = 0; i < array.length; i++) {   //loop för att sortera den ifrån 0(i = 0), beräkna hela arrayens längd(length), sortera den uppåt(i++)
            System.out.print(array[i] + " ");      //print-loop för att printa ut hela arrayen, med text eller , emellan
        }
        System.out.println();     //Skapar en till rad(ln) utanför loop{}, för att inte värden skall hamna på samma rad
    }
    private static void printArray2(int[] array) { //metod för att sortera arrayen mer specifikt
        for (int i = 0; i < array.length; i++) {   //loop för att sortera den ifrån 0(i = 0), beräkna hela arrayens längd(length), sortera den uppåt(i++)
            System.out.print(array[i] + " ");      //print-loop för att printa ut hela arrayen, med text eller , emellan
        }
        System.out.println();     //Skapar en till rad(ln) utanför loop{}, för att inte värden skall hamna på samma rad
    }
}
