public class Java_StringBuilder {
        public static void main(String args[]){
            StringBuilder sb=new StringBuilder("Hello ");

//            append() method
            sb.append("Jeel");
            System.out.println(sb);//prints Hello Java

//            insert() method
            sb.insert(1,"Java");
            System.out.println(sb);//prints HJavaello

//            replace() method
            sb.replace(1,3,"Java");
            System.out.println(sb);//prints HJavalo

//            reverse() method
            sb.reverse();
            System.out.println(sb);

//            delete() method
            sb.delete(1,15);
            System.out.println(sb);
        }

}