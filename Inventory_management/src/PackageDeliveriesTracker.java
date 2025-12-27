import cmpt213.assignment2.packagedeliveriestracker.textui.Menu;
import cmpt213.assignment2.packagedeliveriestracker.model.Package;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//main
public class PackageDeliveriesTracker {

    public static void main(String args[]){

        Scanner console = new Scanner(System.in);

        List<Package> uinput = new ArrayList<>();

        Menu menu = new Menu();

        boolean status = true;

        while (status) {

            menu.viewmenu();

            menu.getoptions();

            System.out.println("Choose an option by entering 1-7: ");

            int newinput = console.nextInt();

            if(newinput<1 || newinput>7){

                System.out.println("Invalid Selection, please select one of the following options");

                System.out.println();

            } else if (newinput == 1) {

               menu.listpackages(uinput,uinput.size());

            } else if (newinput == 2) {

               menu.addpackage(uinput);

            } else if (newinput == 3) {

                menu.removepackage(uinput, uinput.size());

            } else if (newinput == 4) {

                menu.overduepackages(uinput, uinput.size());

            } else if (newinput == 5) {

                menu.upcomingpackages(uinput, uinput.size());

            } else if (newinput == 6) {

                menu.delivered(uinput, uinput.size());

            } else if (newinput == 7) {

                menu.exitmenu();

                break;

            }

        }

    }

}
