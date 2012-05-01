package am.ik.majal.util;

import java.util.regex.Pattern;

/**
 * Utility class about IP Address.
 * @author Toshiaki Maki
 */
public final class IpAddressUtil {

    /**
     * length of ipv4 parts.
     */
    private static final int IPV4_PARTS_LEN = 4;

    /**
     * length of ipv4 hex string.
     */
    private static final int IPV4_HEX_STRING_LEN = 8;

    /**
     * radix for hex.
     */
    private static final int RADIX_HEX = 16;

    /**
     * Regex for dot pattern.
     */
    private static final Pattern DOT_PATERN = Pattern.compile("\\.");

    /**
     * Constructor.
     */
    private IpAddressUtil() {

    }

    /**
     * Converts IPv4 to Hex.
     * @param ip IP address for IPv4
     * @return hex expression for IPv4
     */
    public static String ipv4ToHex(final String ip) {
        String[] bits = DOT_PATERN.split(ip);
        assert (bits.length == IPV4_PARTS_LEN);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bits.length; i++) {
            sb.append(String.format("%02x", Integer.parseInt(bits[i])));
        }
        return sb.toString();
    }

    /**
     * Converts Hex to IPv4.
     * @param hex hex expression for IPv4
     * @return ip IP address for IPv4
     */
    public static String hexToIpv4(final String hex) {
        StringBuilder sb = new StringBuilder();
        assert (hex.length() == IPV4_HEX_STRING_LEN);

        for (int i = 0; i < IPV4_PARTS_LEN; i++) {
            if (i > 0) {
                sb.append(".");
            }
            sb.append(Integer.parseInt(hex.substring(i * 2, (i + 1) * 2),
                    RADIX_HEX));
        }
        return sb.toString();
    }
}
