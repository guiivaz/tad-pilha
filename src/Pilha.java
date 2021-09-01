public class Pilha {
    public int vetor[];
    public int topo;
    public int MAX = 100;

    public Pilha() {
        vetor = new int[MAX];
        topo = -1;
    }

    public boolean cheia() {
        if (topo == (MAX - 1))
            return true;
        return false;
    }

    public boolean vazia() {
        if (topo == -1)
            return true;
        return false;
    }

    public boolean push(int elemento) {
        if (!cheia()) {
            topo++;
            vetor[topo] = elemento;
            return true;
        }
        return false;
    }

    public boolean pop() {
        if (vazia())
            return false;
        topo--;
        return true;
    }

    public int top() {
        return vetor[topo];
    }

    public int tamanho() {
        return topo + 1;
    }

    public void imprime() {
        Pilha aux = new Pilha();
        int x;
        while (!this.vazia()) {
            x = this.top();
            aux.push(x);
            System.out.println(x);
            this.pop();
        }
        while (!aux.vazia()) {
            x = aux.top();
            this.push(x);
            aux.pop();
        }
    }

    public void copia(Pilha P) {
        Pilha aux = new Pilha();
        int x;
        while (!this.vazia()) {
            x = this.top();
            aux.push(x);
            this.pop();
        }
        while (!aux.vazia()) {
            x = aux.top();
            this.push(x);
            P.push(x);
            aux.pop();
        }
    }

    public void inverte(Pilha P) {
        Pilha aux = new Pilha();
        int x;
        while (!this.vazia()) {
            x = this.top();
            aux.push(x);
            P.push(x);
            this.pop();
        }
        while (!aux.vazia()) {
            x = aux.top();
            this.push(x);
            aux.pop();
        }
    }

    public void inverte2() {
        Pilha aux = new Pilha();
        Pilha aux2 = new Pilha();
        int x;
        while (!this.vazia()) {
            x = this.top();
            aux.push(x);
            System.out.println(x);
            this.pop();
        }
        while (!aux.vazia()) {
            x = aux.top();
            aux2.push(x);
            aux.pop();
        }
        while (!aux2.vazia()) {
            x = aux2.top();
            this.push(x);
            aux2.pop();
        }
    }

    public boolean iguais(Pilha P) {
        Pilha aux1 = new Pilha();
        Pilha aux2 = new Pilha();
        int x, y;
        if (this.tamanho() != P.tamanho())
            return false;
        this.copia(aux1);
        P.copia(aux2);
        while (!aux1.vazia()) {
            if (aux1.top() != aux2.top())
                return false;
            aux1.pop();
            aux2.pop();
        }
        return true;
    }
    public boolean procurar(int elemento){
        while(topo!=-1){
            if(top() == elemento)
                return true;
            topo--;
        }
        return false;
    }


}
