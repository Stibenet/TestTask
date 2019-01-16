package range;

/**
 * Created by Marsel Fatkullin on 16.01.2019.
 */
public class ValuePreparation {
    public String long2dotter(long address) {

        StringBuffer sb = new StringBuffer();

        for (int i = 0, shift = 24; i < 4; i++, shift -= 8)
        {
            long value = (address >> shift) & 0xff;
            sb.append(value);
            if (i != 3)
            {
                sb.append('.');
            }
        }
        return sb.toString();
    }
}
