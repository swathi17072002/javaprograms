public class StringBufferMethods{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("I am belongs");
        System.out.println(sb);
        sb.append(" tagore batch");
        System.out.println(sb);
        sb.insert(13,"to ");
        System.out.println(sb);
        sb.delete(23,29);
        System.out.println(sb);
        System.out.println(sb.indexOf("beg"));
        sb.replace(2,4,"not");
        System.out.println(sb);
        System.out.println(sb.reverse());
    }
}