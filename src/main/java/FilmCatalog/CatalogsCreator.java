package FilmCatalog;


import static jdk.nashorn.internal.objects.Global.print;

public class CatalogsCreator {

    public static void main(String[] args) {

        //KLASA DO STWORZENIA Z OSOBNYCH OBIEKTÓW KATALOGÓW

        Catalog catalog_horror = new Catalog("Horror.xls");
        catalog_horror.create();

        //W tym miejscu trzeba będzie stworzyć metodę w klasie Catalog która umożliwi dodanie do nowego
        //rekordu opisu danego filmu


        Catalog catalog_family = new Catalog("Family.xls");
        catalog_family.create();


        Catalog catalog_sciFi = new Catalog("SciFi.xls");
        catalog_sciFi.create();


        Catalog catalog_comedy = new Catalog("Comedy.xls");
        catalog_comedy.create();


        Catalog catalog_drama = new Catalog("Drama.xls");
        catalog_drama.create();


        Catalog catalog_adventure = new Catalog("Adventure.xls");
        catalog_adventure.create();


    }

}
