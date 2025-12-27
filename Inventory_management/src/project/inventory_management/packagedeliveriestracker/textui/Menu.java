package cmpt213.assignment2.packagedeliveriestracker.textui;

import cmpt213.assignment2.packagedeliveriestracker.model.Package;
import cmpt213.assignment2.packagedeliveriestracker.model.PackageFactory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Menu {
    private String title;

    ArrayList<String> options = new ArrayList<String>();

    Scanner console = new Scanner(System.in);

    public Menu(){

        title="Welcome to the Package Deliveries Tracker";

        options.add("1. List all packages");

        options.add("2. Add a package");

        options.add("3. Remove a package");

        options.add("4. List overdue packages");

        options.add("5. List upcoming packages");

        options.add("6. Mark package as delivered");

        options.add("7. Exit");

    }

    public void getoptions(){

        System.out.println();

        for(int i = 0; i<options.size(); i++){

            System.out.println(options.get(i));

        }

    }

    public void viewmenu(){

        for(int i = 0; i<title.length()+4; i++){

            System.out.print("#");

        }

        System.out.println();

        System.out.println("#" + " " + title + " " + "#");

        for(int i = 0; i<title.length()+4; i++){

            System.out.print("#");

        }

        System.out.println();

        System.out.println("Today is: " + LocalDateTime.now());

    }

    public void listpackages(List<Package> n, int size){

        if(size == 0){

            System.out.println("No packages to show");

            System.out.println();

        }else{

            int itemnum = 1;

            for(int i = 0; i<size; i++){

                System.out.println("Item number " + itemnum);

                System.out.println("Package: " + n.get(i).getName());

                System.out.println("Notes: " + n.get(i).getNotes());

                System.out.println("Price: $" + n.get(i).getPrice());

                System.out.println("Weight: " + n.get(i).getWeight()+"kg");

                System.out.println("Expected Delivery Date: " + n.get(i).getEdd());

                System.out.println("Delivered?: " + n.get(i).isDeliverystatus());

                if(n.get(i).getAuthorname()!=null){

                    System.out.println("Author: " + n.get(i).getAuthorname());

                }else if(n.get(i).getEd()!=null) {

                    System.out.println("Expiry date: " + n.get(i).getEd());

                }else if(n.get(i).getEhf()!=null){

                    System.out.println("Environmental Handling Fee: " + n.get(i).getEhf());

                }

                System.out.println();

                itemnum++;

            }

        }

    }

    public void addpackage(List<Package> n){

        System.out.println("Please enter the type of product (1:Book, 2:Perishable, 3:Electronic) ");

        String productstring = console.next();

        int productname = Integer.parseInt(productstring);

        while(productstring == null || productstring == "" || productname > 3 || productname < 0 ){

            System.out.println("Please re-enter the type of product (1:Book, 2:Perishable, 3:Electronic) ");

            productstring = console.next();

            productname = Integer.parseInt(productstring);

            if(productname == 1 || productname == 2 || productname == 3){

                break;

            }

        }

        System.out.println("Please enter the name ");

        String nname = console.next();

        System.out.println("Please enter the notes ");

        String nnotes = console.next();

        System.out.println("Please enter the price ");

        String sprice = console.next();

        double pprice = Double.valueOf(sprice);

        while(pprice < 0){

            System.out.println("Please reenter the price ");

            sprice = console.next();

            pprice = Integer.parseInt(sprice);

            if(pprice > 0){

                break;

            }

        }

        System.out.println("Please enter the weight ");

        String sweight = console.next();

        double wweight = Double.valueOf(sweight);

        while(wweight < 0){

            System.out.println("Please reenter the weight ");

            sweight = console.next();

            wweight = Integer.parseInt(sweight);

            if(wweight > 0){

                break;

            }

        }

        System.out.println("Enter the year of the expected delivery date ");

        String year = console.next();

        int yearcheck = Integer.parseInt(year);

        while(yearcheck < 1000){

            System.out.println("Please enter a valid expected delivery date. Must be in at least 2022 ");

            year = console.next();

            yearcheck = Integer.parseInt(year);

            if(yearcheck >= 1000){

                break;

            }

        }

        System.out.println("Enter the month of the expected delivery date (1-12) ");

        String month = console.next();

        int newmonth = Integer.parseInt(month);

        while(newmonth > 12 || newmonth < 1){

            System.out.println("Re-enter the month of the expected delivery date (1-12) ");

            month = console.next();

            newmonth = Integer.parseInt(month);

            if(newmonth >= 1 && newmonth <= 12){

                break;

            }

        }

        if(newmonth < 10 && newmonth > 0){

            month = "0"+month;

        }

        System.out.println("Enter the day of the expected delivery date (1-28/29/30/31) ");

        String day = console.next();

        int newdate = Integer.parseInt(day);

        while(newdate<1 || newdate>31){

            System.out.println("Re-enter the day of the expected delivery date (1-28/29/30/31) ");

            day = console.next();

            newdate = Integer.parseInt(day);

            if(newdate >= 1 && newdate <= 31){

                break;

            }

        }

        if(newdate < 10 && newdate > 0){

            day = "0"+day;

        }

        System.out.println("Enter the hour of the expected delivery date (0-23) ");

        String hour = console.next();

        int newhour = Integer.parseInt(hour);

        while(newhour <0 || newhour >23){

            System.out.println("Re-enter the hour of the expected delivery date (0-23) ");

            hour = console.next();

            newhour = Integer.parseInt(hour);

            if(newhour >=0 && newhour <= 23){

                break;

            }

        }

        if(newhour < 10 && newhour >= 0){

            hour = "0"+hour;

        }

        System.out.println("Enter the minute of the expected delivery date (0-59) ");

        String minute = console.next();

        int newminute = Integer.parseInt(minute);

        while(newminute<0 || newminute>59){

            System.out.println("Re-enter the minute of the expected delivery date (0-59) ");

            minute = console.next();

            newminute = Integer.parseInt(minute);

            if(newminute >= 0 && newminute <= 23){

                break;

            }

        }

        if(newminute <10 && newminute >=0){

            minute = "0"+minute;

        }

        PackageFactory PackageFactory = new PackageFactory();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        String newddate = year+"-"+month+"-"+day+" "+hour+":"+minute;

        LocalDateTime indate = LocalDateTime.parse(newddate,formatter);

        if(productname == 1){

            Package pi = PackageFactory.getPackage("Book");

            System.out.println("Enter the Authors name ");

            String aname = console.next();

            pi.setAuthorname(aname);

            n.add(pi);

            pi.setName(nname);

            pi.setNotes(nnotes);

            pi.setPrice(pprice);

            pi.setWeight(wweight);

            pi.setDeliverystatus(false);

            pi.setEdd(indate);

        }

        if(productname == 2){

            Package pi = PackageFactory.getPackage("Perishable");

            System.out.println("Enter the year of the Expiry date ");

            String eyear = console.next();

            int eeyear = Integer.parseInt(eyear);

            while(eeyear < 1000){

                System.out.println("Re-enter the year of the Expiry date ");

                eyear = console.next();

                eeyear = Integer.parseInt(eyear);

                if(eeyear >= 1000){

                    break;

                }

            }

            System.out.println("Enter the month of the Expiry date (1-12) ");

            String emonth = console.next();

            int eemonth = Integer.parseInt(emonth);

            while(eemonth > 12 || eemonth < 1){

                System.out.println("Re-enter the month of the Expiry date (1-12) ");

                emonth = console.next();

                eemonth = Integer.parseInt(emonth);

                if(eemonth >=1 && eemonth <= 12){

                    break;

                }

            }

            if(eemonth < 10 && eemonth > 0){

                emonth = "0"+emonth;

            }

            System.out.println("Enter the day of the Expiry date (1-28/29/30/31) ");

            String eday = console.next();

            int eeday = Integer.parseInt(eday);

            while(newdate <1 || newdate > 31){

                System.out.println("Re-enter the day of the Expiry date (1-28/29/30/31) ");

                eday = console.next();

                eeday = Integer.parseInt(eday);

                if(eeday >=1 && eeday <= 31){

                    break;

                }

            }

            if(eeday < 10 && eeday > 0){

                eday = "0"+eday;

            }

            System.out.println("Enter the hour of the Expiry date (0-23) ");

            String ehour = console.next();

            int eehour = Integer.parseInt(ehour);

            while(eehour < 0 || eehour > 23){

                System.out.println("Re-enter the hour of the Expiry date (0-23) ");

                ehour = console.next();

                eehour = Integer.parseInt(ehour);

                if(eehour >= 0 && eehour <= 23){

                    break;

                }

            }

            if(eehour < 10 && eehour > 0){

                ehour = "0"+ehour;

            }

            System.out.println("Enter the minute of the Expiry date (0-59) ");

            String emin = console.next();

            int eemin = Integer.parseInt(emin);

            while(eemin < 0 || eemin > 59){

                System.out.println("Re-enter the minute of the Expiry date (0-59) ");

                emin = console.next();

                eemin = Integer.parseInt(emin);

                if(eemin >= 0 && eemin <= 59){

                    break;

                }

            }

            if(eemin < 10 && eemin > 0){

                emin="0"+emin;

            }

            String eddate = eyear+"-"+emonth+"-"+eday+" "+ehour+":"+emin;

            LocalDateTime edate = LocalDateTime.parse(eddate,formatter);

            n.add(pi);

            pi.setName(nname);

            pi.setNotes(nnotes);

            pi.setPrice(pprice);

            pi.setWeight(wweight);

            pi.setDeliverystatus(false);

            pi.setEdd(indate);

            pi.setEd(edate);
        }

        if(productname == 3){

            Package pi = PackageFactory.getPackage("Electronic");

            System.out.println("Enter the environmental handling fee (in dollar): ");

            String ffee = console.next();

            Double fee = Double.valueOf(ffee);

            while(fee < 0){

                System.out.println("Re-enter the environmental handling fee (in dollar): ");

                ffee = console.next();

                fee = Double.valueOf(ffee);

                if(fee >= 0){

                    break;

                }

            }

            pi.setEhf(fee);

            n.add(pi);

            pi.setName(nname);

            pi.setNotes(nnotes);

            pi.setPrice(pprice);

            pi.setWeight(wweight);

            pi.setDeliverystatus(false);

            pi.setEdd(indate);

        }

            System.out.println("You have added a product successfully");

        }

    public void removepackage(List<Package> n, int size){

        if(size == 0){

            System.out.println("No packages to show");

            System.out.println();

        }else{

        listpackages(n, size);

        System.out.println("Please select a package, or type 0 to cancel");

        int nval = console.nextInt();

        if(nval != 0){

            while (nval < 0 || nval - 1 > size) {

                System.out.println("That is not a valid option. Please try again");

                nval = console.nextInt();

            }

            System.out.println(n.get(nval-1).getName() + "has been removed");

            n.remove(nval-1);

            }

        }

    }

    public void overduepackages(List<Package> n, int size){
        //List in order of oldest date first
        int count = 0;

        LocalDateTime now=LocalDateTime.now();

        int itemnum = 1;

        for(int i = 0; i < size; i++){

            int diff = now.compareTo(n.get(i).getEdd());

            if(n.get(i).isDeliverystatus() == false && diff>0){

                System.out.println("Item number " + itemnum);

                System.out.println("Package: " + n.get(i).getName());

                System.out.println("Notes: " + n.get(i).getNotes());

                System.out.println("Price: $" + n.get(i).getPrice());

                System.out.println("Weight: " + n.get(i).getWeight()+"kg");

                System.out.println("Expected Delivery Date: " + n.get(i).getEdd());

                System.out.println("Delivered?: " + n.get(i).isDeliverystatus());

                if(n.get(i).getAuthorname() != null){

                    System.out.println("Author: " + n.get(i).getAuthorname());

                }else if(n.get(i).getEd() != null) {

                    System.out.println("Expiry date: " + n.get(i).getEd());

                }else if(n.get(i).getEhf() != null){

                    System.out.println("Environmental Handling Fee: " + n.get(i).getEhf());

                }

                itemnum++;

            }

        }

        if(count == 0){

            System.out.println("No overdue packages to show");

        }

    }

    public void upcomingpackages(List<Package> n, int size){

        int count = 0;

        int itemnum = 1;

        LocalDateTime now = LocalDateTime.now();

        for(int i=0; i<size; i++){

            int diff = now.compareTo(n.get(i).getEdd());

            if(n.get(i).isDeliverystatus() == false && diff<0){

                System.out.println("Item number " + itemnum);

                System.out.println("Package: " + n.get(i).getName());

                System.out.println("Notes: " + n.get(i).getNotes());

                System.out.println("Price: $" + n.get(i).getPrice());

                System.out.println("Weight: " + n.get(i).getWeight()+"kg");

                System.out.println("Expected Delivery Date: " + n.get(i).getEdd());

                System.out.println("Delivered?: " + n.get(i).isDeliverystatus());

                if(n.get(i).getAuthorname() != null){

                    System.out.println("Author: " + n.get(i).getAuthorname());

                }else if(n.get(i).getEd() != null) {

                    System.out.println("Expiry date: " + n.get(i).getEd());

                }else if(n.get(i).getEhf() != null){

                    System.out.println("Environmental Handling Fee: " + n.get(i).getEhf());

                }

                System.out.println();

                count++;

                itemnum++;

            }

        }

        if(count==0){

            System.out.println("No overdue packages to show");

        }

    }

    public void delivered(List<Package> n, int size){

        int count = 0;

        for(int i = 0; i < size; i++){

            if(n.get(i).isDeliverystatus() == false){

                count++;

            }

        }
        if(count == 0){

            System.out.println("No undelivered packages to show");

        }else {

            System.out.println("Please select a package to mark it as delivered. (or 0 to cancel)");

            int select = console.nextInt();

            if(select == 0){

                System.out.println("Your selection has been cancelled");

            }else {

                while (select < 0 || select > count) {

                    System.out.println("Please enter a valid integer.");

                    select = console.nextInt();

                }

                n.get(select - 1).markdelivered();

                System.out.println(n.get(select - 1).getName() + " has now been marked as delivered.");

            }

        }

    }

    public void exitmenu(){

        System.out.println("The system will now exit");

    }

}

