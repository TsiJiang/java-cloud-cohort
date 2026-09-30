public static void tag(StringBuilder s) {
    s.append("!");
}

public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Hi");
    tag(sb);
    System.out.println(sb);
}