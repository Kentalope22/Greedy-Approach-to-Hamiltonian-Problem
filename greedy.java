
/*
 * pseudocode:
 * 
 * class greedy{
 * 
 * int[] city_distances
 * int[] fuel
 * 
 * 
 * int miles = 0
 * int preferred_city = 0
 * int mpg = x
 * cities traveled = 0
 * prev = 0
 * 
 * 
 * function find preferred{
 *  int starting_city
 *  for(i in city_distances){
 *      miles += fuel[i]
 *      for(j in city_distances){
 * 
 *          if starting_city + j > city_distances.length-1
 *          then starting_city = 0
 * 
 *          miles += fuel[starting_city + j]*mpg;
            miles -= city_distances[starting_city + j];

            if miles < 0
            then break

            cities_traveled +=1
        }
 *      if cities_traveled > prev
 *      then
 *          preferred_city = i;
            prev = cities_traveled;
            cities_traveled = 0;
        miles = 0
 * 
 * 
 * }
 *      print result
 *      
 * 
 * }
 * 
 * 
 * 
 * }
 * 
 * }
 * 
 */




public class greedy{
    public static void main(String[] args) {
        //make arrays for distances between citie & fuel at each city
        int[] city_distances = {5, 25, 15, 10, 15};
        int[] fuel = {1,2,1,0,3};
        //miles that you can travel with your current gas
        int miles = 0;
        //preference of city to start
        int preferred_city = 0;
        //how many miles per gallon your car can travel
        int mpg = 10;
        //how many cities were traveled in the previous loop(only changes when more cities are traveled by anohter starting index)
        int prev = 0;

        //for loop used to make a run of each starting index
        for(int i=0; i<city_distances.length; i++){
            //number of cities traveled for each loop
            int cities_traveled = 0;
            //city to start at
            int starting_city = i;
            
            //for loop that has car going thru every city
            for(int j=0; j<city_distances.length; j++){
                //loops the index when max index is hit
                if(starting_city + j > city_distances.length-1){
                    starting_city = 0;
                }
                //calculates how many miles you can travel after fueling up at current city index
                miles += fuel[starting_city + j]*mpg;
                //calculates how many miles you can still travel after traveling to the next city
                miles -= city_distances[starting_city + j];
                //breaks loop if not enough miles to reach next city
                if(miles < 0){
                    break;
                }
                //tracks how many cities were traveled to this loop
                cities_traveled++;
                
            }
            //if the cities traveled in current loop are greater than the previous optimal starting index loop then...
            if(cities_traveled > prev){
                //change preferred city index
                preferred_city = i;
                //store new record number of cities traveled for the starting index
                prev = cities_traveled;
                //resets cities traveled for the next loop to use
                cities_traveled = 0;
            }
            //resets miles for the next loop to use
            miles = 0;
        }
        //prints out which city to start at
        System.out.printf("The preferred starting city for the sample above is city %d%n", preferred_city);
    }
    
    
}
