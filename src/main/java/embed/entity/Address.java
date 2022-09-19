package embed.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable// Başka bir varlığın içinde gömülü olarak var
public class Address {

    private String provinceName;
    private String districtName;
    private String addressLine1;
    private String addressLine2;

}
