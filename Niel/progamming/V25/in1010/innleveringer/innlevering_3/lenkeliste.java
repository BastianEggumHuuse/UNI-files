interface Liste <E> {
    int størrelse ();
    void leggTil (E x);
    E hent ();
    E fjern ();
    }


abstract class Lenkeliste <E> implements Liste<E> {

    størrelse() {
        
    }

    }