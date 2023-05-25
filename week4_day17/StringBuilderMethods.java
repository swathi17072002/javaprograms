public class StringBuilderMethods{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("I am belongs");
        System.out.println(sb);
        sb.append(" tagore batch");
        System.out.println(sb);
        sb.insert(13,"to ");
        System.out.println(sb);
        sb.delete(23,29);
        System.out.println(sb);
        System.out.println(sb.indexOf("belongs"));
        System.out.println(sb.indexOf("z"));
        sb.replace(2,4,"not");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb.substring(6,13));
        System.out.println(sb.reverse());
    }
}