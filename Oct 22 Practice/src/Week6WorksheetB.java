import java.util.ArrayList;
import java.util.List;

interface Converter<F,T>{
    T convert(F f);
}
interface Util{
    String join(List<String> words);
}
public class Week6WorksheetB {
    public static void main(String[] args) {
        Converter<String, Integer> parse = s -> Integer.parseInt(s);
        Integer result = parse.convert("10000");
        System.out.println(result);
        Util myUtil = (words) -> (String.join(" ",words));
        String concatString = myUtil.join(new ArrayList<>(List.of("This", "is", "a", "test")));
        System.out.println(concatString);
    }
}
