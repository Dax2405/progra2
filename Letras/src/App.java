import Letra.*;
import Letra_While.*;
import Letra_do_while.*;

public class App {
    public static void main(String[] args) throws Exception {
        A a = new A();
        a.imprimir();
        D d = new D();
        d.imprimir();
        N n = new N();
        n.imprimir();
        F f = new F();
        f.imprimir();
        DN dn = new DN();
        dn.imprimir();
        System.out.println("Letras con bucle while");
        A_while a_while = new A_while();
        a_while.imprimir();
        D_while d_while = new D_while();
        d_while.imprimir();
        N_while n_while = new N_while();
        n_while.imprimir();
        F_while f_while = new F_while();
        f_while.imprimir();
        DN_while dn_while = new DN_while();
        dn_while.imprimir();
        System.out.println("Letras con bucle do while");
        A_do a_do = new A_do();
        a_do.imprimir();
        D_do d_do = new D_do();
        d_do.imprimir();
        N_do n_do = new N_do();
        n_do.imprimir();
        F_do f_do = new F_do();
        f_do.imprimir();
    }
}
