
/*
 * pseudocode:
 * int[] city_distances
 * int[] fuel
 * int mpg = x
 * int miles = 0
 * 
 * 
 * public static preferred{
 *  int preferred_city = 0
 *  for(i in city_distances){
 *      miles += fuel[i];
 *      
 *      
 * 
 * }
 * 
 * 
 * 
 * }
 * 
 * 
 * 
 */




public class greedy{
    public static void main(String[] args) {

        int[] city_distances = {5, 25, 15, 10, 15};
        int[] fuel = {1,2,1,0,3};

        int miles = 0;
        int preferred_city = 0;
        int mpg = 10;
        int cities_traveled = 0;
        int prev = 0;

        for(int i=0; i<city_distances.length; i++){
            
            int starting_city = i;
            

            for(int j=0; j<city_distances.length; j++){
                if(starting_city + j > city_distances.length-1){
                    starting_city = 0;
                }
                miles += fuel[starting_city + j]*mpg;
                miles -= city_distances[starting_city + j];

                if(miles < 0){
                    break;
                }
                cities_traveled++;
                
            }

            if(cities_traveled > prev){
                preferred_city = i;
                prev = cities_traveled;
                cities_traveled = 0;
            }
            miles = 0;
        }
        System.out.printf("The preferred starting city for the sample above is city %d%n", preferred_city);
    }
    
    
}
