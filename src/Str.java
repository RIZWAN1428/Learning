public class Str {
    public static void main(String[] args){
        String s = "Hello";
        s = s + " world";
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.charAt(2));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.trim());
        System.out.println(s.contains("ll"));
        System.out.println(s.startsWith(" He"));
        System.out.println(s.endsWith("ld"));
        System.out.println(s.indexOf("o"));
        System.out.println(s.lastIndexOf("o"));
        System.out.println(s.replace("o" , "O"));
        System.out.println(s.substring(2,7));
        System.out.println(s.equals("hello"));
        System.out.println(s.equalsIgnoreCase("HELLO WORLD"));
        System.out.println(s.isEmpty());
        String[] words = s.split(" ");
        for (String word : words) {
            System.out.println(word);
        }



        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" world");
        System.out.println(sb);


        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" world");
        System.out.println(sbf);
    }
}
