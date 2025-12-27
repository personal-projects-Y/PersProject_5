package cmpt213.assignment2.packagedeliveriestracker.model;

import java.time.LocalDateTime;

public class Electronic extends Package{

            private double ehf;

            @Override
            public Double getEhf () {

                return ehf;

            }

            @Override
            public void setEhf(Double ehf) {

                this.ehf = ehf;

            }

}

