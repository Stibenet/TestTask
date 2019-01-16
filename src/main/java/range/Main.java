package range;

import java.util.Scanner;

/**
 * Created by Marsel Fatkullin on 16.01.2019.
 */
public class Main {
    public static void main(String[] args) {

        GetId gid = new GetId();

        try {
            Scanner in = new Scanner(System.in);

            System.out.println("Input an ip: ");
            String inpStart = in.nextLine();
            String inpEnd = in.nextLine();

            long resStart = gid.host2long(inpStart);
            long resEnd = gid.host2long(inpEnd);

            outRes(resStart, resEnd);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void outRes (long resStart, long resEnd){
        ValuePreparation vp = new ValuePreparation();

        try {
            System.out.println("Результат: ");
            for (long i = resStart + 1; i < resEnd; i++) {
                System.out.println(vp.long2dotter(i));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
