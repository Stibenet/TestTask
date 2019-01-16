package range;

import org.junit.Test;
import range.GetId;

import static org.junit.Assert.*;

/**
 * Created by 777 on 16.01.2019.
 */
public class GetIdTest {

    private GetId getId;

    @Test
    public void host2long() throws Exception {
        long l = 3232235521L;
        assertEquals(l, getId.host2long("192.168.0.1") );
    }

}