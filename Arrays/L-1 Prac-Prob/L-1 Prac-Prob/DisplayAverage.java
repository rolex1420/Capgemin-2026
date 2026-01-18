/*  Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM */
class DisplayAverage{
public static void main(String[] args) {
    String name="Sam";
    int maths=94;
    int physics=95;
    int chemistry=96;
    int average=(maths+physics+chemistry)/3;
    System.out.println(name+"'s average mark in PCM is "+average);
}
}