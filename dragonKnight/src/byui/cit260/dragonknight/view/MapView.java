/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.dragonknight.view;

/**
 *
 * @author gee
 */
public class MapView extends View{
    
    public MapView() {
                super("\n"
                + "\n===================================="
                + "\n|         DRAGONKNIGHT              |"
                + "\n===================================="
                + "\n| OPTIONS:                         |"
                + "\n|        A. Level One              |"
                + "\n|        B. Level Two              |"
                + "\n|        Q. Quit                   |"
                + "\n===================================="
                + "\nMake your Selection ~~~> ");
        
   }
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert to uppercase
        
        switch (value) {
            case "A":
                 System.out.println("\n*** LEVEL ONE OF THE DUNGEON ***"); 
                 this.levelOne();
                 break;
            case "B":
                 System.out.println("\n*** LEVEL TWO OF THE DUNGEON ***");
                 this.levelTwo();
                 break;
              case  "Q"    :
                    return true;    
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
    }
     private void levelOne() {
        System.out.println("\n"
                         + "\n\t===============                     *         ***"
                         + "\n\t=             =                     *           *" 
                         + "\n\t=             ==============        *           *" 
                         + "\n\t=             D            =        *           *"
                         + "\n\t=             =            =        ******   *******" 
                         + "\n\t======DD=======            ="
                         + "\n\t=             =            =" 
                         + "\n\t=             =            ="
                         + "\n\t=             =            ="
                         + "\n\t=        =DD=========DD====="
                         + "\n\t=        =                 ="
                         + "\n\t==========                 ="
                         + "\n\t=        =                 ="
                         + "\n\t=        ===DD======================"
                         + "\n\t=        =             D           ="
                         + "\n\t====DD====             =           ="
                         + "\n\t=        =             =           ="
                         + "\n\t=        =             =           ="
                         + "\n\t=        =             ============="
                         + "\n\t=        =                 =       ="
                         + "\n\t=        D                 D     | ="
                         + "\n\t=        =                 =     V ="
                         + "\n\t====================================");
     }
     private void levelTwo() {
       System.out.println("\n"
                         + "\n\t=====================================       *         *****"
                         + "\n\t= -->         D                     =       *             *"
                         + "\n\t=             =                     =       *         *****"  
                         + "\n\t=             =                     =       *         *"
                         + "\n\t=             =                     =       ******    *****" 
                         + "\n\t======DD=======                     ="
                         + "\n\t=             =                     =" 
                         + "\n\t=             =                     ="
                         + "\n\t=             =                     ="
                         + "\n\t=        =DD=========DD========DD===="
                         + "\n\t=        =                 =        ="
                         + "\n\t==========                 =        ="
                         + "\n\t=        =                 =        ="
                         + "\n\t=        ===DD======================="
                         + "\n\t=        =             D            ="
                         + "\n\t====DD====             =            ="
                         + "\n\t=        =             =            ="
                         + "\n\t=        =             =            ="
                         + "\n\t=        =             =============="
                         + "\n\t=        =                 =        ="
                         + "\n\t=        D                 D        ="
                         + "\n\t=        =                 =        ="
                         + "\n\t====================================="); 
   }
}