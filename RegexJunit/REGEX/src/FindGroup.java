import java.util.regex.*;

public class FindGroup {
    public static void main(String[] args){
        Pattern p = Pattern.compile("\\d+");
        Matcher m  = p.matcher("Aman123 kaise21 ho2");

        // find()

        System.out.println(m.find()); // ye frist occurance check krta hai,
        //aur matcher ki position ko next pr fix kr deta hai

        // reset()

        m.reset();  // ab agr hume pure string pr fir se kaam krna hai t reset se hum matcher ki position ko fix kr dete hai
        boolean b = m.matches();
        System.out.println(b);
        while(m.find()){
            //group()
            System.out.println(m.group());
        }

        // replace
        String s  = m.replaceAll("");
        System.out.print(s);
    }
}
