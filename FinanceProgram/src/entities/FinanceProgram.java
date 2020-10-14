
package entities;

import java.util.ArrayList;

public class FinanceProgram {

     public   ArrayList <Family> families;


    public void addFamilies(Family family){
        this.families.add(family);
    }

    public ArrayList  CalculateTotalWeekly (String type ){
        return new ArrayList ( );
    }

     public ArrayList  CalculateFamilySavings (String type ){
        return new ArrayList ( );
     }

     public float  CalculateFamiliesPercentages ( ){
        return 0;
     }

     public ArrayList  MostCapacityOfSave ( ){
        return new ArrayList ( );
     }

     public float  justFisioSecurity ( ){
        return 0;
     } 

     public int  selfRealisationPercentageFamily ( ){
        return 0;
     } 

     public String  levelSchoolingMostSave ( ){
        return "";
     } 

      public ArrayList  OrderListIncome ( ){
        return new ArrayList ( );
     } 

      public ArrayList  OrderListSave ( ){
        return new ArrayList ( );
     } 

      public ArrayList  ZeroFamiliesSave ( ){
        return new ArrayList ( );
     } 

     public String  HigherWeekSpendingPerson ( ){
        return "";
     }

     public String  HigherWeekIncomeFamily ( ){
        return "";
     }

    public void ClassficFamily( ){
    }

}
    

