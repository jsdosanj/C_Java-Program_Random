import java.util.*;
class Solution
{
     public static boolean solution(int total_money,int total_damage, int[] costs,int[] damages)
     {
           //compute the length of the costs and store it in n
           int n = costs.length;

           //Declare temp variables for damage and cost
           int temp_damage,temp_cost;

           // sort the costs in ascending order
           for (int i = 0; i < n; i++)
           {
                for (int j = i + 1; j < n; j++)
                {
                      if (costs[i] > costs[j])
                      {
                           //Sort the damages
                           temp_damage = damages[i];
                           damages[i] = damages[j];
                           damages[j] = temp_damage;

                           //sort the costs in ascending order
                           temp_cost = costs[i];
                           costs[i] = costs[j];
                           costs[j] = temp_cost;
                      }         
                }
           }
           //Add the min_cost at each step to cost_incurred

           //check the conditions
           int sumDamages = 0;
           int sum_costs = 0;

           //Using for loop iterate at each step
           for(int i = 0 ; i<n; i++)
           {
                //add the costs
                sum_costs += costs[i];

                ///add the damages
                sumDamages += damages[i];

                //If all the damages to be done

                //Return true
                if(sumDamages >= total_damage && sum_costs <= total_money )
                {
                    System.out.println("Solutions are: "+costs[i]+" " +damages[i]);
                    return true;
                }

                //If the costs are greater than total money return false
                if(sum_costs > total_money)
                {
                    return false;
                }
           }
           //If the algorithm does not satisfy,return false
           return false;
     }
     
     public static void main(String[] args)
     {
           //Declare the local variables of type int
           int total_money,total_damage;

           //Create scanner object for the scanner class
          Scanner sc=new Scanner(System.in);

           //Prompt and read the total_damage and total_cost
           System.out.print("Enter the total cost: ");
           total_money=sc.nextInt();
           System.out.print("Enter the total damage: ");
           total_damage=sc.nextInt();
           System.out.print("Enter the size of the array of" + "damages and costs: ");
           int size=sc.nextInt();

           //Declare the arrays for the costs
           int[] costs = new int[size];

           //prompt and read the values
           System.out.print("Enter "+size+" costs: ");
           for(int i=0;i<size;i++)
           {
                costs[i]=sc.nextInt();
           }
          
           //Declare the arrays for the damage costs
           int[] damages = new int[size];

           //prompt and read the values
           System.out.print("Enter "+size+" damages: ");   
           for(int i=0;i<size;i++)
           {
                damages[i]=sc.nextInt();
           }

           //call the function and store the value in the result function
           boolean result = solution(total_money, total_damage, costs,damages);
           System.out.println("Result: "+result);
     }
}