package zadanie.potegowanie;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataReader { private Scanner sc;

    public DataReader(){
        sc = new Scanner(System.in);
    }

    public int getInt() throws NumberFormatException{
        int number = 0;
        try {
            number = sc.nextInt();
        }catch (InputMismatchException e){
            throw new InputMismatchException("wprowadzono liczbe w złym formacje");
        }finally {
            sc.nextLine();
        }
        return number;
    }

}
