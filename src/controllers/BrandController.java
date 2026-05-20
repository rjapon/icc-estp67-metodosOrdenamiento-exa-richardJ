package controllers;

import models.Brand;

public class BrandController {

    public Brand[] sortBubbleDesc(Brand[] brands, int getTotalValidYears){

        //Orden Bubble Descendente
        boolean swapp;
        for (int i = 0; i < brands.length; i++) {
            swapp = false;
            for (int j = 0; j < brands.length; j++) {
                if (brands[j].getTotalValidYears() < brands[j + 1].getTotalValidYears()) {
                    // Intercambiar brands[j] y brands[j + 1]
                    Brand temp = brands[j];
                    brands[j] = brands[j + 1];
                    brands[j + 1] = temp;
                    swapp = true;
                }
            }
            if (!swapp) {
                break;
            }
        }
        return brands;
    }

    public Brand binarySearchByValidYears(Brand[] brands, int totalValidYears, boolean isAscending){

        int alto = brands.length -1;
        int bajo = 0;
        while (bajo <= alto ) {
            
            int central = (bajo + alto)/2;
            if(brands[central].getTotalValidYears() == totalValidYears){
                return brands[central];
            }

        }

    }

}
