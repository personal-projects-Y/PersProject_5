package cmpt213.assignment2.packagedeliveriestracker.model;

public class PackageFactory {

    public Package getPackage(String ptype){

        if(ptype==null){

            return null;

        }

        if(ptype == "Book"){

            return new Book();

        }

        if(ptype == "Perishable"){

            return new Perishable();

        }

        if(ptype == "Electronic"){

            return new Electronic();

        }

        return null;

    }

}
