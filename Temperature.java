public class Temperature {
    public static void main(String[] args){
        double fahrenheit=212;
        double celsius=98.5;
        System.out.println("*fht value before con to cel:"+fahrenheit);
        System.out.println("*fht value after con to cel:"+(5*(fahrenheit-32)/9));
        System.out.println("*cel value before con to fht:"+celsius);
        System.out.println("*cel value after con to fht:"+(9*celsius/5+32));
    }
}
