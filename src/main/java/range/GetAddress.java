package range;

import java.util.StringTokenizer;

/**
 * Created by Marsel Fatkullin on 16.01.2019.
 */
public class GetAddress {
    public int[] ip2intarray(String host) {

        int[] address = {-1,-1,-1,-1};
        int i=0;

        //деление строки на лексемы с помощью разделителей
        StringTokenizer tokens = new StringTokenizer(host,".");
        //проверяет оставшееся число лексем для разбора
        if (tokens.countTokens() > 4) return null;
        //просматриваются лексемы до тех пор, пока не закончатся
        while (tokens.hasMoreTokens())
        {
            try
            {
                //преобразует строку в число, записывает в массив
                //и переходит к следующей лексеме
                address[i++] = Integer.parseInt(tokens.nextToken()) & 0xFF;
            }
            catch(NumberFormatException nfe)
            {
                return null;
            }
        }
        return address;
    }
}
