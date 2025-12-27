package cmpt213.assignment2.packagedeliveriestracker.model;

public class Book extends Package {
    private String authorname;

    @Override
    public String getAuthorname() {

            return authorname;

    }

    @Override
    public void setAuthorname(String authorname) {

        this.authorname = authorname;

    }

}
