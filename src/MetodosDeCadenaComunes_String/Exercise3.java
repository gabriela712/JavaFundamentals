package MetodosDeCadenaComunes_String;

public class Exercise3 {
    public static void main(String[] args) {
        // Declare and initialize an array of superhero names
        String[] superheroes = {"Batman", "Superman", "Wonder Woman", "Spider-Man", "Iron Man"};

        // Declare and initialize an array of years
        int[] introductionYears = {1939, 1938, 1941, 1962, 1963};

        // Print the superhero names
        for(String hero : superheroes) {
            System.out.println(hero);
        }

        // Print the introduction years
        for(int year : introductionYears) {
            System.out.println(year);
        }

        // TODO 3a: Print the original name of the third superhero
        String thirdSuperhero = superheroes[2];
        System.out.println("The third superheroe is: " + thirdSuperhero);

        // TODO 3b: Modify the third superhero name
        String newThirdSuperhero = thirdSuperhero.replace("Wonder Woman", "Alicia");
        System.out.println("The new Third Superhero is: " + newThirdSuperhero);

        // TODO 4a: Print the original year of introduction of the third superhero
        int thirdYear = introductionYears[2];
        System.out.println("The third year is: " + thirdYear);

        // TODO 4b: Modify the year of introduction of the third superhero
        introductionYears[2] = 1942;
        // TODO 4c: Print the modified year of introduction of the third superhero
        System.out.println("The new third year is: " + introductionYears[2]);

        // TODO 5a: Print the length of the array containing superhero names
        int lengthName = superheroes.length;
        System.out.println("The length of the superheroes name array is: " + lengthName);

        // TODO 5b: Print the length of the array containing superhero year of introduction
        int lengthYear = introductionYears.length;
        System.out.println("The length of the introduction year array is: " + lengthYear);

    }

}
