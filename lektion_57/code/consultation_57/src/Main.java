public class Main {

    public static void main(String[] args) {
        String string = "Hello";
        //  System.out.println(string.substring(1,3));
        StringBuilder sb = new StringBuilder();
        String str =  new String(sb);

        System.out.println(ourSubstring(string,-1,30));


    }

    // 1.Написать свой метод substring, который работает как метод substring Java.
    //  Использовать StringBuilder
    public static String ourSubstring (String string,int beginIndex, int endIndex){

        if(beginIndex<0) return "Invalid index";

        StringBuilder sb = new StringBuilder();
        for(int i =beginIndex;i<endIndex && i<string.length();i++){
            sb = sb.append(string.charAt(i));
        }
        return new String(sb);
    }


}