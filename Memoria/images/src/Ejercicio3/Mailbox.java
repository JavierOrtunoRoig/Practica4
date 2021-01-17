package Ejercicio3;
import java.util.ArrayList;
import java.util.List;

    public class Mailbox {
        public List<Email> email;
        private Ordenacion criterio;


        public Mailbox() {
            email = new ArrayList<Email>();
        }

        public Mailbox(List<Email> lista) {
            email = new ArrayList<Email>();
            email = lista;
        }


        public void setCriterio(Ordenacion criterio) {
            this.criterio = criterio;
        }

        // Operations

        public void show() {
        }


        private void sort() {
            for (int i = 2; i <= email.size(); i++) {
                for (int j = email.size(); j >= i; j--) {
                    if (before(email.get(j), email.get(j-1))) {	// 'at' cambiado por 'get' porque hemos definido un ArrayList<Email>
                        Email aux = email.get(j);
                        email.set(j, email.get(j-1));
                        email.set(j-1, aux);
                    }
                }
            }
        }

        private Boolean before(Email m1, Email m2) {
            return this.criterio.before(m1, m2);
        }

    }

