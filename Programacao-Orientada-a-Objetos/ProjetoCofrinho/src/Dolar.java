public class Dolar extends Moeda {

    public Dolar(double valor) {
        this.valor = valor;
    }

    @Override
    public void info() {
        System.out.println("Dolar - " + this.valor);
    }

    @Override
    public double converter() {
        return this.valor * 5.0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Dolar dolar = (Dolar) obj;
        return Double.compare(dolar.valor, valor) == 0;
    }
}