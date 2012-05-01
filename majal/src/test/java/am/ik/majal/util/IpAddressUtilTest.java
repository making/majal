package am.ik.majal.util;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class IpAddressUtilTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testIpv4ToHex01() {
        assertEquals("ffffffff", IpAddressUtil.ipv4ToHex("255.255.255.255"));
    }

    @Test
    public void testIpv4ToHex02() {
        assertEquals("01010101", IpAddressUtil.ipv4ToHex("1.1.1.1"));
    }

    @Test
    public void testHexToIpv401() {
        assertEquals("255.255.255.255", IpAddressUtil.hexToIpv4("ffffffff"));
    }

    @Test
    public void testHexToIpv402() {
        assertEquals("1.1.1.1", IpAddressUtil.hexToIpv4("01010101"));
    }
}
