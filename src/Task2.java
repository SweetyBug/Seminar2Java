public class Task2 {
    public static void main(String[] args) {
        String[] mas = new String[] {"aabb", "aabbb", "aaabb", "awdserrt", "cfdsett"};
        System.out.println(pref(mas));
    }
    static String pref(String[] arr) {
        String pre = "";
        String otv = "";
        int count = 0;
        for (int i=0; i<arr[0].length(); i++) {
            if ((pre == "") || (pre.charAt(pre.length()-1) == arr[0].charAt(i))) {
                pre += arr[0].charAt(i);
                count += 1;
                int count2 = 0;
                for (String item:arr) {
                    String pre2 = "";
                    for (int j=0; j<count; j++) {
                        pre2 += item.charAt(j);
                    }
                    if (pre2.equals(pre)) {
                        count2 += 1;
                    }
                }
                if (count2 == arr.length) {
                    otv = pre;
                }
            }
        }
        return otv;
    }
}

