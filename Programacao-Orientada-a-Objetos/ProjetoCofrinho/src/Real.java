public class Real extends Moeda {

    public Real(double valor) {
        this.valor = valor;
    }

    @Override
    public void info() {
        System.out.println("Real - " + this.valor);
    }

    @Override
    public double converter() {
        return this.valor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Real real = (Real) obj;
        return Double.compare(real.valor, valor) == 0;
    }
}