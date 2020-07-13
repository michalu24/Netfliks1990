package FilmCatalog;


public class CatalogsCreator {

    public static void main(String[] args) {

        //KLASA DO STWORZENIA Z OSOBNYCH OBIEKTÓW KATALOGÓW

        Catalog catalog_horror = new Catalog("Horror.xls");
        catalog_horror.create();


        Catalog catalog_family = new Catalog("Family.xls");
        catalog_family.create();


        Catalog catalog_sciFi = new Catalog("SciFi.xls");
        catalog_sciFi.create();




    }

}
