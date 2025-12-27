package cmpt213.assignment2.packagedeliveriestracker.model;
import java.time.LocalDateTime;

public class Perishable extends Package {

            private LocalDateTime ed;

            @Override
            public LocalDateTime getEd(){

                return ed;

            }

            @Override
            public void setEd(LocalDateTime ed) {

                this.ed = ed;

            }

}
