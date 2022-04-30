public class Task1LiteralsHomeWork {
    public static void main(String[] args) {
        // declare a variable with year of favourite movie via decimal, octal, hexa-decimal and binary representation
        int yearOfFavouriteMovie = 2004;
        int yearOfFavouriteMovieBinary = 0b1001;
        int yearOfFavouriteMovieOctal = 03724;
        int yearOfFavouriteMovieHexa = 0x7d4;
        // <add your code here>
        // print them all via System.out.println - each number in each line - they have to be the same
        System.out.println(yearOfFavouriteMovie);
        System.out.println(yearOfFavouriteMovieBinary);
        System.out.println(yearOfFavouriteMovieOctal);
        System.out.println(yearOfFavouriteMovieHexa);

        // Print maximum positive and minimum negative values that can be stored
        // in an int variable via binary representation and print them out. Compare it with values in
        // https://www.w3schools.com/java/java_data_types.asp
        int maxValue = 0b01111111111111111111111111111111;
        int minValue = 0b10000000000000000000000000000000;
        System.out.println(maxValue);
        System.out.println(minValue);
    }
}
