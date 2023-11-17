public class Java_String {
    public static void main(String[] args) {

        String s1=" Jeel ";//creating string by Java string literal

        char ch[]={'j','e','e','l'};
        String s2=new String(ch);//converting char array to string

        String s3=new String(" Jeel ");//creating Java string by new keyword

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s3);

        System.out.println(s3.toUpperCase());
        System.out.println(s3.toLowerCase());

        System.out.println(s3.trim());

        int value=30;
        String s=String.valueOf(value);
        System.out.println(s+10);//concatenating string with 10
    }
}
