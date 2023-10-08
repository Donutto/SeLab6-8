package ku.cs.kafe.model;


import lombok.Data;


import java.util.UUID;
//6410406843 Rachata Kaewviset

@Data
public class MenuRequest {
    private String name;
    private UUID categoryId;
    private double price;
}
