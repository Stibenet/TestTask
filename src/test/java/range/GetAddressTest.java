package range;

import org.junit.Test;
import range.GetAddress;

import static org.junit.Assert.*;

/**
 * Created by 777 on 16.01.2019.
 */
public class GetAddressTest {
    private GetAddress getAddress;

    @Test
    public void ip2intarray() throws Exception {
        assertEquals("[I@61bbe9ba", getAddress.ip2intarray("192.168.0.1"));
    }

}