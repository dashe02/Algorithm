package com.exercise2;

/**
 * Created by wecash on 19/3/24.
 */
public class LongestHuiwenStr {

    public static void main(String[] args) {
        String str = "ibvjkmpyzsifuxcabqqpahjdeuzaybqsrsmbfplxycsafogotliyvhxjtkrbzqxlyfwujzhkdafhebvsdhkkdbhlhmaoxmbkqiwiusngkbdhlvxdyvnjrzvxmukvdfobzlmvnbnilnsyrgoygfdzjlymhprcpxsnxpcafctikxxybcusgjwmfklkffehbvlhvxfiddznwumxosomfbgxoruoqrhezgsgidgcfzbtdftjxeahriirqgxbhicoxavquhbkaomrroghdnfkknyigsluqebaqrtcwgmlnvmxoagisdmsokeznjsnwpxygjjptvyjjkbmkxvlivinmpnpxgmmorkasebngirckqcawgevljplkkgextudqaodwqmfljljhrujoerycoojwwgtklypicgkyaboqjfivbeqdlonxeidgxsyzugkntoevwfuxovazcyayvwbcqswzhytlmtmrtwpikgacnpkbwgfmpavzyjoxughwhvlsxsgttbcyrlkaarngeoaldsdtjncivhcfsaohmdhgbwkuemcembmlwbwquxfaiukoqvzmgoeppieztdacvwngbkcxknbytvztodbfnjhbtwpjlzuajnlzfmmujhcggpdcwdquutdiubgcvnxvgspmfumeqrofewynizvynavjzkbpkuxxvkjujectdyfwygnfsukvzflcuxxzvxzravzznpxttduajhbsyiywpqunnarabcroljwcbdydagachbobkcvudkoddldaucwruobfylfhyvjuynjrosxczgjwudpxaqwnboxgxybnngxxhibesiaxkicinikzzmonftqkcudlzfzutplbycejmkpxcygsafzkgudy";
        LongestHuiwenStr l = new LongestHuiwenStr();
        String s = l.longestHuiwenStr(str);
        System.out.print(s);
    }

    private String longestHuiwenStr(String str) {
        if (str.length() == 1) {
            return str;
        }
        int len = 0;
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            int temp = 0;
            String tempStr = "";
            for (int j = str.length() - 1; j >= i; j--) {
                if (huiwen(i, j, str)) {
                    temp = j - i;
                    tempStr = str.substring(i, j + 1);
                }
                if (len == 0) {
                    len = temp;
                    s = tempStr;
                } else {
                    if (len < temp) {
                        len = temp;
                        s = tempStr;
                    }
                }
            }
        }
        return s;
    }

    private boolean huiwen(int i, int j, String str) {
        if (i > j) {
            return false;
        }
        String s1 = str.substring(i, j + 1);
        StringBuilder sb = new StringBuilder();
        for (int k = j; k >= i; k--) {
            sb.append(str.charAt(k));
        }
        String s2 = sb.toString();
        return s1.equals(s2);
    }
}
