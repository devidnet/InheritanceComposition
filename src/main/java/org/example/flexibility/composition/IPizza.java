package org.example.flexibility.composition;

import java.util.List;

public interface IPizza {

    void prepare();
    IDough getDough();
    List<IIngredient> getIngredients();
    IBaker getBaker();
    Double getPrice();
}
