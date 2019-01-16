package range;

/**
 * Created by Marsel Fatkullin on 16.01.2019.
 */
public class GetId {
    public long host2long(String host) {

        GetAddress ga = new GetAddress();

        long ip = 0;
        //проверка символа, является ли он цифрой
        if (!Character.isDigit(host.charAt(0))) return -1;
        int[] addr = ga.ip2intarray(host);
        if (addr == null) return -1;

        for (int i = 0;i < addr.length;++i)
        {
            ip += ((long)(addr[i] >= 0 ? addr[i] : 0)) << 8*(3-i);
        }
        System.out.println(ip);
        return ip;
    }
}
