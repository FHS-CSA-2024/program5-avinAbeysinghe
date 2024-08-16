public class Program5 {
    
    /*
     I know that System.out.printf() exists, but I wasn't sure how I can implement that 
     alongside the text that needed to be with the values. So I learned what String.format
     is and personally made this method to convert all the values(rounded to the nearest 10) into strings
     that can be used alongside the text that I was printing.
    */
    public static String converter(double value){
        String converter = String.format("%.1f", value);
        return converter;
    }
    public static void main(String[] args){
        double royale = (double) 286/9;
        double koopaKing = (double) 412/40;
        double pipeFrame = (double) 361 / 18;
        double bandwagon = (double) 161/11;
        

        System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon: ");
        System.out.println("Royale averaged " + converter(royale) + " m/g \n");
        System.out.println("Koopa King averaged " + converter(koopaKing) + " m/g \n");
        System.out.println("Pipe Frame averaged " + converter(pipeFrame) + " m/g \n");
        System.out.println("Bandwagon averaged " + converter(bandwagon) + " m/g \n");
        
    }
}
//Paste console output below:
/*

Mushroom Cup Prix Racer Average Miles/Per Gallon: 
Royale averaged 31.8 m/g 
Koopa King averaged 10.3 m/g 
Pipe Frame averaged 20.1 m/g 
Bandwagon averaged 14.6 m/g 

*/
